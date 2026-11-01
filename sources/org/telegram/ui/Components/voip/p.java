package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f31639a;
    public final r f31640b;

    public p(r rVar, int i10) {
        this.f31639a = i10;
        this.f31640b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f31639a) {
            case 0:
                r rVar = this.f31640b;
                rVar.E = false;
                rVar.invalidate();
                return;
            case 1:
                r rVar2 = this.f31640b;
                q qVar = rVar2.f31666b0;
                if (rVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                rVar2.f31664a0 = f7;
                qVar.setAlpha(f7);
                if (rVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                qVar.setVisibility(i10);
                rVar2.f31663a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                r rVar3 = this.f31640b;
                rVar3.J0 = null;
                n nVar = rVar3.f31663a;
                nVar.setRotationY(0.0f);
                if (!rVar3.K0) {
                    nVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f31640b.E = false;
                return;
            default:
                this.f31640b.E = false;
                return;
        }
    }
}
