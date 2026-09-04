package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class r80 extends AnimatorListenerAdapter {
    public final int f29987a;
    public final Object f29988b;

    public r80(Object obj, int i10) {
        this.f29987a = i10;
        this.f29988b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29987a) {
            case 6:
                ((pg0) this.f29988b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29987a) {
            case 0:
                s80 s80Var = (s80) this.f29988b;
                FrameLayout frameLayout = s80Var.f30221b;
                di.r6 r6Var = (di.r6) s80Var.f30222c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) s80Var.d);
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f29988b;
                qb0Var.f29662c0.h = null;
                qb0Var.e(qb0Var.S, qb0Var.R);
                return;
            case 2:
                NumberTextView numberTextView = (NumberTextView) this.f29988b;
                numberTextView.d = null;
                numberTextView.f24011b.clear();
                return;
            case 3:
                sd0 sd0Var = (sd0) this.f29988b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                return;
            case 4:
                AnimatorSet animatorSet = (AnimatorSet) this.f29988b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 5:
                jf jfVar = (jf) this.f29988b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((di.l9) jfVar.f27466c).f7575e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((di.l9) jfVar.f27466c).f7575e = null;
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                ug0 ug0Var = (ug0) this.f29988b;
                ug0Var.f30891f = false;
                ug0Var.F = null;
                return;
            case 8:
                ((ii0) this.f29988b).b();
                return;
            case 9:
                ((pj0) this.f29988b).h.setVisibility(8);
                return;
            case 10:
                ll0 ll0Var = (ll0) this.f29988b;
                View view = ll0Var.f28198c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ll0Var.a1()) {
                    ll0Var.invalidate();
                    return;
                }
                return;
            case 11:
                im0 im0Var = (im0) this.f29988b;
                if (im0Var.f27188s != null) {
                    im0Var.j();
                    im0Var.f27188s.invalidate();
                    im0Var.f27171e.invalidate();
                    im0Var.invalidate();
                    im0Var.f27188s = null;
                    return;
                }
                return;
            case 12:
                ((mm0) this.f29988b).d = false;
                return;
            case 13:
                ((yn0) this.f29988b).M0.setVisibility(8);
                return;
            case 14:
                xo0 xo0Var = (xo0) this.f29988b;
                if (animator == xo0Var.h) {
                    xo0Var.h = null;
                    return;
                }
                return;
            case 15:
                ((gq0) this.f29988b).f26489e = null;
                return;
            case 16:
                oq0 oq0Var = (oq0) this.f29988b;
                if (oq0Var.getParent() != null) {
                    ((ViewGroup) oq0Var.getParent()).removeView(oq0Var);
                    return;
                }
                return;
            case 17:
                ss0 ss0Var = (ss0) this.f29988b;
                View view2 = ss0Var.f30410c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ss0Var.f30408a.removeView(view2);
                return;
            case 18:
                ev0 ev0Var = (ev0) this.f29988b;
                if (ev0Var.f25797f == animator) {
                    ev0Var.f25797f = null;
                    return;
                }
                return;
            case 19:
                vw0 vw0Var = (vw0) this.f29988b;
                vw0.x1(vw0Var, ((Float) vw0Var.f32008p3.getAnimatedValue()).floatValue());
                vw0Var.f32008p3 = null;
                return;
            case 20:
                ux0 ux0Var = (ux0) this.f29988b;
                ux0Var.f31018x.setVisibility(8);
                ux0Var.F.setImageDrawable(null);
                return;
            case 21:
                int i10 = 0;
                while (true) {
                    by0[] by0VarArr = (by0[]) this.f29988b;
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
            case 22:
                super.onAnimationEnd(animator);
                ((cy0) this.f29988b).H = null;
                return;
            case 23:
                ((fy0) this.f29988b).f26197e = false;
                return;
            case 24:
                ((m01) this.f29988b).setVisibility(4);
                return;
            case 25:
                ((x11) this.f29988b).setVisibility(8);
                return;
            case 26:
                bi.a4 a4Var = ((r21) this.f29988b).f29901f;
                a4Var.setScaleX(1.0f);
                a4Var.setScaleY(1.0f);
                a4Var.invalidate();
                return;
            case 27:
                v21 v21Var = (v21) this.f29988b;
                v21Var.K = 1.0f;
                v21Var.h.invalidate();
                return;
            case 28:
                ((d51) this.f29988b).L = null;
                return;
            default:
                UndoView undoView = (UndoView) this.f29988b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29987a) {
            case 12:
                mm0 mm0Var = (mm0) this.f29988b;
                mm0Var.d = true;
                if (mm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) mm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public r80(ss0 ss0Var, s4.o0 o0Var) {
        this.f29987a = 17;
        this.f29988b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
