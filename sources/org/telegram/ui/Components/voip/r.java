package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f29845a;
    public final t f29846b;

    public r(t tVar, int i10) {
        this.f29845a = i10;
        this.f29846b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        switch (this.f29845a) {
            case 0:
                t tVar = this.f29846b;
                tVar.B = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f29846b;
                s sVar = tVar2.V;
                if (tVar2.T) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                tVar2.U = f10;
                sVar.setAlpha(f10);
                if (tVar2.T) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                sVar.setVisibility(i10);
                tVar2.f29891a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f29846b;
                tVar3.G0 = null;
                o oVar = tVar3.f29891a;
                oVar.setRotationY(0.0f);
                if (!tVar3.H0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
