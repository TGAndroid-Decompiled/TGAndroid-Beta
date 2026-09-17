package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.z90;
import org.telegram.ui.wg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20448a;
    public boolean f20449b;
    public final boolean f20450c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20448a = i10;
        this.d = obj;
        this.f20449b = z10;
        this.f20450c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20448a) {
            case 1:
                this.f20449b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20148d1 = false;
                actionBarLayout.f20176s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20158h1 = null;
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
                ((z90) this.d).f33109f2 = null;
                return;
            case 5:
                wg0 wg0Var = (wg0) this.d;
                AnimatorSet[] animatorSetArr = wg0Var.K;
                boolean z10 = this.f20449b;
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
        ni niVar;
        int i10;
        v0 v0Var;
        switch (this.f20448a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f21103n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21103n[1].getParent()).removeView(kVar.f21103n[1]);
                }
                kVar.f21103n[1] = null;
                kVar.f21124x0 = false;
                if (this.f20449b && this.f20450c) {
                    kVar.f21112r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20449b) {
                    actionBarLayout.f20148d1 = false;
                    actionBarLayout.f20176s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20450c);
                    actionBarLayout.f20158h1 = null;
                    return;
                }
                return;
            case 2:
                f9 f9Var = (f9) this.d;
                f9Var.G = null;
                boolean z10 = this.f20449b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f9Var.i0(f7, false);
                if (this.f20450c) {
                    y8 y8Var = f9Var.f25965a;
                    y8Var.f25614w = -1.0f;
                    y8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20449b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.D0.setVisibility(4);
                        }
                        viVar.H0.setVisibility(4);
                    } else if (viVar.S0 && ((niVar = viVar.f31341y0) == null || niVar.J())) {
                        viVar.f31338x1.setVisibility(4);
                    }
                    if (this.f20450c) {
                        viVar.b2();
                        ah.w wVar = viVar.O0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        wVar.setVisibility(i10);
                    }
                    viVar.M0 = null;
                    return;
                }
                return;
            case 4:
                z90 z90Var = (z90) this.d;
                ca0 ca0Var = z90Var.f33112i2;
                if (z90Var.f33109f2 != null) {
                    z90Var.f33109f2 = null;
                    if (!this.f20449b) {
                        ca0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ca0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = ca0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f20450c && (v0Var = ca0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ca0Var.f24955s.setVisibility(4);
                    v0 v0Var3 = ca0Var.G;
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
                boolean z12 = this.f20449b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20450c && z12 && wg0Var.M.getAlpha() != 1.0f) {
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
        this.f20448a = 1;
        this.d = actionBarLayout;
        this.f20450c = z10;
    }
}
