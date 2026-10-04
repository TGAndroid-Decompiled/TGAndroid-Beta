package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class dy extends org.telegram.ui.Components.qo0 {
    public final yf.y f35857a1;
    public final yf.y f35858b1;
    public final uy f35859c1;

    public dy(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, cy cyVar) {
        super(activity, uyVar2, i10, i11, i12, j3, cyVar);
        this.f35859c1 = uyVar;
        this.f35857a1 = new yf.y(2);
        this.f35858b1 = new yf.y(8);
    }

    public final void U() {
        li.m mVar;
        mVar = ((org.telegram.ui.ActionBar.n2) this.f35859c1).glassEngine;
        mVar.f15665e++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        uy uyVar = this.f35859c1;
        if (uyVar.f41371a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(uyVar.f41370a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (uyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ns nsVar = uyVar.J1;
            if (nsVar != null) {
                i11 = (int) nsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6));
            yf.y yVar = this.f35857a1;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (uyVar.f41403f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.i6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6));
            yf.y yVar2 = this.f35858b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - uyVar.f41403f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        li.m mVar;
        super.setAlpha(f7);
        mVar = ((org.telegram.ui.ActionBar.n2) this.f35859c1).glassEngine;
        mVar.g();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        p41 p41Var = this.f35859c1.Z;
        if (p41Var != null) {
            p41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void y(int i10) {
        boolean z10;
        org.telegram.ui.Components.po0 po0Var = this.U;
        if (po0Var != null && po0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35859c1.l5(z10);
    }
}
