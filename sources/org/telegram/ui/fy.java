package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class fy extends org.telegram.ui.Components.jp0 {
    public final yf.y Z0;
    public final yf.y f37871a1;
    public final vy f37872b1;

    public fy(vy vyVar, Activity activity, vy vyVar2, int i10, int i11, int i12, long j3, ay ayVar) {
        super(activity, vyVar2, i10, i11, i12, j3, ayVar);
        this.f37872b1 = vyVar;
        this.Z0 = new yf.y(2);
        this.f37871a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        vy vyVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = (vyVar = this.f37872b1).f42937k4) != null) {
            hVar.f(i10, i11);
            vyVar.j3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        vy vyVar = this.f37872b1;
        if (vyVar.f42881a0 != null || vyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(vyVar.f42880a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (vyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ct ctVar = vyVar.J1;
            if (ctVar != null) {
                i11 = (int) ctVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.7f, vyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
            yf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (vyVar.f42913f4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.9f, vyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
            yf.y yVar2 = this.f37871a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - vyVar.f42913f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f37872b1.j3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        x41 x41Var = this.f37872b1.Z;
        if (x41Var != null) {
            x41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            vy vyVar = this.f37872b1;
            if (vyVar.f42937k4 != null) {
                vyVar.j3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.ip0 ip0Var = this.T;
        if (ip0Var != null && ip0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37872b1.Z4(z10);
    }
}
