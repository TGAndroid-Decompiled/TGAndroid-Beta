package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s extends AnimatorListenerAdapter {
    public final int f32311a;
    public final u f32312b;

    public s(u uVar, int i10) {
        this.f32311a = i10;
        this.f32312b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        switch (this.f32311a) {
            case 0:
                u uVar = this.f32312b;
                uVar.B = false;
                uVar.invalidate();
                return;
            case 1:
                u uVar2 = this.f32312b;
                t tVar = uVar2.V;
                if (uVar2.T) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                uVar2.U = f10;
                tVar.setAlpha(f10);
                if (uVar2.T) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                tVar.setVisibility(i10);
                uVar2.f32360a.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.f32312b;
                uVar3.G0 = null;
                p pVar = uVar3.f32360a;
                pVar.setRotationY(0.0f);
                if (!uVar3.H0) {
                    pVar.d.clearImage();
                    return;
                }
                return;
        }
    }
}
