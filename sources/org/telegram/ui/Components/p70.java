package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27179a;
    public final Object f27180b;

    public p70(Object obj, int i10) {
        this.f27179a = i10;
        this.f27180b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f27179a) {
            case 0:
                ((t70) this.f27180b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                s80 s80Var = (s80) this.f27180b;
                s80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s80Var.f28082s = floatValue;
                s80Var.d(floatValue);
                return;
            case 2:
                ae0 ae0Var = ((vd0) this.f27180b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae0Var.P = floatValue2;
                ae0Var.f(floatValue2);
                return;
            case 3:
                ((og0) this.f27180b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                sh0 sh0Var = (sh0) this.f27180b;
                sh0Var.H.E = AndroidUtilities.lerp(sh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                zj0 zj0Var = (zj0) this.f27180b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj0Var.e.setAlpha(floatValue3);
                zj0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                pk0 pk0Var = (pk0) this.f27180b;
                pk0Var.B0 = ((Float) pk0Var.f27378y0.getAnimatedValue()).floatValue();
                ci.n6 n6Var = pk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                pk0Var.invalidate();
                return;
            case 7:
                sr srVar = (sr) this.f27180b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((pk0) srVar.f28207c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f27180b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                nk0 nk0Var = (nk0) this.f27180b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.I = floatValue5;
                mk0 mk0Var = nk0Var.f26671b;
                float f10 = 1.0f;
                if (nk0Var.f26677w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                mk0Var.setScaleY(floatValue5 * f7);
                float f11 = nk0Var.I;
                if (nk0Var.f26677w) {
                    f10 = 0.76f;
                }
                mk0Var.setScaleX(f11 * f10);
                return;
            case 10:
                am0 am0Var = (am0) this.f27180b;
                am0Var.getClass();
                am0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.invalidateSelf();
                return;
            case 11:
                mm0 mm0Var = (mm0) this.f27180b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mm0Var.f26423r = floatValue6;
                mm0Var.f26427y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                mm0Var.f26427y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, mm0Var.f26423r));
                mm0Var.f26427y.setAlpha(mm0Var.f26423r);
                mm0Var.f26424s.invalidate();
                mm0Var.v.invalidate();
                return;
            case 12:
                um0 um0Var = (um0) this.f27180b;
                um0Var.getClass();
                um0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.j();
                return;
            case 13:
                ((um0) ((qm0) this.f27180b).f27614b).invalidate();
                return;
            case 14:
                ym0 ym0Var = (ym0) this.f27180b;
                ym0Var.getClass();
                ym0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                un0 un0Var = (un0) this.f27180b;
                un0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un0Var.F = floatValue7;
                un0Var.setShown(floatValue7);
                un0Var.b(false);
                return;
            case 16:
                jp0 jp0Var = (jp0) this.f27180b;
                jp0Var.getClass();
                jp0Var.f25424n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jp0Var.invalidate();
                return;
            case 17:
                yp0 yp0Var = (yp0) this.f27180b;
                uq0 uq0Var = yp0Var.f30593b;
                uq0Var.f28829u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq0Var.f28807c.invalidate();
                yp0Var.invalidate();
                return;
            case 18:
                ((bu) this.f27180b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                jv0 jv0Var = (jv0) this.f27180b;
                jv0Var.M0(jv0Var.getTabProgress());
                return;
            case 20:
                ((cu0) this.f27180b).h.invalidate();
                return;
            case 21:
                qv0 qv0Var = (qv0) this.f27180b;
                qv0Var.getClass();
                qv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.invalidate();
                return;
            case 22:
                aw0 aw0Var = (aw0) ((androidx.activity.g) this.f27180b).f1890c;
                aw0Var.f22790f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.N();
                return;
            case 23:
                hx0.x1((hx0) this.f27180b, valueAnimator);
                return;
            case 24:
                jx0 jx0Var = (jx0) this.f27180b;
                jx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.a();
                return;
            case 25:
                oy0 oy0Var = (oy0) this.f27180b;
                oy0Var.getClass();
                oy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oy0Var.invalidate();
                return;
            case 26:
                ry0 ry0Var = (ry0) this.f27180b;
                ry0Var.getClass();
                ry0Var.f27980i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry0Var.f27975a.invalidate();
                return;
            case 27:
                i21 i21Var = (i21) this.f27180b;
                i21Var.getClass();
                i21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i21Var.invalidate();
                return;
            case 28:
                l31 l31Var = (l31) this.f27180b;
                l31Var.getClass();
                l31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.n();
                return;
            default:
                d51 d51Var = (d51) this.f27180b;
                d51Var.getClass();
                d51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d51Var.invalidate();
                return;
        }
    }
}
