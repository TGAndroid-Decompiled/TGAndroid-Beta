package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z8;
import org.telegram.ui.gg0;
public final class g extends AnimatorListenerAdapter {
    public final int f22628a;
    public boolean f22629b;
    public final boolean f22630c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f22628a = i10;
        this.d = obj;
        this.f22629b = z10;
        this.f22630c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22628a) {
            case 1:
                this.f22629b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f22324j1 = false;
                actionBarLayout.f22341s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f22331n1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.P0)) {
                    tiVar.P0 = null;
                    return;
                }
                return;
            case 4:
                gg0 gg0Var = (gg0) this.d;
                AnimatorSet[] animatorSetArr = gg0Var.K;
                boolean z10 = this.f22629b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    gg0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        li liVar;
        int i10;
        switch (this.f22628a) {
            case 0:
                k kVar = (k) this.d;
                b6[] b6VarArr = kVar.f22771n;
                b6 b6Var = b6VarArr[1];
                if (b6Var != null && b6Var.getParent() != null) {
                    ((ViewGroup) b6VarArr[1].getParent()).removeView(b6VarArr[1]);
                }
                b6VarArr[1] = null;
                kVar.f22796x0 = false;
                if (this.f22629b && this.f22630c) {
                    kVar.f22780r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f22629b) {
                    actionBarLayout.f22324j1 = false;
                    actionBarLayout.f22341s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f22630c);
                    actionBarLayout.f22331n1 = null;
                    return;
                }
                return;
            case 2:
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.f22629b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.j0(f7, false);
                if (this.f22630c) {
                    z8 z8Var = g9Var.f28487a;
                    z8Var.f28097w = -1.0f;
                    z8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f22629b;
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.P0)) {
                    if (!z11) {
                        if (!tiVar.N) {
                            tiVar.G0.setVisibility(4);
                        }
                        tiVar.K0.setVisibility(4);
                    } else if (tiVar.V0 && ((liVar = tiVar.B0) == null || liVar.L())) {
                        tiVar.A1.setVisibility(4);
                    }
                    if (this.f22630c) {
                        tiVar.i2();
                        bh.p pVar = tiVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        pVar.setVisibility(i10);
                    }
                    tiVar.P0 = null;
                    return;
                }
                return;
            default:
                gg0 gg0Var = (gg0) this.d;
                AnimatorSet[] animatorSetArr = gg0Var.K;
                boolean z12 = this.f22629b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f22630c && z12 && gg0Var.M.getAlpha() != 1.0f) {
                    gg0Var.M.setAlpha(1.0f);
                    gg0Var.M.setScaleX(1.0f);
                    gg0Var.M.setScaleY(1.0f);
                    gg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f22628a = 1;
        this.d = actionBarLayout;
        this.f22630c = z10;
    }
}
