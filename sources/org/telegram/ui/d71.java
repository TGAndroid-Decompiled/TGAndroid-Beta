package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class d71 extends AnimatorListenerAdapter {
    public final boolean f45016a;
    public final int f45017b;
    public final int f45018c;
    public final boolean d;
    public final v71 f45019e;

    public d71(v71 v71Var, boolean z9, int i7, int i10, boolean z10) {
        this.f45019e = v71Var;
        this.f45016a = z9;
        this.f45017b = i7;
        this.f45018c = i10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.f45019e;
        FrameLayout[] frameLayoutArr = v71Var.M0;
        v71Var.f50572s1 = null;
        int i7 = this.f45018c;
        int i10 = this.f45017b;
        boolean z9 = this.f45016a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = v71Var.f50524b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w61[] w61VarArr = v71Var.K0;
        if (this.d) {
            c10 = 0;
        }
        w61VarArr[c10].setVisibility(4);
    }
}
