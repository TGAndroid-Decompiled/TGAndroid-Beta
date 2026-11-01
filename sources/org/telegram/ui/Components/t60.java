package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class t60 extends AnimatorListenerAdapter {
    public final int f30539a;
    public final Object f30540b;

    public t60(Object obj, int i10) {
        this.f30539a = i10;
        this.f30540b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30539a) {
            case 9:
                ((tf0) this.f30540b).f30639n1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30539a) {
            case 0:
                z60 z60Var = (z60) this.f30540b;
                x60 x60Var = z60Var.f33048x;
                if (x60Var != null) {
                    x60Var.setProgress(1.0f);
                    z60Var.f33048x.invalidate();
                }
                z60Var.m0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.f30540b;
                ((k70) u0Var.e).f27756x1 = false;
                TextView[] textViewArr = (TextView[]) u0Var.f23119b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                y70 y70Var = (y70) this.f30540b;
                if (!y70Var.f32757f) {
                    y70Var.f32756c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                f80 f80Var = (f80) this.f30540b;
                FrameLayout frameLayout = f80Var.f26109b;
                kg.f0 f0Var = (kg.f0) f80Var.f26110c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.l1) f80Var.d);
                return;
            case 4:
                ua0 ua0Var = (ua0) this.f30540b;
                ua0Var.f30915c0.h = null;
                ua0Var.f(ua0Var.S, ua0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f30540b;
                numberTextView.d = null;
                numberTextView.f24068b.clear();
                return;
            case 6:
                zc0 zc0Var = (zc0) this.f30540b;
                zc0Var.S = null;
                zc0Var.f33115r.setText("");
                uc0.a(zc0Var.f33116s, false);
                zc0Var.setVisibility(8);
                zc0Var.f33103a0 = 0.0f;
                zc0Var.h(0.0f);
                zc0Var.setAlpha(0.0f);
                zc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f30540b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                le leVar = (le) this.f30540b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((uc0) leVar.f28140c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((uc0) leVar.f28140c).e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                yf0 yf0Var = (yf0) this.f30540b;
                yf0Var.f32837f = false;
                yf0Var.F = null;
                return;
            case 11:
                ((nh0) this.f30540b).b();
                return;
            case 12:
                ((wi0) this.f30540b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f30540b).run();
                return;
            case 14:
                uk0 uk0Var = (uk0) this.f30540b;
                View view = uk0Var.f30983a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (uk0Var.b1()) {
                    uk0Var.invalidate();
                    return;
                }
                return;
            case 15:
                vl0 vl0Var = (vl0) this.f30540b;
                if (vl0Var.f31339s != null) {
                    vl0Var.j();
                    vl0Var.f31339s.invalidate();
                    vl0Var.e.invalidate();
                    vl0Var.invalidate();
                    vl0Var.f31339s = null;
                    return;
                }
                return;
            case 16:
                ((zl0) this.f30540b).d = false;
                return;
            case 17:
                ((hn0) this.f30540b).O0.setVisibility(8);
                return;
            case 18:
                eo0 eo0Var = (eo0) this.f30540b;
                if (animator == eo0Var.h) {
                    eo0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((dp0) this.f30540b).f25559f = null;
                return;
            case 20:
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.f30540b;
                if (a5Var.getParent() != null) {
                    ((ViewGroup) a5Var.getParent()).removeView(a5Var);
                    return;
                }
                return;
            case 21:
                as0 as0Var = (as0) this.f30540b;
                View view2 = as0Var.f24485c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                as0Var.f24483a.removeView(view2);
                return;
            case 22:
                mu0 mu0Var = (mu0) this.f30540b;
                if (mu0Var.f28572f == animator) {
                    mu0Var.f28572f = null;
                    return;
                }
                return;
            case 23:
                cw0 cw0Var = (cw0) this.f30540b;
                cw0.B1(cw0Var, ((Float) cw0Var.f25281w3.getAnimatedValue()).floatValue());
                cw0Var.f25281w3 = null;
                return;
            case 24:
                dx0 dx0Var = (dx0) this.f30540b;
                dx0Var.f25632t1.setVisibility(8);
                dx0Var.f25635w1.setImageDrawable(null);
                return;
            case 25:
                int i10 = 0;
                while (true) {
                    jx0[] jx0VarArr = (jx0[]) this.f30540b;
                    if (i10 < jx0VarArr.length) {
                        jx0 jx0Var = jx0VarArr[i10];
                        if (jx0Var != null) {
                            jx0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((kx0) this.f30540b).H = null;
                return;
            case 27:
                ((nx0) this.f30540b).e = false;
                return;
            case 28:
                ((yz0) this.f30540b).setVisibility(4);
                return;
            default:
                ((j11) this.f30540b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30539a) {
            case 16:
                zl0 zl0Var = (zl0) this.f30540b;
                zl0Var.d = true;
                if (zl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) zl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public t60(as0 as0Var, s4.n0 n0Var) {
        this.f30539a = 21;
        this.f30540b = as0Var;
    }

    private final void a(Animator animator) {
    }
}
