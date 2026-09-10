package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tx0 implements Runnable {
    public final int f27507a;
    public final TLObject f27508b;
    public final Utilities.Callback f27509c;

    public tx0(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.f27507a = i10;
        this.f27508b = tLObject;
        this.f27509c = callback;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f27507a) {
            case 0:
                TLObject tLObject = this.f27508b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f27509c.run(Boolean.valueOf(z10));
                return;
            default:
                TLObject tLObject2 = this.f27508b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.f27509c;
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
