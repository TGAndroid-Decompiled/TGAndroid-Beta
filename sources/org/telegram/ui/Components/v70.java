package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v70 extends AnimatorListenerAdapter {
    public final int f31375a;
    public final w70 f31376b;

    public v70(w70 w70Var, int i10) {
        this.f31375a = i10;
        this.f31376b = w70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31375a) {
            case 0:
                w70 w70Var = this.f31376b;
                w70Var.e.f32454d0 = null;
                w70Var.requestLayout();
                return;
            default:
                w70 w70Var2 = this.f31376b;
                w70Var2.e.f32454d0 = null;
                w70Var2.f32174a = false;
                return;
        }
    }
}
