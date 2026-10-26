package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class n6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30847a;
    public final Object f30848b;

    public n6(Object obj, int i10) {
        this.f30847a = i10;
        this.f30848b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30847a) {
            case 0:
                r6 r6Var = (r6) this.f30848b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.f32134q = floatValue;
                TimeInterpolator timeInterpolator = r6Var.f32140x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                r6Var.f32135r = floatValue;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f32122b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                z6 z6Var = (z6) this.f30848b;
                z6Var.f35227a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z6Var.invalidate();
                return;
            case 2:
                m8 m8Var = (m8) this.f30848b;
                m8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                m8Var.L.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                g9 g9Var = (g9) this.f30848b;
                g9Var.getClass();
                g9Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                l9 l9Var = (l9) this.f30848b;
                l9Var.getClass();
                l9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
                return;
            case 5:
                ba baVar = (ba) this.f30848b;
                baVar.getClass();
                baVar.f26800g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.invalidateSelf();
                return;
            case 6:
                pa paVar = (pa) this.f30848b;
                paVar.getClass();
                paVar.f31479f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f31477b.invalidate();
                return;
            case 7:
                xc xcVar = (xc) this.f30848b;
                xcVar.getClass();
                xcVar.f34691j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.b();
                return;
            case 8:
                ld ldVar = ((md) this.f30848b).f30529c;
                ldVar.f30176n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ldVar.invalidate();
                return;
            case 9:
                vg vgVar = (vg) this.f30848b;
                vgVar.getClass();
                vgVar.f33652d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 10:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = ((zh) this.f30848b).e;
                th thVar = tiVar.A1;
                thVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                thVar.setTranslationY(dp);
                return;
            case 11:
                th thVar2 = (th) this.f30848b;
                ti tiVar2 = thVar2.f33001b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                thVar2.invalidate();
                return;
            case 12:
                ((al) this.f30848b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                zm zmVar = (zm) this.f30848b;
                zmVar.getClass();
                zmVar.f35365l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zmVar.O.f26577z.invalidate();
                return;
            case 14:
                fp fpVar = (fp) this.f30848b;
                fpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fpVar.d = floatValue3;
                fpVar.setShown(floatValue3);
                fpVar.a(false);
                return;
            case 15:
                yp ypVar = (yp) this.f30848b;
                ypVar.getClass();
                ypVar.f35100f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ypVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * ypVar.f35100f0);
                return;
            case 16:
                gr grVar = (gr) this.f30848b;
                grVar.getClass();
                grVar.f28691l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = grVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                aw.p((aw) this.f30848b, valueAnimator);
                return;
            case 18:
                rv rvVar = (rv) this.f30848b;
                rvVar.getClass();
                rvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rvVar.getParent() instanceof View) {
                    ((View) rvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                vv vvVar = (vv) this.f30848b;
                vvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.v = floatValue4;
                TextView textView = vvVar.f34266c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - vvVar.v);
                textView.setAlpha(1.0f - vvVar.v);
                TextView textView2 = vvVar.d;
                textView2.setScaleX(vvVar.v);
                textView2.setScaleY(vvVar.v);
                textView2.setAlpha(vvVar.v);
                return;
            case 20:
                gw gwVar = (gw) this.f30848b;
                gwVar.getClass();
                gwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.d();
                return;
            case 21:
                iw iwVar = (iw) this.f30848b;
                iwVar.getClass();
                iwVar.f29389r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iwVar.invalidate();
                iwVar.requestLayout();
                iwVar.c();
                iwVar.f29390s.f33114b.invalidate();
                return;
            case 22:
                bz bzVar = (bz) this.f30848b;
                bzVar.getClass();
                bzVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bzVar.invalidate();
                return;
            case 23:
                fz fzVar = (fz) this.f30848b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fzVar.f28343w = floatValue5;
                View view2 = fzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                bh.p pVar = fzVar.f28342s;
                if (pVar != null) {
                    pVar.invalidate();
                    return;
                }
                return;
            case 24:
                s00 s00Var = ((l00) this.f30848b).F;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 25:
                a10 a10Var = (a10) this.f30848b;
                a10Var.getClass();
                a10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 26:
                k30 k30Var = (k30) this.f30848b;
                h30 h30Var = k30Var.f29788a;
                if (!k30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    k30Var.f29791b0 = floatValue6;
                    k30Var.U.setPinnedProgress(floatValue6);
                    h30Var.setScaleX(1.0f - (k30Var.f29791b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (k30Var.f29791b0 * 0.6f));
                    if (k30Var.W) {
                        k30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                o60 o60Var = (o60) this.f30848b;
                if (o60Var.f31200s0) {
                    Camera2Session camera2Session = o60Var.f31205w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = o60Var.f31201t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                y70.P((y70) this.f30848b, valueAnimator);
                return;
            default:
                y70 y70Var = ((x70) this.f30848b).e;
                y70Var.f34954k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y70.U(y70Var).invalidate();
                return;
        }
    }
}
