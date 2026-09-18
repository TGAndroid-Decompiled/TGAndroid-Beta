package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f32730a = 0;
    public final zf.b f32731b;
    public final TL_stars.TL_starGiftUnique f32732c;
    public final long d;
    public final Object e;
    public final Object f32733f;

    public cp0(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.e = cq0Var;
        this.f32731b = bVar;
        this.f32732c = tL_starGiftUnique;
        this.d = j3;
        this.f32733f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32730a) {
            case 0:
                cq0.V((cq0) this.e, this.f32731b, this.f32732c, this.d, (zo0) this.f32733f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.U((xh.h4) this.e, (org.telegram.ui.ActionBar.b2) this.f32733f, this.f32731b, this.f32732c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = h4Var;
        this.f32733f = b2Var;
        this.f32731b = bVar;
        this.f32732c = tL_starGiftUnique;
        this.d = j3;
    }
}
