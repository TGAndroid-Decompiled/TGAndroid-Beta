package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class hd1 extends AnimatorListenerAdapter {
    public final boolean f33352a;
    public final int f33353b;
    public final int f33354c;
    public final boolean d;
    public final ae1 e;

    public hd1(ae1 ae1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = ae1Var;
        this.f33352a = z10;
        this.f33353b = i10;
        this.f33354c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ae1 ae1Var = this.e;
        FrameLayout[] frameLayoutArr = ae1Var.L0;
        ae1Var.f30962r1 = null;
        int i10 = this.f33354c;
        int i11 = this.f33353b;
        boolean z10 = this.f33352a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = ae1Var.f30917b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w81[] w81VarArr = ae1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        w81VarArr[c10].setVisibility(4);
    }
}
