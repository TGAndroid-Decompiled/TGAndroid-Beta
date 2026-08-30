package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class jc1 extends AnimatorListenerAdapter {
    public final boolean f35316a;
    public final int f35317b;
    public final int f35318c;
    public final boolean d;
    public final cd1 e;

    public jc1(cd1 cd1Var, boolean z4, int i10, int i11, boolean z10) {
        this.e = cd1Var;
        this.f35316a = z4;
        this.f35317b = i10;
        this.f35318c = i11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cd1 cd1Var = this.e;
        FrameLayout[] frameLayoutArr = cd1Var.I0;
        cd1Var.f33325o1 = null;
        int i10 = this.f35318c;
        int i11 = this.f35317b;
        boolean z4 = this.f35316a;
        if (z4 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = cd1Var.f33290b;
        char c3 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.m81[] m81VarArr = cd1Var.G0;
        if (this.d) {
            c3 = 0;
        }
        m81VarArr[c3].setVisibility(4);
    }
}
