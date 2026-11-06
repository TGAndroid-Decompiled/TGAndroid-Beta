package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jl0 implements org.telegram.messenger.c20 {
    public final int f46999a = 0;
    public final cg.b f47000b;
    public final TL_stars.TL_starGiftUnique f47001c;
    public final long d;
    public final Object f47002e;
    public final Object f47003f;

    public jl0(hm0 hm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var) {
        this.f47002e = hm0Var;
        this.f47000b = bVar;
        this.f47001c = tL_starGiftUnique;
        this.d = j3;
        this.f47003f = il0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46999a) {
            case 0:
                hm0.a0((hm0) this.f47002e, this.f47000b, this.f47001c, this.d, (il0) this.f47003f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zh.l3 l3Var = (zh.l3) this.f47002e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.f47003f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    bi.h6 h6Var = new bi.h6(this.f47000b, tL_payments_paymentFormStarGift);
                    Context context = l3Var.getContext();
                    org.telegram.ui.ActionBar.f6 f6Var = l3Var.I0;
                    int i7 = l3Var.f28612a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f47001c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String m10 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new bi.k6(context, f6Var, tL_starGiftUnique, h6Var, i7, j3, m10, true, new bi.mc(l3Var, tL_starGiftUnique, j3, 2)).b();
                    return;
                }
                return;
        }
    }

    public jl0(zh.l3 l3Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f47002e = l3Var;
        this.f47003f = u1Var;
        this.f47000b = bVar;
        this.f47001c = tL_starGiftUnique;
        this.d = j3;
    }
}
