package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d1 extends AnimatorListenerAdapter {
    public final boolean f20285a;
    public final int f20286b;
    public final int f20287c;
    public final int d;
    public final e1 f20288e;

    public d1(e1 e1Var, boolean z10, int i10, int i11, int i12) {
        this.f20288e = e1Var;
        this.f20285a = z10;
        this.f20286b = i10;
        this.f20287c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        if (this.f20285a) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = this.f20286b;
        int i11 = this.f20287c;
        int d = i0.a.d(f7, i10, i11);
        e1 e1Var = this.f20288e;
        e1Var.setTextColor(d);
        e1Var.setIconColor(i0.a.d(f7, this.d, i11));
    }
}
