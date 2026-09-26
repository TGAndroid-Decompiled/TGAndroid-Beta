package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class eq0 extends AnimatorListenerAdapter {
    public final int f24038a;
    public final boolean f24039b;
    public final vq0 f24040c;

    public eq0(vq0 vq0Var, boolean z10, int i10) {
        this.f24038a = i10;
        this.f24040c = vq0Var;
        this.f24039b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24038a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24040c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                vq0 vq0Var = this.f24040c;
                if (animator.equals(vq0Var.f29746y)) {
                    vq0Var.f29746y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24038a) {
            case 0:
                vq0 vq0Var = this.f24040c;
                AnimatorSet[] animatorSetArr = vq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24039b) {
                        vq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                vq0 vq0Var2 = this.f24040c;
                FrameLayout frameLayout = vq0Var2.h;
                if (animator.equals(vq0Var2.f29746y)) {
                    if (!this.f24039b) {
                        vq0Var2.f29718c.setVisibility(4);
                        FrameLayout frameLayout2 = vq0Var2.f29719c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        vq0Var2.f29722f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    vq0Var2.f29746y = null;
                    return;
                }
                return;
        }
    }
}
