package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f24511a;
    public final Switch f24512b;

    public gz0(Switch r12, int i10) {
        this.f24511a = i10;
        this.f24512b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24511a) {
            case 0:
                this.f24512b.d = null;
                return;
            default:
                this.f24512b.e = null;
                return;
        }
    }
}
