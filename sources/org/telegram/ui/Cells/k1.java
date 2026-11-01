package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f22116a;
    public final q1 f22117b;

    public k1(q1 q1Var, int i10) {
        this.f22116a = i10;
        this.f22117b = q1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22116a) {
            case 0:
                q1 q1Var = this.f22117b;
                q1Var.O5.M0 = true;
                q1Var.invalidate();
                return;
            default:
                this.f22117b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
