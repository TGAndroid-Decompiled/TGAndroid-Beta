package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27477a;
    public final Object f27478b;

    public q70(Object obj, int i10) {
        this.f27477a = i10;
        this.f27478b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f27477a) {
            case 0:
                ((u70) this.f27478b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                t80 t80Var = (t80) this.f27478b;
                t80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t80Var.f28353s = floatValue;
                t80Var.d(floatValue);
                return;
            case 2:
                be0 be0Var = ((wd0) this.f27478b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.P = floatValue2;
                be0Var.f(floatValue2);
                return;
            case 3:
                ((pg0) this.f27478b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                th0 th0Var = (th0) this.f27478b;
                th0Var.H.E = AndroidUtilities.lerp(th0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ak0 ak0Var = (ak0) this.f27478b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ak0Var.e.setAlpha(floatValue3);
                ak0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                qk0 qk0Var = (qk0) this.f27478b;
                qk0Var.B0 = ((Float) qk0Var.f27677y0.getAnimatedValue()).floatValue();
                ci.n6 n6Var = qk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                qk0Var.invalidate();
                return;
            case 7:
                sr srVar = (sr) this.f27478b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((qk0) srVar.f28224c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f27478b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                ok0 ok0Var = (ok0) this.f27478b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok0Var.I = floatValue5;
                nk0 nk0Var = ok0Var.f26974b;
                float f10 = 1.0f;
                if (ok0Var.f26980w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                nk0Var.setScaleY(floatValue5 * f7);
                float f11 = ok0Var.I;
                if (ok0Var.f26980w) {
                    f10 = 0.76f;
                }
                nk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                bm0 bm0Var = (bm0) this.f27478b;
                bm0Var.getClass();
                bm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm0Var.invalidateSelf();
                return;
            case 11:
                nm0 nm0Var = (nm0) this.f27478b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nm0Var.f26731r = floatValue6;
                nm0Var.f26735y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                nm0Var.f26735y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, nm0Var.f26731r));
                nm0Var.f26735y.setAlpha(nm0Var.f26731r);
                nm0Var.f26732s.invalidate();
                nm0Var.v.invalidate();
                return;
            case 12:
                vm0 vm0Var = (vm0) this.f27478b;
                vm0Var.getClass();
                vm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.j();
                return;
            case 13:
                ((vm0) ((rm0) this.f27478b).f27933b).invalidate();
                return;
            case 14:
                zm0 zm0Var = (zm0) this.f27478b;
                zm0Var.getClass();
                zm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                vn0 vn0Var = (vn0) this.f27478b;
                vn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn0Var.F = floatValue7;
                vn0Var.setShown(floatValue7);
                vn0Var.b(false);
                return;
            case 16:
                kp0 kp0Var = (kp0) this.f27478b;
                kp0Var.getClass();
                kp0Var.f25773n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kp0Var.invalidate();
                return;
            case 17:
                zp0 zp0Var = (zp0) this.f27478b;
                vq0 vq0Var = zp0Var.f30855b;
                vq0Var.f29737u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vq0Var.f29715c.invalidate();
                zp0Var.invalidate();
                return;
            case 18:
                ((bu) this.f27478b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                kv0 kv0Var = (kv0) this.f27478b;
                kv0Var.M0(kv0Var.getTabProgress());
                return;
            case 20:
                ((du0) this.f27478b).h.invalidate();
                return;
            case 21:
                rv0 rv0Var = (rv0) this.f27478b;
                rv0Var.getClass();
                rv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv0Var.invalidate();
                return;
            case 22:
                bw0 bw0Var = (bw0) ((androidx.activity.g) this.f27478b).f1890c;
                bw0Var.f23099f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.N();
                return;
            case 23:
                ix0.x1((ix0) this.f27478b, valueAnimator);
                return;
            case 24:
                kx0 kx0Var = (kx0) this.f27478b;
                kx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.a();
                return;
            case 25:
                py0 py0Var = (py0) this.f27478b;
                py0Var.getClass();
                py0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                py0Var.invalidate();
                return;
            case 26:
                sy0 sy0Var = (sy0) this.f27478b;
                sy0Var.getClass();
                sy0Var.f28255i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.f28250a.invalidate();
                return;
            case 27:
                j21 j21Var = (j21) this.f27478b;
                j21Var.getClass();
                j21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j21Var.invalidate();
                return;
            case 28:
                m31 m31Var = (m31) this.f27478b;
                m31Var.getClass();
                m31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.n();
                return;
            default:
                e51 e51Var = (e51) this.f27478b;
                e51Var.getClass();
                e51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e51Var.invalidate();
                return;
        }
    }
}
