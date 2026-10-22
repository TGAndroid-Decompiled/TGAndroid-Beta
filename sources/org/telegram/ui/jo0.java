package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jo0 implements Utilities.Callback {
    public final int f38292a = 0;
    public final ag.b f38293b;
    public final TL_stars.TL_starGiftUnique f38294c;
    public final long d;
    public final Object e;
    public final Object f38295f;

    public jo0(ip0 ip0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, go0 go0Var) {
        this.e = ip0Var;
        this.f38293b = bVar;
        this.f38294c = tL_starGiftUnique;
        this.d = j10;
        this.f38295f = go0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38292a) {
            case 0:
                ip0.V((ip0) this.e, this.f38293b, this.f38294c, this.d, (go0) this.f38295f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.b2) this.f38295f, this.f38293b, this.f38294c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public jo0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f38295f = b2Var;
        this.f38293b = bVar;
        this.f38294c = tL_starGiftUnique;
        this.d = j10;
    }
}
