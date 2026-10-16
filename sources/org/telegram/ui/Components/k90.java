package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class k90 extends AnimatorListenerAdapter {
    public final int f26302a;
    public final Object f26303b;

    public k90(Object obj, int i10) {
        this.f26302a = i10;
        this.f26303b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26302a) {
            case 7:
                ((qh0) this.f26303b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26302a) {
            case 0:
                l90 l90Var = (l90) this.f26303b;
                if (!l90Var.f26687f) {
                    l90Var.f26686c.setVisibility(8);
                    return;
                }
                return;
            case 1:
                s90 s90Var = (s90) this.f26303b;
                FrameLayout frameLayout = s90Var.f28772b;
                di.p6 p6Var = (di.p6) s90Var.f28773c;
                if (p6Var.getParent() != null) {
                    frameLayout.removeView(p6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) s90Var.d);
                return;
            case 2:
                pc0 pc0Var = (pc0) this.f26303b;
                pc0Var.f27967c0.h = null;
                pc0Var.e(pc0Var.S, pc0Var.R);
                return;
            case 3:
                NumberTextView numberTextView = (NumberTextView) this.f26303b;
                numberTextView.d = null;
                numberTextView.f22891b.clear();
                return;
            case 4:
                re0 re0Var = (re0) this.f26303b;
                re0Var.O = null;
                re0Var.f28510r.setText("");
                di.i9.a(re0Var.f28511s, false);
                re0Var.setVisibility(8);
                re0Var.T = 0.0f;
                re0Var.g(0.0f);
                re0Var.setAlpha(0.0f);
                re0Var.i();
                return;
            case 5:
                AnimatorSet animatorSet = (AnimatorSet) this.f26303b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 6:
                kf kfVar = (kf) this.f26303b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((di.i9) kfVar.f26382c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((di.i9) kfVar.f26382c).e = null;
                    return;
                }
                return;
            case 7:
                return;
            case 8:
                vh0 vh0Var = (vh0) this.f26303b;
                vh0Var.f29648f = false;
                vh0Var.F = null;
                return;
            case 9:
                ((jj0) this.f26303b).b();
                return;
            case 10:
                ((qk0) this.f26303b).h.setVisibility(8);
                return;
            case 11:
                mm0 mm0Var = (mm0) this.f26303b;
                View view = mm0Var.f27123a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.b1()) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 12:
                kn0 kn0Var = (kn0) this.f26303b;
                if (kn0Var.f26442s != null) {
                    kn0Var.j();
                    kn0Var.f26442s.invalidate();
                    kn0Var.e.invalidate();
                    kn0Var.invalidate();
                    kn0Var.f26442s = null;
                    return;
                }
                return;
            case 13:
                ((on0) this.f26303b).d = false;
                return;
            case 14:
                ((zo0) this.f26303b).M0.setVisibility(8);
                return;
            case 15:
                xp0 xp0Var = (xp0) this.f26303b;
                if (animator == xp0Var.h) {
                    xp0Var.h = null;
                    return;
                }
                return;
            case 16:
                ((hr0) this.f26303b).f25390f = null;
                return;
            case 17:
                pr0 pr0Var = (pr0) this.f26303b;
                if (pr0Var.getParent() != null) {
                    ((ViewGroup) pr0Var.getParent()).removeView(pr0Var);
                    return;
                }
                return;
            case 18:
                st0 st0Var = (st0) this.f26303b;
                View view2 = st0Var.f28912c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                st0Var.f28910a.removeView(view2);
                return;
            case 19:
                ew0 ew0Var = (ew0) this.f26303b;
                if (ew0Var.f24508f == animator) {
                    ew0Var.f24508f = null;
                    return;
                }
                return;
            case 20:
                ux0 ux0Var = (ux0) this.f26303b;
                ux0.z1(ux0Var, ((Float) ux0Var.f29478n3.getAnimatedValue()).floatValue());
                ux0Var.f29478n3 = null;
                return;
            case 21:
                uy0 uy0Var = (uy0) this.f26303b;
                uy0Var.f29514x.setVisibility(8);
                uy0Var.F.setImageDrawable(null);
                return;
            case 22:
                int i10 = 0;
                while (true) {
                    az0[] az0VarArr = (az0[]) this.f26303b;
                    if (i10 < az0VarArr.length) {
                        az0 az0Var = az0VarArr[i10];
                        if (az0Var != null) {
                            az0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 23:
                super.onAnimationEnd(animator);
                ((bz0) this.f26303b).H = null;
                return;
            case 24:
                ((ez0) this.f26303b).e = false;
                return;
            case 25:
                ((p11) this.f26303b).setVisibility(4);
                return;
            case 26:
                ((a31) this.f26303b).setVisibility(8);
                return;
            case 27:
                bi.d4 d4Var = ((t31) this.f26303b).f28962f;
                d4Var.setScaleX(1.0f);
                d4Var.setScaleY(1.0f);
                d4Var.invalidate();
                return;
            case 28:
                x31 x31Var = (x31) this.f26303b;
                x31Var.K = 1.0f;
                x31Var.h.invalidate();
                return;
            default:
                ((i61) this.f26303b).L = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26302a) {
            case 13:
                on0 on0Var = (on0) this.f26303b;
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

    public k90(st0 st0Var, s4.n0 n0Var) {
        this.f26302a = 18;
        this.f26303b = st0Var;
    }

    private final void a(Animator animator) {
    }
}
