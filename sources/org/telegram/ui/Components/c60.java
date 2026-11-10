package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32479a;
    public final Object f32480b;

    public c60(Object obj, int i7) {
        this.f32479a = i7;
        this.f32480b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f32479a) {
            case 0:
                ((i60) this.f32480b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                f70 f70Var = (f70) this.f32480b;
                f70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f70Var.f33492s = floatValue;
                f70Var.d(floatValue);
                return;
            case 2:
                ec0 ec0Var = ((yb0) this.f32480b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0Var.f33205a0 = floatValue2;
                ec0Var.h(floatValue2);
                return;
            case 3:
                nf0 nf0Var = (nf0) this.f32480b;
                nf0Var.H.E = org.telegram.messenger.g0.T1(nf0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 4:
                rh0 rh0Var = (rh0) this.f32480b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh0Var.f37652e.setAlpha(floatValue3);
                rh0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 5:
                ii0 ii0Var = (ii0) this.f32480b;
                ii0Var.B0 = ((Float) ii0Var.f34679y0.getAnimatedValue()).floatValue();
                bi.x5 x5Var = ii0Var.S;
                if (x5Var != null) {
                    x5Var.invalidate();
                }
                ii0Var.invalidate();
                return;
            case 6:
                yq yqVar = (yq) this.f32480b;
                yqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yqVar.setScaleX(floatValue4);
                yqVar.setScaleY(floatValue4);
                ((ii0) yqVar.f40635c).S.invalidate();
                return;
            case 7:
                ((q0.a) this.f32480b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 8:
                gi0 gi0Var = (gi0) this.f32480b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.I = floatValue5;
                fi0 fi0Var = gi0Var.f33904b;
                float f11 = 1.0f;
                if (gi0Var.f33912x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                fi0Var.setScaleY(floatValue5 * f10);
                float f12 = gi0Var.I;
                if (gi0Var.f33912x) {
                    f11 = 0.76f;
                }
                fi0Var.setScaleX(f12 * f11);
                return;
            case 9:
                xj0 xj0Var = (xj0) this.f32480b;
                xj0Var.getClass();
                xj0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xj0Var.invalidateSelf();
                return;
            case 10:
                jk0 jk0Var = (jk0) this.f32480b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jk0Var.f34957r = floatValue6;
                jk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                jk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, jk0Var.f34957r));
                jk0Var.D.setAlpha(jk0Var.f34957r);
                jk0Var.f34958s.invalidate();
                jk0Var.f34959w.invalidate();
                return;
            case 11:
                rk0 rk0Var = (rk0) this.f32480b;
                rk0Var.getClass();
                rk0Var.f37706w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk0Var.j();
                return;
            case 12:
                ((rk0) ((nk0) this.f32480b).f36328b).invalidate();
                return;
            case 13:
                vk0 vk0Var = (vk0) this.f32480b;
                vk0Var.getClass();
                vk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                ql0 ql0Var = (ql0) this.f32480b;
                ql0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ql0Var.F = floatValue7;
                ql0Var.setShown(floatValue7);
                ql0Var.b(false);
                return;
            case 15:
                cn0 cn0Var = (cn0) this.f32480b;
                cn0Var.getClass();
                cn0Var.f32719n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn0Var.invalidate();
                return;
            case 16:
                rn0 rn0Var = (rn0) this.f32480b;
                mo0 mo0Var = rn0Var.f37716b;
                mo0Var.f36044p2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mo0Var.f36038m1.invalidate();
                rn0Var.invalidate();
                return;
            case 17:
                ((ys) this.f32480b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ys0 ys0Var = (ys0) this.f32480b;
                ys0Var.Z0(ys0Var.getTabProgress());
                return;
            case 19:
                ((tr0) this.f32480b).h.invalidate();
                return;
            case 20:
                jt0 jt0Var = (jt0) this.f32480b;
                jt0Var.getClass();
                jt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jt0Var.invalidate();
                return;
            case 21:
                zu0.z1((zu0) this.f32480b, valueAnimator);
                return;
            case 22:
                bv0 bv0Var = (bv0) this.f32480b;
                bv0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bv0Var.a();
                return;
            case 23:
                fw0 fw0Var = (fw0) this.f32480b;
                fw0Var.getClass();
                fw0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fw0Var.invalidate();
                return;
            case 24:
                iw0 iw0Var = (iw0) this.f32480b;
                iw0Var.getClass();
                iw0Var.f34780i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.f34774a.invalidate();
                return;
            case 25:
                zz0 zz0Var = (zz0) this.f32480b;
                zz0Var.getClass();
                zz0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zz0Var.invalidate();
                return;
            case 26:
                m11 m11Var = (m11) this.f32480b;
                m11Var.getClass();
                m11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.p();
                return;
            case 27:
                d31 d31Var = (d31) this.f32480b;
                d31Var.getClass();
                d31Var.f32877k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.invalidate();
                return;
            case 28:
                s41 s41Var = (s41) this.f32480b;
                s41Var.getClass();
                s41Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s41Var.invalidate();
                return;
            default:
                a51 a51Var = (a51) this.f32480b;
                a51Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a51Var.f31713b = floatValue8;
                a51Var.setTranslationY(floatValue8);
                return;
        }
    }
}
