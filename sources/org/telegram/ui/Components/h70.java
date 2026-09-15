package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24549a;
    public final Object f24550b;

    public h70(Object obj, int i10) {
        this.f24549a = i10;
        this.f24550b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24549a) {
            case 0:
                ((l70) this.f24550b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                k80 k80Var = (k80) this.f24550b;
                k80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k80Var.f25569s = floatValue;
                k80Var.d(floatValue);
                return;
            case 2:
                sd0 sd0Var = ((nd0) this.f24550b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue2;
                sd0Var.f(floatValue2);
                return;
            case 3:
                ((eg0) this.f24550b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ih0 ih0Var = (ih0) this.f24550b;
                ih0Var.H.E = AndroidUtilities.lerp(ih0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                pj0 pj0Var = (pj0) this.f24550b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var.e.setAlpha(floatValue3);
                pj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                fk0 fk0Var = (fk0) this.f24550b;
                fk0Var.B0 = ((Float) fk0Var.f24009y0.getAnimatedValue()).floatValue();
                ci.n6 n6Var = fk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                fk0Var.invalidate();
                return;
            case 7:
                sr srVar = (sr) this.f24550b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((fk0) srVar.f27960c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f24550b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                dk0 dk0Var = (dk0) this.f24550b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dk0Var.I = floatValue5;
                ck0 ck0Var = dk0Var.f23346b;
                float f10 = 1.0f;
                if (dk0Var.f23352w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ck0Var.setScaleY(floatValue5 * f7);
                float f11 = dk0Var.I;
                if (dk0Var.f23352w) {
                    f10 = 0.76f;
                }
                ck0Var.setScaleX(f11 * f10);
                return;
            case 10:
                ql0 ql0Var = (ql0) this.f24550b;
                ql0Var.getClass();
                ql0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ql0Var.invalidateSelf();
                return;
            case 11:
                am0 am0Var = (am0) this.f24550b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.f22441r = floatValue6;
                am0Var.f22445y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                am0Var.f22445y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, am0Var.f22441r));
                am0Var.f22445y.setAlpha(am0Var.f22441r);
                am0Var.f22442s.invalidate();
                am0Var.v.invalidate();
                return;
            case 12:
                im0 im0Var = (im0) this.f24550b;
                im0Var.getClass();
                im0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.j();
                return;
            case 13:
                ((im0) ((em0) this.f24550b).f23694b).invalidate();
                return;
            case 14:
                mm0 mm0Var = (mm0) this.f24550b;
                mm0Var.getClass();
                mm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                in0 in0Var = (in0) this.f24550b;
                in0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in0Var.F = floatValue7;
                in0Var.setShown(floatValue7);
                in0Var.b(false);
                return;
            case 16:
                wo0 wo0Var = (wo0) this.f24550b;
                wo0Var.getClass();
                wo0Var.f29765n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wo0Var.invalidate();
                return;
            case 17:
                lp0 lp0Var = (lp0) this.f24550b;
                hq0 hq0Var = lp0Var.f25998b;
                hq0Var.f24773u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hq0Var.f24751c.invalidate();
                lp0Var.invalidate();
                return;
            case 18:
                ((bu) this.f24550b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f24550b;
                yu0Var.M0(yu0Var.getTabProgress());
                return;
            case 20:
                ((rt0) this.f24550b).h.invalidate();
                return;
            case 21:
                fv0 fv0Var = (fv0) this.f24550b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                return;
            case 22:
                pv0 pv0Var = (pv0) ((androidx.activity.g) this.f24550b).f1885c;
                pv0Var.f27167f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.N();
                return;
            case 23:
                ww0.w1((ww0) this.f24550b, valueAnimator);
                return;
            case 24:
                yw0 yw0Var = (yw0) this.f24550b;
                yw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yw0Var.a();
                return;
            case 25:
                dy0 dy0Var = (dy0) this.f24550b;
                dy0Var.getClass();
                dy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0Var.invalidate();
                return;
            case 26:
                gy0 gy0Var = (gy0) this.f24550b;
                gy0Var.getClass();
                gy0Var.f24472i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.f24467a.invalidate();
                return;
            case 27:
                u11 u11Var = (u11) this.f24550b;
                u11Var.getClass();
                u11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var.invalidate();
                return;
            case 28:
                x21 x21Var = (x21) this.f24550b;
                x21Var.getClass();
                x21Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.n();
                return;
            default:
                p41 p41Var = (p41) this.f24550b;
                p41Var.getClass();
                p41Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p41Var.invalidate();
                return;
        }
    }
}
