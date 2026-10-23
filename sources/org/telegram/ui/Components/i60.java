package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class i60 extends AnimatorListenerAdapter {
    public final int f27217a;
    public final Object f27218b;

    public i60(Object obj, int i10) {
        this.f27217a = i10;
        this.f27218b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27217a) {
            case 10:
                ((oh0) this.f27218b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27217a) {
            case 0:
                m60 m60Var = (m60) this.f27218b;
                if (animator == m60Var.W) {
                    m60Var.c(true);
                    m60Var.setVisibility(4);
                    return;
                }
                return;
            case 1:
                j80 j80Var = (j80) this.f27218b;
                h80 h80Var = j80Var.f27584x;
                if (h80Var != null) {
                    h80Var.setProgress(1.0f);
                    j80Var.f27584x.invalidate();
                }
                j80Var.m0 = null;
                return;
            case 2:
                t00 t00Var = (t00) this.f27218b;
                ((s80) t00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 3:
                f90 f90Var = (f90) this.f27218b;
                if (!f90Var.f26237f) {
                    f90Var.f26236c.setVisibility(8);
                    return;
                }
                return;
            case 4:
                n90 n90Var = (n90) this.f27218b;
                FrameLayout frameLayout = n90Var.f28903b;
                ei.g6 g6Var = (ei.g6) n90Var.f28904c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) n90Var.d);
                return;
            case 5:
                lc0 lc0Var = (lc0) this.f27218b;
                lc0Var.f28340c0.h = null;
                lc0Var.f(lc0Var.S, lc0Var.R);
                return;
            case 6:
                NumberTextView numberTextView = (NumberTextView) this.f27218b;
                numberTextView.d = null;
                numberTextView.f24394b.clear();
                return;
            case 7:
                pe0 pe0Var = (pe0) this.f27218b;
                pe0Var.S = null;
                pe0Var.f29538r.setText("");
                ei.x8.a(pe0Var.f29539s, false);
                pe0Var.setVisibility(8);
                pe0Var.f29526a0 = 0.0f;
                pe0Var.h(0.0f);
                pe0Var.setAlpha(0.0f);
                pe0Var.j();
                return;
            case 8:
                AnimatorSet animatorSet = (AnimatorSet) this.f27218b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 9:
                hf hfVar = (hf) this.f27218b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.f26912c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.f26912c).e = null;
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                th0 th0Var = (th0) this.f27218b;
                th0Var.f30706f = false;
                th0Var.F = null;
                return;
            case 12:
                ((ij0) this.f27218b).b();
                return;
            case 13:
                ((qk0) this.f27218b).h.setVisibility(8);
                return;
            case 14:
                mm0 mm0Var = (mm0) this.f27218b;
                View view = mm0Var.f28680a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.c1()) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 15:
                kn0 kn0Var = (kn0) this.f27218b;
                if (kn0Var.f28091s != null) {
                    kn0Var.j();
                    kn0Var.f28091s.invalidate();
                    kn0Var.e.invalidate();
                    kn0Var.invalidate();
                    kn0Var.f28091s = null;
                    return;
                }
                return;
            case 16:
                ((on0) this.f27218b).d = false;
                return;
            case 17:
                ((ap0) this.f27218b).M0.setVisibility(8);
                return;
            case 18:
                xp0 xp0Var = (xp0) this.f27218b;
                if (animator == xp0Var.h) {
                    xp0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((hr0) this.f27218b).f27040f = null;
                return;
            case 20:
                pr0 pr0Var = (pr0) this.f27218b;
                if (pr0Var.getParent() != null) {
                    ((ViewGroup) pr0Var.getParent()).removeView(pr0Var);
                    return;
                }
                return;
            case 21:
                st0 st0Var = (st0) this.f27218b;
                View view2 = st0Var.f30553c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                st0Var.f30551a.removeView(view2);
                return;
            case 22:
                ew0 ew0Var = (ew0) this.f27218b;
                if (ew0Var.f26088f == animator) {
                    ew0Var.f26088f = null;
                    return;
                }
                return;
            case 23:
                ux0 ux0Var = (ux0) this.f27218b;
                ux0.E1(ux0Var, ((Float) ux0Var.f31247q3.getAnimatedValue()).floatValue());
                ux0Var.f31247q3 = null;
                return;
            case 24:
                ty0 ty0Var = (ty0) this.f27218b;
                ty0Var.f30955x.setVisibility(8);
                ty0Var.F.setImageDrawable(null);
                return;
            case 25:
                int i10 = 0;
                while (true) {
                    zy0[] zy0VarArr = (zy0[]) this.f27218b;
                    if (i10 < zy0VarArr.length) {
                        zy0 zy0Var = zy0VarArr[i10];
                        if (zy0Var != null) {
                            zy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((az0) this.f27218b).H = null;
                return;
            case 27:
                ((dz0) this.f27218b).e = false;
                return;
            case 28:
                ((p11) this.f27218b).setVisibility(4);
                return;
            default:
                ((z21) this.f27218b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27217a) {
            case 16:
                on0 on0Var = (on0) this.f27218b;
                on0Var.d = true;
                if (on0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) on0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public i60(st0 st0Var, s4.n0 n0Var) {
        this.f27217a = 21;
        this.f27218b = st0Var;
    }

    private final void a(Animator animator) {
    }
}
