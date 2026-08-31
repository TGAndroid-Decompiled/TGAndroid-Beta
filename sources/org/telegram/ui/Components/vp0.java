package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class vp0 extends AnimatorListenerAdapter {
    public final int f32501a;
    public final boolean f32502b;
    public final mq0 f32503c;

    public vp0(mq0 mq0Var, boolean z4, int i10) {
        this.f32501a = i10;
        this.f32503c = mq0Var;
        this.f32502b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32501a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f32503c.Q;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mq0 mq0Var = this.f32503c;
                if (animator.equals(mq0Var.f29228y)) {
                    mq0Var.f29228y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32501a) {
            case 0:
                mq0 mq0Var = this.f32503c;
                AnimatorSet[] animatorSetArr = mq0Var.Q;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32502b) {
                        mq0Var.P[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mq0 mq0Var2 = this.f32503c;
                FrameLayout frameLayout = mq0Var2.h;
                if (animator.equals(mq0Var2.f29228y)) {
                    if (!this.f32502b) {
                        mq0Var2.f29199c.setVisibility(4);
                        FrameLayout frameLayout2 = mq0Var2.Z;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        mq0Var2.f29204f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    mq0Var2.f29228y = null;
                    return;
                }
                return;
        }
    }
}
