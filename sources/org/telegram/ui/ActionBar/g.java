package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.x8;
import org.telegram.ui.fg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20857a;
    public boolean f20858b;
    public final boolean f20859c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20857a = i10;
        this.d = obj;
        this.f20858b = z10;
        this.f20859c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20857a) {
            case 1:
                this.f20858b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20559d1 = false;
                actionBarLayout.f20586s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20568h1 = null;
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
                ((ta0) this.d).f30507f2 = null;
                return;
            case 5:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.K;
                boolean z10 = this.f20858b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    fg0Var.K[!z10 ? 1 : 0] = null;
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
        u0 u0Var;
        switch (this.f20857a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f21499n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21499n[1].getParent()).removeView(kVar.f21499n[1]);
                }
                kVar.f21499n[1] = null;
                kVar.f21521x0 = false;
                if (this.f20858b && this.f20859c) {
                    kVar.f21508r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20858b) {
                    actionBarLayout.f20559d1 = false;
                    actionBarLayout.f20586s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20859c);
                    actionBarLayout.f20568h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f20858b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f20859c) {
                    x8 x8Var = e9Var.f25881a;
                    x8Var.f25528w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20858b;
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
                    if (this.f20859c) {
                        tiVar.f2();
                        ah.v vVar = tiVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        vVar.setVisibility(i10);
                    }
                    tiVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ta0 ta0Var = (ta0) this.d;
                wa0 wa0Var = ta0Var.f30510i2;
                if (ta0Var.f30507f2 != null) {
                    ta0Var.f30507f2 = null;
                    if (!this.f20858b) {
                        wa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = wa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = wa0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f20859c && (u0Var = wa0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    wa0Var.f32071s.setVisibility(4);
                    u0 u0Var3 = wa0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.K;
                boolean z12 = this.f20858b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20859c && z12 && fg0Var.M.getAlpha() != 1.0f) {
                    fg0Var.M.setAlpha(1.0f);
                    fg0Var.M.setScaleX(1.0f);
                    fg0Var.M.setScaleY(1.0f);
                    fg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20857a = 1;
        this.d = actionBarLayout;
        this.f20859c = z10;
    }
}
