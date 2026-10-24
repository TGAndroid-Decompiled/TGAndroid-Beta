package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends pg.d {
    public boolean Z2;
    public final rz f33058a3;

    public yw(rz rzVar, Context context) {
        super(context, null);
        this.f33058a3 = rzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f33058a3.f30344n2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        bh.f fVar;
        rz rzVar = this.f33058a3;
        mz mzVar = rzVar.f30383z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = rzVar.f30333j2) != null) {
            fVar.f(i10, i11);
        }
        if (rzVar.C0 != null) {
            cx cxVar = rzVar.B0;
            if (rzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            cxVar.setUnderlineHeight(i12);
        }
        if (mzVar != null && getAdapter() == mzVar && mzVar.d == 0) {
            mz mzVar2 = mzVar.O.f28104w;
            if (!mzVar2.Q.G0.F && !mzVar2.f28729y) {
                if (rzVar.E0.N0() + 50 > mzVar.h()) {
                    kz kzVar = mzVar.O;
                    Objects.requireNonNull(kzVar);
                    AndroidUtilities.runOnUIThread(new xw(kzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rz rzVar = this.f33058a3;
        if (!rzVar.f30318f) {
            org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
            yw ywVar = rzVar.D0;
            rzVar.getMeasuredHeight();
            boolean p5 = o10.p(motionEvent, ywVar, rzVar.f30324g2, this.f28396n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rz rzVar = this.f33058a3;
        if (rzVar.I0 && rzVar.f30380y0.h() > 0) {
            this.Z2 = true;
            rzVar.E0.h1(0, 0);
            rzVar.I0 = false;
            this.Z2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        rzVar.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Z2) {
            return;
        }
        super.requestLayout();
    }
}
