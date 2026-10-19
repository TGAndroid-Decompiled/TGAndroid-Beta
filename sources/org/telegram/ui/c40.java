package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class c40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f35808a;
    public final q50 f35809b;

    public c40(q50 q50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f35809b = q50Var;
        this.f35808a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f35808a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35809b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
