package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.z90;
import org.telegram.ui.rg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18658a;
    public boolean f18659b;
    public final boolean f18660c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18658a = i10;
        this.d = obj;
        this.f18659b = z10;
        this.f18660c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18658a) {
            case 1:
                this.f18659b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18360d1 = false;
                actionBarLayout.f18387s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18369h1 = null;
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
                ((z90) this.d).f30546f2 = null;
                return;
            case 5:
                rg0 rg0Var = (rg0) this.d;
                AnimatorSet[] animatorSetArr = rg0Var.K;
                boolean z10 = this.f18659b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    rg0Var.K[!z10 ? 1 : 0] = null;
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
        v0 v0Var;
        switch (this.f18658a) {
            case 0:
                k kVar = (k) this.d;
                i5 i5Var = kVar.f19295n[1];
                if (i5Var != null && i5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19295n[1].getParent()).removeView(kVar.f19295n[1]);
                }
                kVar.f19295n[1] = null;
                kVar.f19316x0 = false;
                if (this.f18659b && this.f18660c) {
                    kVar.f19304r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18659b) {
                    actionBarLayout.f18360d1 = false;
                    actionBarLayout.f18387s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18660c);
                    actionBarLayout.f18369h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f18659b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f18660c) {
                    x8 x8Var = e9Var.f23607a;
                    x8Var.f23332w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18659b;
                wi wiVar = (wi) this.d;
                if (animator.equals(wiVar.M0)) {
                    if (!z11) {
                        if (!wiVar.N) {
                            wiVar.D0.setVisibility(4);
                        }
                        wiVar.H0.setVisibility(4);
                    } else if (wiVar.S0 && ((oiVar = wiVar.f29726y0) == null || oiVar.J())) {
                        wiVar.f29723x1.setVisibility(4);
                    }
                    if (this.f18660c) {
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
                z90 z90Var = (z90) this.d;
                ca0 ca0Var = z90Var.f30549i2;
                if (z90Var.f30546f2 != null) {
                    z90Var.f30546f2 = null;
                    if (!this.f18659b) {
                        ca0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ca0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = ca0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f18660c && (v0Var = ca0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ca0Var.f23001s.setVisibility(4);
                    v0 v0Var3 = ca0Var.G;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg0 rg0Var = (rg0) this.d;
                AnimatorSet[] animatorSetArr = rg0Var.K;
                boolean z12 = this.f18659b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18660c && z12 && rg0Var.M.getAlpha() != 1.0f) {
                    rg0Var.M.setAlpha(1.0f);
                    rg0Var.M.setScaleX(1.0f);
                    rg0Var.M.setScaleY(1.0f);
                    rg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f18658a = 1;
        this.d = actionBarLayout;
        this.f18660c = z10;
    }
}
