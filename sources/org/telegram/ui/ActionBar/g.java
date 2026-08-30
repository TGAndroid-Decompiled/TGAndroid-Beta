package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.w8;
import org.telegram.ui.ng0;
public final class g extends AnimatorListenerAdapter {
    public final int f19696a;
    public boolean f19697b;
    public final boolean f19698c;
    public final Object d;

    public g(Object obj, boolean z4, boolean z10, int i10) {
        this.f19696a = i10;
        this.d = obj;
        this.f19697b = z4;
        this.f19698c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19696a) {
            case 1:
                this.f19697b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f19449a1 = false;
                actionBarLayout.f19481s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f19459e1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                li liVar = (li) this.d;
                if (animator.equals(liVar.J0)) {
                    liVar.J0 = null;
                    return;
                }
                return;
            case 4:
                ((aa0) this.d).f23333c2 = null;
                return;
            case 5:
                ng0 ng0Var = (ng0) this.d;
                AnimatorSet[] animatorSetArr = ng0Var.H;
                boolean z4 = this.f19697b;
                if (animatorSetArr[!z4 ? 1 : 0] != null && animatorSetArr[!z4 ? 1 : 0].equals(animator)) {
                    ng0Var.H[!z4 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        di diVar;
        int i10;
        w0 w0Var;
        switch (this.f19696a) {
            case 0:
                k kVar = (k) this.d;
                k5 k5Var = kVar.f20334n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar.f20334n[1].getParent()).removeView(kVar.f20334n[1]);
                }
                kVar.f20334n[1] = null;
                kVar.f20347u0 = false;
                if (this.f19697b && this.f19698c) {
                    kVar.f20342r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f19697b) {
                    actionBarLayout.f19449a1 = false;
                    actionBarLayout.f19481s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f19698c);
                    actionBarLayout.f19459e1 = null;
                    return;
                }
                return;
            case 2:
                w8 w8Var = (w8) this.d;
                w8Var.D = null;
                boolean z4 = this.f19697b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.i0(f10, false);
                if (this.f19698c) {
                    p8 p8Var = w8Var.f30265a;
                    p8Var.f29386w = -1.0f;
                    p8Var.setExpanded(z4);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f19697b;
                li liVar = (li) this.d;
                if (animator.equals(liVar.J0)) {
                    if (!z10) {
                        if (!liVar.K) {
                            liVar.A0.setVisibility(4);
                        }
                        liVar.E0.setVisibility(4);
                    } else if (liVar.P0 && ((diVar = liVar.f26748v0) == null || diVar.I())) {
                        liVar.f26746u1.setVisibility(4);
                    }
                    if (this.f19698c) {
                        liVar.b2();
                        ah.d dVar = liVar.L0;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        dVar.setVisibility(i10);
                    }
                    liVar.J0 = null;
                    return;
                }
                return;
            case 4:
                aa0 aa0Var = (aa0) this.d;
                da0 da0Var = aa0Var.f23336f2;
                if (aa0Var.f23333c2 != null) {
                    aa0Var.f23333c2 = null;
                    if (!this.f19697b) {
                        da0Var.C.setVisibility(4);
                        FrameLayout frameLayout = da0Var.P;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = da0Var.E;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f19698c && (w0Var = da0Var.D) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    da0Var.f24221s.setVisibility(4);
                    w0 w0Var3 = da0Var.D;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                ng0 ng0Var = (ng0) this.d;
                AnimatorSet[] animatorSetArr = ng0Var.H;
                boolean z11 = this.f19697b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f19698c && z11 && ng0Var.J.getAlpha() != 1.0f) {
                    ng0Var.J.setAlpha(1.0f);
                    ng0Var.J.setScaleX(1.0f);
                    ng0Var.J.setScaleY(1.0f);
                    ng0Var.J.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z4) {
        this.f19696a = 1;
        this.d = actionBarLayout;
        this.f19698c = z4;
    }
}
