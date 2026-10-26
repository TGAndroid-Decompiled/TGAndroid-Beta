package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class vq0 extends AnimatorListenerAdapter {
    public final int f34246a;
    public final boolean f34247b;
    public final mr0 f34248c;

    public vq0(mr0 mr0Var, boolean z10, int i10) {
        this.f34246a = i10;
        this.f34248c = mr0Var;
        this.f34247b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f34246a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f34248c.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mr0 mr0Var = this.f34248c;
                if (animator.equals(mr0Var.E)) {
                    mr0Var.E = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34246a) {
            case 0:
                mr0 mr0Var = this.f34248c;
                AnimatorSet[] animatorSetArr = mr0Var.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f34247b) {
                        mr0Var.T[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mr0 mr0Var2 = this.f34248c;
                FrameLayout frameLayout = mr0Var2.h;
                if (animator.equals(mr0Var2.E)) {
                    if (!this.f34247b) {
                        mr0Var2.f30702c.setVisibility(4);
                        FrameLayout frameLayout2 = mr0Var2.f30704d0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        mr0Var2.f30706f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    mr0Var2.E = null;
                    return;
                }
                return;
        }
    }
}
