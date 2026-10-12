package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class m6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28405a;
    public final Object f28406b;

    public m6(Object obj, int i10) {
        this.f28405a = i10;
        this.f28406b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28405a) {
            case 0:
                q6 q6Var = (q6) this.f28406b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.f29704q = floatValue;
                TimeInterpolator timeInterpolator = q6Var.f29710x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                q6Var.f29705r = floatValue;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.f29691b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                y6 y6Var = (y6) this.f28406b;
                y6Var.f32954a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y6Var.invalidate();
                return;
            case 2:
                l8 l8Var = (l8) this.f28406b;
                l8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                l8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                g9 g9Var = (g9) this.f28406b;
                g9Var.getClass();
                g9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                l9 l9Var = (l9) this.f28406b;
                l9Var.getClass();
                l9Var.f28097e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
                return;
            case 5:
                aa aaVar = (aa) this.f28406b;
                aaVar.getClass();
                aaVar.f24271g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.invalidateSelf();
                return;
            case 6:
                pa paVar = (pa) this.f28406b;
                paVar.getClass();
                paVar.f29463f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f29460b.invalidate();
                return;
            case 7:
                ad adVar = (ad) this.f28406b;
                adVar.getClass();
                adVar.f24288j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.b();
                return;
            case 8:
                zg zgVar = (zg) this.f28406b;
                zgVar.getClass();
                zgVar.f33366d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aj ajVar = ((gi) this.f28406b).f26437e;
                ci ciVar = ajVar.A1;
                ciVar.setAlpha(1.0f - floatValue2);
                ajVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                ajVar.I1 = dp;
                ciVar.setTranslationY(dp);
                return;
            case 10:
                ci ciVar2 = (ci) this.f28406b;
                aj ajVar2 = ciVar2.f24940b;
                ajVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ajVar2.F0.invalidate();
                ajVar2.G0.invalidate();
                ciVar2.invalidate();
                return;
            case 11:
                ((il) this.f28406b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                gn gnVar = (gn) this.f28406b;
                gnVar.getClass();
                gnVar.f26466l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.O.f26823z.invalidate();
                return;
            case 13:
                lp lpVar = (lp) this.f28406b;
                lpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lpVar.d = floatValue3;
                lpVar.setShown(floatValue3);
                lpVar.a(false);
                return;
            case 14:
                eq eqVar = (eq) this.f28406b;
                eqVar.getClass();
                eqVar.f25754g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * eqVar.f25754g0);
                return;
            case 15:
                nr nrVar = (nr) this.f28406b;
                nrVar.getClass();
                nrVar.f28938l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = nrVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                is isVar = (is) this.f28406b;
                isVar.getClass();
                isVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                isVar.invalidateSelf();
                return;
            case 17:
                lw.r((lw) this.f28406b, valueAnimator);
                return;
            case 18:
                cw cwVar = (cw) this.f28406b;
                cwVar.getClass();
                cwVar.f25030e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (cwVar.getParent() instanceof View) {
                    ((View) cwVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                gw gwVar = (gw) this.f28406b;
                gwVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.v = floatValue4;
                TextView textView = gwVar.f26535c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - gwVar.v);
                textView.setAlpha(1.0f - gwVar.v);
                TextView textView2 = gwVar.d;
                textView2.setScaleX(gwVar.v);
                textView2.setScaleY(gwVar.v);
                textView2.setAlpha(gwVar.v);
                return;
            case 20:
                rw rwVar = (rw) this.f28406b;
                rwVar.getClass();
                rwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rwVar.d();
                return;
            case 21:
                tw twVar = (tw) this.f28406b;
                twVar.getClass();
                twVar.f30984r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                twVar.invalidate();
                twVar.requestLayout();
                twVar.c();
                twVar.f30985s.f33147b.invalidate();
                return;
            case 22:
                lz lzVar = (lz) this.f28406b;
                lzVar.getClass();
                lzVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lzVar.invalidate();
                return;
            case 23:
                pz pzVar = (pz) this.f28406b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pzVar.f29602w = floatValue5;
                View view2 = pzVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ci.m6 m6Var = pzVar.f29601s;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 24:
                d10 d10Var = ((v00) this.f28406b).F;
                d10Var.F.invalidate();
                d10Var.invalidate();
                return;
            case 25:
                l10 l10Var = (l10) this.f28406b;
                l10Var.getClass();
                l10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l10Var.invalidate();
                return;
            case 26:
                t30 t30Var = (t30) this.f28406b;
                r30 r30Var = t30Var.f30744a;
                if (!t30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    t30Var.f30747b0 = floatValue6;
                    t30Var.U.setPinnedProgress(floatValue6);
                    r30Var.setScaleX(1.0f - (t30Var.f30747b0 * 0.6f));
                    r30Var.setScaleY(1.0f - (t30Var.f30747b0 * 0.6f));
                    if (t30Var.W) {
                        t30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                w60 w60Var = (w60) this.f28406b;
                if (w60Var.f32305s0) {
                    Camera2Session camera2Session = w60Var.f32310w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = w60Var.f32306t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                g80.Q((g80) this.f28406b, valueAnimator);
                return;
            default:
                g80 g80Var = ((f80) this.f28406b).f25964e;
                g80Var.f26331k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g80.V(g80Var).invalidate();
                return;
        }
    }
}
