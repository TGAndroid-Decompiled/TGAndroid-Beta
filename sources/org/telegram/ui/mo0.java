package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mo0 implements Utilities.Callback {
    public final int f39630a = 0;
    public final ag.b f39631b;
    public final TL_stars.TL_starGiftUnique f39632c;
    public final long d;
    public final Object e;
    public final Object f39633f;

    public mo0(kp0 kp0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, jo0 jo0Var) {
        this.e = kp0Var;
        this.f39631b = bVar;
        this.f39632c = tL_starGiftUnique;
        this.d = j10;
        this.f39633f = jo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39630a) {
            case 0:
                kp0.V((kp0) this.e, this.f39631b, this.f39632c, this.d, (jo0) this.f39633f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.U((yh.f4) this.e, (org.telegram.ui.ActionBar.c2) this.f39633f, this.f39631b, this.f39632c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public mo0(yh.f4 f4Var, org.telegram.ui.ActionBar.c2 c2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f39633f = c2Var;
        this.f39631b = bVar;
        this.f39632c = tL_starGiftUnique;
        this.d = j10;
    }
}
