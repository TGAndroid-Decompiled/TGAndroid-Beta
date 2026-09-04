package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28065a;
    public final Object f28066b;

    public l6(Object obj, int i10) {
        this.f28065a = i10;
        this.f28066b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28065a) {
            case 0:
                p6 p6Var = (p6) this.f28066b;
                p6Var.getClass();
                p6Var.f29294m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                x6 x6Var = (x6) this.f28066b;
                x6Var.f32431a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x6Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f28066b;
                k8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                k8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                f9 f9Var = (f9) this.f28066b;
                f9Var.getClass();
                f9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                k9 k9Var = (k9) this.f28066b;
                k9Var.getClass();
                k9Var.f27759e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.f();
                return;
            case 5:
                z9 z9Var = (z9) this.f28066b;
                z9Var.getClass();
                z9Var.f33106g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f28066b;
                naVar.getClass();
                naVar.f28706f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f28703b.invalidate();
                return;
            case 7:
                zc zcVar = (zc) this.f28066b;
                zcVar.getClass();
                zcVar.f33124i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f28066b;
                vgVar.getClass();
                vgVar.f31228d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f28066b).f24714e;
                xh xhVar = viVar.f31337x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f28066b;
                vi viVar2 = xhVar2.f32542b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f28066b;
                nmVar.getClass();
                nmVar.f28800l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f29131z.invalidate();
                return;
            case 12:
                so soVar = (so) this.f28066b;
                soVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.d = floatValue2;
                soVar.setShown(floatValue2);
                soVar.a(false);
                return;
            case 13:
                lp lpVar = (lp) this.f28066b;
                lpVar.getClass();
                lpVar.f28265g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * lpVar.f28265g0);
                return;
            case 14:
                uq uqVar = (uq) this.f28066b;
                uqVar.getClass();
                uqVar.f30944l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                or orVar = (or) this.f28066b;
                orVar.getClass();
                orVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                orVar.invalidateSelf();
                return;
            case 16:
                rv.p((rv) this.f28066b, valueAnimator);
                return;
            case 17:
                iv ivVar = (iv) this.f28066b;
                ivVar.getClass();
                ivVar.f27270e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ivVar.getParent() instanceof View) {
                    ((View) ivVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                mv mvVar = (mv) this.f28066b;
                mvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.v = floatValue3;
                TextView textView = mvVar.f28539c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - mvVar.v);
                textView.setAlpha(1.0f - mvVar.v);
                TextView textView2 = mvVar.d;
                textView2.setScaleX(mvVar.v);
                textView2.setScaleY(mvVar.v);
                textView2.setAlpha(mvVar.v);
                return;
            case 19:
                xv xvVar = (xv) this.f28066b;
                xvVar.getClass();
                xvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.d();
                return;
            case 20:
                zv zvVar = (zv) this.f28066b;
                zvVar.getClass();
                zvVar.f33236r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.invalidate();
                zvVar.requestLayout();
                zvVar.c();
                zvVar.f33237s.f28470b.invalidate();
                return;
            case 21:
                ty tyVar = (ty) this.f28066b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                return;
            case 22:
                xy xyVar = (xy) this.f28066b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.f32780w = floatValue4;
                View view2 = xyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ah.w wVar = xyVar.f32779s;
                if (wVar != null) {
                    wVar.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((c00) this.f28066b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f28066b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                z20 z20Var = (z20) this.f28066b;
                x20 x20Var = z20Var.f33056a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.f33059b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.f33059b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f33059b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                w50 w50Var = (w50) this.f28066b;
                if (w50Var.f32144n0) {
                    Camera2Session camera2Session = w50Var.f32149r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = w50Var.f32145o0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                b70.P((b70) this.f28066b, valueAnimator);
                return;
            case 28:
                b70 b70Var = ((a70) this.f28066b).f24299e;
                b70Var.f24577k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b70.U(b70Var).invalidate();
                return;
            default:
                n70 n70Var = (n70) this.f28066b;
                n70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l70 l70Var = n70Var.f28664x;
                if (l70Var != null) {
                    l70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
