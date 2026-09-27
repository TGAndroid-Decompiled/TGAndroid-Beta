package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f24677a;
    public final Switch f24678b;

    public gz0(Switch r12, int i10) {
        this.f24677a = i10;
        this.f24678b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24677a) {
            case 0:
                this.f24678b.d = null;
                return;
            default:
                this.f24678b.e = null;
                return;
        }
    }
}
