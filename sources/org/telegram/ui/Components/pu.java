package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class pu implements org.telegram.ui.ActionBar.z1 {
    public final int f29569a;
    public final int f29570b;
    public final Object f29571c;

    public pu(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f29569a = i10;
        this.f29570b = i11;
        this.f29571c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f29569a;
        int i11 = this.f29570b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f29571c, g10, a2Var));
    }

    public pu(uu uuVar, int i10, int i11) {
        this.f29571c = uuVar;
        this.f29569a = i10;
        this.f29570b = i11;
    }
}
