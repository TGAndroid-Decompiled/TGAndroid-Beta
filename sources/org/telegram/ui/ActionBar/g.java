package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.va0;
import org.telegram.ui.hg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20896a;
    public boolean f20897b;
    public final boolean f20898c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20896a = i10;
        this.d = obj;
        this.f20897b = z10;
        this.f20898c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20896a) {
            case 1:
                this.f20897b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20637j1 = false;
                actionBarLayout.f20654s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20644n1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ri riVar = (ri) this.d;
                if (animator.equals(riVar.P0)) {
                    riVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ((sa0) this.d).f30473i2 = null;
                return;
            case 5:
                hg0 hg0Var = (hg0) this.d;
                AnimatorSet[] animatorSetArr = hg0Var.K;
                boolean z10 = this.f20897b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    hg0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        ji jiVar;
        int i10;
        u0 u0Var;
        switch (this.f20896a) {
            case 0:
                k kVar = (k) this.d;
                n5 n5Var = kVar.f21068n[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21068n[1].getParent()).removeView(kVar.f21068n[1]);
                }
                kVar.f21068n[1] = null;
                kVar.f21091x0 = false;
                if (this.f20897b && this.f20898c) {
                    kVar.f21077r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20897b) {
                    actionBarLayout.f20637j1 = false;
                    actionBarLayout.f20654s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20898c);
                    actionBarLayout.f20644n1 = null;
                    return;
                }
                return;
            case 2:
                c9 c9Var = (c9) this.d;
                c9Var.G = null;
                boolean z10 = this.f20897b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c9Var.i0(f7, false);
                if (this.f20898c) {
                    v8 v8Var = c9Var.f25256a;
                    v8Var.f24935w = -1.0f;
                    v8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20897b;
                ri riVar = (ri) this.d;
                if (animator.equals(riVar.P0)) {
                    if (!z11) {
                        if (!riVar.N) {
                            riVar.G0.setVisibility(4);
                        }
                        riVar.K0.setVisibility(4);
                    } else if (riVar.V0 && ((jiVar = riVar.B0) == null || jiVar.L())) {
                        riVar.A1.setVisibility(4);
                    }
                    if (this.f20898c) {
                        riVar.j2();
                        ah.v vVar = riVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        vVar.setVisibility(i10);
                    }
                    riVar.P0 = null;
                    return;
                }
                return;
            case 4:
                sa0 sa0Var = (sa0) this.d;
                va0 va0Var = sa0Var.f30476l2;
                if (sa0Var.f30473i2 != null) {
                    sa0Var.f30473i2 = null;
                    if (!this.f20897b) {
                        va0Var.F.setVisibility(4);
                        FrameLayout frameLayout = va0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = va0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f20898c && (u0Var = va0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    va0Var.f31406s.setVisibility(4);
                    u0 u0Var3 = va0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                hg0 hg0Var = (hg0) this.d;
                AnimatorSet[] animatorSetArr = hg0Var.K;
                boolean z12 = this.f20897b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20898c && z12 && hg0Var.M.getAlpha() != 1.0f) {
                    hg0Var.M.setAlpha(1.0f);
                    hg0Var.M.setScaleX(1.0f);
                    hg0Var.M.setScaleY(1.0f);
                    hg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20896a = 1;
        this.d = actionBarLayout;
        this.f20898c = z10;
    }
}
