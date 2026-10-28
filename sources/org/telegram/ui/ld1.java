package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ld1 extends AnimatorListenerAdapter {
    public final int f41088a;
    public final md1 f41089b;

    public ld1(md1 md1Var, int i10) {
        this.f41088a = i10;
        this.f41089b = md1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41088a) {
            case 0:
                this.f41089b.f41420b.f42970s.setVisibility(8);
                return;
            default:
                this.f41089b.f41420b.f42964a.setVisibility(8);
                return;
        }
    }
}
