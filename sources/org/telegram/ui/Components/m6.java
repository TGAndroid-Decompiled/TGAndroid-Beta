package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class m6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28705a;
    public final Object f28706b;

    public m6(Object obj, int i10) {
        this.f28705a = i10;
        this.f28706b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28705a) {
            case 0:
                q6 q6Var = (q6) this.f28706b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.f30079q = floatValue;
                TimeInterpolator timeInterpolator = q6Var.f30085x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                q6Var.f30080r = floatValue;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.f30066b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                y6 y6Var = (y6) this.f28706b;
                y6Var.f33123a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y6Var.invalidate();
                return;
            case 2:
                l8 l8Var = (l8) this.f28706b;
                l8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                l8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                g9 g9Var = (g9) this.f28706b;
                g9Var.getClass();
                g9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                l9 l9Var = (l9) this.f28706b;
                l9Var.getClass();
                l9Var.f28371e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
                return;
            case 5:
                aa aaVar = (aa) this.f28706b;
                aaVar.getClass();
                aaVar.f24645g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.invalidateSelf();
                return;
            case 6:
                qa qaVar = (qa) this.f28706b;
                qaVar.getClass();
                qaVar.f30121f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qaVar.f30118b.invalidate();
                return;
            case 7:
                bd bdVar = (bd) this.f28706b;
                bdVar.getClass();
                bdVar.f24978j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.b();
                return;
            case 8:
                xg xgVar = (xg) this.f28706b;
                xgVar.getClass();
                xgVar.f32834d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yi yiVar = ((ei) this.f28706b).f26093e;
                ai aiVar = yiVar.A1;
                aiVar.setAlpha(1.0f - floatValue2);
                yiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                yiVar.I1 = dp;
                aiVar.setTranslationY(dp);
                return;
            case 10:
                ai aiVar2 = (ai) this.f28706b;
                yi yiVar2 = aiVar2.f24691b;
                yiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yiVar2.F0.invalidate();
                yiVar2.G0.invalidate();
                aiVar2.invalidate();
                return;
            case 11:
                ((gl) this.f28706b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                en enVar = (en) this.f28706b;
                enVar.getClass();
                enVar.f26122l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                enVar.O.f26431z.invalidate();
                return;
            case 13:
                jp jpVar = (jp) this.f28706b;
                jpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpVar.d = floatValue3;
                jpVar.setShown(floatValue3);
                jpVar.a(false);
                return;
            case 14:
                cq cqVar = (cq) this.f28706b;
                cqVar.getClass();
                cqVar.f25471g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.f25471g0);
                return;
            case 15:
                lr lrVar = (lr) this.f28706b;
                lrVar.getClass();
                lrVar.f28559l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lrVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                gs gsVar = (gs) this.f28706b;
                gsVar.getClass();
                gsVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gsVar.invalidateSelf();
                return;
            case 17:
                iw.r((iw) this.f28706b, valueAnimator);
                return;
            case 18:
                zv zvVar = (zv) this.f28706b;
                zvVar.getClass();
                zvVar.f33666e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (zvVar.getParent() instanceof View) {
                    ((View) zvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                dw dwVar = (dw) this.f28706b;
                dwVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.v = floatValue4;
                TextView textView = dwVar.f25822c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - dwVar.v);
                textView.setAlpha(1.0f - dwVar.v);
                TextView textView2 = dwVar.d;
                textView2.setScaleX(dwVar.v);
                textView2.setScaleY(dwVar.v);
                textView2.setAlpha(dwVar.v);
                return;
            case 20:
                ow owVar = (ow) this.f28706b;
                owVar.getClass();
                owVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                owVar.d();
                return;
            case 21:
                qw qwVar = (qw) this.f28706b;
                qwVar.getClass();
                qwVar.f30296r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qwVar.invalidate();
                qwVar.requestLayout();
                qwVar.c();
                qwVar.f30297s.f30856b.invalidate();
                return;
            case 22:
                iz izVar = (iz) this.f28706b;
                izVar.getClass();
                izVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                izVar.invalidate();
                return;
            case 23:
                mz mzVar = (mz) this.f28706b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mzVar.f28980w = floatValue5;
                View view2 = mzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ci.m6 m6Var = mzVar.f28979s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 24:
                a10 a10Var = ((s00) this.f28706b).F;
                a10Var.F.invalidate();
                a10Var.invalidate();
                return;
            case 25:
                i10 i10Var = (i10) this.f28706b;
                i10Var.getClass();
                i10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i10Var.invalidate();
                return;
            case 26:
                q30 q30Var = (q30) this.f28706b;
                o30 o30Var = q30Var.f30011a;
                if (!q30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    q30Var.f30014b0 = floatValue6;
                    q30Var.U.setPinnedProgress(floatValue6);
                    o30Var.setScaleX(1.0f - (q30Var.f30014b0 * 0.6f));
                    o30Var.setScaleY(1.0f - (q30Var.f30014b0 * 0.6f));
                    if (q30Var.W) {
                        q30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                t60 t60Var = (t60) this.f28706b;
                if (t60Var.f31034s0) {
                    Camera2Session camera2Session = t60Var.f31039w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = t60Var.f31035t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                d80.Q((d80) this.f28706b, valueAnimator);
                return;
            default:
                d80 d80Var = ((c80) this.f28706b).f25289e;
                d80Var.f25630k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d80.V(d80Var).invalidate();
                return;
        }
    }
}
