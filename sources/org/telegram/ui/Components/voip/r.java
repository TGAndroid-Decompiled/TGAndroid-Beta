package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f34037a;
    public final t f34038b;

    public r(t tVar, int i10) {
        this.f34037a = i10;
        this.f34038b = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f34037a) {
            case 0:
                t tVar = this.f34038b;
                tVar.E = false;
                tVar.invalidate();
                return;
            case 1:
                t tVar2 = this.f34038b;
                s sVar = tVar2.f34077b0;
                if (tVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                tVar2.f34075a0 = f7;
                sVar.setAlpha(f7);
                if (tVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                sVar.setVisibility(i10);
                tVar2.f34074a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.f34038b;
                tVar3.J0 = null;
                o oVar = tVar3.f34074a;
                oVar.setRotationY(0.0f);
                if (!tVar3.K0) {
                    oVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
