package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j60 extends AnimatorListenerAdapter {
    public final int f36384a;
    public final k60 f36385b;

    public j60(k60 k60Var, int i7) {
        this.f36384a = i7;
        this.f36385b = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36384a) {
            case 0:
                k60 k60Var = this.f36385b;
                k60Var.f36784e.Y1 = null;
                k60Var.requestLayout();
                return;
            default:
                k60 k60Var2 = this.f36385b;
                k60Var2.f36784e.Y1 = null;
                k60Var2.f36781a = false;
                return;
        }
    }
}
