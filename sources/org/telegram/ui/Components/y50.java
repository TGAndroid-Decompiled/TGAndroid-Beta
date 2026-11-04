package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40623a;
    public final Object f40624b;

    public y50(Object obj, int i3) {
        this.f40623a = i3;
        this.f40624b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f40623a) {
            case 0:
                ((d60) this.f40624b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                b70 b70Var = (b70) this.f40624b;
                b70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b70Var.f32113s = floatValue;
                b70Var.d(floatValue);
                return;
            case 2:
                zb0 zb0Var = ((tb0) this.f40624b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0Var.f41001b0 = floatValue2;
                zb0Var.h(floatValue2);
                return;
            case 3:
                ((ie0) this.f40624b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                qf0 qf0Var = (qf0) this.f40624b;
                qf0Var.I.E = org.telegram.messenger.g0.T1(qf0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                uh0 uh0Var = (uh0) this.f40624b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0Var.f38751e.setAlpha(floatValue3);
                uh0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                li0 li0Var = (li0) this.f40624b;
                li0Var.C0 = ((Float) li0Var.f35779z0.getAnimatedValue()).floatValue();
                ai.c0 c0Var = li0Var.T;
                if (c0Var != null) {
                    c0Var.invalidate();
                }
                li0Var.invalidate();
                return;
            case 7:
                zq zqVar = (zq) this.f40624b;
                zqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.setScaleX(floatValue4);
                zqVar.setScaleY(floatValue4);
                ((li0) zqVar.f41088c).T.invalidate();
                return;
            case 8:
                ((q0.a) this.f40624b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                ji0 ji0Var = (ji0) this.f40624b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0Var.J = floatValue5;
                ii0 ii0Var = ji0Var.f35078b;
                float f11 = 1.0f;
                if (ji0Var.f35086x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ii0Var.setScaleY(floatValue5 * f10);
                float f12 = ji0Var.J;
                if (ji0Var.f35086x) {
                    f11 = 0.76f;
                }
                ii0Var.setScaleX(f12 * f11);
                return;
            case 10:
                bk0 bk0Var = (bk0) this.f40624b;
                bk0Var.getClass();
                bk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bk0Var.invalidateSelf();
                return;
            case 11:
                nk0 nk0Var = (nk0) this.f40624b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.f36578r = floatValue6;
                nk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                nk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, nk0Var.f36578r));
                nk0Var.E.setAlpha(nk0Var.f36578r);
                nk0Var.f36579s.invalidate();
                nk0Var.f36580w.invalidate();
                return;
            case 12:
                vk0 vk0Var = (vk0) this.f40624b;
                vk0Var.getClass();
                vk0Var.f39172w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vk0Var.j();
                return;
            case 13:
                ((vk0) ((rk0) this.f40624b).f37747b).invalidate();
                return;
            case 14:
                zk0 zk0Var = (zk0) this.f40624b;
                zk0Var.getClass();
                zk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                tl0 tl0Var = (tl0) this.f40624b;
                tl0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tl0Var.G = floatValue7;
                tl0Var.setShown(floatValue7);
                tl0Var.b(false);
                return;
            case 16:
                fn0 fn0Var = (fn0) this.f40624b;
                fn0Var.getClass();
                fn0Var.f33827n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fn0Var.invalidate();
                return;
            case 17:
                tn0 tn0Var = (tn0) this.f40624b;
                oo0 oo0Var = tn0Var.f38523b;
                oo0Var.f36890n2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oo0Var.k1.invalidate();
                tn0Var.invalidate();
                return;
            case 18:
                ((xs) this.f40624b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ws0 ws0Var = (ws0) this.f40624b;
                ws0Var.X0(ws0Var.getTabProgress());
                return;
            case 20:
                ((rr0) this.f40624b).h.invalidate();
                return;
            case 21:
                ht0 ht0Var = (ht0) this.f40624b;
                ht0Var.getClass();
                ht0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ht0Var.invalidate();
                return;
            case 22:
                xu0.z1((xu0) this.f40624b, valueAnimator);
                return;
            case 23:
                zu0 zu0Var = (zu0) this.f40624b;
                zu0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu0Var.a();
                return;
            case 24:
                ew0 ew0Var = (ew0) this.f40624b;
                ew0Var.getClass();
                ew0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.invalidate();
                return;
            case 25:
                hw0 hw0Var = (hw0) this.f40624b;
                hw0Var.getClass();
                hw0Var.f34528i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hw0Var.f34522a.invalidate();
                return;
            case 26:
                yz0 yz0Var = (yz0) this.f40624b;
                yz0Var.getClass();
                yz0Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.invalidate();
                return;
            case 27:
                n01 n01Var = (n01) this.f40624b;
                n01Var.getClass();
                n01Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                g11 g11Var = (g11) this.f40624b;
                g11Var.getClass();
                g11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var.p();
                return;
            default:
                y21 y21Var = (y21) this.f40624b;
                y21Var.getClass();
                y21Var.f40599l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y21Var.invalidate();
                return;
        }
    }
}
