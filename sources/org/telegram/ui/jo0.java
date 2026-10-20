package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jo0 implements Utilities.Callback {
    public final int f38288a = 0;
    public final ag.b f38289b;
    public final TL_stars.TL_starGiftUnique f38290c;
    public final long d;
    public final Object e;
    public final Object f38291f;

    public jo0(ip0 ip0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, go0 go0Var) {
        this.e = ip0Var;
        this.f38289b = bVar;
        this.f38290c = tL_starGiftUnique;
        this.d = j10;
        this.f38291f = go0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38288a) {
            case 0:
                ip0.V((ip0) this.e, this.f38289b, this.f38290c, this.d, (go0) this.f38291f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.b2) this.f38291f, this.f38289b, this.f38290c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public jo0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f38291f = b2Var;
        this.f38289b = bVar;
        this.f38290c = tL_starGiftUnique;
        this.d = j10;
    }
}
