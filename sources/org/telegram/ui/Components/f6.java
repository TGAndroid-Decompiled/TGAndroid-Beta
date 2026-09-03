package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class f6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26799a;
    public final Object f26800b;

    public f6(Object obj, int i10) {
        this.f26799a = i10;
        this.f26800b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26799a) {
            case 0:
                j6 j6Var = (j6) this.f26800b;
                j6Var.getClass();
                j6Var.f28008m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                r6 r6Var = (r6) this.f26800b;
                r6Var.f30658a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                r6Var.invalidate();
                return;
            case 2:
                c8 c8Var = (c8) this.f26800b;
                c8Var.G.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                w8 w8Var = (w8) this.f26800b;
                w8Var.getClass();
                w8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                c9 c9Var = (c9) this.f26800b;
                c9Var.getClass();
                c9Var.f25843e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.f();
                return;
            case 5:
                r9 r9Var = (r9) this.f26800b;
                r9Var.getClass();
                r9Var.f30698g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                return;
            case 6:
                fa faVar = (fa) this.f26800b;
                faVar.getClass();
                faVar.f26834f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.f26831b.invalidate();
                return;
            case 7:
                rc rcVar = (rc) this.f26800b;
                rcVar.getClass();
                rcVar.f30726i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.b();
                return;
            case 8:
                lg lgVar = (lg) this.f26800b;
                lgVar.getClass();
                lgVar.f28735a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi miVar = ((rh) this.f26800b).f30746e;
                mh mhVar = miVar.f29116u1;
                mhVar.setAlpha(1.0f - floatValue);
                miVar.B1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                miVar.C1 = dp;
                mhVar.setTranslationY(dp);
                return;
            case 10:
                mh mhVar2 = (mh) this.f26800b;
                mi miVar2 = mhVar2.f29049b;
                miVar2.S1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                miVar2.f29133z0.invalidate();
                miVar2.A0.invalidate();
                mhVar2.invalidate();
                return;
            case 11:
                mm mmVar = (mm) this.f26800b;
                mmVar.getClass();
                mmVar.f29165l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.O.f29538z.invalidate();
                return;
            case 12:
                ro roVar = (ro) this.f26800b;
                roVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roVar.d = floatValue2;
                roVar.setShown(floatValue2);
                roVar.a(false);
                return;
            case 13:
                mp mpVar = (mp) this.f26800b;
                mpVar.getClass();
                mpVar.f29214d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f29214d0);
                return;
            case 14:
                vq vqVar = (vq) this.f26800b;
                vqVar.getClass();
                vqVar.f32516l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                or orVar = (or) this.f26800b;
                orVar.getClass();
                orVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                orVar.invalidateSelf();
                return;
            case 16:
                ov.p((ov) this.f26800b, valueAnimator);
                return;
            case 17:
                fv fvVar = (fv) this.f26800b;
                fvVar.getClass();
                fvVar.f27011e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fvVar.getParent() instanceof View) {
                    ((View) fvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                jv jvVar = (jv) this.f26800b;
                jvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.v = floatValue3;
                TextView textView = jvVar.f28193c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - jvVar.v);
                textView.setAlpha(1.0f - jvVar.v);
                TextView textView2 = jvVar.d;
                textView2.setScaleX(jvVar.v);
                textView2.setScaleY(jvVar.v);
                textView2.setAlpha(jvVar.v);
                return;
            case 19:
                vv vvVar = (vv) this.f26800b;
                vvVar.getClass();
                vvVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.d();
                return;
            case 20:
                xv xvVar = (xv) this.f26800b;
                xvVar.getClass();
                xvVar.f33182r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.invalidate();
                xvVar.requestLayout();
                xvVar.c();
                xvVar.f33183s.f31649b.invalidate();
                return;
            case 21:
                uy uyVar = (uy) this.f26800b;
                uyVar.getClass();
                uyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uyVar.invalidate();
                return;
            case 22:
                yy yyVar = (yy) this.f26800b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.f33691w = floatValue4;
                View view2 = yyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ag.l lVar = yyVar.f33690s;
                if (lVar != null) {
                    lVar.invalidate();
                    return;
                }
                return;
            case 23:
                l00 l00Var = ((e00) this.f26800b).F;
                l00Var.C.invalidate();
                l00Var.invalidate();
                return;
            case 24:
                t00 t00Var = (t00) this.f26800b;
                t00Var.getClass();
                t00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                return;
            case 25:
                c30 c30Var = (c30) this.f26800b;
                a30 a30Var = c30Var.f25749a;
                if (!c30Var.C) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c30Var.Y = floatValue5;
                    c30Var.R.setPinnedProgress(floatValue5);
                    a30Var.setScaleX(1.0f - (c30Var.Y * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.Y * 0.6f));
                    if (c30Var.T) {
                        c30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                z50 z50Var = (z50) this.f26800b;
                if (z50Var.f33785k0) {
                    Camera2Session camera2Session = z50Var.f33789o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = z50Var.f33786l0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                e70.P((e70) this.f26800b, valueAnimator);
                return;
            case 28:
                e70 e70Var = ((d70) this.f26800b).f26210e;
                e70Var.f26474h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e70.U(e70Var).invalidate();
                return;
            default:
                q70 q70Var = (q70) this.f26800b;
                q70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o70 o70Var = q70Var.f30337x;
                if (o70Var != null) {
                    o70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
