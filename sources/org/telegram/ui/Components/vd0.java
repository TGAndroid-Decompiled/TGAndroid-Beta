package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class vd0 extends AnimatorListenerAdapter {
    public final int f31760a;
    public final Object f31761b;

    public vd0(Object obj, int i10) {
        this.f31760a = i10;
        this.f31761b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31760a) {
            case 4:
                ((sh0) this.f31761b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31760a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f31761b;
                numberTextView.d = null;
                numberTextView.f24201b.clear();
                return;
            case 1:
                te0 te0Var = (te0) this.f31761b;
                te0Var.O = null;
                te0Var.f31168r.setText("");
                ci.j9.a(te0Var.f31169s, false);
                te0Var.setVisibility(8);
                te0Var.T = 0.0f;
                te0Var.g(0.0f);
                te0Var.setAlpha(0.0f);
                te0Var.i();
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f31761b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                lf lfVar = (lf) this.f31761b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) lfVar.f28449c).f5289e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) lfVar.f28449c).f5289e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                xh0 xh0Var = (xh0) this.f31761b;
                xh0Var.f32868f = false;
                xh0Var.F = null;
                return;
            case 6:
                ((nj0) this.f31761b).b();
                return;
            case 7:
                ((uk0) this.f31761b).h.setVisibility(8);
                return;
            case 8:
                qm0 qm0Var = (qm0) this.f31761b;
                View view = qm0Var.f30191a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (qm0Var.b1()) {
                    qm0Var.invalidate();
                    return;
                }
                return;
            case 9:
                on0 on0Var = (on0) this.f31761b;
                if (on0Var.f29542s != null) {
                    on0Var.j();
                    on0Var.f29542s.invalidate();
                    on0Var.f29525e.invalidate();
                    on0Var.invalidate();
                    on0Var.f29542s = null;
                    return;
                }
                return;
            case 10:
                ((sn0) this.f31761b).d = false;
                return;
            case 11:
                ((dp0) this.f31761b).M0.setVisibility(8);
                return;
            case 12:
                bq0 bq0Var = (bq0) this.f31761b;
                if (animator == bq0Var.h) {
                    bq0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((lr0) this.f31761b).f28577f = null;
                return;
            case 14:
                tr0 tr0Var = (tr0) this.f31761b;
                if (tr0Var.getParent() != null) {
                    ((ViewGroup) tr0Var.getParent()).removeView(tr0Var);
                    return;
                }
                return;
            case 15:
                wt0 wt0Var = (wt0) this.f31761b;
                View view2 = wt0Var.f32675c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                wt0Var.f32673a.removeView(view2);
                return;
            case 16:
                iw0 iw0Var = (iw0) this.f31761b;
                if (iw0Var.f27509f == animator) {
                    iw0Var.f27509f = null;
                    return;
                }
                return;
            case 17:
                yx0 yx0Var = (yx0) this.f31761b;
                yx0.z1(yx0Var, ((Float) yx0Var.f33395n3.getAnimatedValue()).floatValue());
                yx0Var.f33395n3 = null;
                return;
            case 18:
                xy0 xy0Var = (xy0) this.f31761b;
                xy0Var.f33049x.setVisibility(8);
                xy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    dz0[] dz0VarArr = (dz0[]) this.f31761b;
                    if (i10 < dz0VarArr.length) {
                        dz0 dz0Var = dz0VarArr[i10];
                        if (dz0Var != null) {
                            dz0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((ez0) this.f31761b).H = null;
                return;
            case 21:
                ((hz0) this.f31761b).f27162e = false;
                return;
            case 22:
                ((s11) this.f31761b).setVisibility(4);
                return;
            case 23:
                ((d31) this.f31761b).setVisibility(8);
                return;
            case 24:
                ai.o4 o4Var = ((x31) this.f31761b).f32737f;
                o4Var.setScaleX(1.0f);
                o4Var.setScaleY(1.0f);
                o4Var.invalidate();
                return;
            case 25:
                b41 b41Var = (b41) this.f31761b;
                b41Var.K = 1.0f;
                b41Var.h.invalidate();
                return;
            case 26:
                ((l61) this.f31761b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f31761b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                q71 q71Var = (q71) this.f31761b;
                if (q71Var.f30097a.getTag() == null) {
                    q71Var.f30097a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                r71 r71Var = (r71) this.f31761b;
                r71Var.f30379b = 0.0f;
                r71Var.setTranslationY(0.0f);
                r71Var.f30378a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31760a) {
            case 10:
                sn0 sn0Var = (sn0) this.f31761b;
                sn0Var.d = true;
                if (sn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) sn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vd0(wt0 wt0Var, s4.p0 p0Var) {
        this.f31760a = 15;
        this.f31761b = wt0Var;
    }

    private final void a(Animator animator) {
    }
}
