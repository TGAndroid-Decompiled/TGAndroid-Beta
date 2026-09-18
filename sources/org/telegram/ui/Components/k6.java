package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25591a;
    public final Object f25592b;

    public k6(Object obj, int i10) {
        this.f25591a = i10;
        this.f25592b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25591a) {
            case 0:
                o6 o6Var = (o6) this.f25592b;
                o6Var.getClass();
                o6Var.f26876m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25592b;
                w6Var.f29866a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25592b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25592b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25592b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25592b;
                y9Var.getClass();
                y9Var.f30514g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25592b;
                naVar.getClass();
                naVar.f26638f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26636b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25592b;
                ycVar.getClass();
                ycVar.f30550i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                ug ugVar = (ug) this.f25592b;
                ugVar.getClass();
                ugVar.f28693d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f25592b).e;
                xh xhVar = viVar.f29079x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f25592b;
                vi viVar2 = xhVar2.f30320b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f25592b;
                nmVar.getClass();
                nmVar.f26712l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f27009z.invalidate();
                return;
            case 12:
                to toVar = (to) this.f25592b;
                toVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue2;
                toVar.setShown(floatValue2);
                toVar.a(false);
                return;
            case 13:
                mp mpVar = (mp) this.f25592b;
                mpVar.getClass();
                mpVar.f26483g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26483g0);
                return;
            case 14:
                vq vqVar = (vq) this.f25592b;
                vqVar.getClass();
                vqVar.f29697l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                pr prVar = (pr) this.f25592b;
                prVar.getClass();
                prVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                prVar.invalidateSelf();
                return;
            case 16:
                sv.p((sv) this.f25592b, valueAnimator);
                return;
            case 17:
                jv jvVar = (jv) this.f25592b;
                jvVar.getClass();
                jvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jvVar.getParent() instanceof View) {
                    ((View) jvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                nv nvVar = (nv) this.f25592b;
                nvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvVar.v = floatValue3;
                TextView textView = nvVar.f26770c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - nvVar.v);
                textView.setAlpha(1.0f - nvVar.v);
                TextView textView2 = nvVar.d;
                textView2.setScaleX(nvVar.v);
                textView2.setScaleY(nvVar.v);
                textView2.setAlpha(nvVar.v);
                return;
            case 19:
                yv yvVar = (yv) this.f25592b;
                yvVar.getClass();
                yvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yvVar.d();
                return;
            case 20:
                aw awVar = (aw) this.f25592b;
                awVar.getClass();
                awVar.f22748r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.invalidate();
                awVar.requestLayout();
                awVar.c();
                awVar.f22749s.f30846b.invalidate();
                return;
            case 21:
                ty tyVar = (ty) this.f25592b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                return;
            case 22:
                xy xyVar = (xy) this.f25592b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.f30400w = floatValue4;
                View view2 = xyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.n6 n6Var = xyVar.f30399s;
                if (n6Var != null) {
                    n6Var.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((c00) this.f25592b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f25592b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                z20 z20Var = (z20) this.f25592b;
                x20 x20Var = z20Var.f30712a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.f30715b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.f30715b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30715b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                b60 b60Var = (b60) this.f25592b;
                if (b60Var.f22850q0) {
                    Camera2Session camera2Session = b60Var.f22856u0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = b60Var.f22852r0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                k70.P((k70) this.f25592b, valueAnimator);
                return;
            case 28:
                k70 k70Var = ((j70) this.f25592b).e;
                k70Var.f25610k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k70.U(k70Var).invalidate();
                return;
            default:
                w70 w70Var = (w70) this.f25592b;
                w70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u70 u70Var = w70Var.f29928x;
                if (u70Var != null) {
                    u70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
