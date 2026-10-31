package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final int f31684a;
    public final w f31685b;

    public v(w wVar, int i10) {
        this.f31684a = i10;
        this.f31685b = wVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31684a) {
            case 0:
                w wVar = this.f31685b;
                wVar.N0 = null;
                wVar.D.E = false;
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
                super.onAnimationEnd(animator);
                w wVar2 = this.f31685b;
                wVar2.J0 = null;
                wVar2.I0 = 0.0f;
                wVar2.invalidate();
                return;
            default:
                w wVar3 = this.f31685b;
                wVar3.B0 = null;
                wVar3.f31743y0 = 1.0f;
                wVar3.f31732r0 = 0.0f;
                wVar3.f31734s0 = 0.0f;
                wVar3.invalidate();
                return;
        }
    }
}
