package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.n6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.xg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18855a;
    public boolean f18856b;
    public final boolean f18857c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18855a = i10;
        this.d = obj;
        this.f18856b = z10;
        this.f18857c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18855a) {
            case 1:
                this.f18856b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18573d1 = false;
                actionBarLayout.f18600s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18582h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    viVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ((ha0) this.d).f24623f2 = null;
                return;
            case 5:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z10 = this.f18856b;
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
        ni niVar;
        int i10;
        v0 v0Var;
        switch (this.f18855a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f19504n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19504n[1].getParent()).removeView(kVar.f19504n[1]);
                }
                kVar.f19504n[1] = null;
                kVar.f19526x0 = false;
                if (this.f18856b && this.f18857c) {
                    kVar.f19513r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18856b) {
                    actionBarLayout.f18573d1 = false;
                    actionBarLayout.f18600s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18857c);
                    actionBarLayout.f18582h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f18856b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f18857c) {
                    x8 x8Var = e9Var.f23811a;
                    x8Var.f23496w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18856b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.D0.setVisibility(4);
                        }
                        viVar.H0.setVisibility(4);
                    } else if (viVar.S0 && ((niVar = viVar.f29082y0) == null || niVar.J())) {
                        viVar.f29079x1.setVisibility(4);
                    }
                    if (this.f18857c) {
                        viVar.b2();
                        n6 n6Var = viVar.O0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        n6Var.setVisibility(i10);
                    }
                    viVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ha0 ha0Var = (ha0) this.d;
                ka0 ka0Var = ha0Var.f24626i2;
                if (ha0Var.f24623f2 != null) {
                    ha0Var.f24623f2 = null;
                    if (!this.f18856b) {
                        ka0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ka0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = ka0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f18857c && (v0Var = ka0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ka0Var.f25669s.setVisibility(4);
                    v0 v0Var3 = ka0Var.G;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z12 = this.f18856b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18857c && z12 && xg0Var.M.getAlpha() != 1.0f) {
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
        this.f18855a = 1;
        this.d = actionBarLayout;
        this.f18857c = z10;
    }
}
