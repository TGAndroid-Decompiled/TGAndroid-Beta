package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class wt implements org.telegram.ui.ActionBar.b2 {
    public final int f29736a;
    public final int f29737b;
    public final Object f29738c;

    public wt(int i10, int i11, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f29736a = i10;
        this.f29737b = i11;
        this.f29738c = o2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        nf.e g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f29736a;
        int i11 = this.f29737b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.o2) this.f29738c, g10, c2Var));
    }

    public wt(bu buVar, int i10, int i11) {
        this.f29738c = buVar;
        this.f29736a = i10;
        this.f29737b = i11;
    }
}
