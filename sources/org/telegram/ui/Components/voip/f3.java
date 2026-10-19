package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31465a;
    public final h3 f31466b;

    public f3(h3 h3Var, int i10) {
        this.f31465a = i10;
        this.f31466b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31465a) {
            case 0:
                h3 h3Var = this.f31466b;
                h3Var.f31509r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31466b;
                h3Var2.f31510s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
