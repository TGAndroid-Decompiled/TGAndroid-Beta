package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class dv extends v4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final xw L;
    public final yw M;

    public dv(yw ywVar, xw xwVar) {
        this.M = ywVar;
        this.L = xwVar;
    }

    @Override
    public final int R0() {
        xw xwVar = this.L;
        if (xwVar.f53342s == 0 && this.M.l4() && xwVar.f53343w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(v4.w0 w0Var, v4.b1 b1Var) {
        boolean z10 = org.telegram.messenger.r2.f26206a;
        try {
            super.b0(w0Var, b1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new cv(this.L, 0));
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
        xw xwVar = this.L;
        if (xwVar.f53335a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ch.v(21, this, xwVar));
            this.K.addListener(new org.telegram.ui.Cells.w9(this, 25));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.er.f34419f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.L.f53335a.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    @Override
    public final int o0(int r24, v4.w0 r25, v4.b1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dv.o0(int, v4.w0, v4.b1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        if (this.M.l4() && i7 == 1) {
            super.v0(recyclerView, b1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.f58480a = i7;
        w0(lVar);
    }
}
