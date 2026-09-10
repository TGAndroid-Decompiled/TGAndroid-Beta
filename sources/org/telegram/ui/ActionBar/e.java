package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f17658a;
    public final l f17659b;

    public e(l lVar, int i10) {
        this.f17658a = i10;
        this.f17659b = lVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17658a) {
            case 0:
                l lVar = this.f17659b;
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
        switch (this.f17658a) {
            case 0:
                l lVar = this.f17659b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    lVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                l lVar2 = this.f17659b;
                l5 l5Var = lVar2.f18388n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) lVar2.f18388n[1].getParent()).removeView(lVar2.f18388n[1]);
                }
                lVar2.N0.s(lVar2.f18388n[1]);
                lVar2.f18388n[1] = null;
                lVar2.Y0 = false;
                Object[] objArr = lVar2.f18376g0;
                lVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.f18376g0[2]);
                return;
        }
    }
}
