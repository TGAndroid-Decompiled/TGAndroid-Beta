package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35804a;
    public final Object f35805b;

    public h60(Object obj, int i7) {
        this.f35804a = i7;
        this.f35805b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f35804a) {
            case 0:
                l60 l60Var = ((k60) this.f35805b).f36816e;
                l60Var.f37118f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l60Var.f30173b.invalidate();
                return;
            case 1:
                a70 a70Var = (a70) this.f35805b;
                a70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w60 w60Var = a70Var.f33390x;
                if (w60Var != null) {
                    w60Var.setProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ((w60) this.f35805b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                v70 v70Var = (v70) this.f35805b;
                v70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v70Var.f40704s = floatValue2;
                v70Var.d(floatValue2);
                return;
            case 4:
                qc0 qc0Var = ((kc0) this.f35805b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc0Var.f38881b0 = floatValue3;
                qc0Var.h(floatValue3);
                return;
            case 5:
                cg0 cg0Var = (cg0) this.f35805b;
                cg0Var.I.E = org.telegram.messenger.g0.T1(cg0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                gi0 gi0Var = (gi0) this.f35805b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.f35564e.setAlpha(floatValue4);
                gi0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                xi0 xi0Var = (xi0) this.f35805b;
                xi0Var.C0 = ((Float) xi0Var.f42155z0.getAnimatedValue()).floatValue();
                ai.l0 l0Var = xi0Var.T;
                if (l0Var != null) {
                    l0Var.invalidate();
                }
                xi0Var.invalidate();
                return;
            case 8:
                pr prVar = (pr) this.f35805b;
                prVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                prVar.setScaleX(floatValue5);
                prVar.setScaleY(floatValue5);
                ((xi0) prVar.f38658c).T.invalidate();
                return;
            case 9:
                ((q0.a) this.f35805b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                vi0 vi0Var = (vi0) this.f35805b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.J = floatValue6;
                ui0 ui0Var = vi0Var.f40836b;
                float f11 = 1.0f;
                if (vi0Var.f40844x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ui0Var.setScaleY(floatValue6 * f10);
                float f12 = vi0Var.J;
                if (vi0Var.f40844x) {
                    f11 = 0.76f;
                }
                ui0Var.setScaleX(f12 * f11);
                return;
            case 11:
                mk0 mk0Var = (mk0) this.f35805b;
                mk0Var.getClass();
                mk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.invalidateSelf();
                return;
            case 12:
                yk0 yk0Var = (yk0) this.f35805b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yk0Var.f42456r = floatValue7;
                yk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                yk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, yk0Var.f42456r));
                yk0Var.E.setAlpha(yk0Var.f42456r);
                yk0Var.f42457s.invalidate();
                yk0Var.f42458w.invalidate();
                return;
            case 13:
                gl0 gl0Var = (gl0) this.f35805b;
                gl0Var.getClass();
                gl0Var.f35613w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gl0Var.j();
                return;
            case 14:
                ((gl0) ((cl0) this.f35805b).f34222b).invalidate();
                return;
            case 15:
                kl0 kl0Var = (kl0) this.f35805b;
                kl0Var.getClass();
                kl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                em0 em0Var = (em0) this.f35805b;
                em0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                em0Var.G = floatValue8;
                em0Var.setShown(floatValue8);
                em0Var.b(false);
                return;
            case 17:
                rn0 rn0Var = (rn0) this.f35805b;
                rn0Var.getClass();
                rn0Var.f39283n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.invalidate();
                return;
            case 18:
                fo0 fo0Var = (fo0) this.f35805b;
                ap0 ap0Var = fo0Var.f35290b;
                ap0Var.f33568q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.n1.invalidate();
                fo0Var.invalidate();
                return;
            case 19:
                ((ot) this.f35805b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                jt0 jt0Var = (jt0) this.f35805b;
                jt0Var.Z0(jt0Var.getTabProgress());
                return;
            case 21:
                ((ds0) this.f35805b).h.invalidate();
                return;
            case 22:
                ut0 ut0Var = (ut0) this.f35805b;
                ut0Var.getClass();
                ut0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ut0Var.invalidate();
                return;
            case 23:
                lv0.z1((lv0) this.f35805b, valueAnimator);
                return;
            case 24:
                nv0 nv0Var = (nv0) this.f35805b;
                nv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nv0Var.a();
                return;
            case 25:
                rw0 rw0Var = (rw0) this.f35805b;
                rw0Var.getClass();
                rw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var.invalidate();
                return;
            case 26:
                uw0 uw0Var = (uw0) this.f35805b;
                uw0Var.getClass();
                uw0Var.f40609i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uw0Var.f40603a.invalidate();
                return;
            case 27:
                l01 l01Var = (l01) this.f35805b;
                l01Var.getClass();
                l01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l01Var.invalidate();
                return;
            case 28:
                b21 b21Var = (b21) this.f35805b;
                b21Var.getClass();
                b21Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b21Var.p();
                return;
            default:
                v31 v31Var = (v31) this.f35805b;
                v31Var.getClass();
                v31Var.f40677l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.invalidate();
                return;
        }
    }
}
