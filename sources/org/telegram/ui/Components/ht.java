package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class ht implements org.telegram.ui.ActionBar.u1 {
    public final int f26807a;
    public final int f26808b;
    public final Object f26809c;

    public ht(int i10, int i11, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f26807a = i10;
        this.f26808b = i11;
        this.f26809c = k2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        gf.e h = x1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f26807a;
        int i11 = this.f26808b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new org.telegram.ui.f0(i11, (org.telegram.ui.ActionBar.k2) this.f26809c, h, x1Var));
    }

    public ht(mt mtVar, int i10, int i11) {
        this.f26809c = mtVar;
        this.f26807a = i10;
        this.f26808b = i11;
    }
}
