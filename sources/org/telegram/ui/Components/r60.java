package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29898a;
    public final Object f29899b;

    public r60(Object obj, int i10) {
        this.f29898a = i10;
        this.f29899b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29898a) {
            case 0:
                ((x60) this.f29899b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                y70 y70Var = (y70) this.f29899b;
                y70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70Var.f32760s = floatValue;
                y70Var.d(floatValue);
                return;
            case 2:
                zc0 zc0Var = ((sc0) this.f29899b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0Var.f33103a0 = floatValue2;
                zc0Var.h(floatValue2);
                return;
            case 3:
                ((jf0) this.f29899b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                qg0 qg0Var = (qg0) this.f29899b;
                qg0Var.H.E = org.telegram.messenger.i0.T1(qg0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                wi0 wi0Var = (wi0) this.f29899b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0Var.e.setAlpha(floatValue3);
                wi0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                nj0 nj0Var = (nj0) this.f29899b;
                nj0Var.B0 = ((Float) nj0Var.f28902y0.getAnimatedValue()).floatValue();
                fg.i iVar = nj0Var.S;
                if (iVar != null) {
                    iVar.invalidate();
                }
                nj0Var.invalidate();
                return;
            case 7:
                ir irVar = (ir) this.f29899b;
                irVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                irVar.setScaleX(floatValue4);
                irVar.setScaleY(floatValue4);
                ((nj0) irVar.f27158c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f29899b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                lj0 lj0Var = (lj0) this.f29899b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lj0Var.I = floatValue5;
                kj0 kj0Var = lj0Var.f28183b;
                float f10 = 1.0f;
                if (lj0Var.f28190x) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                kj0Var.setScaleY(floatValue5 * f7);
                float f11 = lj0Var.I;
                if (lj0Var.f28190x) {
                    f10 = 0.76f;
                }
                kj0Var.setScaleX(f11 * f10);
                return;
            case 10:
                cl0 cl0Var = (cl0) this.f29899b;
                cl0Var.getClass();
                cl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cl0Var.invalidateSelf();
                return;
            case 11:
                ol0 ol0Var = (ol0) this.f29899b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol0Var.f29168r = floatValue6;
                ol0Var.D.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue6));
                ol0Var.D.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, ol0Var.f29168r));
                ol0Var.D.setAlpha(ol0Var.f29168r);
                ol0Var.f29169s.invalidate();
                ol0Var.f29170w.invalidate();
                return;
            case 12:
                vl0 vl0Var = (vl0) this.f29899b;
                vl0Var.getClass();
                vl0Var.f31341w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vl0Var.j();
                return;
            case 13:
                ((vl0) ((sl0) this.f29899b).f30331b).invalidate();
                return;
            case 14:
                zl0 zl0Var = (zl0) this.f29899b;
                zl0Var.getClass();
                zl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                sm0 sm0Var = (sm0) this.f29899b;
                sm0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.F = floatValue7;
                sm0Var.setShown(floatValue7);
                sm0Var.b(false);
                return;
            case 16:
                eo0 eo0Var = (eo0) this.f29899b;
                eo0Var.getClass();
                eo0Var.f25891n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eo0Var.invalidate();
                return;
            case 17:
                to0 to0Var = (to0) this.f29899b;
                pp0 pp0Var = to0Var.f30686b;
                pp0Var.f29483m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp0Var.f29477j1.invalidate();
                to0Var.invalidate();
                return;
            case 18:
                ((mt) this.f29899b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                au0 au0Var = (au0) this.f29899b;
                au0Var.V0(au0Var.getTabProgress());
                return;
            case 20:
                ((ts0) this.f29899b).h.invalidate();
                return;
            case 21:
                mu0 mu0Var = (mu0) this.f29899b;
                mu0Var.getClass();
                mu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu0Var.invalidate();
                return;
            case 22:
                cw0.z1((cw0) this.f29899b, valueAnimator);
                return;
            case 23:
                ew0 ew0Var = (ew0) this.f29899b;
                ew0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.a();
                return;
            case 24:
                kx0 kx0Var = (kx0) this.f29899b;
                kx0Var.getClass();
                kx0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.invalidate();
                return;
            case 25:
                nx0 nx0Var = (nx0) this.f29899b;
                nx0Var.getClass();
                nx0Var.f28978i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.f28973a.invalidate();
                return;
            case 26:
                f11 f11Var = (f11) this.f29899b;
                f11Var.getClass();
                f11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11Var.invalidate();
                return;
            case 27:
                u11 u11Var = (u11) this.f29899b;
                u11Var.getClass();
                u11Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                p21 p21Var = (p21) this.f29899b;
                p21Var.getClass();
                p21Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p21Var.p();
                return;
            default:
                h41 h41Var = (h41) this.f29899b;
                h41Var.getClass();
                h41Var.f26675k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h41Var.invalidate();
                return;
        }
    }
}
