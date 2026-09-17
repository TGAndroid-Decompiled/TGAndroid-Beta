package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24519a;
    public final Object f24520b;

    public h70(Object obj, int i10) {
        this.f24519a = i10;
        this.f24520b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24519a) {
            case 0:
                ((l70) this.f24520b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                k80 k80Var = (k80) this.f24520b;
                k80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k80Var.f25584s = floatValue;
                k80Var.d(floatValue);
                return;
            case 2:
                sd0 sd0Var = ((nd0) this.f24520b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue2;
                sd0Var.f(floatValue2);
                return;
            case 3:
                ((fg0) this.f24520b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                jh0 jh0Var = (jh0) this.f24520b;
                jh0Var.H.E = AndroidUtilities.lerp(jh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                qj0 qj0Var = (qj0) this.f24520b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0Var.e.setAlpha(floatValue3);
                qj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                gk0 gk0Var = (gk0) this.f24520b;
                gk0Var.B0 = ((Float) gk0Var.f24308y0.getAnimatedValue()).floatValue();
                ci.n6 n6Var = gk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                gk0Var.invalidate();
                return;
            case 7:
                sr srVar = (sr) this.f24520b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((gk0) srVar.f27909c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f24520b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                ek0 ek0Var = (ek0) this.f24520b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ek0Var.I = floatValue5;
                dk0 dk0Var = ek0Var.f23581b;
                float f10 = 1.0f;
                if (ek0Var.f23587w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dk0Var.setScaleY(floatValue5 * f7);
                float f11 = ek0Var.I;
                if (ek0Var.f23587w) {
                    f10 = 0.76f;
                }
                dk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                rl0 rl0Var = (rl0) this.f24520b;
                rl0Var.getClass();
                rl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rl0Var.invalidateSelf();
                return;
            case 11:
                bm0 bm0Var = (bm0) this.f24520b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm0Var.f22770r = floatValue6;
                bm0Var.f22774y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                bm0Var.f22774y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, bm0Var.f22770r));
                bm0Var.f22774y.setAlpha(bm0Var.f22770r);
                bm0Var.f22771s.invalidate();
                bm0Var.v.invalidate();
                return;
            case 12:
                jm0 jm0Var = (jm0) this.f24520b;
                jm0Var.getClass();
                jm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.j();
                return;
            case 13:
                ((jm0) ((fm0) this.f24520b).f23963b).invalidate();
                return;
            case 14:
                nm0 nm0Var = (nm0) this.f24520b;
                nm0Var.getClass();
                nm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                jn0 jn0Var = (jn0) this.f24520b;
                jn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn0Var.F = floatValue7;
                jn0Var.setShown(floatValue7);
                jn0Var.b(false);
                return;
            case 16:
                xo0 xo0Var = (xo0) this.f24520b;
                xo0Var.getClass();
                xo0Var.f29958n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xo0Var.invalidate();
                return;
            case 17:
                mp0 mp0Var = (mp0) this.f24520b;
                iq0 iq0Var = mp0Var.f26238b;
                iq0Var.f25009u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iq0Var.f24987c.invalidate();
                mp0Var.invalidate();
                return;
            case 18:
                ((bu) this.f24520b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                zu0 zu0Var = (zu0) this.f24520b;
                zu0Var.M0(zu0Var.getTabProgress());
                return;
            case 20:
                ((st0) this.f24520b).h.invalidate();
                return;
            case 21:
                gv0 gv0Var = (gv0) this.f24520b;
                gv0Var.getClass();
                gv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                return;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.f24520b).f1890c;
                qv0Var.f27420f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                return;
            case 23:
                xw0.x1((xw0) this.f24520b, valueAnimator);
                return;
            case 24:
                zw0 zw0Var = (zw0) this.f24520b;
                zw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zw0Var.a();
                return;
            case 25:
                ey0 ey0Var = (ey0) this.f24520b;
                ey0Var.getClass();
                ey0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey0Var.invalidate();
                return;
            case 26:
                hy0 hy0Var = (hy0) this.f24520b;
                hy0Var.getClass();
                hy0Var.f24754i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hy0Var.f24749a.invalidate();
                return;
            case 27:
                v11 v11Var = (v11) this.f24520b;
                v11Var.getClass();
                v11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v11Var.invalidate();
                return;
            case 28:
                y21 y21Var = (y21) this.f24520b;
                y21Var.getClass();
                y21Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y21Var.n();
                return;
            default:
                q41 q41Var = (q41) this.f24520b;
                q41Var.getClass();
                q41Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q41Var.invalidate();
                return;
        }
    }
}
