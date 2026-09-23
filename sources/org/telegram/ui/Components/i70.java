package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24892a;
    public final Object f24893b;

    public i70(Object obj, int i10) {
        this.f24892a = i10;
        this.f24893b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24892a) {
            case 0:
                ((m70) this.f24893b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                l80 l80Var = (l80) this.f24893b;
                l80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l80Var.f25844s = floatValue;
                l80Var.d(floatValue);
                return;
            case 2:
                sd0 sd0Var = ((nd0) this.f24893b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue2;
                sd0Var.f(floatValue2);
                return;
            case 3:
                ((eg0) this.f24893b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                jh0 jh0Var = (jh0) this.f24893b;
                jh0Var.H.E = AndroidUtilities.lerp(jh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                qj0 qj0Var = (qj0) this.f24893b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0Var.e.setAlpha(floatValue3);
                qj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                gk0 gk0Var = (gk0) this.f24893b;
                gk0Var.B0 = ((Float) gk0Var.f24361y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = gk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                gk0Var.invalidate();
                return;
            case 7:
                tr trVar = (tr) this.f24893b;
                trVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.setScaleX(floatValue4);
                trVar.setScaleY(floatValue4);
                ((gk0) trVar.f28296c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f24893b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                ek0 ek0Var = (ek0) this.f24893b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ek0Var.I = floatValue5;
                dk0 dk0Var = ek0Var.f23707b;
                float f10 = 1.0f;
                if (ek0Var.f23713w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dk0Var.setScaleY(floatValue5 * f7);
                float f11 = ek0Var.I;
                if (ek0Var.f23713w) {
                    f10 = 0.76f;
                }
                dk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                rl0 rl0Var = (rl0) this.f24893b;
                rl0Var.getClass();
                rl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rl0Var.invalidateSelf();
                return;
            case 11:
                bm0 bm0Var = (bm0) this.f24893b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm0Var.f22785r = floatValue6;
                bm0Var.f22789y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                bm0Var.f22789y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, bm0Var.f22785r));
                bm0Var.f22789y.setAlpha(bm0Var.f22785r);
                bm0Var.f22786s.invalidate();
                bm0Var.v.invalidate();
                return;
            case 12:
                jm0 jm0Var = (jm0) this.f24893b;
                jm0Var.getClass();
                jm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.j();
                return;
            case 13:
                ((jm0) ((fm0) this.f24893b).f24009b).invalidate();
                return;
            case 14:
                nm0 nm0Var = (nm0) this.f24893b;
                nm0Var.getClass();
                nm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                in0 in0Var = (in0) this.f24893b;
                in0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in0Var.F = floatValue7;
                in0Var.setShown(floatValue7);
                in0Var.b(false);
                return;
            case 16:
                wo0 wo0Var = (wo0) this.f24893b;
                wo0Var.getClass();
                wo0Var.f29769n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wo0Var.invalidate();
                return;
            case 17:
                lp0 lp0Var = (lp0) this.f24893b;
                hq0 hq0Var = lp0Var.f25933b;
                hq0Var.f24798u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hq0Var.f24776c.invalidate();
                lp0Var.invalidate();
                return;
            case 18:
                ((cu) this.f24893b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f24893b;
                yu0Var.M0(yu0Var.getTabProgress());
                return;
            case 20:
                ((rt0) this.f24893b).h.invalidate();
                return;
            case 21:
                fv0 fv0Var = (fv0) this.f24893b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                return;
            case 22:
                pv0 pv0Var = (pv0) ((androidx.activity.g) this.f24893b).f1882c;
                pv0Var.f27151f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.N();
                return;
            case 23:
                vw0.w1((vw0) this.f24893b, valueAnimator);
                return;
            case 24:
                xw0 xw0Var = (xw0) this.f24893b;
                xw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xw0Var.a();
                return;
            case 25:
                cy0 cy0Var = (cy0) this.f24893b;
                cy0Var.getClass();
                cy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cy0Var.invalidate();
                return;
            case 26:
                fy0 fy0Var = (fy0) this.f24893b;
                fy0Var.getClass();
                fy0Var.f24111i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.f24106a.invalidate();
                return;
            case 27:
                t11 t11Var = (t11) this.f24893b;
                t11Var.getClass();
                t11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.invalidate();
                return;
            case 28:
                w21 w21Var = (w21) this.f24893b;
                w21Var.getClass();
                w21Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                return;
            default:
                o41 o41Var = (o41) this.f24893b;
                o41Var.getClass();
                o41Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.invalidate();
                return;
        }
    }
}
