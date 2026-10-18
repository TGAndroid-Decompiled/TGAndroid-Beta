package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28085a;
    public final Object f28086b;

    public l6(Object obj, int i10) {
        this.f28085a = i10;
        this.f28086b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28085a) {
            case 0:
                p6 p6Var = (p6) this.f28086b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.f29213q = floatValue;
                TimeInterpolator timeInterpolator = p6Var.f29219x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                p6Var.f29214r = floatValue;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29202c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                x6 x6Var = (x6) this.f28086b;
                x6Var.f32335a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x6Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f28086b;
                k8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                k8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f28086b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f28086b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f28086b;
                y9Var.getClass();
                y9Var.f32585g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f28086b;
                naVar.getClass();
                naVar.f28698f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f28696b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f28086b;
                ycVar.getClass();
                ycVar.f32614j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f28086b;
                vgVar.getClass();
                vgVar.f31267d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = ((ai) this.f28086b).e;
                wh whVar = tiVar.A1;
                whVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                whVar.setTranslationY(dp);
                return;
            case 10:
                wh whVar2 = (wh) this.f28086b;
                ti tiVar2 = whVar2.f32124b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                whVar2.invalidate();
                return;
            case 11:
                ((al) this.f28086b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                ym ymVar = (ym) this.f28086b;
                ymVar.getClass();
                ymVar.f32694l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymVar.O.f32975z.invalidate();
                return;
            case 13:
                dp dpVar = (dp) this.f28086b;
                dpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dpVar.d = floatValue3;
                dpVar.setShown(floatValue3);
                dpVar.a(false);
                return;
            case 14:
                wp wpVar = (wp) this.f28086b;
                wpVar.getClass();
                wpVar.f32186g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f32186g0);
                return;
            case 15:
                fr frVar = (fr) this.f28086b;
                frVar.getClass();
                frVar.f26369l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = frVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                as asVar = (as) this.f28086b;
                asVar.getClass();
                asVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                asVar.invalidateSelf();
                return;
            case 17:
                aw.q((aw) this.f28086b, valueAnimator);
                return;
            case 18:
                rv rvVar = (rv) this.f28086b;
                rvVar.getClass();
                rvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rvVar.getParent() instanceof View) {
                    ((View) rvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                vv vvVar = (vv) this.f28086b;
                vvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.v = floatValue4;
                TextView textView = vvVar.f31919c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - vvVar.v);
                textView.setAlpha(1.0f - vvVar.v);
                TextView textView2 = vvVar.d;
                textView2.setScaleX(vvVar.v);
                textView2.setScaleY(vvVar.v);
                textView2.setAlpha(vvVar.v);
                return;
            case 20:
                gw gwVar = (gw) this.f28086b;
                gwVar.getClass();
                gwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.d();
                return;
            case 21:
                iw iwVar = (iw) this.f28086b;
                iwVar.getClass();
                iwVar.f27375r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iwVar.invalidate();
                iwVar.requestLayout();
                iwVar.c();
                iwVar.f27376s.f27951b.invalidate();
                return;
            case 22:
                cz czVar = (cz) this.f28086b;
                czVar.getClass();
                czVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar.invalidate();
                return;
            case 23:
                gz gzVar = (gz) this.f28086b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzVar.f26707w = floatValue5;
                View view2 = gzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ah.v vVar = gzVar.f26706s;
                if (vVar != null) {
                    vVar.invalidate();
                    return;
                }
                return;
            case 24:
                s00 s00Var = ((l00) this.f28086b).F;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 25:
                a10 a10Var = (a10) this.f28086b;
                a10Var.getClass();
                a10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 26:
                i30 i30Var = (i30) this.f28086b;
                f30 f30Var = i30Var.f27058a;
                if (!i30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    i30Var.f27061b0 = floatValue6;
                    i30Var.U.setPinnedProgress(floatValue6);
                    f30Var.setScaleX(1.0f - (i30Var.f27061b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.f27061b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                m60 m60Var = (m60) this.f28086b;
                if (m60Var.f28449s0) {
                    Camera2Session camera2Session = m60Var.f28454w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = m60Var.f28450t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                v70.Q((v70) this.f28086b, valueAnimator);
                return;
            default:
                v70 v70Var = ((u70) this.f28086b).e;
                v70Var.f31210k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v70.V(v70Var).invalidate();
                return;
        }
    }
}
