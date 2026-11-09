package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lv extends qj0 {
    public boolean f35858e3;
    public boolean f35859f3;
    public final hy f35860g3;

    public lv(hy hyVar, Context context) {
        super(context, null);
        this.f35860g3 = hyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        hy hyVar = this.f35860g3;
        boolean q10 = p10.q(motionEvent, hyVar.f34430h0, hyVar.f34429g2, this.f37381n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        hy hyVar = this.f35860g3;
        if (hyVar.f34455q0 && hyVar.f34447n0.G > 1) {
            this.f35858e3 = true;
            hyVar.f34433i0.h1(0, 0);
            hyVar.f34449o0.setVisibility(0);
            hyVar.f34452p0.k(0, 0);
            hyVar.f34455q0 = false;
            this.f35858e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        hy.f(hyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f35859f3) {
            this.f35860g3.f34447n0.f();
            this.f35859f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35858e3) {
            return;
        }
        super.requestLayout();
    }
}
