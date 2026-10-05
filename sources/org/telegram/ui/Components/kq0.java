package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kq0 extends AnimatorListenerAdapter {
    public final int f28274a;
    public final boolean f28275b;
    public final br0 f28276c;

    public kq0(br0 br0Var, boolean z10, int i10) {
        this.f28274a = i10;
        this.f28276c = br0Var;
        this.f28275b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28274a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f28276c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                br0 br0Var = this.f28276c;
                if (animator.equals(br0Var.f25083y)) {
                    br0Var.f25083y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28274a) {
            case 0:
                br0 br0Var = this.f28276c;
                AnimatorSet[] animatorSetArr = br0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f28275b) {
                        br0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                br0 br0Var2 = this.f28276c;
                FrameLayout frameLayout = br0Var2.h;
                if (animator.equals(br0Var2.f25083y)) {
                    if (!this.f28275b) {
                        br0Var2.f25054c.setVisibility(4);
                        FrameLayout frameLayout2 = br0Var2.f25055c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        br0Var2.f25059f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    br0Var2.f25083y = null;
                    return;
                }
                return;
        }
    }
}
