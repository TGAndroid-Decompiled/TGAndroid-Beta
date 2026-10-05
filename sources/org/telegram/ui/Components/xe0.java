package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f32873a;
    public final bf0 f32874b;

    public xe0(bf0 bf0Var, int i10) {
        this.f32873a = i10;
        this.f32874b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32873a) {
            case 0:
                this.f32874b.f24961x = null;
                return;
            default:
                this.f32874b.f24962y = null;
                return;
        }
    }
}
