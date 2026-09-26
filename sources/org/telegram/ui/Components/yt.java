package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class yt implements org.telegram.ui.ActionBar.z1 {
    public final int f30700a;
    public final int f30701b;
    public final Object f30702c;

    public yt(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f30700a = i10;
        this.f30701b = i11;
        this.f30702c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        nf.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30700a;
        int i11 = this.f30701b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f30702c, g10, a2Var));
    }

    public yt(du duVar, int i10, int i11) {
        this.f30702c = duVar;
        this.f30700a = i10;
        this.f30701b = i11;
    }
}
