package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class ey extends org.telegram.ui.Components.no0 {
    public final yf.y f33441a1;
    public final yf.y f33442b1;
    public final uy f33443c1;

    public ey(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, zx zxVar) {
        super(activity, uyVar2, i10, i11, i12, j3, zxVar);
        this.f33443c1 = uyVar;
        this.f33441a1 = new yf.y(2);
        this.f33442b1 = new yf.y(8);
    }

    public final void T(int i10, int i11) {
        uy uyVar;
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = (uyVar = this.f33443c1).f38311k4) != null) {
            iVar.f(i10, i11);
            uyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        uy uyVar = this.f33443c1;
        if (uyVar.f38256a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(uyVar.f38255a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (uyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ks ksVar = uyVar.J1;
            if (ksVar != null) {
                i11 = (int) ksVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
            yf.y yVar = this.f33441a1;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (uyVar.f38287f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
            yf.y yVar2 = this.f33442b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - uyVar.f38287f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f33443c1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        w41 w41Var = this.f33443c1.Z;
        if (w41Var != null) {
            w41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            uy uyVar = this.f33443c1;
            if (uyVar.f38311k4 != null) {
                uyVar.m3();
            }
        }
    }

    @Override
    public final void y(int i10) {
        boolean z10;
        org.telegram.ui.Components.mo0 mo0Var = this.U;
        if (mo0Var != null && mo0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33443c1.c5(z10);
    }
}
