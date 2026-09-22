package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class gd0 extends AnimatorListenerAdapter {
    public final int f24505a;
    public final Object f24506b;

    public gd0(Object obj, int i10) {
        this.f24505a = i10;
        this.f24506b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24505a) {
            case 4:
                ((ch0) this.f24506b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24505a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f24506b;
                numberTextView.d = null;
                numberTextView.f22308b.clear();
                return;
            case 1:
                de0 de0Var = (de0) this.f24506b;
                de0Var.setVisibility(8);
                de0Var.h();
                de0Var.P = 0.0f;
                de0Var.f(0.0f);
                de0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f24506b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                hf hfVar = (hf) this.f24506b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) hfVar.f24811c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) hfVar.f24811c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                hh0 hh0Var = (hh0) this.f24506b;
                hh0Var.f24830f = false;
                hh0Var.F = null;
                return;
            case 6:
                ((vi0) this.f24506b).b();
                return;
            case 7:
                ((ck0) this.f24506b).h.setVisibility(8);
                return;
            case 8:
                yl0 yl0Var = (yl0) this.f24506b;
                View view = yl0Var.f30678c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (yl0Var.c1()) {
                    yl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                wm0 wm0Var = (wm0) this.f24506b;
                if (wm0Var.f30067s != null) {
                    wm0Var.j();
                    wm0Var.f30067s.invalidate();
                    wm0Var.e.invalidate();
                    wm0Var.invalidate();
                    wm0Var.f30067s = null;
                    return;
                }
                return;
            case 10:
                ((an0) this.f24506b).d = false;
                return;
            case 11:
                ((no0) this.f24506b).N0.setVisibility(8);
                return;
            case 12:
                lp0 lp0Var = (lp0) this.f24506b;
                if (animator == lp0Var.h) {
                    lp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((vq0) this.f24506b).e = null;
                return;
            case 14:
                dr0 dr0Var = (dr0) this.f24506b;
                if (dr0Var.getParent() != null) {
                    ((ViewGroup) dr0Var.getParent()).removeView(dr0Var);
                    return;
                }
                return;
            case 15:
                gt0 gt0Var = (gt0) this.f24506b;
                View view2 = gt0Var.f24621c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                gt0Var.f24619a.removeView(view2);
                return;
            case 16:
                sv0 sv0Var = (sv0) this.f24506b;
                if (sv0Var.f28325f == animator) {
                    sv0Var.f28325f = null;
                    return;
                }
                return;
            case 17:
                jx0 jx0Var = (jx0) this.f24506b;
                jx0.z1(jx0Var, ((Float) jx0Var.f25505p3.getAnimatedValue()).floatValue());
                jx0Var.f25505p3 = null;
                return;
            case 18:
                iy0 iy0Var = (iy0) this.f24506b;
                iy0Var.f25222x.setVisibility(8);
                iy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    py0[] py0VarArr = (py0[]) this.f24506b;
                    if (i10 < py0VarArr.length) {
                        py0 py0Var = py0VarArr[i10];
                        if (py0Var != null) {
                            py0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((qy0) this.f24506b).H = null;
                return;
            case 21:
                ((ty0) this.f24506b).e = false;
                return;
            case 22:
                ((d11) this.f24506b).setVisibility(4);
                return;
            case 23:
                ((o21) this.f24506b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((i31) this.f24506b).f24955f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                m31 m31Var = (m31) this.f24506b;
                m31Var.K = 1.0f;
                m31Var.h.invalidate();
                return;
            case 26:
                ((u51) this.f24506b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f24506b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                b71 b71Var = (b71) this.f24506b;
                if (b71Var.f22910a.getTag() == null) {
                    b71Var.f22910a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                c71 c71Var = (c71) this.f24506b;
                c71Var.f23289b = 0.0f;
                c71Var.setTranslationY(0.0f);
                c71Var.f23288a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24505a) {
            case 10:
                an0 an0Var = (an0) this.f24506b;
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

    public gd0(gt0 gt0Var, s4.o0 o0Var) {
        this.f24505a = 15;
        this.f24506b = gt0Var;
    }

    private final void a(Animator animator) {
    }
}
