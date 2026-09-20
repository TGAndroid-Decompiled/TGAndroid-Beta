package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25240a;
    public final Object f25241b;

    public j6(Object obj, int i10) {
        this.f25240a = i10;
        this.f25241b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25240a) {
            case 0:
                n6 n6Var = (n6) this.f25241b;
                n6Var.getClass();
                n6Var.f26583m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                v6 v6Var = (v6) this.f25241b;
                v6Var.f28936a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                return;
            case 2:
                i8 i8Var = (i8) this.f25241b;
                i8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                i8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                d9 d9Var = (d9) this.f25241b;
                d9Var.getClass();
                d9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                i9 i9Var = (i9) this.f25241b;
                i9Var.getClass();
                i9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.f();
                return;
            case 5:
                x9 x9Var = (x9) this.f25241b;
                x9Var.getClass();
                x9Var.f30206g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.invalidateSelf();
                return;
            case 6:
                ma maVar = (ma) this.f25241b;
                maVar.getClass();
                maVar.f26359f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.f26357b.invalidate();
                return;
            case 7:
                yc ycVar = (yc) this.f25241b;
                ycVar.getClass();
                ycVar.f30501i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                return;
            case 8:
                ug ugVar = (ug) this.f25241b;
                ugVar.getClass();
                ugVar.f28663d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = ((bi) this.f25241b).e;
                xh xhVar = viVar.f29156x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                return;
            case 10:
                xh xhVar2 = (xh) this.f25241b;
                vi viVar2 = xhVar2.f30265b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                return;
            case 11:
                nm nmVar = (nm) this.f25241b;
                nmVar.getClass();
                nmVar.f26694l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.f26996z.invalidate();
                return;
            case 12:
                to toVar = (to) this.f25241b;
                toVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue2;
                toVar.setShown(floatValue2);
                toVar.a(false);
                return;
            case 13:
                mp mpVar = (mp) this.f25241b;
                mpVar.getClass();
                mpVar.f26452g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26452g0);
                return;
            case 14:
                vq vqVar = (vq) this.f25241b;
                vqVar.getClass();
                vqVar.f29803l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                pr prVar = (pr) this.f25241b;
                prVar.getClass();
                prVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                prVar.invalidateSelf();
                return;
            case 16:
                tv.p((tv) this.f25241b, valueAnimator);
                return;
            case 17:
                kv kvVar = (kv) this.f25241b;
                kvVar.getClass();
                kvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kvVar.getParent() instanceof View) {
                    ((View) kvVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                ov ovVar = (ov) this.f25241b;
                ovVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ovVar.v = floatValue3;
                TextView textView = ovVar.f27047c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - ovVar.v);
                textView.setAlpha(1.0f - ovVar.v);
                TextView textView2 = ovVar.d;
                textView2.setScaleX(ovVar.v);
                textView2.setScaleY(ovVar.v);
                textView2.setAlpha(ovVar.v);
                return;
            case 19:
                zv zvVar = (zv) this.f25241b;
                zvVar.getClass();
                zvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.d();
                return;
            case 20:
                bw bwVar = (bw) this.f25241b;
                bwVar.getClass();
                bwVar.f23068r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.invalidate();
                bwVar.requestLayout();
                bwVar.c();
                bwVar.f23069s.f30584b.invalidate();
                return;
            case 21:
                ty tyVar = (ty) this.f25241b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                return;
            case 22:
                xy xyVar = (xy) this.f25241b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.f30385w = floatValue4;
                View view2 = xyVar.v;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                ci.n6 n6Var2 = xyVar.f30384s;
                if (n6Var2 != null) {
                    n6Var2.invalidate();
                    return;
                }
                return;
            case 23:
                k00 k00Var = ((c00) this.f25241b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 24:
                s00 s00Var = (s00) this.f25241b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                return;
            case 25:
                z20 z20Var = (z20) this.f25241b;
                x20 x20Var = z20Var.f30675a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.f30678b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.f30678b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30678b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                a60 a60Var = (a60) this.f25241b;
                if (a60Var.f22555q0) {
                    Camera2Session camera2Session = a60Var.f22561u0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = a60Var.f22557r0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                j70.P((j70) this.f25241b, valueAnimator);
                return;
            case 28:
                j70 j70Var = ((i70) this.f25241b).e;
                j70Var.f25259k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j70.U(j70Var).invalidate();
                return;
            default:
                v70 v70Var = (v70) this.f25241b;
                v70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t70 t70Var = v70Var.f28998x;
                if (t70Var != null) {
                    t70Var.setProgress(floatValue6);
                    return;
                }
                return;
        }
    }
}
