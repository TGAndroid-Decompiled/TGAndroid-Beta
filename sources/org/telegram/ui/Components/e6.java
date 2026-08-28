package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27960a;
    public final Object f27961b;

    public e6(Object obj, int i9) {
        this.f27960a = i9;
        this.f27961b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27960a) {
            case 0:
                i6 i6Var = (i6) this.f27961b;
                i6Var.getClass();
                i6Var.f29342m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                q6 q6Var = (q6) this.f27961b;
                q6Var.f31839a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                return;
            case 2:
                c8 c8Var = (c8) this.f27961b;
                c8Var.F.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                w8 w8Var = (w8) this.f27961b;
                w8Var.getClass();
                w8Var.i0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                b9 b9Var = (b9) this.f27961b;
                b9Var.getClass();
                b9Var.f27077e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b9Var.f();
                return;
            case 5:
                q9 q9Var = (q9) this.f27961b;
                q9Var.getClass();
                q9Var.f31870g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.invalidateSelf();
                return;
            case 6:
                fa faVar = (fa) this.f27961b;
                faVar.getClass();
                faVar.f28355f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.f28352b.invalidate();
                return;
            case 7:
                pc pcVar = (pc) this.f27961b;
                pcVar.getClass();
                pcVar.f31612i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.b();
                return;
            case 8:
                lg lgVar = (lg) this.f27961b;
                lgVar.getClass();
                lgVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = ((rh) this.f27961b).f32175e;
                mh mhVar = kiVar.f30158t1;
                mhVar.setAlpha(1.0f - floatValue);
                kiVar.A1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                kiVar.B1 = dp;
                mhVar.setTranslationY(dp);
                return;
            case 10:
                mh mhVar2 = (mh) this.f27961b;
                ki kiVar2 = mhVar2.f30837b;
                kiVar2.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kiVar2.f30175y0.invalidate();
                kiVar2.f30178z0.invalidate();
                mhVar2.invalidate();
                return;
            case 11:
                em emVar = (em) this.f27961b;
                emVar.getClass();
                emVar.f28071l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emVar.O.f28512z.invalidate();
                return;
            case 12:
                jo joVar = (jo) this.f27961b;
                joVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                joVar.d = floatValue2;
                joVar.setShown(floatValue2);
                joVar.a(false);
                return;
            case 13:
                cp cpVar = (cp) this.f27961b;
                cpVar.getClass();
                cpVar.f27524c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * cpVar.f27524c0);
                return;
            case 14:
                lq lqVar = (lq) this.f27961b;
                lqVar.getClass();
                lqVar.f30523l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                fr frVar = (fr) this.f27961b;
                frVar.getClass();
                frVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                frVar.invalidateSelf();
                return;
            case 16:
                dv.p((dv) this.f27961b, valueAnimator);
                return;
            case 17:
                uu uuVar = (uu) this.f27961b;
                uuVar.getClass();
                uuVar.f33146e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uuVar.getParent() instanceof View) {
                    ((View) uuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                yu yuVar = (yu) this.f27961b;
                yuVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.v = floatValue3;
                TextView textView = yuVar.f35071c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - yuVar.v);
                textView.setAlpha(1.0f - yuVar.v);
                TextView textView2 = yuVar.d;
                textView2.setScaleX(yuVar.v);
                textView2.setScaleY(yuVar.v);
                textView2.setAlpha(yuVar.v);
                return;
            case 19:
                jv jvVar = (jv) this.f27961b;
                jvVar.getClass();
                jvVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.d();
                return;
            case 20:
                lv lvVar = (lv) this.f27961b;
                lvVar.getClass();
                lvVar.f30561r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvVar.invalidate();
                lvVar.requestLayout();
                lvVar.c();
                lvVar.f30562s.f34720b.invalidate();
                return;
            case 21:
                fy fyVar = (fy) this.f27961b;
                fyVar.getClass();
                fyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fyVar.invalidate();
                return;
            case 22:
                jy jyVar = (jy) this.f27961b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jyVar.f29884w = floatValue4;
                View view2 = jyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                fh.v vVar = jyVar.f29883s;
                if (vVar != null) {
                    vVar.invalidate();
                    return;
                }
                return;
            case 23:
                vz vzVar = ((oz) this.f27961b).F;
                vzVar.B.invalidate();
                vzVar.invalidate();
                return;
            case 24:
                d00 d00Var = (d00) this.f27961b;
                d00Var.getClass();
                d00Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d00Var.invalidate();
                return;
            case 25:
                j20 j20Var = (j20) this.f27961b;
                h20 h20Var = j20Var.f29598a;
                if (!j20Var.B) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    j20Var.X = floatValue5;
                    j20Var.Q.setPinnedProgress(floatValue5);
                    h20Var.setScaleX(1.0f - (j20Var.X * 0.6f));
                    h20Var.setScaleY(1.0f - (j20Var.X * 0.6f));
                    if (j20Var.S) {
                        j20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                f50 f50Var = (f50) this.f27961b;
                if (f50Var.f28286j0) {
                    Camera2Session camera2Session = f50Var.f28290n0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = f50Var.f28287k0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                k60.O((k60) this.f27961b, valueAnimator);
                return;
            case 28:
                k60 k60Var = ((j60) this.f27961b).f29655e;
                k60Var.f29980g0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k60.T(k60Var).invalidate();
                return;
            default:
                x60 x60Var = (x60) this.f27961b;
                x60Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v60 v60Var = x60Var.f34584x;
                if (v60Var != null) {
                    v60Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
