package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f32775a;
    public final bf0 f32776b;

    public xe0(bf0 bf0Var, int i10) {
        this.f32775a = i10;
        this.f32776b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32775a) {
            case 0:
                this.f32776b.f24940x = null;
                return;
            default:
                this.f32776b.f24941y = null;
                return;
        }
    }
}
