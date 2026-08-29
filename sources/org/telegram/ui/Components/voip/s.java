package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s extends AnimatorListenerAdapter {
    public final int f33975a;
    public final u f33976b;

    public s(u uVar, int i10) {
        this.f33975a = i10;
        this.f33976b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        int i10;
        switch (this.f33975a) {
            case 0:
                u uVar = this.f33976b;
                uVar.A = false;
                uVar.invalidate();
                return;
            case 1:
                u uVar2 = this.f33976b;
                t tVar = uVar2.U;
                if (uVar2.S) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                uVar2.T = f9;
                tVar.setAlpha(f9);
                if (uVar2.S) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                tVar.setVisibility(i10);
                uVar2.f34014a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.f33976b;
                uVar3.F0 = null;
                p pVar = uVar3.f34014a;
                pVar.setRotationY(0.0f);
                if (!uVar3.G0) {
                    pVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
