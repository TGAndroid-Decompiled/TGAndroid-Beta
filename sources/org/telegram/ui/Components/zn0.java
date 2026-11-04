package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class zn0 extends AnimatorListenerAdapter {
    public final int f41078a;
    public final boolean f41079b;
    public final oo0 f41080c;

    public zn0(oo0 oo0Var, boolean z10, int i3) {
        this.f41078a = i3;
        this.f41080c = oo0Var;
        this.f41079b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f41078a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f41080c.M1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                oo0 oo0Var = this.f41080c;
                if (animator.equals(oo0Var.f36907w1)) {
                    oo0Var.f36907w1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41078a) {
            case 0:
                oo0 oo0Var = this.f41080c;
                AnimatorSet[] animatorSetArr = oo0Var.M1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41079b) {
                        oo0Var.L1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                oo0 oo0Var2 = this.f41080c;
                FrameLayout frameLayout = oo0Var2.f36891o1;
                if (animator.equals(oo0Var2.f36907w1)) {
                    if (!this.f41079b) {
                        oo0Var2.k1.setVisibility(4);
                        FrameLayout frameLayout2 = oo0Var2.V1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        oo0Var2.f36889n1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    oo0Var2.f36907w1 = null;
                    return;
                }
                return;
        }
    }
}
