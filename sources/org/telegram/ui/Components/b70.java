package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b70 extends AnimatorListenerAdapter {
    public final int f23574a;
    public final c70 f23575b;

    public b70(c70 c70Var, int i10) {
        this.f23574a = i10;
        this.f23575b = c70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23574a) {
            case 0:
                c70 c70Var = this.f23575b;
                c70Var.e.f24188a0 = null;
                c70Var.requestLayout();
                return;
            default:
                c70 c70Var2 = this.f23575b;
                c70Var2.e.f24188a0 = null;
                c70Var2.f23837a = false;
                return;
        }
    }
}
