package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.m6;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.z8;
import org.telegram.ui.vg0;
public final class g extends AnimatorListenerAdapter {
    public final int f20665a;
    public boolean f20666b;
    public final boolean f20667c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20665a = i10;
        this.d = obj;
        this.f20666b = z10;
        this.f20667c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20665a) {
            case 1:
                this.f20666b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20353d1 = false;
                actionBarLayout.f20381s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20363h1 = null;
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
                ((ab0) this.d).f24550f2 = null;
                return;
            case 5:
                vg0 vg0Var = (vg0) this.d;
                AnimatorSet[] animatorSetArr = vg0Var.K;
                boolean z10 = this.f20666b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    vg0Var.K[!z10 ? 1 : 0] = null;
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
        u0 u0Var;
        switch (this.f20665a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.f21321n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21321n[1].getParent()).removeView(kVar.f21321n[1]);
                }
                kVar.f21321n[1] = null;
                kVar.f21343x0 = false;
                if (this.f20666b && this.f20667c) {
                    kVar.f21330r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20666b) {
                    actionBarLayout.f20353d1 = false;
                    actionBarLayout.f20381s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20667c);
                    actionBarLayout.f20363h1 = null;
                    return;
                }
                return;
            case 2:
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.f20666b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.i0(f7, false);
                if (this.f20667c) {
                    z8 z8Var = g9Var.f26687a;
                    z8Var.f26395w = -1.0f;
                    z8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20666b;
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
                    if (this.f20667c) {
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
                ab0 ab0Var = (ab0) this.d;
                db0 db0Var = ab0Var.f24553i2;
                if (ab0Var.f24550f2 != null) {
                    ab0Var.f24550f2 = null;
                    if (!this.f20666b) {
                        db0Var.F.setVisibility(4);
                        FrameLayout frameLayout = db0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = db0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f20667c && (u0Var = db0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    db0Var.f25751s.setVisibility(4);
                    u0 u0Var3 = db0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                vg0 vg0Var = (vg0) this.d;
                AnimatorSet[] animatorSetArr = vg0Var.K;
                boolean z12 = this.f20666b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20667c && z12 && vg0Var.M.getAlpha() != 1.0f) {
                    vg0Var.M.setAlpha(1.0f);
                    vg0Var.M.setScaleX(1.0f);
                    vg0Var.M.setScaleY(1.0f);
                    vg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20665a = 1;
        this.d = actionBarLayout;
        this.f20667c = z10;
    }
}
