package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ay0 extends AnimatorListenerAdapter {
    public final int f24660a;
    public final by0 f24661b;

    public ay0(by0 by0Var, int i10) {
        this.f24660a = i10;
        this.f24661b = by0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24660a) {
            case 0:
                this.f24661b.f25089s.setVisibility(8);
                return;
            case 1:
                this.f24661b.f25089s.setVisibility(8);
                return;
            default:
                this.f24661b.f25089s.setVisibility(8);
                return;
        }
    }
}
