package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wv extends tk0 {
    public boolean f32257e3;
    public boolean f32258f3;
    public final vy f32259g3;

    public wv(vy vyVar, Context context) {
        super(context, null);
        this.f32259g3 = vyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        vy vyVar = this.f32259g3;
        boolean q6 = p5.q(motionEvent, vyVar.f31880h0, vyVar.f31879g2, this.f30625n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.f32259g3;
        if (vyVar.f31906q0 && vyVar.f31897n0.G > 1) {
            this.f32257e3 = true;
            vyVar.f31883i0.h1(0, 0);
            vyVar.f31900o0.setVisibility(0);
            vyVar.f31903p0.k(0, 0);
            vyVar.f31906q0 = false;
            this.f32257e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vy.f(vyVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f32258f3) {
            this.f32259g3.f31897n0.f();
            this.f32258f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f32257e3) {
            return;
        }
        super.requestLayout();
    }
}
