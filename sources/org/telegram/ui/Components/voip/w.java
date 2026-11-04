package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final int f39658a;
    public final x f39659b;

    public w(x xVar, int i3) {
        this.f39658a = i3;
        this.f39659b = xVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39658a) {
            case 0:
                x xVar = this.f39659b;
                xVar.O0 = null;
                xVar.E.F = false;
                r rVar = xVar.F;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        xVar.removeView(xVar.F);
                        xVar.F.e();
                    }
                    xVar.F = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                x xVar2 = this.f39659b;
                xVar2.K0 = null;
                xVar2.J0 = 0.0f;
                xVar2.invalidate();
                return;
            default:
                x xVar3 = this.f39659b;
                xVar3.C0 = null;
                xVar3.f39703z0 = 1.0f;
                xVar3.f39693s0 = 0.0f;
                xVar3.f39694t0 = 0.0f;
                xVar3.invalidate();
                return;
        }
    }
}
