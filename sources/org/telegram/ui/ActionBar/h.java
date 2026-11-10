package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.s8;
import org.telegram.ui.Components.uh;
import org.telegram.ui.fe0;
public final class h extends AnimatorListenerAdapter {
    public final int f27509a;
    public boolean f27510b;
    public final boolean f27511c;
    public final Object d;

    public h(Object obj, boolean z9, boolean z10, int i7) {
        this.f27509a = i7;
        this.d = obj;
        this.f27510b = z9;
        this.f27511c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27509a) {
            case 1:
                this.f27510b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f27258j1 = false;
                actionBarLayout.f27274s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.n1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ci ciVar = (ci) this.d;
                if (animator.equals(ciVar.J2)) {
                    ciVar.J2 = null;
                    return;
                }
                return;
            case 4:
                fe0 fe0Var = (fe0) this.d;
                AnimatorSet[] animatorSetArr = fe0Var.K;
                boolean z9 = this.f27510b;
                if (animatorSetArr[!z9 ? 1 : 0] != null && animatorSetArr[!z9 ? 1 : 0].equals(animator)) {
                    fe0Var.K[!z9 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        uh uhVar;
        int i7;
        switch (this.f27509a) {
            case 0:
                l lVar = (l) this.d;
                m5[] m5VarArr = lVar.f27690n;
                m5 m5Var = m5VarArr[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
                }
                m5VarArr[1] = null;
                lVar.f27714x0 = false;
                if (this.f27510b && this.f27511c) {
                    lVar.f27698r.setVisibility(8);
                }
                lVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f27510b) {
                    actionBarLayout.f27258j1 = false;
                    actionBarLayout.f27274s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f27511c);
                    actionBarLayout.n1 = null;
                    return;
                }
                return;
            case 2:
                s8 s8Var = (s8) this.d;
                s8Var.G = null;
                boolean z9 = this.f27510b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                s8Var.n0(false, f10);
                if (this.f27511c) {
                    l8 l8Var = s8Var.f37887a;
                    l8Var.f37565x = -1.0f;
                    l8Var.setExpanded(z9);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f27510b;
                ci ciVar = (ci) this.d;
                if (animator.equals(ciVar.J2)) {
                    if (!z10) {
                        if (!ciVar.H1) {
                            ciVar.A2.setVisibility(4);
                        }
                        ciVar.E2.setVisibility(4);
                    } else if (ciVar.P2 && ((uhVar = ciVar.f32660v2) == null || uhVar.M())) {
                        ciVar.f32657u3.setVisibility(4);
                    }
                    if (this.f27511c) {
                        ciVar.Q1();
                        bi.x5 x5Var = ciVar.L2;
                        if (z10) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        x5Var.setVisibility(i7);
                    }
                    ciVar.J2 = null;
                    return;
                }
                return;
            default:
                fe0 fe0Var = (fe0) this.d;
                AnimatorSet[] animatorSetArr = fe0Var.K;
                boolean z11 = this.f27510b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f27511c && z11 && fe0Var.M.getAlpha() != 1.0f) {
                    fe0Var.M.setAlpha(1.0f);
                    fe0Var.M.setScaleX(1.0f);
                    fe0Var.M.setScaleY(1.0f);
                    fe0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public h(ActionBarLayout actionBarLayout, boolean z9) {
        this.f27509a = 1;
        this.d = actionBarLayout;
        this.f27511c = z9;
    }
}
