package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d1 extends AnimatorListenerAdapter {
    public final boolean f18800a;
    public final int f18801b;
    public final int f18802c;
    public final int d;
    public final e1 e;

    public d1(e1 e1Var, boolean z10, int i10, int i11, int i12) {
        this.e = e1Var;
        this.f18800a = z10;
        this.f18801b = i10;
        this.f18802c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        if (this.f18800a) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = this.f18801b;
        int i11 = this.f18802c;
        int d = i0.a.d(f7, i10, i11);
        e1 e1Var = this.e;
        e1Var.setTextColor(d);
        e1Var.setIconColor(i0.a.d(f7, this.d, i11));
    }
}
