package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f31664a;
    public final t f31665b;

    public r(t tVar, int i10) {
        this.f31664a = i10;
        this.f31665b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f31664a) {
            case 0:
                t tVar = this.f31665b;
                tVar.E = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f31665b;
                s sVar = tVar2.f31715b0;
                if (tVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                tVar2.f31713a0 = f7;
                sVar.setAlpha(f7);
                if (tVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                sVar.setVisibility(i10);
                tVar2.f31712a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f31665b;
                tVar3.J0 = null;
                o oVar = tVar3.f31712a;
                oVar.setRotationY(0.0f);
                if (!tVar3.K0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
