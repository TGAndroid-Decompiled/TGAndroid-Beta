package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class h40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f39890a;
    public final v50 f39891b;

    public h40(v50 v50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f39891b = v50Var;
        this.f39890a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f39890a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.f39891b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
