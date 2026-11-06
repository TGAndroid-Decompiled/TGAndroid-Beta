package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xn0 extends AnimatorListenerAdapter {
    public final int f40307a;
    public final boolean f40308b;
    public final mo0 f40309c;

    public xn0(mo0 mo0Var, boolean z9, int i7) {
        this.f40307a = i7;
        this.f40309c = mo0Var;
        this.f40308b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40307a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f40309c.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mo0 mo0Var = this.f40309c;
                if (animator.equals(mo0Var.f36023v1)) {
                    mo0Var.f36023v1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40307a) {
            case 0:
                mo0 mo0Var = this.f40309c;
                AnimatorSet[] animatorSetArr = mo0Var.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40308b) {
                        mo0Var.K1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mo0 mo0Var2 = this.f40309c;
                FrameLayout frameLayout = mo0Var2.n1;
                if (animator.equals(mo0Var2.f36023v1)) {
                    if (!this.f40308b) {
                        mo0Var2.f36001j1.setVisibility(4);
                        FrameLayout frameLayout2 = mo0Var2.U1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        mo0Var2.f36006m1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    mo0Var2.f36023v1 = null;
                    return;
                }
                return;
        }
    }
}
