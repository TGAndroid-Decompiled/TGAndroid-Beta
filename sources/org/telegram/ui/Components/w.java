package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f41461a;
    public final Object f41462b;

    public w(Object obj, int i7) {
        this.f41461a = i7;
        this.f41462b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41461a) {
            case 0:
                y yVar = (y) this.f41462b;
                yVar.getClass();
                yVar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.requestLayout();
                return;
            case 1:
                m6 m6Var = (m6) this.f41462b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.f37409q = floatValue;
                TimeInterpolator timeInterpolator = m6Var.f37415x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                m6Var.f37410r = floatValue;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.f37397c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                u6 u6Var = (u6) this.f41462b;
                u6Var.f40284a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u6Var.invalidate();
                return;
            case 3:
                e8 e8Var = (e8) this.f41462b;
                e8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                e8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                x8 x8Var = (x8) this.f41462b;
                x8Var.getClass();
                x8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                c9 c9Var = (c9) this.f41462b;
                c9Var.getClass();
                c9Var.f33952e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.d();
                return;
            case 6:
                r9 r9Var = (r9) this.f41462b;
                r9Var.getClass();
                r9Var.f39239g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                return;
            case 7:
                fa faVar = (fa) this.f41462b;
                faVar.getClass();
                faVar.f35068f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.f35065b.invalidate();
                return;
            case 8:
                lc lcVar = (lc) this.f41462b;
                lcVar.getClass();
                lcVar.f37110j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.b();
                return;
            case 9:
                tg tgVar = (tg) this.f41462b;
                tgVar.getClass();
                tgVar.f39926g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 10:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = ((zh) this.f41462b).f42862e;
                th thVar = tiVar.f40026v3;
                thVar.setAlpha(1.0f - floatValue2);
                tiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                tiVar.D3 = L;
                thVar.setTranslationY(L);
                return;
            case 11:
                th thVar2 = (th) this.f41462b;
                ti tiVar2 = thVar2.f39950b;
                tiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.A2.invalidate();
                tiVar2.B2.invalidate();
                thVar2.invalidate();
                return;
            case 12:
                ((xk) this.f41462b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                mm mmVar = (mm) this.f41462b;
                mmVar.getClass();
                mmVar.f37488l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.O.f37872z.invalidate();
                return;
            case 14:
                so soVar = (so) this.f41462b;
                soVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.d = floatValue3;
                soVar.setShown(floatValue3);
                soVar.a(false);
                return;
            case 15:
                kp kpVar = (kp) this.f41462b;
                kpVar.getClass();
                kpVar.f36825a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * kpVar.f36825a2);
                return;
            case 16:
                pq pqVar = (pq) this.f41462b;
                pqVar.getClass();
                pqVar.f38550l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                bv bvVar = (bv) this.f41462b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bvVar.E1 = floatValue4;
                bvVar.f33820r1.setAlpha(floatValue4);
                bvVar.f33824v1.setAlpha(bvVar.E1);
                bvVar.f33825w1.setAlpha(bvVar.E1);
                bvVar.f30226b.invalidate();
                return;
            case 18:
                uu uuVar = (uu) this.f41462b;
                uuVar.getClass();
                uuVar.f40472e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uuVar.getParent() instanceof View) {
                    ((View) uuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                xu xuVar = (xu) this.f41462b;
                xuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.f42200w = floatValue5;
                TextView textView = xuVar.f42194c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - xuVar.f42200w);
                textView.setAlpha(1.0f - xuVar.f42200w);
                TextView textView2 = xuVar.d;
                textView2.setScaleX(xuVar.f42200w);
                textView2.setScaleY(xuVar.f42200w);
                textView2.setAlpha(xuVar.f42200w);
                return;
            case 20:
                hv hvVar = (hv) this.f41462b;
                hvVar.getClass();
                hvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hvVar.d();
                return;
            case 21:
                jv jvVar = (jv) this.f41462b;
                jvVar.getClass();
                jvVar.f36522r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.invalidate();
                jvVar.requestLayout();
                jvVar.c();
                jvVar.f36523s.f36804b.invalidate();
                return;
            case 22:
                yx yxVar = (yx) this.f41462b;
                yxVar.getClass();
                yxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yxVar.invalidate();
                return;
            case 23:
                dy dyVar = (dy) this.f41462b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dyVar.f34489x = floatValue6;
                View view2 = dyVar.f34488w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                ai.h0 h0Var = dyVar.f34487s;
                if (h0Var != null) {
                    h0Var.invalidate();
                    return;
                }
                return;
            case 24:
                oz.a((oz) this.f41462b, valueAnimator);
                return;
            case 25:
                oz ozVar = ((hz) this.f41462b).F;
                ozVar.G.invalidate();
                ozVar.invalidate();
                return;
            case 26:
                uz uzVar = (uz) this.f41462b;
                uzVar.getClass();
                uzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uzVar.invalidate();
                return;
            case 27:
                a20 a20Var = (a20) this.f41462b;
                y10 y10Var = a20Var.f33325a;
                if (!a20Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a20Var.f33331d0 = floatValue7;
                    a20Var.W.setPinnedProgress(floatValue7);
                    y10Var.setScaleX(1.0f - (a20Var.f33331d0 * 0.6f));
                    y10Var.setScaleY(1.0f - (a20Var.f33331d0 * 0.6f));
                    if (a20Var.Y) {
                        a20Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                z40 z40Var = (z40) this.f41462b;
                if (z40Var.f42690s0) {
                    Camera2Session camera2Session = z40Var.f42695w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = z40Var.f42691t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            default:
                i60 i60Var = (i60) this.f41462b;
                i60Var.getClass();
                i60Var.f35939c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.f30226b.invalidate();
                return;
        }
    }
}
