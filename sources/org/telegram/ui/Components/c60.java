package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32430a;
    public final Object f32431b;

    public c60(Object obj, int i7) {
        this.f32430a = i7;
        this.f32431b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f32430a) {
            case 0:
                ((i60) this.f32431b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                f70 f70Var = (f70) this.f32431b;
                f70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f70Var.f33499s = floatValue;
                f70Var.d(floatValue);
                return;
            case 2:
                ec0 ec0Var = ((yb0) this.f32431b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0Var.f33199a0 = floatValue2;
                ec0Var.h(floatValue2);
                return;
            case 3:
                nf0 nf0Var = (nf0) this.f32431b;
                nf0Var.H.E = org.telegram.messenger.g0.T1(nf0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 4:
                rh0 rh0Var = (rh0) this.f32431b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh0Var.f37739e.setAlpha(floatValue3);
                rh0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 5:
                ii0 ii0Var = (ii0) this.f32431b;
                ii0Var.B0 = ((Float) ii0Var.f34687y0.getAnimatedValue()).floatValue();
                bi.x5 x5Var = ii0Var.S;
                if (x5Var != null) {
                    x5Var.invalidate();
                }
                ii0Var.invalidate();
                return;
            case 6:
                zq zqVar = (zq) this.f32431b;
                zqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.setScaleX(floatValue4);
                zqVar.setScaleY(floatValue4);
                ((ii0) zqVar.f41061c).S.invalidate();
                return;
            case 7:
                ((q0.a) this.f32431b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 8:
                gi0 gi0Var = (gi0) this.f32431b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.I = floatValue5;
                fi0 fi0Var = gi0Var.f33968b;
                float f11 = 1.0f;
                if (gi0Var.f33976x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                fi0Var.setScaleY(floatValue5 * f10);
                float f12 = gi0Var.I;
                if (gi0Var.f33976x) {
                    f11 = 0.76f;
                }
                fi0Var.setScaleX(f12 * f11);
                return;
            case 9:
                xj0 xj0Var = (xj0) this.f32431b;
                xj0Var.getClass();
                xj0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xj0Var.invalidateSelf();
                return;
            case 10:
                jk0 jk0Var = (jk0) this.f32431b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jk0Var.f35002r = floatValue6;
                jk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                jk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, jk0Var.f35002r));
                jk0Var.D.setAlpha(jk0Var.f35002r);
                jk0Var.f35003s.invalidate();
                jk0Var.f35004w.invalidate();
                return;
            case 11:
                rk0 rk0Var = (rk0) this.f32431b;
                rk0Var.getClass();
                rk0Var.f37795w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk0Var.j();
                return;
            case 12:
                ((rk0) ((nk0) this.f32431b).f36433b).invalidate();
                return;
            case 13:
                vk0 vk0Var = (vk0) this.f32431b;
                vk0Var.getClass();
                vk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                ql0 ql0Var = (ql0) this.f32431b;
                ql0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ql0Var.F = floatValue7;
                ql0Var.setShown(floatValue7);
                ql0Var.b(false);
                return;
            case 15:
                cn0 cn0Var = (cn0) this.f32431b;
                cn0Var.getClass();
                cn0Var.f32623n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn0Var.invalidate();
                return;
            case 16:
                rn0 rn0Var = (rn0) this.f32431b;
                mo0 mo0Var = rn0Var.f37810b;
                mo0Var.f36069m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mo0Var.f36063j1.invalidate();
                rn0Var.invalidate();
                return;
            case 17:
                ((ys) this.f32431b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                xs0 xs0Var = (xs0) this.f32431b;
                xs0Var.X0(xs0Var.getTabProgress());
                return;
            case 19:
                ((sr0) this.f32431b).h.invalidate();
                return;
            case 20:
                it0 it0Var = (it0) this.f32431b;
                it0Var.getClass();
                it0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                it0Var.invalidate();
                return;
            case 21:
                yu0.z1((yu0) this.f32431b, valueAnimator);
                return;
            case 22:
                av0 av0Var = (av0) this.f32431b;
                av0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                av0Var.a();
                return;
            case 23:
                fw0 fw0Var = (fw0) this.f32431b;
                fw0Var.getClass();
                fw0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fw0Var.invalidate();
                return;
            case 24:
                iw0 iw0Var = (iw0) this.f32431b;
                iw0Var.getClass();
                iw0Var.f34813i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.f34807a.invalidate();
                return;
            case 25:
                yz0 yz0Var = (yz0) this.f32431b;
                yz0Var.getClass();
                yz0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.invalidate();
                return;
            case 26:
                n01 n01Var = (n01) this.f32431b;
                n01Var.getClass();
                n01Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                g11 g11Var = (g11) this.f32431b;
                g11Var.getClass();
                g11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var.p();
                return;
            case 28:
                x21 x21Var = (x21) this.f32431b;
                x21Var.getClass();
                x21Var.f40134k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.invalidate();
                return;
            default:
                l41 l41Var = (l41) this.f32431b;
                l41Var.getClass();
                l41Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.invalidate();
                return;
        }
    }
}
