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
                g80 g80Var = i80Var.f27192x;
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
                e90Var.f25863s = floatValue2;
                e90Var.d(floatValue2);
                return;
            case 3:
                me0 me0Var = ((ge0) this.f24828b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me0Var.f28495a0 = floatValue3;
                me0Var.h(floatValue3);
                return;
            case 4:
                ((ah0) this.f24828b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                fi0 fi0Var = (fi0) this.f24828b;
                fi0Var.H.E = AndroidUtilities.lerp(fi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                nk0 nk0Var = (nk0) this.f24828b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.e.setAlpha(floatValue4);
                nk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                dl0 dl0Var = (dl0) this.f24828b;
                dl0Var.B0 = ((Float) dl0Var.f25568y0.getAnimatedValue()).floatValue();
                ah.v vVar = dl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                dl0Var.invalidate();
                return;
            case 8:
                ds dsVar = (ds) this.f24828b;
                dsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.setScaleX(floatValue5);
                dsVar.setScaleY(floatValue5);
                ((dl0) dsVar.f25623c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f24828b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                bl0 bl0Var = (bl0) this.f24828b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl0Var.I = floatValue6;
                al0 al0Var = bl0Var.f24979b;
                float f10 = 1.0f;
                if (bl0Var.f24985w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                al0Var.setScaleY(floatValue6 * f7);
                float f11 = bl0Var.I;
                if (bl0Var.f24985w) {
                    f10 = 0.76f;
                }
                al0Var.setScaleX(f11 * f10);
                return;
            case 11:
                om0 om0Var = (om0) this.f24828b;
                om0Var.getClass();
                om0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om0Var.invalidateSelf();
                return;
            case 12:
                zm0 zm0Var = (zm0) this.f24828b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zm0Var.f32977r = floatValue7;
                zm0Var.f32981y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                zm0Var.f32981y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, zm0Var.f32977r));
                zm0Var.f32981y.setAlpha(zm0Var.f32977r);
                zm0Var.f32978s.invalidate();
                zm0Var.v.invalidate();
                return;
            case 13:
                hn0 hn0Var = (hn0) this.f24828b;
                hn0Var.getClass();
                hn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.j();
                return;
            case 14:
                ((hn0) ((dn0) this.f24828b).f25577b).invalidate();
                return;
            case 15:
                ln0 ln0Var = (ln0) this.f24828b;
                ln0Var.getClass();
                ln0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                go0 go0Var = (go0) this.f24828b;
                go0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                go0Var.F = floatValue8;
                go0Var.setShown(floatValue8);
                go0Var.b(false);
                return;
            case 17:
                tp0 tp0Var = (tp0) this.f24828b;
                tp0Var.getClass();
                tp0Var.f30649n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp0Var.invalidate();
                return;
            case 18:
                iq0 iq0Var = (iq0) this.f24828b;
                fr0 fr0Var = iq0Var.f27314b;
                fr0Var.f26393v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fr0Var.f26370c.invalidate();
                iq0Var.invalidate();
                return;
            case 19:
                ((iu) this.f24828b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                uv0 uv0Var = (uv0) this.f24828b;
                uv0Var.O0(uv0Var.getTabProgress());
                return;
            case 21:
                ((nu0) this.f24828b).h.invalidate();
                return;
            case 22:
                bw0 bw0Var = (bw0) this.f24828b;
                bw0Var.getClass();
                bw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.invalidate();
                return;
            case 23:
                lw0 lw0Var = (lw0) ((androidx.activity.g) this.f24828b).f2648c;
                lw0Var.f28300f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.N();
                return;
            case 24:
                rx0.x1((rx0) this.f24828b, valueAnimator);
                return;
            case 25:
                tx0 tx0Var = (tx0) this.f24828b;
                tx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var.a();
                return;
            case 26:
                xy0 xy0Var = (xy0) this.f24828b;
                xy0Var.getClass();
                xy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var.invalidate();
                return;
            case 27:
                az0 az0Var = (az0) this.f24828b;
                az0Var.getClass();
                az0Var.f24757i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var.f24752a.invalidate();
                return;
            case 28:
                r21 r21Var = (r21) this.f24828b;
                r21Var.getClass();
                r21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.invalidate();
                return;
            default:
                s31 s31Var = (s31) this.f24828b;
                s31Var.getClass();
                s31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s31Var.n();
                return;
        }
    }
}
