package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final int f31764a;
    public final x f31765b;

    public w(x xVar, int i10) {
        this.f31764a = i10;
        this.f31765b = xVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31764a) {
            case 0:
                x xVar = this.f31765b;
                xVar.N0 = null;
                xVar.D.E = false;
                r rVar = xVar.E;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        xVar.removeView(xVar.E);
                        xVar.E.e();
                    }
                    xVar.E = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                x xVar2 = this.f31765b;
                xVar2.J0 = null;
                xVar2.I0 = 0.0f;
                xVar2.invalidate();
                return;
            default:
                x xVar3 = this.f31765b;
                xVar3.B0 = null;
                xVar3.f31823y0 = 1.0f;
                xVar3.f31812r0 = 0.0f;
                xVar3.f31814s0 = 0.0f;
                xVar3.invalidate();
                return;
        }
    }
}
