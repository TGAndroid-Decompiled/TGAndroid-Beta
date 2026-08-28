package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class c40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f37059a;
    public final o50 f37060b;

    public c40(o50 o50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37060b = o50Var;
        this.f37059a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f37059a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f37060b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
