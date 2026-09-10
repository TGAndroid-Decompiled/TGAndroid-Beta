package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends ng.d {
    public boolean Y2;
    public final rz Z2;

    public yw(rz rzVar, Context context) {
        super(context, null);
        this.Z2 = rzVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        zg.e eVar;
        rz rzVar = this.Z2;
        mz mzVar = rzVar.f26878z0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = rzVar.f26828j2) != null) {
            eVar.f(i10, i11);
            rzVar.C();
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
            mz mzVar2 = mzVar.O.f24835w;
            if (!mzVar2.Q.G0.F && !mzVar2.f25325y) {
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
        rz rzVar = this.Z2;
        if (!rzVar.f26813f) {
            org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
            yw ywVar = rzVar.D0;
            rzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, ywVar, rzVar.f26819g2, this.f27987p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rz rzVar = this.Z2;
        if (rzVar.I0 && rzVar.f26875y0.h() > 0) {
            this.Y2 = true;
            rzVar.E0.h1(0, 0);
            rzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        rzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
