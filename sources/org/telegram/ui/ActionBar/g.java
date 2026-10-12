package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.za0;
import org.telegram.ui.bh0;
public final class g extends AnimatorListenerAdapter {
    public final int f19811a;
    public boolean f19812b;
    public final boolean f19813c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f19811a = i10;
        this.d = obj;
        this.f19812b = z10;
        this.f19813c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19811a) {
            case 1:
                this.f19812b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f19499d1 = false;
                actionBarLayout.f19526s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f19508h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.P0)) {
                    viVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ((za0) this.d).f31828f2 = null;
                return;
            case 5:
                bh0 bh0Var = (bh0) this.d;
                AnimatorSet[] animatorSetArr = bh0Var.K;
                boolean z10 = this.f19812b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    bh0Var.K[!z10 ? 1 : 0] = null;
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
        u0 u0Var;
        switch (this.f19811a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f20441n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f20441n[1].getParent()).removeView(kVar.f20441n[1]);
                }
                kVar.f20441n[1] = null;
                kVar.f20463x0 = false;
                if (this.f19812b && this.f19813c) {
                    kVar.f20450r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f19812b) {
                    actionBarLayout.f19499d1 = false;
                    actionBarLayout.f19526s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f19813c);
                    actionBarLayout.f19508h1 = null;
                    return;
                }
                return;
            case 2:
                h9 h9Var = (h9) this.d;
                h9Var.G = null;
                boolean z10 = this.f19812b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                h9Var.i0(f7, false);
                if (this.f19813c) {
                    a9 a9Var = h9Var.f25564a;
                    a9Var.f25230w = -1.0f;
                    a9Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f19812b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.P0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.G0.setVisibility(4);
                        }
                        viVar.K0.setVisibility(4);
                    } else if (viVar.V0 && ((niVar = viVar.B0) == null || niVar.L())) {
                        viVar.A1.setVisibility(4);
                    }
                    if (this.f19813c) {
                        viVar.f2();
                        ah.v vVar = viVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        vVar.setVisibility(i10);
                    }
                    viVar.P0 = null;
                    return;
                }
                return;
            case 4:
                za0 za0Var = (za0) this.d;
                cb0 cb0Var = za0Var.f31831i2;
                if (za0Var.f31828f2 != null) {
                    za0Var.f31828f2 = null;
                    if (!this.f19812b) {
                        cb0Var.F.setVisibility(4);
                        FrameLayout frameLayout = cb0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = cb0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f19813c && (u0Var = cb0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    cb0Var.f24024s.setVisibility(4);
                    u0 u0Var3 = cb0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                bh0 bh0Var = (bh0) this.d;
                AnimatorSet[] animatorSetArr = bh0Var.K;
                boolean z12 = this.f19812b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f19813c && z12 && bh0Var.M.getAlpha() != 1.0f) {
                    bh0Var.M.setAlpha(1.0f);
                    bh0Var.M.setScaleX(1.0f);
                    bh0Var.M.setScaleY(1.0f);
                    bh0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f19811a = 1;
        this.d = actionBarLayout;
        this.f19813c = z10;
    }
}
