package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class i40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f40134a;
    public final v50 f40135b;

    public i40(v50 v50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f40135b = v50Var;
        this.f40134a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f40134a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.f40135b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
