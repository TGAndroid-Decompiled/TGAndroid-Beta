package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kv extends pj0 {
    public boolean f35429e3;
    public boolean f35430f3;
    public final gy f35431g3;

    public kv(gy gyVar, Context context) {
        super(context, null);
        this.f35431g3 = gyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        gy gyVar = this.f35431g3;
        boolean q10 = p10.q(motionEvent, gyVar.f34039h0, gyVar.f34038g2, this.f36939n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        gy gyVar = this.f35431g3;
        if (gyVar.f34064q0 && gyVar.f34056n0.G > 1) {
            this.f35429e3 = true;
            gyVar.f34042i0.h1(0, 0);
            gyVar.f34058o0.setVisibility(0);
            gyVar.f34061p0.k(0, 0);
            gyVar.f34064q0 = false;
            this.f35429e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        gy.f(gyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f35430f3) {
            this.f35431g3.f34056n0.f();
            this.f35430f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35429e3) {
            return;
        }
        super.requestLayout();
    }
}
