package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends org.telegram.ui.Components.tn0 {
    public final jf.b0 U0;
    public final jf.b0 V0;
    public final fy W0;

    public ox(fy fyVar, Activity activity, fy fyVar2, int i10, int i11, int i12, long j10, kx kxVar) {
        super(activity, fyVar2, i10, i11, i12, j10, kxVar);
        this.W0 = fyVar;
        this.U0 = new jf.b0(2);
        this.V0 = new jf.b0(8);
    }

    public final void S(int i10, int i11) {
        fy fyVar;
        lg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (fyVar = this.W0).f38297h4) != null) {
            eVar.f(i10, i11);
            fyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        fy fyVar = this.W0;
        if (fyVar.W != null || fyVar.T2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(fyVar.f38255a) + lVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (fyVar.T2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.fs fsVar = fyVar.F1;
            if (fsVar != null) {
                i11 = (int) fsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.7f, fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
            jf.b0 b0Var = this.U0;
            b0Var.b(l1);
            b0Var.c(i13, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            b0Var.draw(canvas);
        }
        if (fyVar.f38270c4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.g6.l1(0.9f, fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
            jf.b0 b0Var2 = this.V0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - fyVar.f38270c4, getMeasuredWidth(), getMeasuredHeight());
            b0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        this.W0.m3();
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        p31 p31Var = this.W0.V;
        if (p31Var != null) {
            p31Var.setTranslationY(f9);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            fy fyVar = this.W0;
            if (fyVar.f38297h4 != null) {
                fyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.sn0 sn0Var = this.P;
        if (sn0Var != null && sn0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.c5(z10);
    }
}
