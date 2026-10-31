package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rw extends AnimatorListenerAdapter {
    public final int f30030a;
    public final boolean f30031b;
    public final vy f30032c;

    public rw(vy vyVar, boolean z10, int i10) {
        this.f30030a = i10;
        this.f30032c = vyVar;
        this.f30031b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30030a) {
            case 0:
                if (!this.f30031b) {
                    this.f30032c.f31934y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30031b) {
                    this.f30032c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
