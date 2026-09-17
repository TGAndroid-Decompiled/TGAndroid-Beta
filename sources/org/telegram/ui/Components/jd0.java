package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f25225a;
    public final Object f25226b;

    public jd0(Object obj, int i10) {
        this.f25225a = i10;
        this.f25226b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25225a) {
            case 3:
                ((qg0) this.f25226b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25225a) {
            case 0:
                sd0 sd0Var = (sd0) this.f25226b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                return;
            case 1:
                AnimatorSet animatorSet = (AnimatorSet) this.f25226b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 2:
                ff ffVar = (ff) this.f25226b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) ffVar.f23903c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) ffVar.f23903c).e = null;
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                vg0 vg0Var = (vg0) this.f25226b;
                vg0Var.f28714f = false;
                vg0Var.F = null;
                return;
            case 5:
                ((ji0) this.f25226b).b();
                return;
            case 6:
                ((qj0) this.f25226b).h.setVisibility(8);
                return;
            case 7:
                ml0 ml0Var = (ml0) this.f25226b;
                View view = ml0Var.f26165c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ml0Var.c1()) {
                    ml0Var.invalidate();
                    return;
                }
                return;
            case 8:
                jm0 jm0Var = (jm0) this.f25226b;
                if (jm0Var.f25350s != null) {
                    jm0Var.j();
                    jm0Var.f25350s.invalidate();
                    jm0Var.e.invalidate();
                    jm0Var.invalidate();
                    jm0Var.f25350s = null;
                    return;
                }
                return;
            case 9:
                ((nm0) this.f25226b).d = false;
                return;
            case 10:
                ((zn0) this.f25226b).N0.setVisibility(8);
                return;
            case 11:
                xo0 xo0Var = (xo0) this.f25226b;
                if (animator == xo0Var.h) {
                    xo0Var.h = null;
                    return;
                }
                return;
            case 12:
                ((hq0) this.f25226b).e = null;
                return;
            case 13:
                pq0 pq0Var = (pq0) this.f25226b;
                if (pq0Var.getParent() != null) {
                    ((ViewGroup) pq0Var.getParent()).removeView(pq0Var);
                    return;
                }
                return;
            case 14:
                us0 us0Var = (us0) this.f25226b;
                View view2 = us0Var.f28482c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                us0Var.f28480a.removeView(view2);
                return;
            case 15:
                gv0 gv0Var = (gv0) this.f25226b;
                if (gv0Var.f24407f == animator) {
                    gv0Var.f24407f = null;
                    return;
                }
                return;
            case 16:
                xw0 xw0Var = (xw0) this.f25226b;
                xw0.z1(xw0Var, ((Float) xw0Var.f30015p3.getAnimatedValue()).floatValue());
                xw0Var.f30015p3 = null;
                return;
            case 17:
                wx0 wx0Var = (wx0) this.f25226b;
                wx0Var.f29792x.setVisibility(8);
                wx0Var.F.setImageDrawable(null);
                return;
            case 18:
                int i10 = 0;
                while (true) {
                    dy0[] dy0VarArr = (dy0[]) this.f25226b;
                    if (i10 < dy0VarArr.length) {
                        dy0 dy0Var = dy0VarArr[i10];
                        if (dy0Var != null) {
                            dy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 19:
                super.onAnimationEnd(animator);
                ((ey0) this.f25226b).H = null;
                return;
            case 20:
                ((hy0) this.f25226b).e = false;
                return;
            case 21:
                ((o01) this.f25226b).setVisibility(4);
                return;
            case 22:
                ((z11) this.f25226b).setVisibility(8);
                return;
            case 23:
                ai.n4 n4Var = ((t21) this.f25226b).f28002f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 24:
                x21 x21Var = (x21) this.f25226b;
                x21Var.K = 1.0f;
                x21Var.h.invalidate();
                return;
            case 25:
                ((f51) this.f25226b).L = null;
                return;
            case 26:
                UndoView undoView = (UndoView) this.f25226b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 27:
                m61 m61Var = (m61) this.f25226b;
                if (m61Var.f26089a.getTag() == null) {
                    m61Var.f26089a.setVisibility(4);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                n61 n61Var = (n61) this.f25226b;
                n61Var.f26349b = 0.0f;
                n61Var.setTranslationY(0.0f);
                n61Var.f26348a = null;
                return;
            default:
                i81 i81Var = (i81) this.f25226b;
                i81Var.J = false;
                i81Var.setEnabled(true);
                h81 h81Var = i81Var.f24896y;
                if (h81Var != null) {
                    ((ka.c) h81Var).h(1.0f);
                }
                i81Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25225a) {
            case 9:
                nm0 nm0Var = (nm0) this.f25226b;
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

    public jd0(us0 us0Var, s4.o0 o0Var) {
        this.f25225a = 14;
        this.f25226b = us0Var;
    }

    private final void a(Animator animator) {
    }
}
