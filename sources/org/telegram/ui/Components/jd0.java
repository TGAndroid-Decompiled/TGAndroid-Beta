package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f36483a;
    public final md0 f36484b;

    public jd0(md0 md0Var, int i7) {
        this.f36483a = i7;
        this.f36484b = md0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36483a) {
            case 0:
                this.f36484b.f37498x1 = null;
                return;
            default:
                this.f36484b.f37499y1 = null;
                return;
        }
    }
}
