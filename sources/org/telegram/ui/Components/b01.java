package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b01 extends AnimatorListenerAdapter {
    public final int f24509a;
    public final Switch f24510b;

    public b01(Switch r12, int i10) {
        this.f24509a = i10;
        this.f24510b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24509a) {
            case 0:
                this.f24510b.d = null;
                return;
            default:
                this.f24510b.f24118e = null;
                return;
        }
    }
}
