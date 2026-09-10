package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class xd0 extends AnimatorListenerAdapter {
    public final int f29012a;
    public final bi.oa f29013b;

    public xd0(bi.oa oaVar, int i10) {
        this.f29012a = i10;
        this.f29013b = oaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29012a) {
            case 0:
                bi.oa oaVar = this.f29013b;
                AnimatorSet animatorSet = (AnimatorSet) oaVar.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oaVar.e = null;
                    return;
                }
                return;
            case 1:
                bi.oa oaVar2 = this.f29013b;
                AnimatorSet animatorSet2 = (AnimatorSet) oaVar2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oaVar2.e = null;
                    return;
                }
                return;
            default:
                bi.oa oaVar3 = this.f29013b;
                AnimatorSet animatorSet3 = (AnimatorSet) oaVar3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    oaVar3.e = null;
                    return;
                }
                return;
        }
    }
}
