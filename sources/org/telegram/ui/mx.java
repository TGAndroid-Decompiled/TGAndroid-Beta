package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class mx extends org.telegram.ui.Components.hn0 {
    public final ff.c0 U0;
    public final ff.c0 V0;
    public final dy W0;

    public mx(dy dyVar, Activity activity, dy dyVar2, int i9, int i10, int i11, long j10, ix ixVar) {
        super(activity, dyVar2, i9, i10, i11, j10, ixVar);
        this.W0 = dyVar;
        this.U0 = new ff.c0(2);
        this.V0 = new ff.c0(8);
    }

    public final void S(int i9, int i10) {
        dy dyVar;
        ig.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (dyVar = this.W0).f37670h4) != null) {
            eVar.f(i9, i10);
            dyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        int i10;
        super.dispatchDraw(canvas);
        dy dyVar = this.W0;
        if (dyVar.W != null || dyVar.T2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(dyVar.f37628a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (dyVar.T2 != 0) {
                i9 = dp;
            } else {
                i9 = 0;
            }
            int i11 = dp2 - i9;
            org.telegram.ui.Components.bs bsVar = dyVar.F1;
            if (bsVar != null) {
                i10 = (int) bsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.7f, dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
            ff.c0 c0Var = this.U0;
            c0Var.b(l1);
            c0Var.c(i12, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), i12 + dp);
            c0Var.draw(canvas);
        }
        if (dyVar.f37643c4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.f6.l1(0.9f, dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
            ff.c0 c0Var2 = this.V0;
            c0Var2.b(l12);
            c0Var2.setBounds(0, getMeasuredHeight() - dyVar.f37643c4, getMeasuredWidth(), getMeasuredHeight());
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
        o31 o31Var = this.W0.V;
        if (o31Var != null) {
            o31Var.setTranslationY(f10);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            dy dyVar = this.W0;
            if (dyVar.f37670h4 != null) {
                dyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i9) {
        boolean z10;
        org.telegram.ui.Components.gn0 gn0Var = this.P;
        if (gn0Var != null && gn0Var.h(i9) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.c5(z10);
    }
}
