package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class a50 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f34040a;
    public final n60 f34041b;

    public a50(n60 n60Var, org.telegram.ui.Components.voip.t tVar) {
        this.f34041b = n60Var;
        this.f34040a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f34040a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f34041b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
