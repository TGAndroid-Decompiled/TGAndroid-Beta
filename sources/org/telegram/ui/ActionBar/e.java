package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f27446a;
    public final k f27447b;

    public e(k kVar, int i7) {
        this.f27446a = i7;
        this.f27447b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27446a) {
            case 0:
                k kVar = this.f27447b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
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
        switch (this.f27446a) {
            case 0:
                k kVar = this.f27447b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f27447b;
                k5 k5Var = kVar2.f27679n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f27679n[1].getParent()).removeView(kVar2.f27679n[1]);
                }
                kVar2.O0.x(kVar2.f27679n[1]);
                kVar2.f27679n[1] = null;
                kVar2.f27672i1 = false;
                Object[] objArr = kVar2.f27667g0;
                kVar2.L((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f27667g0[2]);
                return;
        }
    }
}
