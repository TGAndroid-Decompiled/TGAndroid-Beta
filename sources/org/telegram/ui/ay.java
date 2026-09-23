package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class ay extends org.telegram.ui.Components.yn0 {
    public final yf.y Z0;
    public final yf.y f31896a1;
    public final ry f31897b1;

    public ay(ry ryVar, Activity activity, ry ryVar2, int i10, int i11, int i12, long j3, wx wxVar) {
        super(activity, ryVar2, i10, i11, i12, j3, wxVar);
        this.f31897b1 = ryVar;
        this.Z0 = new yf.y(2);
        this.f31896a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        ry ryVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = (ryVar = this.f31897b1).f37012k4) != null) {
            hVar.f(i10, i11);
            ryVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        ry ryVar = this.f31897b1;
        if (ryVar.f36957a0 != null || ryVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            int dp2 = (AndroidUtilities.dp(ryVar.f36956a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (ryVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ls lsVar = ryVar.J1;
            if (lsVar != null) {
                i11 = (int) lsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.h6.l1(0.7f, ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
            yf.y yVar = this.Z0;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (ryVar.f36988f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.h6.l1(0.9f, ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
            yf.y yVar2 = this.f31896a1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - ryVar.f36988f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f31897b1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        l41 l41Var = this.f31897b1.Z;
        if (l41Var != null) {
            l41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            ry ryVar = this.f31897b1;
            if (ryVar.f37012k4 != null) {
                ryVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.xn0 xn0Var = this.T;
        if (xn0Var != null && xn0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31897b1.c5(z10);
    }
}
