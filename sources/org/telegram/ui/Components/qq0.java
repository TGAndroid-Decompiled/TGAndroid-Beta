package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qq0 extends AnimatorListenerAdapter {
    public final int f29976a;
    public final boolean f29977b;
    public final hr0 f29978c;

    public qq0(hr0 hr0Var, boolean z10, int i10) {
        this.f29976a = i10;
        this.f29978c = hr0Var;
        this.f29977b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29976a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f29978c.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hr0 hr0Var = this.f29978c;
                if (animator.equals(hr0Var.E)) {
                    hr0Var.E = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29976a) {
            case 0:
                hr0 hr0Var = this.f29978c;
                AnimatorSet[] animatorSetArr = hr0Var.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29977b) {
                        hr0Var.T[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hr0 hr0Var2 = this.f29978c;
                FrameLayout frameLayout = hr0Var2.h;
                if (animator.equals(hr0Var2.E)) {
                    if (!this.f29977b) {
                        hr0Var2.f27123c.setVisibility(4);
                        FrameLayout frameLayout2 = hr0Var2.f27126d0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hr0Var2.f27128f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hr0Var2.E = null;
                    return;
                }
                return;
        }
    }
}
