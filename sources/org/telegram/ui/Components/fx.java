package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fx extends AnimatorListenerAdapter {
    public final int f24024a;
    public final boolean f24025b;
    public final kz f24026c;

    public fx(kz kzVar, boolean z10, int i10) {
        this.f24024a = i10;
        this.f24026c = kzVar;
        this.f24025b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24024a) {
            case 0:
                if (!this.f24025b) {
                    this.f24026c.f25781x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24025b) {
                    this.f24026c.f25785y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
