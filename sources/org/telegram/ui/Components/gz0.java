package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f24647a;
    public final Switch f24648b;

    public gz0(Switch r12, int i10) {
        this.f24647a = i10;
        this.f24648b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24647a) {
            case 0:
                this.f24648b.d = null;
                return;
            default:
                this.f24648b.e = null;
                return;
        }
    }
}
