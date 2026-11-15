package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y0 extends AnimatorListenerAdapter {
    public final boolean f29880a;
    public final int f29881b;
    public final int f29882c;
    public final int d;
    public final z0 f29883e;

    public y0(z0 z0Var, boolean z10, int i7, int i10, int i11) {
        this.f29883e = z0Var;
        this.f29880a = z10;
        this.f29881b = i7;
        this.f29882c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f29880a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = this.f29881b;
        int i10 = this.f29882c;
        int f11 = i0.a.f(f10, i7, i10);
        z0 z0Var = this.f29883e;
        z0Var.setTextColor(f11);
        z0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
