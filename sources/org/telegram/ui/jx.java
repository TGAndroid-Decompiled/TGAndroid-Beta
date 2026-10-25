package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends org.telegram.ui.Components.ep0 {
    public final ag.h0 f40755b1;
    public final ag.h0 f40756c1;
    public final cy f40757d1;

    public jx(cy cyVar, Activity activity, cy cyVar2, int i10, int i11, int i12, long j10, ix ixVar) {
        super(activity, cyVar2, i10, i11, i12, j10, ixVar);
        this.f40757d1 = cyVar;
        this.f40755b1 = new ag.h0(2);
        this.f40756c1 = new ag.h0(8);
    }

    public final void T() {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.r2) this.f40757d1).glassEngine;
        qVar.e++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        cy cyVar = this.f40757d1;
        if (cyVar.f38562a0 != null || cyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(cyVar.f38561a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (cyVar.Y2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ws wsVar = cyVar.J1;
            if (wsVar != null) {
                i11 = (int) wsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.7f, cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
            ag.h0 h0Var = this.f40755b1;
            h0Var.b(o12);
            h0Var.c(i13, 0);
            h0Var.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            h0Var.draw(canvas);
        }
        if (cyVar.f38598g4 > AndroidUtilities.dp(32.0f)) {
            int o13 = org.telegram.ui.ActionBar.y6.o1(0.9f, cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
            ag.h0 h0Var2 = this.f40756c1;
            h0Var2.b(o13);
            h0Var2.setBounds(0, getMeasuredHeight() - cyVar.f38598g4, getMeasuredWidth(), getMeasuredHeight());
            h0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        oi.q qVar;
        super.setAlpha(f7);
        qVar = ((org.telegram.ui.ActionBar.r2) this.f40757d1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        n31 n31Var = this.f40757d1.Z;
        if (n31Var != null) {
            n31Var.setTranslationY(f7);
        }
    }

    @Override
    public final void y(int i10) {
        boolean z10;
        org.telegram.ui.Components.dp0 dp0Var = this.V;
        if (dp0Var != null && dp0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40757d1.m5(z10);
    }
}
