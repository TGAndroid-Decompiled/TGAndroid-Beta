package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class v70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29055a;
    public final Object f29056b;

    public v70(Object obj, int i10) {
        this.f29055a = i10;
        this.f29056b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29055a) {
            case 0:
                ((z70) this.f29056b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                y80 y80Var = (y80) this.f29056b;
                y80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y80Var.f30668s = floatValue;
                y80Var.d(floatValue);
                return;
            case 2:
                fe0 fe0Var = ((ae0) this.f29056b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0Var.P = floatValue2;
                fe0Var.f(floatValue2);
                return;
            case 3:
                ((rg0) this.f29056b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                wh0 wh0Var = (wh0) this.f29056b;
                wh0Var.H.E = AndroidUtilities.lerp(wh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                dk0 dk0Var = (dk0) this.f29056b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dk0Var.e.setAlpha(floatValue3);
                dk0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                tk0 tk0Var = (tk0) this.f29056b;
                tk0Var.B0 = ((Float) tk0Var.f28595y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = tk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                tk0Var.invalidate();
                return;
            case 7:
                vr vrVar = (vr) this.f29056b;
                vrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.setScaleX(floatValue4);
                vrVar.setScaleY(floatValue4);
                ((tk0) vrVar.f29717c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f29056b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                rk0 rk0Var = (rk0) this.f29056b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk0Var.I = floatValue5;
                qk0 qk0Var = rk0Var.f28051b;
                float f10 = 1.0f;
                if (rk0Var.f28057w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                qk0Var.setScaleY(floatValue5 * f7);
                float f11 = rk0Var.I;
                if (rk0Var.f28057w) {
                    f10 = 0.76f;
                }
                qk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                em0 em0Var = (em0) this.f29056b;
                em0Var.getClass();
                em0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                em0Var.invalidateSelf();
                return;
            case 11:
                pm0 pm0Var = (pm0) this.f29056b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pm0Var.f27403r = floatValue6;
                pm0Var.f27407y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                pm0Var.f27407y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, pm0Var.f27403r));
                pm0Var.f27407y.setAlpha(pm0Var.f27403r);
                pm0Var.f27404s.invalidate();
                pm0Var.v.invalidate();
                return;
            case 12:
                xm0 xm0Var = (xm0) this.f29056b;
                xm0Var.getClass();
                xm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xm0Var.j();
                return;
            case 13:
                ((xm0) ((tm0) this.f29056b).f28608b).invalidate();
                return;
            case 14:
                bn0 bn0Var = (bn0) this.f29056b;
                bn0Var.getClass();
                bn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                xn0 xn0Var = (xn0) this.f29056b;
                xn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xn0Var.F = floatValue7;
                xn0Var.setShown(floatValue7);
                xn0Var.b(false);
                return;
            case 16:
                mp0 mp0Var = (mp0) this.f29056b;
                mp0Var.getClass();
                mp0Var.f26352n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mp0Var.invalidate();
                return;
            case 17:
                bq0 bq0Var = (bq0) this.f29056b;
                xq0 xq0Var = bq0Var.f22993b;
                xq0Var.f30479u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xq0Var.f30457c.invalidate();
                bq0Var.invalidate();
                return;
            case 18:
                ((eu) this.f29056b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                mv0 mv0Var = (mv0) this.f29056b;
                mv0Var.M0(mv0Var.getTabProgress());
                return;
            case 20:
                ((fu0) this.f29056b).h.invalidate();
                return;
            case 21:
                tv0 tv0Var = (tv0) this.f29056b;
                tv0Var.getClass();
                tv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tv0Var.invalidate();
                return;
            case 22:
                dw0 dw0Var = (dw0) ((androidx.activity.g) this.f29056b).f1889c;
                dw0Var.f23755f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dw0Var.N();
                return;
            case 23:
                jx0.y1((jx0) this.f29056b, valueAnimator);
                return;
            case 24:
                lx0 lx0Var = (lx0) this.f29056b;
                lx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.a();
                return;
            case 25:
                qy0 qy0Var = (qy0) this.f29056b;
                qy0Var.getClass();
                qy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qy0Var.invalidate();
                return;
            case 26:
                ty0 ty0Var = (ty0) this.f29056b;
                ty0Var.getClass();
                ty0Var.f28679i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var.f28674a.invalidate();
                return;
            case 27:
                k21 k21Var = (k21) this.f29056b;
                k21Var.getClass();
                k21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k21Var.invalidate();
                return;
            case 28:
                n31 n31Var = (n31) this.f29056b;
                n31Var.getClass();
                n31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n31Var.n();
                return;
            default:
                f51 f51Var = (f51) this.f29056b;
                f51Var.getClass();
                f51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f51Var.invalidate();
                return;
        }
    }
}
