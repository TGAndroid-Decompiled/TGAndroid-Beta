package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class no0 implements Utilities.Callback {
    public final int f39935a = 0;
    public final ag.b f39936b;
    public final TL_stars.TL_starGiftUnique f39937c;
    public final long d;
    public final Object e;
    public final Object f39938f;

    public no0(lp0 lp0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ko0 ko0Var) {
        this.e = lp0Var;
        this.f39936b = bVar;
        this.f39937c = tL_starGiftUnique;
        this.d = j10;
        this.f39938f = ko0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39935a) {
            case 0:
                lp0.V((lp0) this.e, this.f39936b, this.f39937c, this.d, (ko0) this.f39938f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.U((yh.f4) this.e, (org.telegram.ui.ActionBar.c2) this.f39938f, this.f39936b, this.f39937c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public no0(yh.f4 f4Var, org.telegram.ui.ActionBar.c2 c2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f39938f = c2Var;
        this.f39936b = bVar;
        this.f39937c = tL_starGiftUnique;
        this.d = j10;
    }
}
