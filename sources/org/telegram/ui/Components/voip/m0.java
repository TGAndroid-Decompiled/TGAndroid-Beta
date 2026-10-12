package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final u f31801a;
    public final n0 f31802b;

    public m0(n0 n0Var, u uVar) {
        this.f31802b = n0Var;
        this.f31801a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31801a;
        if (uVar.getParent() != null) {
            this.f31802b.removeView(uVar);
            uVar.e();
        }
    }
}
