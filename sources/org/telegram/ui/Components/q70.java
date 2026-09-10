package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26333a;
    public final Object f26334b;

    public q70(Object obj, int i10) {
        this.f26333a = i10;
        this.f26334b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f26333a) {
            case 0:
                ((u70) this.f26334b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                u80 u80Var = (u80) this.f26334b;
                u80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u80Var.f27612s = floatValue;
                u80Var.d(floatValue);
                return;
            case 2:
                be0 be0Var = ((wd0) this.f26334b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.P = floatValue2;
                be0Var.f(floatValue2);
                return;
            case 3:
                ((og0) this.f26334b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                sh0 sh0Var = (sh0) this.f26334b;
                sh0Var.H.E = AndroidUtilities.lerp(sh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                zj0 zj0Var = (zj0) this.f26334b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj0Var.e.setAlpha(floatValue3);
                zj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                pk0 pk0Var = (pk0) this.f26334b;
                pk0Var.B0 = ((Float) pk0Var.f26201y0.getAnimatedValue()).floatValue();
                bi.n7 n7Var = pk0Var.S;
                if (n7Var != null) {
                    n7Var.invalidate();
                }
                pk0Var.invalidate();
                return;
            case 7:
                yr yrVar = (yr) this.f26334b;
                yrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yrVar.setScaleX(floatValue4);
                yrVar.setScaleY(floatValue4);
                ((pk0) yrVar.f29485c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f26334b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                nk0 nk0Var = (nk0) this.f26334b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.I = floatValue5;
                mk0 mk0Var = nk0Var.f25541b;
                float f10 = 1.0f;
                if (nk0Var.f25547w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                mk0Var.setScaleY(floatValue5 * f7);
                float f11 = nk0Var.I;
                if (nk0Var.f25547w) {
                    f10 = 0.76f;
                }
                mk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                am0 am0Var = (am0) this.f26334b;
                am0Var.getClass();
                am0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.invalidateSelf();
                return;
            case 11:
                km0 km0Var = (km0) this.f26334b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                km0Var.f24756r = floatValue6;
                km0Var.f24760y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                km0Var.f24760y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, km0Var.f24756r));
                km0Var.f24760y.setAlpha(km0Var.f24756r);
                km0Var.f24757s.invalidate();
                km0Var.v.invalidate();
                return;
            case 12:
                sm0 sm0Var = (sm0) this.f26334b;
                sm0Var.getClass();
                sm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.j();
                return;
            case 13:
                ((sm0) ((om0) this.f26334b).f25843b).invalidate();
                return;
            case 14:
                wm0 wm0Var = (wm0) this.f26334b;
                wm0Var.getClass();
                wm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                rn0 rn0Var = (rn0) this.f26334b;
                rn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.F = floatValue7;
                rn0Var.setShown(floatValue7);
                rn0Var.b(false);
                return;
            case 16:
                hp0 hp0Var = (hp0) this.f26334b;
                hp0Var.getClass();
                hp0Var.f23745n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hp0Var.invalidate();
                return;
            case 17:
                vp0 vp0Var = (vp0) this.f26334b;
                sq0 sq0Var = vp0Var.f28572b;
                sq0Var.f27191u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sq0Var.f27169c.invalidate();
                vp0Var.invalidate();
                return;
            case 18:
                ((fu) this.f26334b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                iv0 iv0Var = (iv0) this.f26334b;
                iv0Var.M0(iv0Var.getTabProgress());
                return;
            case 20:
                ((au0) this.f26334b).h.invalidate();
                return;
            case 21:
                pv0 pv0Var = (pv0) this.f26334b;
                pv0Var.getClass();
                pv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.invalidate();
                return;
            case 22:
                aw0 aw0Var = (aw0) ((androidx.activity.g) this.f26334b).f571c;
                aw0Var.f21631f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.N();
                return;
            case 23:
                hx0.v1((hx0) this.f26334b, valueAnimator);
                return;
            case 24:
                jx0 jx0Var = (jx0) this.f26334b;
                jx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.a();
                return;
            case 25:
                py0 py0Var = (py0) this.f26334b;
                py0Var.getClass();
                py0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                py0Var.invalidate();
                return;
            case 26:
                sy0 sy0Var = (sy0) this.f26334b;
                sy0Var.getClass();
                sy0Var.f27234i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.f27229a.invalidate();
                return;
            case 27:
                i21 i21Var = (i21) this.f26334b;
                i21Var.getClass();
                i21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i21Var.invalidate();
                return;
            case 28:
                k31 k31Var = (k31) this.f26334b;
                k31Var.getClass();
                k31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.n();
                return;
            default:
                c51 c51Var = (c51) this.f26334b;
                c51Var.getClass();
                c51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                return;
        }
    }
}
