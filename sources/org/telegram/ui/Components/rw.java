package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class rw extends cg.e {
    public boolean V2;
    public final mz W2;

    public rw(mz mzVar, Context context) {
        super(context, null);
        this.W2 = mzVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        og.e eVar;
        mz mzVar = this.W2;
        hz hzVar = mzVar.f29337w0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = mzVar.f29289g2) != null) {
            eVar.f(i10, i11);
            mzVar.C();
        }
        if (mzVar.f29348z0 != null) {
            vw vwVar = mzVar.f29345y0;
            if (mzVar.A0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            vwVar.setUnderlineHeight(i12);
        }
        if (hzVar != null && getAdapter() == hzVar && hzVar.d == 0) {
            hz hzVar2 = hzVar.L.f27051w;
            if (!hzVar2.N.D0.C && !hzVar2.f27668y) {
                if (mzVar.B0.N0() + 50 > hzVar.h()) {
                    fz fzVar = hzVar.L;
                    Objects.requireNonNull(fzVar);
                    AndroidUtilities.runOnUIThread(new qw(fzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mz mzVar = this.W2;
        if (!mzVar.f29283f) {
            org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
            rw rwVar = mzVar.A0;
            mzVar.getMeasuredHeight();
            boolean r10 = q10.r(motionEvent, rwVar, mzVar.f29278d2, this.f31106m2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mz mzVar = this.W2;
        if (mzVar.F0 && mzVar.f29333v0.h() > 0) {
            this.V2 = true;
            mzVar.B0.h1(0, 0);
            mzVar.F0 = false;
            this.V2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        mzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
