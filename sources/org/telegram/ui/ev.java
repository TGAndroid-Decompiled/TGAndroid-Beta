package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ev extends v4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final xw L;
    public final yw M;

    public ev(yw ywVar, xw xwVar) {
        this.M = ywVar;
        this.L = xwVar;
    }

    @Override
    public final int R0() {
        xw xwVar = this.L;
        if (xwVar.f51779s == 0 && this.M.l4() && xwVar.f51780w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.f25212a;
        try {
            super.b0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new dv(this.L, 0));
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
        if (xwVar.f51772a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bi.de(22, this, xwVar));
            this.K.addListener(new va(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.L.f51772a.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    @Override
    public final int o0(int r24, v4.v0 r25, v4.a1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ev.o0(int, v4.v0, v4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        if (this.M.l4() && i7 == 1) {
            super.v0(recyclerView, a1Var, i7);
            return;
        }
        mi.m mVar = new mi.m(recyclerView.getContext(), 0);
        mVar.f57225a = i7;
        w0(mVar);
    }
}
