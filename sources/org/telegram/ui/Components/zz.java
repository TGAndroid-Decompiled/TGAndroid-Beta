package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class zz extends AnimatorListenerAdapter {
    public final int f35458a;
    public final Object f35459b;

    public zz(Object obj, int i10) {
        this.f35458a = i10;
        this.f35459b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35458a) {
            case 11:
                ((lg0) this.f35459b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35458a) {
            case 0:
                f00 f00Var = (f00) this.f35459b;
                f00Var.Q = f00Var.V;
                f00Var.U = f00Var.f28229b0;
                f00Var.R = f00Var.W;
                f00Var.S = f00Var.f28227a0;
                f00Var.V = -1;
                f00Var.W = -1;
                f00Var.f28227a0 = -1;
                f00Var.f28229b0 = -1;
                return;
            case 1:
                u00 u00Var = (u00) this.f35459b;
                u00Var.f33077s = 1.0f;
                u00Var.invalidate();
                return;
            case 2:
                j70 j70Var = (j70) this.f35459b;
                h70 h70Var = j70Var.f29604x;
                if (h70Var != null) {
                    h70Var.setProgress(1.0f);
                    j70Var.f29604x.invalidate();
                }
                j70Var.m0 = null;
                return;
            case 3:
                g00 g00Var = (g00) this.f35459b;
                ((t70) g00Var.f28694e).A = false;
                TextView[] textViewArr = (TextView[]) g00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 4:
                g80 g80Var = (g80) this.f35459b;
                if (!g80Var.f28815f) {
                    g80Var.f28813c.setVisibility(8);
                    return;
                }
                return;
            case 5:
                n80 n80Var = (n80) this.f35459b;
                FrameLayout frameLayout = n80Var.f30927b;
                cg.i0 i0Var = (cg.i0) n80Var.f30928c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.z9) n80Var.d);
                return;
            case 6:
                lb0 lb0Var = (lb0) this.f35459b;
                lb0Var.V.h = null;
                lb0Var.e(lb0Var.O, lb0Var.N);
                return;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.f35459b;
                numberTextView.d = null;
                numberTextView.f26424b.clear();
                return;
            case 8:
                nd0 nd0Var = (nd0) this.f35459b;
                nd0Var.setVisibility(8);
                nd0Var.h();
                nd0Var.L = 0.0f;
                nd0Var.f(0.0f);
                nd0Var.setAlpha(0.0f);
                return;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.f35459b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 10:
                bf bfVar = (bf) this.f35459b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((nh.l8) bfVar.f27065c).f18050e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((nh.l8) bfVar.f27065c).f18050e = null;
                    return;
                }
                return;
            case 11:
                return;
            case 12:
                qg0 qg0Var = (qg0) this.f35459b;
                qg0Var.f31945f = false;
                qg0Var.B = null;
                return;
            case 13:
                ((ei0) this.f35459b).b();
                return;
            case 14:
                ((pj0) this.f35459b).h.setVisibility(8);
                return;
            case 15:
                jl0 jl0Var = (jl0) this.f35459b;
                View view = jl0Var.Y0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (jl0Var.b1()) {
                    jl0Var.invalidate();
                    return;
                }
                return;
            case 16:
                fm0 fm0Var = (fm0) this.f35459b;
                if (fm0Var.f28504s != null) {
                    fm0Var.j();
                    fm0Var.f28504s.invalidate();
                    fm0Var.f28490e.invalidate();
                    fm0Var.invalidate();
                    fm0Var.f28504s = null;
                    return;
                }
                return;
            case 17:
                ((km0) this.f35459b).d = false;
                return;
            case 18:
                ((tn0) this.f35459b).I0.setVisibility(8);
                return;
            case 19:
                qo0 qo0Var = (qo0) this.f35459b;
                if (animator == qo0Var.h) {
                    qo0Var.h = null;
                    return;
                }
                return;
            case 20:
                ((cq0) this.f35459b).f27555e = null;
                return;
            case 21:
                kq0 kq0Var = (kq0) this.f35459b;
                if (kq0Var.getParent() != null) {
                    ((ViewGroup) kq0Var.getParent()).removeView(kq0Var);
                    return;
                }
                return;
            case 22:
                ks0 ks0Var = (ks0) this.f35459b;
                View view2 = ks0Var.f30143c;
                view2.setAlpha(1.0f);
                f2.w0.x0(view2);
                ks0Var.f30141a.removeView(view2);
                return;
            case 23:
                xu0 xu0Var = (xu0) this.f35459b;
                if (xu0Var.f34834f == animator) {
                    xu0Var.f34834f = null;
                    return;
                }
                return;
            case 24:
                ow0 ow0Var = (ow0) this.f35459b;
                ow0.y1(ow0Var, ((Float) ow0Var.f31500l3.getAnimatedValue()).floatValue());
                ow0Var.f31500l3 = null;
                return;
            case 25:
                nx0 nx0Var = (nx0) this.f35459b;
                nx0Var.f31191x.setVisibility(8);
                nx0Var.B.setImageDrawable(null);
                return;
            case 26:
                int i10 = 0;
                while (true) {
                    ux0[] ux0VarArr = (ux0[]) this.f35459b;
                    if (i10 < ux0VarArr.length) {
                        ux0 ux0Var = ux0VarArr[i10];
                        if (ux0Var != null) {
                            ux0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((vx0) this.f35459b).D = null;
                return;
            case 28:
                ((yx0) this.f35459b).f35144e = false;
                return;
            default:
                ((g01) this.f35459b).setVisibility(4);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35458a) {
            case 17:
                km0 km0Var = (km0) this.f35459b;
                km0Var.d = true;
                if (km0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) km0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public zz(ks0 ks0Var, f2.w0 w0Var) {
        this.f35458a = 22;
        this.f35459b = ks0Var;
    }

    private final void a(Animator animator) {
    }
}
