package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25895a;
    public final Object f25896b;

    public j70(Object obj, int i10) {
        this.f25895a = i10;
        this.f25896b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f25895a) {
            case 0:
                ((n70) this.f25896b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                m80 m80Var = (m80) this.f25896b;
                m80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m80Var.f26990s = floatValue;
                m80Var.d(floatValue);
                return;
            case 2:
                wd0 wd0Var = ((qd0) this.f25896b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd0Var.M = floatValue2;
                wd0Var.f(floatValue2);
                return;
            case 3:
                ((mg0) this.f25896b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                qh0 qh0Var = (qh0) this.f25896b;
                qh0Var.E.E = AndroidUtilities.lerp(qh0Var.G, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                yj0 yj0Var = (yj0) this.f25896b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj0Var.e.setAlpha(floatValue3);
                yj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                pk0 pk0Var = (pk0) this.f25896b;
                pk0Var.f27920y0 = ((Float) pk0Var.f27914v0.getAnimatedValue()).floatValue();
                ah.e eVar = pk0Var.P;
                if (eVar != null) {
                    eVar.invalidate();
                }
                pk0Var.invalidate();
                return;
            case 7:
                or orVar = (or) this.f25896b;
                orVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                orVar.setScaleX(floatValue4);
                orVar.setScaleY(floatValue4);
                ((pk0) orVar.f27637c).P.invalidate();
                return;
            case 8:
                ((q0.a) this.f25896b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                nk0 nk0Var = (nk0) this.f25896b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.F = floatValue5;
                mk0 mk0Var = nk0Var.f27285b;
                float f11 = 1.0f;
                if (nk0Var.f27291w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                mk0Var.setScaleY(floatValue5 * f10);
                float f12 = nk0Var.F;
                if (nk0Var.f27291w) {
                    f11 = 0.76f;
                }
                mk0Var.setScaleX(f12 * f11);
                return;
            case 10:
                xl0 xl0Var = (xl0) this.f25896b;
                xl0Var.getClass();
                xl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xl0Var.invalidateSelf();
                return;
            case 11:
                hm0 hm0Var = (hm0) this.f25896b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm0Var.f25453r = floatValue6;
                hm0Var.f25457y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                hm0Var.f25457y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hm0Var.f25453r));
                hm0Var.f25457y.setAlpha(hm0Var.f25453r);
                hm0Var.f25454s.invalidate();
                hm0Var.v.invalidate();
                return;
            case 12:
                om0 om0Var = (om0) this.f25896b;
                om0Var.getClass();
                om0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om0Var.j();
                return;
            case 13:
                ((om0) ((lm0) this.f25896b).f26803b).invalidate();
                return;
            case 14:
                tm0 tm0Var = (tm0) this.f25896b;
                tm0Var.getClass();
                tm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                nn0 nn0Var = (nn0) this.f25896b;
                nn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nn0Var.C = floatValue7;
                nn0Var.setShown(floatValue7);
                nn0Var.b(false);
                return;
            case 16:
                zo0 zo0Var = (zo0) this.f25896b;
                zo0Var.getClass();
                zo0Var.f31444n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zo0Var.invalidate();
                return;
            case 17:
                np0 np0Var = (np0) this.f25896b;
                lq0 lq0Var = np0Var.f27349b;
                lq0Var.f26853r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lq0Var.f26835c.invalidate();
                np0Var.invalidate();
                return;
            case 18:
                ((ut) this.f25896b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f25896b;
                yu0Var.M0(yu0Var.getTabProgress());
                return;
            case 20:
                ((qt0) this.f25896b).h.invalidate();
                return;
            case 21:
                fv0 fv0Var = (fv0) this.f25896b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                return;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.f25896b).f313c;
                qv0Var.f28288c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                return;
            case 23:
                xw0.v1((xw0) this.f25896b, valueAnimator);
                return;
            case 24:
                zw0 zw0Var = (zw0) this.f25896b;
                zw0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zw0Var.a();
                return;
            case 25:
                fy0 fy0Var = (fy0) this.f25896b;
                fy0Var.getClass();
                fy0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.invalidate();
                return;
            case 26:
                iy0 iy0Var = (iy0) this.f25896b;
                iy0Var.getClass();
                iy0Var.f25791i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iy0Var.f25786a.invalidate();
                return;
            case 27:
                w11 w11Var = (w11) this.f25896b;
                w11Var.getClass();
                w11Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w11Var.invalidate();
                return;
            case 28:
                w21 w21Var = (w21) this.f25896b;
                w21Var.getClass();
                w21Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                return;
            default:
                p41 p41Var = (p41) this.f25896b;
                p41Var.getClass();
                p41Var.f27731y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p41Var.invalidate();
                return;
        }
    }
}
