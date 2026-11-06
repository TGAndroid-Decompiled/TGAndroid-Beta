package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.vh;
import org.telegram.ui.ce0;
public final class g extends AnimatorListenerAdapter {
    public final int f27469a;
    public boolean f27470b;
    public final boolean f27471c;
    public final Object d;

    public g(Object obj, boolean z9, boolean z10, int i7) {
        this.f27469a = i7;
        this.d = obj;
        this.f27470b = z9;
        this.f27471c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27469a) {
            case 1:
                this.f27470b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f27250j1 = false;
                actionBarLayout.f27266s.setAlpha(1.0f);
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
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.K;
                boolean z9 = this.f27470b;
                if (animatorSetArr[!z9 ? 1 : 0] != null && animatorSetArr[!z9 ? 1 : 0].equals(animator)) {
                    ce0Var.K[!z9 ? 1 : 0] = null;
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
        switch (this.f27469a) {
            case 0:
                k kVar = (k) this.d;
                k5[] k5VarArr = kVar.f27675n;
                k5 k5Var = k5VarArr[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
                kVar.f27699x0 = false;
                if (this.f27470b && this.f27471c) {
                    kVar.f27683r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f27470b) {
                    actionBarLayout.f27250j1 = false;
                    actionBarLayout.f27266s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f27471c);
                    actionBarLayout.n1 = null;
                    return;
                }
                return;
            case 2:
                t8 t8Var = (t8) this.d;
                t8Var.G = null;
                boolean z9 = this.f27470b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t8Var.n0(false, f10);
                if (this.f27471c) {
                    m8 m8Var = t8Var.f38284a;
                    m8Var.f37975x = -1.0f;
                    m8Var.setExpanded(z9);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f27470b;
                di diVar = (di) this.d;
                if (animator.equals(diVar.G2)) {
                    if (!z10) {
                        if (!diVar.E1) {
                            diVar.f32962x2.setVisibility(4);
                        }
                        diVar.B2.setVisibility(4);
                    } else if (diVar.M2 && ((vhVar = diVar.f32942s2) == null || vhVar.M())) {
                        diVar.f32939r3.setVisibility(4);
                    }
                    if (this.f27471c) {
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
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.K;
                boolean z11 = this.f27470b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f27471c && z11 && ce0Var.M.getAlpha() != 1.0f) {
                    ce0Var.M.setAlpha(1.0f);
                    ce0Var.M.setScaleX(1.0f);
                    ce0Var.M.setScaleY(1.0f);
                    ce0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z9) {
        this.f27469a = 1;
        this.d = actionBarLayout;
        this.f27471c = z9;
    }
}
