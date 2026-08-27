package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class f40 extends AnimatorListenerAdapter {

    public final org.telegram.ui.Components.voip.t f37933a;

    public final s50 f37934b;

    public f40(s50 s50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37934b = s50Var;
        this.f37933a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.voip.t tVar = this.f37933a;
        if (tVar.getParent() != null) {
            ((org.telegram.ui.ActionBar.e3) this.f37934b).containerView.removeView(tVar);
        }
    }
}
