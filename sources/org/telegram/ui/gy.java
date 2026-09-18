package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class gy extends org.telegram.ui.Components.zn0 {
    public final yf.y f34066a1;
    public final yf.y f34067b1;
    public final wy f34068c1;

    public gy(wy wyVar, Activity activity, wy wyVar2, int i10, int i11, int i12, long j3, cy cyVar) {
        super(activity, wyVar2, i10, i11, i12, j3, cyVar);
        this.f34068c1 = wyVar;
        this.f34066a1 = new yf.y(2);
        this.f34067b1 = new yf.y(8);
    }

    public final void T(int i10, int i11) {
        wy wyVar;
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = (wyVar = this.f34068c1).f39255k4) != null) {
            iVar.f(i10, i11);
            wyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        wy wyVar = this.f34068c1;
        if (wyVar.f39200a0 != null || wyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(wyVar.f39199a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (wyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ks ksVar = wyVar.J1;
            if (ksVar != null) {
                i11 = (int) ksVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6));
            yf.y yVar = this.f34066a1;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (wyVar.f39231f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6));
            yf.y yVar2 = this.f34067b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - wyVar.f39231f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f34068c1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        v41 v41Var = this.f34068c1.Z;
        if (v41Var != null) {
            v41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            wy wyVar = this.f34068c1;
            if (wyVar.f39255k4 != null) {
                wyVar.m3();
            }
        }
    }

    @Override
    public final void y(int i10) {
        boolean z10;
        org.telegram.ui.Components.yn0 yn0Var = this.U;
        if (yn0Var != null && yn0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34068c1.c5(z10);
    }
}
