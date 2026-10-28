package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28045a;
    public final Object f28046b;

    public f80(Object obj, int i10) {
        this.f28045a = i10;
        this.f28046b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f28045a) {
            case 0:
                l80 l80Var = (l80) this.f28046b;
                l80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j80 j80Var = l80Var.f30172x;
                if (j80Var != null) {
                    j80Var.setProgress(floatValue);
                    return;
                }
                return;
            case 1:
                ((j80) this.f28046b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                h90 h90Var = (h90) this.f28046b;
                h90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h90Var.f28921s = floatValue2;
                h90Var.d(floatValue2);
                return;
            case 3:
                me0 me0Var = ((ge0) this.f28046b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me0Var.f30514a0 = floatValue3;
                me0Var.h(floatValue3);
                return;
            case 4:
                ((dh0) this.f28046b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ii0 ii0Var = (ii0) this.f28046b;
                ii0Var.H.E = AndroidUtilities.lerp(ii0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 6:
                qk0 qk0Var = (qk0) this.f28046b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.e.setAlpha(floatValue4);
                qk0Var.h.setAlpha(1.0f - floatValue4);
                return;
            case 7:
                gl0 gl0Var = (gl0) this.f28046b;
                gl0Var.B0 = ((Float) gl0Var.f28650y0.getAnimatedValue()).floatValue();
                bh.p pVar = gl0Var.S;
                if (pVar != null) {
                    pVar.invalidate();
                }
                gl0Var.invalidate();
                return;
            case 8:
                fs fsVar = (fs) this.f28046b;
                fsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.setScaleX(floatValue5);
                fsVar.setScaleY(floatValue5);
                ((gl0) fsVar.f28286c).S.invalidate();
                return;
            case 9:
                ((q0.a) this.f28046b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 10:
                el0 el0Var = (el0) this.f28046b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.I = floatValue6;
                dl0 dl0Var = el0Var.f27877b;
                float f10 = 1.0f;
                if (el0Var.f27883w) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                dl0Var.setScaleY(floatValue6 * f7);
                float f11 = el0Var.I;
                if (el0Var.f27883w) {
                    f10 = 0.76f;
                }
                dl0Var.setScaleX(f11 * f10);
                return;
            case 11:
                vm0 vm0Var = (vm0) this.f28046b;
                vm0Var.getClass();
                vm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.invalidateSelf();
                return;
            case 12:
                in0 in0Var = (in0) this.f28046b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in0Var.f29394r = floatValue7;
                in0Var.f29398y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                in0Var.f29398y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, in0Var.f29394r));
                in0Var.f29398y.setAlpha(in0Var.f29394r);
                in0Var.f29395s.invalidate();
                in0Var.v.invalidate();
                return;
            case 13:
                qn0 qn0Var = (qn0) this.f28046b;
                qn0Var.getClass();
                qn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn0Var.j();
                return;
            case 14:
                ((qn0) ((mn0) this.f28046b).f30564b).invalidate();
                return;
            case 15:
                un0 un0Var = (un0) this.f28046b;
                un0Var.getClass();
                un0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                po0 po0Var = (po0) this.f28046b;
                po0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                po0Var.F = floatValue8;
                po0Var.setShown(floatValue8);
                po0Var.b(false);
                return;
            case 17:
                dq0 dq0Var = (dq0) this.f28046b;
                dq0Var.getClass();
                dq0Var.f27526n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dq0Var.invalidate();
                return;
            case 18:
                rq0 rq0Var = (rq0) this.f28046b;
                nr0 nr0Var = rq0Var.f32324b;
                nr0Var.f31056v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nr0Var.f31033c.invalidate();
                rq0Var.invalidate();
                return;
            case 19:
                ((ju) this.f28046b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                bw0 bw0Var = (bw0) this.f28046b;
                bw0Var.T0(bw0Var.getTabProgress());
                return;
            case 21:
                ((uu0) this.f28046b).h.invalidate();
                return;
            case 22:
                nw0 nw0Var = (nw0) this.f28046b;
                nw0Var.getClass();
                nw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nw0Var.invalidate();
                return;
            case 23:
                cy0.C1((cy0) this.f28046b, valueAnimator);
                return;
            case 24:
                fy0 fy0Var = (fy0) this.f28046b;
                fy0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.a();
                return;
            case 25:
                kz0 kz0Var = (kz0) this.f28046b;
                kz0Var.getClass();
                kz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kz0Var.invalidate();
                return;
            case 26:
                nz0 nz0Var = (nz0) this.f28046b;
                nz0Var.getClass();
                nz0Var.f31111i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz0Var.f31106a.invalidate();
                return;
            case 27:
                e31 e31Var = (e31) this.f28046b;
                e31Var.getClass();
                e31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.invalidate();
                return;
            case 28:
                f41 f41Var = (f41) this.f28046b;
                f41Var.getClass();
                f41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.o();
                return;
            default:
                b61 b61Var = (b61) this.f28046b;
                b61Var.getClass();
                b61Var.f26748q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                return;
        }
    }
}
