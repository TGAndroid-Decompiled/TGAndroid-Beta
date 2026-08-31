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
    public final int f21367a;
    public boolean f21368b;
    public final boolean f21369c;
    public final Object d;

    public g(Object obj, boolean z4, boolean z10, int i10) {
        this.f21367a = i10;
        this.d = obj;
        this.f21368b = z4;
        this.f21369c = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f21367a) {
            case 1:
                this.f21368b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f21110a1 = false;
                actionBarLayout.f21143s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f21121e1 = null;
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
                ((ca0) this.d).f25901c2 = null;
                return;
            case 5:
                og0 og0Var = (og0) this.d;
                AnimatorSet[] animatorSetArr = og0Var.H;
                boolean z4 = this.f21368b;
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
        switch (this.f21367a) {
            case 0:
                k kVar = (k) this.d;
                l5 l5Var = kVar.f21550n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) kVar.f21550n[1].getParent()).removeView(kVar.f21550n[1]);
                }
                kVar.f21550n[1] = null;
                kVar.f21563u0 = false;
                if (this.f21368b && this.f21369c) {
                    kVar.f21558r.setVisibility(8);
                }
                kVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f21368b) {
                    actionBarLayout.f21110a1 = false;
                    actionBarLayout.f21143s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f21369c);
                    actionBarLayout.f21121e1 = null;
                    return;
                }
                return;
            case 2:
                w8 w8Var = (w8) this.d;
                w8Var.D = null;
                boolean z4 = this.f21368b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.i0(f10, false);
                if (this.f21369c) {
                    p8 p8Var = w8Var.f32670a;
                    p8Var.f31849w = -1.0f;
                    p8Var.setExpanded(z4);
                    return;
                }
                return;
            case 3:
                boolean z10 = this.f21368b;
                mi miVar = (mi) this.d;
                if (animator.equals(miVar.J0)) {
                    if (!z10) {
                        if (!miVar.K) {
                            miVar.A0.setVisibility(4);
                        }
                        miVar.E0.setVisibility(4);
                    } else if (miVar.P0 && ((eiVar = miVar.f29100v0) == null || eiVar.I())) {
                        miVar.f29098u1.setVisibility(4);
                    }
                    if (this.f21369c) {
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
                fa0 fa0Var = ca0Var.f25904f2;
                if (ca0Var.f25901c2 != null) {
                    ca0Var.f25901c2 = null;
                    if (!this.f21368b) {
                        fa0Var.C.setVisibility(4);
                        FrameLayout frameLayout = fa0Var.P;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = fa0Var.E;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f21369c && (w0Var = fa0Var.D) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    fa0Var.f26857s.setVisibility(4);
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
                boolean z11 = this.f21368b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.f21369c && z11 && og0Var.J.getAlpha() != 1.0f) {
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
        this.f21367a = 1;
        this.d = actionBarLayout;
        this.f21369c = z4;
    }
}
