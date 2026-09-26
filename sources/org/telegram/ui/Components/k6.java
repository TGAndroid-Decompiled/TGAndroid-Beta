package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25638a;
    public final Object f25639b;

    public k6(Object obj, int i10) {
        this.f25638a = i10;
        this.f25639b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25638a) {
            case 0:
                o6 o6Var = (o6) this.f25639b;
                o6Var.getClass();
                o6Var.f26970m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25639b;
                w6Var.f29909a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25639b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25639b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25639b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25639b;
                y9Var.getClass();
                y9Var.f30606g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25639b;
                naVar.getClass();
                naVar.f26728f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26726b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25639b;
                ycVar.getClass();
                ycVar.f30624i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f25639b;
                vgVar.getClass();
                vgVar.f29084d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ((ci) this.f25639b).e;
                yh yhVar = wiVar.f30078x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                return;
            case 10:
                yh yhVar2 = (yh) this.f25639b;
                wi wiVar2 = yhVar2.f30643b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                return;
            case 11:
                pm pmVar = (pm) this.f25639b;
                pmVar.getClass();
                pmVar.f27431l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.O.f27736z.invalidate();
                return;
            case 12:
                vo voVar = (vo) this.f25639b;
                voVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue2;
                voVar.setShown(floatValue2);
                voVar.a(false);
                return;
            case 13:
                op opVar = (op) this.f25639b;
                opVar.getClass();
                opVar.f27076g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.f27076g0);
                return;
            case 14:
                xq xqVar = (xq) this.f25639b;
                xqVar.getClass();
                xqVar.f30441l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = xqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                rr rrVar = (rr) this.f25639b;
                rrVar.getClass();
                rrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rrVar.invalidateSelf();
                return;
            case 16:
                uv.p((uv) this.f25639b, valueAnimator);
                return;
            case 17:
                lv lvVar = (lv) this.f25639b;
                lvVar.getClass();
                lvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lvVar.getParent() instanceof View) {
                    ((View) lvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                pv pvVar = (pv) this.f25639b;
                pvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pvVar.v = floatValue3;
                TextView textView = pvVar.f27504c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - pvVar.v);
                textView.setAlpha(1.0f - pvVar.v);
                TextView textView2 = pvVar.d;
                textView2.setScaleX(pvVar.v);
                textView2.setScaleY(pvVar.v);
                textView2.setAlpha(pvVar.v);
                return;
            case 19:
                aw awVar = (aw) this.f25639b;
                awVar.getClass();
                awVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.d();
                return;
            case 20:
                cw cwVar = (cw) this.f25639b;
                cwVar.getClass();
                cwVar.f23419r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.invalidate();
                cwVar.requestLayout();
                cwVar.c();
                cwVar.f23420s.f30927b.invalidate();
                return;
            case 21:
                vy vyVar = (vy) this.f25639b;
                vyVar.getClass();
                vyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vyVar.invalidate();
                return;
            case 22:
                zy zyVar = (zy) this.f25639b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyVar.f31006w = floatValue4;
                View view2 = zyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = zyVar.f31005s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                m00 m00Var = ((e00) this.f25639b).F;
                m00Var.F.invalidate();
                m00Var.invalidate();
                return;
            case 24:
                u00 u00Var = (u00) this.f25639b;
                u00Var.getClass();
                u00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 25:
                b30 b30Var = (b30) this.f25639b;
                z20 z20Var = b30Var.f22876a;
                if (!b30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    b30Var.f22879b0 = floatValue5;
                    b30Var.U.setPinnedProgress(floatValue5);
                    z20Var.setScaleX(1.0f - (b30Var.f22879b0 * 0.6f));
                    z20Var.setScaleY(1.0f - (b30Var.f22879b0 * 0.6f));
                    if (b30Var.W) {
                        b30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                d60 d60Var = (d60) this.f25639b;
                if (d60Var.f23577s0) {
                    Camera2Session camera2Session = d60Var.f23582w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = d60Var.f23578t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                n70.P((n70) this.f25639b, valueAnimator);
                return;
            case 28:
                n70 n70Var = ((m70) this.f25639b).e;
                n70Var.f26698k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n70.U(n70Var).invalidate();
                return;
            default:
                z70 z70Var = (z70) this.f25639b;
                z70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x70 x70Var = z70Var.f30843x;
                if (x70Var != null) {
                    x70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
