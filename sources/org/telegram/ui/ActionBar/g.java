package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xi;
import org.telegram.ui.ug0;
public final class g extends AnimatorListenerAdapter {
    public final int f20633a;
    public boolean f20634b;
    public final boolean f20635c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20633a = i10;
        this.d = obj;
        this.f20634b = z10;
        this.f20635c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20633a) {
            case 1:
                this.f20634b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20316d1 = false;
                actionBarLayout.f20344s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20326h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                xi xiVar = (xi) this.d;
                if (animator.equals(xiVar.M0)) {
                    xiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ((ma0) this.d).f28561f2 = null;
                return;
            case 5:
                ug0 ug0Var = (ug0) this.d;
                AnimatorSet[] animatorSetArr = ug0Var.K;
                boolean z10 = this.f20634b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ug0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        pi piVar;
        int i10;
        v0 v0Var;
        switch (this.f20633a) {
            case 0:
                k kVar = (k) this.d;
                i5 i5Var = kVar.f21275n[1];
                if (i5Var != null && i5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21275n[1].getParent()).removeView(kVar.f21275n[1]);
                }
                kVar.f21275n[1] = null;
                kVar.f21299x0 = false;
                if (this.f20634b && this.f20635c) {
                    kVar.f21284r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20634b) {
                    actionBarLayout.f20316d1 = false;
                    actionBarLayout.f20344s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20635c);
                    actionBarLayout.f20326h1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f20634b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f20635c) {
                    x8 x8Var = e9Var.f26002a;
                    x8Var.f25660w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20634b;
                xi xiVar = (xi) this.d;
                if (animator.equals(xiVar.M0)) {
                    if (!z11) {
                        if (!xiVar.N) {
                            xiVar.D0.setVisibility(4);
                        }
                        xiVar.H0.setVisibility(4);
                    } else if (xiVar.S0 && ((piVar = xiVar.f32873y0) == null || piVar.H())) {
                        xiVar.f32870x1.setVisibility(4);
                    }
                    if (this.f20635c) {
                        xiVar.Y1();
                        m6 m6Var = xiVar.O0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        m6Var.setVisibility(i10);
                    }
                    xiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ma0 ma0Var = (ma0) this.d;
                pa0 pa0Var = ma0Var.f28564i2;
                if (ma0Var.f28561f2 != null) {
                    ma0Var.f28561f2 = null;
                    if (!this.f20634b) {
                        pa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = pa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = pa0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.f20635c && (v0Var = pa0Var.G) != null) {
                            v0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    pa0Var.f29590s.setVisibility(4);
                    v0 v0Var3 = pa0Var.G;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                ug0 ug0Var = (ug0) this.d;
                AnimatorSet[] animatorSetArr = ug0Var.K;
                boolean z12 = this.f20634b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20635c && z12 && ug0Var.M.getAlpha() != 1.0f) {
                    ug0Var.M.setAlpha(1.0f);
                    ug0Var.M.setScaleX(1.0f);
                    ug0Var.M.setScaleY(1.0f);
                    ug0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20633a = 1;
        this.d = actionBarLayout;
        this.f20635c = z10;
    }
}
