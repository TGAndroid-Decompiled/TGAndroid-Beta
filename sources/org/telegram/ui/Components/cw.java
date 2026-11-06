package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw extends AnimatorListenerAdapter {
    public final int f32682a;
    public final boolean f32683b;
    public final gy f32684c;

    public cw(gy gyVar, boolean z9, int i7) {
        this.f32682a = i7;
        this.f32684c = gyVar;
        this.f32683b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32682a) {
            case 0:
                if (!this.f32683b) {
                    this.f32684c.f34144y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32683b) {
                    this.f32684c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
