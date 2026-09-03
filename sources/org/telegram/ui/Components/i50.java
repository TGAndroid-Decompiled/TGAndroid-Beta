package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i50 extends AnimatorListenerAdapter {
    public final int f25577a;
    public final y50 f25578b;

    public i50(y50 y50Var, int i10) {
        this.f25577a = i10;
        this.f25578b = y50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25577a) {
            case 0:
                y50 y50Var = this.f25578b;
                if (animator.equals(y50Var.D)) {
                    y50Var.D = null;
                    return;
                }
                return;
            case 1:
                y50 y50Var2 = this.f25578b;
                if (y50Var2.Y0 != null) {
                    y50Var2.Y0 = null;
                    return;
                }
                return;
            default:
                y50 y50Var3 = this.f25578b;
                if (animator.equals(y50Var3.T)) {
                    y50Var3.h(true);
                    y50Var3.T0 = false;
                    y50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
