package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hz0 extends AnimatorListenerAdapter {
    public final int f24905a;
    public final Switch f24906b;

    public hz0(Switch r12, int i10) {
        this.f24905a = i10;
        this.f24906b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24905a) {
            case 0:
                this.f24906b.d = null;
                return;
            default:
                this.f24906b.e = null;
                return;
        }
    }
}
