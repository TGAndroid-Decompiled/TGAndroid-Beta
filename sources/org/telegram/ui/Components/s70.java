package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28169a;
    public final Object f28170b;

    public s70(Object obj, int i10) {
        this.f28169a = i10;
        this.f28170b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28169a) {
            case 0:
                ((w70) this.f28170b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                v80 v80Var = (v80) this.f28170b;
                v80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v80Var.f29072s = floatValue;
                v80Var.d(floatValue);
                return;
            case 2:
                ce0 ce0Var = ((xd0) this.f28170b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var.P = floatValue2;
                ce0Var.f(floatValue2);
                return;
            case 3:
                ((og0) this.f28170b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                th0 th0Var = (th0) this.f28170b;
                th0Var.H.E = AndroidUtilities.lerp(th0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ak0 ak0Var = (ak0) this.f28170b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ak0Var.e.setAlpha(floatValue3);
                ak0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                qk0 qk0Var = (qk0) this.f28170b;
                qk0Var.B0 = ((Float) qk0Var.f27689y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = qk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                qk0Var.invalidate();
                return;
            case 7:
                tr trVar = (tr) this.f28170b;
                trVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.setScaleX(floatValue4);
                trVar.setScaleY(floatValue4);
                ((qk0) trVar.f28601c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f28170b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                ok0 ok0Var = (ok0) this.f28170b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok0Var.I = floatValue5;
                nk0 nk0Var = ok0Var.f27099b;
                float f10 = 1.0f;
                if (ok0Var.f27105w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                nk0Var.setScaleY(floatValue5 * f7);
                float f11 = ok0Var.I;
                if (ok0Var.f27105w) {
                    f10 = 0.76f;
                }
                nk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                bm0 bm0Var = (bm0) this.f28170b;
                bm0Var.getClass();
                bm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm0Var.invalidateSelf();
                return;
            case 11:
                mm0 mm0Var = (mm0) this.f28170b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mm0Var.f26539r = floatValue6;
                mm0Var.f26543y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                mm0Var.f26543y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, mm0Var.f26539r));
                mm0Var.f26543y.setAlpha(mm0Var.f26539r);
                mm0Var.f26540s.invalidate();
                mm0Var.v.invalidate();
                return;
            case 12:
                um0 um0Var = (um0) this.f28170b;
                um0Var.getClass();
                um0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.j();
                return;
            case 13:
                ((um0) ((qm0) this.f28170b).f27707b).invalidate();
                return;
            case 14:
                ym0 ym0Var = (ym0) this.f28170b;
                ym0Var.getClass();
                ym0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                un0 un0Var = (un0) this.f28170b;
                un0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un0Var.F = floatValue7;
                un0Var.setShown(floatValue7);
                un0Var.b(false);
                return;
            case 16:
                jp0 jp0Var = (jp0) this.f28170b;
                jp0Var.getClass();
                jp0Var.f25460n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jp0Var.invalidate();
                return;
            case 17:
                yp0 yp0Var = (yp0) this.f28170b;
                uq0 uq0Var = yp0Var.f30651b;
                uq0Var.f28886u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq0Var.f28864c.invalidate();
                yp0Var.invalidate();
                return;
            case 18:
                ((cu) this.f28170b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                jv0 jv0Var = (jv0) this.f28170b;
                jv0Var.M0(jv0Var.getTabProgress());
                return;
            case 20:
                ((cu0) this.f28170b).h.invalidate();
                return;
            case 21:
                qv0 qv0Var = (qv0) this.f28170b;
                qv0Var.getClass();
                qv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.invalidate();
                return;
            case 22:
                aw0 aw0Var = (aw0) ((androidx.activity.g) this.f28170b).f1882c;
                aw0Var.f22787f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.N();
                return;
            case 23:
                gx0.w1((gx0) this.f28170b, valueAnimator);
                return;
            case 24:
                ix0 ix0Var = (ix0) this.f28170b;
                ix0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ix0Var.a();
                return;
            case 25:
                ny0 ny0Var = (ny0) this.f28170b;
                ny0Var.getClass();
                ny0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ny0Var.invalidate();
                return;
            case 26:
                qy0 qy0Var = (qy0) this.f28170b;
                qy0Var.getClass();
                qy0Var.f27789i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qy0Var.f27784a.invalidate();
                return;
            case 27:
                h21 h21Var = (h21) this.f28170b;
                h21Var.getClass();
                h21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.invalidate();
                return;
            case 28:
                k31 k31Var = (k31) this.f28170b;
                k31Var.getClass();
                k31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.n();
                return;
            default:
                c51 c51Var = (c51) this.f28170b;
                c51Var.getClass();
                c51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                return;
        }
    }
}
