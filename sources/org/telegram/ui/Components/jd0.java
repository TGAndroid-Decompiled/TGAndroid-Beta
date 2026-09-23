package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f25259a;
    public final Object f25260b;

    public jd0(Object obj, int i10) {
        this.f25259a = i10;
        this.f25260b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25259a) {
            case 3:
                ((qg0) this.f25260b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25259a) {
            case 0:
                sd0 sd0Var = (sd0) this.f25260b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                return;
            case 1:
                AnimatorSet animatorSet = (AnimatorSet) this.f25260b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 2:
                hf hfVar = (hf) this.f25260b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) hfVar.f24660c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) hfVar.f24660c).e = null;
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                vg0 vg0Var = (vg0) this.f25260b;
                vg0Var.f28742f = false;
                vg0Var.F = null;
                return;
            case 5:
                ((ji0) this.f25260b).b();
                return;
            case 6:
                ((qj0) this.f25260b).h.setVisibility(8);
                return;
            case 7:
                ml0 ml0Var = (ml0) this.f25260b;
                View view = ml0Var.f26196c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ml0Var.b1()) {
                    ml0Var.invalidate();
                    return;
                }
                return;
            case 8:
                jm0 jm0Var = (jm0) this.f25260b;
                if (jm0Var.f25373s != null) {
                    jm0Var.j();
                    jm0Var.f25373s.invalidate();
                    jm0Var.e.invalidate();
                    jm0Var.invalidate();
                    jm0Var.f25373s = null;
                    return;
                }
                return;
            case 9:
                ((nm0) this.f25260b).d = false;
                return;
            case 10:
                ((yn0) this.f25260b).M0.setVisibility(8);
                return;
            case 11:
                wo0 wo0Var = (wo0) this.f25260b;
                if (animator == wo0Var.h) {
                    wo0Var.h = null;
                    return;
                }
                return;
            case 12:
                ((gq0) this.f25260b).e = null;
                return;
            case 13:
                oq0 oq0Var = (oq0) this.f25260b;
                if (oq0Var.getParent() != null) {
                    ((ViewGroup) oq0Var.getParent()).removeView(oq0Var);
                    return;
                }
                return;
            case 14:
                ts0 ts0Var = (ts0) this.f25260b;
                View view2 = ts0Var.f28301c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ts0Var.f28299a.removeView(view2);
                return;
            case 15:
                fv0 fv0Var = (fv0) this.f25260b;
                if (fv0Var.f24098f == animator) {
                    fv0Var.f24098f = null;
                    return;
                }
                return;
            case 16:
                vw0 vw0Var = (vw0) this.f25260b;
                vw0.y1(vw0Var, ((Float) vw0Var.f29422p3.getAnimatedValue()).floatValue());
                vw0Var.f29422p3 = null;
                return;
            case 17:
                ux0 ux0Var = (ux0) this.f25260b;
                ux0Var.f28592x.setVisibility(8);
                ux0Var.F.setImageDrawable(null);
                return;
            case 18:
                int i10 = 0;
                while (true) {
                    by0[] by0VarArr = (by0[]) this.f25260b;
                    if (i10 < by0VarArr.length) {
                        by0 by0Var = by0VarArr[i10];
                        if (by0Var != null) {
                            by0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 19:
                super.onAnimationEnd(animator);
                ((cy0) this.f25260b).H = null;
                return;
            case 20:
                ((fy0) this.f25260b).e = false;
                return;
            case 21:
                ((m01) this.f25260b).setVisibility(4);
                return;
            case 22:
                ((x11) this.f25260b).setVisibility(8);
                return;
            case 23:
                ai.n4 n4Var = ((r21) this.f25260b).f27535f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 24:
                v21 v21Var = (v21) this.f25260b;
                v21Var.K = 1.0f;
                v21Var.h.invalidate();
                return;
            case 25:
                ((d51) this.f25260b).L = null;
                return;
            case 26:
                UndoView undoView = (UndoView) this.f25260b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 27:
                k61 k61Var = (k61) this.f25260b;
                if (k61Var.f25525a.getTag() == null) {
                    k61Var.f25525a.setVisibility(4);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                l61 l61Var = (l61) this.f25260b;
                l61Var.f25829b = 0.0f;
                l61Var.setTranslationY(0.0f);
                l61Var.f25828a = null;
                return;
            default:
                g81 g81Var = (g81) this.f25260b;
                g81Var.J = false;
                g81Var.setEnabled(true);
                f81 f81Var = g81Var.f24234y;
                if (f81Var != null) {
                    ((ka.c) f81Var).h(1.0f);
                }
                g81Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25259a) {
            case 9:
                nm0 nm0Var = (nm0) this.f25260b;
                nm0Var.d = true;
                if (nm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) nm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public jd0(ts0 ts0Var, s4.o0 o0Var) {
        this.f25259a = 14;
        this.f25260b = ts0Var;
    }

    private final void a(Animator animator) {
    }
}
