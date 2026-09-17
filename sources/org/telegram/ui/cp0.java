package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback {
    public final int f35542a = 0;
    public final zf.b f35543b;
    public final TL_stars.TL_starGiftUnique f35544c;
    public final long d;
    public final Object f35545e;
    public final Object f35546f;

    public cp0(bq0 bq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.f35545e = bq0Var;
        this.f35543b = bVar;
        this.f35544c = tL_starGiftUnique;
        this.d = j3;
        this.f35546f = zo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35542a) {
            case 0:
                bq0.V((bq0) this.f35545e, this.f35543b, this.f35544c, this.d, (zo0) this.f35546f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.U((yh.f4) this.f35545e, (org.telegram.ui.ActionBar.b2) this.f35546f, this.f35543b, this.f35544c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public cp0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f35545e = f4Var;
        this.f35546f = b2Var;
        this.f35543b = bVar;
        this.f35544c = tL_starGiftUnique;
        this.d = j3;
    }
}
