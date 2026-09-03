package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class f6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24807a;
    public final Object f24808b;

    public f6(Object obj, int i10) {
        this.f24807a = i10;
        this.f24808b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24807a) {
            case 0:
                j6 j6Var = (j6) this.f24808b;
                j6Var.getClass();
                j6Var.f25855m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                r6 r6Var = (r6) this.f24808b;
                r6Var.f28409a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                r6Var.invalidate();
                return;
            case 2:
                c8 c8Var = (c8) this.f24808b;
                c8Var.G.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                w8 w8Var = (w8) this.f24808b;
                w8Var.getClass();
                w8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                c9 c9Var = (c9) this.f24808b;
                c9Var.getClass();
                c9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.f();
                return;
            case 5:
                r9 r9Var = (r9) this.f24808b;
                r9Var.getClass();
                r9Var.f28431g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                return;
            case 6:
                fa faVar = (fa) this.f24808b;
                faVar.getClass();
                faVar.f24842f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.f24840b.invalidate();
                return;
            case 7:
                rc rcVar = (rc) this.f24808b;
                rcVar.getClass();
                rcVar.f28455i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.b();
                return;
            case 8:
                lg lgVar = (lg) this.f24808b;
                lgVar.getClass();
                lgVar.f26656a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li liVar = ((rh) this.f24808b).e;
                mh mhVar = liVar.f26742u1;
                mhVar.setAlpha(1.0f - floatValue);
                liVar.B1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                liVar.C1 = dp;
                mhVar.setTranslationY(dp);
                return;
            case 10:
                mh mhVar2 = (mh) this.f24808b;
                li liVar2 = mhVar2.f27058b;
                liVar2.S1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                liVar2.f26759z0.invalidate();
                liVar2.A0.invalidate();
                mhVar2.invalidate();
                return;
            case 11:
                km kmVar = (km) this.f24808b;
                kmVar.getClass();
                kmVar.f26338l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmVar.O.f26801z.invalidate();
                return;
            case 12:
                oo ooVar = (oo) this.f24808b;
                ooVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ooVar.d = floatValue2;
                ooVar.setShown(floatValue2);
                ooVar.a(false);
                return;
            case 13:
                jp jpVar = (jp) this.f24808b;
                jpVar.getClass();
                jpVar.f26011d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * jpVar.f26011d0);
                return;
            case 14:
                sq sqVar = (sq) this.f24808b;
                sqVar.getClass();
                sqVar.f28783l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = sqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                lr lrVar = (lr) this.f24808b;
                lrVar.getClass();
                lrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lrVar.invalidateSelf();
                return;
            case 16:
                lv.p((lv) this.f24808b, valueAnimator);
                return;
            case 17:
                cv cvVar = (cv) this.f24808b;
                cvVar.getClass();
                cvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (cvVar.getParent() instanceof View) {
                    ((View) cvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                gv gvVar = (gv) this.f24808b;
                gvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gvVar.v = floatValue3;
                TextView textView = gvVar.f25241c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - gvVar.v);
                textView.setAlpha(1.0f - gvVar.v);
                TextView textView2 = gvVar.d;
                textView2.setScaleX(gvVar.v);
                textView2.setScaleY(gvVar.v);
                textView2.setAlpha(gvVar.v);
                return;
            case 19:
                sv svVar = (sv) this.f24808b;
                svVar.getClass();
                svVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                svVar.d();
                return;
            case 20:
                uv uvVar = (uv) this.f24808b;
                uvVar.getClass();
                uvVar.f29299r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uvVar.invalidate();
                uvVar.requestLayout();
                uvVar.c();
                uvVar.f29300s.f28998b.invalidate();
                return;
            case 21:
                sy syVar = (sy) this.f24808b;
                syVar.getClass();
                syVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                syVar.invalidate();
                return;
            case 22:
                wy wyVar = (wy) this.f24808b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wyVar.f30374w = floatValue4;
                View view2 = wyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ah.e eVar = wyVar.f30373s;
                if (eVar != null) {
                    eVar.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((d00) this.f24808b).F;
                k00Var.C.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                t00 t00Var = (t00) this.f24808b;
                t00Var.getClass();
                t00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                return;
            case 25:
                b30 b30Var = (b30) this.f24808b;
                z20 z20Var = b30Var.f23532a;
                if (!b30Var.C) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    b30Var.Y = floatValue5;
                    b30Var.R.setPinnedProgress(floatValue5);
                    z20Var.setScaleX(1.0f - (b30Var.Y * 0.6f));
                    z20Var.setScaleY(1.0f - (b30Var.Y * 0.6f));
                    if (b30Var.T) {
                        b30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                y50 y50Var = (y50) this.f24808b;
                if (y50Var.f30885k0) {
                    Camera2Session camera2Session = y50Var.f30889o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = y50Var.f30886l0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                d70.P((d70) this.f24808b, valueAnimator);
                return;
            case 28:
                d70 d70Var = ((c70) this.f24808b).e;
                d70Var.f24195h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d70.U(d70Var).invalidate();
                return;
            default:
                p70 p70Var = (p70) this.f24808b;
                p70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n70 n70Var = p70Var.f27781x;
                if (n70Var != null) {
                    n70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
