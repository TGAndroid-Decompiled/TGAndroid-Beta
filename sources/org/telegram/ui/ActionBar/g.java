package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.z8;
import org.telegram.ui.wg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20629a;
    public boolean f20630b;
    public final boolean f20631c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20629a = i10;
        this.d = obj;
        this.f20630b = z10;
        this.f20631c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20629a) {
            case 1:
                this.f20630b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20327d1 = false;
                actionBarLayout.f20355s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20337h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.P0)) {
                    yiVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ((bb0) this.d).f24912f2 = null;
                return;
            case 5:
                wg0 wg0Var = (wg0) this.d;
                AnimatorSet[] animatorSetArr = wg0Var.K;
                boolean z10 = this.f20630b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    wg0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        qi qiVar;
        int i10;
        v0 v0Var;
        switch (this.f20629a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f21288n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21288n[1].getParent()).removeView(kVar.f21288n[1]);
                }
                kVar.f21288n[1] = null;
                kVar.f21310x0 = false;
                if (this.f20630b && this.f20631c) {
                    kVar.f21297r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20630b) {
                    actionBarLayout.f20327d1 = false;
                    actionBarLayout.f20355s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20631c);
                    actionBarLayout.f20337h1 = null;
                    return;
                }
                return;
            case 2:
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.f20630b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.i0(f7, false);
                if (this.f20631c) {
                    z8 z8Var = g9Var.f26640a;
                    z8Var.f26357w = -1.0f;
                    z8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20630b;
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.P0)) {
                    if (!z11) {
                        if (!yiVar.N) {
                            yiVar.G0.setVisibility(4);
                        }
                        yiVar.K0.setVisibility(4);
                    } else if (yiVar.V0 && ((qiVar = yiVar.B0) == null || qiVar.L())) {
                        yiVar.A1.setVisibility(4);
                    }
                    if (this.f20631c) {
                        yiVar.f2();
                        m6 m6Var = yiVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        m6Var.setVisibility(i10);
                    }
                    yiVar.P0 = null;
                    return;
                }
                return;
            case 4:
                bb0 bb0Var = (bb0) this.d;
                eb0 eb0Var = bb0Var.f24915i2;
                if (bb0Var.f24912f2 != null) {
                    bb0Var.f24912f2 = null;
                    if (!this.f20630b) {
                        eb0Var.F.setVisibility(4);
                        FrameLayout frameLayout = eb0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = eb0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f20631c && (v0Var = eb0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    eb0Var.f26000s.setVisibility(4);
                    v0 v0Var3 = eb0Var.G;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                wg0 wg0Var = (wg0) this.d;
                AnimatorSet[] animatorSetArr = wg0Var.K;
                boolean z12 = this.f20630b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20631c && z12 && wg0Var.M.getAlpha() != 1.0f) {
                    wg0Var.M.setAlpha(1.0f);
                    wg0Var.M.setScaleX(1.0f);
                    wg0Var.M.setScaleY(1.0f);
                    wg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20629a = 1;
        this.d = actionBarLayout;
        this.f20631c = z10;
    }
}
