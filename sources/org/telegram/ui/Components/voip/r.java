package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f28359a;
    public final t f28360b;

    public r(t tVar, int i10) {
        this.f28359a = i10;
        this.f28360b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f28359a) {
            case 0:
                t tVar = this.f28360b;
                tVar.E = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f28360b;
                s sVar = tVar2.f28412b0;
                if (tVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                tVar2.f28410a0 = f7;
                sVar.setAlpha(f7);
                if (tVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                sVar.setVisibility(i10);
                tVar2.f28409a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f28360b;
                tVar3.J0 = null;
                o oVar = tVar3.f28409a;
                oVar.setRotationY(0.0f);
                if (!tVar3.K0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
