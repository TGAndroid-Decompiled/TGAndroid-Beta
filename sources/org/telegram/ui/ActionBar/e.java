package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f18846a;
    public final k f18847b;

    public e(k kVar, int i10) {
        this.f18846a = i10;
        this.f18847b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18846a) {
            case 0:
                k kVar = this.f18847b;
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
        switch (this.f18846a) {
            case 0:
                k kVar = this.f18847b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f18847b;
                h5 h5Var = kVar2.f19571n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f19571n[1].getParent()).removeView(kVar2.f19571n[1]);
                }
                kVar2.N0.s(kVar2.f19571n[1]);
                kVar2.f19571n[1] = null;
                kVar2.Y0 = false;
                Object[] objArr = kVar2.f19559g0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f19559g0[2]);
                return;
        }
    }
}
