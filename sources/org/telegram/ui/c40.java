package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class c40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f35807a;
    public final q50 f35808b;

    public c40(q50 q50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f35808b = q50Var;
        this.f35807a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f35807a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35808b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
