package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final boolean f21341a;
    public final int f21342b;
    public final int f21343c;
    public final int d;
    public final g1 f21344e;

    public f1(g1 g1Var, boolean z4, int i10, int i11, int i12) {
        this.f21344e = g1Var;
        this.f21341a = z4;
        this.f21342b = i10;
        this.f21343c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        if (this.f21341a) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f21342b;
        int i11 = this.f21343c;
        int d = i0.a.d(f10, i10, i11);
        g1 g1Var = this.f21344e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f10, this.d, i11));
    }
}
