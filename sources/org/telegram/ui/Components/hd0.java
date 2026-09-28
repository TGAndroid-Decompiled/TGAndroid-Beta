package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class hd0 extends AnimatorListenerAdapter {
    public final int f24803a;
    public final Object f24804b;

    public hd0(Object obj, int i10) {
        this.f24803a = i10;
        this.f24804b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24803a) {
            case 4:
                ((ch0) this.f24804b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24803a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f24804b;
                numberTextView.d = null;
                numberTextView.f22294b.clear();
                return;
            case 1:
                ee0 ee0Var = (ee0) this.f24804b;
                ee0Var.setVisibility(8);
                ee0Var.h();
                ee0Var.P = 0.0f;
                ee0Var.f(0.0f);
                ee0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f24804b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                jf jfVar = (jf) this.f24804b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) jfVar.f25460c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) jfVar.f25460c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                hh0 hh0Var = (hh0) this.f24804b;
                hh0Var.f24831f = false;
                hh0Var.F = null;
                return;
            case 6:
                ((vi0) this.f24804b).b();
                return;
            case 7:
                ((ck0) this.f24804b).h.setVisibility(8);
                return;
            case 8:
                yl0 yl0Var = (yl0) this.f24804b;
                View view = yl0Var.f30679c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (yl0Var.b1()) {
                    yl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                wm0 wm0Var = (wm0) this.f24804b;
                if (wm0Var.f30051s != null) {
                    wm0Var.j();
                    wm0Var.f30051s.invalidate();
                    wm0Var.e.invalidate();
                    wm0Var.invalidate();
                    wm0Var.f30051s = null;
                    return;
                }
                return;
            case 10:
                ((an0) this.f24804b).d = false;
                return;
            case 11:
                ((no0) this.f24804b).M0.setVisibility(8);
                return;
            case 12:
                lp0 lp0Var = (lp0) this.f24804b;
                if (animator == lp0Var.h) {
                    lp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((vq0) this.f24804b).e = null;
                return;
            case 14:
                dr0 dr0Var = (dr0) this.f24804b;
                if (dr0Var.getParent() != null) {
                    ((ViewGroup) dr0Var.getParent()).removeView(dr0Var);
                    return;
                }
                return;
            case 15:
                gt0 gt0Var = (gt0) this.f24804b;
                View view2 = gt0Var.f24627c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                gt0Var.f24625a.removeView(view2);
                return;
            case 16:
                sv0 sv0Var = (sv0) this.f24804b;
                if (sv0Var.f28380f == animator) {
                    sv0Var.f28380f = null;
                    return;
                }
                return;
            case 17:
                ix0 ix0Var = (ix0) this.f24804b;
                ix0.y1(ix0Var, ((Float) ix0Var.f25240p3.getAnimatedValue()).floatValue());
                ix0Var.f25240p3 = null;
                return;
            case 18:
                hy0 hy0Var = (hy0) this.f24804b;
                hy0Var.f24943x.setVisibility(8);
                hy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    oy0[] oy0VarArr = (oy0[]) this.f24804b;
                    if (i10 < oy0VarArr.length) {
                        oy0 oy0Var = oy0VarArr[i10];
                        if (oy0Var != null) {
                            oy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((py0) this.f24804b).H = null;
                return;
            case 21:
                ((sy0) this.f24804b).e = false;
                return;
            case 22:
                ((c11) this.f24804b).setVisibility(4);
                return;
            case 23:
                ((n21) this.f24804b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((h31) this.f24804b).f24685f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                l31 l31Var = (l31) this.f24804b;
                l31Var.K = 1.0f;
                l31Var.h.invalidate();
                return;
            case 26:
                ((t51) this.f24804b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f24804b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                a71 a71Var = (a71) this.f24804b;
                if (a71Var.f22568a.getTag() == null) {
                    a71Var.f22568a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                b71 b71Var = (b71) this.f24804b;
                b71Var.f22885b = 0.0f;
                b71Var.setTranslationY(0.0f);
                b71Var.f22884a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24803a) {
            case 10:
                an0 an0Var = (an0) this.f24804b;
                an0Var.d = true;
                if (an0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) an0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public hd0(gt0 gt0Var, s4.o0 o0Var) {
        this.f24803a = 15;
        this.f24804b = gt0Var;
    }

    private final void a(Animator animator) {
    }
}
