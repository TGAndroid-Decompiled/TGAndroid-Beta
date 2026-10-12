package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class sq0 extends AnimatorListenerAdapter {
    public final int f29179a;
    public final boolean f29180b;
    public final jr0 f29181c;

    public sq0(jr0 jr0Var, boolean z10, int i10) {
        this.f29179a = i10;
        this.f29181c = jr0Var;
        this.f29180b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29179a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f29181c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                jr0 jr0Var = this.f29181c;
                if (animator.equals(jr0Var.f26488y)) {
                    jr0Var.f26488y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29179a) {
            case 0:
                jr0 jr0Var = this.f29181c;
                AnimatorSet[] animatorSetArr = jr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29180b) {
                        jr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                jr0 jr0Var2 = this.f29181c;
                FrameLayout frameLayout = jr0Var2.h;
                if (animator.equals(jr0Var2.f26488y)) {
                    if (!this.f29180b) {
                        jr0Var2.f26460c.setVisibility(4);
                        FrameLayout frameLayout2 = jr0Var2.f26461c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        jr0Var2.f26464f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    jr0Var2.f26488y = null;
                    return;
                }
                return;
        }
    }
}
