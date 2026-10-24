package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class nx extends org.telegram.ui.Components.zo0 {
    public final zf.y Z0;
    public final zf.y f40005a1;
    public final ey f40006b1;

    public nx(ey eyVar, Activity activity, ey eyVar2, int i10, int i11, int i12, long j10, jx jxVar) {
        super(activity, eyVar2, i10, i11, i12, j10, jxVar);
        this.f40006b1 = eyVar;
        this.Z0 = new zf.y(2);
        this.f40005a1 = new zf.y(8);
    }

    public final void R(int i10, int i11) {
        ey eyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = (eyVar = this.f40006b1).l4) != null) {
            fVar.f(i10, i11);
            eyVar.i3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        ey eyVar = this.f40006b1;
        if (eyVar.f37013a0 != null || eyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(eyVar.f37012a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (eyVar.Y2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ss ssVar = eyVar.J1;
            if (ssVar != null) {
                i11 = (int) ssVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.7f, eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            zf.y yVar = this.Z0;
            yVar.b(o12);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (eyVar.f37049g4 > AndroidUtilities.dp(32.0f)) {
            int o13 = org.telegram.ui.ActionBar.k6.o1(0.9f, eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            zf.y yVar2 = this.f40005a1;
            yVar2.b(o13);
            yVar2.setBounds(0, getMeasuredHeight() - eyVar.f37049g4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f40006b1.i3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        l31 l31Var = this.f40006b1.Z;
        if (l31Var != null) {
            l31Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            ey eyVar = this.f40006b1;
            if (eyVar.l4 != null) {
                eyVar.i3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.yo0 yo0Var = this.T;
        if (yo0Var != null && yo0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40006b1.c5(z10);
    }
}
