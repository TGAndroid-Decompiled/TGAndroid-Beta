package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x8;
import org.telegram.ui.de0;
public final class g extends AnimatorListenerAdapter {
    public final int f29024a;
    public boolean f29025b;
    public final boolean f29026c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i7) {
        this.f29024a = i7;
        this.d = obj;
        this.f29025b = z10;
        this.f29026c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29024a) {
            case 1:
                this.f29025b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f28794k1 = false;
                actionBarLayout.f28808s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f28800o1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.K2)) {
                    tiVar.K2 = null;
                    return;
                }
                return;
            case 4:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z10 = this.f29025b;
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
        li liVar;
        int i7;
        switch (this.f29024a) {
            case 0:
                k kVar = (k) this.d;
                n5[] n5VarArr = kVar.f29164n;
                n5 n5Var = n5VarArr[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) n5VarArr[1].getParent()).removeView(n5VarArr[1]);
                }
                n5VarArr[1] = null;
                kVar.f29191y0 = false;
                if (this.f29025b && this.f29026c) {
                    kVar.f29172r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f29025b) {
                    actionBarLayout.f28794k1 = false;
                    actionBarLayout.f28808s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f29026c);
                    actionBarLayout.f28800o1 = null;
                    return;
                }
                return;
            case 2:
                x8 x8Var = (x8) this.d;
                x8Var.H = null;
                boolean z10 = this.f29025b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x8Var.n0(false, f10);
                if (this.f29026c) {
                    q8 q8Var = x8Var.f41918a;
                    q8Var.f41544x = -1.0f;
                    q8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f29025b;
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.K2)) {
                    if (!z11) {
                        if (!tiVar.I1) {
                            tiVar.B2.setVisibility(4);
                        }
                        tiVar.F2.setVisibility(4);
                    } else if (tiVar.Q2 && ((liVar = tiVar.f40029w2) == null || liVar.N())) {
                        tiVar.f40026v3.setVisibility(4);
                    }
                    if (this.f29026c) {
                        tiVar.R1();
                        ai.h0 h0Var = tiVar.M2;
                        if (z11) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        h0Var.setVisibility(i7);
                    }
                    tiVar.K2 = null;
                    return;
                }
                return;
            default:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z12 = this.f29025b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f29026c && z12 && de0Var.N.getAlpha() != 1.0f) {
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
        this.f29024a = 1;
        this.d = actionBarLayout;
        this.f29026c = z10;
    }
}
