package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lo0 implements Utilities.Callback {
    public final int f38899a = 0;
    public final ag.c f38900b;
    public final TL_stars.TL_starGiftUnique f38901c;
    public final long d;
    public final Object e;
    public final Object f38902f;

    public lo0(kp0 kp0Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, io0 io0Var) {
        this.e = kp0Var;
        this.f38900b = cVar;
        this.f38901c = tL_starGiftUnique;
        this.d = j10;
        this.f38902f = io0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38899a) {
            case 0:
                kp0.V((kp0) this.e, this.f38900b, this.f38901c, this.d, (io0) this.f38902f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.g4.V((yh.g4) this.e, (org.telegram.ui.ActionBar.b2) this.f38902f, this.f38900b, this.f38901c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public lo0(yh.g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = g4Var;
        this.f38902f = b2Var;
        this.f38900b = cVar;
        this.f38901c = tL_starGiftUnique;
        this.d = j10;
    }
}
