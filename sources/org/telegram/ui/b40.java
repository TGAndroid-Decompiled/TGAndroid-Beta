package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class b40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f36632a;
    public final o50 f36633b;

    public b40(o50 o50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f36633b = o50Var;
        this.f36632a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f36632a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36633b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
