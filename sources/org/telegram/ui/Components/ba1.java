package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ba1 extends AnimatorListenerAdapter {
    public final int f24959a;
    public final ca1 f24960b;

    public ba1(ca1 ca1Var, int i10) {
        this.f24959a = i10;
        this.f24960b = ca1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24959a) {
            case 0:
                this.f24960b.f25317y = null;
                return;
            default:
                this.f24960b.f25317y = null;
                return;
        }
    }
}
