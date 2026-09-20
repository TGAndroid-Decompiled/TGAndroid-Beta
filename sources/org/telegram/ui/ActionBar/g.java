package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.n6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w8;
import org.telegram.ui.yg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18887a;
    public boolean f18888b;
    public final boolean f18889c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18887a = i10;
        this.d = obj;
        this.f18888b = z10;
        this.f18889c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18887a) {
            case 1:
                this.f18888b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18605d1 = false;
                actionBarLayout.f18632s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18614h1 = null;
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
                ((ga0) this.d).f24321f2 = null;
                return;
            case 5:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z10 = this.f18888b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    yg0Var.K[!z10 ? 1 : 0] = null;
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
        switch (this.f18887a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f19536n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19536n[1].getParent()).removeView(kVar.f19536n[1]);
                }
                kVar.f19536n[1] = null;
                kVar.f19558x0 = false;
                if (this.f18888b && this.f18889c) {
                    kVar.f19545r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18888b) {
                    actionBarLayout.f18605d1 = false;
                    actionBarLayout.f18632s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18889c);
                    actionBarLayout.f18614h1 = null;
                    return;
                }
                return;
            case 2:
                d9 d9Var = (d9) this.d;
                d9Var.G = null;
                boolean z10 = this.f18888b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d9Var.i0(f7, false);
                if (this.f18889c) {
                    w8 w8Var = d9Var.f23520a;
                    w8Var.f23212w = -1.0f;
                    w8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18888b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.D0.setVisibility(4);
                        }
                        viVar.H0.setVisibility(4);
                    } else if (viVar.S0 && ((niVar = viVar.f29159y0) == null || niVar.J())) {
                        viVar.f29156x1.setVisibility(4);
                    }
                    if (this.f18889c) {
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
                ga0 ga0Var = (ga0) this.d;
                ja0 ja0Var = ga0Var.f24324i2;
                if (ga0Var.f24321f2 != null) {
                    ga0Var.f24321f2 = null;
                    if (!this.f18888b) {
                        ja0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ja0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = ja0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f18889c && (v0Var = ja0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ja0Var.f25326s.setVisibility(4);
                    v0 v0Var3 = ja0Var.G;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z12 = this.f18888b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18889c && z12 && yg0Var.M.getAlpha() != 1.0f) {
                    yg0Var.M.setAlpha(1.0f);
                    yg0Var.M.setScaleX(1.0f);
                    yg0Var.M.setScaleY(1.0f);
                    yg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f18887a = 1;
        this.d = actionBarLayout;
        this.f18889c = z10;
    }
}
