package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28093a;
    public final Object f28094b;

    public l6(Object obj, int i10) {
        this.f28093a = i10;
        this.f28094b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28093a) {
            case 0:
                p6 p6Var = (p6) this.f28094b;
                p6Var.getClass();
                p6Var.f29322m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                x6 x6Var = (x6) this.f28094b;
                x6Var.f32459a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x6Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f28094b;
                k8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                k8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                f9 f9Var = (f9) this.f28094b;
                f9Var.getClass();
                f9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                k9 k9Var = (k9) this.f28094b;
                k9Var.getClass();
                k9Var.f27787e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.f();
                return;
            case 5:
                z9 z9Var = (z9) this.f28094b;
                z9Var.getClass();
                z9Var.f33134g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f28094b;
                naVar.getClass();
                naVar.f28734f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f28731b.invalidate();
                return;
            case 7:
                zc zcVar = (zc) this.f28094b;
                zcVar.getClass();
                zcVar.f33152i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f28094b;
                vgVar.getClass();
                vgVar.f31256d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f28094b).f24742e;
                xh xhVar = viVar.f31365x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f28094b;
                vi viVar2 = xhVar2.f32570b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f28094b;
                nmVar.getClass();
                nmVar.f28828l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f29159z.invalidate();
                return;
            case 12:
                so soVar = (so) this.f28094b;
                soVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.d = floatValue2;
                soVar.setShown(floatValue2);
                soVar.a(false);
                return;
            case 13:
                lp lpVar = (lp) this.f28094b;
                lpVar.getClass();
                lpVar.f28293g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * lpVar.f28293g0);
                return;
            case 14:
                uq uqVar = (uq) this.f28094b;
                uqVar.getClass();
                uqVar.f30972l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                or orVar = (or) this.f28094b;
                orVar.getClass();
                orVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                orVar.invalidateSelf();
                return;
            case 16:
                rv.p((rv) this.f28094b, valueAnimator);
                return;
            case 17:
                iv ivVar = (iv) this.f28094b;
                ivVar.getClass();
                ivVar.f27298e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ivVar.getParent() instanceof View) {
                    ((View) ivVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                mv mvVar = (mv) this.f28094b;
                mvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.v = floatValue3;
                TextView textView = mvVar.f28567c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - mvVar.v);
                textView.setAlpha(1.0f - mvVar.v);
                TextView textView2 = mvVar.d;
                textView2.setScaleX(mvVar.v);
                textView2.setScaleY(mvVar.v);
                textView2.setAlpha(mvVar.v);
                return;
            case 19:
                xv xvVar = (xv) this.f28094b;
                xvVar.getClass();
                xvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.d();
                return;
            case 20:
                zv zvVar = (zv) this.f28094b;
                zvVar.getClass();
                zvVar.f33264r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.invalidate();
                zvVar.requestLayout();
                zvVar.c();
                zvVar.f33265s.f28498b.invalidate();
                return;
            case 21:
                ty tyVar = (ty) this.f28094b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                return;
            case 22:
                xy xyVar = (xy) this.f28094b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.f32808w = floatValue4;
                View view2 = xyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ah.w wVar = xyVar.f32807s;
                if (wVar != null) {
                    wVar.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((c00) this.f28094b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f28094b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                z20 z20Var = (z20) this.f28094b;
                x20 x20Var = z20Var.f33084a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.f33087b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.f33087b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f33087b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                w50 w50Var = (w50) this.f28094b;
                if (w50Var.f32172n0) {
                    Camera2Session camera2Session = w50Var.f32177r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = w50Var.f32173o0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                b70.P((b70) this.f28094b, valueAnimator);
                return;
            case 28:
                b70 b70Var = ((a70) this.f28094b).f24327e;
                b70Var.f24605k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b70.U(b70Var).invalidate();
                return;
            default:
                n70 n70Var = (n70) this.f28094b;
                n70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l70 l70Var = n70Var.f28692x;
                if (l70Var != null) {
                    l70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
