package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f33767a;
    public final t f33768b;

    public r(t tVar, int i9) {
        this.f33767a = i9;
        this.f33768b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i9;
        switch (this.f33767a) {
            case 0:
                t tVar = this.f33768b;
                tVar.A = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f33768b;
                s sVar = tVar2.U;
                if (tVar2.S) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                tVar2.T = f10;
                sVar.setAlpha(f10);
                if (tVar2.S) {
                    i9 = 8;
                } else {
                    i9 = 0;
                }
                sVar.setVisibility(i9);
                tVar2.f33821a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f33768b;
                tVar3.F0 = null;
                o oVar = tVar3.f33821a;
                oVar.setRotationY(0.0f);
                if (!tVar3.G0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
