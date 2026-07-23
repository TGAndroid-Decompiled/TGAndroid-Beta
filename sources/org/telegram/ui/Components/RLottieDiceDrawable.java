package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;

public class RLottieDiceDrawable extends RLottieDrawable {
    protected boolean destroyAfterLoading;
    private int diceSwitchFramesCount;
    protected boolean loadingInBackground;
    private int secondFramesCount;
    protected boolean secondLoadingInBackground;
    protected volatile RLottieNative secondNativePtr;
    protected volatile boolean setLastFrame;

    @Override
    public boolean isHeavyDrawable() {
        return false;
    }

    public RLottieDiceDrawable(String str, int i, int i2) {
        String res;
        super(i, i2);
        this.diceSwitchFramesCount = -1;
        this.isDice = 1;
        if ("🎲".equals(str)) {
            res = AndroidUtilities.readRes(R.raw.diceloop);
            this.diceSwitchFramesCount = 60;
        } else {
            res = "🎯".equals(str) ? AndroidUtilities.readRes(R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(res)) {
            return;
        }
        this.nativePtr = RLottieNative.createFromRawJson(res, "dice", this.metaData, null);
    }

    public boolean hasBaseDice() {
        return this.nativePtr != null || this.loadingInBackground;
    }

    public boolean setDiceNumber(File file, boolean z) {
        if (this.secondNativePtr == null && !this.secondLoadingInBackground) {
            final String res = AndroidUtilities.readRes(file);
            if (TextUtils.isEmpty(res)) {
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
                    this.f$0.lambda$setDiceNumber$2(res);
                }
            });
        }
        return true;
    }

    public void lambda$setDiceNumber$2(String str) {
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws IOException {
                    this.f$0.lambda$setDiceNumber$0();
                }
            });
            return;
        }
        this.secondNativePtr = RLottieNative.createFromRawJson(str, "dice", null);
        final int frameCount = this.secondNativePtr != null ? this.secondNativePtr.getFrameCount() : 0;
        if (this.secondNativePtr != null) {
            this.secondNativePtr.getFps();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws IOException {
                this.f$0.lambda$setDiceNumber$1(frameCount);
            }
        });
    }

    public void lambda$setDiceNumber$0() throws IOException {
        this.secondLoadingInBackground = false;
        if (this.loadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    public void lambda$setDiceNumber$1(int i) throws IOException {
        this.secondLoadingInBackground = false;
        if (this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.secondFramesCount = i;
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public boolean isDiceRevealed() {
        int i = this.isDice;
        if (i == 1 || i != 2) {
            return false;
        }
        if (this.setLastFrame) {
            return true;
        }
        float progress = getProgress();
        if (this.secondNativePtr != null) {
            progress = this.currentFrame / this.secondFramesCount;
        }
        return progress > 0.95f;
    }

    public boolean setBaseDice(File file) {
        if (this.nativePtr == null && !this.loadingInBackground) {
            final String res = AndroidUtilities.readRes(file);
            if (TextUtils.isEmpty(res)) {
                return false;
            }
            this.loadingInBackground = true;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setBaseDice$4(res);
                }
            });
        }
        return true;
    }

    public void lambda$setBaseDice$4(String str) {
        this.nativePtr = RLottieNative.createFromRawJson(str, "dice", this.metaData, null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws IOException {
                this.f$0.lambda$setBaseDice$3();
            }
        });
    }

    public void lambda$setBaseDice$3() throws IOException {
        this.loadingInBackground = false;
        if (!this.secondLoadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        checkChoreographer();
        scheduleNextGetFrame();
        invalidateInternal();
    }

    @Override
    protected int loadFrameRunnableImpl() {
        boolean z;
        RLottieNative rLottieNative;
        if (this.isRecycled) {
            return 3;
        }
        if (this.nativePtr == null || (this.isDice == 2 && this.secondNativePtr == null)) {
            return 2;
        }
        if (this.backgroundBitmap == null) {
            try {
                this.backgroundBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
                z = false;
            } catch (Throwable th) {
                FileLog.e(th);
            }
        } else {
            z = true;
        }
        if (this.backgroundBitmap != null) {
            try {
                int i = this.isDice;
                if (i != 1 && i == 2) {
                    rLottieNative = this.secondNativePtr;
                    if (this.setLastFrame) {
                        this.currentFrame = this.secondFramesCount - 1;
                    }
                } else {
                    rLottieNative = this.nativePtr;
                }
                if (rLottieNative.getFrame(this.currentFrame, this.backgroundBitmap, z) < 0) {
                    return 2;
                }
                this.nextRenderingBitmap = this.backgroundBitmap;
                int i2 = this.isDice;
                if (i2 == 1) {
                    int i3 = this.currentFrame + 1;
                    int i4 = this.diceSwitchFramesCount;
                    if (i4 == -1) {
                        i4 = this.metaData[0];
                    }
                    if (i3 < i4) {
                        this.currentFrame = i3;
                    } else {
                        this.currentFrame = 0;
                        this.nextFrameIsLast = false;
                        if (this.secondNativePtr != null) {
                            this.isDice = 2;
                        }
                        if (this.resetVibrationAfterRestart) {
                            this.vibrationPattern = null;
                            this.resetVibrationAfterRestart = false;
                        }
                    }
                } else if (i2 == 2) {
                    int i5 = this.currentFrame + 1;
                    if (i5 < this.secondFramesCount) {
                        this.currentFrame = i5;
                    } else {
                        this.nextFrameIsLast = true;
                        this.autoRepeatPlayCount++;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 1;
    }

    @Override
    public void recycle(boolean z) throws IOException {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        checkChoreographer();
        if (this.loadingInBackground || this.secondLoadingInBackground) {
            this.destroyAfterLoading = true;
            return;
        }
        if (this.loadFrameTask == null && !this.generatingCache) {
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

    @Override
    protected void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null && this.nativePtr != null) {
                recycleNativePtr(true);
            }
        }
        if (this.nativePtr == null && this.secondNativePtr == null && this.bitmapsCache == null) {
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
    protected void recycleNativePtr(boolean z) {
        final RLottieNative rLottieNative = this.nativePtr;
        final RLottieNative rLottieNative2 = this.secondNativePtr;
        this.nativePtr = null;
        this.secondNativePtr = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                RLottieDiceDrawable.lambda$recycleNativePtr$5(rLottieNative, rLottieNative2);
            }
        };
        if (z) {
            DispatchQueuePoolBackground.execute(runnable);
        } else {
            Utilities.globalQueue.postRunnable(runnable);
        }
    }

    public static void lambda$recycleNativePtr$5(RLottieNative rLottieNative, RLottieNative rLottieNative2) {
        if (rLottieNative != null) {
            rLottieNative.recycle();
        }
        if (rLottieNative2 != null) {
            rLottieNative2.recycle();
        }
    }

    @Override
    protected boolean ignoreScheduleNextGetFrame() {
        return this.loadingInBackground;
    }
}
