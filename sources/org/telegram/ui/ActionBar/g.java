package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y8;
import org.telegram.ui.de0;
public final class g extends AnimatorListenerAdapter {
    public final int f28958a;
    public boolean f28959b;
    public final boolean f28960c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i7) {
        this.f28958a = i7;
        this.d = obj;
        this.f28959b = z10;
        this.f28960c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28958a) {
            case 1:
                this.f28959b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f28705k1 = false;
                actionBarLayout.f28719s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f28711o1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                si siVar = (si) this.d;
                if (animator.equals(siVar.K2)) {
                    siVar.K2 = null;
                    return;
                }
                return;
            case 4:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z10 = this.f28959b;
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
        ki kiVar;
        int i7;
        switch (this.f28958a) {
            case 0:
                k kVar = (k) this.d;
                n5[] n5VarArr = kVar.f29086n;
                n5 n5Var = n5VarArr[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) n5VarArr[1].getParent()).removeView(n5VarArr[1]);
                }
                n5VarArr[1] = null;
                kVar.f29113y0 = false;
                if (this.f28959b && this.f28960c) {
                    kVar.f29094r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f28959b) {
                    actionBarLayout.f28705k1 = false;
                    actionBarLayout.f28719s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f28960c);
                    actionBarLayout.f28711o1 = null;
                    return;
                }
                return;
            case 2:
                y8 y8Var = (y8) this.d;
                y8Var.H = null;
                boolean z10 = this.f28959b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y8Var.n0(false, f10);
                if (this.f28960c) {
                    r8 r8Var = y8Var.f42394a;
                    r8Var.f41946x = -1.0f;
                    r8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f28959b;
                si siVar = (si) this.d;
                if (animator.equals(siVar.K2)) {
                    if (!z11) {
                        if (!siVar.I1) {
                            siVar.B2.setVisibility(4);
                        }
                        siVar.F2.setVisibility(4);
                    } else if (siVar.Q2 && ((kiVar = siVar.f39732w2) == null || kiVar.N())) {
                        siVar.f39729v3.setVisibility(4);
                    }
                    if (this.f28960c) {
                        siVar.R1();
                        ai.k0 k0Var = siVar.M2;
                        if (z11) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        k0Var.setVisibility(i7);
                    }
                    siVar.K2 = null;
                    return;
                }
                return;
            default:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z12 = this.f28959b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f28960c && z12 && de0Var.N.getAlpha() != 1.0f) {
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
        this.f28958a = 1;
        this.d = actionBarLayout;
        this.f28960c = z10;
    }
}
