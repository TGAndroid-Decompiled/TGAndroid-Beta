package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class f6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24792a;
    public final Object f24793b;

    public f6(Object obj, int i10) {
        this.f24792a = i10;
        this.f24793b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24792a) {
            case 0:
                j6 j6Var = (j6) this.f24793b;
                j6Var.getClass();
                j6Var.f25892m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                r6 r6Var = (r6) this.f24793b;
                r6Var.f28392a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                r6Var.invalidate();
                return;
            case 2:
                c8 c8Var = (c8) this.f24793b;
                c8Var.G.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                w8 w8Var = (w8) this.f24793b;
                w8Var.getClass();
                w8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                c9 c9Var = (c9) this.f24793b;
                c9Var.getClass();
                c9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.f();
                return;
            case 5:
                r9 r9Var = (r9) this.f24793b;
                r9Var.getClass();
                r9Var.f28420g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                return;
            case 6:
                fa faVar = (fa) this.f24793b;
                faVar.getClass();
                faVar.f24830f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.f24828b.invalidate();
                return;
            case 7:
                rc rcVar = (rc) this.f24793b;
                rcVar.getClass();
                rcVar.f28445i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.b();
                return;
            case 8:
                lg lgVar = (lg) this.f24793b;
                lgVar.getClass();
                lgVar.f26639a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li liVar = ((rh) this.f24793b).e;
                mh mhVar = liVar.f26746u1;
                mhVar.setAlpha(1.0f - floatValue);
                liVar.B1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                liVar.C1 = dp;
                mhVar.setTranslationY(dp);
                return;
            case 10:
                mh mhVar2 = (mh) this.f24793b;
                li liVar2 = mhVar2.f27019b;
                liVar2.S1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                liVar2.f26763z0.invalidate();
                liVar2.A0.invalidate();
                mhVar2.invalidate();
                return;
            case 11:
                lm lmVar = (lm) this.f24793b;
                lmVar.getClass();
                lmVar.f26798l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lmVar.O.f27074z.invalidate();
                return;
            case 12:
                po poVar = (po) this.f24793b;
                poVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                poVar.d = floatValue2;
                poVar.setShown(floatValue2);
                poVar.a(false);
                return;
            case 13:
                kp kpVar = (kp) this.f24793b;
                kpVar.getClass();
                kpVar.f26341d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * kpVar.f26341d0);
                return;
            case 14:
                tq tqVar = (tq) this.f24793b;
                tqVar.getClass();
                tqVar.f29011l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = tqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                mr mrVar = (mr) this.f24793b;
                mrVar.getClass();
                mrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mrVar.invalidateSelf();
                return;
            case 16:
                mv.p((mv) this.f24793b, valueAnimator);
                return;
            case 17:
                dv dvVar = (dv) this.f24793b;
                dvVar.getClass();
                dvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (dvVar.getParent() instanceof View) {
                    ((View) dvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                hv hvVar = (hv) this.f24793b;
                hvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hvVar.v = floatValue3;
                TextView textView = hvVar.f25500c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - hvVar.v);
                textView.setAlpha(1.0f - hvVar.v);
                TextView textView2 = hvVar.d;
                textView2.setScaleX(hvVar.v);
                textView2.setScaleY(hvVar.v);
                textView2.setAlpha(hvVar.v);
                return;
            case 19:
                tv tvVar = (tv) this.f24793b;
                tvVar.getClass();
                tvVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tvVar.d();
                return;
            case 20:
                vv vvVar = (vv) this.f24793b;
                vvVar.getClass();
                vvVar.f30096r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.invalidate();
                vvVar.requestLayout();
                vvVar.c();
                vvVar.f30097s.f29253b.invalidate();
                return;
            case 21:
                sy syVar = (sy) this.f24793b;
                syVar.getClass();
                syVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                syVar.invalidate();
                return;
            case 22:
                wy wyVar = (wy) this.f24793b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wyVar.f30443w = floatValue4;
                View view2 = wyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ah.d dVar = wyVar.f30442s;
                if (dVar != null) {
                    dVar.invalidate();
                    return;
                }
                return;
            case 23:
                j00 j00Var = ((c00) this.f24793b).F;
                j00Var.C.invalidate();
                j00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f24793b;
                s00Var.getClass();
                s00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                a30 a30Var = (a30) this.f24793b;
                y20 y20Var = a30Var.f23279a;
                if (!a30Var.C) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a30Var.Y = floatValue5;
                    a30Var.R.setPinnedProgress(floatValue5);
                    y20Var.setScaleX(1.0f - (a30Var.Y * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.Y * 0.6f));
                    if (a30Var.T) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                x50 x50Var = (x50) this.f24793b;
                if (x50Var.f30560k0) {
                    Camera2Session camera2Session = x50Var.f30564o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = x50Var.f30561l0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                c70.P((c70) this.f24793b, valueAnimator);
                return;
            case 28:
                c70 c70Var = ((b70) this.f24793b).e;
                c70Var.f23870h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c70.U(c70Var).invalidate();
                return;
            default:
                o70 o70Var = (o70) this.f24793b;
                o70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m70 m70Var = o70Var.f27493x;
                if (m70Var != null) {
                    m70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
