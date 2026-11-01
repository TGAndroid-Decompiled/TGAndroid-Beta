package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class cu0 extends s4.s0 {
    public final int f25240a;
    public final Object f25241b;

    public cu0(Object obj, int i10) {
        this.f25240a = i10;
        this.f25241b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        dk0 dk0Var;
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.f25240a) {
            case 4:
                f61 f61Var = (f61) this.f25241b;
                ag.b1 b1Var = f61Var.f26088k1;
                if (i10 == 0 && f61Var.f26100x1) {
                    if (org.telegram.messenger.i0.L(13.0f) + f61Var.f26097u1 + f61Var.f21615s0 < org.telegram.messenger.i0.f16166m * 2 && b1Var.canScrollVertically(1) && (dk0Var = (dk0) b1Var.K(0)) != null) {
                        View view = dk0Var.f47909a;
                        if (view.getTop() > 0) {
                            b1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if (i10 == 1 && (y8Var = ((org.telegram.ui.Wallet.b6) this.f25241b).f34252i0) != null) {
                    y8Var.a();
                    return;
                }
                return;
            case 14:
                qh.c cVar = (qh.c) this.f25241b;
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                cVar.f45590c0 = z10;
                if (i10 != 0) {
                    cVar.f45586a0 = qh.c.b();
                }
                cVar.invalidate();
                return;
            case 15:
                if (i10 == 0) {
                    ((qh.g0) this.f25241b).f45737w = false;
                    return;
                }
                return;
            case 23:
                th.y3 y3Var = (th.y3) this.f25241b;
                if (i10 == 0) {
                    y3Var.V = true;
                    y3Var.invalidate();
                }
                if (i10 == 1) {
                    y3Var.V = false;
                    a5.a aVar = y3Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f282c).cancel();
                        aVar.f282c = null;
                    }
                    org.telegram.messenger.i0.v1(y3Var);
                    return;
                }
                return;
            case 25:
                vh.l1 l1Var = (vh.l1) this.f25241b;
                if (i10 == 0 && l1Var.f51463n >= 0.0f && !l1Var.f51460b.canScrollVertically(-1)) {
                    l1Var.f51463n = -1.0f;
                    return;
                }
                return;
            case 26:
                if (i10 == 0) {
                    vh.f5 f5Var = (vh.f5) this.f25241b;
                    if (f5Var.a2) {
                        f5Var.a2 = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cu0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
