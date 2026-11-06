package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw extends AnimatorListenerAdapter {
    public final int f32673a;
    public final boolean f32674b;
    public final gy f32675c;

    public cw(gy gyVar, boolean z9, int i7) {
        this.f32673a = i7;
        this.f32675c = gyVar;
        this.f32674b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32673a) {
            case 0:
                if (!this.f32674b) {
                    this.f32675c.f34100y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32674b) {
                    this.f32675c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
