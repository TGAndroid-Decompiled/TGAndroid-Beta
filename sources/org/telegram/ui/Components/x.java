package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f41931a;
    public final Object f41932b;

    public x(Object obj, int i7) {
        this.f41931a = i7;
        this.f41932b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41931a) {
            case 0:
                z zVar = (z) this.f41932b;
                zVar.getClass();
                zVar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.requestLayout();
                return;
            case 1:
                n6 n6Var = (n6) this.f41932b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f37810q = floatValue;
                TimeInterpolator timeInterpolator = n6Var.f37816x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                n6Var.f37811r = floatValue;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.f37798c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                v6 v6Var = (v6) this.f41932b;
                v6Var.f40692a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                return;
            case 3:
                f8 f8Var = (f8) this.f41932b;
                f8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                f8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                y8 y8Var = (y8) this.f41932b;
                y8Var.getClass();
                y8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                d9 d9Var = (d9) this.f41932b;
                d9Var.getClass();
                d9Var.f34427e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.d();
                return;
            case 6:
                s9 s9Var = (s9) this.f41932b;
                s9Var.getClass();
                s9Var.f39528g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9Var.invalidateSelf();
                return;
            case 7:
                ga gaVar = (ga) this.f41932b;
                gaVar.getClass();
                gaVar.f35491f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.f35488b.invalidate();
                return;
            case 8:
                mc mcVar = (mc) this.f41932b;
                mcVar.getClass();
                mcVar.f37478j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mcVar.b();
                return;
            case 9:
                ug ugVar = (ug) this.f41932b;
                ugVar.getClass();
                ugVar.f40337g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 10:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui uiVar = ((ai) this.f41932b).f33532e;
                uh uhVar = uiVar.f40437v3;
                uhVar.setAlpha(1.0f - floatValue2);
                uiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                uiVar.D3 = L;
                uhVar.setTranslationY(L);
                return;
            case 11:
                uh uhVar2 = (uh) this.f41932b;
                ui uiVar2 = uhVar2.f40361b;
                uiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uiVar2.A2.invalidate();
                uiVar2.B2.invalidate();
                uhVar2.invalidate();
                return;
            case 12:
                ((zk) this.f41932b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                om omVar = (om) this.f41932b;
                omVar.getClass();
                omVar.f38294l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.f38636z.invalidate();
                return;
            case 14:
                vo voVar = (vo) this.f41932b;
                voVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue3;
                voVar.setShown(floatValue3);
                voVar.a(false);
                return;
            case 15:
                np npVar = (np) this.f41932b;
                npVar.getClass();
                npVar.f37921a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * npVar.f37921a2);
                return;
            case 16:
                sq sqVar = (sq) this.f41932b;
                sqVar.getClass();
                sqVar.f39660l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = sqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                ev evVar = (ev) this.f41932b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                evVar.E1 = floatValue4;
                evVar.f34994r1.setAlpha(floatValue4);
                evVar.f34998v1.setAlpha(evVar.E1);
                evVar.f34999w1.setAlpha(evVar.E1);
                evVar.f30176b.invalidate();
                return;
            case 18:
                xu xuVar = (xu) this.f41932b;
                xuVar.getClass();
                xuVar.f42221e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (xuVar.getParent() instanceof View) {
                    ((View) xuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                av avVar = (av) this.f41932b;
                avVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.f33647w = floatValue5;
                TextView textView = avVar.f33641c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - avVar.f33647w);
                textView.setAlpha(1.0f - avVar.f33647w);
                TextView textView2 = avVar.d;
                textView2.setScaleX(avVar.f33647w);
                textView2.setScaleY(avVar.f33647w);
                textView2.setAlpha(avVar.f33647w);
                return;
            case 20:
                kv kvVar = (kv) this.f41932b;
                kvVar.getClass();
                kvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kvVar.d();
                return;
            case 21:
                mv mvVar = (mv) this.f41932b;
                mvVar.getClass();
                mvVar.f37646r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.invalidate();
                mvVar.requestLayout();
                mvVar.c();
                mvVar.f37647s.f36928b.invalidate();
                return;
            case 22:
                cy cyVar = (cy) this.f41932b;
                cyVar.getClass();
                cyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cyVar.invalidate();
                return;
            case 23:
                gy gyVar = (gy) this.f41932b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gyVar.f35721x = floatValue6;
                View view2 = gyVar.f35720w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                ai.l0 l0Var = gyVar.f35719s;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
            case 24:
                rz.a((rz) this.f41932b, valueAnimator);
                return;
            case 25:
                rz rzVar = ((kz) this.f41932b).F;
                rzVar.G.invalidate();
                rzVar.invalidate();
                return;
            case 26:
                xz xzVar = (xz) this.f41932b;
                xzVar.getClass();
                xzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xzVar.invalidate();
                return;
            case 27:
                c20 c20Var = (c20) this.f41932b;
                a20 a20Var = c20Var.f33983a;
                if (!c20Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c20Var.f33989d0 = floatValue7;
                    c20Var.W.setPinnedProgress(floatValue7);
                    a20Var.setScaleX(1.0f - (c20Var.f33989d0 * 0.6f));
                    a20Var.setScaleY(1.0f - (c20Var.f33989d0 * 0.6f));
                    if (c20Var.Y) {
                        c20Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                c50 c50Var = (c50) this.f41932b;
                if (c50Var.f34048s0) {
                    Camera2Session camera2Session = c50Var.f34053w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = c50Var.f34049t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            default:
                l60 l60Var = (l60) this.f41932b;
                l60Var.getClass();
                l60Var.f37121c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60Var.f30176b.invalidate();
                return;
        }
    }
}
