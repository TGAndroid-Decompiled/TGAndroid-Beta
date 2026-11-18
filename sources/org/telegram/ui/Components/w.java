package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f41510a;
    public final Object f41511b;

    public w(Object obj, int i7) {
        this.f41510a = i7;
        this.f41511b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41510a) {
            case 0:
                y yVar = (y) this.f41511b;
                yVar.getClass();
                yVar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.requestLayout();
                return;
            case 1:
                m6 m6Var = (m6) this.f41511b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.f37392q = floatValue;
                TimeInterpolator timeInterpolator = m6Var.f37398x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                m6Var.f37393r = floatValue;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.f37380c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                u6 u6Var = (u6) this.f41511b;
                u6Var.f40217a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u6Var.invalidate();
                return;
            case 3:
                g8 g8Var = (g8) this.f41511b;
                g8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                g8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                y8 y8Var = (y8) this.f41511b;
                y8Var.getClass();
                y8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                d9 d9Var = (d9) this.f41511b;
                d9Var.getClass();
                d9Var.f34306e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.d();
                return;
            case 6:
                s9 s9Var = (s9) this.f41511b;
                s9Var.getClass();
                s9Var.f39527g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9Var.invalidateSelf();
                return;
            case 7:
                ga gaVar = (ga) this.f41511b;
                gaVar.getClass();
                gaVar.f35436f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.f35433b.invalidate();
                return;
            case 8:
                mc mcVar = (mc) this.f41511b;
                mcVar.getClass();
                mcVar.f37435j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mcVar.b();
                return;
            case 9:
                sg sgVar = (sg) this.f41511b;
                sgVar.getClass();
                sgVar.f39629g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 10:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si siVar = ((yh) this.f41511b).f42500e;
                sh shVar = siVar.f39729v3;
                shVar.setAlpha(1.0f - floatValue2);
                siVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                siVar.D3 = L;
                shVar.setTranslationY(L);
                return;
            case 11:
                sh shVar2 = (sh) this.f41511b;
                si siVar2 = shVar2.f39653b;
                siVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                siVar2.A2.invalidate();
                siVar2.B2.invalidate();
                shVar2.invalidate();
                return;
            case 12:
                ((xk) this.f41511b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                mm mmVar = (mm) this.f41511b;
                mmVar.getClass();
                mmVar.f37570l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.O.f37828z.invalidate();
                return;
            case 14:
                to toVar = (to) this.f41511b;
                toVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue3;
                toVar.setShown(floatValue3);
                toVar.a(false);
                return;
            case 15:
                lp lpVar = (lp) this.f41511b;
                lpVar.getClass();
                lpVar.f37169a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * lpVar.f37169a2);
                return;
            case 16:
                qq qqVar = (qq) this.f41511b;
                qqVar.getClass();
                qqVar.f38872l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                bv bvVar = (bv) this.f41511b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bvVar.E1 = floatValue4;
                bvVar.f33788r1.setAlpha(floatValue4);
                bvVar.f33792v1.setAlpha(bvVar.E1);
                bvVar.f33793w1.setAlpha(bvVar.E1);
                bvVar.f30190b.invalidate();
                return;
            case 18:
                uu uuVar = (uu) this.f41511b;
                uuVar.getClass();
                uuVar.f40420e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uuVar.getParent() instanceof View) {
                    ((View) uuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                xu xuVar = (xu) this.f41511b;
                xuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.f42192w = floatValue5;
                TextView textView = xuVar.f42186c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - xuVar.f42192w);
                textView.setAlpha(1.0f - xuVar.f42192w);
                TextView textView2 = xuVar.d;
                textView2.setScaleX(xuVar.f42192w);
                textView2.setScaleY(xuVar.f42192w);
                textView2.setAlpha(xuVar.f42192w);
                return;
            case 20:
                hv hvVar = (hv) this.f41511b;
                hvVar.getClass();
                hvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hvVar.d();
                return;
            case 21:
                jv jvVar = (jv) this.f41511b;
                jvVar.getClass();
                jvVar.f36538r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.invalidate();
                jvVar.requestLayout();
                jvVar.c();
                jvVar.f36539s.f36144b.invalidate();
                return;
            case 22:
                zx zxVar = (zx) this.f41511b;
                zxVar.getClass();
                zxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zxVar.invalidate();
                return;
            case 23:
                ey eyVar = (ey) this.f41511b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eyVar.f34844x = floatValue6;
                View view2 = eyVar.f34843w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                ai.k0 k0Var = eyVar.f34842s;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
            case 24:
                pz.a((pz) this.f41511b, valueAnimator);
                return;
            case 25:
                pz pzVar = ((iz) this.f41511b).F;
                pzVar.G.invalidate();
                pzVar.invalidate();
                return;
            case 26:
                vz vzVar = (vz) this.f41511b;
                vzVar.getClass();
                vzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar.invalidate();
                return;
            case 27:
                z10 z10Var = (z10) this.f41511b;
                x10 x10Var = z10Var.f42712a;
                if (!z10Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z10Var.f42718d0 = floatValue7;
                    z10Var.W.setPinnedProgress(floatValue7);
                    x10Var.setScaleX(1.0f - (z10Var.f42718d0 * 0.6f));
                    x10Var.setScaleY(1.0f - (z10Var.f42718d0 * 0.6f));
                    if (z10Var.Y) {
                        z10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                z40 z40Var = (z40) this.f41511b;
                if (z40Var.f42795s0) {
                    Camera2Session camera2Session = z40Var.f42800w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = z40Var.f42796t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            default:
                j60 j60Var = (j60) this.f41511b;
                j60Var.getClass();
                j60Var.f36354c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60Var.f30190b.invalidate();
                return;
        }
    }
}
