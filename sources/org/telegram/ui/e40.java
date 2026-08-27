package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e40 extends AnimatorListenerAdapter {

    public final org.telegram.ui.Components.voip.t f37620a;

    public final s50 f37621b;

    public e40(s50 s50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37621b = s50Var;
        this.f37620a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.voip.t tVar = this.f37620a;
        if (tVar.getParent() != null) {
            ((org.telegram.ui.ActionBar.e3) this.f37621b).containerView.removeView(tVar);
        }
    }
}
