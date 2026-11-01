package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f20276a;
    public final l f20277b;

    public e(l lVar, int i10) {
        this.f20276a = i10;
        this.f20277b = lVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20276a) {
            case 0:
                l lVar = this.f20277b;
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
        switch (this.f20276a) {
            case 0:
                l lVar = this.f20277b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    lVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                l lVar2 = this.f20277b;
                u5 u5Var = lVar2.f20497n[1];
                if (u5Var != null && u5Var.getParent() != null) {
                    ((ViewGroup) lVar2.f20497n[1].getParent()).removeView(lVar2.f20497n[1]);
                }
                lVar2.O0.w(lVar2.f20497n[1]);
                lVar2.f20497n[1] = null;
                lVar2.f20490i1 = false;
                Object[] objArr = lVar2.f20485g0;
                lVar2.L((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.f20485g0[2]);
                return;
        }
    }
}
