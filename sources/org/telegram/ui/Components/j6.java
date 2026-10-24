package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27577a;
    public final Object f27578b;

    public j6(Object obj, int i10) {
        this.f27577a = i10;
        this.f27578b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27577a) {
            case 0:
                n6 n6Var = (n6) this.f27578b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f28810q = floatValue;
                TimeInterpolator timeInterpolator = n6Var.f28816x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                n6Var.f28811r = floatValue;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.f28798b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                v6 v6Var = (v6) this.f27578b;
                v6Var.f31334a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                return;
            case 2:
                i8 i8Var = (i8) this.f27578b;
                i8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                i8Var.L.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                c9 c9Var = (c9) this.f27578b;
                c9Var.getClass();
                c9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                h9 h9Var = (h9) this.f27578b;
                h9Var.getClass();
                h9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.f();
                return;
            case 5:
                w9 w9Var = (w9) this.f27578b;
                w9Var.getClass();
                w9Var.f32159g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.invalidateSelf();
                return;
            case 6:
                la laVar = (la) this.f27578b;
                laVar.getClass();
                laVar.f28293f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                laVar.f28291b.invalidate();
                return;
            case 7:
                wc wcVar = (wc) this.f27578b;
                wcVar.getClass();
                wcVar.f32186j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcVar.b();
                return;
            case 8:
                tg tgVar = (tg) this.f27578b;
                tgVar.getClass();
                tgVar.f30817d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri riVar = ((yh) this.f27578b).e;
                uh uhVar = riVar.A1;
                uhVar.setAlpha(1.0f - floatValue2);
                riVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                riVar.I1 = dp;
                uhVar.setTranslationY(dp);
                return;
            case 10:
                uh uhVar2 = (uh) this.f27578b;
                ri riVar2 = uhVar2.f31124b;
                riVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                riVar2.F0.invalidate();
                riVar2.G0.invalidate();
                uhVar2.invalidate();
                return;
            case 11:
                ((yk) this.f27578b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                wm wmVar = (wm) this.f27578b;
                wmVar.getClass();
                wmVar.f32274l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.O.f32658z.invalidate();
                return;
            case 13:
                bp bpVar = (bp) this.f27578b;
                bpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bpVar.d = floatValue3;
                bpVar.setShown(floatValue3);
                bpVar.a(false);
                return;
            case 14:
                up upVar = (up) this.f27578b;
                upVar.getClass();
                upVar.f31182f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                upVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * upVar.f31182f0);
                return;
            case 15:
                cr crVar = (cr) this.f27578b;
                crVar.getClass();
                crVar.f25445l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = crVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                yr yrVar = (yr) this.f27578b;
                yrVar.getClass();
                yrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yrVar.invalidateSelf();
                return;
            case 17:
                yv.q((yv) this.f27578b, valueAnimator);
                return;
            case 18:
                pv pvVar = (pv) this.f27578b;
                pvVar.getClass();
                pvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (pvVar.getParent() instanceof View) {
                    ((View) pvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 19:
                tv tvVar = (tv) this.f27578b;
                tvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tvVar.v = floatValue4;
                TextView textView = tvVar.f30893c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - tvVar.v);
                textView.setAlpha(1.0f - tvVar.v);
                TextView textView2 = tvVar.d;
                textView2.setScaleX(tvVar.v);
                textView2.setScaleY(tvVar.v);
                textView2.setAlpha(tvVar.v);
                return;
            case 20:
                ew ewVar = (ew) this.f27578b;
                ewVar.getClass();
                ewVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.d();
                return;
            case 21:
                gw gwVar = (gw) this.f27578b;
                gwVar.getClass();
                gwVar.f26802r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.invalidate();
                gwVar.requestLayout();
                gwVar.c();
                gwVar.f26803s.f28979b.invalidate();
                return;
            case 22:
                az azVar = (az) this.f27578b;
                azVar.getClass();
                azVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.invalidate();
                return;
            case 23:
                ez ezVar = (ez) this.f27578b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.f26149w = floatValue5;
                View view2 = ezVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                ah.v vVar = ezVar.f26148s;
                if (vVar != null) {
                    vVar.invalidate();
                    return;
                }
                return;
            case 24:
                q00 q00Var = ((j00) this.f27578b).F;
                q00Var.F.invalidate();
                q00Var.invalidate();
                return;
            case 25:
                y00 y00Var = (y00) this.f27578b;
                y00Var.getClass();
                y00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 26:
                g30 g30Var = (g30) this.f27578b;
                d30 d30Var = g30Var.f26537a;
                if (!g30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    g30Var.f26540b0 = floatValue6;
                    g30Var.U.setPinnedProgress(floatValue6);
                    d30Var.setScaleX(1.0f - (g30Var.f26540b0 * 0.6f));
                    d30Var.setScaleY(1.0f - (g30Var.f26540b0 * 0.6f));
                    if (g30Var.W) {
                        g30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                l60 l60Var = (l60) this.f27578b;
                if (l60Var.f28210s0) {
                    Camera2Session camera2Session = l60Var.f28215w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = l60Var.f28211t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 28:
                v70.P((v70) this.f27578b, valueAnimator);
                return;
            default:
                v70 v70Var = ((u70) this.f27578b).e;
                v70Var.f31356k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v70.U(v70Var).invalidate();
                return;
        }
    }
}
