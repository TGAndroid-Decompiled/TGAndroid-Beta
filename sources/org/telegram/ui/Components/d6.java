package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class d6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32891a;
    public final Object f32892b;

    public d6(Object obj, int i7) {
        this.f32891a = i7;
        this.f32892b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32891a) {
            case 0:
                h6 h6Var = (h6) this.f32892b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.f34201q = floatValue;
                TimeInterpolator timeInterpolator = h6Var.f34207x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                h6Var.f34202r = floatValue;
                h6Var.invalidateSelf();
                Runnable runnable = h6Var.f34188b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                p6 p6Var = (p6) this.f32892b;
                p6Var.f36801a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                p6Var.invalidate();
                return;
            case 2:
                a8 a8Var = (a8) this.f32892b;
                a8Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                a8Var.F1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                s8 s8Var = (s8) this.f32892b;
                s8Var.getClass();
                s8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                x8 x8Var = (x8) this.f32892b;
                x8Var.getClass();
                x8Var.f40234e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.d();
                return;
            case 5:
                m9 m9Var = (m9) this.f32892b;
                m9Var.getClass();
                m9Var.f35897g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.invalidateSelf();
                return;
            case 6:
                ba baVar = (ba) this.f32892b;
                baVar.getClass();
                baVar.f32178f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.f32175b.invalidate();
                return;
            case 7:
                hc hcVar = (hc) this.f32892b;
                hcVar.getClass();
                hcVar.f34303j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hcVar.b();
                return;
            case 8:
                cg cgVar = (cg) this.f32892b;
                cgVar.getClass();
                cgVar.f32564d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci ciVar = ((ih) this.f32892b).f34630e;
                ch chVar = ciVar.f32657u3;
                chVar.setAlpha(1.0f - floatValue2);
                ciVar.B3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                ciVar.C3 = L;
                chVar.setTranslationY(L);
                return;
            case 10:
                ch chVar2 = (ch) this.f32892b;
                ci ciVar2 = chVar2.f32584b;
                ciVar2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ciVar2.f32676z2.invalidate();
                ciVar2.A2.invalidate();
                chVar2.invalidate();
                return;
            case 11:
                ((hk) this.f32892b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                xl xlVar = (xl) this.f32892b;
                xlVar.getClass();
                xlVar.f40336l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xlVar.O.f40617z.invalidate();
                return;
            case 13:
                bo boVar = (bo) this.f32892b;
                boVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.d = floatValue3;
                boVar.setShown(floatValue3);
                boVar.a(false);
                return;
            case 14:
                vo voVar = (vo) this.f32892b;
                voVar.getClass();
                voVar.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.C1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.Z1);
                return;
            case 15:
                bq bqVar = (bq) this.f32892b;
                bqVar.getClass();
                bqVar.f32330l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = bqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                qu quVar = (qu) this.f32892b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                quVar.D1 = floatValue4;
                quVar.f37399q1.setAlpha(floatValue4);
                quVar.f37403u1.setAlpha(quVar.D1);
                quVar.f37404v1.setAlpha(quVar.D1);
                quVar.f28672b.invalidate();
                return;
            case 17:
                ju juVar = (ju) this.f32892b;
                juVar.getClass();
                juVar.f35078e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (juVar.getParent() instanceof View) {
                    ((View) juVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                mu muVar = (mu) this.f32892b;
                muVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.f36101w = floatValue5;
                TextView textView = muVar.f36095c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - muVar.f36101w);
                textView.setAlpha(1.0f - muVar.f36101w);
                TextView textView2 = muVar.d;
                textView2.setScaleX(muVar.f36101w);
                textView2.setScaleY(muVar.f36101w);
                textView2.setAlpha(muVar.f36101w);
                return;
            case 19:
                wu wuVar = (wu) this.f32892b;
                wuVar.getClass();
                wuVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.d();
                return;
            case 20:
                yu yuVar = (yu) this.f32892b;
                yuVar.getClass();
                yuVar.f40731r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.invalidate();
                yuVar.requestLayout();
                yuVar.c();
                yuVar.f40732s.f39048b.invalidate();
                return;
            case 21:
                px pxVar = (px) this.f32892b;
                pxVar.getClass();
                pxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pxVar.invalidate();
                return;
            case 22:
                tx txVar = (tx) this.f32892b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                txVar.f38421x = floatValue6;
                View view2 = txVar.f38420w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                bi.x5 x5Var = txVar.f38419s;
                if (x5Var != null) {
                    x5Var.invalidate();
                    return;
                }
                return;
            case 23:
                ez ezVar = ((yy) this.f32892b).F;
                ezVar.F.invalidate();
                ezVar.invalidate();
                return;
            case 24:
                kz kzVar = (kz) this.f32892b;
                kzVar.getClass();
                kzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kzVar.invalidate();
                return;
            case 25:
                p10 p10Var = (p10) this.f32892b;
                m10 m10Var = p10Var.f36763a;
                if (!p10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    p10Var.f36768c0 = floatValue7;
                    p10Var.V.setPinnedProgress(floatValue7);
                    m10Var.setScaleX(1.0f - (p10Var.f36768c0 * 0.6f));
                    m10Var.setScaleY(1.0f - (p10Var.f36768c0 * 0.6f));
                    if (p10Var.X) {
                        p10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                o40 o40Var = (o40) this.f32892b;
                if (o40Var.f36505r0) {
                    Camera2Session camera2Session = o40Var.f36510v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = o40Var.f36507s0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                x50 x50Var = (x50) this.f32892b;
                x50Var.getClass();
                x50Var.f40185b2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50Var.f28672b.invalidate();
                return;
            default:
                x50 x50Var2 = ((w50) this.f32892b).f39888e;
                x50Var2.f40187e2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x50Var2.f28672b.invalidate();
                return;
        }
    }
}
