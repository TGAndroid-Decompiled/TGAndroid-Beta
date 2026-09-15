package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 implements Utilities.Callback {
    public final int f32565a = 0;
    public final zf.b f32566b;
    public final TL_stars.TL_starGiftUnique f32567c;
    public final long d;
    public final Object e;
    public final Object f32568f;

    public bp0(aq0 aq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yo0 yo0Var) {
        this.e = aq0Var;
        this.f32566b = bVar;
        this.f32567c = tL_starGiftUnique;
        this.d = j3;
        this.f32568f = yo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32565a) {
            case 0:
                aq0.V((aq0) this.e, this.f32566b, this.f32567c, this.d, (yo0) this.f32568f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.g4.U((xh.g4) this.e, (org.telegram.ui.ActionBar.b2) this.f32568f, this.f32566b, this.f32567c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public bp0(xh.g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = g4Var;
        this.f32568f = b2Var;
        this.f32566b = bVar;
        this.f32567c = tL_starGiftUnique;
        this.d = j3;
    }
}
