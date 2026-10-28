package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class bc1 extends AnimatorListenerAdapter {
    public final boolean f37974a;
    public final int f37975b;
    public final int f37976c;
    public final boolean d;
    public final vc1 e;

    public bc1(vc1 vc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = vc1Var;
        this.f37974a = z10;
        this.f37975b = i10;
        this.f37976c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vc1 vc1Var = this.e;
        FrameLayout[] frameLayoutArr = vc1Var.M0;
        vc1Var.f44298s1 = null;
        int i10 = this.f37976c;
        int i11 = this.f37975b;
        boolean z10 = this.f37974a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = vc1Var.f44249b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w91[] w91VarArr = vc1Var.K0;
        if (this.d) {
            c10 = 0;
        }
        w91VarArr[c10].setVisibility(4);
    }
}
