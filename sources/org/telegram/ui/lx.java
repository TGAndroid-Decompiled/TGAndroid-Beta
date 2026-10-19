package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class lx extends org.telegram.ui.Components.vo0 {
    public final zf.y Z0;
    public final zf.y f39031a1;
    public final cy f39032b1;

    public lx(cy cyVar, Activity activity, cy cyVar2, int i10, int i11, int i12, long j10, hx hxVar) {
        super(activity, cyVar2, i10, i11, i12, j10, hxVar);
        this.f39032b1 = cyVar;
        this.Z0 = new zf.y(2);
        this.f39031a1 = new zf.y(8);
    }

    public final void S(int i10, int i11) {
        cy cyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = (cyVar = this.f39032b1).l4) != null) {
            fVar.f(i10, i11);
            cyVar.j3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        cy cyVar = this.f39032b1;
        if (cyVar.f36064a0 != null || cyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(cyVar.f36063a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (cyVar.Y2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.us usVar = cyVar.J1;
            if (usVar != null) {
                i11 = (int) usVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.7f, cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6));
            zf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (cyVar.f36100g4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.9f, cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6));
            zf.y yVar2 = this.f39031a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - cyVar.f36100g4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f39032b1.j3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        i31 i31Var = this.f39032b1.Z;
        if (i31Var != null) {
            i31Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            cy cyVar = this.f39032b1;
            if (cyVar.l4 != null) {
                cyVar.j3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.uo0 uo0Var = this.T;
        if (uo0Var != null && uo0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39032b1.a5(z10);
    }
}
