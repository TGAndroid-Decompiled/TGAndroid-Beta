package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class wt implements org.telegram.ui.ActionBar.a2 {
    public final int f30137a;
    public final int f30138b;
    public final Object f30139c;

    public wt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f30137a = i10;
        this.f30138b = i11;
        this.f30139c = n2Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30137a;
        int i11 = this.f30138b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.n2) this.f30139c, g10, b2Var));
    }

    public wt(bu buVar, int i10, int i11) {
        this.f30139c = buVar;
        this.f30137a = i10;
        this.f30138b = i11;
    }
}
