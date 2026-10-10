package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27928a;
    public final Object f27929b;

    public k80(Object obj, int i10) {
        this.f27928a = i10;
        this.f27929b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f27928a) {
            case 0:
                q80 q80Var = (q80) this.f27929b;
                q80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o80 o80Var = q80Var.f30124x;
                if (o80Var != null) {
                    o80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((o80) this.f27929b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                n90 n90Var = (n90) this.f27929b;
                n90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n90Var.f29080s = floatValue2;
                n90Var.d(floatValue2);
                return;
            case 3:
                ue0 ue0Var = ((pe0) this.f27929b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue0Var.T = floatValue3;
                ue0Var.g(floatValue3);
                return;
            case 4:
                ((hh0) this.f27929b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                oi0 oi0Var = (oi0) this.f27929b;
                oi0Var.H.E = AndroidUtilities.lerp(oi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                vk0 vk0Var = (vk0) this.f27929b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vk0Var.f31873e.setAlpha(floatValue4);
                vk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                ll0 ll0Var = (ll0) this.f27929b;
                ll0Var.B0 = ((Float) ll0Var.f28423y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = ll0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                ll0Var.invalidate();
                return;
            case 8:
                ks ksVar = (ks) this.f27929b;
                ksVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ksVar.setScaleX(floatValue5);
                ksVar.setScaleY(floatValue5);
                ((ll0) ksVar.f28094c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f27929b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                jl0 jl0Var = (jl0) this.f27929b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jl0Var.I = floatValue6;
                il0 il0Var = jl0Var.f27718b;
                float f10 = 1.0f;
                if (jl0Var.f27725w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                il0Var.setScaleY(floatValue6 * f7);
                float f11 = jl0Var.I;
                if (jl0Var.f27725w) {
                    f10 = 0.76f;
                }
                il0Var.setScaleX(f11 * f10);
                return;
            case 11:
                wm0 wm0Var = (wm0) this.f27929b;
                wm0Var.getClass();
                wm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm0Var.invalidateSelf();
                return;
            case 12:
                hn0 hn0Var = (hn0) this.f27929b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.f27091r = floatValue7;
                hn0Var.f27095y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                hn0Var.f27095y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hn0Var.f27091r));
                hn0Var.f27095y.setAlpha(hn0Var.f27091r);
                hn0Var.f27092s.invalidate();
                hn0Var.v.invalidate();
                return;
            case 13:
                pn0 pn0Var = (pn0) this.f27929b;
                pn0Var.getClass();
                pn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.j();
                return;
            case 14:
                ((pn0) ((ln0) this.f27929b).f28432b).invalidate();
                return;
            case 15:
                tn0 tn0Var = (tn0) this.f27929b;
                tn0Var.getClass();
                tn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                oo0 oo0Var = (oo0) this.f27929b;
                oo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oo0Var.F = floatValue8;
                oo0Var.setShown(floatValue8);
                oo0Var.b(false);
                return;
            case 17:
                cq0 cq0Var = (cq0) this.f27929b;
                cq0Var.getClass();
                cq0Var.f25383n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.invalidate();
                return;
            case 18:
                rq0 rq0Var = (rq0) this.f27929b;
                nr0 nr0Var = rq0Var.f30550b;
                nr0Var.f29216u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nr0Var.f29193c.invalidate();
                rq0Var.invalidate();
                return;
            case 19:
                ((su) this.f27929b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                cw0 cw0Var = (cw0) this.f27929b;
                cw0Var.M0(cw0Var.getTabProgress());
                return;
            case 21:
                ((vu0) this.f27929b).h.invalidate();
                return;
            case 22:
                jw0 jw0Var = (jw0) this.f27929b;
                jw0Var.getClass();
                jw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.invalidate();
                return;
            case 23:
                tw0 tw0Var = (tw0) ((androidx.activity.g) this.f27929b).f2128c;
                tw0Var.f31252f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var.N();
                return;
            case 24:
                zx0.x1((zx0) this.f27929b, valueAnimator);
                return;
            case 25:
                by0 by0Var = (by0) this.f27929b;
                by0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by0Var.a();
                return;
            case 26:
                fz0 fz0Var = (fz0) this.f27929b;
                fz0Var.getClass();
                fz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz0Var.invalidate();
                return;
            case 27:
                iz0 iz0Var = (iz0) this.f27929b;
                iz0Var.getClass();
                iz0Var.f27482i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iz0Var.f27476a.invalidate();
                return;
            case 28:
                a31 a31Var = (a31) this.f27929b;
                a31Var.getClass();
                a31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a31Var.invalidate();
                return;
            default:
                d41 d41Var = (d41) this.f27929b;
                d41Var.getClass();
                d41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.o();
                return;
        }
    }
}
