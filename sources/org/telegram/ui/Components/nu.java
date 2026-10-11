package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class nu implements org.telegram.ui.ActionBar.z1 {
    public final int f29138a;
    public final int f29139b;
    public final Object f29140c;

    public nu(int i10, int i11, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f29138a = i10;
        this.f29139b = i11;
        this.f29140c = m2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f29138a;
        int i11 = this.f29139b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.m2) this.f29140c, g10, a2Var));
    }

    public nu(su suVar, int i10, int i11) {
        this.f29140c = suVar;
        this.f29138a = i10;
        this.f29139b = i11;
    }
}
