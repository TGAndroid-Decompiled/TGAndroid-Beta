package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class n6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30753a;
    public final Object f30754b;

    public n6(Object obj, int i10) {
        this.f30753a = i10;
        this.f30754b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30753a) {
            case 0:
                r6 r6Var = (r6) this.f30754b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.f32155q = floatValue;
                TimeInterpolator timeInterpolator = r6Var.f32161x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                r6Var.f32156r = floatValue;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f32143b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                z6 z6Var = (z6) this.f30754b;
                z6Var.f35251a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z6Var.invalidate();
                return;
            case 2:
                m8 m8Var = (m8) this.f30754b;
                m8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                m8Var.L.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                g9 g9Var = (g9) this.f30754b;
                g9Var.getClass();
                g9Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                l9 l9Var = (l9) this.f30754b;
                l9Var.getClass();
                l9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
                return;
            case 5:
                ba baVar = (ba) this.f30754b;
                baVar.getClass();
                baVar.f26772g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.invalidateSelf();
                return;
            case 6:
                pa paVar = (pa) this.f30754b;
                paVar.getClass();
                paVar.f31537f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f31535b.invalidate();
                return;
            case 7:
                xc xcVar = (xc) this.f30754b;
                xcVar.getClass();
                xcVar.f34726j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.b();
                return;
            case 8:
                ld ldVar = ((md) this.f30754b).f30504c;
                ldVar.f30234n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ldVar.invalidate();
                return;
            case 9:
                vg vgVar = (vg) this.f30754b;
                vgVar.getClass();
                vgVar.f33722d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 10:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = ((zh) this.f30754b).e;
                th thVar = tiVar.A1;
                thVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                thVar.setTranslationY(dp);
                return;
            case 11:
                th thVar2 = (th) this.f30754b;
                ti tiVar2 = thVar2.f32962b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                thVar2.invalidate();
                return;
            case 12:
                ((al) this.f30754b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                zm zmVar = (zm) this.f30754b;
                zmVar.getClass();
                zmVar.f35385l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zmVar.O.f26633z.invalidate();
                return;
            case 14:
                gp gpVar = (gp) this.f30754b;
                gpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gpVar.d = floatValue3;
                gpVar.setShown(floatValue3);
                gpVar.a(false);
                return;
            case 15:
                zp zpVar = (zp) this.f30754b;
                zpVar.getClass();
                zpVar.f35416f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zpVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.f35416f0);
                return;
            case 16:
                gr grVar = (gr) this.f30754b;
                grVar.getClass();
                grVar.f28729l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = grVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                aw.p((aw) this.f30754b, valueAnimator);
                return;
            case 18:
                rv rvVar = (rv) this.f30754b;
                rvVar.getClass();
                rvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rvVar.getParent() instanceof View) {
                    ((View) rvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                vv vvVar = (vv) this.f30754b;
                vvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.v = floatValue4;
                TextView textView = vvVar.f34375c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - vvVar.v);
                textView.setAlpha(1.0f - vvVar.v);
                TextView textView2 = vvVar.d;
                textView2.setScaleX(vvVar.v);
                textView2.setScaleY(vvVar.v);
                textView2.setAlpha(vvVar.v);
                return;
            case 20:
                gw gwVar = (gw) this.f30754b;
                gwVar.getClass();
                gwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.d();
                return;
            case 21:
                iw iwVar = (iw) this.f30754b;
                iwVar.getClass();
                iwVar.f29428r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iwVar.invalidate();
                iwVar.requestLayout();
                iwVar.c();
                iwVar.f29429s.f33435b.invalidate();
                return;
            case 22:
                bz bzVar = (bz) this.f30754b;
                bzVar.getClass();
                bzVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bzVar.invalidate();
                return;
            case 23:
                fz fzVar = (fz) this.f30754b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fzVar.f28329w = floatValue5;
                View view2 = fzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                bh.p pVar = fzVar.f28328s;
                if (pVar != null) {
                    pVar.invalidate();
                    return;
                }
                return;
            case 24:
                s00 s00Var = ((l00) this.f30754b).F;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 25:
                a10 a10Var = (a10) this.f30754b;
                a10Var.getClass();
                a10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 26:
                k30 k30Var = (k30) this.f30754b;
                h30 h30Var = k30Var.f29837a;
                if (!k30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    k30Var.f29840b0 = floatValue6;
                    k30Var.U.setPinnedProgress(floatValue6);
                    h30Var.setScaleX(1.0f - (k30Var.f29840b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (k30Var.f29840b0 * 0.6f));
                    if (k30Var.W) {
                        k30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                p60 p60Var = (p60) this.f30754b;
                if (p60Var.f31497r0) {
                    Camera2Session camera2Session = p60Var.f31502v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = p60Var.f31499s0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                z70.P((z70) this.f30754b, valueAnimator);
                return;
            default:
                z70 z70Var = ((y70) this.f30754b).e;
                z70Var.f35271k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z70.U(z70Var).invalidate();
                return;
        }
    }
}
