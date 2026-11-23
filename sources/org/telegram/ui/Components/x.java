package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f41888a;
    public final Object f41889b;

    public x(Object obj, int i7) {
        this.f41888a = i7;
        this.f41889b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41888a) {
            case 0:
                z zVar = (z) this.f41889b;
                zVar.getClass();
                zVar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.requestLayout();
                return;
            case 1:
                n6 n6Var = (n6) this.f41889b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f37766q = floatValue;
                TimeInterpolator timeInterpolator = n6Var.f37772x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                n6Var.f37767r = floatValue;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.f37754c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                v6 v6Var = (v6) this.f41889b;
                v6Var.f40644a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                return;
            case 3:
                f8 f8Var = (f8) this.f41889b;
                f8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                f8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                y8 y8Var = (y8) this.f41889b;
                y8Var.getClass();
                y8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                d9 d9Var = (d9) this.f41889b;
                d9Var.getClass();
                d9Var.f34390e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.d();
                return;
            case 6:
                s9 s9Var = (s9) this.f41889b;
                s9Var.getClass();
                s9Var.f39484g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9Var.invalidateSelf();
                return;
            case 7:
                ga gaVar = (ga) this.f41889b;
                gaVar.getClass();
                gaVar.f35453f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.f35450b.invalidate();
                return;
            case 8:
                mc mcVar = (mc) this.f41889b;
                mcVar.getClass();
                mcVar.f37438j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mcVar.b();
                return;
            case 9:
                ug ugVar = (ug) this.f41889b;
                ugVar.getClass();
                ugVar.f40322g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 10:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui uiVar = ((ai) this.f41889b).f33493e;
                uh uhVar = uiVar.f40422v3;
                uhVar.setAlpha(1.0f - floatValue2);
                uiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                uiVar.D3 = L;
                uhVar.setTranslationY(L);
                return;
            case 11:
                uh uhVar2 = (uh) this.f41889b;
                ui uiVar2 = uhVar2.f40346b;
                uiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uiVar2.A2.invalidate();
                uiVar2.B2.invalidate();
                uhVar2.invalidate();
                return;
            case 12:
                ((zk) this.f41889b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                om omVar = (om) this.f41889b;
                omVar.getClass();
                omVar.f38263l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.f38593z.invalidate();
                return;
            case 14:
                vo voVar = (vo) this.f41889b;
                voVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue3;
                voVar.setShown(floatValue3);
                voVar.a(false);
                return;
            case 15:
                np npVar = (np) this.f41889b;
                npVar.getClass();
                npVar.f37878a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * npVar.f37878a2);
                return;
            case 16:
                sq sqVar = (sq) this.f41889b;
                sqVar.getClass();
                sqVar.f39616l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = sqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                dv dvVar = (dv) this.f41889b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dvVar.E1 = floatValue4;
                dvVar.f34573r1.setAlpha(floatValue4);
                dvVar.f34577v1.setAlpha(dvVar.E1);
                dvVar.f34578w1.setAlpha(dvVar.E1);
                dvVar.f30142b.invalidate();
                return;
            case 18:
                wu wuVar = (wu) this.f41889b;
                wuVar.getClass();
                wuVar.f41859e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (wuVar.getParent() instanceof View) {
                    ((View) wuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                zu zuVar = (zu) this.f41889b;
                zuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.f42957w = floatValue5;
                TextView textView = zuVar.f42951c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - zuVar.f42957w);
                textView.setAlpha(1.0f - zuVar.f42957w);
                TextView textView2 = zuVar.d;
                textView2.setScaleX(zuVar.f42957w);
                textView2.setScaleY(zuVar.f42957w);
                textView2.setAlpha(zuVar.f42957w);
                return;
            case 20:
                jv jvVar = (jv) this.f41889b;
                jvVar.getClass();
                jvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.d();
                return;
            case 21:
                lv lvVar = (lv) this.f41889b;
                lvVar.getClass();
                lvVar.f37249r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvVar.invalidate();
                lvVar.requestLayout();
                lvVar.c();
                lvVar.f37250s.f36895b.invalidate();
                return;
            case 22:
                cy cyVar = (cy) this.f41889b;
                cyVar.getClass();
                cyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cyVar.invalidate();
                return;
            case 23:
                gy gyVar = (gy) this.f41889b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gyVar.f35674x = floatValue6;
                View view2 = gyVar.f35673w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                ai.g0 g0Var = gyVar.f35672s;
                if (g0Var != null) {
                    g0Var.invalidate();
                    return;
                }
                return;
            case 24:
                rz.a((rz) this.f41889b, valueAnimator);
                return;
            case 25:
                rz rzVar = ((kz) this.f41889b).F;
                rzVar.G.invalidate();
                rzVar.invalidate();
                return;
            case 26:
                xz xzVar = (xz) this.f41889b;
                xzVar.getClass();
                xzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xzVar.invalidate();
                return;
            case 27:
                c20 c20Var = (c20) this.f41889b;
                a20 a20Var = c20Var.f33947a;
                if (!c20Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c20Var.f33953d0 = floatValue7;
                    c20Var.W.setPinnedProgress(floatValue7);
                    a20Var.setScaleX(1.0f - (c20Var.f33953d0 * 0.6f));
                    a20Var.setScaleY(1.0f - (c20Var.f33953d0 * 0.6f));
                    if (c20Var.Y) {
                        c20Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                c50 c50Var = (c50) this.f41889b;
                if (c50Var.f34012s0) {
                    Camera2Session camera2Session = c50Var.f34017w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = c50Var.f34013t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            default:
                l60 l60Var = (l60) this.f41889b;
                l60Var.getClass();
                l60Var.f37078c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60Var.f30142b.invalidate();
                return;
        }
    }
}
