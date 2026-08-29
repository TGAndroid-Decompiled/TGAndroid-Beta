package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class f extends AnimatorListenerAdapter {
    public final int f22925a;
    public final l f22926b;

    public f(l lVar, int i10) {
        this.f22925a = i10;
        this.f22926b = lVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22925a) {
            case 0:
                l lVar = this.f22926b;
                AnimatorSet animatorSet = lVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.L = null;
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
        switch (this.f22925a) {
            case 0:
                l lVar = this.f22926b;
                AnimatorSet animatorSet = lVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.L = null;
                    lVar.B.setVisibility(4);
                    return;
                }
                return;
            default:
                l lVar2 = this.f22926b;
                h5 h5Var = lVar2.f23618n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) lVar2.f23618n[1].getParent()).removeView(lVar2.f23618n[1]);
                }
                lVar2.J0.q(lVar2.f23618n[1]);
                lVar2.f23618n[1] = null;
                lVar2.U0 = false;
                Object[] objArr = lVar2.f23596c0;
                lVar2.J((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.f23596c0[2]);
                return;
        }
    }
}
