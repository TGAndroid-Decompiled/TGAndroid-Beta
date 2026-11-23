package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f28944a;
    public final k f28945b;

    public e(k kVar, int i7) {
        this.f28944a = i7;
        this.f28945b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28944a) {
            case 0:
                k kVar = this.f28945b;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28944a) {
            case 0:
                k kVar = this.f28945b;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    kVar.G.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f28945b;
                n5 n5Var = kVar2.f29164n[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f29164n[1].getParent()).removeView(kVar2.f29164n[1]);
                }
                kVar2.P0.z(kVar2.f29164n[1]);
                kVar2.f29164n[1] = null;
                kVar2.f29159j1 = false;
                Object[] objArr = kVar2.f29154h0;
                kVar2.O((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f29154h0[2]);
                return;
        }
    }
}
