package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class g60 extends AnimatorListenerAdapter {
    public final int f26569a;
    public final Object f26570b;

    public g60(Object obj, int i10) {
        this.f26569a = i10;
        this.f26570b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26569a) {
            case 10:
                ((nh0) this.f26570b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26569a) {
            case 0:
                k60 k60Var = (k60) this.f26570b;
                if (animator == k60Var.W) {
                    k60Var.c(true);
                    k60Var.setVisibility(4);
                    return;
                }
                return;
            case 1:
                h80 h80Var = (h80) this.f26570b;
                f80 f80Var = h80Var.f26933x;
                if (f80Var != null) {
                    f80Var.setProgress(1.0f);
                    h80Var.f26933x.invalidate();
                }
                h80Var.m0 = null;
                return;
            case 2:
                r00 r00Var = (r00) this.f26570b;
                ((q80) r00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) r00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 3:
                d90 d90Var = (d90) this.f26570b;
                if (!d90Var.f25627f) {
                    d90Var.f25626c.setVisibility(8);
                    return;
                }
                return;
            case 4:
                l90 l90Var = (l90) this.f26570b;
                FrameLayout frameLayout = l90Var.f28278b;
                ei.g6 g6Var = (ei.g6) l90Var.f28279c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) l90Var.d);
                return;
            case 5:
                jc0 jc0Var = (jc0) this.f26570b;
                jc0Var.f27674c0.h = null;
                jc0Var.f(jc0Var.S, jc0Var.R);
                return;
            case 6:
                NumberTextView numberTextView = (NumberTextView) this.f26570b;
                numberTextView.d = null;
                numberTextView.f24395b.clear();
                return;
            case 7:
                ne0 ne0Var = (ne0) this.f26570b;
                ne0Var.S = null;
                ne0Var.f28894r.setText("");
                ei.x8.a(ne0Var.f28895s, false);
                ne0Var.setVisibility(8);
                ne0Var.f28882a0 = 0.0f;
                ne0Var.h(0.0f);
                ne0Var.setAlpha(0.0f);
                ne0Var.j();
                return;
            case 8:
                AnimatorSet animatorSet = (AnimatorSet) this.f26570b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 9:
                ff ffVar = (ff) this.f26570b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) ffVar.f26316c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) ffVar.f26316c).e = null;
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                sh0 sh0Var = (sh0) this.f26570b;
                sh0Var.f30510f = false;
                sh0Var.F = null;
                return;
            case 12:
                ((hj0) this.f26570b).b();
                return;
            case 13:
                ((pk0) this.f26570b).h.setVisibility(8);
                return;
            case 14:
                lm0 lm0Var = (lm0) this.f26570b;
                View view = lm0Var.f28371a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (lm0Var.c1()) {
                    lm0Var.invalidate();
                    return;
                }
                return;
            case 15:
                jn0 jn0Var = (jn0) this.f26570b;
                if (jn0Var.f27752s != null) {
                    jn0Var.j();
                    jn0Var.f27752s.invalidate();
                    jn0Var.e.invalidate();
                    jn0Var.invalidate();
                    jn0Var.f27752s = null;
                    return;
                }
                return;
            case 16:
                ((nn0) this.f26570b).d = false;
                return;
            case 17:
                ((zo0) this.f26570b).M0.setVisibility(8);
                return;
            case 18:
                wp0 wp0Var = (wp0) this.f26570b;
                if (animator == wp0Var.h) {
                    wp0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((gr0) this.f26570b).f26781f = null;
                return;
            case 20:
                or0 or0Var = (or0) this.f26570b;
                if (or0Var.getParent() != null) {
                    ((ViewGroup) or0Var.getParent()).removeView(or0Var);
                    return;
                }
                return;
            case 21:
                rt0 rt0Var = (rt0) this.f26570b;
                View view2 = rt0Var.f30272c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                rt0Var.f30270a.removeView(view2);
                return;
            case 22:
                dw0 dw0Var = (dw0) this.f26570b;
                if (dw0Var.f25850f == animator) {
                    dw0Var.f25850f = null;
                    return;
                }
                return;
            case 23:
                tx0 tx0Var = (tx0) this.f26570b;
                tx0.E1(tx0Var, ((Float) tx0Var.f30927q3.getAnimatedValue()).floatValue());
                tx0Var.f30927q3 = null;
                return;
            case 24:
                sy0 sy0Var = (sy0) this.f26570b;
                sy0Var.f30662x.setVisibility(8);
                sy0Var.F.setImageDrawable(null);
                return;
            case 25:
                int i10 = 0;
                while (true) {
                    yy0[] yy0VarArr = (yy0[]) this.f26570b;
                    if (i10 < yy0VarArr.length) {
                        yy0 yy0Var = yy0VarArr[i10];
                        if (yy0Var != null) {
                            yy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((zy0) this.f26570b).H = null;
                return;
            case 27:
                ((cz0) this.f26570b).e = false;
                return;
            case 28:
                ((o11) this.f26570b).setVisibility(4);
                return;
            default:
                ((y21) this.f26570b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26569a) {
            case 16:
                nn0 nn0Var = (nn0) this.f26570b;
                nn0Var.d = true;
                if (nn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) nn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public g60(rt0 rt0Var, s4.n0 n0Var) {
        this.f26569a = 21;
        this.f26570b = rt0Var;
    }

    private final void a(Animator animator) {
    }
}
