package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gv extends v4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final bx L;
    public final cx M;

    public gv(cx cxVar, bx bxVar) {
        this.M = cxVar;
        this.L = bxVar;
    }

    @Override
    public final int R0() {
        bx bxVar = this.L;
        if (bxVar.f46328s == 0 && this.M.n4() && bxVar.f46329w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.f26749a;
        try {
            super.b0(x0Var, c1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new fv(this.L, 0));
        }
    }

    @Override
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        bx bxVar = this.L;
        if (bxVar.f46321a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ch.w(21, this, bxVar));
            this.K.addListener(new org.telegram.ui.Cells.y9(this, 25));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.nr.f37956f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.L.f46321a.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    @Override
    public final int o0(int r24, v4.x0 r25, v4.c1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gv.o0(int, v4.x0, v4.c1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        if (this.M.n4() && i7 == 1) {
            super.v0(recyclerView, c1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.f59105a = i7;
        w0(lVar);
    }
}
