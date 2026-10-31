package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class bu0 extends s4.s0 {
    public final int f24880a;
    public final Object f24881b;

    public bu0(Object obj, int i10) {
        this.f24880a = i10;
        this.f24881b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ck0 ck0Var;
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.f24880a) {
            case 4:
                e61 e61Var = (e61) this.f24881b;
                ag.b1 b1Var = e61Var.f25719k1;
                if (i10 == 0 && e61Var.f25731x1) {
                    if (org.telegram.messenger.i0.L(13.0f) + e61Var.f25728u1 + e61Var.f21614s0 < org.telegram.messenger.i0.f16020m * 2 && b1Var.canScrollVertically(1) && (ck0Var = (ck0) b1Var.K(0)) != null) {
                        View view = ck0Var.f47898a;
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
                if (i10 == 1 && (y8Var = ((org.telegram.ui.Wallet.b6) this.f24881b).f34250i0) != null) {
                    y8Var.a();
                    return;
                }
                return;
            case 14:
                qh.c cVar = (qh.c) this.f24881b;
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                cVar.f45579c0 = z10;
                if (i10 != 0) {
                    cVar.f45575a0 = qh.c.b();
                }
                cVar.invalidate();
                return;
            case 15:
                if (i10 == 0) {
                    ((qh.g0) this.f24881b).f45726w = false;
                    return;
                }
                return;
            case 23:
                th.y3 y3Var = (th.y3) this.f24881b;
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
                vh.l1 l1Var = (vh.l1) this.f24881b;
                if (i10 == 0 && l1Var.f51448n >= 0.0f && !l1Var.f51445b.canScrollVertically(-1)) {
                    l1Var.f51448n = -1.0f;
                    return;
                }
                return;
            case 26:
                if (i10 == 0) {
                    vh.f5 f5Var = (vh.f5) this.f24881b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bu0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
