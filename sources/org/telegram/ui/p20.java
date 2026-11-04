package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p20 extends AnimatorListenerAdapter {
    public final int f48422a;
    public final org.telegram.ui.Components.voip.r f48423b;
    public final x30 f48424c;

    public p20(x30 x30Var, org.telegram.ui.Components.voip.r rVar, int i3) {
        this.f48422a = i3;
        this.f48424c = x30Var;
        this.f48423b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48422a) {
            case 0:
                org.telegram.ui.Components.voip.r rVar = this.f48423b;
                if (rVar.getParent() != null) {
                    this.f48424c.f28586b.removeView(rVar);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.voip.r rVar2 = this.f48423b;
                if (rVar2.getParent() != null) {
                    this.f48424c.f28586b.removeView(rVar2);
                    return;
                }
                return;
        }
    }
}
