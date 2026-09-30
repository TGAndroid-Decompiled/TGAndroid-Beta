package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25653a;
    public final Object f25654b;

    public k6(Object obj, int i10) {
        this.f25653a = i10;
        this.f25654b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25653a) {
            case 0:
                o6 o6Var = (o6) this.f25654b;
                o6Var.getClass();
                o6Var.f26999m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f25654b;
                w6Var.f29839a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f25654b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f25654b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f25654b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f25654b;
                y9Var.getClass();
                y9Var.f30683g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                oa oaVar = (oa) this.f25654b;
                oaVar.getClass();
                oaVar.f27033f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f27031b.invalidate();
                return;
            case 7:
                zc zcVar = (zc) this.f25654b;
                zcVar.getClass();
                zcVar.f30949i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                return;
            case 8:
                wg wgVar = (wg) this.f25654b;
                wgVar.getClass();
                wgVar.f29943d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi xiVar = ((di) this.f25654b).e;
                zh zhVar = xiVar.f30328x1;
                zhVar.setAlpha(1.0f - floatValue);
                xiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                xiVar.F1 = dp;
                zhVar.setTranslationY(dp);
                return;
            case 10:
                zh zhVar2 = (zh) this.f25654b;
                xi xiVar2 = zhVar2.f30969b;
                xiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xiVar2.C0.invalidate();
                xiVar2.D0.invalidate();
                zhVar2.invalidate();
                return;
            case 11:
                qm qmVar = (qm) this.f25654b;
                qmVar.getClass();
                qmVar.f27681l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.O.f28086z.invalidate();
                return;
            case 12:
                wo woVar = (wo) this.f25654b;
                woVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                woVar.d = floatValue2;
                woVar.setShown(floatValue2);
                woVar.a(false);
                return;
            case 13:
                pp ppVar = (pp) this.f25654b;
                ppVar.getClass();
                ppVar.f27432g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.f27432g0);
                return;
            case 14:
                yq yqVar = (yq) this.f25654b;
                yqVar.getClass();
                yqVar.f30783l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = yqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                sr srVar = (sr) this.f25654b;
                srVar.getClass();
                srVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                srVar.invalidateSelf();
                return;
            case 16:
                vv.p((vv) this.f25654b, valueAnimator);
                return;
            case 17:
                mv mvVar = (mv) this.f25654b;
                mvVar.getClass();
                mvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mvVar.getParent() instanceof View) {
                    ((View) mvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                qv qvVar = (qv) this.f25654b;
                qvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qvVar.v = floatValue3;
                TextView textView = qvVar.f27730c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - qvVar.v);
                textView.setAlpha(1.0f - qvVar.v);
                TextView textView2 = qvVar.d;
                textView2.setScaleX(qvVar.v);
                textView2.setScaleY(qvVar.v);
                textView2.setAlpha(qvVar.v);
                return;
            case 19:
                bw bwVar = (bw) this.f25654b;
                bwVar.getClass();
                bwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.d();
                return;
            case 20:
                dw dwVar = (dw) this.f25654b;
                dwVar.getClass();
                dwVar.f23742r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.invalidate();
                dwVar.requestLayout();
                dwVar.c();
                dwVar.f23743s.f22984b.invalidate();
                return;
            case 21:
                wy wyVar = (wy) this.f25654b;
                wyVar.getClass();
                wyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wyVar.invalidate();
                return;
            case 22:
                az azVar = (az) this.f25654b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.f22741w = floatValue4;
                View view2 = azVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = azVar.f22740s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                n00 n00Var = ((f00) this.f25654b).F;
                n00Var.F.invalidate();
                n00Var.invalidate();
                return;
            case 24:
                v00 v00Var = (v00) this.f25654b;
                v00Var.getClass();
                v00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.invalidate();
                return;
            case 25:
                d30 d30Var = (d30) this.f25654b;
                b30 b30Var = d30Var.f23499a;
                if (!d30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    d30Var.f23502b0 = floatValue5;
                    d30Var.U.setPinnedProgress(floatValue5);
                    b30Var.setScaleX(1.0f - (d30Var.f23502b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.f23502b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                f60 f60Var = (f60) this.f25654b;
                if (f60Var.f24209s0) {
                    Camera2Session camera2Session = f60Var.f24214w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = f60Var.f24210t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                p70.P((p70) this.f25654b, valueAnimator);
                return;
            case 28:
                p70 p70Var = ((o70) this.f25654b).e;
                p70Var.f27273k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p70.U(p70Var).invalidate();
                return;
            default:
                b80 b80Var = (b80) this.f25654b;
                b80Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z70 z70Var = b80Var.f22876x;
                if (z70Var != null) {
                    z70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
