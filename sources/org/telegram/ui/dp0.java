package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 implements Utilities.Callback {
    public final int f33198a = 0;
    public final zf.b f33199b;
    public final TL_stars.TL_starGiftUnique f33200c;
    public final long d;
    public final Object e;
    public final Object f33201f;

    public dp0(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ap0 ap0Var) {
        this.e = cq0Var;
        this.f33199b = bVar;
        this.f33200c = tL_starGiftUnique;
        this.d = j3;
        this.f33201f = ap0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33198a) {
            case 0:
                cq0.V((cq0) this.e, this.f33199b, this.f33200c, this.d, (ap0) this.f33201f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.g4.U((xh.g4) this.e, (org.telegram.ui.ActionBar.c2) this.f33201f, this.f33199b, this.f33200c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public dp0(xh.g4 g4Var, org.telegram.ui.ActionBar.c2 c2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = g4Var;
        this.f33201f = c2Var;
        this.f33199b = bVar;
        this.f33200c = tL_starGiftUnique;
        this.d = j3;
    }
}
