package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class f extends AnimatorListenerAdapter {
    public final int f27466a;
    public final l f27467b;

    public f(l lVar, int i7) {
        this.f27466a = i7;
        this.f27467b = lVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27466a) {
            case 0:
                l lVar = this.f27467b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
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
        switch (this.f27466a) {
            case 0:
                l lVar = this.f27467b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    lVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                l lVar2 = this.f27467b;
                m5 m5Var = lVar2.f27690n[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) lVar2.f27690n[1].getParent()).removeView(lVar2.f27690n[1]);
                }
                lVar2.O0.x(lVar2.f27690n[1]);
                lVar2.f27690n[1] = null;
                lVar2.f27683i1 = false;
                Object[] objArr = lVar2.f27678g0;
                lVar2.N((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.f27678g0[2]);
                return;
        }
    }
}
