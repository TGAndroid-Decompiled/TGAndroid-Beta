package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class eq0 extends AnimatorListenerAdapter {
    public final int f23950a;
    public final boolean f23951b;
    public final vq0 f23952c;

    public eq0(vq0 vq0Var, boolean z10, int i10) {
        this.f23950a = i10;
        this.f23952c = vq0Var;
        this.f23951b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23950a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f23952c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                vq0 vq0Var = this.f23952c;
                if (animator.equals(vq0Var.f29743y)) {
                    vq0Var.f29743y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23950a) {
            case 0:
                vq0 vq0Var = this.f23952c;
                AnimatorSet[] animatorSetArr = vq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23951b) {
                        vq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                vq0 vq0Var2 = this.f23952c;
                FrameLayout frameLayout = vq0Var2.h;
                if (animator.equals(vq0Var2.f29743y)) {
                    if (!this.f23951b) {
                        vq0Var2.f29715c.setVisibility(4);
                        FrameLayout frameLayout2 = vq0Var2.f29716c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        vq0Var2.f29719f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    vq0Var2.f29743y = null;
                    return;
                }
                return;
        }
    }
}
