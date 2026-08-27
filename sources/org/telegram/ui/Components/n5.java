package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class n5 extends AnimatorListenerAdapter {

    public final int f30858a;

    public final t5 f30859b;

    public n5(t5 t5Var, int i10) {
        this.f30858a = i10;
        this.f30859b = t5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30858a) {
            case 0:
                this.f30859b.scaleAnimator = null;
                boolean unused = t5.lockPositionChanging = false;
                break;
            case 1:
                t5 t5Var = this.f30859b;
                t5Var.scaleAnimator = null;
                if (t5Var.removedAction != null) {
                    t5Var.removedAction.run();
                    t5Var.removedAction = null;
                }
                break;
            default:
                this.f30859b.moveAnimator = null;
                break;
        }
    }
}
