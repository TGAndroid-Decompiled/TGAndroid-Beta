package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24242a;
    public final Object f24243b;

    public j6(Object obj, int i10) {
        this.f24242a = i10;
        this.f24243b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24242a) {
            case 0:
                n6 n6Var = (n6) this.f24243b;
                n6Var.getClass();
                n6Var.f25433m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                v6 v6Var = (v6) this.f24243b;
                v6Var.f27843a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f24243b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                d9 d9Var = (d9) this.f24243b;
                d9Var.getClass();
                d9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                i9 i9Var = (i9) this.f24243b;
                i9Var.getClass();
                i9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f24243b;
                y9Var.getClass();
                y9Var.f29282g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                ma maVar = (ma) this.f24243b;
                maVar.getClass();
                maVar.f25200f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.f25198b.invalidate();
                return;
            case 7:
                xc xcVar = (xc) this.f24243b;
                xcVar.getClass();
                xcVar.f29008i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.b();
                return;
            case 8:
                xg xgVar = (xg) this.f24243b;
                xgVar.getClass();
                xgVar.f29023d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yi yiVar = ((ei) this.f24243b).e;
                ai aiVar = yiVar.f29424x1;
                aiVar.setAlpha(1.0f - floatValue);
                yiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                yiVar.F1 = dp;
                aiVar.setTranslationY(dp);
                return;
            case 10:
                ai aiVar2 = (ai) this.f24243b;
                yi yiVar2 = aiVar2.f21502b;
                yiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yiVar2.C0.invalidate();
                yiVar2.D0.invalidate();
                aiVar2.invalidate();
                return;
            case 11:
                um umVar = (um) this.f24243b;
                umVar.getClass();
                umVar.f27705l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                umVar.O.f28029z.invalidate();
                return;
            case 12:
                zo zoVar = (zo) this.f24243b;
                zoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zoVar.d = floatValue2;
                zoVar.setShown(floatValue2);
                zoVar.a(false);
                return;
            case 13:
                sp spVar = (sp) this.f24243b;
                spVar.getClass();
                spVar.f27140g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                spVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * spVar.f27140g0);
                return;
            case 14:
                br brVar = (br) this.f24243b;
                brVar.getClass();
                brVar.f21877l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = brVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                vr vrVar = (vr) this.f24243b;
                vrVar.getClass();
                vrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vrVar.invalidateSelf();
                return;
            case 16:
                wv.p((wv) this.f24243b, valueAnimator);
                return;
            case 17:
                nv nvVar = (nv) this.f24243b;
                nvVar.getClass();
                nvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nvVar.getParent() instanceof View) {
                    ((View) nvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                rv rvVar = (rv) this.f24243b;
                rvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rvVar.v = floatValue3;
                TextView textView = rvVar.f26764c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - rvVar.v);
                textView.setAlpha(1.0f - rvVar.v);
                TextView textView2 = rvVar.d;
                textView2.setScaleX(rvVar.v);
                textView2.setScaleY(rvVar.v);
                textView2.setAlpha(rvVar.v);
                return;
            case 19:
                cw cwVar = (cw) this.f24243b;
                cwVar.getClass();
                cwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.d();
                return;
            case 20:
                ew ewVar = (ew) this.f24243b;
                ewVar.getClass();
                ewVar.f22764r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.invalidate();
                ewVar.requestLayout();
                ewVar.c();
                ewVar.f22765s.f28802b.invalidate();
                return;
            case 21:
                az azVar = (az) this.f24243b;
                azVar.getClass();
                azVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.invalidate();
                return;
            case 22:
                ez ezVar = (ez) this.f24243b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.f22786w = floatValue4;
                View view2 = ezVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                bi.n7 n7Var = ezVar.f22785s;
                if (n7Var != null) {
                    n7Var.invalidate();
                    return;
                }
                return;
            case 23:
                r00 r00Var = ((j00) this.f24243b).F;
                r00Var.F.invalidate();
                r00Var.invalidate();
                return;
            case 24:
                z00 z00Var = (z00) this.f24243b;
                z00Var.getClass();
                z00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var.invalidate();
                return;
            case 25:
                j30 j30Var = (j30) this.f24243b;
                h30 h30Var = j30Var.f24209a;
                if (!j30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    j30Var.f24212b0 = floatValue5;
                    j30Var.U.setPinnedProgress(floatValue5);
                    h30Var.setScaleX(1.0f - (j30Var.f24212b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (j30Var.f24212b0 * 0.6f));
                    if (j30Var.W) {
                        j30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                f60 f60Var = (f60) this.f24243b;
                if (f60Var.f22892n0) {
                    Camera2Session camera2Session = f60Var.f22897r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = f60Var.f22893o0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                k70.P((k70) this.f24243b, valueAnimator);
                return;
            case 28:
                k70 k70Var = ((j70) this.f24243b).e;
                k70Var.f24636k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k70.U(k70Var).invalidate();
                return;
            default:
                w70 w70Var = (w70) this.f24243b;
                w70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u70 u70Var = w70Var.f28705x;
                if (u70Var != null) {
                    u70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
