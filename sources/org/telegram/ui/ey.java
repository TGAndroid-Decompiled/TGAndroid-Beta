package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class ey extends org.telegram.ui.Components.yn0 {
    public final yf.z Y0;
    public final yf.z Z0;
    public final uy f36232a1;

    public ey(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, zx zxVar) {
        super(activity, uyVar2, i10, i11, i12, j3, zxVar);
        this.f36232a1 = uyVar;
        this.Y0 = new yf.z(2);
        this.Z0 = new yf.z(8);
    }

    public final void S(int i10, int i11) {
        uy uyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = (uyVar = this.f36232a1).l4) != null) {
            fVar.f(i10, i11);
            uyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        uy uyVar = this.f36232a1;
        if (uyVar.f41264a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(uyVar.f41263a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (uyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.js jsVar = uyVar.J1;
            if (jsVar != null) {
                i11 = (int) jsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
            yf.z zVar = this.Y0;
            zVar.b(l1);
            zVar.c(i13, 0);
            zVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            zVar.draw(canvas);
        }
        if (uyVar.f41301g4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
            yf.z zVar2 = this.Z0;
            zVar2.b(l12);
            zVar2.setBounds(0, getMeasuredHeight() - uyVar.f41301g4, getMeasuredWidth(), getMeasuredHeight());
            zVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f36232a1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        v41 v41Var = this.f36232a1.Z;
        if (v41Var != null) {
            v41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            uy uyVar = this.f36232a1;
            if (uyVar.l4 != null) {
                uyVar.m3();
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
        this.f36232a1.c5(z10);
    }
}
