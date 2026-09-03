package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ex extends AnimatorListenerAdapter {
    public final int f24711a;
    public final boolean f24712b;
    public final kz f24713c;

    public ex(kz kzVar, boolean z4, int i10) {
        this.f24711a = i10;
        this.f24713c = kzVar;
        this.f24712b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24711a) {
            case 0:
                if (!this.f24712b) {
                    this.f24713c.f26495x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24712b) {
                    this.f24713c.f26499y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
