package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class br0 extends AnimatorListenerAdapter {
    public final int f24718a;
    public final boolean f24719b;
    public final sr0 f24720c;

    public br0(sr0 sr0Var, boolean z10, int i10) {
        this.f24718a = i10;
        this.f24720c = sr0Var;
        this.f24719b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24718a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24720c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                sr0 sr0Var = this.f24720c;
                if (animator.equals(sr0Var.f30664y)) {
                    sr0Var.f30664y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24718a) {
            case 0:
                sr0 sr0Var = this.f24720c;
                AnimatorSet[] animatorSetArr = sr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24719b) {
                        sr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                sr0 sr0Var2 = this.f24720c;
                FrameLayout frameLayout = sr0Var2.h;
                if (animator.equals(sr0Var2.f30664y)) {
                    if (!this.f24719b) {
                        sr0Var2.f30635c.setVisibility(4);
                        FrameLayout frameLayout2 = sr0Var2.f30636c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        sr0Var2.f30640f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    sr0Var2.f30664y = null;
                    return;
                }
                return;
        }
    }
}
