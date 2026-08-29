package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29557a;
    public final Object f29558b;

    public j6(Object obj, int i10) {
        this.f29557a = i10;
        this.f29558b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29557a) {
            case 0:
                n6 n6Var = (n6) this.f29558b;
                n6Var.getClass();
                n6Var.f30871m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                v6 v6Var = (v6) this.f29558b;
                v6Var.f33467a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                return;
            case 2:
                g8 g8Var = (g8) this.f29558b;
                g8Var.F.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                g8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                b9 b9Var = (b9) this.f29558b;
                b9Var.getClass();
                b9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                g9 g9Var = (g9) this.f29558b;
                g9Var.getClass();
                g9Var.f28826e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.f();
                return;
            case 5:
                v9 v9Var = (v9) this.f29558b;
                v9Var.getClass();
                v9Var.f33501g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.invalidateSelf();
                return;
            case 6:
                ka kaVar = (ka) this.f29558b;
                kaVar.getClass();
                kaVar.f29980f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kaVar.f29977b.invalidate();
                return;
            case 7:
                uc ucVar = (uc) this.f29558b;
                ucVar.getClass();
                ucVar.f33193i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ucVar.b();
                return;
            case 8:
                og ogVar = (og) this.f29558b;
                ogVar.getClass();
                ogVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ni niVar = ((uh) this.f29558b).f33236e;
                ph phVar = niVar.f31049t1;
                phVar.setAlpha(1.0f - floatValue);
                niVar.A1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                niVar.B1 = dp;
                phVar.setTranslationY(dp);
                return;
            case 10:
                ph phVar2 = (ph) this.f29558b;
                ni niVar2 = phVar2.f31675b;
                niVar2.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                niVar2.f31066y0.invalidate();
                niVar2.f31069z0.invalidate();
                phVar2.invalidate();
                return;
            case 11:
                im imVar = (im) this.f29558b;
                imVar.getClass();
                imVar.f29417l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar.O.f29760z.invalidate();
                return;
            case 12:
                no noVar = (no) this.f29558b;
                noVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                noVar.d = floatValue2;
                noVar.setShown(floatValue2);
                noVar.a(false);
                return;
            case 13:
                gp gpVar = (gp) this.f29558b;
                gpVar.getClass();
                gpVar.f28935c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * gpVar.f28935c0);
                return;
            case 14:
                pq pqVar = (pq) this.f29558b;
                pqVar.getClass();
                pqVar.f31740l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                ir irVar = (ir) this.f29558b;
                irVar.getClass();
                irVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                irVar.invalidateSelf();
                return;
            case 16:
                jv.p((jv) this.f29558b, valueAnimator);
                return;
            case 17:
                av avVar = (av) this.f29558b;
                avVar.getClass();
                avVar.f26896e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (avVar.getParent() instanceof View) {
                    ((View) avVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                ev evVar = (ev) this.f29558b;
                evVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                evVar.v = floatValue3;
                TextView textView = evVar.f28185c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - evVar.v);
                textView.setAlpha(1.0f - evVar.v);
                TextView textView2 = evVar.d;
                textView2.setScaleX(evVar.v);
                textView2.setScaleY(evVar.v);
                textView2.setAlpha(evVar.v);
                return;
            case 19:
                pv pvVar = (pv) this.f29558b;
                pvVar.getClass();
                pvVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pvVar.d();
                return;
            case 20:
                rv rvVar = (rv) this.f29558b;
                rvVar.getClass();
                rvVar.f32389r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rvVar.invalidate();
                rvVar.requestLayout();
                rvVar.c();
                rvVar.f32390s.f30108b.invalidate();
                return;
            case 21:
                ny nyVar = (ny) this.f29558b;
                nyVar.getClass();
                nyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nyVar.invalidate();
                return;
            case 22:
                ry ryVar = (ry) this.f29558b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ryVar.f32417w = floatValue4;
                View view2 = ryVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                bg.d1 d1Var = ryVar.f32416s;
                if (d1Var != null) {
                    d1Var.invalidate();
                    return;
                }
                return;
            case 23:
                f00 f00Var = ((xz) this.f29558b).F;
                f00Var.B.invalidate();
                f00Var.invalidate();
                return;
            case 24:
                o00 o00Var = (o00) this.f29558b;
                o00Var.getClass();
                o00Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o00Var.invalidate();
                return;
            case 25:
                w20 w20Var = (w20) this.f29558b;
                t20 t20Var = w20Var.f34275a;
                if (!w20Var.B) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    w20Var.X = floatValue5;
                    w20Var.Q.setPinnedProgress(floatValue5);
                    t20Var.setScaleX(1.0f - (w20Var.X * 0.6f));
                    t20Var.setScaleY(1.0f - (w20Var.X * 0.6f));
                    if (w20Var.S) {
                        w20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                s50 s50Var = (s50) this.f29558b;
                if (s50Var.f32507j0) {
                    Camera2Session camera2Session = s50Var.f32511n0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = s50Var.f32508k0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                x60.P((x60) this.f29558b, valueAnimator);
                return;
            case 28:
                x60 x60Var = ((w60) this.f29558b).f34335e;
                x60Var.f34610g0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x60.U(x60Var).invalidate();
                return;
            default:
                j70 j70Var = (j70) this.f29558b;
                j70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h70 h70Var = j70Var.f29604x;
                if (h70Var != null) {
                    h70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
