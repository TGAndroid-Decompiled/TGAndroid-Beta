package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28078a;
    public final Object f28079b;

    public l6(Object obj, int i10) {
        this.f28078a = i10;
        this.f28079b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28078a) {
            case 0:
                p6 p6Var = (p6) this.f28079b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.f29206q = floatValue;
                TimeInterpolator timeInterpolator = p6Var.f29212x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                p6Var.f29207r = floatValue;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29195c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                x6 x6Var = (x6) this.f28079b;
                x6Var.f32328a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x6Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f28079b;
                k8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                k8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f28079b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f28079b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f28079b;
                y9Var.getClass();
                y9Var.f32578g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f28079b;
                naVar.getClass();
                naVar.f28691f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f28689b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f28079b;
                ycVar.getClass();
                ycVar.f32607j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f28079b;
                vgVar.getClass();
                vgVar.f31260d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = ((ai) this.f28079b).e;
                wh whVar = tiVar.A1;
                whVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                whVar.setTranslationY(dp);
                return;
            case 10:
                wh whVar2 = (wh) this.f28079b;
                ti tiVar2 = whVar2.f32117b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                whVar2.invalidate();
                return;
            case 11:
                ((al) this.f28079b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                ym ymVar = (ym) this.f28079b;
                ymVar.getClass();
                ymVar.f32687l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymVar.O.f32968z.invalidate();
                return;
            case 13:
                dp dpVar = (dp) this.f28079b;
                dpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dpVar.d = floatValue3;
                dpVar.setShown(floatValue3);
                dpVar.a(false);
                return;
            case 14:
                wp wpVar = (wp) this.f28079b;
                wpVar.getClass();
                wpVar.f32179g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f32179g0);
                return;
            case 15:
                fr frVar = (fr) this.f28079b;
                frVar.getClass();
                frVar.f26362l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = frVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                as asVar = (as) this.f28079b;
                asVar.getClass();
                asVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                asVar.invalidateSelf();
                return;
            case 17:
                aw.q((aw) this.f28079b, valueAnimator);
                return;
            case 18:
                rv rvVar = (rv) this.f28079b;
                rvVar.getClass();
                rvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rvVar.getParent() instanceof View) {
                    ((View) rvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                vv vvVar = (vv) this.f28079b;
                vvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.v = floatValue4;
                TextView textView = vvVar.f31912c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - vvVar.v);
                textView.setAlpha(1.0f - vvVar.v);
                TextView textView2 = vvVar.d;
                textView2.setScaleX(vvVar.v);
                textView2.setScaleY(vvVar.v);
                textView2.setAlpha(vvVar.v);
                return;
            case 20:
                gw gwVar = (gw) this.f28079b;
                gwVar.getClass();
                gwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.d();
                return;
            case 21:
                iw iwVar = (iw) this.f28079b;
                iwVar.getClass();
                iwVar.f27368r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iwVar.invalidate();
                iwVar.requestLayout();
                iwVar.c();
                iwVar.f27369s.f27944b.invalidate();
                return;
            case 22:
                cz czVar = (cz) this.f28079b;
                czVar.getClass();
                czVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar.invalidate();
                return;
            case 23:
                gz gzVar = (gz) this.f28079b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzVar.f26700w = floatValue5;
                View view2 = gzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ah.v vVar = gzVar.f26699s;
                if (vVar != null) {
                    vVar.invalidate();
                    return;
                }
                return;
            case 24:
                s00 s00Var = ((l00) this.f28079b).F;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 25:
                a10 a10Var = (a10) this.f28079b;
                a10Var.getClass();
                a10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 26:
                i30 i30Var = (i30) this.f28079b;
                f30 f30Var = i30Var.f27051a;
                if (!i30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    i30Var.f27054b0 = floatValue6;
                    i30Var.U.setPinnedProgress(floatValue6);
                    f30Var.setScaleX(1.0f - (i30Var.f27054b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.f27054b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                m60 m60Var = (m60) this.f28079b;
                if (m60Var.f28442s0) {
                    Camera2Session camera2Session = m60Var.f28447w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = m60Var.f28443t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                v70.Q((v70) this.f28079b, valueAnimator);
                return;
            default:
                v70 v70Var = ((u70) this.f28079b).e;
                v70Var.f31203k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v70.V(v70Var).invalidate();
                return;
        }
    }
}
