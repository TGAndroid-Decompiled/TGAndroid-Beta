package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class te0 extends AnimatorListenerAdapter {
    public final int f30631a;
    public final ue0 f30632b;

    public te0(ue0 ue0Var, int i10) {
        this.f30631a = i10;
        this.f30632b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30631a) {
            case 0:
                this.f30632b.f30946a.f31273n.setVisibility(8);
                return;
            default:
                this.f30632b.f30946a.h.setVisibility(8);
                return;
        }
    }
}
