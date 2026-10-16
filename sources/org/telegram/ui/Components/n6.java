package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class n6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27285a;
    public final Object f27286b;

    public n6(Object obj, int i10) {
        this.f27285a = i10;
        this.f27286b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27285a) {
            case 0:
                r6 r6Var = (r6) this.f27286b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.f28448q = floatValue;
                TimeInterpolator timeInterpolator = r6Var.f28454x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                r6Var.f28449r = floatValue;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f28436b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                z6 z6Var = (z6) this.f27286b;
                z6Var.f31463a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z6Var.invalidate();
                return;
            case 2:
                m8 m8Var = (m8) this.f27286b;
                m8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                m8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                h9 h9Var = (h9) this.f27286b;
                h9Var.getClass();
                h9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                m9 m9Var = (m9) this.f27286b;
                m9Var.getClass();
                m9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.f();
                return;
            case 5:
                ba baVar = (ba) this.f27286b;
                baVar.getClass();
                baVar.f23425g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.invalidateSelf();
                return;
            case 6:
                pa paVar = (pa) this.f27286b;
                paVar.getClass();
                paVar.f27941f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f27939b.invalidate();
                return;
            case 7:
                ad adVar = (ad) this.f27286b;
                adVar.getClass();
                adVar.f23202j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.b();
                return;
            case 8:
                wg wgVar = (wg) this.f27286b;
                wgVar.getClass();
                wgVar.f30552d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f27286b).e;
                xh xhVar = viVar.A1;
                xhVar.setAlpha(1.0f - floatValue2);
                viVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                viVar.I1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f27286b;
                vi viVar2 = xhVar2.f30935b;
                viVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.F0.invalidate();
                viVar2.G0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                ((cl) this.f27286b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                bn bnVar = (bn) this.f27286b;
                bnVar.getClass();
                bnVar.f23504l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.O.f23826z.invalidate();
                return;
            case 13:
                gp gpVar = (gp) this.f27286b;
                gpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gpVar.d = floatValue3;
                gpVar.setShown(floatValue3);
                gpVar.a(false);
                return;
            case 14:
                zp zpVar = (zp) this.f27286b;
                zpVar.getClass();
                zpVar.f31652g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.f31652g0);
                return;
            case 15:
                ir irVar = (ir) this.f27286b;
                irVar.getClass();
                irVar.f25725l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = irVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                ds dsVar = (ds) this.f27286b;
                dsVar.getClass();
                dsVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dsVar.invalidateSelf();
                return;
            case 17:
                ew.r((ew) this.f27286b, valueAnimator);
                return;
            case 18:
                vv vvVar = (vv) this.f27286b;
                vvVar.getClass();
                vvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (vvVar.getParent() instanceof View) {
                    ((View) vvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                zv zvVar = (zv) this.f27286b;
                zvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.v = floatValue4;
                TextView textView = zvVar.f31691c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - zvVar.v);
                textView.setAlpha(1.0f - zvVar.v);
                TextView textView2 = zvVar.d;
                textView2.setScaleX(zvVar.v);
                textView2.setScaleY(zvVar.v);
                textView2.setAlpha(zvVar.v);
                return;
            case 20:
                kw kwVar = (kw) this.f27286b;
                kwVar.getClass();
                kwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kwVar.d();
                return;
            case 21:
                mw mwVar = (mw) this.f27286b;
                mwVar.getClass();
                mwVar.f27232r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mwVar.invalidate();
                mwVar.requestLayout();
                mwVar.c();
                mwVar.f27233s.f27691b.invalidate();
                return;
            case 22:
                ez ezVar = (ez) this.f27286b;
                ezVar.getClass();
                ezVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.invalidate();
                return;
            case 23:
                iz izVar = (iz) this.f27286b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                izVar.f25827w = floatValue5;
                View view2 = izVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ah.v vVar = izVar.f25826s;
                if (vVar != null) {
                    vVar.invalidate();
                    return;
                }
                return;
            case 24:
                w00 w00Var = ((o00) this.f27286b).F;
                w00Var.F.invalidate();
                w00Var.invalidate();
                return;
            case 25:
                e10 e10Var = (e10) this.f27286b;
                e10Var.getClass();
                e10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e10Var.invalidate();
                return;
            case 26:
                m30 m30Var = (m30) this.f27286b;
                k30 k30Var = m30Var.f26895a;
                if (!m30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    m30Var.f26898b0 = floatValue6;
                    m30Var.U.setPinnedProgress(floatValue6);
                    k30Var.setScaleX(1.0f - (m30Var.f26898b0 * 0.6f));
                    k30Var.setScaleY(1.0f - (m30Var.f26898b0 * 0.6f));
                    if (m30Var.W) {
                        m30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                p60 p60Var = (p60) this.f27286b;
                if (p60Var.f27883s0) {
                    Camera2Session camera2Session = p60Var.f27888w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = p60Var.f27884t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                z70.Q((z70) this.f27286b, valueAnimator);
                return;
            default:
                z70 z70Var = ((y70) this.f27286b).e;
                z70Var.f31483k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z70.V(z70Var).invalidate();
                return;
        }
    }
}
