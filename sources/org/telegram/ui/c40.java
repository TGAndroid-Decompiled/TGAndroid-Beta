package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class c40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f35812a;
    public final q50 f35813b;

    public c40(q50 q50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f35813b = q50Var;
        this.f35812a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f35812a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35813b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
