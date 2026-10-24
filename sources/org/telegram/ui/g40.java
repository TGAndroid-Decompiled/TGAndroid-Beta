package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class g40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.t f37435a;
    public final u50 f37436b;

    public g40(u50 u50Var, org.telegram.ui.Components.voip.t tVar) {
        this.f37436b = u50Var;
        this.f37435a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.f37435a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f37436b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
