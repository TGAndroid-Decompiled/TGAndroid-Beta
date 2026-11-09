package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ll0 implements org.telegram.messenger.c20 {
    public final int f47639a = 0;
    public final cg.b f47640b;
    public final TL_stars.TL_starGiftUnique f47641c;
    public final long d;
    public final Object f47642e;
    public final Object f47643f;

    public ll0(jm0 jm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var) {
        this.f47642e = jm0Var;
        this.f47640b = bVar;
        this.f47641c = tL_starGiftUnique;
        this.d = j3;
        this.f47643f = kl0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47639a) {
            case 0:
                jm0.a0((jm0) this.f47642e, this.f47640b, this.f47641c, this.d, (kl0) this.f47643f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zh.l3 l3Var = (zh.l3) this.f47642e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.f47643f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    bi.h6 h6Var = new bi.h6(this.f47640b, tL_payments_paymentFormStarGift);
                    Context context = l3Var.getContext();
                    org.telegram.ui.ActionBar.g6 g6Var = l3Var.I0;
                    int i7 = l3Var.f28621a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f47641c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String m10 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new bi.k6(context, g6Var, tL_starGiftUnique, h6Var, i7, j3, m10, true, new bi.mc(l3Var, tL_starGiftUnique, j3, 2)).b();
                    return;
                }
                return;
        }
    }

    public ll0(zh.l3 l3Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f47642e = l3Var;
        this.f47643f = u1Var;
        this.f47640b = bVar;
        this.f47641c = tL_starGiftUnique;
        this.d = j3;
    }
}
