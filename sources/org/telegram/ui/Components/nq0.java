package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class nq0 extends AnimatorListenerAdapter {
    public final int f28868a;
    public final boolean f28869b;
    public final fr0 f28870c;

    public nq0(fr0 fr0Var, boolean z10, int i10) {
        this.f28868a = i10;
        this.f28870c = fr0Var;
        this.f28869b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28868a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f28870c.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                fr0 fr0Var = this.f28870c;
                if (animator.equals(fr0Var.E)) {
                    fr0Var.E = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28868a) {
            case 0:
                fr0 fr0Var = this.f28870c;
                AnimatorSet[] animatorSetArr = fr0Var.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f28869b) {
                        fr0Var.T[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                fr0 fr0Var2 = this.f28870c;
                FrameLayout frameLayout = fr0Var2.h;
                if (animator.equals(fr0Var2.E)) {
                    if (!this.f28869b) {
                        fr0Var2.f26371c.setVisibility(4);
                        FrameLayout frameLayout2 = fr0Var2.f26373d0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        fr0Var2.f26375f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    fr0Var2.E = null;
                    return;
                }
                return;
        }
    }
}
