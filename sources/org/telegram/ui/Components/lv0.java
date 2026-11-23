package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lv0 extends AnimatorListenerAdapter {
    public final int f37242a;
    public final mv0 f37243b;

    public lv0(mv0 mv0Var, int i7) {
        this.f37242a = i7;
        this.f37243b = mv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37242a) {
            case 0:
                this.f37243b.f37557s.setVisibility(8);
                return;
            case 1:
                this.f37243b.f37557s.setVisibility(8);
                return;
            default:
                this.f37243b.f37557s.setVisibility(8);
                return;
        }
    }
}
