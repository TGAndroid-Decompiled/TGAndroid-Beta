package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends og.d {
    public boolean f32357f3;
    public final nz f32358g3;

    public vw(nz nzVar, Context context) {
        super(context, null);
        this.f32358g3 = nzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f32358g3.f29122m2.g();
    }

    @Override
    public final void l0(int i10) {
        int i11;
        nz nzVar = this.f32358g3;
        iz izVar = nzVar.f29165z0;
        if (nzVar.C0 != null) {
            ax axVar = nzVar.B0;
            if (nzVar.D0.canScrollVertically(-1)) {
                i11 = AndroidUtilities.getShadowHeight();
            } else {
                i11 = 0;
            }
            axVar.setUnderlineHeight(i11);
        }
        if (izVar != null && getAdapter() == izVar && izVar.d == 0 && !izVar.O.a() && !izVar.O.f26956w.f27523y) {
            if (nzVar.E0.N0() + 50 > izVar.h()) {
                gz gzVar = izVar.O;
                Objects.requireNonNull(gzVar);
                AndroidUtilities.runOnUIThread(new uw(gzVar, 0));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nz nzVar = this.f32358g3;
        if (!nzVar.f29100f) {
            org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
            vw vwVar = nzVar.D0;
            nzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, vwVar, nzVar.f29106g2, this.f33545p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f32358g3;
        if (nzVar.I0 && nzVar.f29162y0.h() > 0) {
            this.f32357f3 = true;
            nzVar.E0.h1(0, 0);
            nzVar.I0 = false;
            this.f32357f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f32357f3) {
            return;
        }
        super.requestLayout();
    }
}
