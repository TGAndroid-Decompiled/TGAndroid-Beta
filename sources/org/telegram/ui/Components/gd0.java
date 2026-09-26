package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class gd0 extends AnimatorListenerAdapter {
    public final int f24473a;
    public final Object f24474b;

    public gd0(Object obj, int i10) {
        this.f24473a = i10;
        this.f24474b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24473a) {
            case 4:
                ((bh0) this.f24474b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24473a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f24474b;
                numberTextView.d = null;
                numberTextView.f22293b.clear();
                return;
            case 1:
                de0 de0Var = (de0) this.f24474b;
                de0Var.setVisibility(8);
                de0Var.h();
                de0Var.P = 0.0f;
                de0Var.f(0.0f);
                de0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f24474b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                jf jfVar = (jf) this.f24474b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) jfVar.f25392c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) jfVar.f25392c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                gh0 gh0Var = (gh0) this.f24474b;
                gh0Var.f24504f = false;
                gh0Var.F = null;
                return;
            case 6:
                ((ui0) this.f24474b).b();
                return;
            case 7:
                ((bk0) this.f24474b).h.setVisibility(8);
                return;
            case 8:
                xl0 xl0Var = (xl0) this.f24474b;
                View view = xl0Var.f30373c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (xl0Var.b1()) {
                    xl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                vm0 vm0Var = (vm0) this.f24474b;
                if (vm0Var.f29147s != null) {
                    vm0Var.j();
                    vm0Var.f29147s.invalidate();
                    vm0Var.e.invalidate();
                    vm0Var.invalidate();
                    vm0Var.f29147s = null;
                    return;
                }
                return;
            case 10:
                ((zm0) this.f24474b).d = false;
                return;
            case 11:
                ((mo0) this.f24474b).M0.setVisibility(8);
                return;
            case 12:
                kp0 kp0Var = (kp0) this.f24474b;
                if (animator == kp0Var.h) {
                    kp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((uq0) this.f24474b).e = null;
                return;
            case 14:
                cr0 cr0Var = (cr0) this.f24474b;
                if (cr0Var.getParent() != null) {
                    ((ViewGroup) cr0Var.getParent()).removeView(cr0Var);
                    return;
                }
                return;
            case 15:
                ft0 ft0Var = (ft0) this.f24474b;
                View view2 = ft0Var.f24315c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ft0Var.f24313a.removeView(view2);
                return;
            case 16:
                rv0 rv0Var = (rv0) this.f24474b;
                if (rv0Var.f28073f == animator) {
                    rv0Var.f28073f = null;
                    return;
                }
                return;
            case 17:
                hx0 hx0Var = (hx0) this.f24474b;
                hx0.y1(hx0Var, ((Float) hx0Var.f24899p3.getAnimatedValue()).floatValue());
                hx0Var.f24899p3 = null;
                return;
            case 18:
                gy0 gy0Var = (gy0) this.f24474b;
                gy0Var.f24624x.setVisibility(8);
                gy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    ny0[] ny0VarArr = (ny0[]) this.f24474b;
                    if (i10 < ny0VarArr.length) {
                        ny0 ny0Var = ny0VarArr[i10];
                        if (ny0Var != null) {
                            ny0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((oy0) this.f24474b).H = null;
                return;
            case 21:
                ((ry0) this.f24474b).e = false;
                return;
            case 22:
                ((b11) this.f24474b).setVisibility(4);
                return;
            case 23:
                ((m21) this.f24474b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((g31) this.f24474b).f24391f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                k31 k31Var = (k31) this.f24474b;
                k31Var.K = 1.0f;
                k31Var.h.invalidate();
                return;
            case 26:
                ((s51) this.f24474b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f24474b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                z61 z61Var = (z61) this.f24474b;
                if (z61Var.f30805a.getTag() == null) {
                    z61Var.f30805a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                a71 a71Var = (a71) this.f24474b;
                a71Var.f22558b = 0.0f;
                a71Var.setTranslationY(0.0f);
                a71Var.f22557a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24473a) {
            case 10:
                zm0 zm0Var = (zm0) this.f24474b;
                zm0Var.d = true;
                if (zm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) zm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public gd0(ft0 ft0Var, s4.o0 o0Var) {
        this.f24473a = 15;
        this.f24474b = ft0Var;
    }

    private final void a(Animator animator) {
    }
}
