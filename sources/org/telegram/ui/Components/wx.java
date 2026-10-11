package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wx extends AnimatorListenerAdapter {
    public final int f32753a;
    public final boolean f32754b;
    public final b00 f32755c;

    public wx(b00 b00Var, boolean z10, int i10) {
        this.f32753a = i10;
        this.f32755c = b00Var;
        this.f32754b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32753a) {
            case 0:
                if (!this.f32754b) {
                    this.f32755c.f24728x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32754b) {
                    this.f32755c.f24732y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
