package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final int f31758a;
    public final r f31759b;
    public final x f31760c;

    public v(x xVar, r rVar, int i10) {
        this.f31758a = i10;
        this.f31760c = xVar;
        this.f31759b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f31758a) {
            case 0:
                x xVar = this.f31760c;
                xVar.N0 = null;
                this.f31759b.E = false;
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
                x xVar2 = this.f31760c;
                xVar2.f31822y.e();
                xVar2.f31811r = null;
                this.f31759b.f31684r = false;
                if (!xVar2.f31792b) {
                    xVar2.d();
                    xVar2.D = null;
                    xVar2.d = 0L;
                }
                if (xVar2.f31792b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                xVar2.f31794c = f7;
                xVar2.l();
                xVar2.i(false);
                if (!xVar2.f31792b) {
                    xVar2.f31804k0.setVisibility(8);
                    xVar2.f31805l0.setVisibility(8);
                    xVar2.f31797e0.setVisibility(8);
                    xVar2.f31799f0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                r rVar2 = this.f31759b;
                if (rVar2.getParent() != null) {
                    this.f31760c.removeView(rVar2);
                    rVar2.e();
                    return;
                }
                return;
            default:
                r rVar3 = this.f31759b;
                if (rVar3.getParent() != null) {
                    this.f31760c.removeView(rVar3);
                    rVar3.e();
                    return;
                }
                return;
        }
    }
}
