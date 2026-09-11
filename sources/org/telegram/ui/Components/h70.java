package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26624a;
    public final Object f26625b;

    public h70(Object obj, int i10) {
        this.f26624a = i10;
        this.f26625b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f26624a) {
            case 0:
                ((l70) this.f26625b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                k80 k80Var = (k80) this.f26625b;
                k80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k80Var.f27755s = floatValue;
                k80Var.d(floatValue);
                return;
            case 2:
                sd0 sd0Var = ((nd0) this.f26625b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue2;
                sd0Var.f(floatValue2);
                return;
            case 3:
                ((eg0) this.f26625b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ih0 ih0Var = (ih0) this.f26625b;
                ih0Var.H.E = AndroidUtilities.lerp(ih0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                pj0 pj0Var = (pj0) this.f26625b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var.f29400e.setAlpha(floatValue3);
                pj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                fk0 fk0Var = (fk0) this.f26625b;
                fk0Var.B0 = ((Float) fk0Var.f26121y0.getAnimatedValue()).floatValue();
                ah.w wVar = fk0Var.S;
                if (wVar != null) {
                    wVar.invalidate();
                }
                fk0Var.invalidate();
                return;
            case 7:
                rr rrVar = (rr) this.f26625b;
                rrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rrVar.setScaleX(floatValue4);
                rrVar.setScaleY(floatValue4);
                ((fk0) rrVar.f30076c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f26625b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                dk0 dk0Var = (dk0) this.f26625b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dk0Var.I = floatValue5;
                ck0 ck0Var = dk0Var.f25408b;
                float f10 = 1.0f;
                if (dk0Var.f25415w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ck0Var.setScaleY(floatValue5 * f7);
                float f11 = dk0Var.I;
                if (dk0Var.f25415w) {
                    f10 = 0.76f;
                }
                ck0Var.setScaleX(f11 * f10);
                return;
            case 10:
                ql0 ql0Var = (ql0) this.f26625b;
                ql0Var.getClass();
                ql0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ql0Var.invalidateSelf();
                return;
            case 11:
                am0 am0Var = (am0) this.f26625b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.f24423r = floatValue6;
                am0Var.f24427y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                am0Var.f24427y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, am0Var.f24423r));
                am0Var.f24427y.setAlpha(am0Var.f24423r);
                am0Var.f24424s.invalidate();
                am0Var.v.invalidate();
                return;
            case 12:
                im0 im0Var = (im0) this.f26625b;
                im0Var.getClass();
                im0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.j();
                return;
            case 13:
                ((im0) ((em0) this.f26625b).f25734b).invalidate();
                return;
            case 14:
                mm0 mm0Var = (mm0) this.f26625b;
                mm0Var.getClass();
                mm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                hn0 hn0Var = (hn0) this.f26625b;
                hn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.F = floatValue7;
                hn0Var.setShown(floatValue7);
                hn0Var.b(false);
                return;
            case 16:
                xo0 xo0Var = (xo0) this.f26625b;
                xo0Var.getClass();
                xo0Var.f32640n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xo0Var.invalidate();
                return;
            case 17:
                lp0 lp0Var = (lp0) this.f26625b;
                hq0 hq0Var = lp0Var.f28274b;
                hq0Var.f26813u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hq0Var.f26790c.invalidate();
                lp0Var.invalidate();
                return;
            case 18:
                ((zt) this.f26625b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                xu0 xu0Var = (xu0) this.f26625b;
                xu0Var.M0(xu0Var.getTabProgress());
                return;
            case 20:
                ((qt0) this.f26625b).h.invalidate();
                return;
            case 21:
                ev0 ev0Var = (ev0) this.f26625b;
                ev0Var.getClass();
                ev0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ev0Var.invalidate();
                return;
            case 22:
                ov0 ov0Var = (ov0) ((androidx.activity.g) this.f26625b).f862c;
                ov0Var.f29207f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ov0Var.N();
                return;
            case 23:
                vw0.v1((vw0) this.f26625b, valueAnimator);
                return;
            case 24:
                xw0 xw0Var = (xw0) this.f26625b;
                xw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xw0Var.a();
                return;
            case 25:
                cy0 cy0Var = (cy0) this.f26625b;
                cy0Var.getClass();
                cy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cy0Var.invalidate();
                return;
            case 26:
                fy0 fy0Var = (fy0) this.f26625b;
                fy0Var.getClass();
                fy0Var.f26200i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.f26194a.invalidate();
                return;
            case 27:
                t11 t11Var = (t11) this.f26625b;
                t11Var.getClass();
                t11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.invalidate();
                return;
            case 28:
                w21 w21Var = (w21) this.f26625b;
                w21Var.getClass();
                w21Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                return;
            default:
                o41 o41Var = (o41) this.f26625b;
                o41Var.getClass();
                o41Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.invalidate();
                return;
        }
    }
}
