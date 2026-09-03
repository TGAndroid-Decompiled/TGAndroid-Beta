package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.w8;
import org.telegram.ui.og0;
public final class g extends AnimatorListenerAdapter {
    public final int f21369a;
    public boolean f21370b;
    public final boolean f21371c;
    public final Object d;

    public g(Object obj, boolean z4, boolean z10, int i10) {
        this.f21369a = i10;
        this.d = obj;
        this.f21370b = z4;
        this.f21371c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f21369a) {
            case 1:
                this.f21370b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f21112a1 = false;
                actionBarLayout.f21145s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f21123e1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                mi miVar = (mi) this.d;
                if (animator.equals(miVar.J0)) {
                    miVar.J0 = null;
                    return;
                }
                return;
            case 4:
                ((ca0) this.d).f25878c2 = null;
                return;
            case 5:
                og0 og0Var = (og0) this.d;
                AnimatorSet[] animatorSetArr = og0Var.H;
                boolean z4 = this.f21370b;
                if (animatorSetArr[!z4 ? 1 : 0] != null && animatorSetArr[!z4 ? 1 : 0].equals(animator)) {
                    og0Var.H[!z4 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ei eiVar;
        int i10;
        w0 w0Var;
        switch (this.f21369a) {
            case 0:
                k kVar = (k) this.d;
                l5 l5Var = kVar.f21552n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21552n[1].getParent()).removeView(kVar.f21552n[1]);
                }
                kVar.f21552n[1] = null;
                kVar.f21565u0 = false;
                if (this.f21370b && this.f21371c) {
                    kVar.f21560r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f21370b) {
                    actionBarLayout.f21112a1 = false;
                    actionBarLayout.f21145s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f21371c);
                    actionBarLayout.f21123e1 = null;
                    return;
                }
                return;
            case 2:
                w8 w8Var = (w8) this.d;
                w8Var.D = null;
                boolean z4 = this.f21370b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.i0(f10, false);
                if (this.f21371c) {
                    p8 p8Var = w8Var.f32675a;
                    p8Var.f31826w = -1.0f;
                    p8Var.setExpanded(z4);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f21370b;
                mi miVar = (mi) this.d;
                if (animator.equals(miVar.J0)) {
                    if (!z10) {
                        if (!miVar.K) {
                            miVar.A0.setVisibility(4);
                        }
                        miVar.E0.setVisibility(4);
                    } else if (miVar.P0 && ((eiVar = miVar.f29118v0) == null || eiVar.I())) {
                        miVar.f29116u1.setVisibility(4);
                    }
                    if (this.f21371c) {
                        miVar.b2();
                        ag.l lVar = miVar.L0;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        lVar.setVisibility(i10);
                    }
                    miVar.J0 = null;
                    return;
                }
                return;
            case 4:
                ca0 ca0Var = (ca0) this.d;
                fa0 fa0Var = ca0Var.f25881f2;
                if (ca0Var.f25878c2 != null) {
                    ca0Var.f25878c2 = null;
                    if (!this.f21370b) {
                        fa0Var.C.setVisibility(4);
                        FrameLayout frameLayout = fa0Var.P;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = fa0Var.E;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f21371c && (w0Var = fa0Var.D) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    fa0Var.f26856s.setVisibility(4);
                    w0 w0Var3 = fa0Var.D;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                og0 og0Var = (og0) this.d;
                AnimatorSet[] animatorSetArr = og0Var.H;
                boolean z11 = this.f21370b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f21371c && z11 && og0Var.J.getAlpha() != 1.0f) {
                    og0Var.J.setAlpha(1.0f);
                    og0Var.J.setScaleX(1.0f);
                    og0Var.J.setScaleY(1.0f);
                    og0Var.J.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z4) {
        this.f21369a = 1;
        this.d = actionBarLayout;
        this.f21371c = z4;
    }
}
