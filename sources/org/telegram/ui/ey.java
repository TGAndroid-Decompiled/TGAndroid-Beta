package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class ey extends org.telegram.ui.Components.yn0 {
    public final yf.y Y0;
    public final yf.y Z0;
    public final uy f33424a1;

    public ey(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, zx zxVar) {
        super(activity, uyVar2, i10, i11, i12, j3, zxVar);
        this.f33424a1 = uyVar;
        this.Y0 = new yf.y(2);
        this.Z0 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        uy uyVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = (uyVar = this.f33424a1).l4) != null) {
            hVar.f(i10, i11);
            uyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        uy uyVar = this.f33424a1;
        if (uyVar.f38186a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(uyVar.f38185a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
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
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
            yf.y yVar = this.Y0;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (uyVar.f38222g4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.i6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
            yf.y yVar2 = this.Z0;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - uyVar.f38222g4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f33424a1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        s41 s41Var = this.f33424a1.Z;
        if (s41Var != null) {
            s41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            uy uyVar = this.f33424a1;
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
        this.f33424a1.c5(z10);
    }
}
