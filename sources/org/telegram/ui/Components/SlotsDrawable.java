package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda12;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda32;

public final class SlotsDrawable extends RLottieDiceDrawable {
    private Bitmap backgroundBitmapTmp;
    private ReelValue center;
    private final int[] frameCounts;
    private final int[] frameNums;
    private ReelValue left;
    private final RLottieNative[] lottieNatives;
    private boolean playWinAnimation;
    private ReelValue right;
    private final int[] secondFrameCounts;
    private final int[] secondFrameNums;
    private final RLottieNative[] secondLottieNatives;

    public enum ReelValue {
        bar,
        berries,
        lemon,
        seven,
        sevenWin
    }

    public SlotsDrawable(String str, int i, int i2) {
        super(str, i, i2);
        this.lottieNatives = new RLottieNative[5];
        this.frameCounts = new int[5];
        this.frameNums = new int[5];
        this.secondLottieNatives = new RLottieNative[3];
        this.secondFrameCounts = new int[3];
        this.secondFrameNums = new int[3];
    }

    private void init(int i) {
        int i2 = i - 1;
        ReelValue reelValue = reelValue(i2 & 3);
        ReelValue reelValue2 = reelValue((i2 >> 2) & 3);
        ReelValue reelValue3 = reelValue(i2 >> 4);
        ReelValue reelValue4 = ReelValue.seven;
        if (reelValue == reelValue4 && reelValue2 == reelValue4 && reelValue3 == reelValue4) {
            reelValue = ReelValue.sevenWin;
            reelValue3 = reelValue;
            reelValue2 = reelValue3;
        }
        this.left = reelValue;
        this.center = reelValue2;
        this.right = reelValue3;
    }

    private boolean is777() {
        ReelValue reelValue = this.left;
        ReelValue reelValue2 = ReelValue.sevenWin;
        return reelValue == reelValue2 && this.center == reelValue2 && this.right == reelValue2;
    }

