package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jl0 implements org.telegram.messenger.c20 {
    public final int f46996a = 0;
    public final cg.b f46997b;
    public final TL_stars.TL_starGiftUnique f46998c;
    public final long d;
    public final Object f46999e;
    public final Object f47000f;

    public jl0(hm0 hm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var) {
        this.f46999e = hm0Var;
        this.f46997b = bVar;
        this.f46998c = tL_starGiftUnique;
        this.d = j3;
        this.f47000f = il0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46996a) {
            case 0:
                hm0.a0((hm0) this.f46999e, this.f46997b, this.f46998c, this.d, (il0) this.f47000f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zh.k3 k3Var = (zh.k3) this.f46999e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.f47000f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    bi.h6 h6Var = new bi.h6(this.f46997b, tL_payments_paymentFormStarGift);
                    Context context = k3Var.getContext();
                    org.telegram.ui.ActionBar.f6 f6Var = k3Var.I0;
                    int i7 = k3Var.f28616a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f46998c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String m10 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new bi.k6(context, f6Var, tL_starGiftUnique, h6Var, i7, j3, m10, true, new bi.mc(k3Var, tL_starGiftUnique, j3, 2)).b();
                    return;
                }
                return;
        }
    }

    public jl0(zh.k3 k3Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f46999e = k3Var;
        this.f47000f = u1Var;
        this.f46997b = bVar;
        this.f46998c = tL_starGiftUnique;
        this.d = j3;
    }
}
