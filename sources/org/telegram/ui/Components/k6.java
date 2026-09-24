package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25647a;
    public final Object f25648b;

    public k6(Object obj, int i10) {
        this.f25647a = i10;
        this.f25648b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25647a) {
            case 0:
                o6 o6Var = (o6) this.f25648b;
                o6Var.getClass();
                o6Var.f26933m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25648b;
                w6Var.f29886a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25648b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25648b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25648b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25648b;
                y9Var.getClass();
                y9Var.f30565g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25648b;
                naVar.getClass();
                naVar.f26683f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26681b.invalidate();
                return;
            case 7:
                zc zcVar = (zc) this.f25648b;
                zcVar.getClass();
                zcVar.f30842i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f25648b;
                vgVar.getClass();
                vgVar.f29131d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ((ci) this.f25648b).e;
                yh yhVar = wiVar.f30043x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                return;
            case 10:
                yh yhVar2 = (yh) this.f25648b;
                wi wiVar2 = yhVar2.f30596b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                return;
            case 11:
                om omVar = (om) this.f25648b;
                omVar.getClass();
                omVar.f27122l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.f27390z.invalidate();
                return;
            case 12:
                uo uoVar = (uo) this.f25648b;
                uoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uoVar.d = floatValue2;
                uoVar.setShown(floatValue2);
                uoVar.a(false);
                return;
            case 13:
                np npVar = (np) this.f25648b;
                npVar.getClass();
                npVar.f26754g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.f26754g0);
                return;
            case 14:
                wq wqVar = (wq) this.f25648b;
                wqVar.getClass();
                wqVar.f30136l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                qr qrVar = (qr) this.f25648b;
                qrVar.getClass();
                qrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qrVar.invalidateSelf();
                return;
            case 16:
                uv.p((uv) this.f25648b, valueAnimator);
                return;
            case 17:
                lv lvVar = (lv) this.f25648b;
                lvVar.getClass();
                lvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lvVar.getParent() instanceof View) {
                    ((View) lvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                pv pvVar = (pv) this.f25648b;
                pvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pvVar.v = floatValue3;
                TextView textView = pvVar.f27423c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - pvVar.v);
                textView.setAlpha(1.0f - pvVar.v);
                TextView textView2 = pvVar.d;
                textView2.setScaleX(pvVar.v);
                textView2.setScaleY(pvVar.v);
                textView2.setAlpha(pvVar.v);
                return;
            case 19:
                aw awVar = (aw) this.f25648b;
                awVar.getClass();
                awVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.d();
                return;
            case 20:
                cw cwVar = (cw) this.f25648b;
                cwVar.getClass();
                cwVar.f23398r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.invalidate();
                cwVar.requestLayout();
                cwVar.c();
                cwVar.f23399s.f30640b.invalidate();
                return;
            case 21:
                uy uyVar = (uy) this.f25648b;
                uyVar.getClass();
                uyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uyVar.invalidate();
                return;
            case 22:
                yy yyVar = (yy) this.f25648b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.f30719w = floatValue4;
                View view2 = yyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = yyVar.f30718s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                l00 l00Var = ((d00) this.f25648b).F;
                l00Var.F.invalidate();
                l00Var.invalidate();
                return;
            case 24:
                t00 t00Var = (t00) this.f25648b;
                t00Var.getClass();
                t00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                return;
            case 25:
                a30 a30Var = (a30) this.f25648b;
                y20 y20Var = a30Var.f22558a;
                if (!a30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a30Var.f22561b0 = floatValue5;
                    a30Var.U.setPinnedProgress(floatValue5);
                    y20Var.setScaleX(1.0f - (a30Var.f22561b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.f22561b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                c60 c60Var = (c60) this.f25648b;
                if (c60Var.f23210s0) {
                    Camera2Session camera2Session = c60Var.f23215w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = c60Var.f23211t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                m70.P((m70) this.f25648b, valueAnimator);
                return;
            case 28:
                m70 m70Var = ((l70) this.f25648b).e;
                m70Var.f26378k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m70.U(m70Var).invalidate();
                return;
            default:
                y70 y70Var = (y70) this.f25648b;
                y70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w70 w70Var = y70Var.f30551x;
                if (w70Var != null) {
                    w70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
