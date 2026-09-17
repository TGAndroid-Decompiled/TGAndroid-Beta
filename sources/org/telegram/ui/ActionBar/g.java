package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.n6;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y90;
import org.telegram.ui.yg0;
public final class g extends AnimatorListenerAdapter {
    public final int f18648a;
    public boolean f18649b;
    public final boolean f18650c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f18648a = i10;
        this.d = obj;
        this.f18649b = z10;
        this.f18650c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18648a) {
            case 1:
                this.f18649b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f18397d1 = false;
                actionBarLayout.f18424s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f18406h1 = null;
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
                ((y90) this.d).f30151f2 = null;
                return;
            case 5:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z10 = this.f18649b;
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
        w0 w0Var;
        switch (this.f18648a) {
            case 0:
                k kVar = (k) this.d;
                k5 k5Var = kVar.f19303n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar.f19303n[1].getParent()).removeView(kVar.f19303n[1]);
                }
                kVar.f19303n[1] = null;
                kVar.f19325x0 = false;
                if (this.f18649b && this.f18650c) {
                    kVar.f19312r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f18649b) {
                    actionBarLayout.f18397d1 = false;
                    actionBarLayout.f18424s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f18650c);
                    actionBarLayout.f18406h1 = null;
                    return;
                }
                return;
            case 2:
                c9 c9Var = (c9) this.d;
                c9Var.G = null;
                boolean z10 = this.f18649b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c9Var.i0(f7, false);
                if (this.f18650c) {
                    v8 v8Var = c9Var.f22963a;
                    v8Var.f22666w = -1.0f;
                    v8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f18649b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.D0.setVisibility(4);
                        }
                        viVar.H0.setVisibility(4);
                    } else if (viVar.S0 && ((niVar = viVar.f28803y0) == null || niVar.J())) {
                        viVar.f28800x1.setVisibility(4);
                    }
                    if (this.f18650c) {
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
                y90 y90Var = (y90) this.d;
                ba0 ba0Var = y90Var.f30154i2;
                if (y90Var.f30151f2 != null) {
                    y90Var.f30151f2 = null;
                    if (!this.f18649b) {
                        ba0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ba0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = ba0Var.H;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f18650c && (w0Var = ba0Var.G) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ba0Var.f22687s.setVisibility(4);
                    w0 w0Var3 = ba0Var.G;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z12 = this.f18649b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f18650c && z12 && yg0Var.M.getAlpha() != 1.0f) {
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
        this.f18648a = 1;
        this.d = actionBarLayout;
        this.f18650c = z10;
    }
}
