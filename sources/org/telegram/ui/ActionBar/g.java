package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.vh;
import org.telegram.ui.ee0;
public final class g extends AnimatorListenerAdapter {
    public final int f27475a;
    public boolean f27476b;
    public final boolean f27477c;
    public final Object d;

    public g(Object obj, boolean z9, boolean z10, int i7) {
        this.f27475a = i7;
        this.d = obj;
        this.f27476b = z9;
        this.f27477c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27475a) {
            case 1:
                this.f27476b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f27254j1 = false;
                actionBarLayout.f27270s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.n1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                di diVar = (di) this.d;
                if (animator.equals(diVar.G2)) {
                    diVar.G2 = null;
                    return;
                }
                return;
            case 4:
                ee0 ee0Var = (ee0) this.d;
                AnimatorSet[] animatorSetArr = ee0Var.K;
                boolean z9 = this.f27476b;
                if (animatorSetArr[!z9 ? 1 : 0] != null && animatorSetArr[!z9 ? 1 : 0].equals(animator)) {
                    ee0Var.K[!z9 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        vh vhVar;
        int i7;
        switch (this.f27475a) {
            case 0:
                k kVar = (k) this.d;
                l5[] l5VarArr = kVar.f27663n;
                l5 l5Var = l5VarArr[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) l5VarArr[1].getParent()).removeView(l5VarArr[1]);
                }
                l5VarArr[1] = null;
                kVar.f27687x0 = false;
                if (this.f27476b && this.f27477c) {
                    kVar.f27671r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f27476b) {
                    actionBarLayout.f27254j1 = false;
                    actionBarLayout.f27270s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f27477c);
                    actionBarLayout.n1 = null;
                    return;
                }
                return;
            case 2:
                t8 t8Var = (t8) this.d;
                t8Var.G = null;
                boolean z9 = this.f27476b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t8Var.n0(false, f10);
                if (this.f27477c) {
                    m8 m8Var = t8Var.f38314a;
                    m8Var.f37980x = -1.0f;
                    m8Var.setExpanded(z9);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f27476b;
                di diVar = (di) this.d;
                if (animator.equals(diVar.G2)) {
                    if (!z10) {
                        if (!diVar.E1) {
                            diVar.f33067x2.setVisibility(4);
                        }
                        diVar.B2.setVisibility(4);
                    } else if (diVar.M2 && ((vhVar = diVar.f33047s2) == null || vhVar.M())) {
                        diVar.f33044r3.setVisibility(4);
                    }
                    if (this.f27477c) {
                        diVar.Q1();
                        bi.x5 x5Var = diVar.I2;
                        if (z10) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        x5Var.setVisibility(i7);
                    }
                    diVar.G2 = null;
                    return;
                }
                return;
            default:
                ee0 ee0Var = (ee0) this.d;
                AnimatorSet[] animatorSetArr = ee0Var.K;
                boolean z11 = this.f27476b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f27477c && z11 && ee0Var.M.getAlpha() != 1.0f) {
                    ee0Var.M.setAlpha(1.0f);
                    ee0Var.M.setScaleX(1.0f);
                    ee0Var.M.setScaleY(1.0f);
                    ee0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z9) {
        this.f27475a = 1;
        this.d = actionBarLayout;
        this.f27477c = z9;
    }
}
