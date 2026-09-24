package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class xt implements org.telegram.ui.ActionBar.z1 {
    public final int f30391a;
    public final int f30392b;
    public final Object f30393c;

    public xt(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f30391a = i10;
        this.f30392b = i11;
        this.f30393c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        nf.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30391a;
        int i11 = this.f30392b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f30393c, g10, a2Var));
    }

    public xt(cu cuVar, int i10, int i11) {
        this.f30393c = cuVar;
        this.f30391a = i10;
        this.f30392b = i11;
    }
}
