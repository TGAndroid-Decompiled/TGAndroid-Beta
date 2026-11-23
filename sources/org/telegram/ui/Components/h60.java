package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35798a;
    public final Object f35799b;

    public h60(Object obj, int i7) {
        this.f35798a = i7;
        this.f35799b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f35798a) {
            case 0:
                l60 l60Var = ((k60) this.f35799b).f36819e;
                l60Var.f37124f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l60Var.f30176b.invalidate();
                return;
            case 1:
                a70 a70Var = (a70) this.f35799b;
                a70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w60 w60Var = a70Var.f33403x;
                if (w60Var != null) {
                    w60Var.setProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ((w60) this.f35799b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                v70 v70Var = (v70) this.f35799b;
                v70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v70Var.f40706s = floatValue2;
                v70Var.d(floatValue2);
                return;
            case 4:
                qc0 qc0Var = ((kc0) this.f35799b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc0Var.f38875b0 = floatValue3;
                qc0Var.h(floatValue3);
                return;
            case 5:
                cg0 cg0Var = (cg0) this.f35799b;
                cg0Var.I.E = org.telegram.messenger.g0.T1(cg0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                gi0 gi0Var = (gi0) this.f35799b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.f35583e.setAlpha(floatValue4);
                gi0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                xi0 xi0Var = (xi0) this.f35799b;
                xi0Var.C0 = ((Float) xi0Var.f42148z0.getAnimatedValue()).floatValue();
                ai.l0 l0Var = xi0Var.T;
                if (l0Var != null) {
                    l0Var.invalidate();
                }
                xi0Var.invalidate();
                return;
            case 8:
                pr prVar = (pr) this.f35799b;
                prVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                prVar.setScaleX(floatValue5);
                prVar.setScaleY(floatValue5);
                ((xi0) prVar.f38657c).T.invalidate();
                return;
            case 9:
                ((q0.a) this.f35799b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                vi0 vi0Var = (vi0) this.f35799b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.J = floatValue6;
                ui0 ui0Var = vi0Var.f40838b;
                float f11 = 1.0f;
                if (vi0Var.f40846x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ui0Var.setScaleY(floatValue6 * f10);
                float f12 = vi0Var.J;
                if (vi0Var.f40846x) {
                    f11 = 0.76f;
                }
                ui0Var.setScaleX(f12 * f11);
                return;
            case 11:
                mk0 mk0Var = (mk0) this.f35799b;
                mk0Var.getClass();
                mk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.invalidateSelf();
                return;
            case 12:
                yk0 yk0Var = (yk0) this.f35799b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yk0Var.f42449r = floatValue7;
                yk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                yk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, yk0Var.f42449r));
                yk0Var.E.setAlpha(yk0Var.f42449r);
                yk0Var.f42450s.invalidate();
                yk0Var.f42451w.invalidate();
                return;
            case 13:
                gl0 gl0Var = (gl0) this.f35799b;
                gl0Var.getClass();
                gl0Var.f35632w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gl0Var.j();
                return;
            case 14:
                ((gl0) ((cl0) this.f35799b).f34216b).invalidate();
                return;
            case 15:
                kl0 kl0Var = (kl0) this.f35799b;
                kl0Var.getClass();
                kl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                em0 em0Var = (em0) this.f35799b;
                em0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                em0Var.G = floatValue8;
                em0Var.setShown(floatValue8);
                em0Var.b(false);
                return;
            case 17:
                rn0 rn0Var = (rn0) this.f35799b;
                rn0Var.getClass();
                rn0Var.f39293n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.invalidate();
                return;
            case 18:
                fo0 fo0Var = (fo0) this.f35799b;
                ap0 ap0Var = fo0Var.f35292b;
                ap0Var.f33581q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.n1.invalidate();
                fo0Var.invalidate();
                return;
            case 19:
                ((ot) this.f35799b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                jt0 jt0Var = (jt0) this.f35799b;
                jt0Var.Z0(jt0Var.getTabProgress());
                return;
            case 21:
                ((ds0) this.f35799b).h.invalidate();
                return;
            case 22:
                ut0 ut0Var = (ut0) this.f35799b;
                ut0Var.getClass();
                ut0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ut0Var.invalidate();
                return;
            case 23:
                lv0.z1((lv0) this.f35799b, valueAnimator);
                return;
            case 24:
                nv0 nv0Var = (nv0) this.f35799b;
                nv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nv0Var.a();
                return;
            case 25:
                rw0 rw0Var = (rw0) this.f35799b;
                rw0Var.getClass();
                rw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var.invalidate();
                return;
            case 26:
                uw0 uw0Var = (uw0) this.f35799b;
                uw0Var.getClass();
                uw0Var.f40602i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uw0Var.f40596a.invalidate();
                return;
            case 27:
                k01 k01Var = (k01) this.f35799b;
                k01Var.getClass();
                k01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.invalidate();
                return;
            case 28:
                a21 a21Var = (a21) this.f35799b;
                a21Var.getClass();
                a21Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.p();
                return;
            default:
                v31 v31Var = (v31) this.f35799b;
                v31Var.getClass();
                v31Var.f40679l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.invalidate();
                return;
        }
    }
}
