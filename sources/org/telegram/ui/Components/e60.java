package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34620a;
    public final Object f34621b;

    public e60(Object obj, int i7) {
        this.f34620a = i7;
        this.f34621b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f34620a) {
            case 0:
                j60 j60Var = ((i60) this.f34621b).f36066e;
                j60Var.f36356f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j60Var.f30192b.invalidate();
                return;
            case 1:
                y60 y60Var = (y60) this.f34621b;
                y60Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u60 u60Var = y60Var.f42381x;
                if (u60Var != null) {
                    u60Var.setProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ((u60) this.f34621b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                t70 t70Var = (t70) this.f34621b;
                t70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t70Var.f39938s = floatValue2;
                t70Var.d(floatValue2);
                return;
            case 4:
                pc0 pc0Var = ((jc0) this.f34621b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0Var.f38363b0 = floatValue3;
                pc0Var.h(floatValue3);
                return;
            case 5:
                ag0 ag0Var = (ag0) this.f34621b;
                ag0Var.I.E = org.telegram.messenger.g0.T1(ag0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                ei0 ei0Var = (ei0) this.f34621b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0Var.f34713e.setAlpha(floatValue4);
                ei0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                vi0 vi0Var = (vi0) this.f34621b;
                vi0Var.C0 = ((Float) vi0Var.f40684z0.getAnimatedValue()).floatValue();
                ai.k0 k0Var = vi0Var.T;
                if (k0Var != null) {
                    k0Var.invalidate();
                }
                vi0Var.invalidate();
                return;
            case 8:
                nr nrVar = (nr) this.f34621b;
                nrVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nrVar.setScaleX(floatValue5);
                nrVar.setScaleY(floatValue5);
                ((vi0) nrVar.f37846c).T.invalidate();
                return;
            case 9:
                ((q0.a) this.f34621b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                ti0 ti0Var = (ti0) this.f34621b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0Var.J = floatValue6;
                si0 si0Var = ti0Var.f40010b;
                float f11 = 1.0f;
                if (ti0Var.f40018x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                si0Var.setScaleY(floatValue6 * f10);
                float f12 = ti0Var.J;
                if (ti0Var.f40018x) {
                    f11 = 0.76f;
                }
                si0Var.setScaleX(f12 * f11);
                return;
            case 11:
                kk0 kk0Var = (kk0) this.f34621b;
                kk0Var.getClass();
                kk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kk0Var.invalidateSelf();
                return;
            case 12:
                wk0 wk0Var = (wk0) this.f34621b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wk0Var.f41730r = floatValue7;
                wk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                wk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, wk0Var.f41730r));
                wk0Var.E.setAlpha(wk0Var.f41730r);
                wk0Var.f41731s.invalidate();
                wk0Var.f41732w.invalidate();
                return;
            case 13:
                el0 el0Var = (el0) this.f34621b;
                el0Var.getClass();
                el0Var.f34762w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.j();
                return;
            case 14:
                ((el0) ((al0) this.f34621b).f33363b).invalidate();
                return;
            case 15:
                il0 il0Var = (il0) this.f34621b;
                il0Var.getClass();
                il0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                cm0 cm0Var = (cm0) this.f34621b;
                cm0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cm0Var.G = floatValue8;
                cm0Var.setShown(floatValue8);
                cm0Var.b(false);
                return;
            case 17:
                pn0 pn0Var = (pn0) this.f34621b;
                pn0Var.getClass();
                pn0Var.f38500n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.invalidate();
                return;
            case 18:
                do0 do0Var = (do0) this.f34621b;
                yo0 yo0Var = do0Var.f34472b;
                yo0Var.f42572q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yo0Var.n1.invalidate();
                do0Var.invalidate();
                return;
            case 19:
                ((mt) this.f34621b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                gt0 gt0Var = (gt0) this.f34621b;
                gt0Var.Z0(gt0Var.getTabProgress());
                return;
            case 21:
                ((bs0) this.f34621b).h.invalidate();
                return;
            case 22:
                rt0 rt0Var = (rt0) this.f34621b;
                rt0Var.getClass();
                rt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rt0Var.invalidate();
                return;
            case 23:
                iv0.z1((iv0) this.f34621b, valueAnimator);
                return;
            case 24:
                kv0 kv0Var = (kv0) this.f34621b;
                kv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kv0Var.a();
                return;
            case 25:
                pw0 pw0Var = (pw0) this.f34621b;
                pw0Var.getClass();
                pw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pw0Var.invalidate();
                return;
            case 26:
                sw0 sw0Var = (sw0) this.f34621b;
                sw0Var.getClass();
                sw0Var.f39859i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var.f39853a.invalidate();
                return;
            case 27:
                j01 j01Var = (j01) this.f34621b;
                j01Var.getClass();
                j01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j01Var.invalidate();
                return;
            case 28:
                z11 z11Var = (z11) this.f34621b;
                z11Var.getClass();
                z11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.p();
                return;
            default:
                s31 s31Var = (s31) this.f34621b;
                s31Var.getClass();
                s31Var.f39477l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s31Var.invalidate();
                return;
        }
    }
}
