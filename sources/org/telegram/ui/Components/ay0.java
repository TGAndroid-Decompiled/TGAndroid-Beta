package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ay0 extends AnimatorListenerAdapter {
    public final int f24582a;
    public final Switch f24583b;

    public ay0(Switch r12, int i10) {
        this.f24582a = i10;
        this.f24583b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24582a) {
            case 0:
                this.f24583b.d = null;
                return;
            default:
                this.f24583b.e = null;
                return;
        }
    }
}
