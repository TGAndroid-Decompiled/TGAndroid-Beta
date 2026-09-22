package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s extends AnimatorListenerAdapter {
    public final int f29555a;
    public final u f29556b;

    public s(u uVar, int i10) {
        this.f29555a = i10;
        this.f29556b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f29555a) {
            case 0:
                u uVar = this.f29556b;
                uVar.E = false;
                uVar.invalidate();
                return;
            case 1:
                u uVar2 = this.f29556b;
                t tVar = uVar2.f29608b0;
                if (uVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                uVar2.f29606a0 = f7;
                tVar.setAlpha(f7);
                if (uVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                tVar.setVisibility(i10);
                uVar2.f29605a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.f29556b;
                uVar3.J0 = null;
                p pVar = uVar3.f29605a;
                pVar.setRotationY(0.0f);
                if (!uVar3.K0) {
                    pVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
