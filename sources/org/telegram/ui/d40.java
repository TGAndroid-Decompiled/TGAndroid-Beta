package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class d40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f36251a;
    public final q50 f36252b;

    public d40(q50 q50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f36252b = q50Var;
        this.f36251a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f36251a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36252b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
