package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.commonmark.internal.InlineParserImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ResLottieMeta;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda14;
import org.telegram.ui.LaunchActivity;

public class RLottieDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    public static final ExecutorService loadFrameRunnableQueue;
    public static final ExecutorService loadFrameRunnableQueueLimitFps;
    public static DispatchQueue lottieCacheGenerateQueue;
    public static final AtomicInteger threadId = new AtomicInteger();
    public static final AtomicInteger threadId2 = new AtomicInteger();
    public boolean allowDrawFramesWhileCacheGenerating;
    public boolean allowVibration;
    public boolean applyTransformation;
    public boolean applyingLayerColors;
    public final NativePtrArgs args;
    public int autoRepeat;
    public int autoRepeatCount;
    public int autoRepeatPlayCount;
    public volatile Bitmap backgroundBitmap;
    public final Paint[] backgroundPaint;
    public BitmapsCache bitmapsCache;
    public ChatActionCell$$ExternalSyntheticLambda14 cacheGenerateTask;
    public final boolean createdForFirstFrame;
    public int currentFrame;
    public int customEndFrame;
    public boolean decodeSingleFrame;
    public boolean destroyWhenDone;
    public boolean doNotRemoveInvalidOnFrameReady;
    public final RectF dstRect;
    public final RectF[] dstRectBackground;
    public final boolean fallbackCache;
    public final File file;
    public int finishFrame;
    public boolean forceFrameRedraw;
    public CountDownLatch frameWaitSync;
    public boolean genCacheSend;
    public int generateCacheFramePointer;
    public RLottieNative generateCacheNative;
    public boolean generatingCache;
    public final int height;
    public boolean invalidateOnProgressSet;
    public boolean isChoreographerRegistered;
    public int isDice;
    public boolean isInvalid;
    public volatile boolean isPaused;
    public volatile boolean isRecycled;
    public volatile boolean isRunning;
    public final boolean isSingleChannel;
    public final HashMap layerColors;
    public final Runnable loadFrameRunnable;
    public Runnable loadFrameTask;
    public final Choreographer60FpsContent.FrameCallback mUiThreadChoreographerCallback;
    public View masterParent;
    public final int[] metaData;
    public volatile RLottieNative nativePtr;
    public boolean needScale;
    public final HashMap newColorUpdates;
    public int[] newReplaceColors;
    public volatile boolean nextFrameIsLast;
    public volatile Bitmap nextRenderingBitmap;
    public Runnable onAnimationEndListener;
    public WeakReference onFinishCallback;
    public final ArrayList parentViews;
    public final HashMap pendingColorUpdates;
    public boolean pendingNativeInit;
    public int[] pendingReplaceColors;
    public boolean playInDirectionOfCustomEndFrame;
    public final boolean precache;
    public volatile Bitmap renderingBitmap;
    public boolean resetVibrationAfterRestart;
    public int retryDelay;
    public float scaleX;
    public float scaleY;
    public final boolean shouldLimitFps;
    public boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    public float speedMultiply;
    public boolean swapBuffersAllowedByChoreographer;
    public int ticksWithoutDraw;
    public final Runnable uiRunnable;
    public final Runnable uiRunnableCacheFinished;
    public final Runnable uiRunnableGenerateCache;
    public final Runnable uiRunnableNoFrame;
    public HashMap vibrationPattern;
    public boolean waitingForNextTask;
    public Runnable whenCacheDone;
    public final int width;

    public final class NativePtrArgs {
        public int[] colorReplacement;
        public File file;
        public int fitzModifier;
        public String json;
        public String name;
        public int resId;
    }

    static {
        final int i = 0;
        loadFrameRunnableQueue = Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                switch (i) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + RLottieDrawable.threadId.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + RLottieDrawable.threadId2.getAndIncrement());
                }
            }
        });
        final int i2 = 1;
        loadFrameRunnableQueueLimitFps = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                switch (i2) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + RLottieDrawable.threadId.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + RLottieDrawable.threadId2.getAndIncrement());
                }
            }
        });
    }

    public RLottieDrawable(File file, String str, int i, int i2, InlineParserImpl.DelimiterData delimiterData, boolean z, int i3, boolean z2) {
        char c;
        char c2;
        byte b;
        int[] iArr = new int[3];
        this.metaData = iArr;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        HashMap map = new HashMap();
        this.layerColors = map;
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
        this.uiRunnableNoFrame = new ChatActionCell$$ExternalSyntheticLambda14(this, 2);
        this.uiRunnable = new ChatActionCell$$ExternalSyntheticLambda14(this, 4);
        this.uiRunnableGenerateCache = new ChatActionCell$$ExternalSyntheticLambda14(this, 5);
        this.uiRunnableCacheFinished = new ChatActionCell$$ExternalSyntheticLambda14(this, 6);
        this.loadFrameRunnable = new ChatActionCell$$ExternalSyntheticLambda14(this, 7);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda5(this, 0);
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z;
        this.isSingleChannel = z2;
        boolean z3 = delimiterData != null;
        this.precache = z3;
        this.fallbackCache = str == null && delimiterData != null && delimiterData.canClose;
        boolean z4 = delimiterData != null && delimiterData.canOpen;
        this.createdForFirstFrame = z4;
        NativePtrArgs nativePtrArgs = new NativePtrArgs();
        this.args = nativePtrArgs;
        nativePtrArgs.file = file.getAbsoluteFile();
        nativePtrArgs.json = str;
        nativePtrArgs.colorReplacement = null;
        nativePtrArgs.fitzModifier = i3;
        getPaint().setFlags(2);
        if (str == null) {
            this.file = file;
        }
        if (z3 && lottieCacheGenerateQueue == null) {
            c = 0;
            lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
        } else {
            c = 0;
        }
        if (!z3) {
            this.nativePtr = RLottieNative.createFromFile(file.getAbsolutePath(), str, i, i2, iArr, z3, nativePtrArgs.colorReplacement, z, i3, map);
            if (this.nativePtr == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z || iArr[1] >= 60) {
                return;
            }
            this.shouldLimitFps = false;
            return;
        }
        if (z4) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            try {
                jsonReader.beginObject();
                double dNextDouble = 0.0d;
                double dNextDouble2 = 30.0d;
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
                        dNextDouble = jsonReader.nextDouble();
                    } else if (b != 2) {
                        jsonReader.skipValue();
                    } else {
                        dNextDouble2 = jsonReader.nextDouble();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                iArr[c] = (int) (dNextDouble - dNextDouble3);
                iArr[1] = (int) dNextDouble2;
                c2 = 1;
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
            int i4 = this.width;
            int i5 = this.height;
            NativePtrArgs nativePtrArgs2 = this.args;
            c2 = 1;
            RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(absolutePath, str, i4, i5, iArr, false, nativePtrArgs2.colorReplacement, this.shouldLimitFps, nativePtrArgs2.fitzModifier, this.layerColors);
            if (rLottieNativeCreateFromFile != null) {
                rLottieNativeCreateFromFile.recycle();
            }
        }
        if (this.shouldLimitFps && this.metaData[c2] < 60) {
            this.shouldLimitFps = false;
        }
        this.bitmapsCache = new BitmapsCache(file, this, delimiterData, i, i2, !z, i3);
    }

    public final boolean canLoadFrames$1() {
        if (this.precache) {
            return this.bitmapsCache != null || this.fallbackCache;
        }
        return this.nativePtr != null || this.pendingNativeInit;
    }

    public final void checkChoreographer$1() {
        AndroidUtilities.executeOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(this, 8));
    }

    public final void checkChoreographerInternal$1() {
        if (!this.isRunning || this.isPaused) {
            if (this.isChoreographerRegistered) {
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

    public final void checkRunningTasks() {
        ChatActionCell$$ExternalSyntheticLambda14 chatActionCell$$ExternalSyntheticLambda14 = this.cacheGenerateTask;
        if (chatActionCell$$ExternalSyntheticLambda14 != null) {
            lottieCacheGenerateQueue.cancelRunnable(chatActionCell$$ExternalSyntheticLambda14);
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
            this.isRunning = false;
            checkChoreographer$1();
        }
        if (this.isRunning) {
            scheduleNextGetFrame();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        drawInternal(canvas, null, false, 0L, 0);
    }

    public final void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float fWidth;
        float fHeight;
        if (!canLoadFrames$1() || this.destroyWhenDone) {
            return;
        }
        if (!z) {
            updateCurrentFrame(j);
        }
        RectF rectF = z ? this.dstRectBackground[i] : this.dstRect;
        if (paint == null) {
            paint = z ? this.backgroundPaint[i] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.isInvalid || this.renderingBitmap == null) {
            return;
        }
        boolean z2 = true;
        if (z) {
            fWidth = rectF.width() / this.width;
            fHeight = rectF.height() / this.height;
            if (Math.abs(rectF.width() - this.width) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.height) < AndroidUtilities.dp(1.0f)) {
                z2 = false;
            }
        } else {
            rectF.set(getBounds());
            if (this.applyTransformation) {
                this.scaleX = rectF.width() / this.width;
                this.scaleY = rectF.height() / this.height;
                this.applyTransformation = false;
                if (Math.abs(rectF.width() - this.width) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.height) < AndroidUtilities.dp(1.0f)) {
                    z2 = false;
                }
                this.needScale = z2;
            }
            fWidth = this.scaleX;
            fHeight = this.scaleY;
            z2 = this.needScale;
        }
        if (!z2) {
            canvas.drawBitmap(this.renderingBitmap, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(fWidth, fHeight);
        canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public final void finalize() throws Throwable {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
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
        int i = this.generateCacheFramePointer;
        if (i >= rLottieNative.mMetaData[0]) {
            return 0;
        }
        int i2 = this.shouldLimitFps ? 2 : 1;
        if (rLottieNative.getFrame(i, bitmap, true) != -5) {
            this.generateCacheFramePointer += i2;
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

    public boolean ignoreScheduleNextGetFrame() {
        return this.renderingBitmap != null && this.metaData[0] == 1;
    }

    public final void invalidateInternal() {
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

    public final boolean isGeneratingCache() {
        return this.cacheGenerateTask != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public final boolean isLastFrame() {
        return this.currentFrame == this.metaData[0] - 1;
    }

    @Override
    public final boolean isRunning() {
        return this.isRunning;
    }

    public int loadFrameRunnableImpl() {
        boolean z;
        int i;
        RLottieNative rLottieNativeCreateFromRawJson;
        int frame;
        BitmapsCache bitmapsCache;
        if (this.isRecycled) {
            return 3;
        }
        if (canLoadFrames$1()) {
            if (this.nativePtr == null && this.pendingNativeInit) {
                String res = AndroidUtilities.readRes(this.args.resId);
                if (!TextUtils.isEmpty(res)) {
                    NativePtrArgs nativePtrArgs = this.args;
                    this.nativePtr = RLottieNative.createFromRawJson(res, nativePtrArgs.name, this.metaData, nativePtrArgs.colorReplacement, this.layerColors);
                    this.pendingNativeInit = false;
                }
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
                RLottieNative rLottieNative = this.nativePtr;
                if (rLottieNative == null) {
                    i = 2;
                } else {
                    try {
                        if (this.pendingColorUpdates.isEmpty() && this.pendingReplaceColors == null) {
                            i = 2;
                        } else {
                            this.layerColors.putAll(this.pendingColorUpdates);
                            int[] iArr = this.pendingReplaceColors;
                            if (iArr != null) {
                                this.args.colorReplacement = (int[]) iArr.clone();
                            }
                            NativePtrArgs nativePtrArgs2 = this.args;
                            File file = nativePtrArgs2.file;
                            try {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    NativePtrArgs nativePtrArgs3 = this.args;
                                    i = 2;
                                    rLottieNativeCreateFromRawJson = RLottieNative.createFromFile(absolutePath, nativePtrArgs3.json, this.width, this.height, this.metaData, false, nativePtrArgs3.colorReplacement, this.shouldLimitFps, nativePtrArgs3.fitzModifier, this.layerColors);
                                } else {
                                    i = 2;
                                    int i2 = nativePtrArgs2.resId;
                                    if (i2 == 0 || nativePtrArgs2.json != null) {
                                        rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(nativePtrArgs2.json, nativePtrArgs2.name, this.metaData, nativePtrArgs2.colorReplacement, this.layerColors);
                                    } else {
                                        String res2 = AndroidUtilities.readRes(i2);
                                        if (!TextUtils.isEmpty(res2)) {
                                            NativePtrArgs nativePtrArgs4 = this.args;
                                            nativePtrArgs4.json = res2;
                                            rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res2, nativePtrArgs4.name, this.metaData, nativePtrArgs4.colorReplacement, this.layerColors);
                                        }
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
                    } catch (Exception unused2) {
                    }
                }
                try {
                    RLottieNative rLottieNative2 = this.nativePtr;
                    int i3 = this.shouldLimitFps ? 2 : 1;
                    if (!this.precache || (bitmapsCache = this.bitmapsCache) == null) {
                        frame = rLottieNative2.getFrame(this.currentFrame, this.backgroundBitmap, z);
                    } else {
                        try {
                            frame = bitmapsCache.getFrame(this.backgroundBitmap, this.currentFrame / i3);
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
                                NativePtrArgs nativePtrArgs5 = this.args;
                                this.nativePtr = RLottieNative.createFromFile(string, nativePtrArgs5.json, this.width, this.height, null, false, nativePtrArgs5.colorReplacement, false, nativePtrArgs5.fitzModifier, this.layerColors);
                            }
                            if (this.nativePtr != null) {
                                frame = this.nativePtr.getFrame(this.currentFrame, this.backgroundBitmap, z);
                            }
                        }
                    }
                    if (frame < 0) {
                        return i;
                    }
                    this.nextRenderingBitmap = this.backgroundBitmap;
                    int i4 = this.customEndFrame;
                    if (i4 < 0 || !this.playInDirectionOfCustomEndFrame) {
                        int i5 = this.currentFrame + i3;
                        if (i4 < 0) {
                            i4 = this.metaData[0];
                        }
                        if (i5 >= i4) {
                            int i6 = this.autoRepeat;
                            if (i6 == 1) {
                                this.currentFrame = 0;
                                this.nextFrameIsLast = false;
                                if (this.resetVibrationAfterRestart) {
                                    this.vibrationPattern = null;
                                    this.resetVibrationAfterRestart = false;
                                }
                                int i7 = this.autoRepeatCount;
                                if (i7 > 0) {
                                    this.autoRepeatCount = i7 - 1;
                                }
                            } else if (i6 == 2) {
                                this.currentFrame = 0;
                                this.nextFrameIsLast = true;
                                this.autoRepeatPlayCount++;
                                if (this.resetVibrationAfterRestart) {
                                    this.vibrationPattern = null;
                                    this.resetVibrationAfterRestart = false;
                                }
                            } else {
                                this.nextFrameIsLast = true;
                                Runnable runnable = this.onAnimationEndListener;
                                if (runnable != null) {
                                    runnable.run();
                                    this.onAnimationEndListener = null;
                                }
                            }
                        } else if (this.autoRepeat == 3) {
                            this.nextFrameIsLast = true;
                            this.autoRepeatPlayCount++;
                        } else {
                            this.currentFrame = i5;
                            this.nextFrameIsLast = false;
                        }
                    } else {
                        int i8 = this.currentFrame;
                        if (i8 > i4) {
                            int i9 = i8 - i3;
                            if (i9 >= i4) {
                                this.currentFrame = i9;
                                this.nextFrameIsLast = false;
                            } else {
                                this.nextFrameIsLast = true;
                                Runnable runnable2 = this.onAnimationEndListener;
                                if (runnable2 != null) {
                                    runnable2.run();
                                    this.onAnimationEndListener = null;
                                }
                            }
                        } else {
                            int i10 = i8 + i3;
                            if (i10 < i4) {
                                this.currentFrame = i10;
                                this.nextFrameIsLast = false;
                            } else {
                                this.nextFrameIsLast = true;
                                Runnable runnable3 = this.onAnimationEndListener;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    this.onAnimationEndListener = null;
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    @Override
    public final void prepareForGenerateCache() {
        File file;
        NativePtrArgs nativePtrArgs = this.args;
        File file2 = nativePtrArgs.file;
        RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(file2 != null ? file2.toString() : null, nativePtrArgs.json, this.width, this.height, this.createdForFirstFrame ? this.metaData : null, false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier, this.layerColors);
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
        checkChoreographer$1();
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
            PasscodeView$9$$ExternalSyntheticLambda0 passcodeView$9$$ExternalSyntheticLambda0 = new PasscodeView$9$$ExternalSyntheticLambda0(rLottieNative, 27);
            if (z) {
                DispatchQueuePoolBackground.execute(passcodeView$9$$ExternalSyntheticLambda0);
            } else {
                Utilities.globalQueue.postRunnable(passcodeView$9$$ExternalSyntheticLambda0);
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
        ArrayList arrayList = this.parentViews;
        arrayList.remove(imageReceiver);
        if (this.bitmapsCache == null || lottieCacheGenerateQueue == null || this.cacheGenerateTask == null || !arrayList.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.masterParent;
        if (view == null || !view.isAttachedToWindow()) {
            ChatActionCell$$ExternalSyntheticLambda14 chatActionCell$$ExternalSyntheticLambda14 = this.cacheGenerateTask;
            if (chatActionCell$$ExternalSyntheticLambda14 != null) {
                lottieCacheGenerateQueue.cancelRunnable(chatActionCell$$ExternalSyntheticLambda14);
                BitmapsCache.decrementTaskCounter();
                this.cacheGenerateTask = null;
            }
            this.generatingCache = false;
            this.genCacheSend = false;
        }
    }

    public final void requestRedrawColors() {
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

    public final boolean restart(boolean z) {
        if (!z && ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.autoRepeatCount < 0)) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.autoRepeat = 2;
        start();
        return true;
    }

    public final boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || !canLoadFrames$1() || ignoreScheduleNextGetFrame() || this.destroyWhenDone || this.isRecycled) {
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

    public final void setAutoRepeat(int i) {
        if (this.autoRepeat == 2 && i == 3 && this.currentFrame != 0) {
            return;
        }
        this.autoRepeat = i;
    }

    public final void setCurrentFrame() {
        setCurrentFrame(85, false, false);
    }

    public final boolean setCustomEndFrame(int i) {
        if (this.customEndFrame == i || i > this.metaData[0]) {
            return false;
        }
        this.customEndFrame = i;
        return true;
    }

    public final void setLayerColor(int i, String str) {
        OKLCH.m(i, this.newColorUpdates, str, this);
    }

    public final void setOnFinishCallback(int i, Runnable runnable) {
        if (runnable != null) {
            this.onFinishCallback = new WeakReference(runnable);
            this.finishFrame = i;
        } else if (this.onFinishCallback != null) {
            this.onFinishCallback = null;
        }
    }

    public final void setProgress(float f, boolean z) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        setCurrentFrame((int) (this.metaData[0] * f), z, false);
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
            checkChoreographer$1();
        }
    }

    @Override
    public final void stop() {
        this.isRunning = false;
        checkChoreographer$1();
    }

    public final void updateCurrentFrame(long j) {
        Integer num;
        this.ticksWithoutDraw = 0;
        if (this.isPaused) {
            this.isPaused = false;
            checkChoreographer$1();
        }
        if (j == 0) {
            System.currentTimeMillis();
        }
        boolean z = this.swapBuffersAllowedByChoreographer || (!this.isRunning && this.decodeSingleFrame);
        if (!this.isRunning) {
            if ((this.forceFrameRedraw || (this.decodeSingleFrame && z)) && this.nextRenderingBitmap != null) {
                setCurrentFrame(true);
                return;
            }
            return;
        }
        if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
            scheduleNextGetFrame();
            return;
        }
        if (this.nextRenderingBitmap != null) {
            if (this.renderingBitmap == null || (z && !this.skipFrameUpdate)) {
                HashMap map = this.vibrationPattern;
                if (map != null && this.allowVibration && (num = (Integer) map.get(Integer.valueOf(this.currentFrame - 1))) != null) {
                    try {
                        Activity activity = LaunchActivity.instance;
                        if (activity == null) {
                            activity = BubbleActivity.instance;
                        }
                        activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    } catch (Exception unused) {
                    }
                }
                setCurrentFrame(false);
            }
        }
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
                checkChoreographer$1();
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

    public final void setCurrentFrame(boolean z) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.backgroundBitmap = this.renderingBitmap;
        this.renderingBitmap = this.nextRenderingBitmap;
        this.nextRenderingBitmap = null;
        this.swapBuffersAllowedByChoreographer = false;
        if (this.isDice == 2 && (weakReference2 = this.onFinishCallback) != null && this.currentFrame - 1 >= this.finishFrame) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.onFinishCallback = null;
        }
        if (this.nextFrameIsLast || (this.autoRepeatCount == 0 && this.autoRepeat == 1)) {
            this.isRunning = false;
            checkChoreographer$1();
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

    public RLottieDrawable(int i, int i2) {
        this.metaData = new int[3];
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.layerColors = new HashMap();
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
        this.uiRunnableNoFrame = new ChatActionCell$$ExternalSyntheticLambda14(this, 2);
        this.uiRunnable = new ChatActionCell$$ExternalSyntheticLambda14(this, 4);
        this.uiRunnableGenerateCache = new ChatActionCell$$ExternalSyntheticLambda14(this, 5);
        this.uiRunnableCacheFinished = new ChatActionCell$$ExternalSyntheticLambda14(this, 6);
        this.loadFrameRunnable = new ChatActionCell$$ExternalSyntheticLambda14(this, 7);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda5(this, 0);
        this.width = i;
        this.height = i2;
        this.isSingleChannel = false;
    }

    public RLottieDrawable(int i, int i2, String str, int i3) {
        this(i, str, i2, i3, true, null);
    }

    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        HashMap map = new HashMap();
        this.layerColors = map;
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
        this.uiRunnableNoFrame = new ChatActionCell$$ExternalSyntheticLambda14(this, 2);
        this.uiRunnable = new ChatActionCell$$ExternalSyntheticLambda14(this, 4);
        this.uiRunnableGenerateCache = new ChatActionCell$$ExternalSyntheticLambda14(this, 5);
        this.uiRunnableCacheFinished = new ChatActionCell$$ExternalSyntheticLambda14(this, 6);
        this.loadFrameRunnable = new ChatActionCell$$ExternalSyntheticLambda14(this, 7);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda5(this, 0);
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
            nativePtrArgs.resId = i;
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
                nativePtrArgs.json = res;
                this.nativePtr = RLottieNative.createFromRawJson(res, str, iArr2, nativePtrArgs.colorReplacement, map);
            }
        }
        if (this.isSingleChannel) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            this.decodeSingleFrame = true;
            scheduleNextGetFrame();
        }
    }
}
