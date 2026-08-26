package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class StarsController$$ExternalSyntheticLambda54 implements RequestDelegate {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public StarsController$$ExternalSyntheticLambda54(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final Utilities.Callback callback = this.f$0;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        switch (i) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                boolean z2 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                                Utilities.Callback callback2 = callback;
                                if (!z2) {
                                    callback2.run(0L);
                                } else {
                                    callback2.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                                callback.run(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
            default:
                final Utilities.Callback callback2 = this.f$0;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        switch (i2) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                boolean z2 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                                Utilities.Callback callback3 = callback2;
                                if (!z2) {
                                    callback3.run(0L);
                                } else {
                                    callback3.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                                callback2.run(Boolean.valueOf(z));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
