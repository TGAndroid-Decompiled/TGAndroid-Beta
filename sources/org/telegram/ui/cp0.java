package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f35514a = 0;
    public final zf.b f35515b;
    public final TL_stars.TL_starGiftUnique f35516c;
    public final long d;
    public final Object f35517e;
    public final Object f35518f;

    public cp0(bq0 bq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.f35517e = bq0Var;
        this.f35515b = bVar;
        this.f35516c = tL_starGiftUnique;
        this.d = j3;
        this.f35518f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35514a) {
            case 0:
                bq0.V((bq0) this.f35517e, this.f35515b, this.f35516c, this.d, (zo0) this.f35518f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.U((yh.f4) this.f35517e, (org.telegram.ui.ActionBar.b2) this.f35518f, this.f35515b, this.f35516c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f35517e = f4Var;
        this.f35518f = b2Var;
        this.f35515b = bVar;
        this.f35516c = tL_starGiftUnique;
        this.d = j3;
    }
}
