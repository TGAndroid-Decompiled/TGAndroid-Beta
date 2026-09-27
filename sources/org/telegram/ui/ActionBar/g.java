package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.tg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18876a;
    public boolean f18877b;
    public final boolean f18878c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18876a = i10;
        this.d = obj;
        this.f18877b = z10;
        this.f18878c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18876a) {
            case 1:
                this.f18877b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18606d1 = false;
                actionBarLayout.f18633s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18615h1 = null;
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
                ((la0) this.d).f25985f2 = null;
                return;
            case 5:
                tg0 tg0Var = (tg0) this.d;
                AnimatorSet[] animatorSetArr = tg0Var.K;
                boolean z10 = this.f18877b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    tg0Var.K[!z10 ? 1 : 0] = null;
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
        w0 w0Var;
        switch (this.f18876a) {
            case 0:
                l lVar = (l) this.d;
                j5 j5Var = lVar.f19569n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) lVar.f19569n[1].getParent()).removeView(lVar.f19569n[1]);
                }
                lVar.f19569n[1] = null;
                lVar.f19594x0 = false;
                if (this.f18877b && this.f18878c) {
                    lVar.f19578r.setVisibility(8);
                }
                lVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18877b) {
                    actionBarLayout.f18606d1 = false;
                    actionBarLayout.f18633s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18878c);
                    actionBarLayout.f18615h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f18877b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f18878c) {
                    x8 x8Var = e9Var.f23977a;
                    x8Var.f23607w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18877b;
                wi wiVar = (wi) this.d;
                if (animator.equals(wiVar.M0)) {
                    if (!z11) {
                        if (!wiVar.N) {
                            wiVar.D0.setVisibility(4);
                        }
                        wiVar.H0.setVisibility(4);
                    } else if (wiVar.S0 && ((oiVar = wiVar.f30023y0) == null || oiVar.J())) {
                        wiVar.f30020x1.setVisibility(4);
                    }
                    if (this.f18878c) {
                        wiVar.Y1();
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
                la0 la0Var = (la0) this.d;
                oa0 oa0Var = la0Var.f25988i2;
                if (la0Var.f25985f2 != null) {
                    la0Var.f25985f2 = null;
                    if (!this.f18877b) {
                        oa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = oa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = oa0Var.H;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f18878c && (w0Var = oa0Var.G) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    oa0Var.f27059s.setVisibility(4);
                    w0 w0Var3 = oa0Var.G;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                tg0 tg0Var = (tg0) this.d;
                AnimatorSet[] animatorSetArr = tg0Var.K;
                boolean z12 = this.f18877b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18878c && z12 && tg0Var.M.getAlpha() != 1.0f) {
                    tg0Var.M.setAlpha(1.0f);
                    tg0Var.M.setScaleX(1.0f);
                    tg0Var.M.setScaleY(1.0f);
                    tg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f18876a = 1;
        this.d = actionBarLayout;
        this.f18878c = z10;
    }
}
