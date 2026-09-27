package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25637a;
    public final Object f25638b;

    public k6(Object obj, int i10) {
        this.f25637a = i10;
        this.f25638b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25637a) {
            case 0:
                o6 o6Var = (o6) this.f25638b;
                o6Var.getClass();
                o6Var.f26991m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25638b;
                w6Var.f29854a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25638b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25638b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25638b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25638b;
                y9Var.getClass();
                y9Var.f30633g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25638b;
                naVar.getClass();
                naVar.f26758f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26756b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25638b;
                ycVar.getClass();
                ycVar.f30650i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f25638b;
                vgVar.getClass();
                vgVar.f29116d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ((bi) this.f25638b).e;
                vh vhVar = wiVar.f30020x1;
                vhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                vhVar.setTranslationY(dp);
                return;
            case 10:
                vh vhVar2 = (vh) this.f25638b;
                wi wiVar2 = vhVar2.f29135b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                vhVar2.invalidate();
                return;
            case 11:
                pm pmVar = (pm) this.f25638b;
                pmVar.getClass();
                pmVar.f27399l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.O.f27803z.invalidate();
                return;
            case 12:
                vo voVar = (vo) this.f25638b;
                voVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue2;
                voVar.setShown(floatValue2);
                voVar.a(false);
                return;
            case 13:
                op opVar = (op) this.f25638b;
                opVar.getClass();
                opVar.f27169g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.f27169g0);
                return;
            case 14:
                xq xqVar = (xq) this.f25638b;
                xqVar.getClass();
                xqVar.f30459l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = xqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                rr rrVar = (rr) this.f25638b;
                rrVar.getClass();
                rrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rrVar.invalidateSelf();
                return;
            case 16:
                uv.p((uv) this.f25638b, valueAnimator);
                return;
            case 17:
                lv lvVar = (lv) this.f25638b;
                lvVar.getClass();
                lvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lvVar.getParent() instanceof View) {
                    ((View) lvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                pv pvVar = (pv) this.f25638b;
                pvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pvVar.v = floatValue3;
                TextView textView = pvVar.f27467c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - pvVar.v);
                textView.setAlpha(1.0f - pvVar.v);
                TextView textView2 = pvVar.d;
                textView2.setScaleX(pvVar.v);
                textView2.setScaleY(pvVar.v);
                textView2.setAlpha(pvVar.v);
                return;
            case 19:
                aw awVar = (aw) this.f25638b;
                awVar.getClass();
                awVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.d();
                return;
            case 20:
                cw cwVar = (cw) this.f25638b;
                cwVar.getClass();
                cwVar.f23421r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.invalidate();
                cwVar.requestLayout();
                cwVar.c();
                cwVar.f23422s.f22722b.invalidate();
                return;
            case 21:
                vy vyVar = (vy) this.f25638b;
                vyVar.getClass();
                vyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vyVar.invalidate();
                return;
            case 22:
                zy zyVar = (zy) this.f25638b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyVar.f30997w = floatValue4;
                View view2 = zyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = zyVar.f30996s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                m00 m00Var = ((e00) this.f25638b).F;
                m00Var.F.invalidate();
                m00Var.invalidate();
                return;
            case 24:
                u00 u00Var = (u00) this.f25638b;
                u00Var.getClass();
                u00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 25:
                c30 c30Var = (c30) this.f25638b;
                a30 a30Var = c30Var.f23199a;
                if (!c30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c30Var.f23202b0 = floatValue5;
                    c30Var.U.setPinnedProgress(floatValue5);
                    a30Var.setScaleX(1.0f - (c30Var.f23202b0 * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.f23202b0 * 0.6f));
                    if (c30Var.W) {
                        c30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                e60 e60Var = (e60) this.f25638b;
                if (e60Var.f23925s0) {
                    Camera2Session camera2Session = e60Var.f23930w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = e60Var.f23926t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                o70.P((o70) this.f25638b, valueAnimator);
                return;
            case 28:
                o70 o70Var = ((n70) this.f25638b).e;
                o70Var.f27022k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o70.U(o70Var).invalidate();
                return;
            default:
                a80 a80Var = (a80) this.f25638b;
                a80Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70 y70Var = a80Var.f22610x;
                if (y70Var != null) {
                    y70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
