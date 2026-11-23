package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g60 extends AnimatorListenerAdapter {
    public final int f35331a;
    public final h60 f35332b;

    public g60(h60 h60Var, int i7) {
        this.f35331a = i7;
        this.f35332b = h60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35331a) {
            case 0:
                h60 h60Var = this.f35332b;
                h60Var.f35648e.Y1 = null;
                h60Var.requestLayout();
                return;
            default:
                h60 h60Var2 = this.f35332b;
                h60Var2.f35648e.Y1 = null;
                h60Var2.f35645a = false;
                return;
        }
    }
}
