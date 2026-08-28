package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31842a;
    public final Object f31843b;

    public q60(Object obj, int i9) {
        this.f31842a = i9;
        this.f31843b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f31842a) {
            case 0:
                ((v60) this.f31843b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                t70 t70Var = (t70) this.f31843b;
                t70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t70Var.f32644s = floatValue;
                t70Var.d(floatValue);
                return;
            case 2:
                yc0 yc0Var = ((tc0) this.f31843b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0Var.L = floatValue2;
                yc0Var.f(floatValue2);
                return;
            case 3:
                ((pf0) this.f31843b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ug0 ug0Var = (ug0) this.f31843b;
                ug0Var.D.E = AndroidUtilities.lerp(ug0Var.F, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ej0 ej0Var = (ej0) this.f31843b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var.f28040e.setAlpha(floatValue3);
                ej0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                uj0 uj0Var = (uj0) this.f31843b;
                uj0Var.f33080x0 = ((Float) uj0Var.f33075u0.getAnimatedValue()).floatValue();
                fh.v vVar = uj0Var.O;
                if (vVar != null) {
                    vVar.invalidate();
                }
                uj0Var.invalidate();
                return;
            case 7:
                ir irVar = (ir) this.f31843b;
                irVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                irVar.setScaleX(floatValue4);
                irVar.setScaleY(floatValue4);
                ((uj0) irVar.f29511c).O.invalidate();
                return;
            case 8:
                ((q0.a) this.f31843b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                sj0 sj0Var = (sj0) this.f31843b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sj0Var.E = floatValue5;
                rj0 rj0Var = sj0Var.f32475b;
                float f11 = 1.0f;
                if (sj0Var.f32482w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                rj0Var.setScaleY(floatValue5 * f10);
                float f12 = sj0Var.E;
                if (sj0Var.f32482w) {
                    f11 = 0.76f;
                }
                rj0Var.setScaleX(f12 * f11);
                return;
            case 10:
                bl0 bl0Var = (bl0) this.f31843b;
                bl0Var.getClass();
                bl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl0Var.invalidateSelf();
                return;
            case 11:
                ll0 ll0Var = (ll0) this.f31843b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ll0Var.f30476r = floatValue6;
                ll0Var.f30480y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                ll0Var.f30480y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ll0Var.f30476r));
                ll0Var.f30480y.setAlpha(ll0Var.f30476r);
                ll0Var.f30477s.invalidate();
                ll0Var.v.invalidate();
                return;
            case 12:
                sl0 sl0Var = (sl0) this.f31843b;
                sl0Var.getClass();
                sl0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sl0Var.j();
                return;
            case 13:
                ((sl0) ((pl0) this.f31843b).f31689b).invalidate();
                return;
            case 14:
                xl0 xl0Var = (xl0) this.f31843b;
                xl0Var.getClass();
                xl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                sm0 sm0Var = (sm0) this.f31843b;
                sm0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.B = floatValue7;
                sm0Var.setShown(floatValue7);
                sm0Var.b(false);
                return;
            case 16:
                fo0 fo0Var = (fo0) this.f31843b;
                fo0Var.getClass();
                fo0Var.f28534n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo0Var.invalidate();
                return;
            case 17:
                uo0 uo0Var = (uo0) this.f31843b;
                rp0 rp0Var = uo0Var.f33100b;
                rp0Var.f32261q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rp0Var.f32244c.invalidate();
                uo0Var.invalidate();
                return;
            case 18:
                ((mt) this.f31843b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                eu0 eu0Var = (eu0) this.f31843b;
                eu0Var.M0(eu0Var.getTabProgress());
                return;
            case 20:
                ((xs0) this.f31843b).h.invalidate();
                return;
            case 21:
                mu0 mu0Var = (mu0) this.f31843b;
                mu0Var.getClass();
                mu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu0Var.invalidate();
                return;
            case 22:
                xu0 xu0Var = (xu0) ((androidx.activity.g) this.f31843b).f367c;
                xu0Var.f34774b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.N();
                return;
            case 23:
                ew0.w1((ew0) this.f31843b, valueAnimator);
                return;
            case 24:
                gw0 gw0Var = (gw0) this.f31843b;
                gw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gw0Var.a();
                return;
            case 25:
                kx0 kx0Var = (kx0) this.f31843b;
                kx0Var.getClass();
                kx0Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.invalidate();
                return;
            case 26:
                nx0 nx0Var = (nx0) this.f31843b;
                nx0Var.getClass();
                nx0Var.f31210i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.f31204a.invalidate();
                return;
            case 27:
                a11 a11Var = (a11) this.f31843b;
                a11Var.getClass();
                a11Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var.invalidate();
                return;
            case 28:
                b21 b21Var = (b21) this.f31843b;
                b21Var.getClass();
                b21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b21Var.n();
                return;
            default:
                s31 s31Var = (s31) this.f31843b;
                s31Var.getClass();
                s31Var.f32358x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s31Var.invalidate();
                return;
        }
    }
}
