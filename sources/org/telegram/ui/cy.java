package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class cy extends org.telegram.ui.Components.ep0 {
    public final yf.y Z0;
    public final yf.y f36885a1;
    public final sy f36886b1;

    public cy(sy syVar, Activity activity, sy syVar2, int i10, int i11, int i12, long j3, xx xxVar) {
        super(activity, syVar2, i10, i11, i12, j3, xxVar);
        this.f36886b1 = syVar;
        this.Z0 = new yf.y(2);
        this.f36885a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        sy syVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = (syVar = this.f36886b1).f41975k4) != null) {
            hVar.f(i10, i11);
            syVar.j3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        sy syVar = this.f36886b1;
        if (syVar.f41919a0 != null || syVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            int dp2 = (AndroidUtilities.dp(syVar.f41918a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (syVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.bt btVar = syVar.J1;
            if (btVar != null) {
                i11 = (int) btVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.7f, syVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
            yf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (syVar.f41951f4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.9f, syVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
            yf.y yVar2 = this.f36885a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - syVar.f41951f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f36886b1.j3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        u41 u41Var = this.f36886b1.Z;
        if (u41Var != null) {
            u41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            sy syVar = this.f36886b1;
            if (syVar.f41975k4 != null) {
                syVar.j3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.dp0 dp0Var = this.T;
        if (dp0Var != null && dp0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36886b1.Z4(z10);
    }
}
