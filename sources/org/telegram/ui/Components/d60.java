package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32875a;
    public final Object f32876b;

    public d60(Object obj, int i7) {
        this.f32875a = i7;
        this.f32876b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f32875a) {
            case 0:
                ((j60) this.f32876b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                g70 g70Var = (g70) this.f32876b;
                g70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g70Var.f33897s = floatValue;
                g70Var.d(floatValue);
                return;
            case 2:
                fc0 fc0Var = ((zb0) this.f32876b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var.f33619a0 = floatValue2;
                fc0Var.h(floatValue2);
                return;
            case 3:
                of0 of0Var = (of0) this.f32876b;
                of0Var.H.E = org.telegram.messenger.g0.T1(of0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 4:
                sh0 sh0Var = (sh0) this.f32876b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sh0Var.f38066e.setAlpha(floatValue3);
                sh0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 5:
                ji0 ji0Var = (ji0) this.f32876b;
                ji0Var.B0 = ((Float) ji0Var.f35070y0.getAnimatedValue()).floatValue();
                bi.x5 x5Var = ji0Var.S;
                if (x5Var != null) {
                    x5Var.invalidate();
                }
                ji0Var.invalidate();
                return;
            case 6:
                zq zqVar = (zq) this.f32876b;
                zqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.setScaleX(floatValue4);
                zqVar.setScaleY(floatValue4);
                ((ji0) zqVar.f41043c).S.invalidate();
                return;
            case 7:
                ((q0.a) this.f32876b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 8:
                hi0 hi0Var = (hi0) this.f32876b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi0Var.I = floatValue5;
                gi0 gi0Var = hi0Var.f34304b;
                float f11 = 1.0f;
                if (hi0Var.f34312x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                gi0Var.setScaleY(floatValue5 * f10);
                float f12 = hi0Var.I;
                if (hi0Var.f34312x) {
                    f11 = 0.76f;
                }
                gi0Var.setScaleX(f12 * f11);
                return;
            case 9:
                yj0 yj0Var = (yj0) this.f32876b;
                yj0Var.getClass();
                yj0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj0Var.invalidateSelf();
                return;
            case 10:
                kk0 kk0Var = (kk0) this.f32876b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kk0Var.f35366r = floatValue6;
                kk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                kk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, kk0Var.f35366r));
                kk0Var.D.setAlpha(kk0Var.f35366r);
                kk0Var.f35367s.invalidate();
                kk0Var.f35368w.invalidate();
                return;
            case 11:
                sk0 sk0Var = (sk0) this.f32876b;
                sk0Var.getClass();
                sk0Var.f38120w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk0Var.j();
                return;
            case 12:
                ((sk0) ((ok0) this.f32876b).f36738b).invalidate();
                return;
            case 13:
                wk0 wk0Var = (wk0) this.f32876b;
                wk0Var.getClass();
                wk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                rl0 rl0Var = (rl0) this.f32876b;
                rl0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rl0Var.F = floatValue7;
                rl0Var.setShown(floatValue7);
                rl0Var.b(false);
                return;
            case 15:
                dn0 dn0Var = (dn0) this.f32876b;
                dn0Var.getClass();
                dn0Var.f33118n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dn0Var.invalidate();
                return;
            case 16:
                sn0 sn0Var = (sn0) this.f32876b;
                no0 no0Var = sn0Var.f38130b;
                no0Var.f36445m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                no0Var.f36439j1.invalidate();
                sn0Var.invalidate();
                return;
            case 17:
                ((zs) this.f32876b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                zs0 zs0Var = (zs0) this.f32876b;
                zs0Var.Z0(zs0Var.getTabProgress());
                return;
            case 19:
                ((ur0) this.f32876b).h.invalidate();
                return;
            case 20:
                kt0 kt0Var = (kt0) this.f32876b;
                kt0Var.getClass();
                kt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kt0Var.invalidate();
                return;
            case 21:
                av0.z1((av0) this.f32876b, valueAnimator);
                return;
            case 22:
                cv0 cv0Var = (cv0) this.f32876b;
                cv0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.a();
                return;
            case 23:
                gw0 gw0Var = (gw0) this.f32876b;
                gw0Var.getClass();
                gw0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gw0Var.invalidate();
                return;
            case 24:
                jw0 jw0Var = (jw0) this.f32876b;
                jw0Var.getClass();
                jw0Var.f35173i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.f35167a.invalidate();
                return;
            case 25:
                a01 a01Var = (a01) this.f32876b;
                a01Var.getClass();
                a01Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a01Var.invalidate();
                return;
            case 26:
                n11 n11Var = (n11) this.f32876b;
                n11Var.getClass();
                n11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n11Var.p();
                return;
            case 27:
                e31 e31Var = (e31) this.f32876b;
                e31Var.getClass();
                e31Var.f33282k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.invalidate();
                return;
            case 28:
                s41 s41Var = (s41) this.f32876b;
                s41Var.getClass();
                s41Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s41Var.invalidate();
                return;
            default:
                a51 a51Var = (a51) this.f32876b;
                a51Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a51Var.f31712b = floatValue8;
                a51Var.setTranslationY(floatValue8);
                return;
        }
    }
}
