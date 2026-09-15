package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f25303a;
    public final Object f25304b;

    public jd0(Object obj, int i10) {
        this.f25303a = i10;
        this.f25304b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25303a) {
            case 3:
                ((pg0) this.f25304b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25303a) {
            case 0:
                sd0 sd0Var = (sd0) this.f25304b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                return;
            case 1:
                AnimatorSet animatorSet = (AnimatorSet) this.f25304b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 2:
                ff ffVar = (ff) this.f25304b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) ffVar.f23924c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) ffVar.f23924c).e = null;
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ug0 ug0Var = (ug0) this.f25304b;
                ug0Var.f28400f = false;
                ug0Var.F = null;
                return;
            case 5:
                ((ii0) this.f25304b).b();
                return;
            case 6:
                ((pj0) this.f25304b).h.setVisibility(8);
                return;
            case 7:
                ll0 ll0Var = (ll0) this.f25304b;
                View view = ll0Var.f25940c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ll0Var.b1()) {
                    ll0Var.invalidate();
                    return;
                }
                return;
            case 8:
                im0 im0Var = (im0) this.f25304b;
                if (im0Var.f25077s != null) {
                    im0Var.j();
                    im0Var.f25077s.invalidate();
                    im0Var.e.invalidate();
                    im0Var.invalidate();
                    im0Var.f25077s = null;
                    return;
                }
                return;
            case 9:
                ((mm0) this.f25304b).d = false;
                return;
            case 10:
                ((yn0) this.f25304b).M0.setVisibility(8);
                return;
            case 11:
                wo0 wo0Var = (wo0) this.f25304b;
                if (animator == wo0Var.h) {
                    wo0Var.h = null;
                    return;
                }
                return;
            case 12:
                ((gq0) this.f25304b).e = null;
                return;
            case 13:
                oq0 oq0Var = (oq0) this.f25304b;
                if (oq0Var.getParent() != null) {
                    ((ViewGroup) oq0Var.getParent()).removeView(oq0Var);
                    return;
                }
                return;
            case 14:
                ts0 ts0Var = (ts0) this.f25304b;
                View view2 = ts0Var.f28183c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ts0Var.f28181a.removeView(view2);
                return;
            case 15:
                fv0 fv0Var = (fv0) this.f25304b;
                if (fv0Var.f24099f == animator) {
                    fv0Var.f24099f = null;
                    return;
                }
                return;
            case 16:
                ww0 ww0Var = (ww0) this.f25304b;
                ww0.y1(ww0Var, ((Float) ww0Var.f29814p3.getAnimatedValue()).floatValue());
                ww0Var.f29814p3 = null;
                return;
            case 17:
                vx0 vx0Var = (vx0) this.f25304b;
                vx0Var.f29480x.setVisibility(8);
                vx0Var.F.setImageDrawable(null);
                return;
            case 18:
                int i10 = 0;
                while (true) {
                    cy0[] cy0VarArr = (cy0[]) this.f25304b;
                    if (i10 < cy0VarArr.length) {
                        cy0 cy0Var = cy0VarArr[i10];
                        if (cy0Var != null) {
                            cy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 19:
                super.onAnimationEnd(animator);
                ((dy0) this.f25304b).H = null;
                return;
            case 20:
                ((gy0) this.f25304b).e = false;
                return;
            case 21:
                ((n01) this.f25304b).setVisibility(4);
                return;
            case 22:
                ((y11) this.f25304b).setVisibility(8);
                return;
            case 23:
                ai.n4 n4Var = ((s21) this.f25304b).f27757f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 24:
                w21 w21Var = (w21) this.f25304b;
                w21Var.K = 1.0f;
                w21Var.h.invalidate();
                return;
            case 25:
                ((e51) this.f25304b).L = null;
                return;
            case 26:
                UndoView undoView = (UndoView) this.f25304b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 27:
                l61 l61Var = (l61) this.f25304b;
                if (l61Var.f25841a.getTag() == null) {
                    l61Var.f25841a.setVisibility(4);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                m61 m61Var = (m61) this.f25304b;
                m61Var.f26109b = 0.0f;
                m61Var.setTranslationY(0.0f);
                m61Var.f26108a = null;
                return;
            default:
                h81 h81Var = (h81) this.f25304b;
                h81Var.J = false;
                h81Var.setEnabled(true);
                g81 g81Var = h81Var.f24614y;
                if (g81Var != null) {
                    ((ka.c) g81Var).h(1.0f);
                }
                h81Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25303a) {
            case 9:
                mm0 mm0Var = (mm0) this.f25304b;
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

    public jd0(ts0 ts0Var, s4.o0 o0Var) {
        this.f25303a = 14;
        this.f25304b = ts0Var;
    }

    private final void a(Animator animator) {
    }
}
