package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rw extends AnimatorListenerAdapter {
    public final int f30089a;
    public final boolean f30090b;
    public final vy f30091c;

    public rw(vy vyVar, boolean z10, int i10) {
        this.f30089a = i10;
        this.f30091c = vyVar;
        this.f30090b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30089a) {
            case 0:
                if (!this.f30090b) {
                    this.f30091c.f32012y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30090b) {
                    this.f30091c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
