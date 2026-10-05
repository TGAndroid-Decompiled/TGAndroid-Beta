package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f20550a;
    public final k f20551b;

    public e(k kVar, int i10) {
        this.f20550a = i10;
        this.f20551b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20550a) {
            case 0:
                k kVar = this.f20551b;
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
        switch (this.f20550a) {
            case 0:
                k kVar = this.f20551b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f20551b;
                i5 i5Var = kVar2.f21285n[1];
                if (i5Var != null && i5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f21285n[1].getParent()).removeView(kVar2.f21285n[1]);
                }
                kVar2.O0.s(kVar2.f21285n[1]);
                kVar2.f21285n[1] = null;
                kVar2.f21258a1 = false;
                Object[] objArr = kVar2.f21273g0;
                kVar2.H((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f21273g0[2]);
                return;
        }
    }
}
