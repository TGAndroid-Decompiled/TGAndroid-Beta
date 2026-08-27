package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class vh extends org.telegram.ui.ActionBar.p1 {

    public final wh f33419x;

    public vh(wh whVar, wh whVar2) {
        super(whVar2);
        this.f33419x = whVar;
    }

    @Override
    public final boolean b() {
        yy yyVar;
        gi giVar = this.f33419x.f34182x0;
        if (!giVar.isDismissed() && giVar.f28677o1) {
            yh yhVar = giVar.f28696u0;
            if (yhVar != giVar.f28659i0 && yhVar != giVar.f28662j0 && !giVar.m1().m()) {
                return true;
            }
            yh yhVar2 = giVar.f28696u0;
            in inVar = giVar.f28659i0;
            if (yhVar2 == inVar && ((yyVar = inVar.A) == null || yyVar.getVisibility() != 0)) {
                return true;
            }
            yh yhVar3 = giVar.f28696u0;
            in inVar2 = giVar.f28662j0;
            if (yhVar3 == inVar2) {
                yy yyVar2 = inVar2.A;
                return yyVar2 == null || yyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        wh whVar = this.f33419x;
        gi giVar = whVar.f34182x0;
        giVar.f28658h2 = f10;
        float f12 = giVar.Z1;
        if (f12 > 0.0f) {
            giVar.f28658h2 = com.google.android.recaptcha.internal.a.z(1.0f, f11, f12 - giVar.a2, f10);
        }
        giVar.T0.setTranslationY(giVar.f28658h2);
        giVar.W0.setTranslationY(giVar.f28658h2);
        org.telegram.ui.ActionBar.v0 v0Var = giVar.f28633a1;
        if (v0Var != null) {
            v0Var.setTranslationY(giVar.f28658h2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = giVar.Y0;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(giVar.W0.getTranslationY());
        }
        lh.w3 w3Var = giVar.Z0;
        if (w3Var != null) {
            w3Var.setTranslationY(giVar.W0.getTranslationY());
        }
        giVar.f28636b1.setTranslationY(giVar.f28658h2);
        giVar.a2(0);
        giVar.setCurrentPanTranslationY(giVar.f28658h2);
        whVar.invalidate();
        giVar.f28714z0.invalidate();
        giVar.U1();
        yh yhVar = giVar.f28696u0;
        if (yhVar != null) {
            yhVar.k(giVar.f28658h2);
        }
    }

    @Override
    public final void f() {
        gi giVar = this.f33419x.f34182x0;
        giVar.X1(giVar.f28696u0, 0);
        giVar.Y1 = giVar.X1[0];
        giVar.f28696u0.w();
        if (!(giVar.f28696u0 instanceof nh.e4) || giVar.f28715z1) {
            return;
        }
        int iDp = ((org.telegram.ui.ActionBar.e3) giVar).keyboardVisible ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < giVar.f28693t0.size(); i10++) {
            ((nh.e4) giVar.f28693t0.valueAt(i10)).setMeasureOffsetY(iDp);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        wh whVar = this.f33419x;
        gi giVar = whVar.f34182x0;
        int i12 = giVar.Y1;
        if (i12 <= 0 || i12 == (i11 = giVar.X1[0]) || !z10) {
            giVar.Z1 = -1.0f;
        } else {
            giVar.Z1 = i12;
            giVar.a2 = i11;
        }
        whVar.invalidate();
        ih ihVar = giVar.f28694t1;
        if ((giVar.f28696u0 instanceof nh.e4) && !giVar.f28715z1) {
            if (z10) {
                ihVar.setVisibility(8);
            } else {
                ihVar.setVisibility(0);
            }
        }
        giVar.f28696u0.x(i10, z10);
    }
}
