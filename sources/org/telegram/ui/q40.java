package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class q40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f36782a;
    public final d60 f36783b;

    public q40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f36783b = d60Var;
        this.f36782a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f36782a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36783b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
