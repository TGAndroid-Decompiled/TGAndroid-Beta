package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class za implements RequestDelegate {
    public final int f20785a;
    public final int f20786b;
    public final Object f20787c;
    public final Object d;

    public za(Object obj, int i10, Object obj2, int i11) {
        this.f20785a = i11;
        this.f20787c = obj;
        this.f20786b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20785a) {
            case 0:
                ((MessagesController) this.f20787c).lambda$checkChatlistFolderUpdate$478(this.f20786b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f20787c).lambda$startDownloadRequest$28(this.f20786b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20787c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f20786b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f20787c).lambda$loadStickers$97(this.f20786b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20787c).lambda$registerForPush$324(this.f20786b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public za(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f20785a = 2;
        this.f20787c = mediaDataController;
        this.d = stickerSet;
        this.f20786b = i10;
    }
}
