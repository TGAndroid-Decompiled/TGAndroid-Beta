package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25665a;
    public final Object f25666b;

    public k6(Object obj, int i10) {
        this.f25665a = i10;
        this.f25666b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25665a) {
            case 0:
                o6 o6Var = (o6) this.f25666b;
                o6Var.getClass();
                o6Var.f26937m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25666b;
                w6Var.f29901a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25666b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25666b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25666b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25666b;
                y9Var.getClass();
                y9Var.f30572g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25666b;
                naVar.getClass();
                naVar.f26690f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26688b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25666b;
                ycVar.getClass();
                ycVar.f30590i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f25666b;
                vgVar.getClass();
                vgVar.f29140d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ((ci) this.f25666b).e;
                yh yhVar = wiVar.f30063x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                return;
            case 10:
                yh yhVar2 = (yh) this.f25666b;
                wi wiVar2 = yhVar2.f30606b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                return;
            case 11:
                om omVar = (om) this.f25666b;
                omVar.getClass();
                omVar.f27126l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.f27404z.invalidate();
                return;
            case 12:
                uo uoVar = (uo) this.f25666b;
                uoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uoVar.d = floatValue2;
                uoVar.setShown(floatValue2);
                uoVar.a(false);
                return;
            case 13:
                np npVar = (np) this.f25666b;
                npVar.getClass();
                npVar.f26761g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.f26761g0);
                return;
            case 14:
                wq wqVar = (wq) this.f25666b;
                wqVar.getClass();
                wqVar.f30156l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                qr qrVar = (qr) this.f25666b;
                qrVar.getClass();
                qrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qrVar.invalidateSelf();
                return;
            case 16:
                tv.p((tv) this.f25666b, valueAnimator);
                return;
            case 17:
                kv kvVar = (kv) this.f25666b;
                kvVar.getClass();
                kvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kvVar.getParent() instanceof View) {
                    ((View) kvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                ov ovVar = (ov) this.f25666b;
                ovVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ovVar.v = floatValue3;
                TextView textView = ovVar.f27199c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - ovVar.v);
                textView.setAlpha(1.0f - ovVar.v);
                TextView textView2 = ovVar.d;
                textView2.setScaleX(ovVar.v);
                textView2.setScaleY(ovVar.v);
                textView2.setAlpha(ovVar.v);
                return;
            case 19:
                zv zvVar = (zv) this.f25666b;
                zvVar.getClass();
                zvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.d();
                return;
            case 20:
                bw bwVar = (bw) this.f25666b;
                bwVar.getClass();
                bwVar.f23109r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.invalidate();
                bwVar.requestLayout();
                bwVar.c();
                bwVar.f23110s.f30650b.invalidate();
                return;
            case 21:
                uy uyVar = (uy) this.f25666b;
                uyVar.getClass();
                uyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uyVar.invalidate();
                return;
            case 22:
                yy yyVar = (yy) this.f25666b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.f30729w = floatValue4;
                View view2 = yyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = yyVar.f30728s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                l00 l00Var = ((d00) this.f25666b).F;
                l00Var.F.invalidate();
                l00Var.invalidate();
                return;
            case 24:
                t00 t00Var = (t00) this.f25666b;
                t00Var.getClass();
                t00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                return;
            case 25:
                a30 a30Var = (a30) this.f25666b;
                y20 y20Var = a30Var.f22572a;
                if (!a30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a30Var.f22575b0 = floatValue5;
                    a30Var.U.setPinnedProgress(floatValue5);
                    y20Var.setScaleX(1.0f - (a30Var.f22575b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.f22575b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                c60 c60Var = (c60) this.f25666b;
                if (c60Var.f23239s0) {
                    Camera2Session camera2Session = c60Var.f23244w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = c60Var.f23240t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                m70.P((m70) this.f25666b, valueAnimator);
                return;
            case 28:
                m70 m70Var = ((l70) this.f25666b).e;
                m70Var.f26385k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m70.U(m70Var).invalidate();
                return;
            default:
                y70 y70Var = (y70) this.f25666b;
                y70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w70 w70Var = y70Var.f30558x;
                if (w70Var != null) {
                    w70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
