package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34582a;
    public final Object f34583b;

    public e60(Object obj, int i7) {
        this.f34582a = i7;
        this.f34583b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f34582a) {
            case 0:
                i60 i60Var = ((h60) this.f34583b).f35648e;
                i60Var.f35941f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i60Var.f30226b.invalidate();
                return;
            case 1:
                x60 x60Var = (x60) this.f34583b;
                x60Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t60 t60Var = x60Var.f41898x;
                if (t60Var != null) {
                    t60Var.setProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ((t60) this.f34583b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                s70 s70Var = (s70) this.f34583b;
                s70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s70Var.f39525s = floatValue2;
                s70Var.d(floatValue2);
                return;
            case 4:
                oc0 oc0Var = ((ic0) this.f34583b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc0Var.f38110b0 = floatValue3;
                oc0Var.h(floatValue3);
                return;
            case 5:
                bg0 bg0Var = (bg0) this.f34583b;
                bg0Var.I.E = org.telegram.messenger.g0.T1(bg0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                gi0 gi0Var = (gi0) this.f34583b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.f35443e.setAlpha(floatValue4);
                gi0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                xi0 xi0Var = (xi0) this.f34583b;
                xi0Var.C0 = ((Float) xi0Var.f42054z0.getAnimatedValue()).floatValue();
                ai.h0 h0Var = xi0Var.T;
                if (h0Var != null) {
                    h0Var.invalidate();
                }
                xi0Var.invalidate();
                return;
            case 8:
                mr mrVar = (mr) this.f34583b;
                mrVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mrVar.setScaleX(floatValue5);
                mrVar.setScaleY(floatValue5);
                ((xi0) mrVar.f37529c).T.invalidate();
                return;
            case 9:
                ((q0.a) this.f34583b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                vi0 vi0Var = (vi0) this.f34583b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.J = floatValue6;
                ui0 ui0Var = vi0Var.f40709b;
                float f11 = 1.0f;
                if (vi0Var.f40717x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ui0Var.setScaleY(floatValue6 * f10);
                float f12 = vi0Var.J;
                if (vi0Var.f40717x) {
                    f11 = 0.76f;
                }
                ui0Var.setScaleX(f12 * f11);
                return;
            case 11:
                mk0 mk0Var = (mk0) this.f34583b;
                mk0Var.getClass();
                mk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.invalidateSelf();
                return;
            case 12:
                yk0 yk0Var = (yk0) this.f34583b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yk0Var.f42509r = floatValue7;
                yk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                yk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, yk0Var.f42509r));
                yk0Var.E.setAlpha(yk0Var.f42509r);
                yk0Var.f42510s.invalidate();
                yk0Var.f42511w.invalidate();
                return;
            case 13:
                gl0 gl0Var = (gl0) this.f34583b;
                gl0Var.getClass();
                gl0Var.f35496w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gl0Var.j();
                return;
            case 14:
                ((gl0) ((cl0) this.f34583b).f34083b).invalidate();
                return;
            case 15:
                kl0 kl0Var = (kl0) this.f34583b;
                kl0Var.getClass();
                kl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                em0 em0Var = (em0) this.f34583b;
                em0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                em0Var.G = floatValue8;
                em0Var.setShown(floatValue8);
                em0Var.b(false);
                return;
            case 17:
                qn0 qn0Var = (qn0) this.f34583b;
                qn0Var.getClass();
                qn0Var.f38962n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn0Var.invalidate();
                return;
            case 18:
                eo0 eo0Var = (eo0) this.f34583b;
                zo0 zo0Var = eo0Var.f34830b;
                zo0Var.f42989q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zo0Var.n1.invalidate();
                eo0Var.invalidate();
                return;
            case 19:
                ((mt) this.f34583b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                it0 it0Var = (it0) this.f34583b;
                it0Var.Z0(it0Var.getTabProgress());
                return;
            case 21:
                ((ds0) this.f34583b).h.invalidate();
                return;
            case 22:
                tt0 tt0Var = (tt0) this.f34583b;
                tt0Var.getClass();
                tt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tt0Var.invalidate();
                return;
            case 23:
                kv0.z1((kv0) this.f34583b, valueAnimator);
                return;
            case 24:
                mv0 mv0Var = (mv0) this.f34583b;
                mv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mv0Var.a();
                return;
            case 25:
                qw0 qw0Var = (qw0) this.f34583b;
                qw0Var.getClass();
                qw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var.invalidate();
                return;
            case 26:
                tw0 tw0Var = (tw0) this.f34583b;
                tw0Var.getClass();
                tw0Var.f40179i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var.f40173a.invalidate();
                return;
            case 27:
                j01 j01Var = (j01) this.f34583b;
                j01Var.getClass();
                j01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j01Var.invalidate();
                return;
            case 28:
                z11 z11Var = (z11) this.f34583b;
                z11Var.getClass();
                z11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.p();
                return;
            default:
                u31 u31Var = (u31) this.f34583b;
                u31Var.getClass();
                u31Var.f40266l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31Var.invalidate();
                return;
        }
    }
}
