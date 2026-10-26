package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class i40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f40137a;
    public final v50 f40138b;

    public i40(v50 v50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f40138b = v50Var;
        this.f40137a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f40137a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.f40138b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
