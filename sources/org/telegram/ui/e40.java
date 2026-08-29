package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class e40 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.voip.u f37697a;
    public final r50 f37698b;

    public e40(r50 r50Var, org.telegram.ui.Components.voip.u uVar) {
        this.f37698b = r50Var;
        this.f37697a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.f37697a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f37698b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
