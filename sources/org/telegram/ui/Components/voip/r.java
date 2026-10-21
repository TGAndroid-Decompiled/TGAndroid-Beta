package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f31660a;
    public final t f31661b;

    public r(t tVar, int i10) {
        this.f31660a = i10;
        this.f31661b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f31660a) {
            case 0:
                t tVar = this.f31661b;
                tVar.E = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f31661b;
                s sVar = tVar2.f31711b0;
                if (tVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                tVar2.f31709a0 = f7;
                sVar.setAlpha(f7);
                if (tVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                sVar.setVisibility(i10);
                tVar2.f31708a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f31661b;
                tVar3.J0 = null;
                o oVar = tVar3.f31708a;
                oVar.setRotationY(0.0f);
                if (!tVar3.K0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
