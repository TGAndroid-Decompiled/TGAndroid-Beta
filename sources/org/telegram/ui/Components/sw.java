package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class sw extends AnimatorListenerAdapter {

    public final int f32588a;

    public final boolean f32589b;

    public final yy f32590c;

    public sw(yy yyVar, boolean z10, int i10) {
        this.f32588a = i10;
        this.f32590c = yyVar;
        this.f32589b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32588a) {
            case 0:
                if (!this.f32589b) {
                    this.f32590c.f35051x.setVisibility(4);
                }
                break;
            default:
                if (!this.f32589b) {
                    this.f32590c.f35055y.setVisibility(4);
                }
                break;
        }
    }
}
