package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24650a;
    public final Object f24651b;

    public f80(Object obj, int i10) {
        this.f24650a = i10;
        this.f24651b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24650a) {
            case 0:
                l80 l80Var = (l80) this.f24651b;
                l80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j80 j80Var = l80Var.f26672x;
                if (j80Var != null) {
                    j80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((j80) this.f24651b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                l90 l90Var = (l90) this.f24651b;
                l90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l90Var.f26690s = floatValue2;
                l90Var.d(floatValue2);
                return;
            case 3:
                re0 re0Var = ((me0) this.f24651b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var.T = floatValue3;
                re0Var.g(floatValue3);
                return;
            case 4:
                ((fh0) this.f24651b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ji0 ji0Var = (ji0) this.f24651b;
                ji0Var.H.E = AndroidUtilities.lerp(ji0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                qk0 qk0Var = (qk0) this.f24651b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.e.setAlpha(floatValue4);
                qk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                gl0 gl0Var = (gl0) this.f24651b;
                gl0Var.B0 = ((Float) gl0Var.f25049y0.getAnimatedValue()).floatValue();
                ah.v vVar = gl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                gl0Var.invalidate();
                return;
            case 8:
                gs gsVar = (gs) this.f24651b;
                gsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.setScaleX(floatValue5);
                gsVar.setScaleY(floatValue5);
                ((gl0) gsVar.f25102c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f24651b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                el0 el0Var = (el0) this.f24651b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.I = floatValue6;
                dl0 dl0Var = el0Var.f24417b;
                float f10 = 1.0f;
                if (el0Var.f24423w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dl0Var.setScaleY(floatValue6 * f7);
                float f11 = el0Var.I;
                if (el0Var.f24423w) {
                    f10 = 0.76f;
                }
                dl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                rm0 rm0Var = (rm0) this.f24651b;
                rm0Var.getClass();
                rm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm0Var.invalidateSelf();
                return;
            case 12:
                cn0 cn0Var = (cn0) this.f24651b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn0Var.f23832r = floatValue7;
                cn0Var.f23836y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                cn0Var.f23836y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.f23832r));
                cn0Var.f23836y.setAlpha(cn0Var.f23832r);
                cn0Var.f23833s.invalidate();
                cn0Var.v.invalidate();
                return;
            case 13:
                kn0 kn0Var = (kn0) this.f24651b;
                kn0Var.getClass();
                kn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn0Var.j();
                return;
            case 14:
                ((kn0) ((gn0) this.f24651b).f25057b).invalidate();
                return;
            case 15:
                on0 on0Var = (on0) this.f24651b;
                on0Var.getClass();
                on0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ko0 ko0Var = (ko0) this.f24651b;
                ko0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ko0Var.F = floatValue8;
                ko0Var.setShown(floatValue8);
                ko0Var.b(false);
                return;
            case 17:
                xp0 xp0Var = (xp0) this.f24651b;
                xp0Var.getClass();
                xp0Var.f30990n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xp0Var.invalidate();
                return;
            case 18:
                mq0 mq0Var = (mq0) this.f24651b;
                ir0 ir0Var = mq0Var.f27184b;
                ir0Var.f25765u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ir0Var.f25743c.invalidate();
                mq0Var.invalidate();
                return;
            case 19:
                ((nu) this.f24651b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                xv0 xv0Var = (xv0) this.f24651b;
                xv0Var.N0(xv0Var.getTabProgress());
                return;
            case 21:
                ((qu0) this.f24651b).h.invalidate();
                return;
            case 22:
                ew0 ew0Var = (ew0) this.f24651b;
                ew0Var.getClass();
                ew0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.invalidate();
                return;
            case 23:
                ow0 ow0Var = (ow0) ((androidx.activity.g) this.f24651b).f1033c;
                ow0Var.f27773f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ow0Var.N();
                return;
            case 24:
                ux0.x1((ux0) this.f24651b, valueAnimator);
                return;
            case 25:
                wx0 wx0Var = (wx0) this.f24651b;
                wx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.a();
                return;
            case 26:
                bz0 bz0Var = (bz0) this.f24651b;
                bz0Var.getClass();
                bz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bz0Var.invalidate();
                return;
            case 27:
                ez0 ez0Var = (ez0) this.f24651b;
                ez0Var.getClass();
                ez0Var.f24527i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var.f24522a.invalidate();
                return;
            case 28:
                w21 w21Var = (w21) this.f24651b;
                w21Var.getClass();
                w21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.invalidate();
                return;
            default:
                y31 y31Var = (y31) this.f24651b;
                y31Var.getClass();
                y31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y31Var.n();
                return;
        }
    }
}
