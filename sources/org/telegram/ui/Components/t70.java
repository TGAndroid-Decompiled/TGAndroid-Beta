package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28479a;
    public final Object f28480b;

    public t70(Object obj, int i10) {
        this.f28479a = i10;
        this.f28480b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28479a) {
            case 0:
                ((x70) this.f28480b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                w80 w80Var = (w80) this.f28480b;
                w80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w80Var.f29929s = floatValue;
                w80Var.d(floatValue);
                return;
            case 2:
                de0 de0Var = ((yd0) this.f28480b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.P = floatValue2;
                de0Var.f(floatValue2);
                return;
            case 3:
                ((pg0) this.f28480b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                uh0 uh0Var = (uh0) this.f28480b;
                uh0Var.H.E = AndroidUtilities.lerp(uh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                bk0 bk0Var = (bk0) this.f28480b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bk0Var.e.setAlpha(floatValue3);
                bk0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                rk0 rk0Var = (rk0) this.f28480b;
                rk0Var.B0 = ((Float) rk0Var.f27991y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = rk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                rk0Var.invalidate();
                return;
            case 7:
                ur urVar = (ur) this.f28480b;
                urVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                urVar.setScaleX(floatValue4);
                urVar.setScaleY(floatValue4);
                ((rk0) urVar.f28895c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f28480b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                pk0 pk0Var = (pk0) this.f28480b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk0Var.I = floatValue5;
                ok0 ok0Var = pk0Var.f27408b;
                float f10 = 1.0f;
                if (pk0Var.f27414w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ok0Var.setScaleY(floatValue5 * f7);
                float f11 = pk0Var.I;
                if (pk0Var.f27414w) {
                    f10 = 0.76f;
                }
                ok0Var.setScaleX(f11 * f10);
                return;
            case 10:
                cm0 cm0Var = (cm0) this.f28480b;
                cm0Var.getClass();
                cm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cm0Var.invalidateSelf();
                return;
            case 11:
                nm0 nm0Var = (nm0) this.f28480b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nm0Var.f26842r = floatValue6;
                nm0Var.f26846y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                nm0Var.f26846y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, nm0Var.f26842r));
                nm0Var.f26846y.setAlpha(nm0Var.f26842r);
                nm0Var.f26843s.invalidate();
                nm0Var.v.invalidate();
                return;
            case 12:
                vm0 vm0Var = (vm0) this.f28480b;
                vm0Var.getClass();
                vm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.j();
                return;
            case 13:
                ((vm0) ((rm0) this.f28480b).f28009b).invalidate();
                return;
            case 14:
                zm0 zm0Var = (zm0) this.f28480b;
                zm0Var.getClass();
                zm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                vn0 vn0Var = (vn0) this.f28480b;
                vn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn0Var.F = floatValue7;
                vn0Var.setShown(floatValue7);
                vn0Var.b(false);
                return;
            case 16:
                kp0 kp0Var = (kp0) this.f28480b;
                kp0Var.getClass();
                kp0Var.f25773n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kp0Var.invalidate();
                return;
            case 17:
                zp0 zp0Var = (zp0) this.f28480b;
                vq0 vq0Var = zp0Var.f30938b;
                vq0Var.f29740u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vq0Var.f29718c.invalidate();
                zp0Var.invalidate();
                return;
            case 18:
                ((du) this.f28480b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                kv0 kv0Var = (kv0) this.f28480b;
                kv0Var.M0(kv0Var.getTabProgress());
                return;
            case 20:
                ((du0) this.f28480b).h.invalidate();
                return;
            case 21:
                rv0 rv0Var = (rv0) this.f28480b;
                rv0Var.getClass();
                rv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv0Var.invalidate();
                return;
            case 22:
                bw0 bw0Var = (bw0) ((androidx.activity.g) this.f28480b).f1882c;
                bw0Var.f23128f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.N();
                return;
            case 23:
                hx0.w1((hx0) this.f28480b, valueAnimator);
                return;
            case 24:
                jx0 jx0Var = (jx0) this.f28480b;
                jx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.a();
                return;
            case 25:
                oy0 oy0Var = (oy0) this.f28480b;
                oy0Var.getClass();
                oy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oy0Var.invalidate();
                return;
            case 26:
                ry0 ry0Var = (ry0) this.f28480b;
                ry0Var.getClass();
                ry0Var.f28093i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry0Var.f28088a.invalidate();
                return;
            case 27:
                i21 i21Var = (i21) this.f28480b;
                i21Var.getClass();
                i21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i21Var.invalidate();
                return;
            case 28:
                l31 l31Var = (l31) this.f28480b;
                l31Var.getClass();
                l31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.n();
                return;
            default:
                d51 d51Var = (d51) this.f28480b;
                d51Var.getClass();
                d51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d51Var.invalidate();
                return;
        }
    }
}
