package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final int f39648a;
    public final r f39649b;
    public final x f39650c;

    public v(x xVar, r rVar, int i3) {
        this.f39648a = i3;
        this.f39650c = xVar;
        this.f39649b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f39648a) {
            case 0:
                x xVar = this.f39650c;
                xVar.O0 = null;
                this.f39649b.F = false;
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
                x xVar2 = this.f39650c;
                xVar2.f39701y.e();
                xVar2.f39690r = null;
                this.f39649b.f39568r = false;
                if (!xVar2.f39670b) {
                    xVar2.d();
                    xVar2.E = null;
                    xVar2.d = 0L;
                }
                if (xVar2.f39670b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                xVar2.f39672c = f10;
                xVar2.l();
                xVar2.i(false);
                if (!xVar2.f39670b) {
                    xVar2.f39684l0.setVisibility(8);
                    xVar2.m0.setVisibility(8);
                    xVar2.f39678f0.setVisibility(8);
                    xVar2.f39679g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                r rVar2 = this.f39649b;
                if (rVar2.getParent() != null) {
                    this.f39650c.removeView(rVar2);
                    rVar2.e();
                    return;
                }
                return;
            default:
                r rVar3 = this.f39649b;
                if (rVar3.getParent() != null) {
                    this.f39650c.removeView(rVar3);
                    rVar3.e();
                    return;
                }
                return;
        }
    }
}
