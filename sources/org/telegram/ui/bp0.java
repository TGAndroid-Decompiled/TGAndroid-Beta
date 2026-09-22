package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 implements Utilities.Callback {
    public final int f32560a = 0;
    public final zf.b f32561b;
    public final TL_stars.TL_starGiftUnique f32562c;
    public final long d;
    public final Object e;
    public final Object f32563f;

    public bp0(aq0 aq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yo0 yo0Var) {
        this.e = aq0Var;
        this.f32561b = bVar;
        this.f32562c = tL_starGiftUnique;
        this.d = j3;
        this.f32563f = yo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32560a) {
            case 0:
                aq0.V((aq0) this.e, this.f32561b, this.f32562c, this.d, (yo0) this.f32563f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.g4.U((xh.g4) this.e, (org.telegram.ui.ActionBar.b2) this.f32563f, this.f32561b, this.f32562c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public bp0(xh.g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = g4Var;
        this.f32563f = b2Var;
        this.f32561b = bVar;
        this.f32562c = tL_starGiftUnique;
        this.d = j3;
    }
}
