package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ya implements RequestDelegate {
    public final int f22249a;
    public final int f22250b;
    public final Object f22251c;
    public final Object d;

    public ya(Object obj, int i10, Object obj2, int i11) {
        this.f22249a = i11;
        this.f22251c = obj;
        this.f22250b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22249a) {
            case 0:
                ((MessagesController) this.f22251c).lambda$checkChatlistFolderUpdate$478(this.f22250b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f22251c).lambda$startDownloadRequest$28(this.f22250b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f22251c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f22250b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f22251c).lambda$loadStickers$97(this.f22250b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f22251c).lambda$registerForPush$324(this.f22250b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ya(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f22249a = 2;
        this.f22251c = mediaDataController;
        this.d = stickerSet;
        this.f22250b = i10;
    }
}
