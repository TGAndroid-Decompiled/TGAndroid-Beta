package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f36467a = 0;
    public final zf.b f36468b;
    public final TL_stars.TL_starGiftUnique f36469c;
    public final long d;
    public final Object f36470e;
    public final Object f36471f;

    public cp0(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.f36470e = cq0Var;
        this.f36468b = bVar;
        this.f36469c = tL_starGiftUnique;
        this.d = j3;
        this.f36471f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36467a) {
            case 0:
                cq0.V((cq0) this.f36470e, this.f36468b, this.f36469c, this.d, (zo0) this.f36471f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.g4.V((xh.g4) this.f36470e, (org.telegram.ui.ActionBar.a2) this.f36471f, this.f36468b, this.f36469c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(xh.g4 g4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f36470e = g4Var;
        this.f36471f = a2Var;
        this.f36468b = bVar;
        this.f36469c = tL_starGiftUnique;
        this.d = j3;
    }
}
