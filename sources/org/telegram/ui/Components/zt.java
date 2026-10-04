package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class zt implements org.telegram.ui.ActionBar.a2 {
    public final int f33645a;
    public final int f33646b;
    public final Object f33647c;

    public zt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f33645a = i10;
        this.f33646b = i11;
        this.f33647c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f33645a;
        int i11 = this.f33646b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.i1(i11, (org.telegram.ui.ActionBar.n2) this.f33647c, g10, b2Var));
    }

    public zt(eu euVar, int i10, int i11) {
        this.f33647c = euVar;
        this.f33645a = i10;
        this.f33646b = i11;
    }
}
