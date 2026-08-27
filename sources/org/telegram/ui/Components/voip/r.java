package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class r extends AnimatorListenerAdapter {

    public final int f33817a;

    public final t f33818b;

    public r(t tVar, int i10) {
        this.f33817a = i10;
        this.f33818b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33817a) {
            case 0:
                t tVar = this.f33818b;
                tVar.A = false;
                tVar.invalidate();
                break;
            case 1:
                t tVar2 = this.f33818b;
                s sVar = tVar2.U;
                float f10 = tVar2.S ? 0.0f : 1.0f;
                tVar2.T = f10;
                sVar.setAlpha(f10);
                sVar.setVisibility(tVar2.S ? 8 : 0);
                tVar2.f33871a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f33818b;
                tVar3.F0 = null;
                o oVar = tVar3.f33871a;
                oVar.setRotationY(0.0f);
                if (!tVar3.G0) {
                    oVar.d.clearImage();
                }
                break;
        }
    }
}
