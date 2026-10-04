package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class zt implements org.telegram.ui.ActionBar.a2 {
    public final int f33638a;
    public final int f33639b;
    public final Object f33640c;

    public zt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f33638a = i10;
        this.f33639b = i11;
        this.f33640c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f33638a;
        int i11 = this.f33639b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.i1(i11, (org.telegram.ui.ActionBar.n2) this.f33640c, g10, b2Var));
    }

    public zt(eu euVar, int i10, int i11) {
        this.f33640c = euVar;
        this.f33638a = i10;
        this.f33639b = i11;
    }
}
