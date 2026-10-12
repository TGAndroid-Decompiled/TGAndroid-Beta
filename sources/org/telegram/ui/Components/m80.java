package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28435a;
    public final Object f28436b;

    public m80(Object obj, int i10) {
        this.f28435a = i10;
        this.f28436b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28435a) {
            case 0:
                s80 s80Var = (s80) this.f28436b;
                s80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q80 q80Var = s80Var.f30472x;
                if (q80Var != null) {
                    q80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((q80) this.f28436b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                q90 q90Var = (q90) this.f28436b;
                q90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q90Var.f29783s = floatValue2;
                q90Var.d(floatValue2);
                return;
            case 3:
                xe0 xe0Var = ((se0) this.f28436b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0Var.T = floatValue3;
                xe0Var.g(floatValue3);
                return;
            case 4:
                ((jh0) this.f28436b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                qi0 qi0Var = (qi0) this.f28436b;
                qi0Var.H.E = AndroidUtilities.lerp(qi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                xk0 xk0Var = (xk0) this.f28436b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xk0Var.f32787e.setAlpha(floatValue4);
                xk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                nl0 nl0Var = (nl0) this.f28436b;
                nl0Var.B0 = ((Float) nl0Var.f28868y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = nl0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                nl0Var.invalidate();
                return;
            case 8:
                ls lsVar = (ls) this.f28436b;
                lsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lsVar.setScaleX(floatValue5);
                lsVar.setScaleY(floatValue5);
                ((nl0) lsVar.f28269c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f28436b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                ll0 ll0Var = (ll0) this.f28436b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ll0Var.I = floatValue6;
                kl0 kl0Var = ll0Var.f28219b;
                float f10 = 1.0f;
                if (ll0Var.f28226w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                kl0Var.setScaleY(floatValue6 * f7);
                float f11 = ll0Var.I;
                if (ll0Var.f28226w) {
                    f10 = 0.76f;
                }
                kl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                bn0 bn0Var = (bn0) this.f28436b;
                bn0Var.getClass();
                bn0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn0Var.invalidateSelf();
                return;
            case 12:
                mn0 mn0Var = (mn0) this.f28436b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn0Var.f28600r = floatValue7;
                mn0Var.f28604y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                mn0Var.f28604y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, mn0Var.f28600r));
                mn0Var.f28604y.setAlpha(mn0Var.f28600r);
                mn0Var.f28601s.invalidate();
                mn0Var.v.invalidate();
                return;
            case 13:
                un0 un0Var = (un0) this.f28436b;
                un0Var.getClass();
                un0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un0Var.j();
                return;
            case 14:
                ((un0) ((qn0) this.f28436b).f29871b).invalidate();
                return;
            case 15:
                yn0 yn0Var = (yn0) this.f28436b;
                yn0Var.getClass();
                yn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                to0 to0Var = (to0) this.f28436b;
                to0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                to0Var.F = floatValue8;
                to0Var.setShown(floatValue8);
                to0Var.b(false);
                return;
            case 17:
                hq0 hq0Var = (hq0) this.f28436b;
                hq0Var.getClass();
                hq0Var.f26872n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hq0Var.invalidate();
                return;
            case 18:
                wq0 wq0Var = (wq0) this.f28436b;
                sr0 sr0Var = wq0Var.f32535b;
                sr0Var.f30658u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sr0Var.f30635c.invalidate();
                wq0Var.invalidate();
                return;
            case 19:
                ((uu) this.f28436b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                hw0 hw0Var = (hw0) this.f28436b;
                hw0Var.M0(hw0Var.getTabProgress());
                return;
            case 21:
                ((av0) this.f28436b).h.invalidate();
                return;
            case 22:
                ow0 ow0Var = (ow0) this.f28436b;
                ow0Var.getClass();
                ow0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ow0Var.invalidate();
                return;
            case 23:
                yw0 yw0Var = (yw0) ((androidx.activity.g) this.f28436b).f2126c;
                yw0Var.f33200f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yw0Var.N();
                return;
            case 24:
                ey0.x1((ey0) this.f28436b, valueAnimator);
                return;
            case 25:
                gy0 gy0Var = (gy0) this.f28436b;
                gy0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.a();
                return;
            case 26:
                kz0 kz0Var = (kz0) this.f28436b;
                kz0Var.getClass();
                kz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kz0Var.invalidate();
                return;
            case 27:
                nz0 nz0Var = (nz0) this.f28436b;
                nz0Var.getClass();
                nz0Var.f28994i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz0Var.f28988a.invalidate();
                return;
            case 28:
                f31 f31Var = (f31) this.f28436b;
                f31Var.getClass();
                f31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.invalidate();
                return;
            default:
                h41 h41Var = (h41) this.f28436b;
                h41Var.getClass();
                h41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h41Var.o();
                return;
        }
    }
}
