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
import org.telegram.ui.ah0;
public final class g extends AnimatorListenerAdapter {
    public final int f19511a;
    public boolean f19512b;
    public final boolean f19513c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f19511a = i10;
        this.d = obj;
        this.f19512b = z10;
        this.f19513c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19511a) {
            case 1:
                this.f19512b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f19199d1 = false;
                actionBarLayout.f19226s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f19208h1 = null;
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
                ((za0) this.d).f31532f2 = null;
                return;
            case 5:
                ah0 ah0Var = (ah0) this.d;
                AnimatorSet[] animatorSetArr = ah0Var.K;
                boolean z10 = this.f19512b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ah0Var.K[!z10 ? 1 : 0] = null;
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
        switch (this.f19511a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f20141n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f20141n[1].getParent()).removeView(kVar.f20141n[1]);
                }
                kVar.f20141n[1] = null;
                kVar.f20163x0 = false;
                if (this.f19512b && this.f19513c) {
                    kVar.f20150r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f19512b) {
                    actionBarLayout.f19199d1 = false;
                    actionBarLayout.f19226s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f19513c);
                    actionBarLayout.f19208h1 = null;
                    return;
                }
                return;
            case 2:
                h9 h9Var = (h9) this.d;
                h9Var.G = null;
                boolean z10 = this.f19512b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                h9Var.i0(f7, false);
                if (this.f19513c) {
                    a9 a9Var = h9Var.f25209a;
                    a9Var.f24927w = -1.0f;
                    a9Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f19512b;
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
                    if (this.f19513c) {
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
                cb0 cb0Var = za0Var.f31535i2;
                if (za0Var.f31532f2 != null) {
                    za0Var.f31532f2 = null;
                    if (!this.f19512b) {
                        cb0Var.F.setVisibility(4);
                        FrameLayout frameLayout = cb0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = cb0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f19513c && (u0Var = cb0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    cb0Var.f23678s.setVisibility(4);
                    u0 u0Var3 = cb0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                ah0 ah0Var = (ah0) this.d;
                AnimatorSet[] animatorSetArr = ah0Var.K;
                boolean z12 = this.f19512b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f19513c && z12 && ah0Var.M.getAlpha() != 1.0f) {
                    ah0Var.M.setAlpha(1.0f);
                    ah0Var.M.setScaleX(1.0f);
                    ah0Var.M.setScaleY(1.0f);
                    ah0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f19511a = 1;
        this.d = actionBarLayout;
        this.f19513c = z10;
    }
}
