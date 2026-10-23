package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28229a;
    public final Object f28230b;

    public l6(Object obj, int i10) {
        this.f28229a = i10;
        this.f28230b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28229a) {
            case 0:
                p6 p6Var = (p6) this.f28230b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.f29450q = floatValue;
                TimeInterpolator timeInterpolator = p6Var.f29456x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                p6Var.f29451r = floatValue;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29438b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                x6 x6Var = (x6) this.f28230b;
                x6Var.f32439a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x6Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f28230b;
                k8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                k8Var.L.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f28230b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f28230b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f28230b;
                y9Var.getClass();
                y9Var.f32846g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f28230b;
                naVar.getClass();
                naVar.f28908f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f28906b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f28230b;
                ycVar.getClass();
                ycVar.f32873j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f28230b;
                vgVar.getClass();
                vgVar.f31453d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = ((ai) this.f28230b).e;
                wh whVar = tiVar.A1;
                whVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                whVar.setTranslationY(dp);
                return;
            case 10:
                wh whVar2 = (wh) this.f28230b;
                ti tiVar2 = whVar2.f32243b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                whVar2.invalidate();
                return;
            case 11:
                ((al) this.f28230b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                ym ymVar = (ym) this.f28230b;
                ymVar.getClass();
                ymVar.f32984l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymVar.O.f33280z.invalidate();
                return;
            case 13:
                dp dpVar = (dp) this.f28230b;
                dpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dpVar.d = floatValue3;
                dpVar.setShown(floatValue3);
                dpVar.a(false);
                return;
            case 14:
                wp wpVar = (wp) this.f28230b;
                wpVar.getClass();
                wpVar.f32291f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wpVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f32291f0);
                return;
            case 15:
                er erVar = (er) this.f28230b;
                erVar.getClass();
                erVar.f26039l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = erVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                as asVar = (as) this.f28230b;
                asVar.getClass();
                asVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                asVar.invalidateSelf();
                return;
            case 17:
                aw.q((aw) this.f28230b, valueAnimator);
                return;
            case 18:
                rv rvVar = (rv) this.f28230b;
                rvVar.getClass();
                rvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rvVar.getParent() instanceof View) {
                    ((View) rvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                vv vvVar = (vv) this.f28230b;
                vvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.v = floatValue4;
                TextView textView = vvVar.f32059c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - vvVar.v);
                textView.setAlpha(1.0f - vvVar.v);
                TextView textView2 = vvVar.d;
                textView2.setScaleX(vvVar.v);
                textView2.setScaleY(vvVar.v);
                textView2.setAlpha(vvVar.v);
                return;
            case 20:
                gw gwVar = (gw) this.f28230b;
                gwVar.getClass();
                gwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.d();
                return;
            case 21:
                iw iwVar = (iw) this.f28230b;
                iwVar.getClass();
                iwVar.f27463r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iwVar.invalidate();
                iwVar.requestLayout();
                iwVar.c();
                iwVar.f27464s.f29245b.invalidate();
                return;
            case 22:
                cz czVar = (cz) this.f28230b;
                czVar.getClass();
                czVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar.invalidate();
                return;
            case 23:
                gz gzVar = (gz) this.f28230b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzVar.f26747w = floatValue5;
                View view2 = gzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ah.v vVar = gzVar.f26746s;
                if (vVar != null) {
                    vVar.invalidate();
                    return;
                }
                return;
            case 24:
                s00 s00Var = ((l00) this.f28230b).F;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 25:
                a10 a10Var = (a10) this.f28230b;
                a10Var.getClass();
                a10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 26:
                i30 i30Var = (i30) this.f28230b;
                f30 f30Var = i30Var.f27186a;
                if (!i30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    i30Var.f27189b0 = floatValue6;
                    i30Var.U.setPinnedProgress(floatValue6);
                    f30Var.setScaleX(1.0f - (i30Var.f27189b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.f27189b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                n60 n60Var = (n60) this.f28230b;
                if (n60Var.f28876s0) {
                    Camera2Session camera2Session = n60Var.f28881w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = n60Var.f28877t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                x70.P((x70) this.f28230b, valueAnimator);
                return;
            default:
                x70 x70Var = ((w70) this.f28230b).e;
                x70Var.f32461k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x70.U(x70Var).invalidate();
                return;
        }
    }
}
