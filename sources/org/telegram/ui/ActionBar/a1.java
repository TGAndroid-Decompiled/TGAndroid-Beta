package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a1 extends AnimatorListenerAdapter {
    public final boolean f20140a;
    public final int f20141b;
    public final int f20142c;
    public final int d;
    public final b1 e;

    public a1(b1 b1Var, boolean z10, int i10, int i11, int i12) {
        this.e = b1Var;
        this.f20140a = z10;
        this.f20141b = i10;
        this.f20142c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        if (this.f20140a) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = this.f20141b;
        int i11 = this.f20142c;
        int f10 = i0.b.f(f7, i10, i11);
        b1 b1Var = this.e;
        b1Var.setTextColor(f10);
        b1Var.setIconColor(i0.b.f(f7, this.d, i11));
    }
}
