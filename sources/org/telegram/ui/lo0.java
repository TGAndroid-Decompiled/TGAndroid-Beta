package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lo0 implements Utilities.Callback {
    public final int f38855a = 0;
    public final ag.c f38856b;
    public final TL_stars.TL_starGiftUnique f38857c;
    public final long d;
    public final Object e;
    public final Object f38858f;

    public lo0(kp0 kp0Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, io0 io0Var) {
        this.e = kp0Var;
        this.f38856b = cVar;
        this.f38857c = tL_starGiftUnique;
        this.d = j10;
        this.f38858f = io0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38855a) {
            case 0:
                kp0.V((kp0) this.e, this.f38856b, this.f38857c, this.d, (io0) this.f38858f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.b2) this.f38858f, this.f38856b, this.f38857c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public lo0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f38858f = b2Var;
        this.f38856b = cVar;
        this.f38857c = tL_starGiftUnique;
        this.d = j10;
    }
}
