package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class a6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24306a;
    public final Object f24307b;

    public a6(Object obj, int i10) {
        this.f24306a = i10;
        this.f24307b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24306a) {
            case 0:
                e6 e6Var = (e6) this.f24307b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.f25708q = floatValue;
                TimeInterpolator timeInterpolator = e6Var.f25714x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                e6Var.f25709r = floatValue;
                e6Var.invalidateSelf();
                Runnable runnable = e6Var.f25696b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                m6 m6Var = (m6) this.f24307b;
                m6Var.f28294a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m6Var.invalidate();
                return;
            case 2:
                w7 w7Var = (w7) this.f24307b;
                w7Var.f32084z1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                w7Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                o8 o8Var = (o8) this.f24307b;
                o8Var.getClass();
                o8Var.n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                t8 t8Var = (t8) this.f24307b;
                t8Var.getClass();
                t8Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.d();
                return;
            case 5:
                i9 i9Var = (i9) this.f24307b;
                i9Var.getClass();
                i9Var.f26918g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.invalidateSelf();
                return;
            case 6:
                w9 w9Var = (w9) this.f24307b;
                w9Var.getClass();
                w9Var.f32111f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.f32109b.invalidate();
                return;
            case 7:
                dc dcVar = (dc) this.f24307b;
                dcVar.getClass();
                dcVar.f25391j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dcVar.b();
                return;
            case 8:
                zf zfVar = (zf) this.f24307b;
                zfVar.getClass();
                zfVar.f33035d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = ((gh) this.f24307b).e;
                ah ahVar = biVar.f24718r3;
                ahVar.setAlpha(1.0f - floatValue2);
                biVar.y3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.i0.L(36.0f);
                biVar.f24749z3 = L;
                ahVar.setTranslationY(L);
                return;
            case 10:
                ah ahVar2 = (ah) this.f24307b;
                bi biVar2 = ahVar2.f24414b;
                biVar2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                biVar2.f24737w2.invalidate();
                biVar2.f24741x2.invalidate();
                ahVar2.invalidate();
                return;
            case 11:
                ((kk) this.f24307b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                gm gmVar = (gm) this.f24307b;
                gmVar.getClass();
                gmVar.f26423l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar.O.f26779z.invalidate();
                return;
            case 13:
                lo loVar = (lo) this.f24307b;
                loVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                loVar.d = floatValue3;
                loVar.setShown(floatValue3);
                loVar.a(false);
                return;
            case 14:
                dp dpVar = (dp) this.f24307b;
                dpVar.getClass();
                dpVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dpVar.f25499z1.setTranslationY((-org.telegram.messenger.i0.L(7.0f)) * dpVar.W1);
                return;
            case 15:
                kq kqVar = (kq) this.f24307b;
                kqVar.getClass();
                kqVar.f27875l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = kqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                cv cvVar = (cv) this.f24307b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cvVar.A1 = floatValue4;
                cvVar.f25165n1.setAlpha(floatValue4);
                cvVar.f25169r1.setAlpha(cvVar.A1);
                cvVar.f25170s1.setAlpha(cvVar.A1);
                cvVar.f21586b.invalidate();
                return;
            case 17:
                vu vuVar = (vu) this.f24307b;
                vuVar.getClass();
                vuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (vuVar.getParent() instanceof View) {
                    ((View) vuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                yu yuVar = (yu) this.f24307b;
                yuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.f32798w = floatValue5;
                TextView textView = yuVar.f32793c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - yuVar.f32798w);
                textView.setAlpha(1.0f - yuVar.f32798w);
                TextView textView2 = yuVar.d;
                textView2.setScaleX(yuVar.f32798w);
                textView2.setScaleY(yuVar.f32798w);
                textView2.setAlpha(yuVar.f32798w);
                return;
            case 19:
                iv ivVar = (iv) this.f24307b;
                ivVar.getClass();
                ivVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ivVar.d();
                return;
            case 20:
                kv kvVar = (kv) this.f24307b;
                kvVar.getClass();
                kvVar.f27929r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kvVar.invalidate();
                kvVar.requestLayout();
                kvVar.c();
                kvVar.f27930s.f32758b.invalidate();
                return;
            case 21:
                ey eyVar = (ey) this.f24307b;
                eyVar.getClass();
                eyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eyVar.invalidate();
                return;
            case 22:
                iy iyVar = (iy) this.f24307b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iyVar.f27130x = floatValue6;
                View view2 = iyVar.f27129w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                fg.i iVar = iyVar.f27128s;
                if (iVar != null) {
                    iVar.invalidate();
                    return;
                }
                return;
            case 23:
                tz tzVar = ((mz) this.f24307b).F;
                tzVar.F.invalidate();
                tzVar.invalidate();
                return;
            case 24:
                yz yzVar = (yz) this.f24307b;
                yzVar.getClass();
                yzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yzVar.invalidate();
                return;
            case 25:
                g20 g20Var = (g20) this.f24307b;
                e20 e20Var = g20Var.f26226a;
                if (!g20Var.F) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    g20Var.f26229b0 = floatValue7;
                    g20Var.U.setPinnedProgress(floatValue7);
                    e20Var.setScaleX(1.0f - (g20Var.f26229b0 * 0.6f));
                    e20Var.setScaleY(1.0f - (g20Var.f26229b0 * 0.6f));
                    if (g20Var.W) {
                        g20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                e50 e50Var = (e50) this.f24307b;
                if (e50Var.f25676r0) {
                    Camera2Session camera2Session = e50Var.f25681v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = e50Var.f25678s0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                m60 m60Var = (m60) this.f24307b;
                m60Var.getClass();
                m60Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m60Var.f21586b.invalidate();
                return;
            case 28:
                m60 m60Var2 = ((l60) this.f24307b).e;
                m60Var2.f28297b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m60Var2.f21586b.invalidate();
                return;
            default:
                z60 z60Var = (z60) this.f24307b;
                z60Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x60 x60Var = z60Var.f32945x;
                if (x60Var != null) {
                    x60Var.setProgress(floatValue8);
                    return;
                }
                return;
        }
    }
}
