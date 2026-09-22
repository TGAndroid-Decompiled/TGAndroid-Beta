package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fx extends AnimatorListenerAdapter {
    public final int f24102a;
    public final boolean f24103b;
    public final kz f24104c;

    public fx(kz kzVar, boolean z10, int i10) {
        this.f24102a = i10;
        this.f24104c = kzVar;
        this.f24103b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24102a) {
            case 0:
                if (!this.f24103b) {
                    this.f24104c.f25765x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24103b) {
                    this.f24104c.f25769y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
