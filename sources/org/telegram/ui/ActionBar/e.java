package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f19645a;
    public final k f19646b;

    public e(k kVar, int i10) {
        this.f19645a = i10;
        this.f19646b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19645a) {
            case 0:
                k kVar = this.f19646b;
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
        switch (this.f19645a) {
            case 0:
                k kVar = this.f19646b;
                AnimatorSet animatorSet = kVar.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.M = null;
                    kVar.C.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f19646b;
                k5 k5Var = kVar2.f20334n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f20334n[1].getParent()).removeView(kVar2.f20334n[1]);
                }
                kVar2.K0.t(kVar2.f20334n[1]);
                kVar2.f20334n[1] = null;
                kVar2.V0 = false;
                Object[] objArr = kVar2.f20315d0;
                kVar2.J((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f20315d0[2]);
                return;
        }
    }
}
