package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final boolean f19675a;
    public final int f19676b;
    public final int f19677c;
    public final int d;
    public final g1 e;

    public f1(g1 g1Var, boolean z4, int i10, int i11, int i12) {
        this.e = g1Var;
        this.f19675a = z4;
        this.f19676b = i10;
        this.f19677c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f19675a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f19676b;
        int i11 = this.f19677c;
        int d = i0.a.d(f10, i10, i11);
        g1 g1Var = this.e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f10, this.d, i11));
    }
}
