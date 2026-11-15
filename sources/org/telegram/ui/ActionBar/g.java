package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.q8;
import org.telegram.ui.ce0;
public final class g extends AnimatorListenerAdapter {
    public final int f28543a;
    public boolean f28544b;
    public final boolean f28545c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i7) {
        this.f28543a = i7;
        this.d = obj;
        this.f28544b = z10;
        this.f28545c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28543a) {
            case 1:
                this.f28544b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f28351k1 = false;
                actionBarLayout.f28365s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f28357o1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.K2)) {
                    kiVar.K2 = null;
                    return;
                }
                return;
            case 4:
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.L;
                boolean z10 = this.f28544b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ce0Var.L[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ci ciVar;
        int i7;
        switch (this.f28543a) {
            case 0:
                k kVar = (k) this.d;
                j5[] j5VarArr = kVar.f29302n;
                j5 j5Var = j5VarArr[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) j5VarArr[1].getParent()).removeView(j5VarArr[1]);
                }
                j5VarArr[1] = null;
                kVar.f29329y0 = false;
                if (this.f28544b && this.f28545c) {
                    kVar.f29310r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f28544b) {
                    actionBarLayout.f28351k1 = false;
                    actionBarLayout.f28365s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f28545c);
                    actionBarLayout.f28357o1 = null;
                    return;
                }
                return;
            case 2:
                q8 q8Var = (q8) this.d;
                q8Var.H = null;
                boolean z10 = this.f28544b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q8Var.n0(false, f10);
                if (this.f28545c) {
                    j8 j8Var = q8Var.f38562a;
                    j8Var.f38245x = -1.0f;
                    j8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f28544b;
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.K2)) {
                    if (!z11) {
                        if (!kiVar.I1) {
                            kiVar.B2.setVisibility(4);
                        }
                        kiVar.F2.setVisibility(4);
                    } else if (kiVar.Q2 && ((ciVar = kiVar.f36497w2) == null || ciVar.N())) {
                        kiVar.f36494v3.setVisibility(4);
                    }
                    if (this.f28545c) {
                        kiVar.Q1();
                        ai.k0 k0Var = kiVar.M2;
                        if (z11) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        k0Var.setVisibility(i7);
                    }
                    kiVar.K2 = null;
                    return;
                }
                return;
            default:
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.L;
                boolean z12 = this.f28544b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f28545c && z12 && ce0Var.N.getAlpha() != 1.0f) {
                    ce0Var.N.setAlpha(1.0f);
                    ce0Var.N.setScaleX(1.0f);
                    ce0Var.N.setScaleY(1.0f);
                    ce0Var.N.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f28543a = 1;
        this.d = actionBarLayout;
        this.f28545c = z10;
    }
}
