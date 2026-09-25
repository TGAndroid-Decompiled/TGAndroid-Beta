package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25666a;
    public final Object f25667b;

    public k6(Object obj, int i10) {
        this.f25666a = i10;
        this.f25667b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25666a) {
            case 0:
                o6 o6Var = (o6) this.f25667b;
                o6Var.getClass();
                o6Var.f26938m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25667b;
                w6Var.f29902a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25667b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25667b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25667b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25667b;
                y9Var.getClass();
                y9Var.f30573g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25667b;
                naVar.getClass();
                naVar.f26691f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26689b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25667b;
                ycVar.getClass();
                ycVar.f30591i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f25667b;
                vgVar.getClass();
                vgVar.f29141d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ((ci) this.f25667b).e;
                yh yhVar = wiVar.f30064x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                return;
            case 10:
                yh yhVar2 = (yh) this.f25667b;
                wi wiVar2 = yhVar2.f30607b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                return;
            case 11:
                om omVar = (om) this.f25667b;
                omVar.getClass();
                omVar.f27127l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.f27405z.invalidate();
                return;
            case 12:
                uo uoVar = (uo) this.f25667b;
                uoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uoVar.d = floatValue2;
                uoVar.setShown(floatValue2);
                uoVar.a(false);
                return;
            case 13:
                np npVar = (np) this.f25667b;
                npVar.getClass();
                npVar.f26762g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.f26762g0);
                return;
            case 14:
                wq wqVar = (wq) this.f25667b;
                wqVar.getClass();
                wqVar.f30157l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                qr qrVar = (qr) this.f25667b;
                qrVar.getClass();
                qrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qrVar.invalidateSelf();
                return;
            case 16:
                tv.p((tv) this.f25667b, valueAnimator);
                return;
            case 17:
                kv kvVar = (kv) this.f25667b;
                kvVar.getClass();
                kvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kvVar.getParent() instanceof View) {
                    ((View) kvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                ov ovVar = (ov) this.f25667b;
                ovVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ovVar.v = floatValue3;
                TextView textView = ovVar.f27200c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - ovVar.v);
                textView.setAlpha(1.0f - ovVar.v);
                TextView textView2 = ovVar.d;
                textView2.setScaleX(ovVar.v);
                textView2.setScaleY(ovVar.v);
                textView2.setAlpha(ovVar.v);
                return;
            case 19:
                zv zvVar = (zv) this.f25667b;
                zvVar.getClass();
                zvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.d();
                return;
            case 20:
                bw bwVar = (bw) this.f25667b;
                bwVar.getClass();
                bwVar.f23110r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.invalidate();
                bwVar.requestLayout();
                bwVar.c();
                bwVar.f23111s.f30651b.invalidate();
                return;
            case 21:
                uy uyVar = (uy) this.f25667b;
                uyVar.getClass();
                uyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uyVar.invalidate();
                return;
            case 22:
                yy yyVar = (yy) this.f25667b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.f30730w = floatValue4;
                View view2 = yyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = yyVar.f30729s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                l00 l00Var = ((d00) this.f25667b).F;
                l00Var.F.invalidate();
                l00Var.invalidate();
                return;
            case 24:
                t00 t00Var = (t00) this.f25667b;
                t00Var.getClass();
                t00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                return;
            case 25:
                a30 a30Var = (a30) this.f25667b;
                y20 y20Var = a30Var.f22573a;
                if (!a30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a30Var.f22576b0 = floatValue5;
                    a30Var.U.setPinnedProgress(floatValue5);
                    y20Var.setScaleX(1.0f - (a30Var.f22576b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.f22576b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                c60 c60Var = (c60) this.f25667b;
                if (c60Var.f23240s0) {
                    Camera2Session camera2Session = c60Var.f23245w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = c60Var.f23241t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                m70.P((m70) this.f25667b, valueAnimator);
                return;
            case 28:
                m70 m70Var = ((l70) this.f25667b).e;
                m70Var.f26386k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m70.U(m70Var).invalidate();
                return;
            default:
                y70 y70Var = (y70) this.f25667b;
                y70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w70 w70Var = y70Var.f30559x;
                if (w70Var != null) {
                    w70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
