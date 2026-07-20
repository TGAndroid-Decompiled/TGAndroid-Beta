package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;

public class RLottieDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    private static int activeChoreographersCount;
    public static DispatchQueue lottieCacheGenerateQueue;
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
    protected CountDownLatch frameWaitSync;
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
    protected final Runnable loadFrameRunnable;
    protected Runnable loadFrameTask;
    private final Choreographer60FpsContent.FrameCallback mUiThreadChoreographerCallback;
    private View masterParent;
    protected final int[] metaData;
    protected volatile RLottieNative nativePtr;
    private boolean needScale;
    private final HashMap newColorUpdates;
    private int[] newReplaceColors;
    protected volatile boolean nextFrameIsLast;
    protected volatile Bitmap nextRenderingBitmap;
    private Runnable onAnimationEndListener;
    protected WeakReference onFinishCallback;
    private final ArrayList parentViews;
    private final HashMap pendingColorUpdates;
    private int[] pendingReplaceColors;
    protected boolean playInDirectionOfCustomEndFrame;
    private boolean precache;
    private Bitmap rawBackgroundBitmap;
    private int rawBackgroundBitmapFrame;
    protected volatile Bitmap renderingBitmap;
    protected boolean resetVibrationAfterRestart;
    private float scaleX;
    private float scaleY;
    private boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    private float speedMultiply;
    private boolean swapBuffersAllowedByChoreographer;
    private int ticksWithoutDraw;
    protected final Runnable uiRunnable;
    private final Runnable uiRunnableCacheFinished;
    private final Runnable uiRunnableGenerateCache;
    protected final Runnable uiRunnableNoFrame;
    protected HashMap vibrationPattern;
    protected boolean waitingForNextTask;
    public Runnable whenCacheDone;
    protected final int width;
    private static final AtomicInteger threadId = new AtomicInteger();
    private static final AtomicInteger threadId2 = new AtomicInteger();
    private static final Executor loadFrameRunnableQueue = Executors.newFixedThreadPool(4, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            return RLottieDrawable.lambda$static$0(runnable);
        }
    });
    private static final Executor loadFrameRunnableQueueLimitFps = Executors.newFixedThreadPool(2, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            return RLottieDrawable.lambda$static$1(runnable);
        }
    });

    @Override
    public final int getOpacity() {
        return -2;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public static Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "Lottie-" + threadId.getAndIncrement());
    }

    public static Thread lambda$static$1(Runnable runnable) {
        return new Thread(runnable, "LottieLow-" + threadId2.getAndIncrement());
    }

    public void uiRunnableNoFrameImpl() {
        this.loadFrameTask = null;
        decodeFrameFinishedInternal();
    }

    public void uiRunnableImpl() {
        this.singleFrameDecoded = true;
        if ((!this.isRunning && this.decodeSingleFrame) || (this.renderingBitmap == null && this.nextRenderingBitmap != null)) {
            invalidateInternal();
        }
        decodeFrameFinishedInternal();
    }

    public void uiRunnableGenerateCacheImpl() {
        if (this.isRecycled || this.destroyWhenDone || !canLoadFrames() || this.cacheGenerateTask != null) {
            return;
        }
        this.generatingCache = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        BitmapsCache.incrementTaskCounter();
        DispatchQueue dispatchQueue = lottieCacheGenerateQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$uiRunnableGenerateCacheImpl$2();
            }
        };
        this.cacheGenerateTask = runnable;
        dispatchQueue.postRunnable(runnable);
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

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
    }

    protected final void checkRunningTasks() {
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

    protected void decodeFrameFinishedInternal() {
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

    protected void recycleNativePtr(boolean z) {
        final RLottieNative rLottieNative = this.nativePtr;
        this.nativePtr = null;
        if (rLottieNative != null) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    rLottieNative.recycle();
                }
            };
            if (z) {
                DispatchQueuePoolBackground.execute(runnable);
            } else {
                Utilities.globalQueue.postRunnable(runnable);
            }
        }
    }

    protected final void recycleResources() {
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

    public final void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.onFinishCallback = new WeakReference(runnable);
            this.finishFrame = i;
        } else if (this.onFinishCallback != null) {
            this.onFinishCallback = null;
        }
    }

    protected void loadFrameRunnableImpl() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RLottieDrawable.loadFrameRunnableImpl():void");
    }

    private void applyPendingColorsUpdates() {
        RLottieNative rLottieNative = this.nativePtr;
        if (rLottieNative == null) {
            return;
        }
        try {
            if (!this.pendingColorUpdates.isEmpty()) {
                for (Map.Entry entry : this.pendingColorUpdates.entrySet()) {
                    rLottieNative.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.pendingColorUpdates.clear();
            }
            int[] iArr = this.pendingReplaceColors;
            if (iArr != null) {
                rLottieNative.replaceColors(iArr);
                this.pendingReplaceColors = null;
            }
        } catch (Exception unused) {
        }
    }

    public RLottieDrawable(File file, String str, int i, int i2, BitmapsCache.CacheOptions cacheOptions, boolean z, int[] iArr, int i3) throws IOException {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableCacheFinishedImpl();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadFrameRunnableImpl();
            }
        };
        this.rawBackgroundBitmapFrame = -1;
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() {
            @Override
            public final void doFrame(long j) {
                this.f$0.onChoreographerFrame(j);
            }
        };
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z;
        this.precache = cacheOptions != null;
        this.fallbackCache = str == null && cacheOptions != null && cacheOptions.fallback;
        this.createdForFirstFrame = cacheOptions != null && cacheOptions.firstFrame;
        getPaint().setFlags(2);
        if (str == null) {
            this.file = file;
        }
        if (this.precache && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.precache) {
            NativePtrArgs nativePtrArgs = new NativePtrArgs();
            this.args = nativePtrArgs;
            nativePtrArgs.file = file.getAbsoluteFile();
            NativePtrArgs nativePtrArgs2 = this.args;
            nativePtrArgs2.json = str;
            nativePtrArgs2.colorReplacement = iArr;
            nativePtrArgs2.fitzModifier = i3;
            if (this.createdForFirstFrame) {
                return;
            }
            parseLottieMetadata(file, str, iArr2);
            if (this.shouldLimitFps && iArr2[1] < 60) {
                this.shouldLimitFps = false;
            }
            this.bitmapsCache = new BitmapsCache(file, this, cacheOptions, i, i2, !z);
            return;
        }
        this.nativePtr = RLottieNative.createFromFile(file.getAbsolutePath(), str, i, i2, iArr2, this.precache, iArr, this.shouldLimitFps, i3);
        if (this.nativePtr == null) {
            FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
            file.delete();
        }
        if (!this.shouldLimitFps || iArr2[1] >= 60) {
            return;
        }
        this.shouldLimitFps = false;
    }

    private void parseLottieMetadata(java.io.File r15, java.lang.String r16, int[] r17) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RLottieDrawable.parseLottieMetadata(java.io.File, java.lang.String, int[]):void");
    }

    protected RLottieDrawable(int i, int i2) {
        this.metaData = new int[3];
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableCacheFinishedImpl();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadFrameRunnableImpl();
            }
        };
        this.rawBackgroundBitmapFrame = -1;
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() {
            @Override
            public final void doFrame(long j) {
                this.f$0.onChoreographerFrame(j);
            }
        };
        this.width = i;
        this.height = i2;
    }

    private void checkDispatchOnAnimationEnd() {
        Runnable runnable = this.onAnimationEndListener;
        if (runnable != null) {
            runnable.run();
            this.onAnimationEndListener = null;
        }
    }

    public final void setOnAnimationEndListener(Runnable runnable) {
        this.onAnimationEndListener = runnable;
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, null);
    }

    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableCacheFinishedImpl();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadFrameRunnableImpl();
            }
        };
        this.rawBackgroundBitmapFrame = -1;
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() {
            @Override
            public final void doFrame(long j) {
                this.f$0.onChoreographerFrame(j);
            }
        };
        this.width = i2;
        this.height = i3;
        this.autoRepeat = 0;
        String res = AndroidUtilities.readRes(i);
        if (TextUtils.isEmpty(res)) {
            return;
        }
        getPaint().setFlags(2);
        this.nativePtr = RLottieNative.createFromRawJson(res, str, iArr2, iArr);
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
    }

    public final void multiplySpeed(float f) {
        this.speedMultiply *= f;
    }

    public final int getCurrentFrame() {
        return this.currentFrame;
    }

    public final float getProgress() {
        return this.currentFrame / this.metaData[0];
    }

    public final int getCustomEndFrame() {
        return this.customEndFrame;
    }

    public final long getDuration() {
        int[] iArr = this.metaData;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.playInDirectionOfCustomEndFrame = z;
    }

    public final boolean setCustomEndFrame(int i) {
        if (this.customEndFrame == i || i > this.metaData[0]) {
            return false;
        }
        this.customEndFrame = i;
        return true;
    }

    public final int getFramesCount() {
        return this.metaData[0];
    }

    public final void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.add(imageReceiver);
    }

    public final void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.remove(imageReceiver);
        checkCacheCancel();
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

    protected final boolean hasParentView() {
        return (this.parentViews.isEmpty() && this.masterParent == null && getCallback() == null) ? false : true;
    }

    protected void invalidateInternal() {
        if (this.isRecycled) {
            return;
        }
        int size = this.parentViews.size();
        for (int i = 0; i < size; i++) {
            ((ImageReceiver) this.parentViews.get(i)).invalidate();
        }
        View view = this.masterParent;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final void setAllowDecodeSingleFrame(boolean z) {
        this.decodeSingleFrame = z;
        if (z) {
            scheduleNextGetFrame();
        }
    }

    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkChoreographer();
        checkRunningTasks();
        if (this.loadFrameTask == null && this.cacheGenerateTask == null && !this.generatingCache) {
            recycleNativePtr(z);
            BitmapsCache bitmapsCache = this.bitmapsCache;
            if (bitmapsCache != null) {
                bitmapsCache.recycle();
                this.bitmapsCache = null;
            }
            recycleResources();
            return;
        }
        this.destroyWhenDone = true;
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

    protected void finalize() throws Throwable {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
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

    public final boolean restart() {
        return restart(false);
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

    public final void setVibrationPattern(HashMap map) {
        this.vibrationPattern = map;
    }

    public final boolean hasVibrationPattern() {
        return this.vibrationPattern != null;
    }

    public final void beginApplyLayerColors() {
        this.applyingLayerColors = true;
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

    public final void replaceColors(int[] iArr) {
        this.newReplaceColors = iArr;
        requestRedrawColors();
    }

    public final void setLayerColor(String str, int i) {
        this.newColorUpdates.put(str, Integer.valueOf(i));
        requestRedrawColors();
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

    protected final boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || !canLoadFrames() || ignoreScheduleNextGetFrame() || this.destroyWhenDone) {
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

    protected boolean ignoreScheduleNextGetFrame() {
        return this.renderingBitmap != null && getFramesCount() == 1;
    }

    @Override
    public final void stop() {
        this.isRunning = false;
        checkChoreographer();
    }

    public final void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public final void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
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

    public final void setProgressMs(long j) {
        int i;
        int[] iArr = this.metaData;
        if (iArr[0] == 0 || (i = iArr[1]) == 0) {
            return;
        }
        setCurrentFrame(Math.round(Math.max(0L, j) / (1000.0f / i)) % this.metaData[0], true, true);
    }

    public final void setProgress(float f) {
        setProgress(f, true);
    }

    public final void setProgress(float f, boolean z) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        setCurrentFrame((int) (this.metaData[0] * f), z);
    }

    @Override
    public final boolean isRunning() {
        return this.isRunning;
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
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    private void swapBuffers() {
        this.renderingBitmap = this.nextRenderingBitmap;
        this.nextRenderingBitmap = null;
        this.swapBuffersAllowedByChoreographer = false;
    }

    private void setCurrentFrame(long j, boolean z) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.backgroundBitmap = this.renderingBitmap;
        swapBuffers();
        if (this.isDice == 2 && (weakReference2 = this.onFinishCallback) != null && this.currentFrame - 1 >= this.finishFrame) {
            Runnable runnable2 = (Runnable) weakReference2.get();
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
        if (this.isDice == 0 && (weakReference = this.onFinishCallback) != null && this.currentFrame >= this.finishFrame && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        scheduleNextGetFrame();
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

    public final void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public final void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float fWidth;
        float f;
        if (!canLoadFrames() || this.destroyWhenDone) {
            return;
        }
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
        if (!z) {
            rectF.set(getBounds());
            if (this.applyTransformation) {
                this.scaleX = rectF.width() / this.width;
                this.scaleY = rectF.height() / this.height;
                this.applyTransformation = false;
                this.needScale = Math.abs(rectF.width() - ((float) this.width)) >= ((float) AndroidUtilities.dp(1.0f)) || Math.abs(rectF.height() - ((float) this.height)) >= ((float) AndroidUtilities.dp(1.0f));
            }
            fWidth = this.scaleX;
            f = this.scaleY;
            z = this.needScale;
        } else {
            fWidth = rectF.width() / this.width;
            float fHeight = rectF.height() / this.height;
            if (Math.abs(rectF.width() - this.width) >= AndroidUtilities.dp(1.0f) || Math.abs(rectF.height() - this.height) >= AndroidUtilities.dp(1.0f)) {
                f = fHeight;
                z = true;
            } else {
                f = fHeight;
            }
        }
        if (!z) {
            canvas.drawBitmap(this.renderingBitmap, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(fWidth, f);
        canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public void updateCurrentFrame(long j, boolean z) {
        checkChoreographerAfterDrawCall();
        updateCurrentFrameInternal(j, z);
    }

    private void updateCurrentFrameInternal(long j, boolean z) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        boolean z2 = this.swapBuffersAllowedByChoreographer || (!this.isRunning && this.decodeSingleFrame);
        if (this.isRunning) {
            if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
                return;
            }
            if (this.nextRenderingBitmap != null) {
                if (this.renderingBitmap == null || (z2 && !this.skipFrameUpdate)) {
                    performVibration();
                    setCurrentFrame(j, false);
                    return;
                }
                return;
            }
            return;
        }
        if ((this.forceFrameRedraw || (this.decodeSingleFrame && z2)) && this.nextRenderingBitmap != null) {
            setCurrentFrame(j, true);
        }
    }

    private void performVibration() {
        Integer num;
        HashMap map = this.vibrationPattern;
        if (map == null || !this.allowVibration || (num = (Integer) map.get(Integer.valueOf(this.currentFrame - 1))) == null) {
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

    public final void setAllowVibration(boolean z) {
        this.allowVibration = z;
    }

    public final void resetVibrationAfterRestart(boolean z) {
        this.resetVibrationAfterRestart = z;
    }

    @Override
    public final int getMinimumHeight() {
        return this.height;
    }

    @Override
    public final int getMinimumWidth() {
        return this.width;
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

    public final boolean hasBitmap() {
        return (this.isRecycled || (this.renderingBitmap == null && this.nextRenderingBitmap == null) || this.isInvalid) ? false : true;
    }

    public final void setInvalidateOnProgressSet(boolean z) {
        this.invalidateOnProgressSet = z;
    }

    public final boolean isGeneratingCache() {
        return this.cacheGenerateTask != null;
    }

    public final boolean isLastFrame() {
        return this.currentFrame == getFramesCount() - 1;
    }

    @Override
    public final void prepareForGenerateCache() {
        File file;
        String string = this.args.file.toString();
        NativePtrArgs nativePtrArgs = this.args;
        RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(string, nativePtrArgs.json, this.width, this.height, this.createdForFirstFrame ? this.metaData : null, false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier);
        this.generateCacheNative = rLottieNativeCreateFromFile;
        this.generateCacheFramePointer = 0;
        if (rLottieNativeCreateFromFile != null || (file = this.file) == null) {
            return;
        }
        file.delete();
    }

    public final void setGeneratingFrame(int i) {
        this.generateCacheFramePointer = i;
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
        if (this.generateCacheNative.getFrame(this.generateCacheFramePointer, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getNextFrame(bitmap);
        }
        this.generateCacheFramePointer += i;
        return 1;
    }

    public final void cacheFrame(int i) {
        if (this.rawBackgroundBitmapFrame != i || this.rawBackgroundBitmap == null) {
            if (this.rawBackgroundBitmap == null) {
                this.rawBackgroundBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            }
            RLottieNative rLottieNative = this.nativePtr;
            this.rawBackgroundBitmapFrame = i;
            rLottieNative.getFrame(i, this.rawBackgroundBitmap, true);
        }
    }

    public final void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.rawBackgroundBitmap != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(0, 0, this.width, this.height);
            canvas.drawBitmap(this.rawBackgroundBitmap, rect, getBounds(), getPaint());
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

    public final void setMasterParent(View view) {
        this.masterParent = view;
    }

    private boolean canLoadFrames() {
        return this.precache ? this.bitmapsCache != null || this.fallbackCache : this.nativePtr != null;
    }

    private static class NativePtrArgs {
        public int[] colorReplacement;
        File file;
        public int fitzModifier;
        String json;

        private NativePtrArgs() {
        }
    }

    public final void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.allowDrawFramesWhileCacheGenerating = z;
    }

    private void checkChoreographerAfterFrameCall() {
        int i = this.ticksWithoutDraw + 1;
        this.ticksWithoutDraw = i;
        if (i > 10) {
            this.isPaused = true;
        }
        checkChoreographerInternal();
    }

    private void checkChoreographerAfterDrawCall() {
        this.ticksWithoutDraw = 0;
        if (this.isPaused) {
            this.isPaused = false;
            checkChoreographer();
        }
    }

    public void onChoreographerFrame(long j) {
        checkChoreographerAfterFrameCall();
        if (this.isChoreographerRegistered) {
            this.swapBuffersAllowedByChoreographer = true;
            invalidateInternal();
        }
    }

    protected final void checkChoreographer() {
        AndroidUtilities.executeOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.checkChoreographerInternal();
            }
        });
    }

    public void checkChoreographerInternal() {
        if (this.isRunning && !this.isPaused) {
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
                Choreographer60FpsContent.getInstance().addFrameCallback(this.mUiThreadChoreographerCallback, iRound);
                invalidateInternal();
                return;
            }
            return;
        }
        if (this.isChoreographerRegistered) {
            activeChoreographersCount--;
            this.isChoreographerRegistered = false;
            this.ticksWithoutDraw = 0;
            Choreographer60FpsContent.getInstance().removeFrameCallback(this.mUiThreadChoreographerCallback);
        }
    }
}
