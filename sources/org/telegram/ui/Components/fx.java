package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fx extends AnimatorListenerAdapter {
    public final int f24021a;
    public final boolean f24022b;
    public final kz f24023c;

    public fx(kz kzVar, boolean z10, int i10) {
        this.f24021a = i10;
        this.f24023c = kzVar;
        this.f24022b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24021a) {
            case 0:
                if (!this.f24022b) {
                    this.f24023c.f25778x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24022b) {
                    this.f24023c.f25782y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
