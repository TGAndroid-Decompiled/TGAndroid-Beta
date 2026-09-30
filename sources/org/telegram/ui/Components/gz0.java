package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f24648a;
    public final Switch f24649b;

    public gz0(Switch r12, int i10) {
        this.f24648a = i10;
        this.f24649b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24648a) {
            case 0:
                this.f24649b.d = null;
                return;
            default:
                this.f24649b.e = null;
                return;
        }
    }
}
