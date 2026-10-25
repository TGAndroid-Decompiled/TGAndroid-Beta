package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd1 extends AnimatorListenerAdapter {
    public final int f40566a;
    public final kd1 f40567b;

    public jd1(kd1 kd1Var, int i10) {
        this.f40566a = i10;
        this.f40567b = kd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40566a) {
            case 0:
                this.f40567b.f40887b.f42474s.setVisibility(8);
                return;
            default:
                this.f40567b.f40887b.f42468a.setVisibility(8);
                return;
        }
    }
}
