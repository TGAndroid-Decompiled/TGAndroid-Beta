package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fp0 implements Utilities.Callback {
    public final int f35900a = 0;
    public final ag.b f35901b;
    public final TL_stars.TL_starGiftUnique f35902c;
    public final long d;
    public final Object e;
    public final Object f35903f;

    public fp0(eq0 eq0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, cp0 cp0Var) {
        this.e = eq0Var;
        this.f35901b = bVar;
        this.f35902c = tL_starGiftUnique;
        this.d = j10;
        this.f35903f = cp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35900a) {
            case 0:
                eq0.V((eq0) this.e, this.f35901b, this.f35902c, this.d, (cp0) this.f35903f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.a2) this.f35903f, this.f35901b, this.f35902c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public fp0(yh.f4 f4Var, org.telegram.ui.ActionBar.a2 a2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f35903f = a2Var;
        this.f35901b = bVar;
        this.f35902c = tL_starGiftUnique;
        this.d = j10;
    }
}
