package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28136a;
    public final Object f28137b;

    public s70(Object obj, int i10) {
        this.f28136a = i10;
        this.f28137b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28136a) {
            case 0:
                ((w70) this.f28137b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                v80 v80Var = (v80) this.f28137b;
                v80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v80Var.f29030s = floatValue;
                v80Var.d(floatValue);
                return;
            case 2:
                de0 de0Var = ((yd0) this.f28137b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.P = floatValue2;
                de0Var.f(floatValue2);
                return;
            case 3:
                ((rg0) this.f28137b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                vh0 vh0Var = (vh0) this.f28137b;
                vh0Var.H.E = AndroidUtilities.lerp(vh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ck0 ck0Var = (ck0) this.f28137b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.e.setAlpha(floatValue3);
                ck0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                sk0 sk0Var = (sk0) this.f28137b;
                sk0Var.B0 = ((Float) sk0Var.f28269y0.getAnimatedValue()).floatValue();
                ci.n6 n6Var = sk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                sk0Var.invalidate();
                return;
            case 7:
                sr srVar = (sr) this.f28137b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((sk0) srVar.f28309c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f28137b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                qk0 qk0Var = (qk0) this.f28137b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.I = floatValue5;
                pk0 pk0Var = qk0Var.f27589b;
                float f10 = 1.0f;
                if (qk0Var.f27595w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                pk0Var.setScaleY(floatValue5 * f7);
                float f11 = qk0Var.I;
                if (qk0Var.f27595w) {
                    f10 = 0.76f;
                }
                pk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                dm0 dm0Var = (dm0) this.f28137b;
                dm0Var.getClass();
                dm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dm0Var.invalidateSelf();
                return;
            case 11:
                om0 om0Var = (om0) this.f28137b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om0Var.f27152r = floatValue6;
                om0Var.f27156y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                om0Var.f27156y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, om0Var.f27152r));
                om0Var.f27156y.setAlpha(om0Var.f27152r);
                om0Var.f27153s.invalidate();
                om0Var.v.invalidate();
                return;
            case 12:
                wm0 wm0Var = (wm0) this.f28137b;
                wm0Var.getClass();
                wm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm0Var.j();
                return;
            case 13:
                ((wm0) ((sm0) this.f28137b).f28278b).invalidate();
                return;
            case 14:
                an0 an0Var = (an0) this.f28137b;
                an0Var.getClass();
                an0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                wn0 wn0Var = (wn0) this.f28137b;
                wn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn0Var.F = floatValue7;
                wn0Var.setShown(floatValue7);
                wn0Var.b(false);
                return;
            case 16:
                lp0 lp0Var = (lp0) this.f28137b;
                lp0Var.getClass();
                lp0Var.f26162n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lp0Var.invalidate();
                return;
            case 17:
                aq0 aq0Var = (aq0) this.f28137b;
                wq0 wq0Var = aq0Var.f22712b;
                wq0Var.f30122u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wq0Var.f30100c.invalidate();
                aq0Var.invalidate();
                return;
            case 18:
                ((bu) this.f28137b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                lv0 lv0Var = (lv0) this.f28137b;
                lv0Var.M0(lv0Var.getTabProgress());
                return;
            case 20:
                ((eu0) this.f28137b).h.invalidate();
                return;
            case 21:
                sv0 sv0Var = (sv0) this.f28137b;
                sv0Var.getClass();
                sv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                return;
            case 22:
                cw0 cw0Var = (cw0) ((androidx.activity.g) this.f28137b).f1889c;
                cw0Var.f23466f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cw0Var.N();
                return;
            case 23:
                jx0.x1((jx0) this.f28137b, valueAnimator);
                return;
            case 24:
                lx0 lx0Var = (lx0) this.f28137b;
                lx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.a();
                return;
            case 25:
                qy0 qy0Var = (qy0) this.f28137b;
                qy0Var.getClass();
                qy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qy0Var.invalidate();
                return;
            case 26:
                ty0 ty0Var = (ty0) this.f28137b;
                ty0Var.getClass();
                ty0Var.f28566i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var.f28561a.invalidate();
                return;
            case 27:
                k21 k21Var = (k21) this.f28137b;
                k21Var.getClass();
                k21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k21Var.invalidate();
                return;
            case 28:
                n31 n31Var = (n31) this.f28137b;
                n31Var.getClass();
                n31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n31Var.n();
                return;
            default:
                f51 f51Var = (f51) this.f28137b;
                f51Var.getClass();
                f51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f51Var.invalidate();
                return;
        }
    }
}
