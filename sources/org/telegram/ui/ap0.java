package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 implements Utilities.Callback {
    public final int f35973a = 0;
    public final zf.b f35974b;
    public final TL_stars.TL_starGiftUnique f35975c;
    public final long d;
    public final Object f35976e;
    public final Object f35977f;

    public ap0(aq0 aq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, xo0 xo0Var) {
        this.f35976e = aq0Var;
        this.f35974b = bVar;
        this.f35975c = tL_starGiftUnique;
        this.d = j3;
        this.f35977f = xo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35973a) {
            case 0:
                aq0.V((aq0) this.f35976e, this.f35974b, this.f35975c, this.d, (xo0) this.f35977f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.V((xh.h4) this.f35976e, (org.telegram.ui.ActionBar.b2) this.f35977f, this.f35974b, this.f35975c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public ap0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f35976e = h4Var;
        this.f35977f = b2Var;
        this.f35974b = bVar;
        this.f35975c = tL_starGiftUnique;
        this.d = j3;
    }
}
