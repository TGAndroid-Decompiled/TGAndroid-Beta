package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27632a;
    public final Object f27633b;

    public j80(Object obj, int i10) {
        this.f27632a = i10;
        this.f27633b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f27632a) {
            case 0:
                p80 p80Var = (p80) this.f27633b;
                p80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n80 n80Var = p80Var.f29793x;
                if (n80Var != null) {
                    n80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((n80) this.f27633b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                m90 m90Var = (m90) this.f27633b;
                m90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m90Var.f28786s = floatValue2;
                m90Var.d(floatValue2);
                return;
            case 3:
                te0 te0Var = ((oe0) this.f27633b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te0Var.T = floatValue3;
                te0Var.g(floatValue3);
                return;
            case 4:
                ((gh0) this.f27633b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ni0 ni0Var = (ni0) this.f27633b;
                ni0Var.H.E = AndroidUtilities.lerp(ni0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                uk0 uk0Var = (uk0) this.f27633b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uk0Var.f31524e.setAlpha(floatValue4);
                uk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                kl0 kl0Var = (kl0) this.f27633b;
                kl0Var.B0 = ((Float) kl0Var.f28108y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = kl0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                kl0Var.invalidate();
                return;
            case 8:
                js jsVar = (js) this.f27633b;
                jsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jsVar.setScaleX(floatValue5);
                jsVar.setScaleY(floatValue5);
                ((kl0) jsVar.f27775c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f27633b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                il0 il0Var = (il0) this.f27633b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                il0Var.I = floatValue6;
                hl0 hl0Var = il0Var.f27421b;
                float f10 = 1.0f;
                if (il0Var.f27428w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                hl0Var.setScaleY(floatValue6 * f7);
                float f11 = il0Var.I;
                if (il0Var.f27428w) {
                    f10 = 0.76f;
                }
                hl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                vm0 vm0Var = (vm0) this.f27633b;
                vm0Var.getClass();
                vm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.invalidateSelf();
                return;
            case 12:
                gn0 gn0Var = (gn0) this.f27633b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.f26821r = floatValue7;
                gn0Var.f26825y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                gn0Var.f26825y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, gn0Var.f26821r));
                gn0Var.f26825y.setAlpha(gn0Var.f26821r);
                gn0Var.f26822s.invalidate();
                gn0Var.v.invalidate();
                return;
            case 13:
                on0 on0Var = (on0) this.f27633b;
                on0Var.getClass();
                on0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on0Var.j();
                return;
            case 14:
                ((on0) ((kn0) this.f27633b).f28114b).invalidate();
                return;
            case 15:
                sn0 sn0Var = (sn0) this.f27633b;
                sn0Var.getClass();
                sn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                no0 no0Var = (no0) this.f27633b;
                no0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                no0Var.F = floatValue8;
                no0Var.setShown(floatValue8);
                no0Var.b(false);
                return;
            case 17:
                bq0 bq0Var = (bq0) this.f27633b;
                bq0Var.getClass();
                bq0Var.f25091n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bq0Var.invalidate();
                return;
            case 18:
                qq0 qq0Var = (qq0) this.f27633b;
                mr0 mr0Var = qq0Var.f30250b;
                mr0Var.f28919u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mr0Var.f28896c.invalidate();
                qq0Var.invalidate();
                return;
            case 19:
                ((ru) this.f27633b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                bw0 bw0Var = (bw0) this.f27633b;
                bw0Var.M0(bw0Var.getTabProgress());
                return;
            case 21:
                ((uu0) this.f27633b).h.invalidate();
                return;
            case 22:
                iw0 iw0Var = (iw0) this.f27633b;
                iw0Var.getClass();
                iw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.invalidate();
                return;
            case 23:
                sw0 sw0Var = (sw0) ((androidx.activity.g) this.f27633b).f2128c;
                sw0Var.f30926f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var.N();
                return;
            case 24:
                yx0.x1((yx0) this.f27633b, valueAnimator);
                return;
            case 25:
                ay0 ay0Var = (ay0) this.f27633b;
                ay0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ay0Var.a();
                return;
            case 26:
                ez0 ez0Var = (ez0) this.f27633b;
                ez0Var.getClass();
                ez0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var.invalidate();
                return;
            case 27:
                hz0 hz0Var = (hz0) this.f27633b;
                hz0Var.getClass();
                hz0Var.f27165i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hz0Var.f27159a.invalidate();
                return;
            case 28:
                z21 z21Var = (z21) this.f27633b;
                z21Var.getClass();
                z21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var.invalidate();
                return;
            default:
                c41 c41Var = (c41) this.f27633b;
                c41Var.getClass();
                c41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.o();
                return;
        }
    }
}
