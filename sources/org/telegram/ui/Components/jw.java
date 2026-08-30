package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class jw extends sl0 {
    public boolean U2;
    public boolean V2;
    public final kz W2;

    public jw(kz kzVar, Context context) {
        super(context, null);
        this.W2 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
        kz kzVar = this.W2;
        boolean r10 = q10.r(motionEvent, kzVar.f26423e0, kzVar.f26422d2, this.f28750m2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        kz kzVar = this.W2;
        if (kzVar.f26450n0 && kzVar.f26442k0.D > 1) {
            this.U2 = true;
            kzVar.f26427f0.h1(0, 0);
            kzVar.f26445l0.setVisibility(0);
            kzVar.m0.k(0, 0);
            kzVar.f26450n0 = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        kz.f(kzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.V2) {
            this.W2.f26442k0.l();
            this.V2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
