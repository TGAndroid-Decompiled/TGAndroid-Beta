package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f40958a;
    public final k2 f40959b;

    public j2(k2 k2Var, int i7) {
        this.f40958a = i7;
        this.f40959b = k2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40958a) {
            case 0:
                this.f40959b.f41010b.setVisibility(8);
                return;
            default:
                this.f40959b.f41011c.setVisibility(8);
                return;
        }
    }
}
