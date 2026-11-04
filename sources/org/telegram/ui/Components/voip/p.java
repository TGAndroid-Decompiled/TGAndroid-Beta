package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f39504a;
    public final r f39505b;

    public p(r rVar, int i3) {
        this.f39504a = i3;
        this.f39505b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i3;
        switch (this.f39504a) {
            case 0:
                r rVar = this.f39505b;
                rVar.F = false;
                rVar.invalidate();
                return;
            case 1:
                r rVar2 = this.f39505b;
                q qVar = rVar2.f39551c0;
                if (rVar2.f39547a0) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                rVar2.f39549b0 = f10;
                qVar.setAlpha(f10);
                if (rVar2.f39547a0) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                qVar.setVisibility(i3);
                rVar2.f39546a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                r rVar3 = this.f39505b;
                rVar3.K0 = null;
                n nVar = rVar3.f39546a;
                nVar.setRotationY(0.0f);
                if (!rVar3.L0) {
                    nVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f39505b.F = false;
                return;
            default:
                this.f39505b.F = false;
                return;
        }
    }
}
