package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class fw extends wf.d {
    public boolean U2;
    public final wy V2;

    public fw(wy wyVar, Context context) {
        super(context, null);
        this.V2 = wyVar;
    }

    @Override
    public final void k0(int i9, int i10) {
        int i11;
        ig.e eVar;
        wy wyVar = this.V2;
        ry ryVar = wyVar.f34451v0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = wyVar.f34404f2) != null) {
            eVar.f(i9, i10);
            wyVar.C();
        }
        if (wyVar.f34463y0 != null) {
            jw jwVar = wyVar.f34459x0;
            if (wyVar.f34466z0.canScrollVertically(-1)) {
                i11 = AndroidUtilities.getShadowHeight();
            } else {
                i11 = 0;
            }
            jwVar.setUnderlineHeight(i11);
        }
        if (ryVar != null && getAdapter() == ryVar && ryVar.d == 0) {
            ry ryVar2 = ryVar.K.f31778w;
            if (!ryVar2.M.C0.B && !ryVar2.f32309y) {
                if (wyVar.A0.N0() + 50 > ryVar.h()) {
                    py pyVar = ryVar.K;
                    Objects.requireNonNull(pyVar);
                    AndroidUtilities.runOnUIThread(new ew(pyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wy wyVar = this.V2;
        if (!wyVar.f34401f) {
            org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
            fw fwVar = wyVar.f34466z0;
            wyVar.getMeasuredHeight();
            boolean r10 = q10.r(motionEvent, fwVar, wyVar.f34393c2, this.f34260l2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wy wyVar = this.V2;
        if (wyVar.E0 && wyVar.f34448u0.h() > 0) {
            this.U2 = true;
            wyVar.A0.h1(0, 0);
            wyVar.E0 = false;
            this.U2 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
