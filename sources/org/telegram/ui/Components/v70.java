package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class v70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31677a;
    public final Object f31678b;

    public v70(Object obj, int i10) {
        this.f31677a = i10;
        this.f31678b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31677a) {
            case 0:
                ((z70) this.f31678b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                y80 y80Var = (y80) this.f31678b;
                y80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y80Var.f33238s = floatValue;
                y80Var.d(floatValue);
                return;
            case 2:
                ee0 ee0Var = ((zd0) this.f31678b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.P = floatValue2;
                ee0Var.f(floatValue2);
                return;
            case 3:
                ((rg0) this.f31678b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                vh0 vh0Var = (vh0) this.f31678b;
                vh0Var.H.E = AndroidUtilities.lerp(vh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ck0 ck0Var = (ck0) this.f31678b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.f25457e.setAlpha(floatValue3);
                ck0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                sk0 sk0Var = (sk0) this.f31678b;
                sk0Var.B0 = ((Float) sk0Var.f30860y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = sk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                sk0Var.invalidate();
                return;
            case 7:
                vr vrVar = (vr) this.f31678b;
                vrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.setScaleX(floatValue4);
                vrVar.setScaleY(floatValue4);
                ((sk0) vrVar.f32411c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f31678b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                qk0 qk0Var = (qk0) this.f31678b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.I = floatValue5;
                pk0 pk0Var = qk0Var.f30086b;
                float f10 = 1.0f;
                if (qk0Var.f30093w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                pk0Var.setScaleY(floatValue5 * f7);
                float f11 = qk0Var.I;
                if (qk0Var.f30093w) {
                    f10 = 0.76f;
                }
                pk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                hm0 hm0Var = (hm0) this.f31678b;
                hm0Var.getClass();
                hm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm0Var.invalidateSelf();
                return;
            case 11:
                sm0 sm0Var = (sm0) this.f31678b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.f30885r = floatValue6;
                sm0Var.f30889y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                sm0Var.f30889y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, sm0Var.f30885r));
                sm0Var.f30889y.setAlpha(sm0Var.f30885r);
                sm0Var.f30886s.invalidate();
                sm0Var.v.invalidate();
                return;
            case 12:
                an0 an0Var = (an0) this.f31678b;
                an0Var.getClass();
                an0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an0Var.j();
                return;
            case 13:
                ((an0) ((wm0) this.f31678b).f32671b).invalidate();
                return;
            case 14:
                en0 en0Var = (en0) this.f31678b;
                en0Var.getClass();
                en0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                ao0 ao0Var = (ao0) this.f31678b;
                ao0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ao0Var.F = floatValue7;
                ao0Var.setShown(floatValue7);
                ao0Var.b(false);
                return;
            case 16:
                qp0 qp0Var = (qp0) this.f31678b;
                qp0Var.getClass();
                qp0Var.f30177n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qp0Var.invalidate();
                return;
            case 17:
                eq0 eq0Var = (eq0) this.f31678b;
                br0 br0Var = eq0Var.f26200b;
                br0Var.f25077u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                br0Var.f25054c.invalidate();
                eq0Var.invalidate();
                return;
            case 18:
                ((eu) this.f31678b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                qv0 qv0Var = (qv0) this.f31678b;
                qv0Var.M0(qv0Var.getTabProgress());
                return;
            case 20:
                ((ju0) this.f31678b).h.invalidate();
                return;
            case 21:
                cw0 cw0Var = (cw0) this.f31678b;
                cw0Var.getClass();
                cw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cw0Var.invalidate();
                return;
            case 22:
                mw0 mw0Var = (mw0) ((androidx.activity.g) this.f31678b).f2050c;
                mw0Var.f28838f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mw0Var.N();
                return;
            case 23:
                sx0.x1((sx0) this.f31678b, valueAnimator);
                return;
            case 24:
                ux0 ux0Var = (ux0) this.f31678b;
                ux0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ux0Var.a();
                return;
            case 25:
                zy0 zy0Var = (zy0) this.f31678b;
                zy0Var.getClass();
                zy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.invalidate();
                return;
            case 26:
                cz0 cz0Var = (cz0) this.f31678b;
                cz0Var.getClass();
                cz0Var.f25557i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var.f25551a.invalidate();
                return;
            case 27:
                t21 t21Var = (t21) this.f31678b;
                t21Var.getClass();
                t21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.invalidate();
                return;
            case 28:
                w31 w31Var = (w31) this.f31678b;
                w31Var.getClass();
                w31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w31Var.n();
                return;
            default:
                o51 o51Var = (o51) this.f31678b;
                o51Var.getClass();
                o51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.invalidate();
                return;
        }
    }
}
