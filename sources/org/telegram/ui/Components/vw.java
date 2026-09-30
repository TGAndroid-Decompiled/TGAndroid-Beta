package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends og.d {
    public boolean f29734f3;
    public final nz f29735g3;

    public vw(nz nzVar, Context context) {
        super(context, null);
        this.f29735g3 = nzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f29735g3.f26848m2.h++;
    }

    @Override
    public final void l0(int i10, int i11) {
        int i12;
        ah.h hVar;
        nz nzVar = this.f29735g3;
        iz izVar = nzVar.f26891z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = nzVar.f26841j2) != null) {
            hVar.f(i10, i11);
        }
        if (nzVar.C0 != null) {
            ax axVar = nzVar.B0;
            if (nzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            axVar.setUnderlineHeight(i12);
        }
        if (izVar != null && getAdapter() == izVar && izVar.d == 0) {
            iz izVar2 = izVar.O.f24694w;
            if (!izVar2.Q.G0.F && !izVar2.f25246y) {
                if (nzVar.E0.N0() + 50 > izVar.h()) {
                    gz gzVar = izVar.O;
                    Objects.requireNonNull(gzVar);
                    AndroidUtilities.runOnUIThread(new uw(gzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nz nzVar = this.f29735g3;
        if (!nzVar.f26826f) {
            org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
            vw vwVar = nzVar.D0;
            nzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, vwVar, nzVar.f26832g2, this.f31015p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f29735g3;
        if (nzVar.I0 && nzVar.f26888y0.h() > 0) {
            this.f29734f3 = true;
            nzVar.E0.h1(0, 0);
            nzVar.I0 = false;
            this.f29734f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f29734f3) {
            return;
        }
        super.requestLayout();
    }
}
