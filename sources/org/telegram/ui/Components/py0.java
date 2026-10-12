package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class py0 implements Runnable {
    public final int f29591a;
    public final TLObject f29592b;
    public final Utilities.Callback f29593c;

    public py0(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.f29591a = i10;
        this.f29592b = tLObject;
        this.f29593c = callback;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29591a) {
            case 0:
                TLObject tLObject = this.f29592b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.f19830id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f29593c.run(Boolean.valueOf(z10));
                return;
            default:
                TLObject tLObject2 = this.f29592b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.f29593c;
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
