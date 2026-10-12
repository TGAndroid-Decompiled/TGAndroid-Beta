package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s extends AnimatorListenerAdapter {
    public final int f31946a;
    public final u f31947b;

    public s(u uVar, int i10) {
        this.f31946a = i10;
        this.f31947b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f31946a) {
            case 0:
                u uVar = this.f31947b;
                uVar.E = false;
                uVar.invalidate();
                return;
            case 1:
                u uVar2 = this.f31947b;
                t tVar = uVar2.f31998b0;
                if (uVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                uVar2.f31996a0 = f7;
                tVar.setAlpha(f7);
                if (uVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                tVar.setVisibility(i10);
                uVar2.f31995a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.f31947b;
                uVar3.J0 = null;
                p pVar = uVar3.f31995a;
                pVar.setRotationY(0.0f);
                if (!uVar3.K0) {
                    pVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
