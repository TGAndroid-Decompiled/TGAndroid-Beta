package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ez0 extends AnimatorListenerAdapter {
    public final int f24022a;
    public final Switch f24023b;

    public ez0(Switch r12, int i10) {
        this.f24022a = i10;
        this.f24023b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24022a) {
            case 0:
                this.f24023b.d = null;
                return;
            default:
                this.f24023b.e = null;
                return;
        }
    }
}
