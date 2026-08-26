package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ResLottieMeta;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;

public class RLottieDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    protected static final int LOAD_FRAME_RESULT_ERROR = 2;
    protected static final int LOAD_FRAME_RESULT_OK = 1;
    protected static final int LOAD_FRAME_RESULT_RECYCLED = 3;
    private static final int PAUSE_AFTER_TICKS = 10;
    private static int activeChoreographersCount;
    private static final Executor loadFrameRunnableQueue;
    private static final Executor loadFrameRunnableQueueLimitFps;
    public static DispatchQueue lottieCacheGenerateQueue;
    private static final AtomicInteger threadId = new AtomicInteger();
    private static final AtomicInteger threadId2 = new AtomicInteger();
    private boolean allowDrawFramesWhileCacheGenerating;
    private boolean allowVibration;
    private boolean applyTransformation;
    private boolean applyingLayerColors;
    private NativePtrArgs args;
    protected int autoRepeat;
    protected int autoRepeatCount;
    protected int autoRepeatPlayCount;
    protected long autoRepeatTimeout;
    protected volatile Bitmap backgroundBitmap;
    private final Paint[] backgroundPaint;
    BitmapsCache bitmapsCache;
    private Runnable cacheGenerateTask;
    private boolean createdForFirstFrame;
    protected int currentFrame;
    protected int customEndFrame;
    private boolean decodeSingleFrame;
    protected boolean destroyWhenDone;
    private boolean doNotRemoveInvalidOnFrameReady;
    private final RectF dstRect;
    private final RectF[] dstRectBackground;
    private boolean fallbackCache;
    private File file;
    private int finishFrame;
    private boolean forceFrameRedraw;
    private CountDownLatch frameWaitSync;
    private boolean genCacheSend;
    int generateCacheFramePointer;
    private RLottieNative generateCacheNative;
    boolean generatingCache;
    protected final int height;
    private boolean invalidateOnProgressSet;
    private boolean isChoreographerRegistered;
    protected int isDice;
    private boolean isInvalid;
    private volatile boolean isPaused;
    protected volatile boolean isRecycled;
    protected volatile boolean isRunning;
    private final boolean isSingleChannel;
    private final HashMap<String, Integer> layerColors;
    protected final Runnable loadFrameRunnable;
    protected Runnable loadFrameTask;
    private final Choreographer60FpsContent.FrameCallback mUiThreadChoreographerCallback;
    private View masterParent;
    protected final int[] metaData;
    protected volatile RLottieNative nativePtr;
    private boolean needScale;
    private final HashMap<String, Integer> newColorUpdates;
    private int[] newReplaceColors;
    protected volatile boolean nextFrameIsLast;
    protected volatile Bitmap nextRenderingBitmap;
    private Runnable onAnimationEndListener;
    protected WeakReference<Runnable> onFinishCallback;
    private final ArrayList<ImageReceiver> parentViews;
    private final HashMap<String, Integer> pendingColorUpdates;
    private boolean pendingNativeInit;
    private int[] pendingReplaceColors;
    protected boolean playInDirectionOfCustomEndFrame;
    private boolean precache;
    protected volatile Bitmap renderingBitmap;
    protected boolean resetVibrationAfterRestart;
    private int retryDelay;
    private float scaleX;
    private float scaleY;
    private boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    private float speedMultiply;
    private boolean swapBuffersAllowedByChoreographer;
    private int ticksWithoutDraw;
    private final Runnable uiRunnable;
    private final Runnable uiRunnableCacheFinished;
    private final Runnable uiRunnableGenerateCache;
    private final Runnable uiRunnableNoFrame;
    protected HashMap<Integer, Integer> vibrationPattern;
    protected boolean waitingForNextTask;
    public Runnable whenCacheDone;
    protected final int width;

    public static class NativePtrArgs {
        public int[] colorReplacement;
        File file;
        public int fitzModifier;
        String json;
        String name;
        public int resId;

        private NativePtrArgs() {
        }
    }

    static {
        final int i = 0;
        loadFrameRunnableQueue = Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                switch (i) {
                    case 0:
                        return RLottieDrawable.lambda$static$0(runnable);
                    default:
                        return RLottieDrawable.lambda$static$1(runnable);
                }
            }
        });
        final int i2 = 1;
        loadFrameRunnableQueueLimitFps = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                switch (i2) {
                    case 0:
                        return RLottieDrawable.lambda$static$0(runnable);
                    default:
                        return RLottieDrawable.lambda$static$1(runnable);
                }
            }
        });
    }

    public RLottieDrawable(File file, String str, int i, int i2, BitmapsCache.CacheOptions cacheOptions, boolean z, int[] iArr, int i3, boolean z2) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        this.layerColors = map;
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList<>();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new RLottieDrawable$$ExternalSyntheticLambda1(this, 0);
        this.uiRunnable = new RLottieDrawable$$ExternalSyntheticLambda1(this, 1);
        this.uiRunnableGenerateCache = new RLottieDrawable$$ExternalSyntheticLambda1(this, 2);
        this.uiRunnableCacheFinished = new RLottieDrawable$$ExternalSyntheticLambda1(this, 3);
        this.loadFrameRunnable = new RLottieDrawable$$ExternalSyntheticLambda1(this, 4);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda6(this, 0);
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z;
        this.isSingleChannel = z2;
        this.precache = cacheOptions != null;
        this.fallbackCache = str == null && cacheOptions != null && cacheOptions.fallback;
        this.createdForFirstFrame = cacheOptions != null && cacheOptions.firstFrame;
        NativePtrArgs nativePtrArgs = new NativePtrArgs();
        this.args = nativePtrArgs;
        nativePtrArgs.file = file.getAbsoluteFile();
        NativePtrArgs nativePtrArgs2 = this.args;
        nativePtrArgs2.json = str;
        nativePtrArgs2.colorReplacement = iArr != null ? (int[]) iArr.clone() : null;
        this.args.fitzModifier = i3;
        getPaint().setFlags(2);
        if (str == null) {
            this.file = file;
        }
        if (this.precache && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.precache) {
            if (this.createdForFirstFrame) {
                return;
            }
            parseLottieMetadata(file, str, iArr2);
            if (this.shouldLimitFps && iArr2[1] < 60) {
                this.shouldLimitFps = false;
            }
            this.bitmapsCache = new BitmapsCache(file, this, cacheOptions, i, i2, !z, i3);
            return;
        }
        this.nativePtr = RLottieNative.createFromFile(file.getAbsolutePath(), str, i, i2, iArr2, this.precache, this.args.colorReplacement, this.shouldLimitFps, i3, map);
        if (this.nativePtr == null) {
            FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
            file.delete();
        }
        if (!this.shouldLimitFps || iArr2[1] >= 60) {
            return;
        }
        this.shouldLimitFps = false;
    }

    private void applyPendingColorsUpdates() {
        RLottieNative rLottieNativeCreateFromRawJson;
        RLottieNative rLottieNative = this.nativePtr;
        if (rLottieNative == null) {
            return;
        }
        try {
            if (this.pendingColorUpdates.isEmpty() && this.pendingReplaceColors == null) {
                return;
            }
            this.layerColors.putAll(this.pendingColorUpdates);
            int[] iArr = this.pendingReplaceColors;
            if (iArr != null) {
                this.args.colorReplacement = (int[]) iArr.clone();
            }
            NativePtrArgs nativePtrArgs = this.args;
            File file = nativePtrArgs.file;
            if (file != null) {
                String absolutePath = file.getAbsolutePath();
                NativePtrArgs nativePtrArgs2 = this.args;
                rLottieNativeCreateFromRawJson = RLottieNative.createFromFile(absolutePath, nativePtrArgs2.json, this.width, this.height, this.metaData, false, nativePtrArgs2.colorReplacement, this.shouldLimitFps, nativePtrArgs2.fitzModifier, this.layerColors);
            } else {
                int i = nativePtrArgs.resId;
                if (i == 0 || nativePtrArgs.json != null) {
                    rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(nativePtrArgs.json, nativePtrArgs.name, this.metaData, nativePtrArgs.colorReplacement, this.layerColors);
                } else {
                    String res = AndroidUtilities.readRes(i);
                    if (TextUtils.isEmpty(res)) {
                        return;
                    }
                    NativePtrArgs nativePtrArgs3 = this.args;
                    nativePtrArgs3.json = res;
                    rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res, nativePtrArgs3.name, this.metaData, nativePtrArgs3.colorReplacement, this.layerColors);
                }
            }
            if (rLottieNativeCreateFromRawJson != null) {
                this.nativePtr = rLottieNativeCreateFromRawJson;
                rLottieNative.recycle();
                this.pendingColorUpdates.clear();
                this.pendingReplaceColors = null;
            }
        } catch (Exception unused) {
        }
    }

    private boolean canLoadFrames() {
        if (this.precache) {
            return this.bitmapsCache != null || this.fallbackCache;
        }
        return this.nativePtr != null || this.pendingNativeInit;
    }

    private void checkChoreographerAfterDrawCall() {
        this.ticksWithoutDraw = 0;
        if (this.isPaused) {
            this.isPaused = false;
            checkChoreographer();
        }
    }

    private void checkChoreographerAfterFrameCall() {
        int i = this.ticksWithoutDraw + 1;
        this.ticksWithoutDraw = i;
        if (i > 10) {
            this.isPaused = true;
        }
        checkChoreographerInternal();
    }

    public void checkChoreographerInternal() {
        if (!this.isRunning || this.isPaused) {
            if (this.isChoreographerRegistered) {
                activeChoreographersCount--;
                this.isChoreographerRegistered = false;
                this.ticksWithoutDraw = 0;
                Choreographer60FpsContent.getInstance().removeFrameCallback(this.mUiThreadChoreographerCallback);
                return;
            }
            return;
        }
        if (this.isChoreographerRegistered) {
            return;
        }
        int iRound = Math.round((this.metaData[1] / (this.shouldLimitFps ? 2.0f : 1.0f)) * this.speedMultiply);
        if (iRound > 0) {
            if (this.metaData[0] == 1 && this.isDice == 0) {
                return;
            }
            activeChoreographersCount++;
            this.isChoreographerRegistered = true;
            this.ticksWithoutDraw = 0;
            Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
            Choreographer60FpsContent.FrameCallback frameCallback = this.mUiThreadChoreographerCallback;
            choreographer60FpsContent.getClass();
            Choreographer60FpsContent.checkMainThread();
            int iMax = Math.max(1, Math.min(iRound, 60));
            choreographer60FpsContent.removeFrameCallback(frameCallback);
            choreographer60FpsContent.getOrCreateGroup(iMax).callbacks.add(frameCallback);
            invalidateInternal();
        }
    }

    private void checkDispatchOnAnimationEnd() {
        Runnable runnable = this.onAnimationEndListener;
        if (runnable != null) {
            runnable.run();
            this.onAnimationEndListener = null;
        }
    }

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
    }

    public static Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "Lottie-" + threadId.getAndIncrement());
    }

    public static Thread lambda$static$1(Runnable runnable) {
        return new Thread(runnable, "LottieLow-" + threadId2.getAndIncrement());
    }

    public void lambda$uiRunnableGenerateCacheImpl$2() {
        try {
            BitmapsCache bitmapsCache = this.bitmapsCache;
            if (bitmapsCache != null) {
                bitmapsCache.createCache();
            }
        } catch (Throwable unused) {
        }
        AndroidUtilities.runOnUIThread(this.uiRunnableCacheFinished);
    }

    public void loadFrameRunnableInternal() {
        int iLoadFrameRunnableImpl = loadFrameRunnableImpl();
        if (iLoadFrameRunnableImpl == 1) {
            this.retryDelay = 0;
            AndroidUtilities.runOnUIThread(this.uiRunnable);
        } else if (iLoadFrameRunnableImpl == 2) {
            AndroidUtilities.runOnUIThread(this.uiRunnableNoFrame, this.retryDelay);
            this.retryDelay = Math.min((Math.max(this.retryDelay, 2) * 3) / 2, 2000);
        } else if (iLoadFrameRunnableImpl == 3) {
            AndroidUtilities.runOnUIThread(this.uiRunnableNoFrame);
        }
        CountDownLatch countDownLatch = this.frameWaitSync;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void onChoreographerFrame(long j) {
        checkChoreographerAfterFrameCall();
        if (this.isChoreographerRegistered) {
            this.swapBuffersAllowedByChoreographer = true;
            invalidateInternal();
        }
    }

    private void parseLottieMetadata(File file, String str, int[] iArr) {
        byte b;
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            try {
                jsonReader.beginObject();
                double dNextDouble = 30.0d;
                double dNextDouble2 = 0.0d;
                double dNextDouble3 = 0.0d;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3276) {
                        if (iHashCode != 3367) {
                            if (iHashCode == 3553 && strNextName.equals("op")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("ip")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("fr")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        dNextDouble3 = jsonReader.nextDouble();
                    } else if (b == 1) {
                        dNextDouble2 = jsonReader.nextDouble();
                    } else if (b != 2) {
                        jsonReader.skipValue();
                    } else {
                        dNextDouble = jsonReader.nextDouble();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                iArr[0] = (int) (dNextDouble2 - dNextDouble3);
                iArr[1] = (int) dNextDouble;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            String absolutePath = file.getAbsolutePath();
            int i = this.width;
            int i2 = this.height;
            NativePtrArgs nativePtrArgs = this.args;
            RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(absolutePath, str, i, i2, iArr, false, nativePtrArgs.colorReplacement, this.shouldLimitFps, nativePtrArgs.fitzModifier, this.layerColors);
            if (rLottieNativeCreateFromFile != null) {
                rLottieNativeCreateFromFile.recycle();
            }
        }
    }

    private void performVibration() {
        Integer num;
        HashMap<Integer, Integer> map = this.vibrationPattern;
        if (map == null || !this.allowVibration || (num = map.get(Integer.valueOf(this.currentFrame - 1))) == null) {
            return;
        }
        try {
            Activity activity = LaunchActivity.instance;
            if (activity == null) {
                activity = BubbleActivity.instance;
            }
            activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
        } catch (Exception unused) {
        }
    }

    private void requestRedrawColors() {
        if (!this.applyingLayerColors && !this.isRunning && this.decodeSingleFrame) {
            if (this.currentFrame <= 2) {
                this.currentFrame = 0;
            }
            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (!scheduleNextGetFrame()) {
                this.forceFrameRedraw = true;
            }
        }
        invalidateInternal();
    }

    private void swapBuffers() {
        this.renderingBitmap = this.nextRenderingBitmap;
        this.nextRenderingBitmap = null;
        this.swapBuffersAllowedByChoreographer = false;
    }

    public void uiRunnableCacheFinishedImpl() {
        if (this.cacheGenerateTask != null) {
            BitmapsCache.decrementTaskCounter();
            this.cacheGenerateTask = null;
        }
        this.generatingCache = false;
        decodeFrameFinishedInternal();
        Runnable runnable = this.whenCacheDone;
        if (runnable != null) {
            runnable.run();
            this.whenCacheDone = null;
        }
    }

    public void uiRunnableGenerateCacheImpl() {
        if (this.isRecycled || this.destroyWhenDone || !canLoadFrames() || this.cacheGenerateTask != null) {
            return;
        }
        this.generatingCache = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        BitmapsCache.taskCounter++;
        DispatchQueue dispatchQueue = lottieCacheGenerateQueue;
        RLottieDrawable$$ExternalSyntheticLambda1 rLottieDrawable$$ExternalSyntheticLambda1 = new RLottieDrawable$$ExternalSyntheticLambda1(this, 5);
        this.cacheGenerateTask = rLottieDrawable$$ExternalSyntheticLambda1;
        dispatchQueue.postRunnable(rLottieDrawable$$ExternalSyntheticLambda1);
    }

    public void uiRunnableImpl() {
        this.singleFrameDecoded = true;
        if ((!this.isRunning && this.decodeSingleFrame) || (this.renderingBitmap == null && this.nextRenderingBitmap != null)) {
            invalidateInternal();
        }
        decodeFrameFinishedInternal();
    }

    public void uiRunnableNoFrameImpl() {
        this.loadFrameTask = null;
        decodeFrameFinishedInternal();
    }

    private void updateCurrentFrameInternal(long j, boolean z) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        boolean z2 = this.swapBuffersAllowedByChoreographer || (!this.isRunning && this.decodeSingleFrame);
        if (!this.isRunning) {
            if ((this.forceFrameRedraw || (this.decodeSingleFrame && z2)) && this.nextRenderingBitmap != null) {
                setCurrentFrame(j, true);
                return;
            }
            return;
        }
        if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
            scheduleNextGetFrame();
            return;
        }
        if (this.nextRenderingBitmap != null) {
            if (this.renderingBitmap == null || (z2 && !this.skipFrameUpdate)) {
                performVibration();
                setCurrentFrame(j, false);
            }
        }
    }

    public final void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.add(imageReceiver);
    }

    public final void beginApplyLayerColors() {
        this.applyingLayerColors = true;
    }

    public final void checkCacheCancel() {
        if (this.bitmapsCache == null || lottieCacheGenerateQueue == null || this.cacheGenerateTask == null || !this.parentViews.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.masterParent;
        if (view == null || !view.isAttachedToWindow()) {
            Runnable runnable = this.cacheGenerateTask;
            if (runnable != null) {
                lottieCacheGenerateQueue.cancelRunnable(runnable);
                BitmapsCache.decrementTaskCounter();
                this.cacheGenerateTask = null;
            }
            this.generatingCache = false;
            this.genCacheSend = false;
        }
    }

    public final void checkChoreographer() {
        AndroidUtilities.executeOnUIThread(new RLottieDrawable$$ExternalSyntheticLambda1(this, 6));
    }

    public final void checkRunningTasks() {
        Runnable runnable = this.cacheGenerateTask;
        if (runnable != null) {
            lottieCacheGenerateQueue.cancelRunnable(runnable);
            BitmapsCache.decrementTaskCounter();
            this.cacheGenerateTask = null;
        }
        if (hasParentView() || this.nextRenderingBitmap == null || this.loadFrameTask == null) {
            return;
        }
        this.loadFrameTask = null;
        this.nextRenderingBitmap = null;
    }

    public final void commitApplyLayerColors() {
        if (this.applyingLayerColors) {
            this.applyingLayerColors = false;
            if (!this.isRunning && this.decodeSingleFrame) {
                if (this.currentFrame <= 2) {
                    this.currentFrame = 0;
                }
                this.nextFrameIsLast = false;
                this.singleFrameDecoded = false;
                if (!scheduleNextGetFrame()) {
                    this.forceFrameRedraw = true;
                }
            }
            invalidateInternal();
        }
    }

    public void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null && this.cacheGenerateTask == null && this.nativePtr != null) {
                recycleNativePtr(true);
            }
        }
        if ((this.nativePtr == null || this.fallbackCache) && this.bitmapsCache == null) {
            recycleResources();
            return;
        }
        this.waitingForNextTask = true;
        if (!hasParentView()) {
            stop();
        }
        if (this.isRunning) {
            scheduleNextGetFrame();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        drawInternal(canvas, null, false, 0L, 0);
    }

    public final void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.dstRectBackground;
        if (rectFArr[i2] == null) {
            rectFArr[i2] = new RectF();
            this.backgroundPaint[i2] = new Paint(1);
            this.backgroundPaint[i2].setFilterBitmap(true);
        }
        this.backgroundPaint[i2].setAlpha(i);
        this.backgroundPaint[i2].setColorFilter(colorFilter);
        this.dstRectBackground[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, null, true, 0L, i2);
    }

    public final void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float fWidth;
        float f;
        if (!canLoadFrames() || this.destroyWhenDone) {
            return;
        }
        boolean z2 = false;
        if (!z) {
            updateCurrentFrame(j, false);
        }
        RectF rectF = z ? this.dstRectBackground[i] : this.dstRect;
        if (paint == null) {
            paint = z ? this.backgroundPaint[i] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.isInvalid || this.renderingBitmap == null) {
            return;
        }
        if (z) {
            fWidth = rectF.width() / this.width;
            float fHeight = rectF.height() / this.height;
            if (Math.abs(rectF.width() - this.width) >= AndroidUtilities.dp(1.0f) || Math.abs(rectF.height() - this.height) >= AndroidUtilities.dp(1.0f)) {
                f = fHeight;
                z2 = true;
            } else {
                f = fHeight;
            }
        } else {
            rectF.set(getBounds());
            if (this.applyTransformation) {
                this.scaleX = rectF.width() / this.width;
                this.scaleY = rectF.height() / this.height;
                this.applyTransformation = false;
                this.needScale = Math.abs(rectF.width() - ((float) this.width)) >= ((float) AndroidUtilities.dp(1.0f)) || Math.abs(rectF.height() - ((float) this.height)) >= ((float) AndroidUtilities.dp(1.0f));
            }
            fWidth = this.scaleX;
            f = this.scaleY;
            z2 = this.needScale;
        }
        if (!z2) {
            canvas.drawBitmap(this.renderingBitmap, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(fWidth, f);
        canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public int estimateSizeInCache() {
        int intrinsicHeight = getIntrinsicHeight() * getIntrinsicWidth();
        return this.isSingleChannel ? intrinsicHeight * 2 : intrinsicHeight * 8;
    }

    public void finalize() throws Throwable {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public final Bitmap getAnimatedBitmap() {
        if (this.renderingBitmap != null) {
            return this.renderingBitmap;
        }
        if (this.nextRenderingBitmap != null) {
            return this.nextRenderingBitmap;
        }
        return null;
    }

    public final int getCurrentFrame() {
        return this.currentFrame;
    }

    public final int getCustomEndFrame() {
        return this.customEndFrame;
    }

    public final long getDuration() {
        int[] iArr = this.metaData;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int getFramesCount() {
        return this.metaData[0];
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.height;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.width;
    }

    @Override
    public final int getMinimumHeight() {
        return this.height;
    }

    @Override
    public final int getMinimumWidth() {
        return this.width;
    }

    @Override
    public final int getNextFrame(Bitmap bitmap) {
        RLottieNative rLottieNative = this.generateCacheNative;
        if (rLottieNative == null) {
            return -1;
        }
        if (this.generateCacheFramePointer >= rLottieNative.getFrameCount()) {
            return 0;
        }
        int i = this.shouldLimitFps ? 2 : 1;
        if (this.generateCacheNative.getFrame(this.generateCacheFramePointer, bitmap, true) != -5) {
            this.generateCacheFramePointer += i;
            return 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNextFrame(bitmap);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final float getProgress() {
        return this.currentFrame / this.metaData[0];
    }

    public final boolean hasBitmap() {
        if (this.isRecycled) {
            return false;
        }
        return ((this.renderingBitmap == null && this.nextRenderingBitmap == null) || this.isInvalid) ? false : true;
    }

    public final boolean hasParentView() {
        return (this.parentViews.isEmpty() && this.masterParent == null && getCallback() == null) ? false : true;
    }

    public final boolean hasVibrationPattern() {
        return this.vibrationPattern != null;
    }

    public boolean ignoreScheduleNextGetFrame() {
        return this.renderingBitmap != null && getFramesCount() == 1;
    }

    public void invalidateInternal() {
        if (this.isRecycled) {
            return;
        }
        int size = this.parentViews.size();
        for (int i = 0; i < size; i++) {
            this.parentViews.get(i).invalidate();
        }
        View view = this.masterParent;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final boolean isGeneratingCache() {
        return this.cacheGenerateTask != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public final boolean isLastFrame() {
        return this.currentFrame == getFramesCount() - 1;
    }

    @Override
    public final boolean isRunning() {
        return this.isRunning;
    }

    public int loadFrameRunnableImpl() {
        boolean z;
        int frame;
        BitmapsCache bitmapsCache;
        if (this.isRecycled) {
            return 3;
        }
        if (!canLoadFrames()) {
            return 2;
        }
        if (this.nativePtr == null && this.pendingNativeInit) {
            String res = AndroidUtilities.readRes(this.args.resId);
            if (TextUtils.isEmpty(res)) {
                return 2;
            }
            NativePtrArgs nativePtrArgs = this.args;
            this.nativePtr = RLottieNative.createFromRawJson(res, nativePtrArgs.name, this.metaData, nativePtrArgs.colorReplacement, this.layerColors);
            this.pendingNativeInit = false;
        }
        if (this.backgroundBitmap == null) {
            try {
                this.backgroundBitmap = Bitmap.createBitmap(this.width, this.height, this.isSingleChannel ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                z = false;
            } catch (Throwable th) {
                FileLog.e(th);
                z = true;
            }
        } else {
            z = true;
        }
        if (this.backgroundBitmap != null) {
            applyPendingColorsUpdates();
            try {
                RLottieNative rLottieNative = this.nativePtr;
                int i = this.shouldLimitFps ? 2 : 1;
                if (!this.precache || (bitmapsCache = this.bitmapsCache) == null) {
                    frame = rLottieNative.getFrame(this.currentFrame, this.backgroundBitmap, z);
                } else {
                    try {
                        frame = bitmapsCache.getFrame(this.currentFrame / i, this.backgroundBitmap);
                        try {
                            BitmapsCache bitmapsCache2 = this.bitmapsCache;
                            if (bitmapsCache2.cacheCreated && bitmapsCache2.fileExist && this.allowDrawFramesWhileCacheGenerating && this.nativePtr != null) {
                                this.nativePtr.recycle();
                                this.nativePtr = null;
                            }
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        frame = 0;
                    }
                }
                BitmapsCache bitmapsCache3 = this.bitmapsCache;
                if (bitmapsCache3 != null && (!bitmapsCache3.cacheCreated || !bitmapsCache3.fileExist)) {
                    if (!this.genCacheSend) {
                        this.genCacheSend = true;
                        AndroidUtilities.runOnUIThread(this.uiRunnableGenerateCache);
                    }
                    frame = -1;
                    if (this.allowDrawFramesWhileCacheGenerating) {
                        if (this.nativePtr == null) {
                            String string = this.args.file.toString();
                            NativePtrArgs nativePtrArgs2 = this.args;
                            this.nativePtr = RLottieNative.createFromFile(string, nativePtrArgs2.json, this.width, this.height, null, false, nativePtrArgs2.colorReplacement, false, nativePtrArgs2.fitzModifier, this.layerColors);
                        }
                        if (this.nativePtr != null) {
                            frame = this.nativePtr.getFrame(this.currentFrame, this.backgroundBitmap, z);
                        }
                    }
                }
                if (frame < 0) {
                    return 2;
                }
                this.nextRenderingBitmap = this.backgroundBitmap;
                int i2 = this.customEndFrame;
                if (i2 < 0 || !this.playInDirectionOfCustomEndFrame) {
                    int i3 = this.currentFrame + i;
                    if (i2 < 0) {
                        i2 = this.metaData[0];
                    }
                    if (i3 >= i2) {
                        int i4 = this.autoRepeat;
                        if (i4 == 1) {
                            this.currentFrame = 0;
                            this.nextFrameIsLast = false;
                            if (this.resetVibrationAfterRestart) {
                                this.vibrationPattern = null;
                                this.resetVibrationAfterRestart = false;
                            }
                            int i5 = this.autoRepeatCount;
                            if (i5 > 0) {
                                this.autoRepeatCount = i5 - 1;
                            }
                        } else if (i4 == 2) {
                            this.currentFrame = 0;
                            this.nextFrameIsLast = true;
                            this.autoRepeatPlayCount++;
                            if (this.resetVibrationAfterRestart) {
                                this.vibrationPattern = null;
                                this.resetVibrationAfterRestart = false;
                            }
                        } else {
                            this.nextFrameIsLast = true;
                            checkDispatchOnAnimationEnd();
                        }
                    } else if (this.autoRepeat == 3) {
                        this.nextFrameIsLast = true;
                        this.autoRepeatPlayCount++;
                    } else {
                        this.currentFrame = i3;
                        this.nextFrameIsLast = false;
                    }
                } else {
                    int i6 = this.currentFrame;
                    if (i6 > i2) {
                        int i7 = i6 - i;
                        if (i7 >= i2) {
                            this.currentFrame = i7;
                            this.nextFrameIsLast = false;
                        } else {
                            this.nextFrameIsLast = true;
                            checkDispatchOnAnimationEnd();
                        }
                    } else {
                        int i8 = i6 + i;
                        if (i8 < i2) {
                            this.currentFrame = i8;
                            this.nextFrameIsLast = false;
                        } else {
                            this.nextFrameIsLast = true;
                            checkDispatchOnAnimationEnd();
                        }
                    }
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        return 1;
    }

    public final void multiplySpeed(float f) {
        this.speedMultiply *= f;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    @Override
    public final void prepareForGenerateCache() {
        File file;
        File file2 = this.args.file;
        String string = file2 != null ? file2.toString() : null;
        NativePtrArgs nativePtrArgs = this.args;
        RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(string, nativePtrArgs.json, this.width, this.height, this.createdForFirstFrame ? this.metaData : null, false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier, this.layerColors);
        this.generateCacheNative = rLottieNativeCreateFromFile;
        this.generateCacheFramePointer = 0;
        if (rLottieNativeCreateFromFile != null || (file = this.file) == null) {
            return;
        }
        file.delete();
    }

    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkChoreographer();
        checkRunningTasks();
        if (this.loadFrameTask != null || this.cacheGenerateTask != null || this.generatingCache) {
            this.destroyWhenDone = true;
            return;
        }
        recycleNativePtr(z);
        BitmapsCache bitmapsCache = this.bitmapsCache;
        if (bitmapsCache != null) {
            RandomAccessFile randomAccessFile = bitmapsCache.cachedFile;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                bitmapsCache.cachedFile = null;
            }
            bitmapsCache.recycled = true;
            this.bitmapsCache = null;
        }
        recycleResources();
    }

    public void recycleNativePtr(boolean z) {
        RLottieNative rLottieNative = this.nativePtr;
        this.nativePtr = null;
        if (rLottieNative != null) {
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = new Tooltip$$ExternalSyntheticLambda0(rLottieNative, 3);
            if (z) {
                DispatchQueuePoolBackground.execute(tooltip$$ExternalSyntheticLambda0);
            } else {
                Utilities.globalQueue.postRunnable(tooltip$$ExternalSyntheticLambda0);
            }
        }
    }

    public final void recycleResources() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.renderingBitmap);
        arrayList.add(this.backgroundBitmap);
        arrayList.add(this.nextRenderingBitmap);
        this.nextRenderingBitmap = null;
        this.renderingBitmap = null;
        this.backgroundBitmap = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.onAnimationEndListener != null) {
            this.onAnimationEndListener = null;
        }
    }

    @Override
    public final void releaseForGenerateCache() {
        RLottieNative rLottieNative = this.generateCacheNative;
        if (rLottieNative != null) {
            rLottieNative.recycle();
            this.generateCacheNative = null;
        }
    }

    public final void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.remove(imageReceiver);
        checkCacheCancel();
    }

    public final void replaceColors(int[] iArr) {
        this.newReplaceColors = iArr;
        requestRedrawColors();
    }

    public final void resetVibrationAfterRestart(boolean z) {
        this.resetVibrationAfterRestart = z;
    }

    public final boolean restart() {
        return restart(false);
    }

    public final boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || !canLoadFrames() || ignoreScheduleNextGetFrame() || this.destroyWhenDone || this.isRecycled) {
            return false;
        }
        if (!this.isRunning && (!this.decodeSingleFrame || this.singleFrameDecoded)) {
            return false;
        }
        if (this.generatingCache && !this.allowDrawFramesWhileCacheGenerating) {
            return false;
        }
        if (!this.newColorUpdates.isEmpty()) {
            this.pendingColorUpdates.putAll(this.newColorUpdates);
            this.newColorUpdates.clear();
        }
        int[] iArr = this.newReplaceColors;
        if (iArr != null) {
            this.pendingReplaceColors = iArr;
            this.newReplaceColors = null;
        }
        Runnable runnable = this.loadFrameRunnable;
        this.loadFrameTask = runnable;
        (this.shouldLimitFps ? loadFrameRunnableQueueLimitFps : loadFrameRunnableQueue).execute(runnable);
        return true;
    }

    public final void setAllowDecodeSingleFrame(boolean z) {
        this.decodeSingleFrame = z;
        if (z) {
            scheduleNextGetFrame();
        }
    }

    public final void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.allowDrawFramesWhileCacheGenerating = z;
    }

    public final void setAllowVibration(boolean z) {
        this.allowVibration = z;
    }

    public final void setAutoRepeat(int i) {
        if (this.autoRepeat == 2 && i == 3 && this.currentFrame != 0) {
            return;
        }
        this.autoRepeat = i;
    }

    public final void setAutoRepeatCount(int i) {
        this.autoRepeatCount = i;
    }

    public final void setAutoRepeatTimeout(long j) {
        this.autoRepeatTimeout = j;
    }

    public final void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public final boolean setCustomEndFrame(int i) {
        if (this.customEndFrame == i || i > this.metaData[0]) {
            return false;
        }
        this.customEndFrame = i;
        return true;
    }

    public final void setGeneratingFrame(int i) {
        this.generateCacheFramePointer = i;
    }

    public final void setInvalidateOnProgressSet(boolean z) {
        this.invalidateOnProgressSet = z;
    }

    public final void setLayerColor(String str, int i) {
        this.newColorUpdates.put(str, Integer.valueOf(i));
        requestRedrawColors();
    }

    public final void setMasterParent(View view) {
        this.masterParent = view;
    }

    public final void setOnAnimationEndListener(Runnable runnable) {
        this.onAnimationEndListener = runnable;
    }

    public final void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.onFinishCallback = new WeakReference<>(runnable);
            this.finishFrame = i;
        } else if (this.onFinishCallback != null) {
            this.onFinishCallback = null;
        }
    }

    public final void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.playInDirectionOfCustomEndFrame = z;
    }

    public final void setProgress(float f) {
        setProgress(f, true);
    }

    public final void setProgressMs(long j) {
        int i;
        int[] iArr = this.metaData;
        if (iArr[0] == 0 || (i = iArr[1]) == 0) {
            return;
        }
        setCurrentFrame(Math.round(Math.max(0L, j) / (1000.0f / i)) % this.metaData[0], true, true);
    }

    public final void setVibrationPattern(HashMap<Integer, Integer> map) {
        this.vibrationPattern = map;
    }

    @Override
    public final void start() {
        if (this.isRunning) {
            return;
        }
        if ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.customEndFrame != this.currentFrame) {
            this.isRunning = true;
            this.isPaused = false;
            if (this.invalidateOnProgressSet) {
                this.isInvalid = true;
                if (this.loadFrameTask != null) {
                    this.doNotRemoveInvalidOnFrameReady = true;
                }
            }
            scheduleNextGetFrame();
            invalidateInternal();
            checkChoreographer();
        }
    }

    @Override
    public final void stop() {
        this.isRunning = false;
        checkChoreographer();
    }

    public void updateCurrentFrame(long j, boolean z) {
        checkChoreographerAfterDrawCall();
        updateCurrentFrameInternal(j, z);
    }

    public final void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public final boolean restart(boolean z) {
        if (!z && ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.autoRepeatCount < 0)) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.autoRepeat = 2;
        start();
        return true;
    }

    public final void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    public final void setProgress(float f, boolean z) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        setCurrentFrame((int) (this.metaData[0] * f), z);
    }

    public final void setCurrentFrame(int i, boolean z, boolean z2) {
        if (i < 0 || i > this.metaData[0]) {
            return;
        }
        if (this.currentFrame != i || z2) {
            this.currentFrame = i;
            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (this.invalidateOnProgressSet) {
                this.isInvalid = true;
                if (this.loadFrameTask != null) {
                    this.doNotRemoveInvalidOnFrameReady = true;
                }
            }
            if ((!z || z2) && this.waitingForNextTask && this.nextRenderingBitmap != null) {
                this.backgroundBitmap = this.nextRenderingBitmap;
                this.nextRenderingBitmap = null;
                this.loadFrameTask = null;
                this.waitingForNextTask = false;
            }
            if (!z && this.loadFrameTask == null) {
                this.frameWaitSync = new CountDownLatch(1);
            }
            if (z2 && !this.isRunning) {
                this.isRunning = true;
                checkChoreographer();
            }
            if (!scheduleNextGetFrame()) {
                this.forceFrameRedraw = true;
            } else if (!z) {
                try {
                    this.frameWaitSync.await();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.frameWaitSync = null;
            }
            invalidateSelf();
        }
    }

    private void setCurrentFrame(long j, boolean z) {
        WeakReference<Runnable> weakReference;
        Runnable runnable;
        WeakReference<Runnable> weakReference2;
        this.backgroundBitmap = this.renderingBitmap;
        swapBuffers();
        if (this.isDice == 2 && (weakReference2 = this.onFinishCallback) != null && this.currentFrame - 1 >= this.finishFrame) {
            Runnable runnable2 = weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.onFinishCallback = null;
        }
        if (this.nextFrameIsLast || (this.autoRepeatCount == 0 && this.autoRepeat == 1)) {
            stop();
        }
        this.loadFrameTask = null;
        if (this.doNotRemoveInvalidOnFrameReady) {
            this.doNotRemoveInvalidOnFrameReady = false;
        } else if (this.isInvalid) {
            this.isInvalid = false;
        }
        this.singleFrameDecoded = true;
        this.waitingForNextTask = false;
        if (z && this.forceFrameRedraw) {
            this.singleFrameDecoded = false;
            this.forceFrameRedraw = false;
        }
        if (this.isDice == 0 && (weakReference = this.onFinishCallback) != null && this.currentFrame >= this.finishFrame && (runnable = weakReference.get()) != null) {
            runnable.run();
        }
        scheduleNextGetFrame();
    }

    public RLottieDrawable(int i, int i2) {
        this.metaData = new int[3];
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.layerColors = new HashMap<>();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList<>();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new RLottieDrawable$$ExternalSyntheticLambda1(this, 0);
        this.uiRunnable = new RLottieDrawable$$ExternalSyntheticLambda1(this, 1);
        this.uiRunnableGenerateCache = new RLottieDrawable$$ExternalSyntheticLambda1(this, 2);
        this.uiRunnableCacheFinished = new RLottieDrawable$$ExternalSyntheticLambda1(this, 3);
        this.loadFrameRunnable = new RLottieDrawable$$ExternalSyntheticLambda1(this, 4);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda6(this, 0);
        this.width = i;
        this.height = i2;
        this.isSingleChannel = false;
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, null);
    }

    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        this.layerColors = map;
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList<>();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new RLottieDrawable$$ExternalSyntheticLambda1(this, 0);
        this.uiRunnable = new RLottieDrawable$$ExternalSyntheticLambda1(this, 1);
        this.uiRunnableGenerateCache = new RLottieDrawable$$ExternalSyntheticLambda1(this, 2);
        this.uiRunnableCacheFinished = new RLottieDrawable$$ExternalSyntheticLambda1(this, 3);
        this.loadFrameRunnable = new RLottieDrawable$$ExternalSyntheticLambda1(this, 4);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda6(this, 0);
        this.width = i2;
        this.height = i3;
        this.autoRepeat = 0;
        getPaint().setFlags(2);
        NativePtrArgs nativePtrArgs = new NativePtrArgs();
        this.args = nativePtrArgs;
        nativePtrArgs.name = str;
        nativePtrArgs.colorReplacement = iArr == null ? null : (int[]) iArr.clone();
        long jFind = ResLottieMeta.find(i);
        if (jFind != -1) {
            this.pendingNativeInit = true;
            this.args.resId = i;
            this.isSingleChannel = ResLottieMeta.isMonoColorOf(jFind);
            iArr2[0] = ResLottieMeta.frameCountOf(jFind);
            iArr2[1] = ResLottieMeta.fpsOf(jFind);
        } else {
            this.isSingleChannel = false;
            String res = AndroidUtilities.readRes(i);
            if (TextUtils.isEmpty(res)) {
                this.args = null;
                return;
            } else {
                NativePtrArgs nativePtrArgs2 = this.args;
                nativePtrArgs2.json = res;
                this.nativePtr = RLottieNative.createFromRawJson(res, str, iArr2, nativePtrArgs2.colorReplacement, map);
            }
        }
        if (this.isSingleChannel) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
    }
}
