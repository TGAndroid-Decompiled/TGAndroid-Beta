package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28316a;
    public final Object f28317b;

    public k70(Object obj, int i10) {
        this.f28316a = i10;
        this.f28317b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f28316a) {
            case 0:
                ((o70) this.f28317b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                n80 n80Var = (n80) this.f28317b;
                n80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n80Var.f29420s = floatValue;
                n80Var.d(floatValue);
                return;
            case 2:
                xd0 xd0Var = ((rd0) this.f28317b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.M = floatValue2;
                xd0Var.f(floatValue2);
                return;
            case 3:
                ((ng0) this.f28317b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                rh0 rh0Var = (rh0) this.f28317b;
                rh0Var.E.E = AndroidUtilities.lerp(rh0Var.G, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                zj0 zj0Var = (zj0) this.f28317b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj0Var.f33952e.setAlpha(floatValue3);
                zj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                qk0 qk0Var = (qk0) this.f28317b;
                qk0Var.f30464y0 = ((Float) qk0Var.f30458v0.getAnimatedValue()).floatValue();
                ag.l lVar = qk0Var.P;
                if (lVar != null) {
                    lVar.invalidate();
                }
                qk0Var.invalidate();
                return;
            case 7:
                rr rrVar = (rr) this.f28317b;
                rrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rrVar.setScaleX(floatValue4);
                rrVar.setScaleY(floatValue4);
                ((qk0) rrVar.f30878c).P.invalidate();
                return;
            case 8:
                ((q0.a) this.f28317b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                ok0 ok0Var = (ok0) this.f28317b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok0Var.F = floatValue5;
                nk0 nk0Var = ok0Var.f29792b;
                float f11 = 1.0f;
                if (ok0Var.f29799w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                nk0Var.setScaleY(floatValue5 * f10);
                float f12 = ok0Var.F;
                if (ok0Var.f29799w) {
                    f11 = 0.76f;
                }
                nk0Var.setScaleX(f12 * f11);
                return;
            case 10:
                yl0 yl0Var = (yl0) this.f28317b;
                yl0Var.getClass();
                yl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yl0Var.invalidateSelf();
                return;
            case 11:
                im0 im0Var = (im0) this.f28317b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.f27863r = floatValue6;
                im0Var.f27867y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                im0Var.f27867y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, im0Var.f27863r));
                im0Var.f27867y.setAlpha(im0Var.f27863r);
                im0Var.f27864s.invalidate();
                im0Var.v.invalidate();
                return;
            case 12:
                pm0 pm0Var = (pm0) this.f28317b;
                pm0Var.getClass();
                pm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pm0Var.j();
                return;
            case 13:
                ((pm0) ((mm0) this.f28317b).f29180b).invalidate();
                return;
            case 14:
                um0 um0Var = (um0) this.f28317b;
                um0Var.getClass();
                um0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                on0 on0Var = (on0) this.f28317b;
                on0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on0Var.C = floatValue7;
                on0Var.setShown(floatValue7);
                on0Var.b(false);
                return;
            case 16:
                ap0 ap0Var = (ap0) this.f28317b;
                ap0Var.getClass();
                ap0Var.f25342n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.invalidate();
                return;
            case 17:
                op0 op0Var = (op0) this.f28317b;
                lq0 lq0Var = op0Var.f29863b;
                lq0Var.f28847r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lq0Var.f28828c.invalidate();
                op0Var.invalidate();
                return;
            case 18:
                ((xt) this.f28317b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f28317b;
                yu0Var.M0(yu0Var.getTabProgress());
                return;
            case 20:
                ((qt0) this.f28317b).h.invalidate();
                return;
            case 21:
                fv0 fv0Var = (fv0) this.f28317b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                return;
            case 22:
                pv0 pv0Var = (pv0) ((androidx.activity.g) this.f28317b).f335c;
                pv0Var.f30201c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.N();
                return;
            case 23:
                xw0.v1((xw0) this.f28317b, valueAnimator);
                return;
            case 24:
                zw0 zw0Var = (zw0) this.f28317b;
                zw0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zw0Var.a();
                return;
            case 25:
                fy0 fy0Var = (fy0) this.f28317b;
                fy0Var.getClass();
                fy0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.invalidate();
                return;
            case 26:
                iy0 iy0Var = (iy0) this.f28317b;
                iy0Var.getClass();
                iy0Var.f27916i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iy0Var.f27910a.invalidate();
                return;
            case 27:
                w11 w11Var = (w11) this.f28317b;
                w11Var.getClass();
                w11Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w11Var.invalidate();
                return;
            case 28:
                w21 w21Var = (w21) this.f28317b;
                w21Var.getClass();
                w21Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                return;
            default:
                o41 o41Var = (o41) this.f28317b;
                o41Var.getClass();
                o41Var.f29662y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.invalidate();
                return;
        }
    }
}
