package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class dd1 extends AnimatorListenerAdapter {
    public final boolean f36989a;
    public final int f36990b;
    public final int f36991c;
    public final boolean d;
    public final wd1 f36992e;

    public dd1(wd1 wd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f36992e = wd1Var;
        this.f36989a = z10;
        this.f36990b = i10;
        this.f36991c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wd1 wd1Var = this.f36992e;
        FrameLayout[] frameLayoutArr = wd1Var.L0;
        wd1Var.f43374r1 = null;
        int i10 = this.f36991c;
        int i11 = this.f36990b;
        boolean z10 = this.f36989a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = wd1Var.f43328b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.r91[] r91VarArr = wd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        r91VarArr[c10].setVisibility(4);
    }
}
