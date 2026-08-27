package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

public final class ew extends xf.d {
    public boolean U2;
    public final yy V2;

    public ew(yy yyVar, Context context) {
        super(context, null);
        this.V2 = yyVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        jg.e eVar;
        yy yyVar = this.V2;
        ty tyVar = yyVar.f35044v0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = yyVar.f34997f2) != null) {
            eVar.f(i10, i11);
            yyVar.D();
        }
        if (yyVar.f35056y0 != null) {
            yyVar.f35052x0.setUnderlineHeight(yyVar.f35059z0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (tyVar != null && getAdapter() == tyVar && tyVar.d == 0) {
            ty tyVar2 = tyVar.K.f32277w;
            if (tyVar2.M.C0.B || tyVar2.f32914y) {
                return;
            }
            if (yyVar.A0.N0() + 50 > tyVar.h()) {
                ry ryVar = tyVar.K;
                Objects.requireNonNull(ryVar);
                AndroidUtilities.runOnUIThread(new dw(ryVar, 0));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yy yyVar = this.V2;
        if (yyVar.f34994f) {
            return false;
        }
        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
        ew ewVar = yyVar.f35059z0;
        yyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || ktVarQ.r(motionEvent, ewVar, yyVar.f34986c2, this.f35277l2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar = this.V2;
        if (yyVar.E0 && yyVar.f35041u0.h() > 0) {
            this.U2 = true;
            yyVar.A0.h1(0, 0);
            yyVar.E0 = false;
            this.U2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yyVar.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
