package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class yt implements org.telegram.ui.ActionBar.b2 {
    public final int f30773a;
    public final int f30774b;
    public final Object f30775c;

    public yt(int i10, int i11, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f30773a = i10;
        this.f30774b = i11;
        this.f30775c = o2Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        nf.e g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f30773a;
        int i11 = this.f30774b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.h1(i11, (org.telegram.ui.ActionBar.o2) this.f30775c, g10, c2Var));
    }

    public yt(du duVar, int i10, int i11) {
        this.f30775c = duVar;
        this.f30773a = i10;
        this.f30774b = i11;
    }
}
