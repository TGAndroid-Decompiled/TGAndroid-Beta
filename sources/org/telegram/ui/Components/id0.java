package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class id0 extends AnimatorListenerAdapter {
    public final int f25102a;
    public final Object f25103b;

    public id0(Object obj, int i10) {
        this.f25102a = i10;
        this.f25103b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25102a) {
            case 4:
                ((dh0) this.f25103b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25102a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f25103b;
                numberTextView.d = null;
                numberTextView.f22315b.clear();
                return;
            case 1:
                fe0 fe0Var = (fe0) this.f25103b;
                fe0Var.setVisibility(8);
                fe0Var.h();
                fe0Var.P = 0.0f;
                fe0Var.f(0.0f);
                fe0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f25103b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                kf kfVar = (kf) this.f25103b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) kfVar.f25767c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) kfVar.f25767c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                ih0 ih0Var = (ih0) this.f25103b;
                ih0Var.f25127f = false;
                ih0Var.F = null;
                return;
            case 6:
                ((wi0) this.f25103b).b();
                return;
            case 7:
                ((dk0) this.f25103b).h.setVisibility(8);
                return;
            case 8:
                zl0 zl0Var = (zl0) this.f25103b;
                View view = zl0Var.f30989c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (zl0Var.c1()) {
                    zl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                xm0 xm0Var = (xm0) this.f25103b;
                if (xm0Var.f30378s != null) {
                    xm0Var.j();
                    xm0Var.f30378s.invalidate();
                    xm0Var.e.invalidate();
                    xm0Var.invalidate();
                    xm0Var.f30378s = null;
                    return;
                }
                return;
            case 10:
                ((bn0) this.f25103b).d = false;
                return;
            case 11:
                ((oo0) this.f25103b).M0.setVisibility(8);
                return;
            case 12:
                mp0 mp0Var = (mp0) this.f25103b;
                if (animator == mp0Var.h) {
                    mp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((wq0) this.f25103b).e = null;
                return;
            case 14:
                er0 er0Var = (er0) this.f25103b;
                if (er0Var.getParent() != null) {
                    ((ViewGroup) er0Var.getParent()).removeView(er0Var);
                    return;
                }
                return;
            case 15:
                ht0 ht0Var = (ht0) this.f25103b;
                View view2 = ht0Var.f24942c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ht0Var.f24940a.removeView(view2);
                return;
            case 16:
                tv0 tv0Var = (tv0) this.f25103b;
                if (tv0Var.f28667f == animator) {
                    tv0Var.f28667f = null;
                    return;
                }
                return;
            case 17:
                jx0 jx0Var = (jx0) this.f25103b;
                jx0.A1(jx0Var, ((Float) jx0Var.f25581w3.getAnimatedValue()).floatValue());
                jx0Var.f25581w3 = null;
                return;
            case 18:
                iy0 iy0Var = (iy0) this.f25103b;
                iy0Var.f25237x.setVisibility(8);
                iy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    py0[] py0VarArr = (py0[]) this.f25103b;
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
                ((qy0) this.f25103b).H = null;
                return;
            case 21:
                ((ty0) this.f25103b).e = false;
                return;
            case 22:
                ((d11) this.f25103b).setVisibility(4);
                return;
            case 23:
                ((o21) this.f25103b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((i31) this.f25103b).f25005f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                m31 m31Var = (m31) this.f25103b;
                m31Var.K = 1.0f;
                m31Var.h.invalidate();
                return;
            case 26:
                ((u51) this.f25103b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f25103b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                b71 b71Var = (b71) this.f25103b;
                if (b71Var.f22837a.getTag() == null) {
                    b71Var.f22837a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                c71 c71Var = (c71) this.f25103b;
                c71Var.f23181b = 0.0f;
                c71Var.setTranslationY(0.0f);
                c71Var.f23180a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25102a) {
            case 10:
                bn0 bn0Var = (bn0) this.f25103b;
                bn0Var.d = true;
                if (bn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) bn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public id0(ht0 ht0Var, s4.o0 o0Var) {
        this.f25102a = 15;
        this.f25103b = ht0Var;
    }

    private final void a(Animator animator) {
    }
}
