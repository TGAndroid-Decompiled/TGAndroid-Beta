package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final boolean f22928a;
    public final int f22929b;
    public final int f22930c;
    public final int d;
    public final g1 f22931e;

    public f1(g1 g1Var, boolean z10, int i9, int i10, int i11) {
        this.f22931e = g1Var;
        this.f22928a = z10;
        this.f22929b = i9;
        this.f22930c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f22928a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i9 = this.f22929b;
        int i10 = this.f22930c;
        int d = i0.a.d(f10, i9, i10);
        g1 g1Var = this.f22931e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f10, this.d, i10));
    }
}
