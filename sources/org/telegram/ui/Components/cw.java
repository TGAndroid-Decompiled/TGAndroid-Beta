package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw extends AnimatorListenerAdapter {
    public final int f32770a;
    public final boolean f32771b;
    public final gy f32772c;

    public cw(gy gyVar, boolean z9, int i7) {
        this.f32770a = i7;
        this.f32772c = gyVar;
        this.f32771b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32770a) {
            case 0:
                if (!this.f32771b) {
                    this.f32772c.f34084y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32771b) {
                    this.f32772c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
