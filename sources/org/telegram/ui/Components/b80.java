package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b80 extends AnimatorListenerAdapter {
    public final int f24929a;
    public final c80 f24930b;

    public b80(c80 c80Var, int i10) {
        this.f24929a = i10;
        this.f24930b = c80Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24929a) {
            case 0:
                c80 c80Var = this.f24930b;
                c80Var.f25289e.f25623d0 = null;
                c80Var.requestLayout();
                return;
            default:
                c80 c80Var2 = this.f24930b;
                c80Var2.f25289e.f25623d0 = null;
                c80Var2.f25286a = false;
                return;
        }
    }
}
