package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jo0 implements Utilities.Callback {
    public final int f38289a = 0;
    public final ag.b f38290b;
    public final TL_stars.TL_starGiftUnique f38291c;
    public final long d;
    public final Object e;
    public final Object f38292f;

    public jo0(ip0 ip0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, go0 go0Var) {
        this.e = ip0Var;
        this.f38290b = bVar;
        this.f38291c = tL_starGiftUnique;
        this.d = j10;
        this.f38292f = go0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38289a) {
            case 0:
                ip0.V((ip0) this.e, this.f38290b, this.f38291c, this.d, (go0) this.f38292f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.b2) this.f38292f, this.f38290b, this.f38291c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public jo0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f38292f = b2Var;
        this.f38290b = bVar;
        this.f38291c = tL_starGiftUnique;
        this.d = j10;
    }
}
