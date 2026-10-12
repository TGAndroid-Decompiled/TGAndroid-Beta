package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class k90 extends AnimatorListenerAdapter {
    public final int f26637a;
    public final Object f26638b;

    public k90(Object obj, int i10) {
        this.f26637a = i10;
        this.f26638b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26637a) {
            case 7:
                ((qh0) this.f26638b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26637a) {
            case 0:
                l90 l90Var = (l90) this.f26638b;
                if (!l90Var.f26987f) {
                    l90Var.f26986c.setVisibility(8);
                    return;
                }
                return;
            case 1:
                s90 s90Var = (s90) this.f26638b;
                FrameLayout frameLayout = s90Var.f29068b;
                di.p6 p6Var = (di.p6) s90Var.f29069c;
                if (p6Var.getParent() != null) {
                    frameLayout.removeView(p6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) s90Var.d);
                return;
            case 2:
                pc0 pc0Var = (pc0) this.f26638b;
                pc0Var.f28286c0.h = null;
                pc0Var.e(pc0Var.S, pc0Var.R);
                return;
            case 3:
                NumberTextView numberTextView = (NumberTextView) this.f26638b;
                numberTextView.d = null;
                numberTextView.f23191b.clear();
                return;
            case 4:
                re0 re0Var = (re0) this.f26638b;
                re0Var.O = null;
                re0Var.f28820r.setText("");
                di.i9.a(re0Var.f28821s, false);
                re0Var.setVisibility(8);
                re0Var.T = 0.0f;
                re0Var.g(0.0f);
                re0Var.setAlpha(0.0f);
                re0Var.i();
                return;
            case 5:
                AnimatorSet animatorSet = (AnimatorSet) this.f26638b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 6:
                kf kfVar = (kf) this.f26638b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((di.i9) kfVar.f26699c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((di.i9) kfVar.f26699c).e = null;
                    return;
                }
                return;
            case 7:
                return;
            case 8:
                vh0 vh0Var = (vh0) this.f26638b;
                vh0Var.f29977f = false;
                vh0Var.F = null;
                return;
            case 9:
                ((jj0) this.f26638b).b();
                return;
            case 10:
                ((qk0) this.f26638b).h.setVisibility(8);
                return;
            case 11:
                mm0 mm0Var = (mm0) this.f26638b;
                View view = mm0Var.f27414a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.b1()) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 12:
                kn0 kn0Var = (kn0) this.f26638b;
                if (kn0Var.f26757s != null) {
                    kn0Var.j();
                    kn0Var.f26757s.invalidate();
                    kn0Var.e.invalidate();
                    kn0Var.invalidate();
                    kn0Var.f26757s = null;
                    return;
                }
                return;
            case 13:
                ((on0) this.f26638b).d = false;
                return;
            case 14:
                ((zo0) this.f26638b).M0.setVisibility(8);
                return;
            case 15:
                xp0 xp0Var = (xp0) this.f26638b;
                if (animator == xp0Var.h) {
                    xp0Var.h = null;
                    return;
                }
                return;
            case 16:
                ((ir0) this.f26638b).f26079f = null;
                return;
            case 17:
                qr0 qr0Var = (qr0) this.f26638b;
                if (qr0Var.getParent() != null) {
                    ((ViewGroup) qr0Var.getParent()).removeView(qr0Var);
                    return;
                }
                return;
            case 18:
                st0 st0Var = (st0) this.f26638b;
                View view2 = st0Var.f29212c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                st0Var.f29210a.removeView(view2);
                return;
            case 19:
                ew0 ew0Var = (ew0) this.f26638b;
                if (ew0Var.f24814f == animator) {
                    ew0Var.f24814f = null;
                    return;
                }
                return;
            case 20:
                ux0 ux0Var = (ux0) this.f26638b;
                ux0.z1(ux0Var, ((Float) ux0Var.f29810n3.getAnimatedValue()).floatValue());
                ux0Var.f29810n3 = null;
                return;
            case 21:
                ty0 ty0Var = (ty0) this.f26638b;
                ty0Var.f29527x.setVisibility(8);
                ty0Var.F.setImageDrawable(null);
                return;
            case 22:
                int i10 = 0;
                while (true) {
                    zy0[] zy0VarArr = (zy0[]) this.f26638b;
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
            case 23:
                super.onAnimationEnd(animator);
                ((az0) this.f26638b).H = null;
                return;
            case 24:
                ((dz0) this.f26638b).e = false;
                return;
            case 25:
                ((o11) this.f26638b).setVisibility(4);
                return;
            case 26:
                ((z21) this.f26638b).setVisibility(8);
                return;
            case 27:
                bi.d4 d4Var = ((t31) this.f26638b).f29265f;
                d4Var.setScaleX(1.0f);
                d4Var.setScaleY(1.0f);
                d4Var.invalidate();
                return;
            case 28:
                x31 x31Var = (x31) this.f26638b;
                x31Var.K = 1.0f;
                x31Var.h.invalidate();
                return;
            default:
                ((h61) this.f26638b).L = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26637a) {
            case 13:
                on0 on0Var = (on0) this.f26638b;
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
        this.f26637a = 18;
        this.f26638b = st0Var;
    }

    private final void a(Animator animator) {
    }
}
