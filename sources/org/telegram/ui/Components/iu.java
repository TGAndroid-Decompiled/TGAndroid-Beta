package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class iu implements org.telegram.ui.ActionBar.z1 {
    public final int f25785a;
    public final int f25786b;
    public final Object f25787c;

    public iu(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f25785a = i10;
        this.f25786b = i11;
        this.f25787c = m2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        pf.c g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f25785a;
        int i11 = this.f25786b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new fi.g1(i11, (org.telegram.ui.ActionBar.m2) this.f25787c, g10, a2Var));
    }

    public iu(nu nuVar, int i10, int i11) {
        this.f25787c = nuVar;
        this.f25785a = i10;
        this.f25786b = i11;
    }
}
