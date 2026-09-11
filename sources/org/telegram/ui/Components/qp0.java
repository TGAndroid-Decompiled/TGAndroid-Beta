package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f29794a;
    public final boolean f29795b;
    public final hq0 f29796c;

    public qp0(hq0 hq0Var, boolean z10, int i10) {
        this.f29794a = i10;
        this.f29796c = hq0Var;
        this.f29795b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29794a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f29796c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var = this.f29796c;
                if (animator.equals(hq0Var.f26819y)) {
                    hq0Var.f26819y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29794a) {
            case 0:
                hq0 hq0Var = this.f29796c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29795b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f29796c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.f26819y)) {
                    if (!this.f29795b) {
                        hq0Var2.f26790c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.f26791c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f26795f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.f26819y = null;
                    return;
                }
                return;
        }
    }
}
