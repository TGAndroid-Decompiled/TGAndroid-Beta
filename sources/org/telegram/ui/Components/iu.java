package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class iu implements org.telegram.ui.ActionBar.z1 {
    public final int f26092a;
    public final int f26093b;
    public final Object f26094c;

    public iu(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f26092a = i10;
        this.f26093b = i11;
        this.f26094c = m2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        pf.c g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f26092a;
        int i11 = this.f26093b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new fi.g1(i11, (org.telegram.ui.ActionBar.m2) this.f26094c, g10, a2Var));
    }

    public iu(nu nuVar, int i10, int i11) {
        this.f26094c = nuVar;
        this.f26092a = i10;
        this.f26093b = i11;
    }
}
