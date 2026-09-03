package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class za implements RequestDelegate {
    public final int f20787a;
    public final int f20788b;
    public final Object f20789c;
    public final Object d;

    public za(Object obj, int i10, Object obj2, int i11) {
        this.f20787a = i11;
        this.f20789c = obj;
        this.f20788b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20787a) {
            case 0:
                ((MessagesController) this.f20789c).lambda$checkChatlistFolderUpdate$478(this.f20788b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f20789c).lambda$startDownloadRequest$28(this.f20788b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20789c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f20788b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f20789c).lambda$loadStickers$97(this.f20788b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20789c).lambda$registerForPush$324(this.f20788b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public za(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f20787a = 2;
        this.f20789c = mediaDataController;
        this.d = stickerSet;
        this.f20788b = i10;
    }
}
