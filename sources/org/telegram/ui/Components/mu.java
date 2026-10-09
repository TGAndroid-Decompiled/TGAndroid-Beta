package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class mu implements org.telegram.ui.ActionBar.a2 {
    public final int f28936a;
    public final int f28937b;
    public final Object f28938c;

    public mu(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28936a = i10;
        this.f28937b = i11;
        this.f28938c = n2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f28936a;
        int i11 = this.f28937b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.n2) this.f28938c, g10, b2Var));
    }

    public mu(ru ruVar, int i10, int i11) {
        this.f28938c = ruVar;
        this.f28936a = i10;
        this.f28937b = i11;
    }
}
