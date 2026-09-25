package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class xt implements org.telegram.ui.ActionBar.z1 {
    public final int f30399a;
    public final int f30400b;
    public final Object f30401c;

    public xt(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f30399a = i10;
        this.f30400b = i11;
        this.f30401c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        nf.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30399a;
        int i11 = this.f30400b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f30401c, g10, a2Var));
    }

    public xt(cu cuVar, int i10, int i11) {
        this.f30401c = cuVar;
        this.f30399a = i10;
        this.f30400b = i11;
    }
}
