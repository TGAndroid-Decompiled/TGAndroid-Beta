package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class xt implements org.telegram.ui.ActionBar.a2 {
    public final int f30051a;
    public final int f30052b;
    public final Object f30053c;

    public xt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f30051a = i10;
        this.f30052b = i11;
        this.f30053c = n2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30051a;
        int i11 = this.f30052b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.n2) this.f30053c, g10, b2Var));
    }

    public xt(cu cuVar, int i10, int i11) {
        this.f30053c = cuVar;
        this.f30051a = i10;
        this.f30052b = i11;
    }
}
