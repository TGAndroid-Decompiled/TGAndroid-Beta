package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class SlotsDrawable extends RLottieDiceDrawable {
    public Bitmap backgroundBitmapTmp;
    public int center;
    public final int[] frameCounts;
    public final int[] frameNums;
    public int left;
    public final RLottieNative[] lottieNatives;
    public boolean playWinAnimation;
    public int right;
    public final int[] secondFrameCounts;
    public final int[] secondFrameNums;
    public final RLottieNative[] secondLottieNatives;

    public SlotsDrawable(String str, int i, int i2) {
        super(str, i, i2);
        this.lottieNatives = new RLottieNative[5];
        this.frameCounts = new int[5];
        this.frameNums = new int[5];
        this.secondLottieNatives = new RLottieNative[3];
        this.secondFrameCounts = new int[3];
        this.secondFrameNums = new int[3];
    }

    @Override
    public final void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null) {
                recycleInternal(false);
            }
        }
        if (this.nativePtr == null && this.secondNativePtr == null) {
            recycleResources();
            return;
        }
        this.waitingForNextTask = true;
        if (!hasParentView()) {
            this.isRunning = false;
            checkChoreographer$1();
        }
        scheduleNextGetFrame();
    }

    @Override
    public final int loadFrameRunnableImpl() {
        if (this.isRecycled) {
            return 3;
        }
        if (this.nativePtr != null && (this.isDice != 2 || this.secondNativePtr != null)) {
            if (this.backgroundBitmapTmp == null) {
                try {
                    this.backgroundBitmapTmp = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.backgroundBitmap == null) {
                try {
                    this.backgroundBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.backgroundBitmap != null && this.backgroundBitmapTmp != null) {
                try {
                    int frame = -1;
                    if (this.isDice == 1) {
                        int i = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr = this.lottieNatives;
                            if (i >= rLottieNativeArr.length) {
                                break;
                            }
                            frame = rLottieNativeArr[i].getFrame(this.frameNums[i], this.backgroundBitmapTmp, i == 0);
                            if (i != 0) {
                                int[] iArr = this.frameNums;
                                int i2 = iArr[i] + 1;
                                if (i2 < this.frameCounts[i]) {
                                    iArr[i] = i2;
                                } else if (i != 4) {
                                    iArr[i] = 0;
                                    this.nextFrameIsLast = false;
                                    if (this.secondNativePtr != null) {
                                        this.isDice = 2;
                                    }
                                }
                            }
                            i++;
                        }
                    } else {
                        if (this.setLastFrame) {
                            int i3 = 0;
                            while (true) {
                                int[] iArr2 = this.secondFrameNums;
                                if (i3 >= iArr2.length) {
                                    break;
                                }
                                iArr2[i3] = this.secondFrameCounts[i3] - 1;
                                i3++;
                            }
                        }
                        if (this.playWinAnimation) {
                            int[] iArr3 = this.frameNums;
                            int i4 = iArr3[0] + 1;
                            if (i4 < this.frameCounts[0]) {
                                iArr3[0] = i4;
                            } else {
                                iArr3[0] = -1;
                            }
                        }
                        this.lottieNatives[0].getFrame(Math.max(this.frameNums[0], 0), this.backgroundBitmapTmp, true);
                        int i5 = 0;
                        while (true) {
                            RLottieNative[] rLottieNativeArr2 = this.secondLottieNatives;
                            if (i5 >= rLottieNativeArr2.length) {
                                break;
                            }
                            RLottieNative rLottieNative = rLottieNativeArr2[i5];
                            int i6 = this.secondFrameNums[i5];
                            if (i6 < 0) {
                                i6 = this.secondFrameCounts[i5] - 1;
                            }
                            rLottieNative.getFrame(i6, this.backgroundBitmapTmp, false);
                            if (!this.nextFrameIsLast) {
                                int[] iArr4 = this.secondFrameNums;
                                int i7 = iArr4[i5] + 1;
                                if (i7 < this.secondFrameCounts[i5]) {
                                    iArr4[i5] = i7;
                                } else {
                                    iArr4[i5] = -1;
                                }
                            }
                            i5++;
                        }
                        int frame2 = this.lottieNatives[4].getFrame(this.frameNums[4], this.backgroundBitmapTmp, false);
                        int[] iArr5 = this.frameNums;
                        int i8 = iArr5[4] + 1;
                        if (i8 < this.frameCounts[4]) {
                            iArr5[4] = i8;
                        }
                        int[] iArr6 = this.secondFrameNums;
                        if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                            this.nextFrameIsLast = true;
                            this.autoRepeatPlayCount++;
                        }
                        int i9 = this.left;
                        int i10 = this.right;
                        if (i9 != i10 || i10 != this.center) {
                            this.frameNums[0] = -1;
                        } else if (this.secondFrameNums[0] == this.secondFrameCounts[0] - 100) {
                            this.playWinAnimation = true;
                            if (i9 == 5) {
                                WeakReference weakReference = this.onFinishCallback;
                                Runnable runnable = weakReference == null ? null : (Runnable) weakReference.get();
                                if (runnable != null) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            }
                        }
                        frame = frame2;
                    }
                    if (frame >= 0) {
                        Utilities.copyBitmaps(this.backgroundBitmapTmp, this.backgroundBitmap);
                        this.nextRenderingBitmap = this.backgroundBitmap;
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
    public final void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        checkChoreographer$1();
        if (this.loadingInBackground || this.secondLoadingInBackground) {
            this.destroyAfterLoading = true;
        } else if (this.loadFrameTask != null) {
            this.destroyWhenDone = true;
        } else {
            recycleInternal(true);
            recycleResources();
        }
    }

    public final void recycleInternal(boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.lottieNatives;
            if (i2 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i2];
            if (rLottieNative != null) {
                if (z && rLottieNative == this.nativePtr) {
                    this.nativePtr = null;
                }
                this.lottieNatives[i2].recycle();
                this.lottieNatives[i2] = null;
            }
            i2++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.secondLottieNatives;
            if (i >= rLottieNativeArr2.length) {
                return;
            }
            RLottieNative rLottieNative2 = rLottieNativeArr2[i];
            if (rLottieNative2 != null) {
                if (z && rLottieNative2 == this.secondNativePtr) {
                    this.secondNativePtr = null;
                }
                this.secondLottieNatives[i].recycle();
                this.secondLottieNatives[i] = null;
            }
            i++;
        }
    }
}
