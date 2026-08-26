package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
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

    public static void lambda$recycleNativePtr$5(RLottieNative rLottieNative, RLottieNative rLottieNative2) {
        if (rLottieNative != null) {
            rLottieNative.recycle();
        }
        if (rLottieNative2 != null) {
            rLottieNative2.recycle();
        }
    }

    public void lambda$setBaseDice$3() {
        this.loadingInBackground = false;
        if (!this.secondLoadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        checkChoreographer();
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public void lambda$setBaseDice$4(String str) {
        this.nativePtr = RLottieNative.createFromRawJson(str, "dice", this.metaData, null);
        AndroidUtilities.runOnUIThread(new RLottieDiceDrawable$$ExternalSyntheticLambda0(this, 0));
    }

    public void lambda$setDiceNumber$0() {
        this.secondLoadingInBackground = false;
        if (this.loadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    public void lambda$setDiceNumber$1(int i) {
        this.secondLoadingInBackground = false;
        if (this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.secondFramesCount = i;
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public void lambda$setDiceNumber$2(String str) {
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new RLottieDiceDrawable$$ExternalSyntheticLambda0(this, 1));
            return;
        }
        this.secondNativePtr = RLottieNative.createFromRawJson(str, "dice", null);
        int frameCount = this.secondNativePtr != null ? this.secondNativePtr.getFrameCount() : 0;
        if (this.secondNativePtr != null) {
            this.secondNativePtr.getFps();
        }
        AndroidUtilities.runOnUIThread(new EmojiView$$ExternalSyntheticLambda9(this, frameCount, 12));
    }

    @Override
    public void decodeFrameFinishedInternal() {
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

    public boolean hasBaseDice() {
        return this.nativePtr != null || this.loadingInBackground;
    }

    @Override
    public boolean ignoreScheduleNextGetFrame() {
        return this.loadingInBackground;
    }

    public boolean isDiceRevealed() {
        int i = this.isDice;
        if (i != 1 && i == 2) {
            if (this.setLastFrame) {
                return true;
            }
            float progress = getProgress();
            if (this.secondNativePtr != null) {
                progress = this.currentFrame / this.secondFramesCount;
            }
            if (progress > 0.95f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isHeavyDrawable() {
        return false;
    }

    @Override
    public int loadFrameRunnableImpl() {
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
                z = true;
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
    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        checkChoreographer();
        if (this.loadingInBackground || this.secondLoadingInBackground) {
            this.destroyAfterLoading = true;
            return;
        }
        if (this.loadFrameTask != null || this.generatingCache) {
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

    @Override
    public void recycleNativePtr(boolean z) {
        RLottieNative rLottieNative = this.nativePtr;
        RLottieNative rLottieNative2 = this.secondNativePtr;
        this.nativePtr = null;
        this.secondNativePtr = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        UndoView$$ExternalSyntheticLambda3 undoView$$ExternalSyntheticLambda3 = new UndoView$$ExternalSyntheticLambda3(9, rLottieNative, rLottieNative2);
        if (z) {
            DispatchQueuePoolBackground.execute(undoView$$ExternalSyntheticLambda3);
        } else {
            Utilities.globalQueue.postRunnable(undoView$$ExternalSyntheticLambda3);
        }
    }

    public boolean setBaseDice(File file) {
        if (this.nativePtr == null && !this.loadingInBackground) {
            String res = AndroidUtilities.readRes(file);
            if (TextUtils.isEmpty(res)) {
                return false;
            }
            this.loadingInBackground = true;
            Utilities.globalQueue.postRunnable(new RLottieDiceDrawable$$ExternalSyntheticLambda2(this, res, 1));
        }
        return true;
    }

    public boolean setDiceNumber(File file, boolean z) {
        if (this.secondNativePtr == null && !this.secondLoadingInBackground) {
            String res = AndroidUtilities.readRes(file);
            if (TextUtils.isEmpty(res)) {
                return false;
            }
            if (z && this.nextRenderingBitmap == null && this.renderingBitmap == null && this.loadFrameTask == null) {
                this.isDice = 2;
                this.setLastFrame = true;
            }
            this.secondLoadingInBackground = true;
            Utilities.globalQueue.postRunnable(new RLottieDiceDrawable$$ExternalSyntheticLambda2(this, res, 0));
        }
        return true;
    }
}
