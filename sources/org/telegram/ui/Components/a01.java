package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a01 extends AnimatorListenerAdapter {
    public final int f26375a;
    public final Switch f26376b;

    public a01(Switch r12, int i10) {
        this.f26375a = i10;
        this.f26376b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26375a) {
            case 0:
                this.f26376b.d = null;
                return;
            default:
                this.f26376b.e = null;
                return;
        }
    }
}
