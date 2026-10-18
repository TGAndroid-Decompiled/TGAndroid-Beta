package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class e40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f36355a;
    public final s50 f36356b;

    public e40(s50 s50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f36356b = s50Var;
        this.f36355a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f36355a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36356b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
