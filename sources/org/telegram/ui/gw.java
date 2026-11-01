package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw extends s4.a0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final yx L;
    public final zx M;

    public gw(zx zxVar, yx yxVar) {
        this.M = zxVar;
        this.L = yxVar;
    }

    @Override
    public final int R0() {
        yx yxVar = this.L;
        if (yxVar.f43739s == 0 && this.M.l4() && yxVar.f43740w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.f18578a;
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new fw(this.L, 0));
        }
    }

    @Override
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        yx yxVar = this.L;
        if (yxVar.f43733a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ag.p2(21, this, yxVar));
            this.K.addListener(new org.telegram.ui.Components.voip.i2(this, 5));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f43733a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r24, hf.e r25, s4.z0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gw.o0(int, hf.e, s4.z0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.M.l4() && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.f48056a = i10;
        w0(pVar);
    }
}
