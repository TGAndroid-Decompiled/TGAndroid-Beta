package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l1 extends AnimatorListenerAdapter {
    public final int f31061a;
    public final r1 f31062b;

    public l1(r1 r1Var, int i7) {
        this.f31061a = i7;
        this.f31062b = r1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31061a) {
            case 0:
                r1 r1Var = this.f31062b;
                r1Var.Q5.O0 = true;
                r1Var.invalidate();
                return;
            default:
                this.f31062b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
