package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class ht implements org.telegram.ui.ActionBar.u1 {
    public final int f26912a;
    public final int f26913b;
    public final Object f26914c;

    public ht(int i10, int i11, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f26912a = i10;
        this.f26913b = i11;
        this.f26914c = k2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        gf.e h = x1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f26912a;
        int i11 = this.f26913b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new org.telegram.ui.f0(i11, (org.telegram.ui.ActionBar.k2) this.f26914c, h, x1Var));
    }

    public ht(mt mtVar, int i10, int i11) {
        this.f26914c = mtVar;
        this.f26912a = i10;
        this.f26913b = i11;
    }
}
