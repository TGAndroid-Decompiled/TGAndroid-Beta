package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class gy extends org.telegram.ui.Components.ho0 {
    public final xf.z Y0;
    public final xf.z Z0;
    public final wy f33212a1;

    public gy(wy wyVar, Activity activity, wy wyVar2, int i10, int i11, int i12, long j3, cy cyVar) {
        super(activity, wyVar2, i10, i11, i12, j3, cyVar);
        this.f33212a1 = wyVar;
        this.Y0 = new xf.z(2);
        this.Z0 = new xf.z(8);
    }

    public final void S(int i10, int i11) {
        wy wyVar;
        zg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (wyVar = this.f33212a1).l4) != null) {
            eVar.f(i10, i11);
            wyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        wy wyVar = this.f33212a1;
        if (wyVar.f38410a0 != null || wyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(wyVar.f38409a) + lVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (wyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.qs qsVar = wyVar.J1;
            if (qsVar != null) {
                i11 = (int) qsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
            xf.z zVar = this.Y0;
            zVar.b(l1);
            zVar.c(i13, 0);
            zVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            zVar.draw(canvas);
        }
        if (wyVar.f38446g4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
            xf.z zVar2 = this.Z0;
            zVar2.b(l12);
            zVar2.setBounds(0, getMeasuredHeight() - wyVar.f38446g4, getMeasuredWidth(), getMeasuredHeight());
            zVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f33212a1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        y41 y41Var = this.f33212a1.Z;
        if (y41Var != null) {
            y41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            wy wyVar = this.f33212a1;
            if (wyVar.l4 != null) {
                wyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.go0 go0Var = this.T;
        if (go0Var != null && go0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33212a1.c5(z10);
    }
}
