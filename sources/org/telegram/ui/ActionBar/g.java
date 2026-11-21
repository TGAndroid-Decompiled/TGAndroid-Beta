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
    public final int f28962a;
    public boolean f28963b;
    public final boolean f28964c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i7) {
        this.f28962a = i7;
        this.d = obj;
        this.f28963b = z10;
        this.f28964c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28962a) {
            case 1:
                this.f28963b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f28733k1 = false;
                actionBarLayout.f28747s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f28739o1 = null;
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
                boolean z10 = this.f28963b;
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
        switch (this.f28962a) {
            case 0:
                k kVar = (k) this.d;
                m5[] m5VarArr = kVar.f29145n;
                m5 m5Var = m5VarArr[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
                }
                m5VarArr[1] = null;
                kVar.f29172y0 = false;
                if (this.f28963b && this.f28964c) {
                    kVar.f29153r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f28963b) {
                    actionBarLayout.f28733k1 = false;
                    actionBarLayout.f28747s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f28964c);
                    actionBarLayout.f28739o1 = null;
                    return;
                }
                return;
            case 2:
                y8 y8Var = (y8) this.d;
                y8Var.H = null;
                boolean z10 = this.f28963b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y8Var.n0(false, f10);
                if (this.f28964c) {
                    r8 r8Var = y8Var.f42350a;
                    r8Var.f42016x = -1.0f;
                    r8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f28963b;
                ui uiVar = (ui) this.d;
                if (animator.equals(uiVar.K2)) {
                    if (!z11) {
                        if (!uiVar.I1) {
                            uiVar.B2.setVisibility(4);
                        }
                        uiVar.F2.setVisibility(4);
                    } else if (uiVar.Q2 && ((miVar = uiVar.f40448w2) == null || miVar.N())) {
                        uiVar.f40445v3.setVisibility(4);
                    }
                    if (this.f28964c) {
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
                boolean z12 = this.f28963b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f28964c && z12 && de0Var.N.getAlpha() != 1.0f) {
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
        this.f28962a = 1;
        this.d = actionBarLayout;
        this.f28964c = z10;
    }
}
