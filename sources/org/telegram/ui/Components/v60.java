package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class v60 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33278a;

    public final Object f33279b;

    public v60(Object obj, int i10) {
        this.f33278a = i10;
        this.f33279b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33278a) {
            case 0:
                ((z60) this.f33279b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                x70 x70Var = (x70) this.f33279b;
                x70Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x70Var.f34535s = fFloatValue;
                x70Var.d(fFloatValue);
                break;
            case 2:
                dd0 dd0Var = ((yc0) this.f33279b).d;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dd0Var.L = fFloatValue2;
                dd0Var.f(fFloatValue2);
                break;
            case 3:
                ((sf0) this.f33279b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                wg0 wg0Var = (wg0) this.f33279b;
                wg0Var.D.E = AndroidUtilities.lerp(wg0Var.F, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                gj0 gj0Var = (gj0) this.f33279b;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gj0Var.f28726e.setAlpha(fFloatValue3);
                gj0Var.h.setAlpha(1.0f - fFloatValue3);
                break;
            case 6:
                wj0 wj0Var = (wj0) this.f33279b;
                wj0Var.f34271x0 = ((Float) wj0Var.f34266u0.getAnimatedValue()).floatValue();
                ag.y1 y1Var = wj0Var.O;
                if (y1Var != null) {
                    y1Var.invalidate();
                }
                wj0Var.invalidate();
                break;
            case 7:
                gr grVar = (gr) this.f33279b;
                grVar.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                grVar.setScaleX(fFloatValue4);
                grVar.setScaleY(fFloatValue4);
                ((wj0) grVar.f28803c).O.invalidate();
                break;
            case 8:
                ((q0.a) this.f33279b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                uj0 uj0Var = (uj0) this.f33279b;
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uj0Var.E = fFloatValue5;
                tj0 tj0Var = uj0Var.f33100b;
                tj0Var.setScaleY(fFloatValue5 * (uj0Var.f33107w ? 0.76f : 1.0f));
                tj0Var.setScaleX(uj0Var.E * (uj0Var.f33107w ? 0.76f : 1.0f));
                break;
            case 10:
                el0 el0Var = (el0) this.f33279b;
                el0Var.getClass();
                el0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.invalidateSelf();
                break;
            case 11:
                ol0 ol0Var = (ol0) this.f33279b;
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol0Var.f31354r = fFloatValue6;
                ol0Var.f31358y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue6));
                ol0Var.f31358y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ol0Var.f31354r));
                ol0Var.f31358y.setAlpha(ol0Var.f31354r);
                ol0Var.f31355s.invalidate();
                ol0Var.v.invalidate();
                break;
            case 12:
                vl0 vl0Var = (vl0) this.f33279b;
                vl0Var.getClass();
                vl0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vl0Var.j();
                break;
            case 13:
                ((vl0) ((sl0) this.f33279b).f32482b).invalidate();
                break;
            case 14:
                am0 am0Var = (am0) this.f33279b;
                am0Var.getClass();
                am0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                um0 um0Var = (um0) this.f33279b;
                um0Var.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.B = fFloatValue7;
                um0Var.setShown(fFloatValue7);
                um0Var.b(false);
                break;
            case 16:
                go0 go0Var = (go0) this.f33279b;
                go0Var.getClass();
                go0Var.f28784n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                go0Var.invalidate();
                break;
            case 17:
                uo0 uo0Var = (uo0) this.f33279b;
                sp0 sp0Var = uo0Var.f33162b;
                sp0Var.f32539q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sp0Var.f32522c.invalidate();
                uo0Var.invalidate();
                break;
            case 18:
                ((lt) this.f33279b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                hu0 hu0Var = (hu0) this.f33279b;
                hu0Var.M0(hu0Var.getTabProgress());
                break;
            case 20:
                ((zs0) this.f33279b).h.invalidate();
                break;
            case 21:
                pu0 pu0Var = (pu0) this.f33279b;
                pu0Var.getClass();
                pu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pu0Var.invalidate();
                break;
            case 22:
                zu0 zu0Var = (zu0) ((androidx.activity.g) this.f33279b).f875c;
                zu0Var.f35369b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu0Var.N();
                break;
            case 23:
                ((gw0) this.f33279b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                iw0 iw0Var = (iw0) this.f33279b;
                iw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.a();
                break;
            case 25:
                mx0 mx0Var = (mx0) this.f33279b;
                mx0Var.getClass();
                mx0Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var.invalidate();
                break;
            case 26:
                px0 px0Var = (px0) this.f33279b;
                px0Var.getClass();
                px0Var.f31684i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.f31678a.invalidate();
                break;
            case 27:
                b11 b11Var = (b11) this.f33279b;
                b11Var.getClass();
                b11Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.invalidate();
                break;
            case 28:
                d21 d21Var = (d21) this.f33279b;
                d21Var.getClass();
                d21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d21Var.n();
                break;
            default:
                u31 u31Var = (u31) this.f33279b;
                u31Var.getClass();
                u31Var.f32962x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31Var.invalidate();
                break;
        }
    }
}
