package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ig0;
public final class g extends AnimatorListenerAdapter {
    public final int f22631a;
    public boolean f22632b;
    public final boolean f22633c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f22631a = i10;
        this.d = obj;
        this.f22632b = z10;
        this.f22633c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22631a) {
            case 1:
                this.f22632b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f22327j1 = false;
                actionBarLayout.f22344s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f22334n1 = null;
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
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.K;
                boolean z10 = this.f22632b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ig0Var.K[!z10 ? 1 : 0] = null;
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
        switch (this.f22631a) {
            case 0:
                k kVar = (k) this.d;
                b6[] b6VarArr = kVar.f22774n;
                b6 b6Var = b6VarArr[1];
                if (b6Var != null && b6Var.getParent() != null) {
                    ((ViewGroup) b6VarArr[1].getParent()).removeView(b6VarArr[1]);
                }
                b6VarArr[1] = null;
                kVar.f22799x0 = false;
                if (this.f22632b && this.f22633c) {
                    kVar.f22783r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f22632b) {
                    actionBarLayout.f22327j1 = false;
                    actionBarLayout.f22344s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f22633c);
                    actionBarLayout.f22334n1 = null;
                    return;
                }
                return;
            case 2:
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.f22632b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.j0(f7, false);
                if (this.f22633c) {
                    z8 z8Var = g9Var.f28471a;
                    z8Var.f28057w = -1.0f;
                    z8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f22632b;
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
                    if (this.f22633c) {
                        tiVar.j2();
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
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.K;
                boolean z12 = this.f22632b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f22633c && z12 && ig0Var.M.getAlpha() != 1.0f) {
                    ig0Var.M.setAlpha(1.0f);
                    ig0Var.M.setScaleX(1.0f);
                    ig0Var.M.setScaleY(1.0f);
                    ig0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f22631a = 1;
        this.d = actionBarLayout;
        this.f22633c = z10;
    }
}
