package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class e80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27756a;
    public final Object f27757b;

    public e80(Object obj, int i10) {
        this.f27756a = i10;
        this.f27757b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f27756a) {
            case 0:
                k80 k80Var = (k80) this.f27757b;
                k80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i80 i80Var = k80Var.f29872x;
                if (i80Var != null) {
                    i80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((i80) this.f27757b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                g90 g90Var = (g90) this.f27757b;
                g90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g90Var.f28507s = floatValue2;
                g90Var.d(floatValue2);
                return;
            case 3:
                le0 le0Var = ((fe0) this.f27757b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var.f30186a0 = floatValue3;
                le0Var.h(floatValue3);
                return;
            case 4:
                ((ch0) this.f27757b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                hi0 hi0Var = (hi0) this.f27757b;
                hi0Var.H.E = AndroidUtilities.lerp(hi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                pk0 pk0Var = (pk0) this.f27757b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk0Var.e.setAlpha(floatValue4);
                pk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                fl0 fl0Var = (fl0) this.f27757b;
                fl0Var.B0 = ((Float) fl0Var.f28272y0.getAnimatedValue()).floatValue();
                bh.p pVar = fl0Var.S;
                if (pVar != null) {
                    pVar.invalidate();
                }
                fl0Var.invalidate();
                return;
            case 8:
                fs fsVar = (fs) this.f27757b;
                fsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.setScaleX(floatValue5);
                fsVar.setScaleY(floatValue5);
                ((fl0) fsVar.f28307c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f27757b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                dl0 dl0Var = (dl0) this.f27757b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dl0Var.I = floatValue6;
                cl0 cl0Var = dl0Var.f27551b;
                float f10 = 1.0f;
                if (dl0Var.f27557w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                cl0Var.setScaleY(floatValue6 * f7);
                float f11 = dl0Var.I;
                if (dl0Var.f27557w) {
                    f10 = 0.76f;
                }
                cl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                um0 um0Var = (um0) this.f27757b;
                um0Var.getClass();
                um0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.invalidateSelf();
                return;
            case 12:
                hn0 hn0Var = (hn0) this.f27757b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.f29025r = floatValue7;
                hn0Var.f29029y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                hn0Var.f29029y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hn0Var.f29025r));
                hn0Var.f29029y.setAlpha(hn0Var.f29025r);
                hn0Var.f29026s.invalidate();
                hn0Var.v.invalidate();
                return;
            case 13:
                pn0 pn0Var = (pn0) this.f27757b;
                pn0Var.getClass();
                pn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.j();
                return;
            case 14:
                ((pn0) ((ln0) this.f27757b).f30234b).invalidate();
                return;
            case 15:
                tn0 tn0Var = (tn0) this.f27757b;
                tn0Var.getClass();
                tn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                oo0 oo0Var = (oo0) this.f27757b;
                oo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oo0Var.F = floatValue8;
                oo0Var.setShown(floatValue8);
                oo0Var.b(false);
                return;
            case 17:
                cq0 cq0Var = (cq0) this.f27757b;
                cq0Var.getClass();
                cq0Var.f27241n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.invalidate();
                return;
            case 18:
                qq0 qq0Var = (qq0) this.f27757b;
                mr0 mr0Var = qq0Var.f32002b;
                mr0Var.f30725v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mr0Var.f30702c.invalidate();
                qq0Var.invalidate();
                return;
            case 19:
                ((ju) this.f27757b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                aw0 aw0Var = (aw0) this.f27757b;
                aw0Var.T0(aw0Var.getTabProgress());
                return;
            case 21:
                ((tu0) this.f27757b).h.invalidate();
                return;
            case 22:
                mw0 mw0Var = (mw0) this.f27757b;
                mw0Var.getClass();
                mw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mw0Var.invalidate();
                return;
            case 23:
                by0.C1((by0) this.f27757b, valueAnimator);
                return;
            case 24:
                ey0 ey0Var = (ey0) this.f27757b;
                ey0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey0Var.a();
                return;
            case 25:
                jz0 jz0Var = (jz0) this.f27757b;
                jz0Var.getClass();
                jz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jz0Var.invalidate();
                return;
            case 26:
                mz0 mz0Var = (mz0) this.f27757b;
                mz0Var.getClass();
                mz0Var.f30784i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mz0Var.f30779a.invalidate();
                return;
            case 27:
                d31 d31Var = (d31) this.f27757b;
                d31Var.getClass();
                d31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.invalidate();
                return;
            case 28:
                e41 e41Var = (e41) this.f27757b;
                e41Var.getClass();
                e41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var.o();
                return;
            default:
                a61 a61Var = (a61) this.f27757b;
                a61Var.getClass();
                a61Var.f26423q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61Var.invalidate();
                return;
        }
    }
}
