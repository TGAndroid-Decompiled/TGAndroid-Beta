package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24925a;
    public final Object f24926b;

    public b80(Object obj, int i10) {
        this.f24925a = i10;
        this.f24926b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24925a) {
            case 0:
                h80 h80Var = (h80) this.f24926b;
                h80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f80 f80Var = h80Var.f26933x;
                if (f80Var != null) {
                    f80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((f80) this.f24926b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                d90 d90Var = (d90) this.f24926b;
                d90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d90Var.f25630s = floatValue2;
                d90Var.d(floatValue2);
                return;
            case 3:
                ne0 ne0Var = ((he0) this.f24926b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ne0Var.f28882a0 = floatValue3;
                ne0Var.h(floatValue3);
                return;
            case 4:
                ((ch0) this.f24926b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                hi0 hi0Var = (hi0) this.f24926b;
                hi0Var.H.E = AndroidUtilities.lerp(hi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                pk0 pk0Var = (pk0) this.f24926b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk0Var.e.setAlpha(floatValue4);
                pk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                fl0 fl0Var = (fl0) this.f24926b;
                fl0Var.B0 = ((Float) fl0Var.f26390y0.getAnimatedValue()).floatValue();
                ah.v vVar = fl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                fl0Var.invalidate();
                return;
            case 8:
                bs bsVar = (bs) this.f24926b;
                bsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.setScaleX(floatValue5);
                bsVar.setScaleY(floatValue5);
                ((fl0) bsVar.f25083c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f24926b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                dl0 dl0Var = (dl0) this.f24926b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dl0Var.I = floatValue6;
                cl0 cl0Var = dl0Var.f25780b;
                float f10 = 1.0f;
                if (dl0Var.f25786w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                cl0Var.setScaleY(floatValue6 * f7);
                float f11 = dl0Var.I;
                if (dl0Var.f25786w) {
                    f10 = 0.76f;
                }
                cl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                qm0 qm0Var = (qm0) this.f24926b;
                qm0Var.getClass();
                qm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qm0Var.invalidateSelf();
                return;
            case 12:
                bn0 bn0Var = (bn0) this.f24926b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn0Var.f25058r = floatValue7;
                bn0Var.f25062y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                bn0Var.f25062y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, bn0Var.f25058r));
                bn0Var.f25062y.setAlpha(bn0Var.f25058r);
                bn0Var.f25059s.invalidate();
                bn0Var.v.invalidate();
                return;
            case 13:
                jn0 jn0Var = (jn0) this.f24926b;
                jn0Var.getClass();
                jn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn0Var.j();
                return;
            case 14:
                ((jn0) ((fn0) this.f24926b).f26397b).invalidate();
                return;
            case 15:
                nn0 nn0Var = (nn0) this.f24926b;
                nn0Var.getClass();
                nn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                io0 io0Var = (io0) this.f24926b;
                io0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                io0Var.F = floatValue8;
                io0Var.setShown(floatValue8);
                io0Var.b(false);
                return;
            case 17:
                wp0 wp0Var = (wp0) this.f24926b;
                wp0Var.getClass();
                wp0Var.f32319n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wp0Var.invalidate();
                return;
            case 18:
                lq0 lq0Var = (lq0) this.f24926b;
                hr0 hr0Var = lq0Var.f28432b;
                hr0Var.f27147v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hr0Var.f27123c.invalidate();
                lq0Var.invalidate();
                return;
            case 19:
                ((gu) this.f24926b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                wv0 wv0Var = (wv0) this.f24926b;
                wv0Var.P0(wv0Var.getTabProgress());
                return;
            case 21:
                ((pu0) this.f24926b).h.invalidate();
                return;
            case 22:
                dw0 dw0Var = (dw0) this.f24926b;
                dw0Var.getClass();
                dw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dw0Var.invalidate();
                return;
            case 23:
                nw0 nw0Var = (nw0) ((androidx.activity.g) this.f24926b).f2655c;
                nw0Var.f29055f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nw0Var.M();
                return;
            case 24:
                tx0.C1((tx0) this.f24926b, valueAnimator);
                return;
            case 25:
                vx0 vx0Var = (vx0) this.f24926b;
                vx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vx0Var.a();
                return;
            case 26:
                zy0 zy0Var = (zy0) this.f24926b;
                zy0Var.getClass();
                zy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.invalidate();
                return;
            case 27:
                cz0 cz0Var = (cz0) this.f24926b;
                cz0Var.getClass();
                cz0Var.f25497i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var.f25492a.invalidate();
                return;
            case 28:
                u21 u21Var = (u21) this.f24926b;
                u21Var.getClass();
                u21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u21Var.invalidate();
                return;
            default:
                v31 v31Var = (v31) this.f24926b;
                v31Var.getClass();
                v31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.p();
                return;
        }
    }
}
