package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29369a;
    public final m0 f29370b;

    public l0(m0 m0Var, u uVar) {
        this.f29370b = m0Var;
        this.f29369a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29369a;
        if (uVar.getParent() != null) {
            this.f29370b.removeView(uVar);
            uVar.e();
        }
    }
}
