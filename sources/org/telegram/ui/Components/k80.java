package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27866a;
    public final Object f27867b;

    public k80(Object obj, int i10) {
        this.f27866a = i10;
        this.f27867b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f27866a) {
            case 0:
                q80 q80Var = (q80) this.f27867b;
                q80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o80 o80Var = q80Var.f30087x;
                if (o80Var != null) {
                    o80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((o80) this.f27867b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                n90 n90Var = (n90) this.f27867b;
                n90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n90Var.f29014s = floatValue2;
                n90Var.d(floatValue2);
                return;
            case 3:
                ue0 ue0Var = ((pe0) this.f27867b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue0Var.T = floatValue3;
                ue0Var.g(floatValue3);
                return;
            case 4:
                ((ih0) this.f27867b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                pi0 pi0Var = (pi0) this.f27867b;
                pi0Var.H.E = AndroidUtilities.lerp(pi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                wk0 wk0Var = (wk0) this.f27867b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wk0Var.f32666e.setAlpha(floatValue4);
                wk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                ml0 ml0Var = (ml0) this.f27867b;
                ml0Var.B0 = ((Float) ml0Var.f28794y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = ml0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                ml0Var.invalidate();
                return;
            case 8:
                ks ksVar = (ks) this.f27867b;
                ksVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ksVar.setScaleX(floatValue5);
                ksVar.setScaleY(floatValue5);
                ((ml0) ksVar.f28076c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f27867b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                kl0 kl0Var = (kl0) this.f27867b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kl0Var.I = floatValue6;
                jl0 jl0Var = kl0Var.f28031b;
                float f10 = 1.0f;
                if (kl0Var.f28038w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                jl0Var.setScaleY(floatValue6 * f7);
                float f11 = kl0Var.I;
                if (kl0Var.f28038w) {
                    f10 = 0.76f;
                }
                jl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                xm0 xm0Var = (xm0) this.f27867b;
                xm0Var.getClass();
                xm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xm0Var.invalidateSelf();
                return;
            case 12:
                in0 in0Var = (in0) this.f27867b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in0Var.f27404r = floatValue7;
                in0Var.f27408y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                in0Var.f27408y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, in0Var.f27404r));
                in0Var.f27408y.setAlpha(in0Var.f27404r);
                in0Var.f27405s.invalidate();
                in0Var.v.invalidate();
                return;
            case 13:
                qn0 qn0Var = (qn0) this.f27867b;
                qn0Var.getClass();
                qn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn0Var.j();
                return;
            case 14:
                ((qn0) ((mn0) this.f27867b).f28805b).invalidate();
                return;
            case 15:
                un0 un0Var = (un0) this.f27867b;
                un0Var.getClass();
                un0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                po0 po0Var = (po0) this.f27867b;
                po0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                po0Var.F = floatValue8;
                po0Var.setShown(floatValue8);
                po0Var.b(false);
                return;
            case 17:
                dq0 dq0Var = (dq0) this.f27867b;
                dq0Var.getClass();
                dq0Var.f25664n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dq0Var.invalidate();
                return;
            case 18:
                sq0 sq0Var = (sq0) this.f27867b;
                or0 or0Var = sq0Var.f30845b;
                or0Var.f29501u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                or0Var.f29478c.invalidate();
                sq0Var.invalidate();
                return;
            case 19:
                ((su) this.f27867b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                dw0 dw0Var = (dw0) this.f27867b;
                dw0Var.M0(dw0Var.getTabProgress());
                return;
            case 21:
                ((wu0) this.f27867b).h.invalidate();
                return;
            case 22:
                kw0 kw0Var = (kw0) this.f27867b;
                kw0Var.getClass();
                kw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kw0Var.invalidate();
                return;
            case 23:
                uw0 uw0Var = (uw0) ((androidx.activity.g) this.f27867b).f2128c;
                uw0Var.f31587f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uw0Var.N();
                return;
            case 24:
                ay0.x1((ay0) this.f27867b, valueAnimator);
                return;
            case 25:
                cy0 cy0Var = (cy0) this.f27867b;
                cy0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cy0Var.a();
                return;
            case 26:
                gz0 gz0Var = (gz0) this.f27867b;
                gz0Var.getClass();
                gz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gz0Var.invalidate();
                return;
            case 27:
                jz0 jz0Var = (jz0) this.f27867b;
                jz0Var.getClass();
                jz0Var.f27787i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jz0Var.f27781a.invalidate();
                return;
            case 28:
                b31 b31Var = (b31) this.f27867b;
                b31Var.getClass();
                b31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var.invalidate();
                return;
            default:
                e41 e41Var = (e41) this.f27867b;
                e41Var.getClass();
                e41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var.o();
                return;
        }
    }
}
