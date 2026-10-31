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
    public final int f30454a;
    public final Object f30455b;

    public t60(Object obj, int i10) {
        this.f30454a = i10;
        this.f30455b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30454a) {
            case 9:
                ((tf0) this.f30455b).f30557n1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30454a) {
            case 0:
                z60 z60Var = (z60) this.f30455b;
                x60 x60Var = z60Var.f32945x;
                if (x60Var != null) {
                    x60Var.setProgress(1.0f);
                    z60Var.f32945x.invalidate();
                }
                z60Var.m0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.f30455b;
                ((k70) u0Var.e).f27670x1 = false;
                TextView[] textViewArr = (TextView[]) u0Var.f23118b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                y70 y70Var = (y70) this.f30455b;
                if (!y70Var.f32651f) {
                    y70Var.f32650c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                f80 f80Var = (f80) this.f30455b;
                FrameLayout frameLayout = f80Var.f26010b;
                kg.f0 f0Var = (kg.f0) f80Var.f26011c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.l1) f80Var.d);
                return;
            case 4:
                ua0 ua0Var = (ua0) this.f30455b;
                ua0Var.f30881c0.h = null;
                ua0Var.f(ua0Var.S, ua0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f30455b;
                numberTextView.d = null;
                numberTextView.f24067b.clear();
                return;
            case 6:
                zc0 zc0Var = (zc0) this.f30455b;
                zc0Var.S = null;
                zc0Var.f33019r.setText("");
                uc0.a(zc0Var.f33020s, false);
                zc0Var.setVisibility(8);
                zc0Var.f33007a0 = 0.0f;
                zc0Var.h(0.0f);
                zc0Var.setAlpha(0.0f);
                zc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f30455b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                le leVar = (le) this.f30455b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((uc0) leVar.f28096c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((uc0) leVar.f28096c).e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                yf0 yf0Var = (yf0) this.f30455b;
                yf0Var.f32721f = false;
                yf0Var.F = null;
                return;
            case 11:
                ((mh0) this.f30455b).b();
                return;
            case 12:
                ((vi0) this.f30455b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f30455b).run();
                return;
            case 14:
                tk0 tk0Var = (tk0) this.f30455b;
                View view = tk0Var.f30600a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (tk0Var.b1()) {
                    tk0Var.invalidate();
                    return;
                }
                return;
            case 15:
                ul0 ul0Var = (ul0) this.f30455b;
                if (ul0Var.f30987s != null) {
                    ul0Var.j();
                    ul0Var.f30987s.invalidate();
                    ul0Var.e.invalidate();
                    ul0Var.invalidate();
                    ul0Var.f30987s = null;
                    return;
                }
                return;
            case 16:
                ((yl0) this.f30455b).d = false;
                return;
            case 17:
                ((gn0) this.f30455b).O0.setVisibility(8);
                return;
            case 18:
                do0 do0Var = (do0) this.f30455b;
                if (animator == do0Var.h) {
                    do0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((cp0) this.f30455b).f25129f = null;
                return;
            case 20:
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.f30455b;
                if (a5Var.getParent() != null) {
                    ((ViewGroup) a5Var.getParent()).removeView(a5Var);
                    return;
                }
                return;
            case 21:
                zr0 zr0Var = (zr0) this.f30455b;
                View view2 = zr0Var.f33157c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                zr0Var.f33155a.removeView(view2);
                return;
            case 22:
                lu0 lu0Var = (lu0) this.f30455b;
                if (lu0Var.f28200f == animator) {
                    lu0Var.f28200f = null;
                    return;
                }
                return;
            case 23:
                bw0 bw0Var = (bw0) this.f30455b;
                bw0.B1(bw0Var, ((Float) bw0Var.f24906w3.getAnimatedValue()).floatValue());
                bw0Var.f24906w3 = null;
                return;
            case 24:
                cx0 cx0Var = (cx0) this.f30455b;
                cx0Var.f25219t1.setVisibility(8);
                cx0Var.f25222w1.setImageDrawable(null);
                return;
            case 25:
                int i10 = 0;
                while (true) {
                    ix0[] ix0VarArr = (ix0[]) this.f30455b;
                    if (i10 < ix0VarArr.length) {
                        ix0 ix0Var = ix0VarArr[i10];
                        if (ix0Var != null) {
                            ix0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((jx0) this.f30455b).H = null;
                return;
            case 27:
                ((mx0) this.f30455b).e = false;
                return;
            case 28:
                ((xz0) this.f30455b).setVisibility(4);
                return;
            default:
                ((i11) this.f30455b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30454a) {
            case 16:
                yl0 yl0Var = (yl0) this.f30455b;
                yl0Var.d = true;
                if (yl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) yl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public t60(zr0 zr0Var, s4.n0 n0Var) {
        this.f30454a = 21;
        this.f30455b = zr0Var;
    }

    private final void a(Animator animator) {
    }
}
