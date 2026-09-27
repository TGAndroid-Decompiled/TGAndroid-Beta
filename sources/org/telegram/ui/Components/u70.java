package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28820a;
    public final Object f28821b;

    public u70(Object obj, int i10) {
        this.f28820a = i10;
        this.f28821b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28820a) {
            case 0:
                ((y70) this.f28821b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                x80 x80Var = (x80) this.f28821b;
                x80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x80Var.f30349s = floatValue;
                x80Var.d(floatValue);
                return;
            case 2:
                ce0 ce0Var = ((xd0) this.f28821b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var.P = floatValue2;
                ce0Var.f(floatValue2);
                return;
            case 3:
                ((rg0) this.f28821b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                vh0 vh0Var = (vh0) this.f28821b;
                vh0Var.H.E = AndroidUtilities.lerp(vh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ck0 ck0Var = (ck0) this.f28821b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.e.setAlpha(floatValue3);
                ck0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                sk0 sk0Var = (sk0) this.f28821b;
                sk0Var.B0 = ((Float) sk0Var.f28325y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = sk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                sk0Var.invalidate();
                return;
            case 7:
                ur urVar = (ur) this.f28821b;
                urVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                urVar.setScaleX(floatValue4);
                urVar.setScaleY(floatValue4);
                ((sk0) urVar.f28935c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f28821b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                qk0 qk0Var = (qk0) this.f28821b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.I = floatValue5;
                pk0 pk0Var = qk0Var.f27768b;
                float f10 = 1.0f;
                if (qk0Var.f27774w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                pk0Var.setScaleY(floatValue5 * f7);
                float f11 = qk0Var.I;
                if (qk0Var.f27774w) {
                    f10 = 0.76f;
                }
                pk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                dm0 dm0Var = (dm0) this.f28821b;
                dm0Var.getClass();
                dm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dm0Var.invalidateSelf();
                return;
            case 11:
                om0 om0Var = (om0) this.f28821b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om0Var.f27145r = floatValue6;
                om0Var.f27149y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                om0Var.f27149y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, om0Var.f27145r));
                om0Var.f27149y.setAlpha(om0Var.f27145r);
                om0Var.f27146s.invalidate();
                om0Var.v.invalidate();
                return;
            case 12:
                wm0 wm0Var = (wm0) this.f28821b;
                wm0Var.getClass();
                wm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm0Var.j();
                return;
            case 13:
                ((wm0) ((sm0) this.f28821b).f28338b).invalidate();
                return;
            case 14:
                an0 an0Var = (an0) this.f28821b;
                an0Var.getClass();
                an0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                wn0 wn0Var = (wn0) this.f28821b;
                wn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn0Var.F = floatValue7;
                wn0Var.setShown(floatValue7);
                wn0Var.b(false);
                return;
            case 16:
                lp0 lp0Var = (lp0) this.f28821b;
                lp0Var.getClass();
                lp0Var.f26114n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lp0Var.invalidate();
                return;
            case 17:
                zp0 zp0Var = (zp0) this.f28821b;
                vq0 vq0Var = zp0Var.f30956b;
                vq0Var.f29765u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vq0Var.f29743c.invalidate();
                zp0Var.invalidate();
                return;
            case 18:
                ((du) this.f28821b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                lv0 lv0Var = (lv0) this.f28821b;
                lv0Var.M0(lv0Var.getTabProgress());
                return;
            case 20:
                ((eu0) this.f28821b).h.invalidate();
                return;
            case 21:
                sv0 sv0Var = (sv0) this.f28821b;
                sv0Var.getClass();
                sv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                return;
            case 22:
                cw0 cw0Var = (cw0) ((androidx.activity.g) this.f28821b).f1884c;
                cw0Var.f23434f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cw0Var.N();
                return;
            case 23:
                ix0.x1((ix0) this.f28821b, valueAnimator);
                return;
            case 24:
                kx0 kx0Var = (kx0) this.f28821b;
                kx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.a();
                return;
            case 25:
                py0 py0Var = (py0) this.f28821b;
                py0Var.getClass();
                py0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                py0Var.invalidate();
                return;
            case 26:
                sy0 sy0Var = (sy0) this.f28821b;
                sy0Var.getClass();
                sy0Var.f28408i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.f28403a.invalidate();
                return;
            case 27:
                j21 j21Var = (j21) this.f28821b;
                j21Var.getClass();
                j21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j21Var.invalidate();
                return;
            case 28:
                m31 m31Var = (m31) this.f28821b;
                m31Var.getClass();
                m31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.n();
                return;
            default:
                e51 e51Var = (e51) this.f28821b;
                e51Var.getClass();
                e51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e51Var.invalidate();
                return;
        }
    }
}
