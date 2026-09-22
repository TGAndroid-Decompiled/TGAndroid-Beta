package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.n6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w8;
import org.telegram.ui.yg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18902a;
    public boolean f18903b;
    public final boolean f18904c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18902a = i10;
        this.d = obj;
        this.f18903b = z10;
        this.f18904c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18902a) {
            case 1:
                this.f18903b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18620d1 = false;
                actionBarLayout.f18647s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18629h1 = null;
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
                ((ja0) this.d).f25343f2 = null;
                return;
            case 5:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z10 = this.f18903b;
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
        switch (this.f18902a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.f19551n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19551n[1].getParent()).removeView(kVar.f19551n[1]);
                }
                kVar.f19551n[1] = null;
                kVar.f19573x0 = false;
                if (this.f18903b && this.f18904c) {
                    kVar.f19560r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18903b) {
                    actionBarLayout.f18620d1 = false;
                    actionBarLayout.f18647s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18904c);
                    actionBarLayout.f18629h1 = null;
                    return;
                }
                return;
            case 2:
                d9 d9Var = (d9) this.d;
                d9Var.G = null;
                boolean z10 = this.f18903b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d9Var.i0(f7, false);
                if (this.f18904c) {
                    w8 w8Var = d9Var.f23604a;
                    w8Var.f23311w = -1.0f;
                    w8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18903b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.D0.setVisibility(4);
                        }
                        viVar.H0.setVisibility(4);
                    } else if (viVar.S0 && ((niVar = viVar.f29157y0) == null || niVar.J())) {
                        viVar.f29154x1.setVisibility(4);
                    }
                    if (this.f18904c) {
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
                ja0 ja0Var = (ja0) this.d;
                ma0 ma0Var = ja0Var.f25346i2;
                if (ja0Var.f25343f2 != null) {
                    ja0Var.f25343f2 = null;
                    if (!this.f18903b) {
                        ma0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ma0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = ma0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f18904c && (v0Var = ma0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ma0Var.f26413s.setVisibility(4);
                    v0 v0Var3 = ma0Var.G;
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
                boolean z12 = this.f18903b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18904c && z12 && yg0Var.M.getAlpha() != 1.0f) {
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
        this.f18902a = 1;
        this.d = actionBarLayout;
        this.f18904c = z10;
    }
}
