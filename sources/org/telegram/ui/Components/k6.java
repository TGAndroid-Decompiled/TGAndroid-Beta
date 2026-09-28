package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25609a;
    public final Object f25610b;

    public k6(Object obj, int i10) {
        this.f25609a = i10;
        this.f25610b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25609a) {
            case 0:
                o6 o6Var = (o6) this.f25610b;
                o6Var.getClass();
                o6Var.f26956m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25610b;
                w6Var.f29816a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25610b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25610b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25610b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25610b;
                y9Var.getClass();
                y9Var.f30627g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                na naVar = (na) this.f25610b;
                naVar.getClass();
                naVar.f26716f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f26714b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25610b;
                ycVar.getClass();
                ycVar.f30642i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                vg vgVar = (vg) this.f25610b;
                vgVar.getClass();
                vgVar.f29096d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ((ci) this.f25610b).e;
                yh yhVar = wiVar.f30000x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                return;
            case 10:
                yh yhVar2 = (yh) this.f25610b;
                wi wiVar2 = yhVar2.f30662b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                return;
            case 11:
                pm pmVar = (pm) this.f25610b;
                pmVar.getClass();
                pmVar.f27375l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.O.f27789z.invalidate();
                return;
            case 12:
                vo voVar = (vo) this.f25610b;
                voVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue2;
                voVar.setShown(floatValue2);
                voVar.a(false);
                return;
            case 13:
                op opVar = (op) this.f25610b;
                opVar.getClass();
                opVar.f27146g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.f27146g0);
                return;
            case 14:
                xq xqVar = (xq) this.f25610b;
                xqVar.getClass();
                xqVar.f30454l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = xqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                rr rrVar = (rr) this.f25610b;
                rrVar.getClass();
                rrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rrVar.invalidateSelf();
                return;
            case 16:
                uv.p((uv) this.f25610b, valueAnimator);
                return;
            case 17:
                lv lvVar = (lv) this.f25610b;
                lvVar.getClass();
                lvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lvVar.getParent() instanceof View) {
                    ((View) lvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                pv pvVar = (pv) this.f25610b;
                pvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pvVar.v = floatValue3;
                TextView textView = pvVar.f27424c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - pvVar.v);
                textView.setAlpha(1.0f - pvVar.v);
                TextView textView2 = pvVar.d;
                textView2.setScaleX(pvVar.v);
                textView2.setScaleY(pvVar.v);
                textView2.setAlpha(pvVar.v);
                return;
            case 19:
                aw awVar = (aw) this.f25610b;
                awVar.getClass();
                awVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.d();
                return;
            case 20:
                cw cwVar = (cw) this.f25610b;
                cwVar.getClass();
                cwVar.f23407r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.invalidate();
                cwVar.requestLayout();
                cwVar.c();
                cwVar.f23408s.f22699b.invalidate();
                return;
            case 21:
                vy vyVar = (vy) this.f25610b;
                vyVar.getClass();
                vyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vyVar.invalidate();
                return;
            case 22:
                zy zyVar = (zy) this.f25610b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyVar.f30995w = floatValue4;
                View view2 = zyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = zyVar.f30994s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                m00 m00Var = ((e00) this.f25610b).F;
                m00Var.F.invalidate();
                m00Var.invalidate();
                return;
            case 24:
                u00 u00Var = (u00) this.f25610b;
                u00Var.getClass();
                u00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 25:
                c30 c30Var = (c30) this.f25610b;
                a30 a30Var = c30Var.f23181a;
                if (!c30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c30Var.f23184b0 = floatValue5;
                    c30Var.U.setPinnedProgress(floatValue5);
                    a30Var.setScaleX(1.0f - (c30Var.f23184b0 * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.f23184b0 * 0.6f));
                    if (c30Var.W) {
                        c30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                e60 e60Var = (e60) this.f25610b;
                if (e60Var.f23910s0) {
                    Camera2Session camera2Session = e60Var.f23915w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = e60Var.f23911t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                o70.P((o70) this.f25610b, valueAnimator);
                return;
            case 28:
                o70 o70Var = ((n70) this.f25610b).e;
                o70Var.f26987k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o70.U(o70Var).invalidate();
                return;
            default:
                a80 a80Var = (a80) this.f25610b;
                a80Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70 y70Var = a80Var.f22606x;
                if (y70Var != null) {
                    y70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
