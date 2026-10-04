package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27963a;
    public final Object f27964b;

    public k6(Object obj, int i10) {
        this.f27963a = i10;
        this.f27964b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27963a) {
            case 0:
                o6 o6Var = (o6) this.f27964b;
                o6Var.getClass();
                o6Var.f29248m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                w6 w6Var = (w6) this.f27964b;
                w6Var.f32468a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f27964b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                e9 e9Var = (e9) this.f27964b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                j9 j9Var = (j9) this.f27964b;
                j9Var.getClass();
                j9Var.f27663e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                return;
            case 5:
                y9 y9Var = (y9) this.f27964b;
                y9Var.getClass();
                y9Var.f33117g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                return;
            case 6:
                oa oaVar = (oa) this.f27964b;
                oaVar.getClass();
                oaVar.f29307f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f29304b.invalidate();
                return;
            case 7:
                zc zcVar = (zc) this.f27964b;
                zcVar.getClass();
                zcVar.f33473i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                return;
            case 8:
                wg wgVar = (wg) this.f27964b;
                wgVar.getClass();
                wgVar.f32537d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi xiVar = ((ci) this.f27964b).f25379e;
                wh whVar = xiVar.f32870x1;
                whVar.setAlpha(1.0f - floatValue);
                xiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                xiVar.F1 = dp;
                whVar.setTranslationY(dp);
                return;
            case 10:
                wh whVar2 = (wh) this.f27964b;
                xi xiVar2 = whVar2.f32557b;
                xiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xiVar2.C0.invalidate();
                xiVar2.D0.invalidate();
                whVar2.invalidate();
                return;
            case 11:
                qm qmVar = (qm) this.f27964b;
                qmVar.getClass();
                qmVar.f30083l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.O.f30465z.invalidate();
                return;
            case 12:
                wo woVar = (wo) this.f27964b;
                woVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                woVar.d = floatValue2;
                woVar.setShown(floatValue2);
                woVar.a(false);
                return;
            case 13:
                pp ppVar = (pp) this.f27964b;
                ppVar.getClass();
                ppVar.f29691g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.f29691g0);
                return;
            case 14:
                yq yqVar = (yq) this.f27964b;
                yqVar.getClass();
                yqVar.f33219l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = yqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                sr srVar = (sr) this.f27964b;
                srVar.getClass();
                srVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                srVar.invalidateSelf();
                return;
            case 16:
                wv.p((wv) this.f27964b, valueAnimator);
                return;
            case 17:
                nv nvVar = (nv) this.f27964b;
                nvVar.getClass();
                nvVar.f29069e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nvVar.getParent() instanceof View) {
                    ((View) nvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                rv rvVar = (rv) this.f27964b;
                rvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rvVar.v = floatValue3;
                TextView textView = rvVar.f30507c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - rvVar.v);
                textView.setAlpha(1.0f - rvVar.v);
                TextView textView2 = rvVar.d;
                textView2.setScaleX(rvVar.v);
                textView2.setScaleY(rvVar.v);
                textView2.setAlpha(rvVar.v);
                return;
            case 19:
                cw cwVar = (cw) this.f27964b;
                cwVar.getClass();
                cwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.d();
                return;
            case 20:
                ew ewVar = (ew) this.f27964b;
                ewVar.getClass();
                ewVar.f26160r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.invalidate();
                ewVar.requestLayout();
                ewVar.c();
                ewVar.f26161s.f26089b.invalidate();
                return;
            case 21:
                wy wyVar = (wy) this.f27964b;
                wyVar.getClass();
                wyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wyVar.invalidate();
                return;
            case 22:
                az azVar = (az) this.f27964b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.f24719w = floatValue4;
                View view2 = azVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.m6 m6Var = azVar.f24718s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 23:
                n00 n00Var = ((f00) this.f27964b).F;
                n00Var.F.invalidate();
                n00Var.invalidate();
                return;
            case 24:
                v00 v00Var = (v00) this.f27964b;
                v00Var.getClass();
                v00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.invalidate();
                return;
            case 25:
                d30 d30Var = (d30) this.f27964b;
                b30 b30Var = d30Var.f25533a;
                if (!d30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    d30Var.f25536b0 = floatValue5;
                    d30Var.U.setPinnedProgress(floatValue5);
                    b30Var.setScaleX(1.0f - (d30Var.f25536b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.f25536b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                f60 f60Var = (f60) this.f27964b;
                if (f60Var.f26322s0) {
                    Camera2Session camera2Session = f60Var.f26327w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = f60Var.f26323t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                p70.N((p70) this.f27964b, valueAnimator);
                return;
            case 28:
                p70 p70Var = ((o70) this.f27964b).f29272e;
                p70Var.f29539k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p70.S(p70Var).invalidate();
                return;
            default:
                b80 b80Var = (b80) this.f27964b;
                b80Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z70 z70Var = b80Var.f24848x;
                if (z70Var != null) {
                    z70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
