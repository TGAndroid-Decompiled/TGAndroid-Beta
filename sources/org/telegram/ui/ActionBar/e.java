package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f27467a;
    public final k f27468b;

    public e(k kVar, int i3) {
        this.f27467a = i3;
        this.f27468b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27467a) {
            case 0:
                k kVar = this.f27468b;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
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
        switch (this.f27467a) {
            case 0:
                k kVar = this.f27468b;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    kVar.G.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f27468b;
                k5 k5Var = kVar2.f27725n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f27725n[1].getParent()).removeView(kVar2.f27725n[1]);
                }
                kVar2.P0.z(kVar2.f27725n[1]);
                kVar2.f27725n[1] = null;
                kVar2.f27721j1 = false;
                Object[] objArr = kVar2.f27716h0;
                kVar2.L((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f27716h0[2]);
                return;
        }
    }
}
