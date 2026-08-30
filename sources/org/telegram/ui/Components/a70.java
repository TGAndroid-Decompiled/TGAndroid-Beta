package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a70 extends AnimatorListenerAdapter {
    public final int f23310a;
    public final b70 f23311b;

    public a70(b70 b70Var, int i10) {
        this.f23310a = i10;
        this.f23311b = b70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23310a) {
            case 0:
                b70 b70Var = this.f23311b;
                b70Var.e.f23863a0 = null;
                b70Var.requestLayout();
                return;
            default:
                b70 b70Var2 = this.f23311b;
                b70Var2.e.f23863a0 = null;
                b70Var2.f23586a = false;
                return;
        }
    }
}
