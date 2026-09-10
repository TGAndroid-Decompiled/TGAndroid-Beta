package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final boolean f17699a;
    public final int f17700b;
    public final int f17701c;
    public final int d;
    public final g1 e;

    public f1(g1 g1Var, boolean z10, int i10, int i11, int i12) {
        this.e = g1Var;
        this.f17699a = z10;
        this.f17700b = i10;
        this.f17701c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        if (this.f17699a) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = this.f17700b;
        int i11 = this.f17701c;
        int d = i0.a.d(f7, i10, i11);
        g1 g1Var = this.e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f7, this.d, i11));
    }
}
