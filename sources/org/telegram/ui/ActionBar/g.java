package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xi;
import org.telegram.ui.qg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18924a;
    public boolean f18925b;
    public final boolean f18926c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18924a = i10;
        this.d = obj;
        this.f18925b = z10;
        this.f18926c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18924a) {
            case 1:
                this.f18925b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18629d1 = false;
                actionBarLayout.f18656s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18638h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                xi xiVar = (xi) this.d;
                if (animator.equals(xiVar.M0)) {
                    xiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ((na0) this.d).f26646f2 = null;
                return;
            case 5:
                qg0 qg0Var = (qg0) this.d;
                AnimatorSet[] animatorSetArr = qg0Var.K;
                boolean z10 = this.f18925b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    qg0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pi piVar;
        int i10;
        u0 u0Var;
        switch (this.f18924a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f19571n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19571n[1].getParent()).removeView(kVar.f19571n[1]);
                }
                kVar.f19571n[1] = null;
                kVar.f19592x0 = false;
                if (this.f18925b && this.f18926c) {
                    kVar.f19580r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18925b) {
                    actionBarLayout.f18629d1 = false;
                    actionBarLayout.f18656s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18926c);
                    actionBarLayout.f18638h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f18925b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f18926c) {
                    x8 x8Var = e9Var.f23914a;
                    x8Var.f23588w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18925b;
                xi xiVar = (xi) this.d;
                if (animator.equals(xiVar.M0)) {
                    if (!z11) {
                        if (!xiVar.N) {
                            xiVar.D0.setVisibility(4);
                        }
                        xiVar.H0.setVisibility(4);
                    } else if (xiVar.S0 && ((piVar = xiVar.f30331y0) == null || piVar.J())) {
                        xiVar.f30328x1.setVisibility(4);
                    }
                    if (this.f18926c) {
                        xiVar.b2();
                        m6 m6Var = xiVar.O0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        m6Var.setVisibility(i10);
                    }
                    xiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                na0 na0Var = (na0) this.d;
                qa0 qa0Var = na0Var.f26649i2;
                if (na0Var.f26646f2 != null) {
                    na0Var.f26646f2 = null;
                    if (!this.f18925b) {
                        qa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = qa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = qa0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f18926c && (u0Var = qa0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    qa0Var.f27634s.setVisibility(4);
                    u0 u0Var3 = qa0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                qg0 qg0Var = (qg0) this.d;
                AnimatorSet[] animatorSetArr = qg0Var.K;
                boolean z12 = this.f18925b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18926c && z12 && qg0Var.M.getAlpha() != 1.0f) {
                    qg0Var.M.setAlpha(1.0f);
                    qg0Var.M.setScaleX(1.0f);
                    qg0Var.M.setScaleY(1.0f);
                    qg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f18924a = 1;
        this.d = actionBarLayout;
        this.f18926c = z10;
    }
}
