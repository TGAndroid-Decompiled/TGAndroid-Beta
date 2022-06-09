package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.DispatchQueuePool;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieDrawable;

public class RLottieDrawable extends BitmapDrawable implements Animatable {
    private static ThreadPoolExecutor lottieCacheGenerateQueue;
    private boolean applyTransformation;
    private boolean applyingLayerColors;
    protected int autoRepeat;
    protected int autoRepeatPlayCount;
    protected volatile Bitmap backgroundBitmap;
    File cacheFile;
    protected Runnable cacheGenerateTask;
    protected int currentFrame;
    private View currentParentView;
    protected int customEndFrame;
    private boolean decodeSingleFrame;
    protected boolean destroyAfterLoading;
    protected boolean destroyWhenDone;
    protected int diceSwitchFramesCount;
    private boolean doNotRemoveInvalidOnFrameReady;
    private final Rect dstRect;
    private int finishFrame;
    private boolean forceFrameRedraw;
    protected CountDownLatch frameWaitSync;
    protected int height;
    private boolean invalidateOnProgressSet;
    protected int isDice;
    private boolean isInvalid;
    protected volatile boolean isRecycled;
    protected volatile boolean isRunning;
    private long lastFrameTime;
    protected Runnable loadFrameRunnable;
    protected Runnable loadFrameTask;
    protected boolean loadingInBackground;
    protected final int[] metaData;
    protected volatile long nativePtr;
    private boolean needScale;
    private HashMap<String, Integer> newColorUpdates;
    private int[] newReplaceColors;
    protected volatile boolean nextFrameIsLast;
    protected volatile Bitmap nextRenderingBitmap;
    private Runnable onAnimationEndListener;
    protected WeakReference<Runnable> onFinishCallback;
    private Runnable onFrameReadyRunnable;
    private ArrayList<WeakReference<View>> parentViews;
    private volatile HashMap<String, Integer> pendingColorUpdates;
    private int[] pendingReplaceColors;
    protected boolean playInDirectionOfCustomEndFrame;
    protected volatile Bitmap renderingBitmap;
    private float scaleX;
    private float scaleY;
    protected int secondFramesCount;
    protected boolean secondLoadingInBackground;
    protected volatile long secondNativePtr;
    protected volatile boolean setLastFrame;
    private boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    long startTime;
    protected int timeBetweenFrames;
    protected Runnable uiRunnable;
    private Runnable uiRunnableCacheFinished;
    private Runnable uiRunnableGenerateCache;
    protected Runnable uiRunnableNoFrame;
    private HashMap<Integer, Integer> vibrationPattern;
    protected boolean waitingForNextTask;
    protected int width;
    protected static final Handler uiHandler = new Handler(Looper.getMainLooper());
    private static ThreadLocal<byte[]> readBufferLocal = new ThreadLocal<>();
    private static ThreadLocal<byte[]> bufferLocal = new ThreadLocal<>();
    private static DispatchQueuePool loadFrameRunnableQueue = new DispatchQueuePool(4);
    private static HashSet<String> generatingCacheFiles = new HashSet<>();

    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    public static native void createCache(long j, int i, int i2);

    public static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    public static native void destroy(long j);

    private static native String getCacheFile(long j);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    public static native void replaceColors(long j, int[] iArr);

    public static native void setLayerColor(long j, String str, int i);

    @Override
    public int getOpacity() {
        return -2;
    }

    public class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override
        public void run() {
            if (!RLottieDrawable.this.isRecycled) {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                if (!rLottieDrawable.destroyWhenDone && rLottieDrawable.nativePtr != 0) {
                    RLottieDrawable.this.startTime = System.currentTimeMillis();
                    ThreadPoolExecutor threadPoolExecutor = RLottieDrawable.lottieCacheGenerateQueue;
                    RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                    Runnable rLottieDrawable$4$$ExternalSyntheticLambda0 = new Runnable() {
                        @Override
                        public final void run() {
                            RLottieDrawable.AnonymousClass4.this.lambda$run$0();
                        }
                    };
                    rLottieDrawable2.cacheGenerateTask = rLottieDrawable$4$$ExternalSyntheticLambda0;
                    threadPoolExecutor.execute(rLottieDrawable$4$$ExternalSyntheticLambda0);
                }
            }
        }

