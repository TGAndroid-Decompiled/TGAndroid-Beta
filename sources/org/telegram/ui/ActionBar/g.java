package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.n7;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.yi;
import org.telegram.ui.xg0;
public final class g extends AnimatorListenerAdapter {
    public final int f17719a;
    public boolean f17720b;
    public final boolean f17721c;
    public final Object d;

    public g(Object obj, boolean z10, boolean z11, int i10) {
        this.f17719a = i10;
        this.d = obj;
        this.f17720b = z10;
        this.f17721c = z11;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17719a) {
            case 1:
                this.f17720b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.f17479d1 = false;
                actionBarLayout.f17506s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.f17488h1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.M0)) {
                    yiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ((ia0) this.d).f23976f2 = null;
                return;
            case 5:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z10 = this.f17720b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    xg0Var.K[!z10 ? 1 : 0] = null;
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
        w0 w0Var;
        switch (this.f17719a) {
            case 0:
                l lVar = (l) this.d;
                l5 l5Var = lVar.f18388n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) lVar.f18388n[1].getParent()).removeView(lVar.f18388n[1]);
                }
                lVar.f18388n[1] = null;
                lVar.f18409x0 = false;
                if (this.f17720b && this.f17721c) {
                    lVar.f18397r.setVisibility(8);
                }
                lVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.f17720b) {
                    actionBarLayout.f17479d1 = false;
                    actionBarLayout.f17506s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.f17721c);
                    actionBarLayout.f17488h1 = null;
                    return;
                }
                return;
            case 2:
                d9 d9Var = (d9) this.d;
                d9Var.G = null;
                boolean z10 = this.f17720b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d9Var.i0(f7, false);
                if (this.f17721c) {
                    w8 w8Var = d9Var.f22325a;
                    w8Var.f22051w = -1.0f;
                    w8Var.setExpanded(z10);
                    return;
                }
                return;
            case 3:
                boolean z11 = this.f17720b;
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.M0)) {
                    if (!z11) {
                        if (!yiVar.N) {
                            yiVar.D0.setVisibility(4);
                        }
                        yiVar.H0.setVisibility(4);
                    } else if (yiVar.S0 && ((qiVar = yiVar.f29427y0) == null || qiVar.J())) {
                        yiVar.f29424x1.setVisibility(4);
                    }
                    if (this.f17721c) {
                        yiVar.b2();
                        n7 n7Var = yiVar.O0;
                        if (z11) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        n7Var.setVisibility(i10);
                    }
                    yiVar.M0 = null;
                    return;
                }
                return;
            case 4:
                ia0 ia0Var = (ia0) this.d;
                la0 la0Var = ia0Var.f23979i2;
                if (ia0Var.f23976f2 != null) {
                    ia0Var.f23976f2 = null;
                    if (!this.f17720b) {
                        la0Var.F.setVisibility(4);
                        FrameLayout frameLayout = la0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = la0Var.H;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.f17721c && (w0Var = la0Var.G) != null) {
                            w0Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    la0Var.f24925s.setVisibility(4);
                    w0 w0Var3 = la0Var.G;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z12 = this.f17720b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.f17721c && z12 && xg0Var.M.getAlpha() != 1.0f) {
                    xg0Var.M.setAlpha(1.0f);
                    xg0Var.M.setScaleX(1.0f);
                    xg0Var.M.setScaleY(1.0f);
                    xg0Var.M.setVisibility(0);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.f17719a = 1;
        this.d = actionBarLayout;
        this.f17721c = z10;
    }
}
