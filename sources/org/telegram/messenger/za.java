package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class za implements RequestDelegate {
    public final int f19105a;
    public final int f19106b;
    public final Object f19107c;
    public final Object d;

    public za(Object obj, int i10, Object obj2, int i11) {
        this.f19105a = i11;
        this.f19107c = obj;
        this.f19106b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19105a) {
            case 0:
                ((MessagesController) this.f19107c).lambda$checkChatlistFolderUpdate$478(this.f19106b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19107c).lambda$startDownloadRequest$28(this.f19106b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19107c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19106b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19107c).lambda$loadStickers$97(this.f19106b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19107c).lambda$registerForPush$324(this.f19106b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public za(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19105a = 2;
        this.f19107c = mediaDataController;
        this.d = stickerSet;
        this.f19106b = i10;
    }
}
