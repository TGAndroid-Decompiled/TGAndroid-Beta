package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25596a;
    public final Object f25597b;

    public i70(Object obj, int i10) {
        this.f25596a = i10;
        this.f25597b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f25596a) {
            case 0:
                ((m70) this.f25597b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                m80 m80Var = (m80) this.f25597b;
                m80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m80Var.f26980s = floatValue;
                m80Var.d(floatValue);
                return;
            case 2:
                vd0 vd0Var = ((pd0) this.f25597b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd0Var.M = floatValue2;
                vd0Var.f(floatValue2);
                return;
            case 3:
                ((lg0) this.f25597b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ph0 ph0Var = (ph0) this.f25597b;
                ph0Var.E.E = AndroidUtilities.lerp(ph0Var.G, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                yj0 yj0Var = (yj0) this.f25597b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj0Var.e.setAlpha(floatValue3);
                yj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                pk0 pk0Var = (pk0) this.f25597b;
                pk0Var.f27925y0 = ((Float) pk0Var.f27919v0.getAnimatedValue()).floatValue();
                ah.d dVar = pk0Var.P;
                if (dVar != null) {
                    dVar.invalidate();
                }
                pk0Var.invalidate();
                return;
            case 7:
                pr prVar = (pr) this.f25597b;
                prVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                prVar.setScaleX(floatValue4);
                prVar.setScaleY(floatValue4);
                ((pk0) prVar.f27970c).P.invalidate();
                return;
            case 8:
                ((q0.a) this.f25597b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                nk0 nk0Var = (nk0) this.f25597b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.F = floatValue5;
                mk0 mk0Var = nk0Var.f27300b;
                float f11 = 1.0f;
                if (nk0Var.f27306w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                mk0Var.setScaleY(floatValue5 * f10);
                float f12 = nk0Var.F;
                if (nk0Var.f27306w) {
                    f11 = 0.76f;
                }
                mk0Var.setScaleX(f12 * f11);
                return;
            case 10:
                yl0 yl0Var = (yl0) this.f25597b;
                yl0Var.getClass();
                yl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yl0Var.invalidateSelf();
                return;
            case 11:
                im0 im0Var = (im0) this.f25597b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.f25751r = floatValue6;
                im0Var.f25755y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                im0Var.f25755y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, im0Var.f25751r));
                im0Var.f25755y.setAlpha(im0Var.f25751r);
                im0Var.f25752s.invalidate();
                im0Var.v.invalidate();
                return;
            case 12:
                pm0 pm0Var = (pm0) this.f25597b;
                pm0Var.getClass();
                pm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pm0Var.j();
                return;
            case 13:
                ((pm0) ((mm0) this.f25597b).f27076b).invalidate();
                return;
            case 14:
                um0 um0Var = (um0) this.f25597b;
                um0Var.getClass();
                um0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                on0 on0Var = (on0) this.f25597b;
                on0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on0Var.C = floatValue7;
                on0Var.setShown(floatValue7);
                on0Var.b(false);
                return;
            case 16:
                ap0 ap0Var = (ap0) this.f25597b;
                ap0Var.getClass();
                ap0Var.f23489n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.invalidate();
                return;
            case 17:
                op0 op0Var = (op0) this.f25597b;
                lq0 lq0Var = op0Var.f27641b;
                lq0Var.f26863r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lq0Var.f26845c.invalidate();
                op0Var.invalidate();
                return;
            case 18:
                ((vt) this.f25597b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f25597b;
                yu0Var.M0(yu0Var.getTabProgress());
                return;
            case 20:
                ((qt0) this.f25597b).h.invalidate();
                return;
            case 21:
                fv0 fv0Var = (fv0) this.f25597b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                return;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.f25597b).f298c;
                qv0Var.f28274c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                return;
            case 23:
                xw0.w1((xw0) this.f25597b, valueAnimator);
                return;
            case 24:
                zw0 zw0Var = (zw0) this.f25597b;
                zw0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zw0Var.a();
                return;
            case 25:
                fy0 fy0Var = (fy0) this.f25597b;
                fy0Var.getClass();
                fy0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.invalidate();
                return;
            case 26:
                iy0 iy0Var = (iy0) this.f25597b;
                iy0Var.getClass();
                iy0Var.f25802i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iy0Var.f25797a.invalidate();
                return;
            case 27:
                w11 w11Var = (w11) this.f25597b;
                w11Var.getClass();
                w11Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w11Var.invalidate();
                return;
            case 28:
                w21 w21Var = (w21) this.f25597b;
                w21Var.getClass();
                w21Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                return;
            default:
                p41 p41Var = (p41) this.f25597b;
                p41Var.getClass();
                p41Var.f27737y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p41Var.invalidate();
                return;
        }
    }
}
