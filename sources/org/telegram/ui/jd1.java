package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class jd1 extends AnimatorListenerAdapter {
    public final boolean f37023a;
    public final int f37024b;
    public final int f37025c;
    public final boolean d;
    public final ce1 e;

    public jd1(ce1 ce1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = ce1Var;
        this.f37023a = z10;
        this.f37024b = i10;
        this.f37025c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ce1 ce1Var = this.e;
        FrameLayout[] frameLayoutArr = ce1Var.L0;
        ce1Var.f34625r1 = null;
        int i10 = this.f37025c;
        int i11 = this.f37024b;
        boolean z10 = this.f37023a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = ce1Var.f34580b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.m91[] m91VarArr = ce1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        m91VarArr[c10].setVisibility(4);
    }
}
