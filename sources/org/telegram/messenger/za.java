package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class za implements RequestDelegate {
    public final int f19130a;
    public final int f19131b;
    public final Object f19132c;
    public final Object d;

    public za(Object obj, int i10, Object obj2, int i11) {
        this.f19130a = i11;
        this.f19132c = obj;
        this.f19131b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19130a) {
            case 0:
                ((MessagesController) this.f19132c).lambda$checkChatlistFolderUpdate$478(this.f19131b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19132c).lambda$startDownloadRequest$28(this.f19131b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19132c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19131b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19132c).lambda$loadStickers$97(this.f19131b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19132c).lambda$registerForPush$324(this.f19131b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public za(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19130a = 2;
        this.f19132c = mediaDataController;
        this.d = stickerSet;
        this.f19131b = i10;
    }
}
