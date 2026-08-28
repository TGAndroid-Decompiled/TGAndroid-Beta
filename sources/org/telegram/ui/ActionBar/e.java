package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f22889a;
    public final k f22890b;

    public e(k kVar, int i9) {
        this.f22889a = i9;
        this.f22890b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22889a) {
            case 0:
                k kVar = this.f22890b;
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
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
        switch (this.f22889a) {
            case 0:
                k kVar = this.f22890b;
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
                    kVar.B.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f22890b;
                h5 h5Var = kVar2.f23583n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f23583n[1].getParent()).removeView(kVar2.f23583n[1]);
                }
                kVar2.J0.q(kVar2.f23583n[1]);
                kVar2.f23583n[1] = null;
                kVar2.U0 = false;
                Object[] objArr = kVar2.f23561c0;
                kVar2.J((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f23561c0[2]);
                return;
        }
    }
}
