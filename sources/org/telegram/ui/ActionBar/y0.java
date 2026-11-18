package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y0 extends AnimatorListenerAdapter {
    public final boolean f30259a;
    public final int f30260b;
    public final int f30261c;
    public final int d;
    public final z0 f30262e;

    public y0(z0 z0Var, boolean z10, int i7, int i10, int i11) {
        this.f30262e = z0Var;
        this.f30259a = z10;
        this.f30260b = i7;
        this.f30261c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f30259a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = this.f30260b;
        int i10 = this.f30261c;
        int f11 = i0.a.f(f10, i7, i10);
        z0 z0Var = this.f30262e;
        z0Var.setTextColor(f11);
        z0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
