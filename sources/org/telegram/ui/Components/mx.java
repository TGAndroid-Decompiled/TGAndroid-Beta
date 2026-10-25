package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mx extends AnimatorListenerAdapter {
    public final int f30766a;
    public final boolean f30767b;
    public final sz f30768c;

    public mx(sz szVar, boolean z10, int i10) {
        this.f30766a = i10;
        this.f30768c = szVar;
        this.f30767b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30766a) {
            case 0:
                if (!this.f30767b) {
                    this.f30768c.f32781x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30767b) {
                    this.f30768c.f32785y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
