package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class r60 extends AnimatorListenerAdapter {
    public final int f32085a;
    public final Object f32086b;

    public r60(Object obj, int i9) {
        this.f32085a = i9;
        this.f32086b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32085a) {
            case 9:
                ((ag0) this.f32086b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32085a) {
            case 0:
                x60 x60Var = (x60) this.f32086b;
                v60 v60Var = x60Var.f34584x;
                if (v60Var != null) {
                    v60Var.setProgress(1.0f);
                    x60Var.f34584x.invalidate();
                }
                x60Var.m0 = null;
                return;
            case 1:
                wz wzVar = (wz) this.f32086b;
                ((g70) wzVar.f34477e).A = false;
                TextView[] textViewArr = (TextView[]) wzVar.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                t70 t70Var = (t70) this.f32086b;
                if (!t70Var.f32641f) {
                    t70Var.f32639c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                a80 a80Var = (a80) this.f32086b;
                FrameLayout frameLayout = a80Var.f26721b;
                kh.h6 h6Var = (kh.h6) a80Var.f26722c;
                if (h6Var.getParent() != null) {
                    frameLayout.removeView(h6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) a80Var.d);
                return;
            case 4:
                wa0 wa0Var = (wa0) this.f32086b;
                wa0Var.V.h = null;
                wa0Var.e(wa0Var.O, wa0Var.N);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f32086b;
                numberTextView.d = null;
                numberTextView.f26413b.clear();
                return;
            case 6:
                yc0 yc0Var = (yc0) this.f32086b;
                yc0Var.setVisibility(8);
                yc0Var.h();
                yc0Var.L = 0.0f;
                yc0Var.f(0.0f);
                yc0Var.setAlpha(0.0f);
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f32086b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                ye yeVar = (ye) this.f32086b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((kh.z8) yeVar.f34957c).f16469e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((kh.z8) yeVar.f34957c).f16469e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                fg0 fg0Var = (fg0) this.f32086b;
                fg0Var.f28420f = false;
                fg0Var.B = null;
                return;
            case 11:
                ((uh0) this.f32086b).b();
                return;
            case 12:
                ((ej0) this.f32086b).h.setVisibility(8);
                return;
            case 13:
                wk0 wk0Var = (wk0) this.f32086b;
                View view = wk0Var.Y0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (wk0Var.b1()) {
                    wk0Var.invalidate();
                    return;
                }
                return;
            case 14:
                sl0 sl0Var = (sl0) this.f32086b;
                if (sl0Var.f32514s != null) {
                    sl0Var.j();
                    sl0Var.f32514s.invalidate();
                    sl0Var.f32500e.invalidate();
                    sl0Var.invalidate();
                    sl0Var.f32514s = null;
                    return;
                }
                return;
            case 15:
                ((xl0) this.f32086b).d = false;
                return;
            case 16:
                ((hn0) this.f32086b).I0.setVisibility(8);
                return;
            case 17:
                fo0 fo0Var = (fo0) this.f32086b;
                if (animator == fo0Var.h) {
                    fo0Var.h = null;
                    return;
                }
                return;
            case 18:
                ((qp0) this.f32086b).f32007e = null;
                return;
            case 19:
                yp0 yp0Var = (yp0) this.f32086b;
                if (yp0Var.getParent() != null) {
                    ((ViewGroup) yp0Var.getParent()).removeView(yp0Var);
                    return;
                }
                return;
            case 20:
                zr0 zr0Var = (zr0) this.f32086b;
                View view2 = zr0Var.f35367c;
                view2.setAlpha(1.0f);
                f2.z0.x0(view2);
                zr0Var.f35365a.removeView(view2);
                return;
            case 21:
                mu0 mu0Var = (mu0) this.f32086b;
                if (mu0Var.f30924f == animator) {
                    mu0Var.f30924f = null;
                    return;
                }
                return;
            case 22:
                ew0 ew0Var = (ew0) this.f32086b;
                ew0.y1(ew0Var, ((Float) ew0Var.f28203l3.getAnimatedValue()).floatValue());
                ew0Var.f28203l3 = null;
                return;
            case 23:
                cx0 cx0Var = (cx0) this.f32086b;
                cx0Var.f27593x.setVisibility(8);
                cx0Var.B.setImageDrawable(null);
                return;
            case 24:
                int i9 = 0;
                while (true) {
                    jx0[] jx0VarArr = (jx0[]) this.f32086b;
                    if (i9 < jx0VarArr.length) {
                        jx0 jx0Var = jx0VarArr[i9];
                        if (jx0Var != null) {
                            jx0Var.d = false;
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((kx0) this.f32086b).D = null;
                return;
            case 26:
                ((nx0) this.f32086b).f31207e = false;
                return;
            case 27:
                ((uz0) this.f32086b).setVisibility(4);
                return;
            case 28:
                ((e11) this.f32086b).setVisibility(8);
                return;
            default:
                ih.b3 b3Var = ((v11) this.f32086b).f33230f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32085a) {
            case 15:
                xl0 xl0Var = (xl0) this.f32086b;
                xl0Var.d = true;
                if (xl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) xl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public r60(zr0 zr0Var, f2.z0 z0Var) {
        this.f32085a = 20;
        this.f32086b = zr0Var;
    }

    private final void a(Animator animator) {
    }
}