        public void lambda$run$0() {
            long j = RLottieDrawable.this.nativePtr;
            RLottieDrawable rLottieDrawable = RLottieDrawable.this;
            RLottieDrawable.createCache(j, rLottieDrawable.width, rLottieDrawable.height);
            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableCacheFinished);
        }
    }

    public void checkRunningTasks() {
        Runnable runnable = this.cacheGenerateTask;
        if (runnable != null && lottieCacheGenerateQueue.remove(runnable)) {
            this.cacheGenerateTask = null;
        }
        if (!hasParentView() && this.nextRenderingBitmap != null && this.loadFrameTask != null) {
            this.loadFrameTask = null;
            this.nextRenderingBitmap = null;
        }
    }

    protected void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null && this.cacheGenerateTask == null && this.nativePtr != 0) {
                destroy(this.nativePtr);
                this.nativePtr = 0L;
                if (this.secondNativePtr != 0) {
                    destroy(this.secondNativePtr);
                    this.secondNativePtr = 0L;
                }
            }
        }
        if (this.nativePtr == 0 && this.secondNativePtr == 0) {
            recycleResources();
            return;
        }
        this.waitingForNextTask = true;
        if (!hasParentView()) {
            stop();
        }
        scheduleNextGetFrame();
    }

    public void recycleResources() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.renderingBitmap);
        arrayList.add(this.nextRenderingBitmap);
        this.renderingBitmap = null;
        this.backgroundBitmap = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.onAnimationEndListener != null) {
            this.onAnimationEndListener = null;
        }
        invalidateInternal();
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.onFinishCallback = new WeakReference<>(runnable);
            this.finishFrame = i;
        } else if (this.onFinishCallback != null) {
            this.onFinishCallback = null;
        }
    }

    public RLottieDrawable(File file, int i, int i2, boolean z, boolean z2, int[] iArr, int i3) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.isRunning = false;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCache = new AnonymousClass4();
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.cacheGenerateTask = null;
                RLottieDrawable.generatingCacheFiles.remove(RLottieDrawable.this.cacheFile.getPath());
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public void run() {
                long j;
                if (!RLottieDrawable.this.isRecycled) {
                    if (RLottieDrawable.this.nativePtr != 0) {
                        RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                        if (!(rLottieDrawable.isDice == 2 && rLottieDrawable.secondNativePtr == 0)) {
                            if (RLottieDrawable.this.backgroundBitmap == null) {
                                try {
                                    RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                    rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                } catch (Throwable th) {
                                    FileLog.e(th);
                                }
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieDrawable.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null) {
                                    RLottieDrawable.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    long j2 = j;
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    int i5 = rLottieDrawable5.currentFrame;
                                    Bitmap bitmap = rLottieDrawable5.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                    if (RLottieDrawable.getFrame(j2, i5, bitmap, rLottieDrawable6.width, rLottieDrawable6.height, rLottieDrawable6.backgroundBitmap.getRowBytes(), true) == -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch != null) {
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                    if (rLottieDrawable7.metaData[2] != 0) {
                                        RLottieDrawable.uiHandler.post(rLottieDrawable7.uiRunnableGenerateCache);
                                        RLottieDrawable.this.metaData[2] = 0;
                                    }
                                    RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                    rLottieDrawable8.nextRenderingBitmap = rLottieDrawable8.backgroundBitmap;
                                    int i6 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    int i7 = rLottieDrawable9.isDice;
                                    if (i7 == 1) {
                                        int i8 = rLottieDrawable9.currentFrame;
                                        int i9 = i8 + i6;
                                        int i10 = rLottieDrawable9.diceSwitchFramesCount;
                                        if (i10 == -1) {
                                            i10 = rLottieDrawable9.metaData[0];
                                        }
                                        if (i9 < i10) {
                                            rLottieDrawable9.currentFrame = i8 + i6;
                                        } else {
                                            rLottieDrawable9.currentFrame = 0;
                                            rLottieDrawable9.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                        }
                                    } else if (i7 == 2) {
                                        int i11 = rLottieDrawable9.currentFrame;
                                        if (i11 + i6 < rLottieDrawable9.secondFramesCount) {
                                            rLottieDrawable9.currentFrame = i11 + i6;
                                        } else {
                                            rLottieDrawable9.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i12 = rLottieDrawable9.customEndFrame;
                                        if (i12 < 0 || !rLottieDrawable9.playInDirectionOfCustomEndFrame) {
                                            int i13 = rLottieDrawable9.currentFrame;
                                            int i14 = i13 + i6;
                                            if (i12 < 0) {
                                                i12 = rLottieDrawable9.metaData[0];
                                            }
                                            if (i14 >= i12) {
                                                int i15 = rLottieDrawable9.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else if (i15 == 2) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (rLottieDrawable9.autoRepeat == 3) {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.autoRepeatPlayCount++;
                                            } else {
                                                rLottieDrawable9.currentFrame = i13 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            }
                                        } else {
                                            int i16 = rLottieDrawable9.currentFrame;
                                            if (i16 > i12) {
                                                if (i16 - i6 >= i12) {
                                                    rLottieDrawable9.currentFrame = i16 - i6;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (i16 + i6 < i12) {
                                                rLottieDrawable9.currentFrame = i16 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            } else {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch2 != null) {
                                countDownLatch2.countDown();
                                return;
                            }
                            return;
                        }
                    }
                    CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                    if (countDownLatch3 != null) {
                        countDownLatch3.countDown();
                    }
                    RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                }
            }
        };
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z2;
        getPaint().setFlags(2);
        this.nativePtr = create(file.getAbsolutePath(), null, i, i2, iArr2, z, iArr, this.shouldLimitFps, i3);
        if (z && lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        if (this.nativePtr == 0) {
            file.delete();
        }
        String cacheFile = getCacheFile(this.nativePtr);
        if (cacheFile != null) {
            this.cacheFile = new File(cacheFile);
        }
        if (this.shouldLimitFps && iArr2[1] < 60) {
            this.shouldLimitFps = false;
        }
        this.timeBetweenFrames = Math.max(this.shouldLimitFps ? 33 : 16, (int) (1000.0f / iArr2[1]));
    }

    public RLottieDrawable(File file, String str, int i, int i2, boolean z, boolean z2, int[] iArr, int i3) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.isRunning = false;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCache = new AnonymousClass4();
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.cacheGenerateTask = null;
                RLottieDrawable.generatingCacheFiles.remove(RLottieDrawable.this.cacheFile.getPath());
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public void run() {
                long j;
                if (!RLottieDrawable.this.isRecycled) {
                    if (RLottieDrawable.this.nativePtr != 0) {
                        RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                        if (!(rLottieDrawable.isDice == 2 && rLottieDrawable.secondNativePtr == 0)) {
                            if (RLottieDrawable.this.backgroundBitmap == null) {
                                try {
                                    RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                    rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                } catch (Throwable th) {
                                    FileLog.e(th);
                                }
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieDrawable.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null) {
                                    RLottieDrawable.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    long j2 = j;
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    int i5 = rLottieDrawable5.currentFrame;
                                    Bitmap bitmap = rLottieDrawable5.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                    if (RLottieDrawable.getFrame(j2, i5, bitmap, rLottieDrawable6.width, rLottieDrawable6.height, rLottieDrawable6.backgroundBitmap.getRowBytes(), true) == -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch != null) {
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                    if (rLottieDrawable7.metaData[2] != 0) {
                                        RLottieDrawable.uiHandler.post(rLottieDrawable7.uiRunnableGenerateCache);
                                        RLottieDrawable.this.metaData[2] = 0;
                                    }
                                    RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                    rLottieDrawable8.nextRenderingBitmap = rLottieDrawable8.backgroundBitmap;
                                    int i6 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    int i7 = rLottieDrawable9.isDice;
                                    if (i7 == 1) {
                                        int i8 = rLottieDrawable9.currentFrame;
                                        int i9 = i8 + i6;
                                        int i10 = rLottieDrawable9.diceSwitchFramesCount;
                                        if (i10 == -1) {
                                            i10 = rLottieDrawable9.metaData[0];
                                        }
                                        if (i9 < i10) {
                                            rLottieDrawable9.currentFrame = i8 + i6;
                                        } else {
                                            rLottieDrawable9.currentFrame = 0;
                                            rLottieDrawable9.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                        }
                                    } else if (i7 == 2) {
                                        int i11 = rLottieDrawable9.currentFrame;
                                        if (i11 + i6 < rLottieDrawable9.secondFramesCount) {
                                            rLottieDrawable9.currentFrame = i11 + i6;
                                        } else {
                                            rLottieDrawable9.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i12 = rLottieDrawable9.customEndFrame;
                                        if (i12 < 0 || !rLottieDrawable9.playInDirectionOfCustomEndFrame) {
                                            int i13 = rLottieDrawable9.currentFrame;
                                            int i14 = i13 + i6;
                                            if (i12 < 0) {
                                                i12 = rLottieDrawable9.metaData[0];
                                            }
                                            if (i14 >= i12) {
                                                int i15 = rLottieDrawable9.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else if (i15 == 2) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (rLottieDrawable9.autoRepeat == 3) {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.autoRepeatPlayCount++;
                                            } else {
                                                rLottieDrawable9.currentFrame = i13 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            }
                                        } else {
                                            int i16 = rLottieDrawable9.currentFrame;
                                            if (i16 > i12) {
                                                if (i16 - i6 >= i12) {
                                                    rLottieDrawable9.currentFrame = i16 - i6;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (i16 + i6 < i12) {
                                                rLottieDrawable9.currentFrame = i16 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            } else {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch2 != null) {
                                countDownLatch2.countDown();
                                return;
                            }
                            return;
                        }
                    }
                    CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                    if (countDownLatch3 != null) {
                        countDownLatch3.countDown();
                    }
                    RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                }
            }
        };
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z2;
        getPaint().setFlags(2);
        this.nativePtr = create(file.getAbsolutePath(), str, i, i2, iArr2, z, iArr, this.shouldLimitFps, i3);
        if (z && lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        if (this.nativePtr == 0) {
            file.delete();
        }
        if (this.shouldLimitFps && iArr2[1] < 60) {
            this.shouldLimitFps = false;
        }
        this.timeBetweenFrames = Math.max(this.shouldLimitFps ? 33 : 16, (int) (1000.0f / iArr2[1]));
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, null);
    }

    public RLottieDrawable(String str, int i, int i2) {
        String str2;
        int[] iArr = new int[3];
        this.metaData = iArr;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.isRunning = false;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCache = new AnonymousClass4();
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.cacheGenerateTask = null;
                RLottieDrawable.generatingCacheFiles.remove(RLottieDrawable.this.cacheFile.getPath());
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public void run() {
                long j;
                if (!RLottieDrawable.this.isRecycled) {
                    if (RLottieDrawable.this.nativePtr != 0) {
                        RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                        if (!(rLottieDrawable.isDice == 2 && rLottieDrawable.secondNativePtr == 0)) {
                            if (RLottieDrawable.this.backgroundBitmap == null) {
                                try {
                                    RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                    rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                } catch (Throwable th) {
                                    FileLog.e(th);
                                }
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieDrawable.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null) {
                                    RLottieDrawable.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    long j2 = j;
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    int i5 = rLottieDrawable5.currentFrame;
                                    Bitmap bitmap = rLottieDrawable5.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                    if (RLottieDrawable.getFrame(j2, i5, bitmap, rLottieDrawable6.width, rLottieDrawable6.height, rLottieDrawable6.backgroundBitmap.getRowBytes(), true) == -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch != null) {
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                    if (rLottieDrawable7.metaData[2] != 0) {
                                        RLottieDrawable.uiHandler.post(rLottieDrawable7.uiRunnableGenerateCache);
                                        RLottieDrawable.this.metaData[2] = 0;
                                    }
                                    RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                    rLottieDrawable8.nextRenderingBitmap = rLottieDrawable8.backgroundBitmap;
                                    int i6 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    int i7 = rLottieDrawable9.isDice;
                                    if (i7 == 1) {
                                        int i8 = rLottieDrawable9.currentFrame;
                                        int i9 = i8 + i6;
                                        int i10 = rLottieDrawable9.diceSwitchFramesCount;
                                        if (i10 == -1) {
                                            i10 = rLottieDrawable9.metaData[0];
                                        }
                                        if (i9 < i10) {
                                            rLottieDrawable9.currentFrame = i8 + i6;
                                        } else {
                                            rLottieDrawable9.currentFrame = 0;
                                            rLottieDrawable9.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                        }
                                    } else if (i7 == 2) {
                                        int i11 = rLottieDrawable9.currentFrame;
                                        if (i11 + i6 < rLottieDrawable9.secondFramesCount) {
                                            rLottieDrawable9.currentFrame = i11 + i6;
                                        } else {
                                            rLottieDrawable9.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i12 = rLottieDrawable9.customEndFrame;
                                        if (i12 < 0 || !rLottieDrawable9.playInDirectionOfCustomEndFrame) {
                                            int i13 = rLottieDrawable9.currentFrame;
                                            int i14 = i13 + i6;
                                            if (i12 < 0) {
                                                i12 = rLottieDrawable9.metaData[0];
                                            }
                                            if (i14 >= i12) {
                                                int i15 = rLottieDrawable9.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else if (i15 == 2) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (rLottieDrawable9.autoRepeat == 3) {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.autoRepeatPlayCount++;
                                            } else {
                                                rLottieDrawable9.currentFrame = i13 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            }
                                        } else {
                                            int i16 = rLottieDrawable9.currentFrame;
                                            if (i16 > i12) {
                                                if (i16 - i6 >= i12) {
                                                    rLottieDrawable9.currentFrame = i16 - i6;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (i16 + i6 < i12) {
                                                rLottieDrawable9.currentFrame = i16 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            } else {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch2 != null) {
                                countDownLatch2.countDown();
                                return;
                            }
                            return;
                        }
                    }
                    CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                    if (countDownLatch3 != null) {
                        countDownLatch3.countDown();
                    }
                    RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                }
            }
        };
        this.width = i;
        this.height = i2;
        this.isDice = 1;
        if ("🎲".equals(str)) {
            str2 = readRes(null, R.raw.diceloop);
            this.diceSwitchFramesCount = 60;
        } else {
            str2 = "🎯".equals(str) ? readRes(null, R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(str2)) {
            this.timeBetweenFrames = 16;
            return;
        }
        this.nativePtr = createWithJson(str2, "dice", iArr, null);
        this.timeBetweenFrames = Math.max(16, (int) (1000.0f / iArr[1]));
    }

    public void checkDispatchOnAnimationEnd() {
        Runnable runnable = this.onAnimationEndListener;
        if (runnable != null) {
            runnable.run();
            this.onAnimationEndListener = null;
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.onAnimationEndListener = runnable;
    }

    public boolean setBaseDice(File file) {
        if (this.nativePtr == 0 && !this.loadingInBackground) {
            final String readRes = readRes(file, 0);
            if (TextUtils.isEmpty(readRes)) {
                return false;
            }
            this.loadingInBackground = true;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    RLottieDrawable.this.lambda$setBaseDice$1(readRes);
                }
            });
        }
        return true;
    }

    public void lambda$setBaseDice$1(String str) {
        this.nativePtr = createWithJson(str, "dice", this.metaData, null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                RLottieDrawable.this.lambda$setBaseDice$0();
            }
        });
    }

    public void lambda$setBaseDice$0() {
        this.loadingInBackground = false;
        if (this.secondLoadingInBackground || !this.destroyAfterLoading) {
            this.timeBetweenFrames = Math.max(16, (int) (1000.0f / this.metaData[1]));
            scheduleNextGetFrame();
            invalidateInternal();
            return;
        }
        recycle();
    }

    public boolean hasBaseDice() {
        return this.nativePtr != 0 || this.loadingInBackground;
    }

    public boolean setDiceNumber(File file, boolean z) {
        if (this.secondNativePtr == 0 && !this.secondLoadingInBackground) {
            final String readRes = readRes(file, 0);
            if (TextUtils.isEmpty(readRes)) {
                return false;
            }
            if (z && this.nextRenderingBitmap == null && this.renderingBitmap == null && this.loadFrameTask == null) {
                this.isDice = 2;
                this.setLastFrame = true;
            }
            this.secondLoadingInBackground = true;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    RLottieDrawable.this.lambda$setDiceNumber$4(readRes);
                }
            });
        }
        return true;
    }

    public void lambda$setDiceNumber$4(String str) {
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    RLottieDrawable.this.lambda$setDiceNumber$2();
                }
            });
            return;
        }
        final int[] iArr = new int[3];
        this.secondNativePtr = createWithJson(str, "dice", iArr, null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                RLottieDrawable.this.lambda$setDiceNumber$3(iArr);
            }
        });
    }

    public void lambda$setDiceNumber$2() {
        this.secondLoadingInBackground = false;
        if (!this.loadingInBackground && this.destroyAfterLoading) {
            recycle();
        }
    }

    public void lambda$setDiceNumber$3(int[] iArr) {
        this.secondLoadingInBackground = false;
        if (this.destroyAfterLoading) {
            recycle();
            return;
        }
        this.secondFramesCount = iArr[0];
        this.timeBetweenFrames = Math.max(16, (int) (1000.0f / iArr[1]));
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.isRunning = false;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCache = new AnonymousClass4();
        this.uiRunnableCacheFinished = new Runnable() {
            @Override
            public void run() {
                RLottieDrawable.this.cacheGenerateTask = null;
                RLottieDrawable.generatingCacheFiles.remove(RLottieDrawable.this.cacheFile.getPath());
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.loadFrameRunnable = new Runnable() {
            @Override
            public void run() {
                long j;
                if (!RLottieDrawable.this.isRecycled) {
                    if (RLottieDrawable.this.nativePtr != 0) {
                        RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                        if (!(rLottieDrawable.isDice == 2 && rLottieDrawable.secondNativePtr == 0)) {
                            if (RLottieDrawable.this.backgroundBitmap == null) {
                                try {
                                    RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                    rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                } catch (Throwable th) {
                                    FileLog.e(th);
                                }
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieDrawable.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null) {
                                    RLottieDrawable.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    long j2 = j;
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    int i5 = rLottieDrawable5.currentFrame;
                                    Bitmap bitmap = rLottieDrawable5.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                    if (RLottieDrawable.getFrame(j2, i5, bitmap, rLottieDrawable6.width, rLottieDrawable6.height, rLottieDrawable6.backgroundBitmap.getRowBytes(), true) == -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch != null) {
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                    if (rLottieDrawable7.metaData[2] != 0) {
                                        RLottieDrawable.uiHandler.post(rLottieDrawable7.uiRunnableGenerateCache);
                                        RLottieDrawable.this.metaData[2] = 0;
                                    }
                                    RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                    rLottieDrawable8.nextRenderingBitmap = rLottieDrawable8.backgroundBitmap;
                                    int i6 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    int i7 = rLottieDrawable9.isDice;
                                    if (i7 == 1) {
                                        int i8 = rLottieDrawable9.currentFrame;
                                        int i9 = i8 + i6;
                                        int i10 = rLottieDrawable9.diceSwitchFramesCount;
                                        if (i10 == -1) {
                                            i10 = rLottieDrawable9.metaData[0];
                                        }
                                        if (i9 < i10) {
                                            rLottieDrawable9.currentFrame = i8 + i6;
                                        } else {
                                            rLottieDrawable9.currentFrame = 0;
                                            rLottieDrawable9.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                        }
                                    } else if (i7 == 2) {
                                        int i11 = rLottieDrawable9.currentFrame;
                                        if (i11 + i6 < rLottieDrawable9.secondFramesCount) {
                                            rLottieDrawable9.currentFrame = i11 + i6;
                                        } else {
                                            rLottieDrawable9.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i12 = rLottieDrawable9.customEndFrame;
                                        if (i12 < 0 || !rLottieDrawable9.playInDirectionOfCustomEndFrame) {
                                            int i13 = rLottieDrawable9.currentFrame;
                                            int i14 = i13 + i6;
                                            if (i12 < 0) {
                                                i12 = rLottieDrawable9.metaData[0];
                                            }
                                            if (i14 >= i12) {
                                                int i15 = rLottieDrawable9.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else if (i15 == 2) {
                                                    rLottieDrawable9.currentFrame = 0;
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (rLottieDrawable9.autoRepeat == 3) {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.autoRepeatPlayCount++;
                                            } else {
                                                rLottieDrawable9.currentFrame = i13 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            }
                                        } else {
                                            int i16 = rLottieDrawable9.currentFrame;
                                            if (i16 > i12) {
                                                if (i16 - i6 >= i12) {
                                                    rLottieDrawable9.currentFrame = i16 - i6;
                                                    rLottieDrawable9.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable9.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else if (i16 + i6 < i12) {
                                                rLottieDrawable9.currentFrame = i16 + i6;
                                                rLottieDrawable9.nextFrameIsLast = false;
                                            } else {
                                                rLottieDrawable9.nextFrameIsLast = true;
                                                RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch2 != null) {
                                countDownLatch2.countDown();
                                return;
                            }
                            return;
                        }
                    }
                    CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                    if (countDownLatch3 != null) {
                        countDownLatch3.countDown();
                    }
                    RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                }
            }
        };
        this.width = i2;
        this.height = i3;
        this.autoRepeat = 0;
        String readRes = readRes(null, i);
        if (!TextUtils.isEmpty(readRes)) {
            getPaint().setFlags(2);
            this.nativePtr = createWithJson(readRes, str, iArr2, iArr);
            this.timeBetweenFrames = Math.max(16, (int) (1000.0f / iArr2[1]));
            if (z) {
                setAllowDecodeSingleFrame(true);
            }
        }
    }

    public static String readRes(File file, int i) {
        InputStream inputStream;
        byte[] bArr = readBufferLocal.get();
        if (bArr == null) {
            bArr = new byte[CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT];
            readBufferLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = ApplicationLoader.applicationContext.getResources().openRawResource(i);
            }
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            byte[] bArr2 = bufferLocal.get();
            if (bArr2 == null) {
                bArr2 = new byte[4096];
                bufferLocal.set(bArr2);
            }
            int i2 = 0;
            while (true) {
                int read = inputStream.read(bArr2, 0, bArr2.length);
                if (read >= 0) {
                    int i3 = i2 + read;
                    if (bArr.length < i3) {
                        byte[] bArr3 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr3, 0, i2);
                        readBufferLocal.set(bArr3);
                        bArr = bArr3;
                    }
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i2, read);
                        i2 = i3;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            inputStream.close();
            return new String(bArr, 0, i2);
        } catch (Throwable unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        }
    }

    public int getCurrentFrame() {
        return this.currentFrame;
    }

    public int getCustomEndFrame() {
        return this.customEndFrame;
    }

    public long getDuration() {
        int[] iArr = this.metaData;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.playInDirectionOfCustomEndFrame = z;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.customEndFrame == i || i > this.metaData[0]) {
            return false;
        }
        this.customEndFrame = i;
        return true;
    }

    public int getFramesCount() {
        return this.metaData[0];
    }

    public void addParentView(View view) {
        if (view != null) {
            int size = this.parentViews.size();
            int i = 0;
            while (i < size) {
                if (this.parentViews.get(i).get() != view) {
                    if (this.parentViews.get(i).get() == null) {
                        this.parentViews.remove(i);
                        size--;
                        i--;
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.parentViews.add(0, new WeakReference<>(view));
        }
    }

    public void removeParentView(View view) {
        if (view != null) {
            int i = 0;
            int size = this.parentViews.size();
            while (i < size) {
                View view2 = this.parentViews.get(i).get();
                if (view2 == view || view2 == null) {
                    this.parentViews.remove(i);
                    size--;
                    i--;
                }
                i++;
            }
        }
    }

    public boolean hasParentView() {
        if (getCallback() != null) {
            return true;
        }
        for (int size = this.parentViews.size(); size > 0; size--) {
            if (this.parentViews.get(0).get() != null) {
                return true;
            }
            this.parentViews.remove(0);
        }
        return false;
    }

    public void invalidateInternal() {
        int size = this.parentViews.size();
        int i = 0;
        while (i < size) {
            View view = this.parentViews.get(i).get();
            if (view != null) {
                view.invalidate();
            } else {
                this.parentViews.remove(i);
                size--;
                i--;
            }
            i++;
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.decodeSingleFrame = z;
        if (z) {
            scheduleNextGetFrame();
        }
    }

    public void recycle() {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        if (this.loadingInBackground || this.secondLoadingInBackground) {
            this.destroyAfterLoading = true;
        } else if (this.loadFrameTask == null && this.cacheGenerateTask == null) {
            if (this.nativePtr != 0) {
                destroy(this.nativePtr);
                this.nativePtr = 0L;
            }
            if (this.secondNativePtr != 0) {
                destroy(this.secondNativePtr);
                this.secondNativePtr = 0L;
            }
            recycleResources();
        } else {
            this.destroyWhenDone = true;
        }
    }

    public void setAutoRepeat(int i) {
        if (this.autoRepeat != 2 || i != 3 || this.currentFrame == 0) {
            this.autoRepeat = i;
        }
    }

    protected void finalize() throws Throwable {
        try {
            recycle();
        } finally {
            super.finalize();
        }
    }

    @Override
    public void start() {
        if (this.isRunning) {
            return;
        }
        if ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.customEndFrame != this.currentFrame) {
            this.isRunning = true;
            if (this.invalidateOnProgressSet) {
                this.isInvalid = true;
                if (this.loadFrameTask != null) {
                    this.doNotRemoveInvalidOnFrameReady = true;
                }
            }
            scheduleNextGetFrame();
            invalidateInternal();
        }
    }

    public boolean restart() {
        if (this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.autoRepeat = 2;
        start();
        return true;
    }

    public void setVibrationPattern(HashMap<Integer, Integer> hashMap) {
        this.vibrationPattern = hashMap;
    }

    public void beginApplyLayerColors() {
        this.applyingLayerColors = true;
    }

    public void commitApplyLayerColors() {
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

    public void replaceColors(int[] iArr) {
        this.newReplaceColors = iArr;
        requestRedrawColors();
    }

    public void setLayerColor(String str, int i) {
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

    public boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || this.nativePtr == 0 || this.loadingInBackground || this.destroyWhenDone) {
            return false;
        }
        if (!this.isRunning) {
            boolean z = this.decodeSingleFrame;
            if (!z) {
                return false;
            }
            if (z && this.singleFrameDecoded) {
                return false;
            }
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
        DispatchQueuePool dispatchQueuePool = loadFrameRunnableQueue;
        Runnable runnable = this.loadFrameRunnable;
        this.loadFrameTask = runnable;
        dispatchQueuePool.execute(runnable);
        return true;
    }

    public boolean isHeavyDrawable() {
        return this.isDice == 0;
    }

    @Override
    public void stop() {
        this.isRunning = false;
    }

    public void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) {
        if (i >= 0 && i <= this.metaData[0]) {
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
    }

    public void setProgressMs(long j) {
        setCurrentFrame((int) ((Math.max(0L, j) / this.timeBetweenFrames) % this.metaData[0]), true, true);
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setProgress(float f, boolean z) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        setCurrentFrame((int) (this.metaData[0] * f), z);
    }

    public void setCurrentParentView(View view) {
        this.currentParentView = view;
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    private void setCurrentFrame(long j, long j2, long j3, boolean z) {
        WeakReference<Runnable> weakReference;
        Runnable runnable;
        WeakReference<Runnable> weakReference2;
        this.backgroundBitmap = this.renderingBitmap;
        this.renderingBitmap = this.nextRenderingBitmap;
        this.nextRenderingBitmap = null;
        if (this.isDice == 2 && (weakReference2 = this.onFinishCallback) != null && this.currentFrame - 1 >= this.finishFrame) {
            Runnable runnable2 = weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.onFinishCallback = null;
        }
        if (this.nextFrameIsLast) {
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
        if (AndroidUtilities.screenRefreshRate <= 60.0f) {
            this.lastFrameTime = j;
        } else {
            this.lastFrameTime = j - Math.min(16L, j2 - j3);
        }
        if (z && this.forceFrameRedraw) {
            this.singleFrameDecoded = false;
            this.forceFrameRedraw = false;
        }
        if (this.isDice == 0 && (weakReference = this.onFinishCallback) != null && this.currentFrame >= this.finishFrame && (runnable = weakReference.get()) != null) {
            runnable.run();
        }
        scheduleNextGetFrame();
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.nativePtr != 0 && !this.destroyWhenDone) {
            updateCurrentFrame();
            if (!this.isInvalid && this.renderingBitmap != null) {
                if (this.applyTransformation) {
                    this.dstRect.set(getBounds());
                    this.scaleX = this.dstRect.width() / this.width;
                    this.scaleY = this.dstRect.height() / this.height;
                    boolean z = false;
                    this.applyTransformation = false;
                    if (Math.abs(this.dstRect.width() - this.width) >= AndroidUtilities.dp(1.0f) || Math.abs(this.dstRect.width() - this.width) >= AndroidUtilities.dp(1.0f)) {
                        z = true;
                    }
                    this.needScale = z;
                }
                if (!this.needScale) {
                    Bitmap bitmap = this.renderingBitmap;
                    Rect rect = this.dstRect;
                    canvas.drawBitmap(bitmap, rect.left, rect.top, getPaint());
                } else {
                    canvas.save();
                    Rect rect2 = this.dstRect;
                    canvas.translate(rect2.left, rect2.top);
                    canvas.scale(this.scaleX, this.scaleY);
                    canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, getPaint());
                    canvas.restore();
                }
                if (this.isRunning) {
                    invalidateInternal();
                }
            }
        }
    }

    public void updateCurrentFrame() {
        int i;
        Integer num;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(elapsedRealtime - this.lastFrameTime);
        if (AndroidUtilities.screenRefreshRate <= 60.0f) {
            i = this.timeBetweenFrames - 6;
        } else {
            i = this.timeBetweenFrames;
        }
        if (this.isRunning) {
            if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
            } else if (this.nextRenderingBitmap == null) {
            } else {
                if (this.renderingBitmap == null || abs >= i) {
                    HashMap<Integer, Integer> hashMap = this.vibrationPattern;
                    if (!(hashMap == null || this.currentParentView == null || (num = hashMap.get(Integer.valueOf(this.currentFrame - 1))) == null)) {
                        this.currentParentView.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    }
                    setCurrentFrame(elapsedRealtime, abs, i, false);
                }
            }
        } else if ((this.forceFrameRedraw || (this.decodeSingleFrame && abs >= i)) && this.nextRenderingBitmap != null) {
            setCurrentFrame(elapsedRealtime, abs, i, true);
        }
    }

    @Override
    public int getMinimumHeight() {
        return this.height;
    }

    @Override
    public int getMinimumWidth() {
        return this.width;
    }

    public Bitmap getRenderingBitmap() {
        return this.renderingBitmap;
    }

    public Bitmap getBackgroundBitmap() {
        return this.backgroundBitmap;
    }

    public Bitmap getAnimatedBitmap() {
        if (this.renderingBitmap != null) {
            return this.renderingBitmap;
        }
        if (this.nextRenderingBitmap != null) {
            return this.nextRenderingBitmap;
        }
        return null;
    }

    public boolean hasBitmap() {
        return this.nativePtr != 0 && !(this.renderingBitmap == null && this.nextRenderingBitmap == null) && !this.isInvalid;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.invalidateOnProgressSet = z;
    }

    public boolean isGeneratingCache() {
        return this.cacheGenerateTask != null;
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.onFrameReadyRunnable = runnable;
    }

    public boolean isLastFrame() {
        return this.currentFrame == getFramesCount() - 1;
    }
}
