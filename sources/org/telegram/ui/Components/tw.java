package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class tw extends pg.d {
    public boolean Y2;
    public final kz Z2;

    public tw(kz kzVar, Context context) {
        super(context, null);
        this.Z2 = kzVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        bh.f fVar;
        kz kzVar = this.Z2;
        fz fzVar = kzVar.f28033z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = kzVar.f27983j2) != null) {
            fVar.f(i10, i11);
            kzVar.C();
        }
        if (kzVar.C0 != null) {
            xw xwVar = kzVar.B0;
            if (kzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            xwVar.setUnderlineHeight(i12);
        }
        if (fzVar != null && getAdapter() == fzVar && fzVar.d == 0) {
            fz fzVar2 = fzVar.O.f25517w;
            if (!fzVar2.Q.G0.F && !fzVar2.f26237y) {
                if (kzVar.E0.N0() + 50 > fzVar.h()) {
                    dz dzVar = fzVar.O;
                    Objects.requireNonNull(dzVar);
                    AndroidUtilities.runOnUIThread(new sw(dzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.Z2;
        if (!kzVar.f27968f) {
            org.telegram.ui.st q6 = org.telegram.ui.st.q();
            tw twVar = kzVar.D0;
            kzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, twVar, kzVar.f27974g2, this.f28251p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.Z2;
        if (kzVar.I0 && kzVar.f28030y0.h() > 0) {
            this.Y2 = true;
            kzVar.E0.h1(0, 0);
            kzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
