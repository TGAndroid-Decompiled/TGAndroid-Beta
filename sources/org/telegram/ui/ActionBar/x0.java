package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x0 extends AnimatorListenerAdapter {
    public final boolean f30243a;
    public final int f30244b;
    public final int f30245c;
    public final int d;
    public final y0 f30246e;

    public x0(y0 y0Var, boolean z10, int i7, int i10, int i11) {
        this.f30246e = y0Var;
        this.f30243a = z10;
        this.f30244b = i7;
        this.f30245c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f30243a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = this.f30244b;
        int i10 = this.f30245c;
        int f11 = i0.a.f(f10, i7, i10);
        y0 y0Var = this.f30246e;
        y0Var.setTextColor(f11);
        y0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
