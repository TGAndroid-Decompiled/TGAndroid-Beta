package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vx extends AnimatorListenerAdapter {
    public final int f32469a;
    public final boolean f32470b;
    public final a00 f32471c;

    public vx(a00 a00Var, boolean z10, int i10) {
        this.f32469a = i10;
        this.f32471c = a00Var;
        this.f32470b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32469a) {
            case 0:
                if (!this.f32470b) {
                    this.f32471c.f24467x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32470b) {
                    this.f32471c.f24471y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
