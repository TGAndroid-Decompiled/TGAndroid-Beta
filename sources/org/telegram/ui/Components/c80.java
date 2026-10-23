package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class c80 extends AnimatorListenerAdapter {
    public final int f25126a;
    public final Object f25127b;

    public c80(Object obj, int i10) {
        this.f25126a = i10;
        this.f25127b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25126a) {
            case 9:
                ((lh0) this.f25127b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25126a) {
            case 0:
                i80 i80Var = (i80) this.f25127b;
                g80 g80Var = i80Var.f27193x;
                if (g80Var != null) {
                    g80Var.setProgress(1.0f);
                    i80Var.f27193x.invalidate();
                }
                i80Var.m0 = null;
                return;
            case 1:
                t00 t00Var = (t00) this.f25127b;
                ((r80) t00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                e90 e90Var = (e90) this.f25127b;
                if (!e90Var.f25861f) {
                    e90Var.f25860c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                m90 m90Var = (m90) this.f25127b;
                FrameLayout frameLayout = m90Var.f28461b;
                ei.g6 g6Var = (ei.g6) m90Var.f28462c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) m90Var.d);
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f25127b;
                ic0Var.f27241c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f25127b;
                numberTextView.d = null;
                numberTextView.f24254b.clear();
                return;
            case 6:
                me0 me0Var = (me0) this.f25127b;
                me0Var.S = null;
                me0Var.f28508r.setText("");
                ei.x8.a(me0Var.f28509s, false);
                me0Var.setVisibility(8);
                me0Var.f28496a0 = 0.0f;
                me0Var.h(0.0f);
                me0Var.setAlpha(0.0f);
                me0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f25127b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                hf hfVar = (hf) this.f25127b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.f26886c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.f26886c).e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                qh0 qh0Var = (qh0) this.f25127b;
                qh0Var.f29598f = false;
                qh0Var.F = null;
                return;
            case 11:
                ((fj0) this.f25127b).b();
                return;
            case 12:
                ((nk0) this.f25127b).h.setVisibility(8);
                return;
            case 13:
                jm0 jm0Var = (jm0) this.f25127b;
                View view = jm0Var.f27558a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (jm0Var.b1()) {
                    jm0Var.invalidate();
                    return;
                }
                return;
            case 14:
                hn0 hn0Var = (hn0) this.f25127b;
                if (hn0Var.f26950s != null) {
                    hn0Var.j();
                    hn0Var.f26950s.invalidate();
                    hn0Var.e.invalidate();
                    hn0Var.invalidate();
                    hn0Var.f26950s = null;
                    return;
                }
                return;
            case 15:
                ((ln0) this.f25127b).d = false;
                return;
            case 16:
                ((wo0) this.f25127b).M0.setVisibility(8);
                return;
            case 17:
                tp0 tp0Var = (tp0) this.f25127b;
                if (animator == tp0Var.h) {
                    tp0Var.h = null;
                    return;
                }
                return;
            case 18:
                ((er0) this.f25127b).f25961f = null;
                return;
            case 19:
                mr0 mr0Var = (mr0) this.f25127b;
                if (mr0Var.getParent() != null) {
                    ((ViewGroup) mr0Var.getParent()).removeView(mr0Var);
                    return;
                }
                return;
            case 20:
                pt0 pt0Var = (pt0) this.f25127b;
                View view2 = pt0Var.f29398c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                pt0Var.f29396a.removeView(view2);
                return;
            case 21:
                bw0 bw0Var = (bw0) this.f25127b;
                if (bw0Var.f25056f == animator) {
                    bw0Var.f25056f = null;
                    return;
                }
                return;
            case 22:
                rx0 rx0Var = (rx0) this.f25127b;
                rx0.z1(rx0Var, ((Float) rx0Var.f30051n3.getAnimatedValue()).floatValue());
                rx0Var.f30051n3 = null;
                return;
            case 23:
                qy0 qy0Var = (qy0) this.f25127b;
                qy0Var.f29774x.setVisibility(8);
                qy0Var.F.setImageDrawable(null);
                return;
            case 24:
                int i10 = 0;
                while (true) {
                    wy0[] wy0VarArr = (wy0[]) this.f25127b;
                    if (i10 < wy0VarArr.length) {
                        wy0 wy0Var = wy0VarArr[i10];
                        if (wy0Var != null) {
                            wy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((xy0) this.f25127b).H = null;
                return;
            case 26:
                ((az0) this.f25127b).e = false;
                return;
            case 27:
                ((m11) this.f25127b).setVisibility(4);
                return;
            case 28:
                ((v21) this.f25127b).setVisibility(8);
                return;
            default:
                ci.i3 i3Var = ((m31) this.f25127b).f28376f;
                i3Var.setScaleX(1.0f);
                i3Var.setScaleY(1.0f);
                i3Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25126a) {
            case 15:
                ln0 ln0Var = (ln0) this.f25127b;
                ln0Var.d = true;
                if (ln0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) ln0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public c80(pt0 pt0Var, s4.n0 n0Var) {
        this.f25126a = 20;
        this.f25127b = pt0Var;
    }

    private final void a(Animator animator) {
    }
}
