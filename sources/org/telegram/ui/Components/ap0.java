package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ap0 extends AnimatorListenerAdapter {
    public final int f26882a;
    public final boolean f26883b;
    public final rp0 f26884c;

    public ap0(rp0 rp0Var, boolean z10, int i9) {
        this.f26882a = i9;
        this.f26884c = rp0Var;
        this.f26883b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f26882a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f26884c.P;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                rp0 rp0Var = this.f26884c;
                if (animator.equals(rp0Var.f32273y)) {
                    rp0Var.f32273y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26882a) {
            case 0:
                rp0 rp0Var = this.f26884c;
                AnimatorSet[] animatorSetArr = rp0Var.P;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26883b) {
                        rp0Var.O[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                rp0 rp0Var2 = this.f26884c;
                FrameLayout frameLayout = rp0Var2.h;
                if (animator.equals(rp0Var2.f32273y)) {
                    if (!this.f26883b) {
                        rp0Var2.f32244c.setVisibility(4);
                        FrameLayout frameLayout2 = rp0Var2.Y;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        rp0Var2.f32249f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    rp0Var2.f32273y = null;
                    return;
                }
                return;
        }
    }
}
