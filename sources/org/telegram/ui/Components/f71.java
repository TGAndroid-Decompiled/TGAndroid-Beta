package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f71 extends AnimatorListenerAdapter {
    public final int f33479a;
    public final g71 f33480b;

    public f71(g71 g71Var, int i7) {
        this.f33479a = i7;
        this.f33480b = g71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33479a) {
            case 0:
                this.f33480b.D = null;
                return;
            default:
                this.f33480b.D = null;
                return;
        }
    }
}
