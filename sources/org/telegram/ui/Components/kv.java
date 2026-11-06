package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kv extends pj0 {
    public boolean f35420e3;
    public boolean f35421f3;
    public final gy f35422g3;

    public kv(gy gyVar, Context context) {
        super(context, null);
        this.f35422g3 = gyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        gy gyVar = this.f35422g3;
        boolean q10 = p10.q(motionEvent, gyVar.f34047h0, gyVar.f34046g2, this.f36955n2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        gy gyVar = this.f35422g3;
        if (gyVar.f34072q0 && gyVar.f34064n0.G > 1) {
            this.f35420e3 = true;
            gyVar.f34050i0.h1(0, 0);
            gyVar.f34066o0.setVisibility(0);
            gyVar.f34069p0.k(0, 0);
            gyVar.f34072q0 = false;
            this.f35420e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        gy.f(gyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f35421f3) {
            this.f35422g3.f34064n0.f();
            this.f35421f3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35420e3) {
            return;
        }
        super.requestLayout();
    }
}
