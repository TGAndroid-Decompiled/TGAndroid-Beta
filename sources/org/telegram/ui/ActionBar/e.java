package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f21302a;
    public final k f21303b;

    public e(k kVar, int i10) {
        this.f21302a = i10;
        this.f21303b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f21302a) {
            case 0:
                k kVar = this.f21303b;
                AnimatorSet animatorSet = kVar.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.M = null;
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
        switch (this.f21302a) {
            case 0:
                k kVar = this.f21303b;
                AnimatorSet animatorSet = kVar.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.M = null;
                    kVar.C.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f21303b;
                l5 l5Var = kVar2.f21552n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f21552n[1].getParent()).removeView(kVar2.f21552n[1]);
                }
                kVar2.K0.t(kVar2.f21552n[1]);
                kVar2.f21552n[1] = null;
                kVar2.V0 = false;
                Object[] objArr = kVar2.f21532d0;
                kVar2.J((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f21532d0[2]);
                return;
        }
    }
}
