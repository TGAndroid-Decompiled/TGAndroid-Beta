package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class dy extends org.telegram.ui.Components.dp0 {
    public final yf.y Z0;
    public final yf.y f37108a1;
    public final ty f37109b1;

    public dy(ty tyVar, Activity activity, ty tyVar2, int i10, int i11, int i12, long j3, yx yxVar) {
        super(activity, tyVar2, i10, i11, i12, j3, yxVar);
        this.f37109b1 = tyVar;
        this.Z0 = new yf.y(2);
        this.f37108a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        ty tyVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = (tyVar = this.f37109b1).f42208k4) != null) {
            hVar.f(i10, i11);
            tyVar.j3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        ty tyVar = this.f37109b1;
        if (tyVar.f42152a0 != null || tyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(tyVar.f42151a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (tyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.at atVar = tyVar.J1;
            if (atVar != null) {
                i11 = (int) atVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int m12 = org.telegram.ui.ActionBar.i6.m1(0.7f, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
            yf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (tyVar.f42184f4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.i6.m1(0.9f, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
            yf.y yVar2 = this.f37108a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - tyVar.f42184f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f37109b1.j3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        v41 v41Var = this.f37109b1.Z;
        if (v41Var != null) {
            v41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            ty tyVar = this.f37109b1;
            if (tyVar.f42208k4 != null) {
                tyVar.j3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.cp0 cp0Var = this.T;
        if (cp0Var != null && cp0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37109b1.Z4(z10);
    }
}
