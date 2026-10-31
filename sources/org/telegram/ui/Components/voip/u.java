package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final int f31678a;
    public final r f31679b;
    public final w f31680c;

    public u(w wVar, r rVar, int i10) {
        this.f31678a = i10;
        this.f31680c = wVar;
        this.f31679b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f31678a) {
            case 0:
                w wVar = this.f31680c;
                wVar.N0 = null;
                this.f31679b.E = false;
                r rVar = wVar.E;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        wVar.removeView(wVar.E);
                        wVar.E.e();
                    }
                    wVar.E = null;
                    return;
                }
                return;
            case 1:
                w wVar2 = this.f31680c;
                wVar2.f31742y.e();
                wVar2.f31731r = null;
                this.f31679b.f31621r = false;
                if (!wVar2.f31712b) {
                    wVar2.d();
                    wVar2.D = null;
                    wVar2.d = 0L;
                }
                if (wVar2.f31712b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                wVar2.f31714c = f7;
                wVar2.l();
                wVar2.i(false);
                if (!wVar2.f31712b) {
                    wVar2.f31724k0.setVisibility(8);
                    wVar2.f31725l0.setVisibility(8);
                    wVar2.f31717e0.setVisibility(8);
                    wVar2.f31719f0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                r rVar2 = this.f31679b;
                if (rVar2.getParent() != null) {
                    this.f31680c.removeView(rVar2);
                    rVar2.e();
                    return;
                }
                return;
            default:
                r rVar3 = this.f31679b;
                if (rVar3.getParent() != null) {
                    this.f31680c.removeView(rVar3);
                    rVar3.e();
                    return;
                }
                return;
        }
    }
}
