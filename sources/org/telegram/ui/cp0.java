package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f32823a = 0;
    public final zf.b f32824b;
    public final TL_stars.TL_starGiftUnique f32825c;
    public final long d;
    public final Object e;
    public final Object f32826f;

    public cp0(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.e = cq0Var;
        this.f32824b = bVar;
        this.f32825c = tL_starGiftUnique;
        this.d = j3;
        this.f32826f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32823a) {
            case 0:
                cq0.V((cq0) this.e, this.f32824b, this.f32825c, this.d, (zo0) this.f32826f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.U((xh.h4) this.e, (org.telegram.ui.ActionBar.b2) this.f32826f, this.f32824b, this.f32825c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = h4Var;
        this.f32826f = b2Var;
        this.f32824b = bVar;
        this.f32825c = tL_starGiftUnique;
        this.d = j3;
    }
}
