package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j5 extends AnimatorListenerAdapter {
    public final int f34961a;
    public final p5 f34962b;

    public j5(p5 p5Var, int i3) {
        this.f34961a = i3;
        this.f34962b = p5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34961a) {
            case 0:
                p5.access$002(this.f34962b, null);
                p5.access$102(false);
                return;
            case 1:
                p5 p5Var = this.f34962b;
                p5.access$002(p5Var, null);
                if (p5.access$200(p5Var) != null) {
                    p5.access$200(p5Var).run();
                    p5.access$202(p5Var, null);
                    return;
                }
                return;
            default:
                p5.access$302(this.f34962b, null);
                return;
        }
    }
}
