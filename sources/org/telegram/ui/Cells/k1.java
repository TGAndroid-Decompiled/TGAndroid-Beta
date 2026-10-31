package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f22115a;
    public final q1 f22116b;

    public k1(q1 q1Var, int i10) {
        this.f22115a = i10;
        this.f22116b = q1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22115a) {
            case 0:
                q1 q1Var = this.f22116b;
                q1Var.O5.M0 = true;
                q1Var.invalidate();
                return;
            default:
                this.f22116b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
