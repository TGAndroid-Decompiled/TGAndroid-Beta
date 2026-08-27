package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

public final class px extends org.telegram.ui.Components.jn0 {
    public final gf.c0 U0;
    public final gf.c0 V0;
    public final gy W0;

    public px(gy gyVar, Activity activity, gy gyVar2, int i10, int i11, int i12, long j10, lx lxVar) {
        super(activity, gyVar2, i10, i11, i12, j10, lxVar);
        this.W0 = gyVar;
        this.U0 = new gf.c0(2);
        this.V0 = new gf.c0(8);
    }

    public final void S(int i10, int i11) {
        gy gyVar;
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (gyVar = this.W0).f38539h4) == null) {
            return;
        }
        eVar.f(i10, i11);
        gyVar.m3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gy gyVar = this.W0;
        if (gyVar.W != null || gyVar.T2 != 0) {
            int iDp = AndroidUtilities.dp(54.0f);
            int iDp2 = ((AndroidUtilities.dp(gyVar.f38497a) + ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (gyVar.T2 != 0 ? iDp : 0);
            org.telegram.ui.Components.zr zrVar = gyVar.F1;
            int iC = iDp2 + (zrVar != null ? (int) zrVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.7f, gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            gf.c0 c0Var = this.U0;
            c0Var.b(iL1);
            c0Var.c(iC, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), iC + iDp);
            c0Var.draw(canvas);
        }
        if (gyVar.f38512c4 > AndroidUtilities.dp(32.0f)) {
            int iL2 = org.telegram.ui.ActionBar.g6.l1(0.9f, gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            gf.c0 c0Var2 = this.V0;
            c0Var2.b(iL2);
            c0Var2.setBounds(0, getMeasuredHeight() - gyVar.f38512c4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.W0.m3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        n31 n31Var = this.W0.V;
        if (n31Var != null) {
            n31Var.setTranslationY(f10);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            gy gyVar = this.W0;
            if (gyVar.f38539h4 != null) {
                gyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        org.telegram.ui.Components.in0 in0Var = this.P;
        this.W0.c5(in0Var != null && in0Var.h(i10) == 2);
    }
}
