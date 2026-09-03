package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final boolean f21343a;
    public final int f21344b;
    public final int f21345c;
    public final int d;
    public final g1 f21346e;

    public f1(g1 g1Var, boolean z4, int i10, int i11, int i12) {
        this.f21346e = g1Var;
        this.f21343a = z4;
        this.f21344b = i10;
        this.f21345c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f21343a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f21344b;
        int i11 = this.f21345c;
        int d = i0.a.d(f10, i10, i11);
        g1 g1Var = this.f21346e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f10, this.d, i11));
    }
}
