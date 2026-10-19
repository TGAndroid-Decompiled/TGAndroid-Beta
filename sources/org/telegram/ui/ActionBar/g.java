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
import org.telegram.ui.dg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20851a;
    public boolean f20852b;
    public final boolean f20853c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20851a = i10;
        this.d = obj;
        this.f20852b = z10;
        this.f20853c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20851a) {
            case 1:
                this.f20852b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20553d1 = false;
                actionBarLayout.f20580s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20562h1 = null;
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
                ((ta0) this.d).f30460f2 = null;
                return;
            case 5:
                dg0 dg0Var = (dg0) this.d;
                AnimatorSet[] animatorSetArr = dg0Var.K;
                boolean z10 = this.f20852b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    dg0Var.K[!z10 ? 1 : 0] = null;
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
        switch (this.f20851a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f21493n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21493n[1].getParent()).removeView(kVar.f21493n[1]);
                }
                kVar.f21493n[1] = null;
                kVar.f21515x0 = false;
                if (this.f20852b && this.f20853c) {
                    kVar.f21502r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20852b) {
                    actionBarLayout.f20553d1 = false;
                    actionBarLayout.f20580s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20853c);
                    actionBarLayout.f20562h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f20852b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f20853c) {
                    x8 x8Var = e9Var.f25853a;
                    x8Var.f25492w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20852b;
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
                    if (this.f20853c) {
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
                wa0 wa0Var = ta0Var.f30463i2;
                if (ta0Var.f30460f2 != null) {
                    ta0Var.f30460f2 = null;
                    if (!this.f20852b) {
                        wa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = wa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = wa0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f20853c && (u0Var = wa0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    wa0Var.f32061s.setVisibility(4);
                    u0 u0Var3 = wa0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                dg0 dg0Var = (dg0) this.d;
                AnimatorSet[] animatorSetArr = dg0Var.K;
                boolean z12 = this.f20852b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20853c && z12 && dg0Var.M.getAlpha() != 1.0f) {
                    dg0Var.M.setAlpha(1.0f);
                    dg0Var.M.setScaleX(1.0f);
                    dg0Var.M.setScaleY(1.0f);
                    dg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20851a = 1;
        this.d = actionBarLayout;
        this.f20853c = z10;
    }
}
