package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class c6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33512a;
    public final Object f33513b;

    public c6(Object obj, int i7) {
        this.f33512a = i7;
        this.f33513b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33512a) {
            case 0:
                g6 g6Var = (g6) this.f33513b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.f34844q = floatValue;
                TimeInterpolator timeInterpolator = g6Var.f34850x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                g6Var.f34845r = floatValue;
                g6Var.invalidateSelf();
                Runnable runnable = g6Var.f34832c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                o6 o6Var = (o6) this.f33513b;
                o6Var.f37854a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                o6Var.invalidate();
                return;
            case 2:
                y7 y7Var = (y7) this.f33513b;
                y7Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                y7Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                q8 q8Var = (q8) this.f33513b;
                q8Var.getClass();
                q8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                v8 v8Var = (v8) this.f33513b;
                v8Var.getClass();
                v8Var.f40326e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.d();
                return;
            case 5:
                k9 k9Var = (k9) this.f33513b;
                k9Var.getClass();
                k9Var.f36338g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.invalidateSelf();
                return;
            case 6:
                y9 y9Var = (y9) this.f33513b;
                y9Var.getClass();
                y9Var.f41943f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.f41940b.invalidate();
                return;
            case 7:
                dc dcVar = (dc) this.f33513b;
                dcVar.getClass();
                dcVar.f33918j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dcVar.b();
                return;
            case 8:
                jg jgVar = (jg) this.f33513b;
                jgVar.getClass();
                jgVar.f35984g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = ((qh) this.f33513b).f38655e;
                kh khVar = kiVar.f36506v3;
                khVar.setAlpha(1.0f - floatValue2);
                kiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                kiVar.D3 = L;
                khVar.setTranslationY(L);
                return;
            case 10:
                kh khVar2 = (kh) this.f33513b;
                ki kiVar2 = khVar2.f36432b;
                kiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kiVar2.A2.invalidate();
                kiVar2.B2.invalidate();
                khVar2.invalidate();
                return;
            case 11:
                ((qk) this.f33513b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                fm fmVar = (fm) this.f33513b;
                fmVar.getClass();
                fmVar.f34633l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fmVar.O.f35025z.invalidate();
                return;
            case 13:
                mo moVar = (mo) this.f33513b;
                moVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                moVar.d = floatValue3;
                moVar.setShown(floatValue3);
                moVar.a(false);
                return;
            case 14:
                ep epVar = (ep) this.f33513b;
                epVar.getClass();
                epVar.f34388a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                epVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * epVar.f34388a2);
                return;
            case 15:
                jq jqVar = (jq) this.f33513b;
                jqVar.getClass();
                jqVar.f36148l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                wu wuVar = (wu) this.f33513b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.E1 = floatValue4;
                wuVar.f41450r1.setAlpha(floatValue4);
                wuVar.f41454v1.setAlpha(wuVar.E1);
                wuVar.f41455w1.setAlpha(wuVar.E1);
                wuVar.f29682b.invalidate();
                return;
            case 17:
                pu puVar = (pu) this.f33513b;
                puVar.getClass();
                puVar.f38412e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (puVar.getParent() instanceof View) {
                    ((View) puVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                su suVar = (su) this.f33513b;
                suVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suVar.f39434w = floatValue5;
                TextView textView = suVar.f39428c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - suVar.f39434w);
                textView.setAlpha(1.0f - suVar.f39434w);
                TextView textView2 = suVar.d;
                textView2.setScaleX(suVar.f39434w);
                textView2.setScaleY(suVar.f39434w);
                textView2.setAlpha(suVar.f39434w);
                return;
            case 19:
                cv cvVar = (cv) this.f33513b;
                cvVar.getClass();
                cvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cvVar.d();
                return;
            case 20:
                ev evVar = (ev) this.f33513b;
                evVar.getClass();
                evVar.f34440r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                evVar.invalidate();
                evVar.requestLayout();
                evVar.c();
                evVar.f34441s.f33010b.invalidate();
                return;
            case 21:
                ux uxVar = (ux) this.f33513b;
                uxVar.getClass();
                uxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uxVar.invalidate();
                return;
            case 22:
                yx yxVar = (yx) this.f33513b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yxVar.f42182x = floatValue6;
                View view2 = yxVar.f42181w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                ai.j0 j0Var = yxVar.f42180s;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
            case 23:
                iz izVar = ((cz) this.f33513b).F;
                izVar.G.invalidate();
                izVar.invalidate();
                return;
            case 24:
                oz ozVar = (oz) this.f33513b;
                ozVar.getClass();
                ozVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ozVar.invalidate();
                return;
            case 25:
                s10 s10Var = (s10) this.f33513b;
                q10 q10Var = s10Var.f39144a;
                if (!s10Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    s10Var.f39150d0 = floatValue7;
                    s10Var.W.setPinnedProgress(floatValue7);
                    q10Var.setScaleX(1.0f - (s10Var.f39150d0 * 0.6f));
                    q10Var.setScaleY(1.0f - (s10Var.f39150d0 * 0.6f));
                    if (s10Var.Y) {
                        s10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                r40 r40Var = (r40) this.f33513b;
                if (r40Var.f38871s0) {
                    Camera2Session camera2Session = r40Var.f38876w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = r40Var.f38872t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                a60 a60Var = (a60) this.f33513b;
                a60Var.getClass();
                a60Var.f32869c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a60Var.f29682b.invalidate();
                return;
            default:
                a60 a60Var2 = ((z50) this.f33513b).f42252e;
                a60Var2.f32871f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a60Var2.f29682b.invalidate();
                return;
        }
    }
}
