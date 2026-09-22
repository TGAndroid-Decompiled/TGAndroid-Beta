package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24914a;
    public final Object f24915b;

    public i6(Object obj, int i10) {
        this.f24914a = i10;
        this.f24915b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24914a) {
            case 0:
                m6 m6Var = (m6) this.f24915b;
                m6Var.getClass();
                m6Var.f26093m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                u6 u6Var = (u6) this.f24915b;
                u6Var.f28293a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u6Var.invalidate();
                return;
            case 2:
                h8 h8Var = (h8) this.f24915b;
                h8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                h8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                c9 c9Var = (c9) this.f24915b;
                c9Var.getClass();
                c9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                h9 h9Var = (h9) this.f24915b;
                h9Var.getClass();
                h9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.f();
                return;
            case 5:
                w9 w9Var = (w9) this.f24915b;
                w9Var.getClass();
                w9Var.f29672g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.invalidateSelf();
                return;
            case 6:
                la laVar = (la) this.f24915b;
                laVar.getClass();
                laVar.f25888f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                laVar.f25886b.invalidate();
                return;
            case 7:
                wc wcVar = (wc) this.f24915b;
                wcVar.getClass();
                wcVar.f29690i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcVar.b();
                return;
            case 8:
                tg tgVar = (tg) this.f24915b;
                tgVar.getClass();
                tgVar.f28113d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f24915b).e;
                xh xhVar = viVar.f28805x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f24915b;
                vi viVar2 = xhVar2.f29935b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f24915b;
                nmVar.getClass();
                nmVar.f26504l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f26858z.invalidate();
                return;
            case 12:
                to toVar = (to) this.f24915b;
                toVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue2;
                toVar.setShown(floatValue2);
                toVar.a(false);
                return;
            case 13:
                mp mpVar = (mp) this.f24915b;
                mpVar.getClass();
                mpVar.f26201g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26201g0);
                return;
            case 14:
                vq vqVar = (vq) this.f24915b;
                vqVar.getClass();
                vqVar.f29398l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                pr prVar = (pr) this.f24915b;
                prVar.getClass();
                prVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                prVar.invalidateSelf();
                return;
            case 16:
                sv.p((sv) this.f24915b, valueAnimator);
                return;
            case 17:
                jv jvVar = (jv) this.f24915b;
                jvVar.getClass();
                jvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jvVar.getParent() instanceof View) {
                    ((View) jvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                nv nvVar = (nv) this.f24915b;
                nvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvVar.v = floatValue3;
                TextView textView = nvVar.f26597c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - nvVar.v);
                textView.setAlpha(1.0f - nvVar.v);
                TextView textView2 = nvVar.d;
                textView2.setScaleX(nvVar.v);
                textView2.setScaleY(nvVar.v);
                textView2.setAlpha(nvVar.v);
                return;
            case 19:
                yv yvVar = (yv) this.f24915b;
                yvVar.getClass();
                yvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yvVar.d();
                return;
            case 20:
                aw awVar = (aw) this.f24915b;
                awVar.getClass();
                awVar.f22489r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.invalidate();
                awVar.requestLayout();
                awVar.c();
                awVar.f22490s.f26179b.invalidate();
                return;
            case 21:
                ty tyVar = (ty) this.f24915b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                return;
            case 22:
                xy xyVar = (xy) this.f24915b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.f30088w = floatValue4;
                View view2 = xyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.n6 n6Var = xyVar.f30087s;
                if (n6Var != null) {
                    n6Var.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((c00) this.f24915b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f24915b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                z20 z20Var = (z20) this.f24915b;
                x20 x20Var = z20Var.f30453a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.f30456b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.f30456b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30456b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                w50 w50Var = (w50) this.f24915b;
                if (w50Var.f29590n0) {
                    Camera2Session camera2Session = w50Var.f29595r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = w50Var.f29591o0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                b70.P((b70) this.f24915b, valueAnimator);
                return;
            case 28:
                b70 b70Var = ((a70) this.f24915b).e;
                b70Var.f22677k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b70.U(b70Var).invalidate();
                return;
            default:
                n70 n70Var = (n70) this.f24915b;
                n70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l70 l70Var = n70Var.f26371x;
                if (l70Var != null) {
                    l70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
