package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class f6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26768a;
    public final Object f26769b;

    public f6(Object obj, int i10) {
        this.f26768a = i10;
        this.f26769b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26768a) {
            case 0:
                j6 j6Var = (j6) this.f26769b;
                j6Var.getClass();
                j6Var.f28038m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                r6 r6Var = (r6) this.f26769b;
                r6Var.f30608a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                r6Var.invalidate();
                return;
            case 2:
                c8 c8Var = (c8) this.f26769b;
                c8Var.G.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                w8 w8Var = (w8) this.f26769b;
                w8Var.getClass();
                w8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                c9 c9Var = (c9) this.f26769b;
                c9Var.getClass();
                c9Var.f25867e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.f();
                return;
            case 5:
                r9 r9Var = (r9) this.f26769b;
                r9Var.getClass();
                r9Var.f30651g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                return;
            case 6:
                fa faVar = (fa) this.f26769b;
                faVar.getClass();
                faVar.f26835f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.f26832b.invalidate();
                return;
            case 7:
                rc rcVar = (rc) this.f26769b;
                rcVar.getClass();
                rcVar.f30679i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.b();
                return;
            case 8:
                lg lgVar = (lg) this.f26769b;
                lgVar.getClass();
                lgVar.f28712a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi miVar = ((rh) this.f26769b).f30699e;
                mh mhVar = miVar.f29098u1;
                mhVar.setAlpha(1.0f - floatValue);
                miVar.B1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                miVar.C1 = dp;
                mhVar.setTranslationY(dp);
                return;
            case 10:
                mh mhVar2 = (mh) this.f26769b;
                mi miVar2 = mhVar2.f29031b;
                miVar2.S1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                miVar2.f29115z0.invalidate();
                miVar2.A0.invalidate();
                mhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f26769b;
                nmVar.getClass();
                nmVar.f29550l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f29820z.invalidate();
                return;
            case 12:
                ro roVar = (ro) this.f26769b;
                roVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roVar.d = floatValue2;
                roVar.setShown(floatValue2);
                roVar.a(false);
                return;
            case 13:
                mp mpVar = (mp) this.f26769b;
                mpVar.getClass();
                mpVar.f29171d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f29171d0);
                return;
            case 14:
                vq vqVar = (vq) this.f26769b;
                vqVar.getClass();
                vqVar.f32513l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                or orVar = (or) this.f26769b;
                orVar.getClass();
                orVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                orVar.invalidateSelf();
                return;
            case 16:
                ov.p((ov) this.f26769b, valueAnimator);
                return;
            case 17:
                fv fvVar = (fv) this.f26769b;
                fvVar.getClass();
                fvVar.f27021e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fvVar.getParent() instanceof View) {
                    ((View) fvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                jv jvVar = (jv) this.f26769b;
                jvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.v = floatValue3;
                TextView textView = jvVar.f28208c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - jvVar.v);
                textView.setAlpha(1.0f - jvVar.v);
                TextView textView2 = jvVar.d;
                textView2.setScaleX(jvVar.v);
                textView2.setScaleY(jvVar.v);
                textView2.setAlpha(jvVar.v);
                return;
            case 19:
                vv vvVar = (vv) this.f26769b;
                vvVar.getClass();
                vvVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.d();
                return;
            case 20:
                xv xvVar = (xv) this.f26769b;
                xvVar.getClass();
                xvVar.f33183r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.invalidate();
                xvVar.requestLayout();
                xvVar.c();
                xvVar.f33184s.f31929b.invalidate();
                return;
            case 21:
                uy uyVar = (uy) this.f26769b;
                uyVar.getClass();
                uyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uyVar.invalidate();
                return;
            case 22:
                yy yyVar = (yy) this.f26769b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.f33648w = floatValue4;
                View view2 = yyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ag.l lVar = yyVar.f33647s;
                if (lVar != null) {
                    lVar.invalidate();
                    return;
                }
                return;
            case 23:
                l00 l00Var = ((e00) this.f26769b).F;
                l00Var.C.invalidate();
                l00Var.invalidate();
                return;
            case 24:
                t00 t00Var = (t00) this.f26769b;
                t00Var.getClass();
                t00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                return;
            case 25:
                c30 c30Var = (c30) this.f26769b;
                a30 a30Var = c30Var.f25771a;
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
                z50 z50Var = (z50) this.f26769b;
                if (z50Var.f33747k0) {
                    Camera2Session camera2Session = z50Var.f33751o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = z50Var.f33748l0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                e70.P((e70) this.f26769b, valueAnimator);
                return;
            case 28:
                e70 e70Var = ((d70) this.f26769b).f26207e;
                e70Var.f26463h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e70.U(e70Var).invalidate();
                return;
            default:
                q70 q70Var = (q70) this.f26769b;
                q70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o70 o70Var = q70Var.f30333x;
                if (o70Var != null) {
                    o70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
