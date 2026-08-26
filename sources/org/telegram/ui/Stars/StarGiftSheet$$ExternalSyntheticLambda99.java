package org.telegram.ui.Stars;

import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class StarGiftSheet$$ExternalSyntheticLambda99 implements RequestDelegate {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TL_stars.TL_starGiftUnique f$1;
    public final AmountUtils$Amount f$2;
    public final Runnable f$3;

    public StarGiftSheet$$ExternalSyntheticLambda99(StarGiftSheet starGiftSheet, TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = tL_starGiftUnique;
        this.f$2 = amountUtils$Amount;
        this.f$3 = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onUpdatePriceClick$28(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$onResellPressed$39(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
        }
    }
}
