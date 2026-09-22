package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class nw extends yl0 {
    public boolean X2;
    public boolean Y2;
    public final kz Z2;

    public nw(kz kzVar, Context context) {
        super(context, null);
        this.Z2 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.Z2;
        boolean r10 = q6.r(motionEvent, kzVar.f25873h0, kzVar.f25872g2, this.f30704p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.Z2;
        if (kzVar.f25899q0 && kzVar.f25890n0.G > 1) {
            this.X2 = true;
            kzVar.f25876i0.h1(0, 0);
            kzVar.f25893o0.setVisibility(0);
            kzVar.f25896p0.k(0, 0);
            kzVar.f25899q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kz.f(kzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.Y2) {
            this.Z2.f25890n0.l();
            this.Y2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
