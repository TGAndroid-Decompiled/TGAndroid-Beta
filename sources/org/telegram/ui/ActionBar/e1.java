package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final boolean f20399a;
    public final int f20400b;
    public final int f20401c;
    public final int d;
    public final f1 f20402e;

    public e1(f1 f1Var, boolean z10, int i10, int i11, int i12) {
        this.f20402e = f1Var;
        this.f20399a = z10;
        this.f20400b = i10;
        this.f20401c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        if (this.f20399a) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = this.f20400b;
        int i11 = this.f20401c;
        int d = i0.a.d(f7, i10, i11);
        f1 f1Var = this.f20402e;
        f1Var.setTextColor(d);
        f1Var.setIconColor(i0.a.d(f7, this.d, i11));
    }
}
