package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f36477a;
    public final md0 f36478b;

    public jd0(md0 md0Var, int i7) {
        this.f36477a = i7;
        this.f36478b = md0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36477a) {
            case 0:
                this.f36478b.f37496x1 = null;
                return;
            default:
                this.f36478b.f37497y1 = null;
                return;
        }
    }
}
