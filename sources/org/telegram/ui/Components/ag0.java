package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag0 extends AnimatorListenerAdapter {
    public final int f22650a;
    public final bg0 f22651b;

    public ag0(bg0 bg0Var, int i10) {
        this.f22650a = i10;
        this.f22651b = bg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22650a) {
            case 0:
                this.f22651b.f22998a.f23297n.setVisibility(8);
                return;
            default:
                this.f22651b.f22998a.h.setVisibility(8);
                return;
        }
    }
}
