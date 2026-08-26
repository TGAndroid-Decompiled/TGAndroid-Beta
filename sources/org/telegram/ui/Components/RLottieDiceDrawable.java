package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;

public class RLottieDiceDrawable extends RLottieDrawable {
    public boolean destroyAfterLoading;
    public final int diceSwitchFramesCount;
    public boolean loadingInBackground;
    public int secondFramesCount;
    public boolean secondLoadingInBackground;
    public volatile RLottieNative secondNativePtr;
    public volatile boolean setLastFrame;

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
        this.nativePtr = RLottieNative.createFromRawJson(res, "dice", this.metaData, null, null);
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
            this.isRunning = false;
            checkChoreographer$1();
        }
        if (this.isRunning) {
            scheduleNextGetFrame();
        }
    }

    @Override
    public final boolean ignoreScheduleNextGetFrame() {
        return this.loadingInBackground;
    }

    @Override
    public final boolean isHeavyDrawable() {
        return false;
    }

    @Override
    public int loadFrameRunnableImpl() {
        boolean z;
        RLottieNative rLottieNative;
        if (this.isRecycled) {
            return 3;
        }
        if (this.nativePtr != null && (this.isDice != 2 || this.secondNativePtr != null)) {
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
                    if (rLottieNative.getFrame(this.currentFrame, this.backgroundBitmap, z) >= 0) {
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
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return 1;
        }
        return 2;
    }

    @Override
    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        checkChoreographer$1();
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
    public final void recycleNativePtr(boolean z) {
        RLottieNative rLottieNative = this.nativePtr;
        RLottieNative rLottieNative2 = this.secondNativePtr;
        this.nativePtr = null;
        this.secondNativePtr = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = new ShareAlert$$ExternalSyntheticLambda29(4, rLottieNative, rLottieNative2);
        if (z) {
            DispatchQueuePoolBackground.execute(shareAlert$$ExternalSyntheticLambda29);
        } else {
            Utilities.globalQueue.postRunnable(shareAlert$$ExternalSyntheticLambda29);
        }
    }
}
