package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

public final class e6 implements ValueAnimator.AnimatorUpdateListener {

    public final int f27956a;

    public final Object f27957b;

    public e6(Object obj, int i10) {
        this.f27956a = i10;
        this.f27957b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27956a) {
            case 0:
                i6 i6Var = (i6) this.f27957b;
                i6Var.getClass();
                i6Var.f29248m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                q6 q6Var = (q6) this.f27957b;
                q6Var.f31805a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                break;
            case 2:
                b8 b8Var = (b8) this.f27957b;
                b8Var.F.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                b8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                v8 v8Var = (v8) this.f27957b;
                v8Var.getClass();
                v8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                a9 a9Var = (a9) this.f27957b;
                a9Var.getClass();
                a9Var.f26665e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f();
                break;
            case 5:
                p9 p9Var = (p9) this.f27957b;
                p9Var.getClass();
                p9Var.f31569g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.invalidateSelf();
                break;
            case 6:
                da daVar = (da) this.f27957b;
                daVar.getClass();
                daVar.f27687f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.f27684b.invalidate();
                break;
            case 7:
                nc ncVar = (nc) this.f27957b;
                ncVar.getClass();
                ncVar.f30950i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ncVar.b();
                break;
            case 8:
                hg hgVar = (hg) this.f27957b;
                hgVar.getClass();
                hgVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                nh nhVar = (nh) this.f27957b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi giVar = nhVar.f30972e;
                ih ihVar = giVar.f28694t1;
                ihVar.setAlpha(1.0f - fFloatValue);
                giVar.A1.setAlpha(fFloatValue);
                float fDp = fFloatValue * AndroidUtilities.dp(36.0f);
                giVar.B1 = fDp;
                ihVar.setTranslationY(fDp);
                break;
            case 10:
                ih ihVar2 = (ih) this.f27957b;
                gi giVar2 = ihVar2.f29366b;
                giVar2.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                giVar2.f28711y0.invalidate();
                giVar2.f28714z0.invalidate();
                ihVar2.invalidate();
                break;
            case 11:
                bm bmVar = (bm) this.f27957b;
                bmVar.getClass();
                bmVar.f27146l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bmVar.O.f27505z.invalidate();
                break;
            case 12:
                ho hoVar = (ho) this.f27957b;
                hoVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hoVar.d = fFloatValue2;
                hoVar.setShown(fFloatValue2);
                hoVar.a(false);
                break;
            case 13:
                ap apVar = (ap) this.f27957b;
                apVar.getClass();
                apVar.f26781c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                apVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * apVar.f26781c0);
                break;
            case 14:
                jq jqVar = (jq) this.f27957b;
                jqVar.getClass();
                jqVar.f29784l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jqVar.H;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 15:
                dr drVar = (dr) this.f27957b;
                drVar.getClass();
                drVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                drVar.invalidateSelf();
                break;
            case 16:
                cv.q((cv) this.f27957b, valueAnimator);
                break;
            case 17:
                tu tuVar = (tu) this.f27957b;
                tuVar.getClass();
                tuVar.f32892e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (tuVar.getParent() instanceof View) {
                    ((View) tuVar.getParent()).invalidate();
                }
                break;
            case 18:
                xu xuVar = (xu) this.f27957b;
                xuVar.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.v = fFloatValue3;
                TextView textView = xuVar.f34713c;
                textView.setScaleX(1.0f - fFloatValue3);
                textView.setScaleY(1.0f - xuVar.v);
                textView.setAlpha(1.0f - xuVar.v);
                TextView textView2 = xuVar.d;
                textView2.setScaleX(xuVar.v);
                textView2.setScaleY(xuVar.v);
                textView2.setAlpha(xuVar.v);
                break;
            case 19:
                iv ivVar = (iv) this.f27957b;
                ivVar.getClass();
                ivVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ivVar.d();
                break;
            case 20:
                kv kvVar = (kv) this.f27957b;
                kvVar.getClass();
                kvVar.f30189r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kvVar.invalidate();
                kvVar.requestLayout();
                kvVar.c();
                kvVar.f30190s.f26767b.invalidate();
                break;
            case 21:
                gy gyVar = (gy) this.f27957b;
                gyVar.getClass();
                gyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gyVar.invalidate();
                break;
            case 22:
                ky kyVar = (ky) this.f27957b;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kyVar.f30220w = fFloatValue4;
                View view2 = kyVar.v;
                if (view2 == null) {
                    ag.y1 y1Var = kyVar.f30219s;
                    if (y1Var != null) {
                        y1Var.invalidate();
                    }
                } else {
                    view2.setAlpha(fFloatValue4);
                }
                break;
            case 23:
                yz yzVar = ((qz) this.f27957b).F;
                yzVar.B.invalidate();
                yzVar.invalidate();
                break;
            case 24:
                g00 g00Var = (g00) this.f27957b;
                g00Var.getClass();
                g00Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g00Var.invalidate();
                break;
            case 25:
                n20 n20Var = (n20) this.f27957b;
                k20 k20Var = n20Var.f30819a;
                if (!n20Var.B) {
                    float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    n20Var.X = fFloatValue5;
                    n20Var.Q.setPinnedProgress(fFloatValue5);
                    k20Var.setScaleX(1.0f - (n20Var.X * 0.6f));
                    k20Var.setScaleY(1.0f - (n20Var.X * 0.6f));
                    if (n20Var.S) {
                        n20Var.i();
                    }
                    break;
                }
                break;
            case 26:
                k50 k50Var = (k50) this.f27957b;
                if (!k50Var.f29981j0) {
                    CameraSession cameraSession = k50Var.f29982k0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                } else {
                    Camera2Session camera2Session = k50Var.f29985n0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
                break;
            case 27:
                p60.P((p60) this.f27957b, valueAnimator);
                break;
            case 28:
                p60 p60Var = ((o60) this.f27957b).f31176e;
                p60Var.f31520g0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((org.telegram.ui.ActionBar.e3) p60Var).containerView.invalidate();
                break;
            default:
                b70 b70Var = (b70) this.f27957b;
                b70Var.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z60 z60Var = b70Var.f26996x;
                if (z60Var != null) {
                    z60Var.setProgress(fFloatValue6);
                }
                break;
        }
    }
}
