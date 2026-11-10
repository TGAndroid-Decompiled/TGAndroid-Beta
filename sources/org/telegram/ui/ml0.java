package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ml0 implements org.telegram.messenger.c20 {
    public final int f47983a = 0;
    public final cg.b f47984b;
    public final TL_stars.TL_starGiftUnique f47985c;
    public final long d;
    public final Object f47986e;
    public final Object f47987f;

    public ml0(km0 km0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var) {
        this.f47986e = km0Var;
        this.f47984b = bVar;
        this.f47985c = tL_starGiftUnique;
        this.d = j3;
        this.f47987f = ll0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47983a) {
            case 0:
                km0.a0((km0) this.f47986e, this.f47984b, this.f47985c, this.d, (ll0) this.f47987f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zh.l3 l3Var = (zh.l3) this.f47986e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.f47987f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    bi.h6 h6Var = new bi.h6(this.f47984b, tL_payments_paymentFormStarGift);
                    Context context = l3Var.getContext();
                    org.telegram.ui.ActionBar.h6 h6Var2 = l3Var.I0;
                    int i7 = l3Var.f28669a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f47985c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String m10 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new bi.k6(context, h6Var2, tL_starGiftUnique, h6Var, i7, j3, m10, true, new bi.mc(l3Var, tL_starGiftUnique, j3, 2)).b();
                    return;
                }
                return;
        }
    }

    public ml0(zh.l3 l3Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f47986e = l3Var;
        this.f47987f = u1Var;
        this.f47984b = bVar;
        this.f47985c = tL_starGiftUnique;
        this.d = j3;
    }
}
