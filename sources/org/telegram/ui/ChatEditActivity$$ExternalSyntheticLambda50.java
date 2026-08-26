package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ImageUpdater;

public final class ChatEditActivity$$ExternalSyntheticLambda50 implements Runnable {
    public final int $r8$classId;
    public final ImageUpdater.ImageUpdaterDelegate f$0;
    public final TLRPC.PhotoSize f$1;
    public final TLRPC.InputFile f$2;
    public final TLRPC.InputFile f$3;
    public final TLRPC.VideoSize f$4;
    public final TLRPC.PhotoSize f$5;
    public final double f$6;
    public final String f$7;

    public ChatEditActivity$$ExternalSyntheticLambda50(BaseFragment baseFragment, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i) {
        this.$r8$classId = i;
        this.f$0 = (ImageUpdater.ImageUpdaterDelegate) baseFragment;
        this.f$2 = inputFile;
        this.f$3 = inputFile2;
        this.f$4 = videoSize;
        this.f$7 = str;
        this.f$6 = d;
        this.f$1 = photoSize;
        this.f$5 = photoSize2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatEditActivity) this.f$0).lambda$didUploadPhoto$59(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            case 1:
                ((GroupCallActivity.AvatarUpdaterDelegate) this.f$0).lambda$didUploadPhoto$3(this.f$2, this.f$3, this.f$4, this.f$6, this.f$7, this.f$1, this.f$5);
                break;
            case 2:
                ((ChannelCreateActivity) this.f$0).lambda$didUploadPhoto$15(this.f$2, this.f$3, this.f$4, this.f$7, this.f$6, this.f$1, this.f$5);
                break;
            case 3:
                ((GroupCreateFinalActivity) this.f$0).lambda$didUploadPhoto$8(this.f$2, this.f$3, this.f$4, this.f$7, this.f$6, this.f$1, this.f$5);
                break;
            case 4:
                ((ProfileActivity) this.f$0).lambda$didUploadPhoto$113(this.f$2, this.f$3, this.f$4, this.f$6, this.f$7, this.f$1, this.f$5);
                break;
            default:
                ((SettingsActivity) this.f$0).lambda$didUploadPhoto$24(this.f$2, this.f$3, this.f$4, this.f$6, this.f$7, this.f$1, this.f$5);
                break;
        }
    }

    public ChatEditActivity$$ExternalSyntheticLambda50(ChatEditActivity chatEditActivity, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.$r8$classId = 0;
        this.f$0 = chatEditActivity;
        this.f$1 = photoSize;
        this.f$2 = inputFile;
        this.f$3 = inputFile2;
        this.f$4 = videoSize;
        this.f$5 = photoSize2;
        this.f$6 = d;
        this.f$7 = str;
    }

    public ChatEditActivity$$ExternalSyntheticLambda50(ImageUpdater.ImageUpdaterDelegate imageUpdaterDelegate, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i) {
        this.$r8$classId = i;
        this.f$0 = imageUpdaterDelegate;
        this.f$2 = inputFile;
        this.f$3 = inputFile2;
        this.f$4 = videoSize;
        this.f$6 = d;
        this.f$7 = str;
        this.f$1 = photoSize;
        this.f$5 = photoSize2;
    }
}
