package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y0 extends AnimatorListenerAdapter {
    public final boolean f28759a;
    public final int f28760b;
    public final int f28761c;
    public final int d;
    public final z0 f28762e;

    public y0(z0 z0Var, boolean z9, int i7, int i10, int i11) {
        this.f28762e = z0Var;
        this.f28759a = z9;
        this.f28760b = i7;
        this.f28761c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f28759a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = this.f28760b;
        int i10 = this.f28761c;
        int f11 = i0.a.f(f10, i7, i10);
        z0 z0Var = this.f28762e;
        z0Var.setTextColor(f11);
        z0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
