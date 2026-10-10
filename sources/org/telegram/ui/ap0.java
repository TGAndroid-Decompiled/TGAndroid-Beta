package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 implements Utilities.Callback {
    public final int f36017a = 0;
    public final zf.b f36018b;
    public final TL_stars.TL_starGiftUnique f36019c;
    public final long d;
    public final Object f36020e;
    public final Object f36021f;

    public ap0(aq0 aq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, xo0 xo0Var) {
        this.f36020e = aq0Var;
        this.f36018b = bVar;
        this.f36019c = tL_starGiftUnique;
        this.d = j3;
        this.f36021f = xo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36017a) {
            case 0:
                aq0.V((aq0) this.f36020e, this.f36018b, this.f36019c, this.d, (xo0) this.f36021f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.V((xh.h4) this.f36020e, (org.telegram.ui.ActionBar.b2) this.f36021f, this.f36018b, this.f36019c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public ap0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f36020e = h4Var;
        this.f36021f = b2Var;
        this.f36018b = bVar;
        this.f36019c = tL_starGiftUnique;
        this.d = j3;
    }
}
