package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class wt implements org.telegram.ui.ActionBar.a2 {
    public final int f29776a;
    public final int f29777b;
    public final Object f29778c;

    public wt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f29776a = i10;
        this.f29777b = i11;
        this.f29778c = n2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f29776a;
        int i11 = this.f29777b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.n2) this.f29778c, g10, b2Var));
    }

    public wt(bu buVar, int i10, int i11) {
        this.f29778c = buVar;
        this.f29776a = i10;
        this.f29777b = i11;
    }
}
