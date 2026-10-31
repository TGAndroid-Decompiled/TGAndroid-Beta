package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.uh;
import org.telegram.ui.hf0;
public final class g extends AnimatorListenerAdapter {
    public final int f20330a;
    public boolean f20331b;
    public final boolean f20332c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20330a = i10;
        this.d = obj;
        this.f20331b = z10;
        this.f20332c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20330a) {
            case 1:
                this.f20331b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20092j1 = false;
                actionBarLayout.f20109s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20099n1 = null;
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
                hf0 hf0Var = (hf0) this.d;
                AnimatorSet[] animatorSetArr = hf0Var.K;
                boolean z10 = this.f20331b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    hf0Var.K[!z10 ? 1 : 0] = null;
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
        switch (this.f20330a) {
            case 0:
                l lVar = (l) this.d;
                u5[] u5VarArr = lVar.f20496n;
                u5 u5Var = u5VarArr[1];
                if (u5Var != null && u5Var.getParent() != null) {
                    ((ViewGroup) u5VarArr[1].getParent()).removeView(u5VarArr[1]);
                }
                u5VarArr[1] = null;
                lVar.f20521x0 = false;
                if (this.f20331b && this.f20332c) {
                    lVar.f20505r.setVisibility(8);
                }
                lVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20331b) {
                    actionBarLayout.f20092j1 = false;
                    actionBarLayout.f20109s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20332c);
                    actionBarLayout.f20099n1 = null;
                    return;
                }
                return;
            case 2:
                o8 o8Var = (o8) this.d;
                o8Var.G = null;
                boolean z10 = this.f20331b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o8Var.m0(false, f7);
                if (this.f20332c) {
                    h8 h8Var = o8Var.f28987a;
                    h8Var.f28712x = -1.0f;
                    h8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20331b;
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.G2)) {
                    if (!z11) {
                        if (!biVar.E1) {
                            biVar.f24741x2.setVisibility(4);
                        }
                        biVar.B2.setVisibility(4);
                    } else if (biVar.M2 && ((uhVar = biVar.f24721s2) == null || uhVar.L())) {
                        biVar.f24718r3.setVisibility(4);
                    }
                    if (this.f20332c) {
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
                hf0 hf0Var = (hf0) this.d;
                AnimatorSet[] animatorSetArr = hf0Var.K;
                boolean z12 = this.f20331b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20332c && z12 && hf0Var.M.getAlpha() != 1.0f) {
                    hf0Var.M.setAlpha(1.0f);
                    hf0Var.M.setScaleX(1.0f);
                    hf0Var.M.setScaleY(1.0f);
                    hf0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20330a = 1;
        this.d = actionBarLayout;
        this.f20332c = z10;
    }
}
