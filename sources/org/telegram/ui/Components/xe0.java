package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f32782a;
    public final bf0 f32783b;

    public xe0(bf0 bf0Var, int i10) {
        this.f32782a = i10;
        this.f32783b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32782a) {
            case 0:
                this.f32783b.f24945x = null;
                return;
            default:
                this.f32783b.f24946y = null;
                return;
        }
    }
}
