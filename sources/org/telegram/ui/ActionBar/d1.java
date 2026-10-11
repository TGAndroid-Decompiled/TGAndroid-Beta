package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d1 extends AnimatorListenerAdapter {
    public final boolean f20550a;
    public final int f20551b;
    public final int f20552c;
    public final int d;
    public final e1 f20553e;

    public d1(e1 e1Var, boolean z10, int i10, int i11, int i12) {
        this.f20553e = e1Var;
        this.f20550a = z10;
        this.f20551b = i10;
        this.f20552c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        if (this.f20550a) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = this.f20551b;
        int i11 = this.f20552c;
        int d = i0.a.d(f7, i10, i11);
        e1 e1Var = this.f20553e;
        e1Var.setTextColor(d);
        e1Var.setIconColor(i0.a.d(f7, this.d, i11));
    }
}
