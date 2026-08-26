package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Gifts.ResaleGiftsFragment;

public final class PeerColorActivity$$ExternalSyntheticLambda12 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final AmountUtils$Currency f$1;
    public final TL_stars.TL_starGiftUnique f$2;
    public final long f$3;
    public final Object f$4;

    public PeerColorActivity$$ExternalSyntheticLambda12(ResaleGiftsFragment.SelectGiftSheet selectGiftSheet, AlertDialog alertDialog, AmountUtils$Currency amountUtils$Currency, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        this.f$0 = selectGiftSheet;
        this.f$4 = alertDialog;
        this.f$1 = amountUtils$Currency;
        this.f$2 = tL_starGiftUnique;
        this.f$3 = j;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((PeerColorActivity) this.f$0).lambda$buy$9(this.f$1, this.f$2, this.f$3, (Utilities.Callback) this.f$4, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                AlertDialog alertDialog = (AlertDialog) this.f$4;
                AmountUtils$Currency amountUtils$Currency = this.f$1;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f$2;
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$buyGift$27(alertDialog, amountUtils$Currency, tL_starGiftUnique, this.f$3, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public PeerColorActivity$$ExternalSyntheticLambda12(PeerColorActivity peerColorActivity, AmountUtils$Currency amountUtils$Currency, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Utilities.Callback callback) {
        this.f$0 = peerColorActivity;
        this.f$1 = amountUtils$Currency;
        this.f$2 = tL_starGiftUnique;
        this.f$3 = j;
        this.f$4 = callback;
    }
}
