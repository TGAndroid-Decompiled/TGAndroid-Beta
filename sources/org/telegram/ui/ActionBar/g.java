package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.y8;
import org.telegram.ui.de0;
public final class g extends AnimatorListenerAdapter {
    public final int f28965a;
    public boolean f28966b;
    public final boolean f28967c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i7) {
        this.f28965a = i7;
        this.d = obj;
        this.f28966b = z10;
        this.f28967c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28965a) {
            case 1:
                this.f28966b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f28736k1 = false;
                actionBarLayout.f28750s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f28742o1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ui uiVar = (ui) this.d;
                if (animator.equals(uiVar.K2)) {
                    uiVar.K2 = null;
                    return;
                }
                return;
            case 4:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z10 = this.f28966b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    de0Var.L[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        mi miVar;
        int i7;
        switch (this.f28965a) {
            case 0:
                k kVar = (k) this.d;
                m5[] m5VarArr = kVar.f29148n;
                m5 m5Var = m5VarArr[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
                }
                m5VarArr[1] = null;
                kVar.f29175y0 = false;
                if (this.f28966b && this.f28967c) {
                    kVar.f29156r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f28966b) {
                    actionBarLayout.f28736k1 = false;
                    actionBarLayout.f28750s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f28967c);
                    actionBarLayout.f28742o1 = null;
                    return;
                }
                return;
            case 2:
                y8 y8Var = (y8) this.d;
                y8Var.H = null;
                boolean z10 = this.f28966b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y8Var.n0(false, f10);
                if (this.f28967c) {
                    r8 r8Var = y8Var.f42343a;
                    r8Var.f42009x = -1.0f;
                    r8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f28966b;
                ui uiVar = (ui) this.d;
                if (animator.equals(uiVar.K2)) {
                    if (!z11) {
                        if (!uiVar.I1) {
                            uiVar.B2.setVisibility(4);
                        }
                        uiVar.F2.setVisibility(4);
                    } else if (uiVar.Q2 && ((miVar = uiVar.f40441w2) == null || miVar.N())) {
                        uiVar.f40438v3.setVisibility(4);
                    }
                    if (this.f28967c) {
                        uiVar.R1();
                        ai.l0 l0Var = uiVar.M2;
                        if (z11) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        l0Var.setVisibility(i7);
                    }
                    uiVar.K2 = null;
                    return;
                }
                return;
            default:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z12 = this.f28966b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f28967c && z12 && de0Var.N.getAlpha() != 1.0f) {
                    de0Var.N.setAlpha(1.0f);
                    de0Var.N.setScaleX(1.0f);
                    de0Var.N.setScaleY(1.0f);
                    de0Var.N.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f28965a = 1;
        this.d = actionBarLayout;
        this.f28967c = z10;
    }
}
