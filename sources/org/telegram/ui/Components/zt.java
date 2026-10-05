package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class zt implements org.telegram.ui.ActionBar.a2 {
    public final int f33636a;
    public final int f33637b;
    public final Object f33638c;

    public zt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f33636a = i10;
        this.f33637b = i11;
        this.f33638c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f33636a;
        int i11 = this.f33637b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.i1(i11, (org.telegram.ui.ActionBar.n2) this.f33638c, g10, b2Var));
    }

    public zt(eu euVar, int i10, int i11) {
        this.f33638c = euVar;
        this.f33636a = i10;
        this.f33637b = i11;
    }
}
