package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x0 extends AnimatorListenerAdapter {
    public final boolean f28790a;
    public final int f28791b;
    public final int f28792c;
    public final int d;
    public final y0 f28793e;

    public x0(y0 y0Var, boolean z10, int i3, int i10, int i11) {
        this.f28793e = y0Var;
        this.f28790a = z10;
        this.f28791b = i3;
        this.f28792c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f28790a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i3 = this.f28791b;
        int i10 = this.f28792c;
        int f11 = i0.a.f(f10, i3, i10);
        y0 y0Var = this.f28793e;
        y0Var.setTextColor(f11);
        y0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
