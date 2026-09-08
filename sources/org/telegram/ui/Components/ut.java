package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class ut implements org.telegram.ui.ActionBar.a2 {
    public final int f30994a;
    public final int f30995b;
    public final Object f30996c;

    public ut(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f30994a = i10;
        this.f30995b = i11;
        this.f30996c = n2Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30994a;
        int i11 = this.f30995b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new fi.h1(i11, (org.telegram.ui.ActionBar.n2) this.f30996c, g10, b2Var));
    }

    public ut(zt ztVar, int i10, int i11) {
        this.f30996c = ztVar;
        this.f30994a = i10;
        this.f30995b = i11;
    }
}
