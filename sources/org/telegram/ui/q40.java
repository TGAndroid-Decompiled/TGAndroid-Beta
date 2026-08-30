package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class q40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f37585a;
    public final c60 f37586b;

    public q40(c60 c60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37586b = c60Var;
        this.f37585a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f37585a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f37586b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
