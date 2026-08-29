package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final boolean f22928a;
    public final int f22929b;
    public final int f22930c;
    public final int d;
    public final g1 f22931e;

    public f1(g1 g1Var, boolean z10, int i10, int i11, int i12) {
        this.f22931e = g1Var;
        this.f22928a = z10;
        this.f22929b = i10;
        this.f22930c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        if (this.f22928a) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        int i10 = this.f22929b;
        int i11 = this.f22930c;
        int d = i0.a.d(f9, i10, i11);
        g1 g1Var = this.f22931e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f9, this.d, i11));
    }
}
