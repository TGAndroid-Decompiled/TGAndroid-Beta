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
    public final int f29138a;
    public final Object f29139b;

    public i10(Object obj, int i10) {
        this.f29138a = i10;
        this.f29139b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29138a) {
            case 11:
                ((nh0) this.f29139b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29138a) {
            case 0:
                j10 j10Var = (j10) this.f29139b;
                j10Var.v = 1.0f;
                j10Var.invalidate();
                return;
            case 1:
                n60 n60Var = (n60) this.f29139b;
                if (animator == n60Var.W) {
                    n60Var.c(true);
                    n60Var.setVisibility(4);
                    return;
                }
                return;
            case 2:
                k80 k80Var = (k80) this.f29139b;
                i80 i80Var = k80Var.f29870x;
                if (i80Var != null) {
                    i80Var.setProgress(1.0f);
                    k80Var.f29870x.invalidate();
                }
                k80Var.m0 = null;
                return;
            case 3:
                t00 t00Var = (t00) this.f29139b;
                ((t80) t00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 4:
                g90 g90Var = (g90) this.f29139b;
                if (!g90Var.f28502f) {
                    g90Var.f28501c.setVisibility(8);
                    return;
                }
                return;
            case 5:
                n90 n90Var = (n90) this.f29139b;
                FrameLayout frameLayout = n90Var.f30927b;
                fi.f6 f6Var = (fi.f6) n90Var.f30928c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ha) n90Var.d);
                return;
            case 6:
                hc0 hc0Var = (hc0) this.f29139b;
                hc0Var.f28917c0.h = null;
                hc0Var.f(hc0Var.S, hc0Var.R);
                return;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.f29139b;
                numberTextView.d = null;
                numberTextView.f26185b.clear();
                return;
            case 8:
                le0 le0Var = (le0) this.f29139b;
                le0Var.S = null;
                le0Var.f30196r.setText("");
                fi.t8.a(le0Var.f30197s, false);
                le0Var.setVisibility(8);
                le0Var.f30184a0 = 0.0f;
                le0Var.h(0.0f);
                le0Var.setAlpha(0.0f);
                le0Var.j();
                return;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.f29139b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 10:
                hf hfVar = (hf) this.f29139b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.t8) hfVar.f28956c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.t8) hfVar.f28956c).e = null;
                    return;
                }
                return;
            case 11:
                return;
            case 12:
                sh0 sh0Var = (sh0) this.f29139b;
                sh0Var.f32559f = false;
                sh0Var.F = null;
                return;
            case 13:
                ((hj0) this.f29139b).b();
                return;
            case 14:
                ((pk0) this.f29139b).h.setVisibility(8);
                return;
            case 15:
                mm0 mm0Var = (mm0) this.f29139b;
                View view = mm0Var.f30619a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.b1()) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 16:
                pn0 pn0Var = (pn0) this.f29139b;
                if (pn0Var.f31632s != null) {
                    pn0Var.j();
                    pn0Var.f31632s.invalidate();
                    pn0Var.e.invalidate();
                    pn0Var.invalidate();
                    pn0Var.f31632s = null;
                    return;
                }
                return;
            case 17:
                ((tn0) this.f29139b).d = false;
                return;
            case 18:
                ((ep0) this.f29139b).O0.setVisibility(8);
                return;
            case 19:
                cq0 cq0Var = (cq0) this.f29139b;
                if (animator == cq0Var.h) {
                    cq0Var.h = null;
                    return;
                }
                return;
            case 20:
                ((lr0) this.f29139b).f30278f = null;
                return;
            case 21:
                sr0 sr0Var = (sr0) this.f29139b;
                if (sr0Var.getParent() != null) {
                    ((ViewGroup) sr0Var.getParent()).removeView(sr0Var);
                    return;
                }
                return;
            case 22:
                zt0 zt0Var = (zt0) this.f29139b;
                View view2 = zt0Var.f35404c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                zt0Var.f35402a.removeView(view2);
                return;
            case 23:
                mw0 mw0Var = (mw0) this.f29139b;
                if (mw0Var.f30765f == animator) {
                    mw0Var.f30765f = null;
                    return;
                }
                return;
            case 24:
                by0 by0Var = (by0) this.f29139b;
                by0.E1(by0Var, ((Float) by0Var.f26996x3.getAnimatedValue()).floatValue());
                by0Var.f26996x3 = null;
                return;
            case 25:
                cz0 cz0Var = (cz0) this.f29139b;
                cz0Var.f27314x.setVisibility(8);
                cz0Var.F.setImageDrawable(null);
                return;
            case 26:
                int i10 = 0;
                while (true) {
                    iz0[] iz0VarArr = (iz0[]) this.f29139b;
                    if (i10 < iz0VarArr.length) {
                        iz0 iz0Var = iz0VarArr[i10];
                        if (iz0Var != null) {
                            iz0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((jz0) this.f29139b).H = null;
                return;
            case 28:
                ((mz0) this.f29139b).e = false;
                return;
            default:
                ((x11) this.f29139b).setVisibility(4);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29138a) {
            case 17:
                tn0 tn0Var = (tn0) this.f29139b;
                tn0Var.d = true;
                if (tn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) tn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public i10(zt0 zt0Var, s4.p0 p0Var) {
        this.f29138a = 22;
        this.f29139b = zt0Var;
    }

    private final void a(Animator animator) {
    }
}
