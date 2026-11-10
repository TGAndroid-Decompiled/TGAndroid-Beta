package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xn0 extends AnimatorListenerAdapter {
    public final int f40366a;
    public final boolean f40367b;
    public final mo0 f40368c;

    public xn0(mo0 mo0Var, boolean z9, int i7) {
        this.f40366a = i7;
        this.f40368c = mo0Var;
        this.f40367b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40366a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f40368c.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mo0 mo0Var = this.f40368c;
                if (animator.equals(mo0Var.f36061y1)) {
                    mo0Var.f36061y1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40366a) {
            case 0:
                mo0 mo0Var = this.f40368c;
                AnimatorSet[] animatorSetArr = mo0Var.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40367b) {
                        mo0Var.N1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mo0 mo0Var2 = this.f40368c;
                FrameLayout frameLayout = mo0Var2.f36045q1;
                if (animator.equals(mo0Var2.f36061y1)) {
                    if (!this.f40367b) {
                        mo0Var2.f36038m1.setVisibility(4);
                        FrameLayout frameLayout2 = mo0Var2.X1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        mo0Var2.f36043p1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    mo0Var2.f36061y1 = null;
                    return;
                }
                return;
        }
    }
}
