package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw extends AnimatorListenerAdapter {
    public final int f32686a;
    public final boolean f32687b;
    public final gy f32688c;

    public cw(gy gyVar, boolean z9, int i7) {
        this.f32686a = i7;
        this.f32688c = gyVar;
        this.f32687b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32686a) {
            case 0:
                if (!this.f32687b) {
                    this.f32688c.f34092y.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f32687b) {
                    this.f32688c.D.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
