package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class i10 extends AnimatorListenerAdapter {
    public final int f29173a;
    public final Object f29174b;

    public i10(Object obj, int i10) {
        this.f29173a = i10;
        this.f29174b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29173a) {
            case 11:
                ((oh0) this.f29174b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29173a) {
            case 0:
                j10 j10Var = (j10) this.f29174b;
                j10Var.v = 1.0f;
                j10Var.invalidate();
                return;
            case 1:
                o60 o60Var = (o60) this.f29174b;
                if (animator == o60Var.W) {
                    o60Var.c(true);
                    o60Var.setVisibility(4);
                    return;
                }
                return;
            case 2:
                l80 l80Var = (l80) this.f29174b;
                j80 j80Var = l80Var.f30172x;
                if (j80Var != null) {
                    j80Var.setProgress(1.0f);
                    l80Var.f30172x.invalidate();
                }
                l80Var.m0 = null;
                return;
            case 3:
                t00 t00Var = (t00) this.f29174b;
                ((u80) t00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 4:
                h90 h90Var = (h90) this.f29174b;
                if (!h90Var.f28918f) {
                    h90Var.f28917c.setVisibility(8);
                    return;
                }
                return;
            case 5:
                o90 o90Var = (o90) this.f29174b;
                FrameLayout frameLayout = o90Var.f31242b;
                fi.f6 f6Var = (fi.f6) o90Var.f31243c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ha) o90Var.d);
                return;
            case 6:
                ic0 ic0Var = (ic0) this.f29174b;
                ic0Var.f29306c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                return;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.f29174b;
                numberTextView.d = null;
                numberTextView.f26189b.clear();
                return;
            case 8:
                me0 me0Var = (me0) this.f29174b;
                me0Var.S = null;
                me0Var.f30526r.setText("");
                fi.t8.a(me0Var.f30527s, false);
                me0Var.setVisibility(8);
                me0Var.f30514a0 = 0.0f;
                me0Var.h(0.0f);
                me0Var.setAlpha(0.0f);
                me0Var.j();
                return;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.f29174b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 10:
                hf hfVar = (hf) this.f29174b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.t8) hfVar.f28985c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.t8) hfVar.f28985c).e = null;
                    return;
                }
                return;
            case 11:
                return;
            case 12:
                th0 th0Var = (th0) this.f29174b;
                th0Var.f32966f = false;
                th0Var.F = null;
                return;
            case 13:
                ((ij0) this.f29174b).b();
                return;
            case 14:
                ((qk0) this.f29174b).h.setVisibility(8);
                return;
            case 15:
                nm0 nm0Var = (nm0) this.f29174b;
                View view = nm0Var.f30963a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (nm0Var.b1()) {
                    nm0Var.invalidate();
                    return;
                }
                return;
            case 16:
                qn0 qn0Var = (qn0) this.f29174b;
                if (qn0Var.f31970s != null) {
                    qn0Var.j();
                    qn0Var.f31970s.invalidate();
                    qn0Var.e.invalidate();
                    qn0Var.invalidate();
                    qn0Var.f31970s = null;
                    return;
                }
                return;
            case 17:
                ((un0) this.f29174b).d = false;
                return;
            case 18:
                ((fp0) this.f29174b).O0.setVisibility(8);
                return;
            case 19:
                dq0 dq0Var = (dq0) this.f29174b;
                if (animator == dq0Var.h) {
                    dq0Var.h = null;
                    return;
                }
                return;
            case 20:
                ((mr0) this.f29174b).f30613f = null;
                return;
            case 21:
                tr0 tr0Var = (tr0) this.f29174b;
                if (tr0Var.getParent() != null) {
                    ((ViewGroup) tr0Var.getParent()).removeView(tr0Var);
                    return;
                }
                return;
            case 22:
                au0 au0Var = (au0) this.f29174b;
                View view2 = au0Var.f26667c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                au0Var.f26665a.removeView(view2);
                return;
            case 23:
                nw0 nw0Var = (nw0) this.f29174b;
                if (nw0Var.f31090f == animator) {
                    nw0Var.f31090f = null;
                    return;
                }
                return;
            case 24:
                cy0 cy0Var = (cy0) this.f29174b;
                cy0.E1(cy0Var, ((Float) cy0Var.f27293x3.getAnimatedValue()).floatValue());
                cy0Var.f27293x3 = null;
                return;
            case 25:
                dz0 dz0Var = (dz0) this.f29174b;
                dz0Var.f27606x.setVisibility(8);
                dz0Var.F.setImageDrawable(null);
                return;
            case 26:
                int i10 = 0;
                while (true) {
                    jz0[] jz0VarArr = (jz0[]) this.f29174b;
                    if (i10 < jz0VarArr.length) {
                        jz0 jz0Var = jz0VarArr[i10];
                        if (jz0Var != null) {
                            jz0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((kz0) this.f29174b).H = null;
                return;
            case 28:
                ((nz0) this.f29174b).e = false;
                return;
            default:
                ((y11) this.f29174b).setVisibility(4);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29173a) {
            case 17:
                un0 un0Var = (un0) this.f29174b;
                un0Var.d = true;
                if (un0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) un0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public i10(au0 au0Var, s4.p0 p0Var) {
        this.f29173a = 22;
        this.f29174b = au0Var;
    }

    private final void a(Animator animator) {
    }
}