    public void lambda$setBaseDice$0() {
        this.loadingInBackground = false;
        if (this.secondLoadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    public static void lambda$setBaseDice$1(TLRPC.Document document, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        DownloadController.getInstance(i).addLoadingFileObserver(FileLoader.getAttachFileName(document), messageObject, chatMessageCell);
        FileLoader.getInstance(i).loadFile(document, tL_messages_stickerSet, 1, 1);
    }

    public void lambda$setBaseDice$2() {
        this.loadingInBackground = false;
    }

    public void lambda$setBaseDice$3(int i, ChatMessageCell chatMessageCell) {
        this.loadingInBackground = false;
        if (!this.secondLoadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.nativePtr = this.lottieNatives[0];
        checkChoreographer();
        DownloadController.getInstance(i).removeLoadingFileObserver(chatMessageCell);
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public void lambda$setBaseDice$4(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, MessageObject messageObject, ChatMessageCell chatMessageCell) {
        int i2;
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda0(this, 2));
            return;
        }
        boolean z = false;
        int i3 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.lottieNatives;
            if (i3 >= rLottieNativeArr.length) {
                break;
            }
            if (rLottieNativeArr[i3] == null) {
                if (i3 == 0) {
                    i2 = 1;
                } else if (i3 == 1) {
                    i2 = 8;
                } else {
                    i2 = 2;
                    if (i3 == 2) {
                        i2 = 14;
                    } else if (i3 == 3) {
                        i2 = 20;
                    }
                }
                if (i2 < tL_messages_stickerSet.documents.size()) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                    String res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                    if (TextUtils.isEmpty(res)) {
                        AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda1(document, i, messageObject, chatMessageCell, tL_messages_stickerSet, 1));
                        z = true;
                    } else {
                        this.lottieNatives[i3] = RLottieNative.createFromRawJson(res, "dice", this.metaData, null);
                        this.frameCounts[i3] = this.metaData[0];
                    }
                }
            }
            i3++;
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda0(this, 3));
        } else {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda9(this, i, chatMessageCell, 0));
        }
    }

    public void lambda$setDiceNumber$5() {
        this.secondLoadingInBackground = false;
        if (this.loadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    public static void lambda$setDiceNumber$6(TLRPC.Document document, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        DownloadController.getInstance(i).addLoadingFileObserver(FileLoader.getAttachFileName(document), messageObject, chatMessageCell);
        FileLoader.getInstance(i).loadFile(document, tL_messages_stickerSet, 1, 1);
    }

    public void lambda$setDiceNumber$7() {
        this.secondLoadingInBackground = false;
    }

    public void lambda$setDiceNumber$8(boolean z, int i, ChatMessageCell chatMessageCell) {
        if (z && this.nextRenderingBitmap == null && this.renderingBitmap == null && this.loadFrameTask == null) {
            this.isDice = 2;
            this.setLastFrame = true;
        }
        this.secondLoadingInBackground = false;
        if (!this.loadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.secondNativePtr = this.secondLottieNatives[0];
        DownloadController.getInstance(i).removeLoadingFileObserver(chatMessageCell);
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public void lambda$setDiceNumber$9(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, boolean z) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i2;
        TLRPC.Document document;
        String res;
        RLottieNative rLottieNativeCreateFromRawJson;
        char c;
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda0(this, 0));
            return;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.secondLottieNatives;
            if (i3 >= rLottieNativeArr.length + 2) {
                break;
            }
            if (i3 <= 2) {
                if (rLottieNativeArr[i3] == null) {
                    if (i3 == 0) {
                        ReelValue reelValue = this.left;
                        if (reelValue == ReelValue.bar) {
                            i2 = 5;
                        } else if (reelValue == ReelValue.berries) {
                            i2 = 6;
                        } else {
                            if (reelValue == ReelValue.lemon) {
                                i2 = 7;
                            } else {
                                tL_messages_stickerSet2 = tL_messages_stickerSet;
                                i2 = reelValue == ReelValue.seven ? 4 : 3;
                            }
                            document = tL_messages_stickerSet2.documents.get(i2);
                            res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(res)) {
                                AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda1(document, i, messageObject, chatMessageCell, tL_messages_stickerSet2, 0));
                                z2 = true;
                            } else {
                                rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res, "dice", this.metaData, null);
                                if (i3 <= 2) {
                                    this.secondLottieNatives[i3] = rLottieNativeCreateFromRawJson;
                                    this.secondFrameCounts[i3] = this.metaData[0];
                                } else {
                                    RLottieNative[] rLottieNativeArr2 = this.lottieNatives;
                                    if (i3 == 3) {
                                        c = 0;
                                    } else {
                                        c = 4;
                                    }
                                    rLottieNativeArr2[c] = rLottieNativeCreateFromRawJson;
                                    this.frameCounts[i3 == 3 ? (char) 0 : (char) 4] = this.metaData[0];
                                }
                            }
                        }
                    } else if (i3 == 1) {
                        ReelValue reelValue2 = this.center;
                        if (reelValue2 == ReelValue.bar) {
                            i2 = 11;
                        } else if (reelValue2 == ReelValue.berries) {
                            i2 = 12;
                        } else if (reelValue2 == ReelValue.lemon) {
                            i2 = 13;
                        } else {
                            i2 = reelValue2 == ReelValue.seven ? 10 : 9;
                        }
                    } else {
                        ReelValue reelValue3 = this.right;
                        if (reelValue3 == ReelValue.bar) {
                            i2 = 17;
                        } else if (reelValue3 == ReelValue.berries) {
                            i2 = 18;
                        } else if (reelValue3 == ReelValue.lemon) {
                            i2 = 19;
                        } else {
                            i2 = reelValue3 == ReelValue.seven ? 16 : 15;
                        }
                    }
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    document = tL_messages_stickerSet2.documents.get(i2);
                    res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                    if (TextUtils.isEmpty(res)) {
                        AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda1(document, i, messageObject, chatMessageCell, tL_messages_stickerSet2, 0));
                        z2 = true;
                    } else {
                        rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res, "dice", this.metaData, null);
                        if (i3 <= 2) {
                            this.secondLottieNatives[i3] = rLottieNativeCreateFromRawJson;
                            this.secondFrameCounts[i3] = this.metaData[0];
                        } else {
                            RLottieNative[] rLottieNativeArr3 = this.lottieNatives;
                            if (i3 == 3) {
                                c = 0;
                            } else {
                                c = 4;
                            }
                            rLottieNativeArr3[c] = rLottieNativeCreateFromRawJson;
                            this.frameCounts[i3 == 3 ? (char) 0 : (char) 4] = this.metaData[0];
                        }
                    }
                }
            } else if (this.lottieNatives[i3] == null) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                i2 = i3 == 3 ? 1 : 2;
                document = tL_messages_stickerSet2.documents.get(i2);
                res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                if (TextUtils.isEmpty(res)) {
                    AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda1(document, i, messageObject, chatMessageCell, tL_messages_stickerSet2, 0));
                    z2 = true;
                } else {
                    rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res, "dice", this.metaData, null);
                    if (i3 <= 2) {
                        this.secondLottieNatives[i3] = rLottieNativeCreateFromRawJson;
                        this.secondFrameCounts[i3] = this.metaData[0];
                    } else {
                        RLottieNative[] rLottieNativeArr4 = this.lottieNatives;
                        if (i3 == 3) {
                            c = 0;
                        } else {
                            c = 4;
                        }
                        rLottieNativeArr4[c] = rLottieNativeCreateFromRawJson;
                        this.frameCounts[i3 == 3 ? (char) 0 : (char) 4] = this.metaData[0];
                    }
                }
            }
            i3++;
        }
        if (z2) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda0(this, 1));
        } else {
            AndroidUtilities.runOnUIThread(new ConnectionsManager$$ExternalSyntheticLambda12(this, z, i, chatMessageCell));
        }
    }

    private void recycleInternal(boolean z) {
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

    private ReelValue reelValue(int i) {
        if (i == 0) {
            return ReelValue.bar;
        }
        if (i != 1) {
            return i != 2 ? ReelValue.seven : ReelValue.lemon;
        }
        return ReelValue.berries;
    }

    @Override
    public void decodeFrameFinishedInternal() {
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
            stop();
        }
        scheduleNextGetFrame();
    }

    @Override
    public int loadFrameRunnableImpl() {
        if (this.isRecycled) {
            return 3;
        }
        if (this.nativePtr == null || (this.isDice == 2 && this.secondNativePtr == null)) {
            return 2;
        }
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
                    ReelValue reelValue = this.left;
                    ReelValue reelValue2 = this.right;
                    if (reelValue != reelValue2 || reelValue2 != this.center) {
                        this.frameNums[0] = -1;
                    } else if (this.secondFrameNums[0] == this.secondFrameCounts[0] - 100) {
                        this.playWinAnimation = true;
                        if (reelValue == ReelValue.sevenWin) {
                            WeakReference<Runnable> weakReference = this.onFinishCallback;
                            Runnable runnable = weakReference == null ? null : weakReference.get();
                            if (runnable != null) {
                                AndroidUtilities.runOnUIThread(runnable);
                            }
                        }
                    }
                    frame = frame2;
                }
                if (frame < 0) {
                    return 2;
                }
                Utilities.copyBitmaps(this.backgroundBitmapTmp, this.backgroundBitmap);
                this.nextRenderingBitmap = this.backgroundBitmap;
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
        } else if (this.loadFrameTask != null) {
            this.destroyWhenDone = true;
        } else {
            recycleInternal(true);
            recycleResources();
        }
    }

    public boolean setBaseDice(ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (this.nativePtr == null && !this.loadingInBackground) {
            this.loadingInBackground = true;
            MessageObject messageObject = chatMessageCell.getMessageObject();
            Utilities.globalQueue.postRunnable(new GiftSheet$$ExternalSyntheticLambda15(this, tL_messages_stickerSet, chatMessageCell.getMessageObject().currentAccount, messageObject, chatMessageCell, 16));
        }
        return true;
    }

    public boolean setDiceNumber(ChatMessageCell chatMessageCell, int i, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        if (this.secondNativePtr == null && !this.secondLoadingInBackground) {
            init(i);
            MessageObject messageObject = chatMessageCell.getMessageObject();
            int i2 = chatMessageCell.getMessageObject().currentAccount;
            this.secondLoadingInBackground = true;
            Utilities.globalQueue.postRunnable(new RichEditorListView$$ExternalSyntheticLambda32(this, tL_messages_stickerSet, i2, messageObject, chatMessageCell, z, 3));
        }
        return true;
    }
}
