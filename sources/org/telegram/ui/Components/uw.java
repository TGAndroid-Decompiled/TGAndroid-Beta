package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class uw extends og.d {
    public boolean Y2;
    public final mz Z2;

    public uw(mz mzVar, Context context) {
        super(context, null);
        this.Z2 = mzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Z2.f26578m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        ah.h hVar;
        mz mzVar = this.Z2;
        hz hzVar = mzVar.f26621z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = mzVar.f26571j2) != null) {
            hVar.f(i10, i11);
        }
        if (mzVar.C0 != null) {
            zw zwVar = mzVar.B0;
            if (mzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            zwVar.setUnderlineHeight(i12);
        }
        if (hzVar != null && getAdapter() == hzVar && hzVar.d == 0) {
            hz hzVar2 = hzVar.O.f24342w;
            if (!hzVar2.Q.G0.F && !hzVar2.f24915y) {
                if (mzVar.E0.N0() + 50 > hzVar.h()) {
                    fz fzVar = hzVar.O;
                    Objects.requireNonNull(fzVar);
                    AndroidUtilities.runOnUIThread(new tw(fzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mz mzVar = this.Z2;
        if (!mzVar.f26556f) {
            org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
            uw uwVar = mzVar.D0;
            mzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, uwVar, mzVar.f26562g2, this.f30399p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mz mzVar = this.Z2;
        if (mzVar.I0 && mzVar.f26618y0.h() > 0) {
            this.Y2 = true;
            mzVar.E0.h1(0, 0);
            mzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
