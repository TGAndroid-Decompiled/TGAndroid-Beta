package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class e40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f36388a;
    public final s50 f36389b;

    public e40(s50 s50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f36389b = s50Var;
        this.f36388a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f36388a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36389b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
