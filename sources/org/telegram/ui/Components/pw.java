package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class pw extends bg.e {
    public boolean V2;
    public final kz W2;

    public pw(kz kzVar, Context context) {
        super(context, null);
        this.W2 = kzVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        ng.e eVar;
        kz kzVar = this.W2;
        fz fzVar = kzVar.f26492w0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = kzVar.f26444g2) != null) {
            eVar.f(i10, i11);
            kzVar.C();
        }
        if (kzVar.f26503z0 != null) {
            tw twVar = kzVar.f26500y0;
            if (kzVar.A0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            twVar.setUnderlineHeight(i12);
        }
        if (fzVar != null && getAdapter() == fzVar && fzVar.d == 0) {
            fz fzVar2 = fzVar.L.f24404w;
            if (!fzVar2.N.D0.C && !fzVar2.f25005y) {
                if (kzVar.B0.N0() + 50 > fzVar.h()) {
                    dz dzVar = fzVar.L;
                    Objects.requireNonNull(dzVar);
                    AndroidUtilities.runOnUIThread(new ow(dzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.W2;
        if (!kzVar.f26438f) {
            org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
            pw pwVar = kzVar.A0;
            kzVar.getMeasuredHeight();
            boolean r10 = q10.r(motionEvent, pwVar, kzVar.f26434d2, this.f28511m2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        kz kzVar = this.W2;
        if (kzVar.F0 && kzVar.f26488v0.h() > 0) {
            this.V2 = true;
            kzVar.B0.h1(0, 0);
            kzVar.F0 = false;
            this.V2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        kzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
