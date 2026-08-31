package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k70 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28300a;
    public final Object f28301b;

    public k70(Object obj, int i10) {
        this.f28300a = i10;
        this.f28301b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f28300a) {
            case 0:
                ((o70) this.f28301b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                n80 n80Var = (n80) this.f28301b;
                n80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n80Var.f29431s = floatValue;
                n80Var.d(floatValue);
                return;
            case 2:
                xd0 xd0Var = ((rd0) this.f28301b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.M = floatValue2;
                xd0Var.f(floatValue2);
                return;
            case 3:
                ((ng0) this.f28301b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                rh0 rh0Var = (rh0) this.f28301b;
                rh0Var.E.E = AndroidUtilities.lerp(rh0Var.G, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                ak0 ak0Var = (ak0) this.f28301b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ak0Var.f25274e.setAlpha(floatValue3);
                ak0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                rk0 rk0Var = (rk0) this.f28301b;
                rk0Var.f30793y0 = ((Float) rk0Var.f30787v0.getAnimatedValue()).floatValue();
                ag.l lVar = rk0Var.P;
                if (lVar != null) {
                    lVar.invalidate();
                }
                rk0Var.invalidate();
                return;
            case 7:
                rr rrVar = (rr) this.f28301b;
                rrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rrVar.setScaleX(floatValue4);
                rrVar.setScaleY(floatValue4);
                ((rk0) rrVar.f30832c).P.invalidate();
                return;
            case 8:
                ((q0.a) this.f28301b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                pk0 pk0Var = (pk0) this.f28301b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk0Var.F = floatValue5;
                ok0 ok0Var = pk0Var.f30099b;
                float f11 = 1.0f;
                if (pk0Var.f30106w) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ok0Var.setScaleY(floatValue5 * f10);
                float f12 = pk0Var.F;
                if (pk0Var.f30106w) {
                    f11 = 0.76f;
                }
                ok0Var.setScaleX(f12 * f11);
                return;
            case 10:
                zl0 zl0Var = (zl0) this.f28301b;
                zl0Var.getClass();
                zl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zl0Var.invalidateSelf();
                return;
            case 11:
                jm0 jm0Var = (jm0) this.f28301b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.f28162r = floatValue6;
                jm0Var.f28166y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                jm0Var.f28166y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, jm0Var.f28162r));
                jm0Var.f28166y.setAlpha(jm0Var.f28162r);
                jm0Var.f28163s.invalidate();
                jm0Var.v.invalidate();
                return;
            case 12:
                qm0 qm0Var = (qm0) this.f28301b;
                qm0Var.getClass();
                qm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qm0Var.j();
                return;
            case 13:
                ((qm0) ((nm0) this.f28301b).f29565b).invalidate();
                return;
            case 14:
                vm0 vm0Var = (vm0) this.f28301b;
                vm0Var.getClass();
                vm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                pn0 pn0Var = (pn0) this.f28301b;
                pn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.C = floatValue7;
                pn0Var.setShown(floatValue7);
                pn0Var.b(false);
                return;
            case 16:
                bp0 bp0Var = (bp0) this.f28301b;
                bp0Var.getClass();
                bp0Var.f25698n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bp0Var.invalidate();
                return;
            case 17:
                pp0 pp0Var = (pp0) this.f28301b;
                mq0 mq0Var = pp0Var.f30164b;
                mq0Var.f29218r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mq0Var.f29199c.invalidate();
                pp0Var.invalidate();
                return;
            case 18:
                ((xt) this.f28301b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                zu0 zu0Var = (zu0) this.f28301b;
                zu0Var.M0(zu0Var.getTabProgress());
                return;
            case 20:
                ((rt0) this.f28301b).h.invalidate();
                return;
            case 21:
                gv0 gv0Var = (gv0) this.f28301b;
                gv0Var.getClass();
                gv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                return;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.f28301b).f335c;
                qv0Var.f30492c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                return;
            case 23:
                yw0.w1((yw0) this.f28301b, valueAnimator);
                return;
            case 24:
                ax0 ax0Var = (ax0) this.f28301b;
                ax0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ax0Var.a();
                return;
            case 25:
                gy0 gy0Var = (gy0) this.f28301b;
                gy0Var.getClass();
                gy0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                return;
            case 26:
                jy0 jy0Var = (jy0) this.f28301b;
                jy0Var.getClass();
                jy0Var.f28232i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jy0Var.f28226a.invalidate();
                return;
            case 27:
                x11 x11Var = (x11) this.f28301b;
                x11Var.getClass();
                x11Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var.invalidate();
                return;
            case 28:
                x21 x21Var = (x21) this.f28301b;
                x21Var.getClass();
                x21Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.n();
                return;
            default:
                q41 q41Var = (q41) this.f28301b;
                q41Var.getClass();
                q41Var.f30278y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q41Var.invalidate();
                return;
        }
    }
}
