package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class gd1 extends AnimatorListenerAdapter {
    public final boolean f38008a;
    public final int f38009b;
    public final int f38010c;
    public final boolean d;
    public final zd1 f38011e;

    public gd1(zd1 zd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f38011e = zd1Var;
        this.f38008a = z10;
        this.f38009b = i10;
        this.f38010c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zd1 zd1Var = this.f38011e;
        FrameLayout[] frameLayoutArr = zd1Var.L0;
        zd1Var.f44783r1 = null;
        int i10 = this.f38010c;
        int i11 = this.f38009b;
        boolean z10 = this.f38008a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = zd1Var.f44737b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.v91[] v91VarArr = zd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        v91VarArr[c10].setVisibility(4);
    }
}
