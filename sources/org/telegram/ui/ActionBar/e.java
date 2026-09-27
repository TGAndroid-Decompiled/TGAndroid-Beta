package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f18808a;
    public final l f18809b;

    public e(l lVar, int i10) {
        this.f18808a = i10;
        this.f18809b = lVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18808a) {
            case 0:
                l lVar = this.f18809b;
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
        switch (this.f18808a) {
            case 0:
                l lVar = this.f18809b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    lVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                l lVar2 = this.f18809b;
                j5 j5Var = lVar2.f19569n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) lVar2.f19569n[1].getParent()).removeView(lVar2.f19569n[1]);
                }
                lVar2.P0.s(lVar2.f19569n[1]);
                lVar2.f19569n[1] = null;
                lVar2.f19546b1 = false;
                Object[] objArr = lVar2.f19557g0;
                lVar2.L((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.f19557g0[2]);
                return;
        }
    }
}
