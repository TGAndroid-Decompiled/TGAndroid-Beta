package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class f40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f37203a;
    public final u50 f37204b;

    public f40(u50 u50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37204b = u50Var;
        this.f37203a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f37203a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f37204b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
