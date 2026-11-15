package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34530a;
    public final Object f34531b;

    public f60(Object obj, int i7) {
        this.f34530a = i7;
        this.f34531b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f34530a) {
            case 0:
                ((k60) this.f34531b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                i70 i70Var = (i70) this.f34531b;
                i70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i70Var.f35487s = floatValue;
                i70Var.d(floatValue);
                return;
            case 2:
                fc0 fc0Var = ((zb0) this.f34531b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var.f34563b0 = floatValue2;
                fc0Var.h(floatValue2);
                return;
            case 3:
                qf0 qf0Var = (qf0) this.f34531b;
                qf0Var.I.E = org.telegram.messenger.g0.T1(qf0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 4:
                vh0 vh0Var = (vh0) this.f34531b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh0Var.f40416e.setAlpha(floatValue3);
                vh0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 5:
                mi0 mi0Var = (mi0) this.f34531b;
                mi0Var.C0 = ((Float) mi0Var.f37302z0.getAnimatedValue()).floatValue();
                ai.j0 j0Var = mi0Var.T;
                if (j0Var != null) {
                    j0Var.invalidate();
                }
                mi0Var.invalidate();
                return;
            case 6:
                gr grVar = (gr) this.f34531b;
                grVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                grVar.setScaleX(floatValue4);
                grVar.setScaleY(floatValue4);
                ((mi0) grVar.f35045c).T.invalidate();
                return;
            case 7:
                ((q0.a) this.f34531b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 8:
                ki0 ki0Var = (ki0) this.f34531b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki0Var.J = floatValue5;
                ji0 ji0Var = ki0Var.f36525b;
                float f11 = 1.0f;
                if (ki0Var.f36533x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ji0Var.setScaleY(floatValue5 * f10);
                float f12 = ki0Var.J;
                if (ki0Var.f36533x) {
                    f11 = 0.76f;
                }
                ji0Var.setScaleX(f12 * f11);
                return;
            case 9:
                ck0 ck0Var = (ck0) this.f34531b;
                ck0Var.getClass();
                ck0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.invalidateSelf();
                return;
            case 10:
                ok0 ok0Var = (ok0) this.f34531b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok0Var.f38013r = floatValue6;
                ok0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                ok0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, ok0Var.f38013r));
                ok0Var.E.setAlpha(ok0Var.f38013r);
                ok0Var.f38014s.invalidate();
                ok0Var.f38015w.invalidate();
                return;
            case 11:
                wk0 wk0Var = (wk0) this.f34531b;
                wk0Var.getClass();
                wk0Var.f41400w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wk0Var.j();
                return;
            case 12:
                ((wk0) ((sk0) this.f34531b).f39334b).invalidate();
                return;
            case 13:
                al0 al0Var = (al0) this.f34531b;
                al0Var.getClass();
                al0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                ul0 ul0Var = (ul0) this.f34531b;
                ul0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ul0Var.G = floatValue7;
                ul0Var.setShown(floatValue7);
                ul0Var.b(false);
                return;
            case 15:
                gn0 gn0Var = (gn0) this.f34531b;
                gn0Var.getClass();
                gn0Var.f35033n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.invalidate();
                return;
            case 16:
                un0 un0Var = (un0) this.f34531b;
                po0 po0Var = un0Var.f40134b;
                po0Var.f38359q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                po0Var.n1.invalidate();
                un0Var.invalidate();
                return;
            case 17:
                ((ft) this.f34531b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ys0 ys0Var = (ys0) this.f34531b;
                ys0Var.Z0(ys0Var.getTabProgress());
                return;
            case 19:
                ((tr0) this.f34531b).h.invalidate();
                return;
            case 20:
                jt0 jt0Var = (jt0) this.f34531b;
                jt0Var.getClass();
                jt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jt0Var.invalidate();
                return;
            case 21:
                av0.z1((av0) this.f34531b, valueAnimator);
                return;
            case 22:
                cv0 cv0Var = (cv0) this.f34531b;
                cv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.a();
                return;
            case 23:
                iw0 iw0Var = (iw0) this.f34531b;
                iw0Var.getClass();
                iw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.invalidate();
                return;
            case 24:
                lw0 lw0Var = (lw0) this.f34531b;
                lw0Var.getClass();
                lw0Var.f36916i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.f36910a.invalidate();
                return;
            case 25:
                b01 b01Var = (b01) this.f34531b;
                b01Var.getClass();
                b01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b01Var.invalidate();
                return;
            case 26:
                p11 p11Var = (p11) this.f34531b;
                p11Var.getClass();
                p11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var.p();
                return;
            case 27:
                i31 i31Var = (i31) this.f34531b;
                i31Var.getClass();
                i31Var.f35441l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i31Var.invalidate();
                return;
            case 28:
                v41 v41Var = (v41) this.f34531b;
                v41Var.getClass();
                v41Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v41Var.invalidate();
                return;
            default:
                c51 c51Var = (c51) this.f34531b;
                c51Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.f33509b = floatValue8;
                c51Var.setTranslationY(floatValue8);
                return;
        }
    }
}
