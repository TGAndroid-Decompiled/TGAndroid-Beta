package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class au implements org.telegram.ui.ActionBar.c2 {
    public final int f21587a;
    public final int f21588b;
    public final Object f21589c;

    public au(int i10, int i11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f21587a = i10;
        this.f21588b = i11;
        this.f21589c = p2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        nf.e g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f21587a;
        int i11 = this.f21588b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new di.k1(i11, (org.telegram.ui.ActionBar.p2) this.f21589c, g10, d2Var));
    }

    public au(fu fuVar, int i10, int i11) {
        this.f21589c = fuVar;
        this.f21587a = i10;
        this.f21588b = i11;
    }
}
