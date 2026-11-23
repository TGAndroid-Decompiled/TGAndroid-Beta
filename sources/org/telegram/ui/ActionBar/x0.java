package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x0 extends AnimatorListenerAdapter {
    public final boolean f30302a;
    public final int f30303b;
    public final int f30304c;
    public final int d;
    public final y0 f30305e;

    public x0(y0 y0Var, boolean z10, int i7, int i10, int i11) {
        this.f30305e = y0Var;
        this.f30302a = z10;
        this.f30303b = i7;
        this.f30304c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f30302a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = this.f30303b;
        int i10 = this.f30304c;
        int f11 = i0.a.f(f10, i7, i10);
        y0 y0Var = this.f30305e;
        y0Var.setTextColor(f11);
        y0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
