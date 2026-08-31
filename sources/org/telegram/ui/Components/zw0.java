package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zw0 extends AnimatorListenerAdapter {
    public final int f34040a;
    public final ax0 f34041b;

    public zw0(ax0 ax0Var, int i10) {
        this.f34040a = i10;
        this.f34041b = ax0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34040a) {
            case 0:
                this.f34041b.f25368s.setVisibility(8);
                return;
            case 1:
                this.f34041b.f25368s.setVisibility(8);
                return;
            default:
                this.f34041b.f25368s.setVisibility(8);
                return;
        }
    }
}
