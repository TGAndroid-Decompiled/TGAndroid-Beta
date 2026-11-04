package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.th;
import org.telegram.ui.xd0;
public final class g extends AnimatorListenerAdapter {
    public final int f27509a;
    public boolean f27510b;
    public final boolean f27511c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i3) {
        this.f27509a = i3;
        this.d = obj;
        this.f27510b = z10;
        this.f27511c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27509a) {
            case 1:
                this.f27510b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.k1 = false;
                actionBarLayout.f27316s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f27308o1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.H2)) {
                    biVar.H2 = null;
                    return;
                }
                return;
            case 4:
                xd0 xd0Var = (xd0) this.d;
                AnimatorSet[] animatorSetArr = xd0Var.L;
                boolean z10 = this.f27510b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    xd0Var.L[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        th thVar;
        int i3;
        switch (this.f27509a) {
            case 0:
                k kVar = (k) this.d;
                k5[] k5VarArr = kVar.f27725n;
                k5 k5Var = k5VarArr[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
                kVar.f27753y0 = false;
                if (this.f27510b && this.f27511c) {
                    kVar.f27734r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f27510b) {
                    actionBarLayout.k1 = false;
                    actionBarLayout.f27316s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f27511c);
                    actionBarLayout.f27308o1 = null;
                    return;
                }
                return;
            case 2:
                r8 r8Var = (r8) this.d;
                r8Var.H = null;
                boolean z10 = this.f27510b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r8Var.n0(false, f10);
                if (this.f27511c) {
                    k8 k8Var = r8Var.f37667a;
                    k8Var.f37378x = -1.0f;
                    k8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f27510b;
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.H2)) {
                    if (!z11) {
                        if (!biVar.F1) {
                            biVar.f32295y2.setVisibility(4);
                        }
                        biVar.C2.setVisibility(4);
                    } else if (biVar.N2 && ((thVar = biVar.f32275t2) == null || thVar.M())) {
                        biVar.f32272s3.setVisibility(4);
                    }
                    if (this.f27511c) {
                        biVar.Q1();
                        ai.c0 c0Var = biVar.J2;
                        if (z11) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        c0Var.setVisibility(i3);
                    }
                    biVar.H2 = null;
                    return;
                }
                return;
            default:
                xd0 xd0Var = (xd0) this.d;
                AnimatorSet[] animatorSetArr = xd0Var.L;
                boolean z12 = this.f27510b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f27511c && z12 && xd0Var.N.getAlpha() != 1.0f) {
                    xd0Var.N.setAlpha(1.0f);
                    xd0Var.N.setScaleX(1.0f);
                    xd0Var.N.setScaleY(1.0f);
                    xd0Var.N.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f27509a = 1;
        this.d = actionBarLayout;
        this.f27511c = z10;
    }
}
