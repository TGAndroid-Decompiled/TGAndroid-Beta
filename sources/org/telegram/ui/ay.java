package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class ay extends org.telegram.ui.Components.mo0 {
    public final yf.y f32171a1;
    public final yf.y f32172b1;
    public final ty f32173c1;

    public ay(ty tyVar, Activity activity, ty tyVar2, int i10, int i11, int i12, long j3, zx zxVar) {
        super(activity, tyVar2, i10, i11, i12, j3, zxVar);
        this.f32173c1 = tyVar;
        this.f32171a1 = new yf.y(2);
        this.f32172b1 = new yf.y(8);
    }

    public final void T() {
        li.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.f32173c1).glassEngine;
        lVar.e++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        ty tyVar = this.f32173c1;
        if (tyVar.f37955a0 != null || tyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(tyVar.f37954a) + lVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (tyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ms msVar = tyVar.J1;
            if (msVar != null) {
                i11 = (int) msVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.7f, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
            yf.y yVar = this.f32171a1;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (tyVar.f37986f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.i6.l1(0.9f, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
            yf.y yVar2 = this.f32172b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - tyVar.f37986f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        li.l lVar;
        super.setAlpha(f7);
        lVar = ((org.telegram.ui.ActionBar.o2) this.f32173c1).glassEngine;
        lVar.f();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        p41 p41Var = this.f32173c1.Z;
        if (p41Var != null) {
            p41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void y(int i10) {
        boolean z10;
        org.telegram.ui.Components.lo0 lo0Var = this.U;
        if (lo0Var != null && lo0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32173c1.l5(z10);
    }
}
