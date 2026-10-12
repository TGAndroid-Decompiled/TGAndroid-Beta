package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hp0 implements Utilities.Callback {
    public final int f36893a = 0;
    public final ag.b f36894b;
    public final TL_stars.TL_starGiftUnique f36895c;
    public final long d;
    public final Object e;
    public final Object f36896f;

    public hp0(gq0 gq0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ep0 ep0Var) {
        this.e = gq0Var;
        this.f36894b = bVar;
        this.f36895c = tL_starGiftUnique;
        this.d = j10;
        this.f36896f = ep0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36893a) {
            case 0:
                gq0.V((gq0) this.e, this.f36894b, this.f36895c, this.d, (ep0) this.f36896f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.a2) this.f36896f, this.f36894b, this.f36895c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public hp0(yh.f4 f4Var, org.telegram.ui.ActionBar.a2 a2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f36896f = a2Var;
        this.f36894b = bVar;
        this.f36895c = tL_starGiftUnique;
        this.d = j10;
    }
}
