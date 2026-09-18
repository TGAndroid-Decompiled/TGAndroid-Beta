package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24827a;
    public final Object f24828b;

    public i6(Object obj, int i10) {
        this.f24827a = i10;
        this.f24828b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24827a) {
            case 0:
                m6 m6Var = (m6) this.f24828b;
                m6Var.getClass();
                m6Var.f26078m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                u6 u6Var = (u6) this.f24828b;
                u6Var.f28288a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u6Var.invalidate();
                return;
            case 2:
                h8 h8Var = (h8) this.f24828b;
                h8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                h8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                c9 c9Var = (c9) this.f24828b;
                c9Var.getClass();
                c9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                h9 h9Var = (h9) this.f24828b;
                h9Var.getClass();
                h9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.f();
                return;
            case 5:
                w9 w9Var = (w9) this.f24828b;
                w9Var.getClass();
                w9Var.f29619g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.invalidateSelf();
                return;
            case 6:
                la laVar = (la) this.f24828b;
                laVar.getClass();
                laVar.f25873f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                laVar.f25871b.invalidate();
                return;
            case 7:
                wc wcVar = (wc) this.f24828b;
                wcVar.getClass();
                wcVar.f29637i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcVar.b();
                return;
            case 8:
                tg tgVar = (tg) this.f24828b;
                tgVar.getClass();
                tgVar.f28084d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f24828b).e;
                xh xhVar = viVar.f28803x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f24828b;
                vi viVar2 = xhVar2.f29915b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f24828b;
                nmVar.getClass();
                nmVar.f26490l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f26803z.invalidate();
                return;
            case 12:
                to toVar = (to) this.f24828b;
                toVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue2;
                toVar.setShown(floatValue2);
                toVar.a(false);
                return;
            case 13:
                mp mpVar = (mp) this.f24828b;
                mpVar.getClass();
                mpVar.f26232g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26232g0);
                return;
            case 14:
                vq vqVar = (vq) this.f24828b;
                vqVar.getClass();
                vqVar.f29379l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                pr prVar = (pr) this.f24828b;
                prVar.getClass();
                prVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                prVar.invalidateSelf();
                return;
            case 16:
                sv.p((sv) this.f24828b, valueAnimator);
                return;
            case 17:
                jv jvVar = (jv) this.f24828b;
                jvVar.getClass();
                jvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jvVar.getParent() instanceof View) {
                    ((View) jvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                nv nvVar = (nv) this.f24828b;
                nvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvVar.v = floatValue3;
                TextView textView = nvVar.f26549c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - nvVar.v);
                textView.setAlpha(1.0f - nvVar.v);
                TextView textView2 = nvVar.d;
                textView2.setScaleX(nvVar.v);
                textView2.setScaleY(nvVar.v);
                textView2.setAlpha(nvVar.v);
                return;
            case 19:
                yv yvVar = (yv) this.f24828b;
                yvVar.getClass();
                yvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yvVar.d();
                return;
            case 20:
                aw awVar = (aw) this.f24828b;
                awVar.getClass();
                awVar.f22496r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.invalidate();
                awVar.requestLayout();
                awVar.c();
                awVar.f22497s.f26505b.invalidate();
                return;
            case 21:
                ty tyVar = (ty) this.f24828b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                return;
            case 22:
                xy xyVar = (xy) this.f24828b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.f30034w = floatValue4;
                View view2 = xyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.n6 n6Var = xyVar.f30033s;
                if (n6Var != null) {
                    n6Var.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((c00) this.f24828b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f24828b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                z20 z20Var = (z20) this.f24828b;
                x20 x20Var = z20Var.f30378a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.f30381b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.f30381b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30381b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                w50 w50Var = (w50) this.f24828b;
                if (w50Var.f29551n0) {
                    Camera2Session camera2Session = w50Var.f29556r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = w50Var.f29552o0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                b70.P((b70) this.f24828b, valueAnimator);
                return;
            case 28:
                b70 b70Var = ((a70) this.f24828b).e;
                b70Var.f22635k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b70.U(b70Var).invalidate();
                return;
            default:
                n70 n70Var = (n70) this.f24828b;
                n70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l70 l70Var = n70Var.f26391x;
                if (l70Var != null) {
                    l70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
