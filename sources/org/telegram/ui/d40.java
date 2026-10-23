package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class d40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f36256a;
    public final q50 f36257b;

    public d40(q50 q50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f36257b = q50Var;
        this.f36256a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f36256a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36257b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
