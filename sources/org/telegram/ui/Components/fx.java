package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fx extends AnimatorListenerAdapter {
    public final int f24105a;
    public final boolean f24106b;
    public final kz f24107c;

    public fx(kz kzVar, boolean z10, int i10) {
        this.f24105a = i10;
        this.f24107c = kzVar;
        this.f24106b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24105a) {
            case 0:
                if (!this.f24106b) {
                    this.f24107c.f25768x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24106b) {
                    this.f24107c.f25772y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
