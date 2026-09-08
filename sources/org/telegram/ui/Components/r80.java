package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class r80 extends AnimatorListenerAdapter {
    public final int f30014a;
    public final Object f30015b;

    public r80(Object obj, int i10) {
        this.f30014a = i10;
        this.f30015b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30014a) {
            case 6:
                ((pg0) this.f30015b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30014a) {
            case 0:
                s80 s80Var = (s80) this.f30015b;
                FrameLayout frameLayout = s80Var.f30248b;
                di.r6 r6Var = (di.r6) s80Var.f30249c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) s80Var.d);
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f30015b;
                qb0Var.f29689c0.h = null;
                qb0Var.e(qb0Var.S, qb0Var.R);
                return;
            case 2:
                NumberTextView numberTextView = (NumberTextView) this.f30015b;
                numberTextView.d = null;
                numberTextView.f24038b.clear();
                return;
            case 3:
                sd0 sd0Var = (sd0) this.f30015b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                return;
            case 4:
                AnimatorSet animatorSet = (AnimatorSet) this.f30015b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 5:
                jf jfVar = (jf) this.f30015b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((di.l9) jfVar.f27493c).f7603e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((di.l9) jfVar.f27493c).f7603e = null;
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                ug0 ug0Var = (ug0) this.f30015b;
                ug0Var.f30918f = false;
                ug0Var.F = null;
                return;
            case 8:
                ((ii0) this.f30015b).b();
                return;
            case 9:
                ((pj0) this.f30015b).h.setVisibility(8);
                return;
            case 10:
                ll0 ll0Var = (ll0) this.f30015b;
                View view = ll0Var.f28225c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ll0Var.a1()) {
                    ll0Var.invalidate();
                    return;
                }
                return;
            case 11:
                im0 im0Var = (im0) this.f30015b;
                if (im0Var.f27215s != null) {
                    im0Var.j();
                    im0Var.f27215s.invalidate();
                    im0Var.f27198e.invalidate();
                    im0Var.invalidate();
                    im0Var.f27215s = null;
                    return;
                }
                return;
            case 12:
                ((mm0) this.f30015b).d = false;
                return;
            case 13:
                ((yn0) this.f30015b).M0.setVisibility(8);
                return;
            case 14:
                xo0 xo0Var = (xo0) this.f30015b;
                if (animator == xo0Var.h) {
                    xo0Var.h = null;
                    return;
                }
                return;
            case 15:
                ((gq0) this.f30015b).f26516e = null;
                return;
            case 16:
                oq0 oq0Var = (oq0) this.f30015b;
                if (oq0Var.getParent() != null) {
                    ((ViewGroup) oq0Var.getParent()).removeView(oq0Var);
                    return;
                }
                return;
            case 17:
                ss0 ss0Var = (ss0) this.f30015b;
                View view2 = ss0Var.f30437c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ss0Var.f30435a.removeView(view2);
                return;
            case 18:
                ev0 ev0Var = (ev0) this.f30015b;
                if (ev0Var.f25824f == animator) {
                    ev0Var.f25824f = null;
                    return;
                }
                return;
            case 19:
                vw0 vw0Var = (vw0) this.f30015b;
                vw0.x1(vw0Var, ((Float) vw0Var.f32035p3.getAnimatedValue()).floatValue());
                vw0Var.f32035p3 = null;
                return;
            case 20:
                ux0 ux0Var = (ux0) this.f30015b;
                ux0Var.f31045x.setVisibility(8);
                ux0Var.F.setImageDrawable(null);
                return;
            case 21:
                int i10 = 0;
                while (true) {
                    by0[] by0VarArr = (by0[]) this.f30015b;
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
                ((cy0) this.f30015b).H = null;
                return;
            case 23:
                ((fy0) this.f30015b).f26224e = false;
                return;
            case 24:
                ((m01) this.f30015b).setVisibility(4);
                return;
            case 25:
                ((x11) this.f30015b).setVisibility(8);
                return;
            case 26:
                bi.a4 a4Var = ((r21) this.f30015b).f29928f;
                a4Var.setScaleX(1.0f);
                a4Var.setScaleY(1.0f);
                a4Var.invalidate();
                return;
            case 27:
                v21 v21Var = (v21) this.f30015b;
                v21Var.K = 1.0f;
                v21Var.h.invalidate();
                return;
            case 28:
                ((d51) this.f30015b).L = null;
                return;
            default:
                UndoView undoView = (UndoView) this.f30015b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30014a) {
            case 12:
                mm0 mm0Var = (mm0) this.f30015b;
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
        this.f30014a = 17;
        this.f30015b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
