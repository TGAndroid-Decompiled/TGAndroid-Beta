package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class q40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f36882a;
    public final d60 f36883b;

    public q40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f36883b = d60Var;
        this.f36882a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f36882a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36883b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
