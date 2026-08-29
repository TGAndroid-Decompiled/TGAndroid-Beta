package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class f40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37985a;
    public final r50 f37986b;

    public f40(r50 r50Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37986b = r50Var;
        this.f37985a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37985a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f37986b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
