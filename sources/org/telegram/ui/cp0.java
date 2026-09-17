package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f35515a = 0;
    public final zf.b f35516b;
    public final TL_stars.TL_starGiftUnique f35517c;
    public final long d;
    public final Object f35518e;
    public final Object f35519f;

    public cp0(bq0 bq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.f35518e = bq0Var;
        this.f35516b = bVar;
        this.f35517c = tL_starGiftUnique;
        this.d = j3;
        this.f35519f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35515a) {
            case 0:
                bq0.V((bq0) this.f35518e, this.f35516b, this.f35517c, this.d, (zo0) this.f35519f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.U((yh.f4) this.f35518e, (org.telegram.ui.ActionBar.b2) this.f35519f, this.f35516b, this.f35517c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f35518e = f4Var;
        this.f35519f = b2Var;
        this.f35516b = bVar;
        this.f35517c = tL_starGiftUnique;
        this.d = j3;
    }
}
