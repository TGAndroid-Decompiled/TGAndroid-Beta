package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class v70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31586a;
    public final Object f31587b;

    public v70(Object obj, int i10) {
        this.f31586a = i10;
        this.f31587b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31586a) {
            case 0:
                ((z70) this.f31587b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                y80 y80Var = (y80) this.f31587b;
                y80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y80Var.f33117s = floatValue;
                y80Var.d(floatValue);
                return;
            case 2:
                ee0 ee0Var = ((zd0) this.f31587b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.P = floatValue2;
                ee0Var.f(floatValue2);
                return;
            case 3:
                ((rg0) this.f31587b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                vh0 vh0Var = (vh0) this.f31587b;
                vh0Var.H.E = AndroidUtilities.lerp(vh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ck0 ck0Var = (ck0) this.f31587b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.f25409e.setAlpha(floatValue3);
                ck0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                sk0 sk0Var = (sk0) this.f31587b;
                sk0Var.B0 = ((Float) sk0Var.f30804y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = sk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                sk0Var.invalidate();
                return;
            case 7:
                vr vrVar = (vr) this.f31587b;
                vrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.setScaleX(floatValue4);
                vrVar.setScaleY(floatValue4);
                ((sk0) vrVar.f32353c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f31587b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                qk0 qk0Var = (qk0) this.f31587b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.I = floatValue5;
                pk0 pk0Var = qk0Var.f30064b;
                float f10 = 1.0f;
                if (qk0Var.f30071w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                pk0Var.setScaleY(floatValue5 * f7);
                float f11 = qk0Var.I;
                if (qk0Var.f30071w) {
                    f10 = 0.76f;
                }
                pk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                hm0 hm0Var = (hm0) this.f31587b;
                hm0Var.getClass();
                hm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm0Var.invalidateSelf();
                return;
            case 11:
                sm0 sm0Var = (sm0) this.f31587b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.f30829r = floatValue6;
                sm0Var.f30833y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                sm0Var.f30833y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, sm0Var.f30829r));
                sm0Var.f30833y.setAlpha(sm0Var.f30829r);
                sm0Var.f30830s.invalidate();
                sm0Var.v.invalidate();
                return;
            case 12:
                an0 an0Var = (an0) this.f31587b;
                an0Var.getClass();
                an0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an0Var.j();
                return;
            case 13:
                ((an0) ((wm0) this.f31587b).f32589b).invalidate();
                return;
            case 14:
                en0 en0Var = (en0) this.f31587b;
                en0Var.getClass();
                en0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                ao0 ao0Var = (ao0) this.f31587b;
                ao0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ao0Var.F = floatValue7;
                ao0Var.setShown(floatValue7);
                ao0Var.b(false);
                return;
            case 16:
                pp0 pp0Var = (pp0) this.f31587b;
                pp0Var.getClass();
                pp0Var.f29710n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp0Var.invalidate();
                return;
            case 17:
                dq0 dq0Var = (dq0) this.f31587b;
                zq0 zq0Var = dq0Var.f25807b;
                zq0Var.f33628u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zq0Var.f33605c.invalidate();
                dq0Var.invalidate();
                return;
            case 18:
                ((eu) this.f31587b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                pv0 pv0Var = (pv0) this.f31587b;
                pv0Var.M0(pv0Var.getTabProgress());
                return;
            case 20:
                ((iu0) this.f31587b).h.invalidate();
                return;
            case 21:
                bw0 bw0Var = (bw0) this.f31587b;
                bw0Var.getClass();
                bw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.invalidate();
                return;
            case 22:
                lw0 lw0Var = (lw0) ((androidx.activity.g) this.f31587b).f2050c;
                lw0Var.f28457f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.N();
                return;
            case 23:
                rx0.y1((rx0) this.f31587b, valueAnimator);
                return;
            case 24:
                tx0 tx0Var = (tx0) this.f31587b;
                tx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var.a();
                return;
            case 25:
                yy0 yy0Var = (yy0) this.f31587b;
                yy0Var.getClass();
                yy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var.invalidate();
                return;
            case 26:
                bz0 bz0Var = (bz0) this.f31587b;
                bz0Var.getClass();
                bz0Var.f25090i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bz0Var.f25084a.invalidate();
                return;
            case 27:
                s21 s21Var = (s21) this.f31587b;
                s21Var.getClass();
                s21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21Var.invalidate();
                return;
            case 28:
                v31 v31Var = (v31) this.f31587b;
                v31Var.getClass();
                v31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.n();
                return;
            default:
                n51 n51Var = (n51) this.f31587b;
                n51Var.getClass();
                n51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.invalidate();
                return;
        }
    }
}
