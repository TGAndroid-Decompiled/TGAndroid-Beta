package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
public final class e extends AnimatorListenerAdapter {
    public final int f28884a;
    public final k f28885b;

    public e(k kVar, int i7) {
        this.f28884a = i7;
        this.f28885b = kVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28884a) {
            case 0:
                k kVar = this.f28885b;
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
        switch (this.f28884a) {
            case 0:
                k kVar = this.f28885b;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    kVar.G.setVisibility(4);
                    return;
                }
                return;
            default:
                k kVar2 = this.f28885b;
                n5 n5Var = kVar2.f29086n[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) kVar2.f29086n[1].getParent()).removeView(kVar2.f29086n[1]);
                }
                kVar2.P0.y(kVar2.f29086n[1]);
                kVar2.f29086n[1] = null;
                kVar2.f29081j1 = false;
                Object[] objArr = kVar2.f29076h0;
                kVar2.P((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.f29076h0[2]);
                return;
        }
    }
}
