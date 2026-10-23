package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ig0;
public final class g extends AnimatorListenerAdapter {
    public final int f20895a;
    public boolean f20896b;
    public final boolean f20897c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f20895a = i10;
        this.d = obj;
        this.f20896b = z10;
        this.f20897c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20895a) {
            case 1:
                this.f20896b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f20636j1 = false;
                actionBarLayout.f20653s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f20643n1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.P0)) {
                    tiVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ((ua0) this.d).f31130i2 = null;
                return;
            case 5:
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.K;
                boolean z10 = this.f20896b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ig0Var.K[!z10 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        li liVar;
        int i10;
        u0 u0Var;
        switch (this.f20895a) {
            case 0:
                k kVar = (k) this.d;
                n5 n5Var = kVar.f21067n[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21067n[1].getParent()).removeView(kVar.f21067n[1]);
                }
                kVar.f21067n[1] = null;
                kVar.f21090x0 = false;
                if (this.f20896b && this.f20897c) {
                    kVar.f21076r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f20896b) {
                    actionBarLayout.f20636j1 = false;
                    actionBarLayout.f20653s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f20897c);
                    actionBarLayout.f20643n1 = null;
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.f20896b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                if (this.f20897c) {
                    x8 x8Var = e9Var.f25925a;
                    x8Var.f25528w = -1.0f;
                    x8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f20896b;
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.P0)) {
                    if (!z11) {
                        if (!tiVar.N) {
                            tiVar.G0.setVisibility(4);
                        }
                        tiVar.K0.setVisibility(4);
                    } else if (tiVar.V0 && ((liVar = tiVar.B0) == null || liVar.L())) {
                        tiVar.A1.setVisibility(4);
                    }
                    if (this.f20897c) {
                        tiVar.j2();
                        ah.v vVar = tiVar.R0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        vVar.setVisibility(i10);
                    }
                    tiVar.P0 = null;
                    return;
                }
                return;
            case 4:
                ua0 ua0Var = (ua0) this.d;
                xa0 xa0Var = ua0Var.f31133l2;
                if (ua0Var.f31130i2 != null) {
                    ua0Var.f31130i2 = null;
                    if (!this.f20896b) {
                        xa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = xa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = xa0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.f20897c && (u0Var = xa0Var.G) != null) {
                            u0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    xa0Var.f32507s.setVisibility(4);
                    u0 u0Var3 = xa0Var.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.K;
                boolean z12 = this.f20896b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f20897c && z12 && ig0Var.M.getAlpha() != 1.0f) {
                    ig0Var.M.setAlpha(1.0f);
                    ig0Var.M.setScaleX(1.0f);
                    ig0Var.M.setScaleY(1.0f);
                    ig0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f20895a = 1;
        this.d = actionBarLayout;
        this.f20897c = z10;
    }
}
