package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd1 extends AnimatorListenerAdapter {
    public final int f40569a;
    public final kd1 f40570b;

    public jd1(kd1 kd1Var, int i10) {
        this.f40569a = i10;
        this.f40570b = kd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40569a) {
            case 0:
                this.f40570b.f40890b.f42477s.setVisibility(8);
                return;
            default:
                this.f40570b.f40890b.f42471a.setVisibility(8);
                return;
        }
    }
}
