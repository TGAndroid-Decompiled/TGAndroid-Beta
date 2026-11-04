package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yu0 extends AnimatorListenerAdapter {
    public final int f40837a;
    public final zu0 f40838b;

    public yu0(zu0 zu0Var, int i3) {
        this.f40837a = i3;
        this.f40838b = zu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40837a) {
            case 0:
                this.f40838b.f41132s.setVisibility(8);
                return;
            case 1:
                this.f40838b.f41132s.setVisibility(8);
                return;
            default:
                this.f40838b.f41132s.setVisibility(8);
                return;
        }
    }
}
