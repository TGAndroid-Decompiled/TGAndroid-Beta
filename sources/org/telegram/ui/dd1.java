package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class dd1 extends AnimatorListenerAdapter {
    public final boolean f33001a;
    public final int f33002b;
    public final int f33003c;
    public final boolean d;
    public final wd1 e;

    public dd1(wd1 wd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = wd1Var;
        this.f33001a = z10;
        this.f33002b = i10;
        this.f33003c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wd1 wd1Var = this.e;
        FrameLayout[] frameLayoutArr = wd1Var.L0;
        wd1Var.f38834r1 = null;
        int i10 = this.f33003c;
        int i11 = this.f33002b;
        boolean z10 = this.f33001a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = wd1Var.f38789b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.j81[] j81VarArr = wd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        j81VarArr[c10].setVisibility(4);
    }
}
