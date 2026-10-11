package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t extends AnimatorListenerAdapter {
    public final int f32319a;
    public final v f32320b;

    public t(v vVar, int i10) {
        this.f32319a = i10;
        this.f32320b = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f32319a) {
            case 0:
                v vVar = this.f32320b;
                vVar.E = false;
                vVar.invalidate();
                return;
            case 1:
                v vVar2 = this.f32320b;
                u uVar = vVar2.f32377b0;
                if (vVar2.W) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                vVar2.f32375a0 = f7;
                uVar.setAlpha(f7);
                if (vVar2.W) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                uVar.setVisibility(i10);
                vVar2.f32374a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                v vVar3 = this.f32320b;
                vVar3.J0 = null;
                q qVar = vVar3.f32374a;
                qVar.setRotationY(0.0f);
                if (!vVar3.K0) {
                    qVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
