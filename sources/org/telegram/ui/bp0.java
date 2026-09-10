package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 implements Utilities.Callback {
    public final int f31312a = 0;
    public final yf.b f31313b;
    public final TL_stars.TL_starGiftUnique f31314c;
    public final long d;
    public final Object e;
    public final Object f31315f;

    public bp0(bq0 bq0Var, yf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yo0 yo0Var) {
        this.e = bq0Var;
        this.f31313b = bVar;
        this.f31314c = tL_starGiftUnique;
        this.d = j3;
        this.f31315f = yo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31312a) {
            case 0:
                bq0.V((bq0) this.e, this.f31313b, this.f31314c, this.d, (yo0) this.f31315f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                wh.g4.U((wh.g4) this.e, (org.telegram.ui.ActionBar.d2) this.f31315f, this.f31313b, this.f31314c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public bp0(wh.g4 g4Var, org.telegram.ui.ActionBar.d2 d2Var, yf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = g4Var;
        this.f31315f = d2Var;
        this.f31313b = bVar;
        this.f31314c = tL_starGiftUnique;
        this.d = j3;
    }
}
