package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix0 extends AnimatorListenerAdapter {
    public final int f25203a;
    public final jx0 f25204b;

    public ix0(jx0 jx0Var, int i10) {
        this.f25203a = i10;
        this.f25204b = jx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25203a) {
            case 0:
                this.f25204b.f25550s.setVisibility(8);
                return;
            case 1:
                this.f25204b.f25550s.setVisibility(8);
                return;
            default:
                this.f25204b.f25550s.setVisibility(8);
                return;
        }
    }
}
