package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class m6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28718a;
    public final Object f28719b;

    public m6(Object obj, int i10) {
        this.f28718a = i10;
        this.f28719b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28718a) {
            case 0:
                q6 q6Var = (q6) this.f28719b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.f30148q = floatValue;
                TimeInterpolator timeInterpolator = q6Var.f30154x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                q6Var.f30149r = floatValue;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.f30135b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                y6 y6Var = (y6) this.f28719b;
                y6Var.f33152a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y6Var.invalidate();
                return;
            case 2:
                l8 l8Var = (l8) this.f28719b;
                l8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                l8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                g9 g9Var = (g9) this.f28719b;
                g9Var.getClass();
                g9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                l9 l9Var = (l9) this.f28719b;
                l9Var.getClass();
                l9Var.f28291e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
                return;
            case 5:
                aa aaVar = (aa) this.f28719b;
                aaVar.getClass();
                aaVar.f24541g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.invalidateSelf();
                return;
            case 6:
                pa paVar = (pa) this.f28719b;
                paVar.getClass();
                paVar.f29810f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f29807b.invalidate();
                return;
            case 7:
                bd bdVar = (bd) this.f28719b;
                bdVar.getClass();
                bdVar.f24982j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.b();
                return;
            case 8:
                xg xgVar = (xg) this.f28719b;
                xgVar.getClass();
                xgVar.f32962d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yi yiVar = ((ei) this.f28719b).f26099e;
                ai aiVar = yiVar.A1;
                aiVar.setAlpha(1.0f - floatValue2);
                yiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                yiVar.I1 = dp;
                aiVar.setTranslationY(dp);
                return;
            case 10:
                ai aiVar2 = (ai) this.f28719b;
                yi yiVar2 = aiVar2.f24611b;
                yiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yiVar2.F0.invalidate();
                yiVar2.G0.invalidate();
                aiVar2.invalidate();
                return;
            case 11:
                ((gl) this.f28719b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                en enVar = (en) this.f28719b;
                enVar.getClass();
                enVar.f26128l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                enVar.O.f26512z.invalidate();
                return;
            case 13:
                jp jpVar = (jp) this.f28719b;
                jpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpVar.d = floatValue3;
                jpVar.setShown(floatValue3);
                jpVar.a(false);
                return;
            case 14:
                cq cqVar = (cq) this.f28719b;
                cqVar.getClass();
                cqVar.f25432g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.f25432g0);
                return;
            case 15:
                lr lrVar = (lr) this.f28719b;
                lrVar.getClass();
                lrVar.f28591l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lrVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                hs hsVar = (hs) this.f28719b;
                hsVar.getClass();
                hsVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hsVar.invalidateSelf();
                return;
            case 17:
                jw.r((jw) this.f28719b, valueAnimator);
                return;
            case 18:
                aw awVar = (aw) this.f28719b;
                awVar.getClass();
                awVar.f24696e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (awVar.getParent() instanceof View) {
                    ((View) awVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                ew ewVar = (ew) this.f28719b;
                ewVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.v = floatValue4;
                TextView textView = ewVar.f26218c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - ewVar.v);
                textView.setAlpha(1.0f - ewVar.v);
                TextView textView2 = ewVar.d;
                textView2.setScaleX(ewVar.v);
                textView2.setScaleY(ewVar.v);
                textView2.setAlpha(ewVar.v);
                return;
            case 20:
                pw pwVar = (pw) this.f28719b;
                pwVar.getClass();
                pwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pwVar.d();
                return;
            case 21:
                rw rwVar = (rw) this.f28719b;
                rwVar.getClass();
                rwVar.f30659r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rwVar.invalidate();
                rwVar.requestLayout();
                rwVar.c();
                rwVar.f30660s.f31306b.invalidate();
                return;
            case 22:
                jz jzVar = (jz) this.f28719b;
                jzVar.getClass();
                jzVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jzVar.invalidate();
                return;
            case 23:
                nz nzVar = (nz) this.f28719b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar.f29319w = floatValue5;
                View view2 = nzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ci.m6 m6Var = nzVar.f29318s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 24:
                b10 b10Var = ((t00) this.f28719b).F;
                b10Var.F.invalidate();
                b10Var.invalidate();
                return;
            case 25:
                j10 j10Var = (j10) this.f28719b;
                j10Var.getClass();
                j10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j10Var.invalidate();
                return;
            case 26:
                r30 r30Var = (r30) this.f28719b;
                p30 p30Var = r30Var.f30388a;
                if (!r30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    r30Var.f30391b0 = floatValue6;
                    r30Var.U.setPinnedProgress(floatValue6);
                    p30Var.setScaleX(1.0f - (r30Var.f30391b0 * 0.6f));
                    p30Var.setScaleY(1.0f - (r30Var.f30391b0 * 0.6f));
                    if (r30Var.W) {
                        r30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                t60 t60Var = (t60) this.f28719b;
                if (t60Var.f31114s0) {
                    Camera2Session camera2Session = t60Var.f31119w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = t60Var.f31115t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                d80.Q((d80) this.f28719b, valueAnimator);
                return;
            default:
                d80 d80Var = ((c80) this.f28719b).f25261e;
                d80Var.f25665k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d80.V(d80Var).invalidate();
                return;
        }
    }
}
