package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class nu implements org.telegram.ui.ActionBar.a2 {
    public final int f29233a;
    public final int f29234b;
    public final Object f29235c;

    public nu(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f29233a = i10;
        this.f29234b = i11;
        this.f29235c = n2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f29233a;
        int i11 = this.f29234b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.n2) this.f29235c, g10, b2Var));
    }

    public nu(su suVar, int i10, int i11) {
        this.f29235c = suVar;
        this.f29233a = i10;
        this.f29234b = i11;
    }
}
