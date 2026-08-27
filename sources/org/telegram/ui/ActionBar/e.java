package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

public final class e extends AnimatorListenerAdapter {

    public final int f22869a;

    public final k f22870b;

    public e(k kVar, int i10) {
        this.f22869a = i10;
        this.f22870b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22869a) {
            case 0:
                k kVar = this.f22870b;
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22869a) {
            case 0:
                k kVar = this.f22870b;
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
                    kVar.B.setVisibility(4);
                    break;
                }
                break;
            default:
                k kVar2 = this.f22870b;
                h5 h5Var = kVar2.f23584n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f23584n[1].getParent()).removeView(kVar2.f23584n[1]);
                }
                kVar2.J0.q(kVar2.f23584n[1]);
                kVar2.f23584n[1] = null;
                kVar2.U0 = false;
                Object[] objArr = kVar2.f23562c0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f23562c0[2]);
                break;
        }
    }
}
