package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f32776a;
    public final bf0 f32777b;

    public xe0(bf0 bf0Var, int i10) {
        this.f32776a = i10;
        this.f32777b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32776a) {
            case 0:
                this.f32777b.f24941x = null;
                return;
            default:
                this.f32777b.f24942y = null;
                return;
        }
    }
}
