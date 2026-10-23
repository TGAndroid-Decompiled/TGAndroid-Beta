package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25519a;
    public final Object f25520b;

    public d80(Object obj, int i10) {
        this.f25519a = i10;
        this.f25520b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f25519a) {
            case 0:
                j80 j80Var = (j80) this.f25520b;
                j80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h80 h80Var = j80Var.f27584x;
                if (h80Var != null) {
                    h80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((h80) this.f25520b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                f90 f90Var = (f90) this.f25520b;
                f90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f90Var.f26240s = floatValue2;
                f90Var.d(floatValue2);
                return;
            case 3:
                pe0 pe0Var = ((je0) this.f25520b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pe0Var.f29526a0 = floatValue3;
                pe0Var.h(floatValue3);
                return;
            case 4:
                ((dh0) this.f25520b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ii0 ii0Var = (ii0) this.f25520b;
                ii0Var.H.E = AndroidUtilities.lerp(ii0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                qk0 qk0Var = (qk0) this.f25520b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.e.setAlpha(floatValue4);
                qk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                gl0 gl0Var = (gl0) this.f25520b;
                gl0Var.B0 = ((Float) gl0Var.f26672y0.getAnimatedValue()).floatValue();
                ah.v vVar = gl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                gl0Var.invalidate();
                return;
            case 8:
                ds dsVar = (ds) this.f25520b;
                dsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.setScaleX(floatValue5);
                dsVar.setScaleY(floatValue5);
                ((gl0) dsVar.f25723c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f25520b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                el0 el0Var = (el0) this.f25520b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.I = floatValue6;
                dl0 dl0Var = el0Var.f26000b;
                float f10 = 1.0f;
                if (el0Var.f26006w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dl0Var.setScaleY(floatValue6 * f7);
                float f11 = el0Var.I;
                if (el0Var.f26006w) {
                    f10 = 0.76f;
                }
                dl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                rm0 rm0Var = (rm0) this.f25520b;
                rm0Var.getClass();
                rm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm0Var.invalidateSelf();
                return;
            case 12:
                cn0 cn0Var = (cn0) this.f25520b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn0Var.f25388r = floatValue7;
                cn0Var.f25392y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                cn0Var.f25392y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.f25388r));
                cn0Var.f25392y.setAlpha(cn0Var.f25388r);
                cn0Var.f25389s.invalidate();
                cn0Var.v.invalidate();
                return;
            case 13:
                kn0 kn0Var = (kn0) this.f25520b;
                kn0Var.getClass();
                kn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn0Var.j();
                return;
            case 14:
                ((kn0) ((gn0) this.f25520b).f26682b).invalidate();
                return;
            case 15:
                on0 on0Var = (on0) this.f25520b;
                on0Var.getClass();
                on0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                jo0 jo0Var = (jo0) this.f25520b;
                jo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jo0Var.F = floatValue8;
                jo0Var.setShown(floatValue8);
                jo0Var.b(false);
                return;
            case 17:
                xp0 xp0Var = (xp0) this.f25520b;
                xp0Var.getClass();
                xp0Var.f32626n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xp0Var.invalidate();
                return;
            case 18:
                mq0 mq0Var = (mq0) this.f25520b;
                ir0 ir0Var = mq0Var.f28747b;
                ir0Var.f27435v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ir0Var.f27411c.invalidate();
                mq0Var.invalidate();
                return;
            case 19:
                ((iu) this.f25520b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                xv0 xv0Var = (xv0) this.f25520b;
                xv0Var.P0(xv0Var.getTabProgress());
                return;
            case 21:
                ((qu0) this.f25520b).h.invalidate();
                return;
            case 22:
                ew0 ew0Var = (ew0) this.f25520b;
                ew0Var.getClass();
                ew0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.invalidate();
                return;
            case 23:
                ow0 ow0Var = (ow0) ((androidx.activity.g) this.f25520b).f2655c;
                ow0Var.f29336f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ow0Var.M();
                return;
            case 24:
                ux0.C1((ux0) this.f25520b, valueAnimator);
                return;
            case 25:
                wx0 wx0Var = (wx0) this.f25520b;
                wx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.a();
                return;
            case 26:
                az0 az0Var = (az0) this.f25520b;
                az0Var.getClass();
                az0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var.invalidate();
                return;
            case 27:
                dz0 dz0Var = (dz0) this.f25520b;
                dz0Var.getClass();
                dz0Var.f25760i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var.f25755a.invalidate();
                return;
            case 28:
                v21 v21Var = (v21) this.f25520b;
                v21Var.getClass();
                v21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.invalidate();
                return;
            default:
                w31 w31Var = (w31) this.f25520b;
                w31Var.getClass();
                w31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w31Var.p();
                return;
        }
    }
}
