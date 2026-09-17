package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class ed1 extends AnimatorListenerAdapter {
    public final boolean f33371a;
    public final int f33372b;
    public final int f33373c;
    public final boolean d;
    public final xd1 e;

    public ed1(xd1 xd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = xd1Var;
        this.f33371a = z10;
        this.f33372b = i10;
        this.f33373c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.e;
        FrameLayout[] frameLayoutArr = xd1Var.L0;
        xd1Var.f39579r1 = null;
        int i10 = this.f33373c;
        int i11 = this.f33372b;
        boolean z10 = this.f33371a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = xd1Var.f39534b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.k81[] k81VarArr = xd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        k81VarArr[c10].setVisibility(4);
    }
}
