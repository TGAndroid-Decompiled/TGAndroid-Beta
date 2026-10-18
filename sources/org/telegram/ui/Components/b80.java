package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24839a;
    public final Object f24840b;

    public b80(Object obj, int i10) {
        this.f24839a = i10;
        this.f24840b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24839a) {
            case 0:
                i80 i80Var = (i80) this.f24840b;
                i80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g80 g80Var = i80Var.f27138x;
                if (g80Var != null) {
                    g80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((g80) this.f24840b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                e90 e90Var = (e90) this.f24840b;
                e90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e90Var.f25892s = floatValue2;
                e90Var.d(floatValue2);
                return;
            case 3:
                le0 le0Var = ((ge0) this.f24840b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var.f28205a0 = floatValue3;
                le0Var.g(floatValue3);
                return;
            case 4:
                ((zg0) this.f24840b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ei0 ei0Var = (ei0) this.f24840b;
                ei0Var.H.E = AndroidUtilities.lerp(ei0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                mk0 mk0Var = (mk0) this.f24840b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.e.setAlpha(floatValue4);
                mk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                cl0 cl0Var = (cl0) this.f24840b;
                cl0Var.B0 = ((Float) cl0Var.f25300y0.getAnimatedValue()).floatValue();
                ah.v vVar = cl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                cl0Var.invalidate();
                return;
            case 8:
                ds dsVar = (ds) this.f24840b;
                dsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.setScaleX(floatValue5);
                dsVar.setScaleY(floatValue5);
                ((cl0) dsVar.f25688c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f24840b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                al0 al0Var = (al0) this.f24840b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                al0Var.I = floatValue6;
                zk0 zk0Var = al0Var.f24650b;
                float f10 = 1.0f;
                if (al0Var.f24656w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                zk0Var.setScaleY(floatValue6 * f7);
                float f11 = al0Var.I;
                if (al0Var.f24656w) {
                    f10 = 0.76f;
                }
                zk0Var.setScaleX(f11 * f10);
                return;
            case 11:
                nm0 nm0Var = (nm0) this.f24840b;
                nm0Var.getClass();
                nm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nm0Var.invalidateSelf();
                return;
            case 12:
                ym0 ym0Var = (ym0) this.f24840b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ym0Var.f32706r = floatValue7;
                ym0Var.f32710y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                ym0Var.f32710y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ym0Var.f32706r));
                ym0Var.f32710y.setAlpha(ym0Var.f32706r);
                ym0Var.f32707s.invalidate();
                ym0Var.v.invalidate();
                return;
            case 13:
                gn0 gn0Var = (gn0) this.f24840b;
                gn0Var.getClass();
                gn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.j();
                return;
            case 14:
                ((gn0) ((cn0) this.f24840b).f25311b).invalidate();
                return;
            case 15:
                kn0 kn0Var = (kn0) this.f24840b;
                kn0Var.getClass();
                kn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                fo0 fo0Var = (fo0) this.f24840b;
                fo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo0Var.F = floatValue8;
                fo0Var.setShown(floatValue8);
                fo0Var.b(false);
                return;
            case 17:
                sp0 sp0Var = (sp0) this.f24840b;
                sp0Var.getClass();
                sp0Var.f30308n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sp0Var.invalidate();
                return;
            case 18:
                hq0 hq0Var = (hq0) this.f24840b;
                dr0 dr0Var = hq0Var.f26916b;
                dr0Var.f25677u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dr0Var.f25655c.invalidate();
                hq0Var.invalidate();
                return;
            case 19:
                ((iu) this.f24840b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                sv0 sv0Var = (sv0) this.f24840b;
                sv0Var.O0(sv0Var.getTabProgress());
                return;
            case 21:
                ((lu0) this.f24840b).h.invalidate();
                return;
            case 22:
                zv0 zv0Var = (zv0) this.f24840b;
                zv0Var.getClass();
                zv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zv0Var.invalidate();
                return;
            case 23:
                jw0 jw0Var = (jw0) ((androidx.activity.g) this.f24840b).f2652c;
                jw0Var.f27620f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.N();
                return;
            case 24:
                px0.x1((px0) this.f24840b, valueAnimator);
                return;
            case 25:
                rx0 rx0Var = (rx0) this.f24840b;
                rx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rx0Var.a();
                return;
            case 26:
                vy0 vy0Var = (vy0) this.f24840b;
                vy0Var.getClass();
                vy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var.invalidate();
                return;
            case 27:
                yy0 yy0Var = (yy0) this.f24840b;
                yy0Var.getClass();
                yy0Var.f32785i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var.f32780a.invalidate();
                return;
            case 28:
                p21 p21Var = (p21) this.f24840b;
                p21Var.getClass();
                p21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p21Var.invalidate();
                return;
            default:
                q31 q31Var = (q31) this.f24840b;
                q31Var.getClass();
                q31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q31Var.n();
                return;
        }
    }
}
