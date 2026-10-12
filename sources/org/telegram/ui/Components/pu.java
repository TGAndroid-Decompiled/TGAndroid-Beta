package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class pu implements org.telegram.ui.ActionBar.z1 {
    public final int f29591a;
    public final int f29592b;
    public final Object f29593c;

    public pu(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f29591a = i10;
        this.f29592b = i11;
        this.f29593c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f29591a;
        int i11 = this.f29592b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f29593c, g10, a2Var));
    }

    public pu(uu uuVar, int i10, int i11) {
        this.f29593c = uuVar;
        this.f29591a = i10;
        this.f29592b = i11;
    }
}
