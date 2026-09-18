package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class ed0 extends AnimatorListenerAdapter {
    public final int f23857a;
    public final Object f23858b;

    public ed0(Object obj, int i10) {
        this.f23857a = i10;
        this.f23858b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23857a) {
            case 4:
                ((ah0) this.f23858b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23857a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f23858b;
                numberTextView.d = null;
                numberTextView.f22257b.clear();
                return;
            case 1:
                be0 be0Var = (be0) this.f23858b;
                be0Var.setVisibility(8);
                be0Var.h();
                be0Var.P = 0.0f;
                be0Var.f(0.0f);
                be0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f23858b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                hf hfVar = (hf) this.f23858b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) hfVar.f24662c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) hfVar.f24662c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                fh0 fh0Var = (fh0) this.f23858b;
                fh0Var.f24164f = false;
                fh0Var.F = null;
                return;
            case 6:
                ((ti0) this.f23858b).b();
                return;
            case 7:
                ((ak0) this.f23858b).h.setVisibility(8);
                return;
            case 8:
                wl0 wl0Var = (wl0) this.f23858b;
                View view = wl0Var.f30064c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (wl0Var.c1()) {
                    wl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                vm0 vm0Var = (vm0) this.f23858b;
                if (vm0Var.f29131s != null) {
                    vm0Var.j();
                    vm0Var.f29131s.invalidate();
                    vm0Var.e.invalidate();
                    vm0Var.invalidate();
                    vm0Var.f29131s = null;
                    return;
                }
                return;
            case 10:
                ((zm0) this.f23858b).d = false;
                return;
            case 11:
                ((lo0) this.f23858b).N0.setVisibility(8);
                return;
            case 12:
                kp0 kp0Var = (kp0) this.f23858b;
                if (animator == kp0Var.h) {
                    kp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((uq0) this.f23858b).e = null;
                return;
            case 14:
                cr0 cr0Var = (cr0) this.f23858b;
                if (cr0Var.getParent() != null) {
                    ((ViewGroup) cr0Var.getParent()).removeView(cr0Var);
                    return;
                }
                return;
            case 15:
                ft0 ft0Var = (ft0) this.f23858b;
                View view2 = ft0Var.f24233c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ft0Var.f24231a.removeView(view2);
                return;
            case 16:
                rv0 rv0Var = (rv0) this.f23858b;
                if (rv0Var.f27978f == animator) {
                    rv0Var.f27978f = null;
                    return;
                }
                return;
            case 17:
                ix0 ix0Var = (ix0) this.f23858b;
                ix0.z1(ix0Var, ((Float) ix0Var.f25079p3.getAnimatedValue()).floatValue());
                ix0Var.f25079p3 = null;
                return;
            case 18:
                hy0 hy0Var = (hy0) this.f23858b;
                hy0Var.f24778x.setVisibility(8);
                hy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    oy0[] oy0VarArr = (oy0[]) this.f23858b;
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
                ((py0) this.f23858b).H = null;
                return;
            case 21:
                ((sy0) this.f23858b).e = false;
                return;
            case 22:
                ((c11) this.f23858b).setVisibility(4);
                return;
            case 23:
                ((n21) this.f23858b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((h31) this.f23858b).f24541f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                l31 l31Var = (l31) this.f23858b;
                l31Var.K = 1.0f;
                l31Var.h.invalidate();
                return;
            case 26:
                ((t51) this.f23858b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f23858b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                a71 a71Var = (a71) this.f23858b;
                if (a71Var.f22556a.getTag() == null) {
                    a71Var.f22556a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                b71 b71Var = (b71) this.f23858b;
                b71Var.f22875b = 0.0f;
                b71Var.setTranslationY(0.0f);
                b71Var.f22874a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23857a) {
            case 10:
                zm0 zm0Var = (zm0) this.f23858b;
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

    public ed0(ft0 ft0Var, s4.o0 o0Var) {
        this.f23857a = 15;
        this.f23858b = ft0Var;
    }

    private final void a(Animator animator) {
    }
}
