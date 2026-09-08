package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f29821a;
    public final boolean f29822b;
    public final hq0 f29823c;

    public qp0(hq0 hq0Var, boolean z10, int i10) {
        this.f29821a = i10;
        this.f29823c = hq0Var;
        this.f29822b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29821a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f29823c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var = this.f29823c;
                if (animator.equals(hq0Var.f26846y)) {
                    hq0Var.f26846y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29821a) {
            case 0:
                hq0 hq0Var = this.f29823c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29822b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f29823c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.f26846y)) {
                    if (!this.f29822b) {
                        hq0Var2.f26817c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.f26818c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f26822f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.f26846y = null;
                    return;
                }
                return;
        }
    }
}
