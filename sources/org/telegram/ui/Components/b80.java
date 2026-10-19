package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24827a;
    public final Object f24828b;

    public b80(Object obj, int i10) {
        this.f24827a = i10;
        this.f24828b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24827a) {
            case 0:
                i80 i80Var = (i80) this.f24828b;
                i80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g80 g80Var = i80Var.f27138x;
                if (g80Var != null) {
                    g80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((g80) this.f24828b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                e90 e90Var = (e90) this.f24828b;
                e90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e90Var.f25871s = floatValue2;
                e90Var.d(floatValue2);
                return;
            case 3:
                le0 le0Var = ((ge0) this.f24828b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var.f28190a0 = floatValue3;
                le0Var.g(floatValue3);
                return;
            case 4:
                ((zg0) this.f24828b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ei0 ei0Var = (ei0) this.f24828b;
                ei0Var.H.E = AndroidUtilities.lerp(ei0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                mk0 mk0Var = (mk0) this.f24828b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.e.setAlpha(floatValue4);
                mk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                cl0 cl0Var = (cl0) this.f24828b;
                cl0Var.B0 = ((Float) cl0Var.f25276y0.getAnimatedValue()).floatValue();
                ah.v vVar = cl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                cl0Var.invalidate();
                return;
            case 8:
                ds dsVar = (ds) this.f24828b;
                dsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.setScaleX(floatValue5);
                dsVar.setScaleY(floatValue5);
                ((cl0) dsVar.f25629c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f24828b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                al0 al0Var = (al0) this.f24828b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                al0Var.I = floatValue6;
                zk0 zk0Var = al0Var.f24630b;
                float f10 = 1.0f;
                if (al0Var.f24636w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                zk0Var.setScaleY(floatValue6 * f7);
                float f11 = al0Var.I;
                if (al0Var.f24636w) {
                    f10 = 0.76f;
                }
                zk0Var.setScaleX(f11 * f10);
                return;
            case 11:
                nm0 nm0Var = (nm0) this.f24828b;
                nm0Var.getClass();
                nm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nm0Var.invalidateSelf();
                return;
            case 12:
                ym0 ym0Var = (ym0) this.f24828b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ym0Var.f32698r = floatValue7;
                ym0Var.f32702y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                ym0Var.f32702y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ym0Var.f32698r));
                ym0Var.f32702y.setAlpha(ym0Var.f32698r);
                ym0Var.f32699s.invalidate();
                ym0Var.v.invalidate();
                return;
            case 13:
                gn0 gn0Var = (gn0) this.f24828b;
                gn0Var.getClass();
                gn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.j();
                return;
            case 14:
                ((gn0) ((cn0) this.f24828b).f25287b).invalidate();
                return;
            case 15:
                kn0 kn0Var = (kn0) this.f24828b;
                kn0Var.getClass();
                kn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                fo0 fo0Var = (fo0) this.f24828b;
                fo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo0Var.F = floatValue8;
                fo0Var.setShown(floatValue8);
                fo0Var.b(false);
                return;
            case 17:
                sp0 sp0Var = (sp0) this.f24828b;
                sp0Var.getClass();
                sp0Var.f30300n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sp0Var.invalidate();
                return;
            case 18:
                hq0 hq0Var = (hq0) this.f24828b;
                er0 er0Var = hq0Var.f26909b;
                er0Var.f26002v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er0Var.f25979c.invalidate();
                hq0Var.invalidate();
                return;
            case 19:
                ((iu) this.f24828b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                tv0 tv0Var = (tv0) this.f24828b;
                tv0Var.O0(tv0Var.getTabProgress());
                return;
            case 21:
                ((mu0) this.f24828b).h.invalidate();
                return;
            case 22:
                aw0 aw0Var = (aw0) this.f24828b;
                aw0Var.getClass();
                aw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.invalidate();
                return;
            case 23:
                kw0 kw0Var = (kw0) ((androidx.activity.g) this.f24828b).f2648c;
                kw0Var.f28002f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kw0Var.N();
                return;
            case 24:
                qx0.x1((qx0) this.f24828b, valueAnimator);
                return;
            case 25:
                sx0 sx0Var = (sx0) this.f24828b;
                sx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sx0Var.a();
                return;
            case 26:
                wy0 wy0Var = (wy0) this.f24828b;
                wy0Var.getClass();
                wy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var.invalidate();
                return;
            case 27:
                zy0 zy0Var = (zy0) this.f24828b;
                zy0Var.getClass();
                zy0Var.f33058i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.f33053a.invalidate();
                return;
            case 28:
                q21 q21Var = (q21) this.f24828b;
                q21Var.getClass();
                q21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21Var.invalidate();
                return;
            default:
                r31 r31Var = (r31) this.f24828b;
                r31Var.getClass();
                r31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.n();
                return;
        }
    }
}
