package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f31571a;
    public final r f31572b;

    public p(r rVar, int i10) {
        this.f31571a = i10;
        this.f31572b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f31571a) {
            case 0:
                r rVar = this.f31572b;
                rVar.E = false;
                rVar.invalidate();
                return;
            case 1:
                r rVar2 = this.f31572b;
                q qVar = rVar2.f31603b0;
                if (rVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                rVar2.f31601a0 = f7;
                qVar.setAlpha(f7);
                if (rVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                qVar.setVisibility(i10);
                rVar2.f31600a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                r rVar3 = this.f31572b;
                rVar3.J0 = null;
                n nVar = rVar3.f31600a;
                nVar.setRotationY(0.0f);
                if (!rVar3.K0) {
                    nVar.d.clearImage();
                    return;
                }
                return;
            case 3:
                this.f31572b.E = false;
                return;
            default:
                this.f31572b.E = false;
                return;
        }
    }
}
