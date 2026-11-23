package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f36436a;
    public final md0 f36437b;

    public jd0(md0 md0Var, int i7) {
        this.f36436a = i7;
        this.f36437b = md0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36436a) {
            case 0:
                this.f36437b.f37456x1 = null;
                return;
            default:
                this.f36437b.f37457y1 = null;
                return;
        }
    }
}
