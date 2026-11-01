package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wv extends uk0 {
    public boolean f32324e3;
    public boolean f32325f3;
    public final vy f32326g3;

    public wv(vy vyVar, Context context) {
        super(context, null);
        this.f32326g3 = vyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
        vy vyVar = this.f32326g3;
        boolean q6 = p5.q(motionEvent, vyVar.f31958h0, vyVar.f31957g2, this.f31008n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.f32326g3;
        if (vyVar.f31984q0 && vyVar.f31975n0.G > 1) {
            this.f32324e3 = true;
            vyVar.f31961i0.h1(0, 0);
            vyVar.f31978o0.setVisibility(0);
            vyVar.f31981p0.k(0, 0);
            vyVar.f31984q0 = false;
            this.f32324e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vy.f(vyVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f32325f3) {
            this.f32326g3.f31975n0.f();
            this.f32325f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f32324e3) {
            return;
        }
        super.requestLayout();
    }
}
