package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class zt implements org.telegram.ui.ActionBar.z1 {
    public final int f31057a;
    public final int f31058b;
    public final Object f31059c;

    public zt(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f31057a = i10;
        this.f31058b = i11;
        this.f31059c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        nf.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f31057a;
        int i11 = this.f31058b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f31059c, g10, a2Var));
    }

    public zt(eu euVar, int i10, int i11) {
        this.f31059c = euVar;
        this.f31057a = i10;
        this.f31058b = i11;
    }
}
