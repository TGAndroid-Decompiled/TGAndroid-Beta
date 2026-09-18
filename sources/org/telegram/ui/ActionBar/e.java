package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f18599a;
    public final k f18600b;

    public e(k kVar, int i10) {
        this.f18599a = i10;
        this.f18600b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18599a) {
            case 0:
                k kVar = this.f18600b;
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
        switch (this.f18599a) {
            case 0:
                k kVar = this.f18600b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f18600b;
                k5 k5Var = kVar2.f19304n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f19304n[1].getParent()).removeView(kVar2.f19304n[1]);
                }
                kVar2.O0.s(kVar2.f19304n[1]);
                kVar2.f19304n[1] = null;
                kVar2.Z0 = false;
                Object[] objArr = kVar2.f19292g0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f19292g0[2]);
                return;
        }
    }
}
