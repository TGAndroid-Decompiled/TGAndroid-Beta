package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class q40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f36767a;
    public final d60 f36768b;

    public q40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.f36768b = d60Var;
        this.f36767a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f36767a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36768b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
