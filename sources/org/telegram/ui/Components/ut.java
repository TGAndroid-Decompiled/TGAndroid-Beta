package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class ut implements org.telegram.ui.ActionBar.a2 {
    public final int f30967a;
    public final int f30968b;
    public final Object f30969c;

    public ut(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f30967a = i10;
        this.f30968b = i11;
        this.f30969c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30967a;
        int i11 = this.f30968b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new fi.h1(i11, (org.telegram.ui.ActionBar.n2) this.f30969c, g10, b2Var));
    }

    public ut(zt ztVar, int i10, int i11) {
        this.f30969c = ztVar;
        this.f30967a = i10;
        this.f30968b = i11;
    }
}
