package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s extends AnimatorListenerAdapter {
    public final int f29593a;
    public final u f29594b;

    public s(u uVar, int i10) {
        this.f29593a = i10;
        this.f29594b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f29593a) {
            case 0:
                u uVar = this.f29594b;
                uVar.E = false;
                uVar.invalidate();
                return;
            case 1:
                u uVar2 = this.f29594b;
                t tVar = uVar2.f29646b0;
                if (uVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                uVar2.f29644a0 = f7;
                tVar.setAlpha(f7);
                if (uVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                tVar.setVisibility(i10);
                uVar2.f29643a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.f29594b;
                uVar3.J0 = null;
                p pVar = uVar3.f29643a;
                pVar.setRotationY(0.0f);
                if (!uVar3.K0) {
                    pVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
