package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f36478a;
    public final md0 f36479b;

    public jd0(md0 md0Var, int i7) {
        this.f36478a = i7;
        this.f36479b = md0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36478a) {
            case 0:
                this.f36479b.f37497x1 = null;
                return;
            default:
                this.f36479b.f37498y1 = null;
                return;
        }
    }
}
