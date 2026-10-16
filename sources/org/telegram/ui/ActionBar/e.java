package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f19416a;
    public final k f19417b;

    public e(k kVar, int i10) {
        this.f19416a = i10;
        this.f19417b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19416a) {
            case 0:
                k kVar = this.f19417b;
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
        switch (this.f19416a) {
            case 0:
                k kVar = this.f19417b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f19417b;
                h5 h5Var = kVar2.f20141n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f20141n[1].getParent()).removeView(kVar2.f20141n[1]);
                }
                kVar2.N0.v(kVar2.f20141n[1]);
                kVar2.f20141n[1] = null;
                kVar2.Y0 = false;
                Object[] objArr = kVar2.f20129g0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f20129g0[2]);
                return;
        }
    }
}
