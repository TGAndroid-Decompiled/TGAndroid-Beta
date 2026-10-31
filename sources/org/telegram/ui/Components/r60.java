package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29842a;
    public final Object f29843b;

    public r60(Object obj, int i10) {
        this.f29842a = i10;
        this.f29843b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f29842a) {
            case 0:
                ((x60) this.f29843b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                y70 y70Var = (y70) this.f29843b;
                y70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70Var.f32654s = floatValue;
                y70Var.d(floatValue);
                return;
            case 2:
                zc0 zc0Var = ((sc0) this.f29843b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0Var.f33007a0 = floatValue2;
                zc0Var.h(floatValue2);
                return;
            case 3:
                ((jf0) this.f29843b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                pg0 pg0Var = (pg0) this.f29843b;
                pg0Var.H.E = org.telegram.messenger.i0.T1(pg0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 5:
                vi0 vi0Var = (vi0) this.f29843b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.e.setAlpha(floatValue3);
                vi0Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 6:
                mj0 mj0Var = (mj0) this.f29843b;
                mj0Var.B0 = ((Float) mj0Var.f28541y0.getAnimatedValue()).floatValue();
                fg.i iVar = mj0Var.S;
                if (iVar != null) {
                    iVar.invalidate();
                }
                mj0Var.invalidate();
                return;
            case 7:
                ir irVar = (ir) this.f29843b;
                irVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                irVar.setScaleX(floatValue4);
                irVar.setScaleY(floatValue4);
                ((mj0) irVar.f27068c).S.invalidate();
                return;
            case 8:
                ((q0.a) this.f29843b).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 9:
                kj0 kj0Var = (kj0) this.f29843b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kj0Var.I = floatValue5;
                jj0 jj0Var = kj0Var.f27772b;
                float f10 = 1.0f;
                if (kj0Var.f27779x) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                jj0Var.setScaleY(floatValue5 * f7);
                float f11 = kj0Var.I;
                if (kj0Var.f27779x) {
                    f10 = 0.76f;
                }
                jj0Var.setScaleX(f11 * f10);
                return;
            case 10:
                bl0 bl0Var = (bl0) this.f29843b;
                bl0Var.getClass();
                bl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl0Var.invalidateSelf();
                return;
            case 11:
                nl0 nl0Var = (nl0) this.f29843b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nl0Var.f28822r = floatValue6;
                nl0Var.D.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue6));
                nl0Var.D.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, nl0Var.f28822r));
                nl0Var.D.setAlpha(nl0Var.f28822r);
                nl0Var.f28823s.invalidate();
                nl0Var.f28824w.invalidate();
                return;
            case 12:
                ul0 ul0Var = (ul0) this.f29843b;
                ul0Var.getClass();
                ul0Var.f30989w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ul0Var.j();
                return;
            case 13:
                ((ul0) ((rl0) this.f29843b).f29952b).invalidate();
                return;
            case 14:
                yl0 yl0Var = (yl0) this.f29843b;
                yl0Var.getClass();
                yl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                rm0 rm0Var = (rm0) this.f29843b;
                rm0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm0Var.F = floatValue7;
                rm0Var.setShown(floatValue7);
                rm0Var.b(false);
                return;
            case 16:
                do0 do0Var = (do0) this.f29843b;
                do0Var.getClass();
                do0Var.f25477n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                do0Var.invalidate();
                return;
            case 17:
                so0 so0Var = (so0) this.f29843b;
                op0 op0Var = so0Var.f30306b;
                op0Var.f29128m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                op0Var.f29122j1.invalidate();
                so0Var.invalidate();
                return;
            case 18:
                ((mt) this.f29843b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                zt0 zt0Var = (zt0) this.f29843b;
                zt0Var.U0(zt0Var.getTabProgress());
                return;
            case 20:
                ((ss0) this.f29843b).h.invalidate();
                return;
            case 21:
                lu0 lu0Var = (lu0) this.f29843b;
                lu0Var.getClass();
                lu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lu0Var.invalidate();
                return;
            case 22:
                bw0.z1((bw0) this.f29843b, valueAnimator);
                return;
            case 23:
                dw0 dw0Var = (dw0) this.f29843b;
                dw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dw0Var.a();
                return;
            case 24:
                jx0 jx0Var = (jx0) this.f29843b;
                jx0Var.getClass();
                jx0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.invalidate();
                return;
            case 25:
                mx0 mx0Var = (mx0) this.f29843b;
                mx0Var.getClass();
                mx0Var.f28632i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var.f28627a.invalidate();
                return;
            case 26:
                e11 e11Var = (e11) this.f29843b;
                e11Var.getClass();
                e11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e11Var.invalidate();
                return;
            case 27:
                t11 t11Var = (t11) this.f29843b;
                t11Var.getClass();
                t11Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                o21 o21Var = (o21) this.f29843b;
                o21Var.getClass();
                o21Var.f28942a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o21Var.p();
                return;
            default:
                g41 g41Var = (g41) this.f29843b;
                g41Var.getClass();
                g41Var.f26255k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g41Var.invalidate();
                return;
        }
    }
}
