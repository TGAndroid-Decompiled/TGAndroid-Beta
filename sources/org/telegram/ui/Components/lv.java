package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lv extends pj0 {
    public boolean f35798e3;
    public boolean f35799f3;
    public final hy f35800g3;

    public lv(hy hyVar, Context context) {
        super(context, null);
        this.f35800g3 = hyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        hy hyVar = this.f35800g3;
        boolean q10 = p10.q(motionEvent, hyVar.f34415h0, hyVar.f34414g2, this.f36981n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        hy hyVar = this.f35800g3;
        if (hyVar.f34440q0 && hyVar.f34432n0.G > 1) {
            this.f35798e3 = true;
            hyVar.f34418i0.h1(0, 0);
            hyVar.f34434o0.setVisibility(0);
            hyVar.f34437p0.k(0, 0);
            hyVar.f34440q0 = false;
            this.f35798e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        hy.f(hyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f35799f3) {
            this.f35800g3.f34432n0.f();
            this.f35799f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35798e3) {
            return;
        }
        super.requestLayout();
    }
}
