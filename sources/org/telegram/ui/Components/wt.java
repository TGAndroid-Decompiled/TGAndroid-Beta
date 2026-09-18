package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class wt implements org.telegram.ui.ActionBar.a2 {
    public final int f30157a;
    public final int f30158b;
    public final Object f30159c;

    public wt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f30157a = i10;
        this.f30158b = i11;
        this.f30159c = n2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30157a;
        int i11 = this.f30158b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.n2) this.f30159c, g10, b2Var));
    }

    public wt(bu buVar, int i10, int i11) {
        this.f30159c = buVar;
        this.f30157a = i10;
        this.f30158b = i11;
    }
}
