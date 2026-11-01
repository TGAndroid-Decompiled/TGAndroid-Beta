package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.uh;
import org.telegram.ui.gf0;
public final class g extends AnimatorListenerAdapter {
    public final int f20331a;
    public boolean f20332b;
    public final boolean f20333c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20331a = i10;
        this.d = obj;
        this.f20332b = z10;
        this.f20333c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20331a) {
            case 1:
                this.f20332b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20093j1 = false;
                actionBarLayout.f20110s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20100n1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.G2)) {
                    biVar.G2 = null;
                    return;
                }
                return;
            case 4:
                gf0 gf0Var = (gf0) this.d;
                AnimatorSet[] animatorSetArr = gf0Var.K;
                boolean z10 = this.f20332b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    gf0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        uh uhVar;
        int i10;
        switch (this.f20331a) {
            case 0:
                l lVar = (l) this.d;
                u5[] u5VarArr = lVar.f20497n;
                u5 u5Var = u5VarArr[1];
                if (u5Var != null && u5Var.getParent() != null) {
                    ((ViewGroup) u5VarArr[1].getParent()).removeView(u5VarArr[1]);
                }
                u5VarArr[1] = null;
                lVar.f20522x0 = false;
                if (this.f20332b && this.f20333c) {
                    lVar.f20506r.setVisibility(8);
                }
                lVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20332b) {
                    actionBarLayout.f20093j1 = false;
                    actionBarLayout.f20110s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20333c);
                    actionBarLayout.f20100n1 = null;
                    return;
                }
                return;
            case 2:
                o8 o8Var = (o8) this.d;
                o8Var.G = null;
                boolean z10 = this.f20332b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o8Var.n0(false, f7);
                if (this.f20333c) {
                    h8 h8Var = o8Var.f29044a;
                    h8Var.f28709x = -1.0f;
                    h8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20332b;
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.G2)) {
                    if (!z11) {
                        if (!biVar.E1) {
                            biVar.f24832x2.setVisibility(4);
                        }
                        biVar.B2.setVisibility(4);
                    } else if (biVar.M2 && ((uhVar = biVar.f24812s2) == null || uhVar.K())) {
                        biVar.f24809r3.setVisibility(4);
                    }
                    if (this.f20333c) {
                        biVar.P1();
                        fg.i iVar = biVar.I2;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        iVar.setVisibility(i10);
                    }
                    biVar.G2 = null;
                    return;
                }
                return;
            default:
                gf0 gf0Var = (gf0) this.d;
                AnimatorSet[] animatorSetArr = gf0Var.K;
                boolean z12 = this.f20332b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20333c && z12 && gf0Var.M.getAlpha() != 1.0f) {
                    gf0Var.M.setAlpha(1.0f);
                    gf0Var.M.setScaleX(1.0f);
                    gf0Var.M.setScaleY(1.0f);
                    gf0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20331a = 1;
        this.d = actionBarLayout;
        this.f20333c = z10;
    }
}
