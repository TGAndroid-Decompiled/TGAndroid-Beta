package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.z8;
import org.telegram.ui.xg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20403a;
    public boolean f20404b;
    public final boolean f20405c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20403a = i10;
        this.d = obj;
        this.f20404b = z10;
        this.f20405c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20403a) {
            case 1:
                this.f20404b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20091d1 = false;
                actionBarLayout.f20119s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20101h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                aj ajVar = (aj) this.d;
                if (animator.equals(ajVar.P0)) {
                    ajVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ((eb0) this.d).f25658f2 = null;
                return;
            case 5:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z10 = this.f20404b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    xg0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        si siVar;
        int i10;
        u0 u0Var;
        switch (this.f20403a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f21060n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21060n[1].getParent()).removeView(kVar.f21060n[1]);
                }
                kVar.f21060n[1] = null;
                kVar.f21082x0 = false;
                if (this.f20404b && this.f20405c) {
                    kVar.f21069r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20404b) {
                    actionBarLayout.f20091d1 = false;
                    actionBarLayout.f20119s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20405c);
                    actionBarLayout.f20101h1 = null;
                    return;
                }
                return;
            case 2:
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.f20404b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.i0(f7, false);
                if (this.f20405c) {
                    z8 z8Var = g9Var.f26348a;
                    z8Var.f25981w = -1.0f;
                    z8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20404b;
                aj ajVar = (aj) this.d;
                if (animator.equals(ajVar.P0)) {
                    if (!z11) {
                        if (!ajVar.N) {
                            ajVar.G0.setVisibility(4);
                        }
                        ajVar.K0.setVisibility(4);
                    } else if (ajVar.V0 && ((siVar = ajVar.B0) == null || siVar.L())) {
                        ajVar.A1.setVisibility(4);
                    }
                    if (this.f20405c) {
                        ajVar.f2();
                        m6 m6Var = ajVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        m6Var.setVisibility(i10);
                    }
                    ajVar.P0 = null;
                    return;
                }
                return;
            case 4:
                eb0 eb0Var = (eb0) this.d;
                hb0 hb0Var = eb0Var.f25661i2;
                if (eb0Var.f25658f2 != null) {
                    eb0Var.f25658f2 = null;
                    if (!this.f20404b) {
                        hb0Var.F.setVisibility(4);
                        FrameLayout frameLayout = hb0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = hb0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f20405c && (u0Var = hb0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    hb0Var.f26745s.setVisibility(4);
                    u0 u0Var3 = hb0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z12 = this.f20404b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20405c && z12 && xg0Var.M.getAlpha() != 1.0f) {
                    xg0Var.M.setAlpha(1.0f);
                    xg0Var.M.setScaleX(1.0f);
                    xg0Var.M.setScaleY(1.0f);
                    xg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20403a = 1;
        this.d = actionBarLayout;
        this.f20405c = z10;
    }
}
