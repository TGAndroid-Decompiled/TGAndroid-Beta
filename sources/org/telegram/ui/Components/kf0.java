package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kf0 extends AnimatorListenerAdapter {
    public final int f26700a;
    public final of0 f26701b;

    public kf0(of0 of0Var, int i10) {
        this.f26700a = i10;
        this.f26701b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26700a) {
            case 0:
                this.f26701b.f27951x = null;
                return;
            default:
                this.f26701b.f27952y = null;
                return;
        }
    }
}
