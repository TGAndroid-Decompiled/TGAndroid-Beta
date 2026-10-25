package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f22547a;
    public final k f22548b;

    public e(k kVar, int i10) {
        this.f22547a = i10;
        this.f22548b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22547a) {
            case 0:
                k kVar = this.f22548b;
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
        switch (this.f22547a) {
            case 0:
                k kVar = this.f22548b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f22548b;
                b6 b6Var = kVar2.f22771n[1];
                if (b6Var != null && b6Var.getParent() != null) {
                    ((ViewGroup) kVar2.f22771n[1].getParent()).removeView(kVar2.f22771n[1]);
                }
                kVar2.O0.v(kVar2.f22771n[1]);
                kVar2.f22771n[1] = null;
                kVar2.f22745a1 = false;
                Object[] objArr = kVar2.f22759g0;
                kVar2.H((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f22759g0[2]);
                return;
        }
    }
}
