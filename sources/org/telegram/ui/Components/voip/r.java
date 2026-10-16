package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f30097a;
    public final t f30098b;

    public r(t tVar, int i10) {
        this.f30097a = i10;
        this.f30098b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f30097a) {
            case 0:
                t tVar = this.f30098b;
                tVar.E = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f30098b;
                s sVar = tVar2.f30148b0;
                if (tVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                tVar2.f30146a0 = f7;
                sVar.setAlpha(f7);
                if (tVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                sVar.setVisibility(i10);
                tVar2.f30145a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f30098b;
                tVar3.J0 = null;
                o oVar = tVar3.f30145a;
                oVar.setRotationY(0.0f);
                if (!tVar3.K0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
