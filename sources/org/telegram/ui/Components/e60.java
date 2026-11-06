package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class e60 extends AnimatorListenerAdapter {
    public final int f33153a;
    public final Object f33154b;

    public e60(Object obj, int i7) {
        this.f33153a = i7;
        this.f33154b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33153a) {
            case 9:
                ((qe0) this.f33154b).n1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33153a) {
            case 0:
                k60 k60Var = (k60) this.f33154b;
                i60 i60Var = k60Var.f35184x;
                if (i60Var != null) {
                    i60Var.setProgress(1.0f);
                    k60Var.f35184x.invalidate();
                }
                k60Var.m0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f33154b;
                ((t60) v0Var.f30610e).f38239x1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.f30608b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                f70 f70Var = (f70) this.f33154b;
                if (!f70Var.f33474f) {
                    f70Var.f33472c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                m70 m70Var = (m70) this.f33154b;
                FrameLayout frameLayout = m70Var.f35890b;
                fi.p5 p5Var = (fi.p5) m70Var.f35891c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) m70Var.d);
                return;
            case 4:
                ca0 ca0Var = (ca0) this.f33154b;
                ca0Var.f32507c0.h = null;
                ca0Var.f(ca0Var.S, ca0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f33154b;
                numberTextView.d = null;
                numberTextView.f31410b.clear();
                return;
            case 6:
                ec0 ec0Var = (ec0) this.f33154b;
                ec0Var.S = null;
                ec0Var.f33208r.setText("");
                fi.a8.a(ec0Var.f33209s, false);
                ec0Var.setVisibility(8);
                ec0Var.f33195a0 = 0.0f;
                ec0Var.h(0.0f);
                ec0Var.setAlpha(0.0f);
                ec0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f33154b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                qe qeVar = (qe) this.f33154b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.a8) qeVar.f37273c).f11614e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.a8) qeVar.f37273c).f11614e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ve0 ve0Var = (ve0) this.f33154b;
                ve0Var.f38935f = false;
                ve0Var.F = null;
                return;
            case 11:
                ((kg0) this.f33154b).b();
                return;
            case 12:
                ((rh0) this.f33154b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f33154b).run();
                return;
            case 14:
                pj0 pj0Var = (pj0) this.f33154b;
                View view = pj0Var.f36915a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (pj0Var.b1()) {
                    pj0Var.invalidate();
                    return;
                }
                return;
            case 15:
                rk0 rk0Var = (rk0) this.f33154b;
                if (rk0Var.f37736s != null) {
                    rk0Var.j();
                    rk0Var.f37736s.invalidate();
                    rk0Var.f37719e.invalidate();
                    rk0Var.invalidate();
                    rk0Var.f37736s = null;
                    return;
                }
                return;
            case 16:
                ((vk0) this.f33154b).d = false;
                return;
            case 17:
                ((fm0) this.f33154b).O0.setVisibility(8);
                return;
            case 18:
                cn0 cn0Var = (cn0) this.f33154b;
                if (animator == cn0Var.h) {
                    cn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((ao0) this.f33154b).f31868f = null;
                return;
            case 20:
                di.a4 a4Var = (di.a4) this.f33154b;
                if (a4Var.getParent() != null) {
                    ((ViewGroup) a4Var.getParent()).removeView(a4Var);
                    return;
                }
                return;
            case 21:
                yq0 yq0Var = (yq0) this.f33154b;
                View view2 = yq0Var.f40698c;
                view2.setAlpha(1.0f);
                v4.n0.x0(view2);
                yq0Var.f40696a.removeView(view2);
                return;
            case 22:
                it0 it0Var = (it0) this.f33154b;
                if (it0Var.f34752f == animator) {
                    it0Var.f34752f = null;
                    return;
                }
                return;
            case 23:
                yu0 yu0Var = (yu0) this.f33154b;
                yu0.B1(yu0Var, ((Float) yu0Var.f40733w3.getAnimatedValue()).floatValue());
                yu0Var.f40733w3 = null;
                return;
            case 24:
                yv0 yv0Var = (yv0) this.f33154b;
                yv0Var.f40761t1.setVisibility(8);
                yv0Var.f40764w1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    ew0[] ew0VarArr = (ew0[]) this.f33154b;
                    if (i7 < ew0VarArr.length) {
                        ew0 ew0Var = ew0VarArr[i7];
                        if (ew0Var != null) {
                            ew0Var.d = false;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((fw0) this.f33154b).H = null;
                return;
            case 27:
                ((iw0) this.f33154b).f34773e = false;
                return;
            case 28:
                ((sy0) this.f33154b).setVisibility(4);
                return;
            default:
                ((c01) this.f33154b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33153a) {
            case 16:
                vk0 vk0Var = (vk0) this.f33154b;
                vk0Var.d = true;
                if (vk0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) vk0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public e60(yq0 yq0Var, v4.n0 n0Var) {
        this.f33153a = 21;
        this.f33154b = yq0Var;
    }

    private final void a(Animator animator) {
    }
}
