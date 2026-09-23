package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gx0 implements Runnable {
    public final int f24436a;
    public final TLObject f24437b;
    public final Utilities.Callback f24438c;

    public gx0(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.f24436a = i10;
        this.f24437b = tLObject;
        this.f24438c = callback;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f24436a) {
            case 0:
                TLObject tLObject = this.f24437b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.f18110id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f24438c.run(Boolean.valueOf(z10));
                return;
            default:
                TLObject tLObject2 = this.f24437b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.f24438c;
                if (z11) {
                    callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                    return;
                } else {
                    callback.run(0L);
                    return;
                }
        }
    }
}
