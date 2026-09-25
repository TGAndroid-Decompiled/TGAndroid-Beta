package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.qg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18908a;
    public boolean f18909b;
    public final boolean f18910c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18908a = i10;
        this.d = obj;
        this.f18909b = z10;
        this.f18910c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18908a) {
            case 1:
                this.f18909b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18613d1 = false;
                actionBarLayout.f18640s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18622h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                wi wiVar = (wi) this.d;
                if (animator.equals(wiVar.M0)) {
                    wiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ((ka0) this.d).f25738f2 = null;
                return;
            case 5:
                qg0 qg0Var = (qg0) this.d;
                AnimatorSet[] animatorSetArr = qg0Var.K;
                boolean z10 = this.f18909b;
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
        oi oiVar;
        int i10;
        u0 u0Var;
        switch (this.f18908a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f19555n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19555n[1].getParent()).removeView(kVar.f19555n[1]);
                }
                kVar.f19555n[1] = null;
                kVar.f19576x0 = false;
                if (this.f18909b && this.f18910c) {
                    kVar.f19564r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18909b) {
                    actionBarLayout.f18613d1 = false;
                    actionBarLayout.f18640s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18910c);
                    actionBarLayout.f18622h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f18909b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f18910c) {
                    x8 x8Var = e9Var.f23879a;
                    x8Var.f23542w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18909b;
                wi wiVar = (wi) this.d;
                if (animator.equals(wiVar.M0)) {
                    if (!z11) {
                        if (!wiVar.N) {
                            wiVar.D0.setVisibility(4);
                        }
                        wiVar.H0.setVisibility(4);
                    } else if (wiVar.S0 && ((oiVar = wiVar.f30067y0) == null || oiVar.J())) {
                        wiVar.f30064x1.setVisibility(4);
                    }
                    if (this.f18910c) {
                        wiVar.b2();
                        m6 m6Var = wiVar.O0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        m6Var.setVisibility(i10);
                    }
                    wiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ka0 ka0Var = (ka0) this.d;
                na0 na0Var = ka0Var.f25741i2;
                if (ka0Var.f25738f2 != null) {
                    ka0Var.f25738f2 = null;
                    if (!this.f18909b) {
                        na0Var.F.setVisibility(4);
                        FrameLayout frameLayout = na0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = na0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f18910c && (u0Var = na0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    na0Var.f26714s.setVisibility(4);
                    u0 u0Var3 = na0Var.G;
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
                boolean z12 = this.f18909b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18910c && z12 && qg0Var.M.getAlpha() != 1.0f) {
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
        this.f18908a = 1;
        this.d = actionBarLayout;
        this.f18910c = z10;
    }
}
