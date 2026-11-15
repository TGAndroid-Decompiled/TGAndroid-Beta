package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class h60 extends AnimatorListenerAdapter {
    public final int f35180a;
    public final Object f35181b;

    public h60(Object obj, int i7) {
        this.f35180a = i7;
        this.f35181b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35180a) {
            case 9:
                ((te0) this.f35181b).f39681r1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35180a) {
            case 0:
                m60 m60Var = (m60) this.f35181b;
                k60 k60Var = m60Var.f37115x;
                if (k60Var != null) {
                    k60Var.setProgress(1.0f);
                    m60Var.f37115x.invalidate();
                }
                m60Var.m0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f35181b;
                ((v60) v0Var.f31785e).B1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.f31783b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                i70 i70Var = (i70) this.f35181b;
                if (!i70Var.f35475f) {
                    i70Var.f35473c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                p70 p70Var = (p70) this.f35181b;
                FrameLayout frameLayout = p70Var.f38233b;
                hi.n5 n5Var = (hi.n5) p70Var.f38234c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) p70Var.d);
                return;
            case 4:
                ea0 ea0Var = (ea0) this.f35181b;
                ea0Var.f34260d0.h = null;
                ea0Var.f(ea0Var.T, ea0Var.S);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f35181b;
                numberTextView.d = null;
                numberTextView.f32593b.clear();
                return;
            case 6:
                fc0 fc0Var = (fc0) this.f35181b;
                fc0Var.T = null;
                fc0Var.f34579r.setText("");
                hi.y7.a(fc0Var.f34580s, false);
                fc0Var.setVisibility(8);
                fc0Var.f34567b0 = 0.0f;
                fc0Var.h(0.0f);
                fc0Var.setAlpha(0.0f);
                fc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f35181b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                ne neVar = (ne) this.f35181b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.y7) neVar.f37554c).f15430e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.y7) neVar.f37554c).f15430e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ye0 ye0Var = (ye0) this.f35181b;
                ye0Var.f41985f = false;
                ye0Var.G = null;
                return;
            case 11:
                ((ng0) this.f35181b).b();
                return;
            case 12:
                ((vh0) this.f35181b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f35181b).run();
                return;
            case 14:
                uj0 uj0Var = (uj0) this.f35181b;
                View view = uj0Var.f40045b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (uj0Var.b1()) {
                    uj0Var.invalidate();
                    return;
                }
                return;
            case 15:
                wk0 wk0Var = (wk0) this.f35181b;
                if (wk0Var.f41400s != null) {
                    wk0Var.j();
                    wk0Var.f41400s.invalidate();
                    wk0Var.f41383e.invalidate();
                    wk0Var.invalidate();
                    wk0Var.f41400s = null;
                    return;
                }
                return;
            case 16:
                ((al0) this.f35181b).d = false;
                return;
            case 17:
                ((jm0) this.f35181b).P0.setVisibility(8);
                return;
            case 18:
                gn0 gn0Var = (gn0) this.f35181b;
                if (animator == gn0Var.h) {
                    gn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((do0) this.f35181b).f34005f = null;
                return;
            case 20:
                bi.v1 v1Var = (bi.v1) this.f35181b;
                if (v1Var.getParent() != null) {
                    ((ViewGroup) v1Var.getParent()).removeView(v1Var);
                    return;
                }
                return;
            case 21:
                ar0 ar0Var = (ar0) this.f35181b;
                View view2 = ar0Var.f33049c;
                view2.setAlpha(1.0f);
                v4.o0.x0(view2);
                ar0Var.f33047a.removeView(view2);
                return;
            case 22:
                jt0 jt0Var = (jt0) this.f35181b;
                if (jt0Var.f36175f == animator) {
                    jt0Var.f36175f = null;
                    return;
                }
                return;
            case 23:
                av0 av0Var = (av0) this.f35181b;
                av0.B1(av0Var, ((Float) av0Var.f33092x3.getAnimatedValue()).floatValue());
                av0Var.f33092x3 = null;
                return;
            case 24:
                bw0 bw0Var = (bw0) this.f35181b;
                bw0Var.f33425x1.setVisibility(8);
                bw0Var.A1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    hw0[] hw0VarArr = (hw0[]) this.f35181b;
                    if (i7 < hw0VarArr.length) {
                        hw0 hw0Var = hw0VarArr[i7];
                        if (hw0Var != null) {
                            hw0Var.d = false;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((iw0) this.f35181b).I = null;
                return;
            case 27:
                ((lw0) this.f35181b).f36913e = false;
                return;
            case 28:
                ((vy0) this.f35181b).setVisibility(4);
                return;
            default:
                ((f01) this.f35181b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35180a) {
            case 16:
                al0 al0Var = (al0) this.f35181b;
                al0Var.d = true;
                if (al0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) al0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public h60(ar0 ar0Var, v4.o0 o0Var) {
        this.f35180a = 21;
        this.f35181b = ar0Var;
    }

    private final void a(Animator animator) {
    }
}
