package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ko0 implements Utilities.Callback {
    public final int f38618a = 0;
    public final ag.c f38619b;
    public final TL_stars.TL_starGiftUnique f38620c;
    public final long d;
    public final Object e;
    public final Object f38621f;

    public ko0(jp0 jp0Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ho0 ho0Var) {
        this.e = jp0Var;
        this.f38619b = cVar;
        this.f38620c = tL_starGiftUnique;
        this.d = j10;
        this.f38621f = ho0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38618a) {
            case 0:
                jp0.V((jp0) this.e, this.f38619b, this.f38620c, this.d, (ho0) this.f38621f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.g4.V((yh.g4) this.e, (org.telegram.ui.ActionBar.b2) this.f38621f, this.f38619b, this.f38620c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public ko0(yh.g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = g4Var;
        this.f38621f = b2Var;
        this.f38619b = cVar;
        this.f38620c = tL_starGiftUnique;
        this.d = j10;
    }
}
