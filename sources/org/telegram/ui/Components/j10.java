package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34815a;
    public final p10 f34816b;

    public j10(p10 p10Var, int i7) {
        this.f34815a = i7;
        this.f34816b = p10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34815a) {
            case 0:
                p10 p10Var = this.f34816b;
                p10Var.f36765b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                return;
            default:
                this.f34816b.f36770e.setVisibility(8);
                return;
        }
    }
}
