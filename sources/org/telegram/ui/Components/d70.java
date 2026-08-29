package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27684a;
    public final Object f27685b;

    public d70(Object obj, int i10) {
        this.f27684a = i10;
        this.f27685b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f9;
        switch (this.f27684a) {
            case 0:
                ((h70) this.f27685b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                g80 g80Var = (g80) this.f27685b;
                g80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g80Var.f28818s = floatValue;
                g80Var.d(floatValue);
                return;
            case 2:
                nd0 nd0Var = ((id0) this.f27685b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd0Var.L = floatValue2;
                nd0Var.f(floatValue2);
                return;
            case 3:
                ((bg0) this.f27685b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                eh0 eh0Var = (eh0) this.f27685b;
                eh0Var.D.E = AndroidUtilities.lerp(eh0Var.F, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                pj0 pj0Var = (pj0) this.f27685b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var.f31689e.setAlpha(floatValue3);
                pj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                fk0 fk0Var = (fk0) this.f27685b;
                fk0Var.f28469x0 = ((Float) fk0Var.f28464u0.getAnimatedValue()).floatValue();
                bg.d1 d1Var = fk0Var.O;
                if (d1Var != null) {
                    d1Var.invalidate();
                }
                fk0Var.invalidate();
                return;
            case 7:
                lr lrVar = (lr) this.f27685b;
                lrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lrVar.setScaleX(floatValue4);
                lrVar.setScaleY(floatValue4);
                ((fk0) lrVar.f30419c).O.invalidate();
                return;
            case 8:
                ((q0.a) this.f27685b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                dk0 dk0Var = (dk0) this.f27685b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dk0Var.E = floatValue5;
                ck0 ck0Var = dk0Var.f27795b;
                float f10 = 1.0f;
                if (dk0Var.f27802w) {
                    f9 = 0.76f;
                } else {
                    f9 = 1.0f;
                }
                ck0Var.setScaleY(floatValue5 * f9);
                float f11 = dk0Var.E;
                if (dk0Var.f27802w) {
                    f10 = 0.76f;
                }
                ck0Var.setScaleX(f11 * f10);
                return;
            case 10:
                ol0 ol0Var = (ol0) this.f27685b;
                ol0Var.getClass();
                ol0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol0Var.invalidateSelf();
                return;
            case 11:
                yl0 yl0Var = (yl0) this.f27685b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yl0Var.f35096r = floatValue6;
                yl0Var.f35100y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                yl0Var.f35100y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, yl0Var.f35096r));
                yl0Var.f35100y.setAlpha(yl0Var.f35096r);
                yl0Var.f35097s.invalidate();
                yl0Var.v.invalidate();
                return;
            case 12:
                fm0 fm0Var = (fm0) this.f27685b;
                fm0Var.getClass();
                fm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fm0Var.j();
                return;
            case 13:
                ((fm0) ((cm0) this.f27685b).f27510b).invalidate();
                return;
            case 14:
                km0 km0Var = (km0) this.f27685b;
                km0Var.getClass();
                km0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                en0 en0Var = (en0) this.f27685b;
                en0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                en0Var.B = floatValue7;
                en0Var.setShown(floatValue7);
                en0Var.b(false);
                return;
            case 16:
                qo0 qo0Var = (qo0) this.f27685b;
                qo0Var.getClass();
                qo0Var.f32022n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qo0Var.invalidate();
                return;
            case 17:
                fp0 fp0Var = (fp0) this.f27685b;
                dq0 dq0Var = fp0Var.f28517b;
                dq0Var.f27847q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dq0Var.f27830c.invalidate();
                fp0Var.invalidate();
                return;
            case 18:
                ((st) this.f27685b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                qu0 qu0Var = (qu0) this.f27685b;
                qu0Var.M0(qu0Var.getTabProgress());
                return;
            case 20:
                ((it0) this.f27685b).h.invalidate();
                return;
            case 21:
                xu0 xu0Var = (xu0) this.f27685b;
                xu0Var.getClass();
                xu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.invalidate();
                return;
            case 22:
                hv0 hv0Var = (hv0) ((androidx.activity.g) this.f27685b).f862c;
                hv0Var.f29239b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hv0Var.N();
                return;
            case 23:
                ow0.w1((ow0) this.f27685b, valueAnimator);
                return;
            case 24:
                qw0 qw0Var = (qw0) this.f27685b;
                qw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var.a();
                return;
            case 25:
                vx0 vx0Var = (vx0) this.f27685b;
                vx0Var.getClass();
                vx0Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vx0Var.invalidate();
                return;
            case 26:
                yx0 yx0Var = (yx0) this.f27685b;
                yx0Var.getClass();
                yx0Var.f35147i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.f35141a.invalidate();
                return;
            case 27:
                l11 l11Var = (l11) this.f27685b;
                l11Var.getClass();
                l11Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.invalidate();
                return;
            case 28:
                m21 m21Var = (m21) this.f27685b;
                m21Var.getClass();
                m21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m21Var.n();
                return;
            default:
                d41 d41Var = (d41) this.f27685b;
                d41Var.getClass();
                d41Var.f27656x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.invalidate();
                return;
        }
    }
}
