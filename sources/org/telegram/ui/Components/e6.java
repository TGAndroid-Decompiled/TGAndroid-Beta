package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33151a;
    public final Object f33152b;

    public e6(Object obj, int i7) {
        this.f33151a = i7;
        this.f33152b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33151a) {
            case 0:
                i6 i6Var = (i6) this.f33152b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.f34491q = floatValue;
                TimeInterpolator timeInterpolator = i6Var.f34497x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                i6Var.f34492r = floatValue;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34478b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                q6 q6Var = (q6) this.f33152b;
                q6Var.f37161a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                return;
            case 2:
                b8 b8Var = (b8) this.f33152b;
                b8Var.f32067z1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                b8Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                t8 t8Var = (t8) this.f33152b;
                t8Var.getClass();
                t8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                y8 y8Var = (y8) this.f33152b;
                y8Var.getClass();
                y8Var.f40567e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.d();
                return;
            case 5:
                n9 n9Var = (n9) this.f33152b;
                n9Var.getClass();
                n9Var.f36218g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.invalidateSelf();
                return;
            case 6:
                ca caVar = (ca) this.f33152b;
                caVar.getClass();
                caVar.f32487f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.f32484b.invalidate();
                return;
            case 7:
                ic icVar = (ic) this.f33152b;
                icVar.getClass();
                icVar.f34556j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                icVar.b();
                return;
            case 8:
                dg dgVar = (dg) this.f33152b;
                dgVar.getClass();
                dgVar.f32853d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = ((jh) this.f33152b).f34935e;
                dh dhVar = diVar.f32952r3;
                dhVar.setAlpha(1.0f - floatValue2);
                diVar.f32980y3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                diVar.f32984z3 = L;
                dhVar.setTranslationY(L);
                return;
            case 10:
                dh dhVar2 = (dh) this.f33152b;
                di diVar2 = dhVar2.f32871b;
                diVar2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                diVar2.f32971w2.invalidate();
                diVar2.f32975x2.invalidate();
                dhVar2.invalidate();
                return;
            case 11:
                ((ik) this.f33152b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                yl ylVar = (yl) this.f33152b;
                ylVar.getClass();
                ylVar.f40658l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ylVar.O.f41052z.invalidate();
                return;
            case 13:
                co coVar = (co) this.f33152b;
                coVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.d = floatValue3;
                coVar.setShown(floatValue3);
                coVar.a(false);
                return;
            case 14:
                vo voVar = (vo) this.f33152b;
                voVar.getClass();
                voVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.f39011z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 15:
                bq bqVar = (bq) this.f33152b;
                bqVar.getClass();
                bqVar.f32259l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = bqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                qu quVar = (qu) this.f33152b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                quVar.A1 = floatValue4;
                quVar.n1.setAlpha(floatValue4);
                quVar.f37402r1.setAlpha(quVar.A1);
                quVar.f37403s1.setAlpha(quVar.A1);
                quVar.f28615b.invalidate();
                return;
            case 17:
                ju juVar = (ju) this.f33152b;
                juVar.getClass();
                juVar.f35047e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (juVar.getParent() instanceof View) {
                    ((View) juVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                mu muVar = (mu) this.f33152b;
                muVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.f36081w = floatValue5;
                TextView textView = muVar.f36075c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - muVar.f36081w);
                textView.setAlpha(1.0f - muVar.f36081w);
                TextView textView2 = muVar.d;
                textView2.setScaleX(muVar.f36081w);
                textView2.setScaleY(muVar.f36081w);
                textView2.setAlpha(muVar.f36081w);
                return;
            case 19:
                wu wuVar = (wu) this.f33152b;
                wuVar.getClass();
                wuVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.d();
                return;
            case 20:
                yu yuVar = (yu) this.f33152b;
                yuVar.getClass();
                yuVar.f40714r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.invalidate();
                yuVar.requestLayout();
                yuVar.c();
                yuVar.f40715s.f38971b.invalidate();
                return;
            case 21:
                px pxVar = (px) this.f33152b;
                pxVar.getClass();
                pxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pxVar.invalidate();
                return;
            case 22:
                tx txVar = (tx) this.f33152b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                txVar.f38428x = floatValue6;
                View view2 = txVar.f38427w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                bi.x5 x5Var = txVar.f38426s;
                if (x5Var != null) {
                    x5Var.invalidate();
                    return;
                }
                return;
            case 23:
                ez ezVar = ((yy) this.f33152b).F;
                ezVar.F.invalidate();
                ezVar.invalidate();
                return;
            case 24:
                kz kzVar = (kz) this.f33152b;
                kzVar.getClass();
                kzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kzVar.invalidate();
                return;
            case 25:
                p10 p10Var = (p10) this.f33152b;
                n10 n10Var = p10Var.f36731a;
                if (!p10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    p10Var.f36736c0 = floatValue7;
                    p10Var.V.setPinnedProgress(floatValue7);
                    n10Var.setScaleX(1.0f - (p10Var.f36736c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (p10Var.f36736c0 * 0.6f));
                    if (p10Var.X) {
                        p10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                o40 o40Var = (o40) this.f33152b;
                if (o40Var.f36503r0) {
                    Camera2Session camera2Session = o40Var.f36508v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = o40Var.f36505s0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                x50 x50Var = (x50) this.f33152b;
                x50Var.getClass();
                x50Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50Var.f28615b.invalidate();
                return;
            default:
                x50 x50Var2 = ((w50) this.f33152b).f39867e;
                x50Var2.f40170b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x50Var2.f28615b.invalidate();
                return;
        }
    }
}
