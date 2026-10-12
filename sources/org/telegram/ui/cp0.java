package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f36469a = 0;
    public final zf.b f36470b;
    public final TL_stars.TL_starGiftUnique f36471c;
    public final long d;
    public final Object f36472e;
    public final Object f36473f;

    public cp0(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.f36472e = cq0Var;
        this.f36470b = bVar;
        this.f36471c = tL_starGiftUnique;
        this.d = j3;
        this.f36473f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36469a) {
            case 0:
                cq0.V((cq0) this.f36472e, this.f36470b, this.f36471c, this.d, (zo0) this.f36473f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.g4.V((xh.g4) this.f36472e, (org.telegram.ui.ActionBar.a2) this.f36473f, this.f36470b, this.f36471c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(xh.g4 g4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f36472e = g4Var;
        this.f36473f = a2Var;
        this.f36470b = bVar;
        this.f36471c = tL_starGiftUnique;
        this.d = j3;
    }
}
