package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class iy extends org.telegram.ui.Components.zo0 {
    public final zf.z Z0;
    public final zf.z f37214a1;
    public final yy f37215b1;

    public iy(yy yyVar, Activity activity, yy yyVar2, int i10, int i11, int i12, long j10, ey eyVar) {
        super(activity, yyVar2, i10, i11, i12, j10, eyVar);
        this.f37215b1 = yyVar;
        this.Z0 = new zf.z(2);
        this.f37214a1 = new zf.z(8);
    }

    public final void S(int i10, int i11) {
        yy yyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = (yyVar = this.f37215b1).f42360k4) != null) {
            fVar.f(i10, i11);
            yyVar.j3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        yy yyVar = this.f37215b1;
        if (yyVar.f42304a0 != null || yyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(yyVar.f42303a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (yyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.xs xsVar = yyVar.J1;
            if (xsVar != null) {
                i11 = (int) xsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int m12 = org.telegram.ui.ActionBar.g6.m1(0.7f, yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
            zf.z zVar = this.Z0;
            zVar.b(m12);
            zVar.c(i13, 0);
            zVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            zVar.draw(canvas);
        }
        if (yyVar.f42335f4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.g6.m1(0.9f, yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
            zf.z zVar2 = this.f37214a1;
            zVar2.b(m13);
            zVar2.setBounds(0, getMeasuredHeight() - yyVar.f42335f4, getMeasuredWidth(), getMeasuredHeight());
            zVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f37215b1.j3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        c51 c51Var = this.f37215b1.Z;
        if (c51Var != null) {
            c51Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            yy yyVar = this.f37215b1;
            if (yyVar.f42360k4 != null) {
                yyVar.j3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.yo0 yo0Var = this.T;
        if (yo0Var != null && yo0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37215b1.Z4(z10);
    }
}
