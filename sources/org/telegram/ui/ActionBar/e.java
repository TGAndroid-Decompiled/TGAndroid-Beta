package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f20369a;
    public final k f20370b;

    public e(k kVar, int i10) {
        this.f20369a = i10;
        this.f20370b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20369a) {
            case 0:
                k kVar = this.f20370b;
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
        switch (this.f20369a) {
            case 0:
                k kVar = this.f20370b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f20370b;
                j5 j5Var = kVar2.f21102n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f21102n[1].getParent()).removeView(kVar2.f21102n[1]);
                }
                kVar2.N0.s(kVar2.f21102n[1]);
                kVar2.f21102n[1] = null;
                kVar2.Y0 = false;
                Object[] objArr = kVar2.f21090g0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f21090g0[2]);
                return;
        }
    }
}
