package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class jv extends tj0 {
    public boolean f35201f3;
    public boolean f35202g3;
    public final ey f35203h3;

    public jv(ey eyVar, Context context) {
        super(context, null);
        this.f35203h3 = eyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ey eyVar = this.f35203h3;
        boolean q10 = p10.q(motionEvent, eyVar.f33545i0, eyVar.f33544h2, this.f38460o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ey eyVar = this.f35203h3;
        if (eyVar.f33571r0 && eyVar.f33561o0.H > 1) {
            this.f35201f3 = true;
            eyVar.f33548j0.h1(0, 0);
            eyVar.f33564p0.setVisibility(0);
            eyVar.f33567q0.k(0, 0);
            eyVar.f33571r0 = false;
            this.f35201f3 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        ey.f(eyVar, true);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (!this.f35202g3) {
            this.f35203h3.f33561o0.f();
            this.f35202g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35201f3) {
            return;
        }
        super.requestLayout();
    }
}
