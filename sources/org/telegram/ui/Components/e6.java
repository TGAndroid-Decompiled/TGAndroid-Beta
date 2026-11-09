package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33306a;
    public final Object f33307b;

    public e6(Object obj, int i7) {
        this.f33306a = i7;
        this.f33307b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33306a) {
            case 0:
                i6 i6Var = (i6) this.f33307b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.f34601q = floatValue;
                TimeInterpolator timeInterpolator = i6Var.f34607x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                i6Var.f34602r = floatValue;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34588b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                q6 q6Var = (q6) this.f33307b;
                q6Var.f37202a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                return;
            case 2:
                b8 b8Var = (b8) this.f33307b;
                b8Var.f32164z1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                b8Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                t8 t8Var = (t8) this.f33307b;
                t8Var.getClass();
                t8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                y8 y8Var = (y8) this.f33307b;
                y8Var.getClass();
                y8Var.f40647e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.d();
                return;
            case 5:
                n9 n9Var = (n9) this.f33307b;
                n9Var.getClass();
                n9Var.f36297g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.invalidateSelf();
                return;
            case 6:
                ca caVar = (ca) this.f33307b;
                caVar.getClass();
                caVar.f32602f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.f32599b.invalidate();
                return;
            case 7:
                ic icVar = (ic) this.f33307b;
                icVar.getClass();
                icVar.f34703j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                icVar.b();
                return;
            case 8:
                dg dgVar = (dg) this.f33307b;
                dgVar.getClass();
                dgVar.f32960d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = ((jh) this.f33307b).f35021e;
                dh dhVar = diVar.f33044r3;
                dhVar.setAlpha(1.0f - floatValue2);
                diVar.f33072y3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                diVar.f33076z3 = L;
                dhVar.setTranslationY(L);
                return;
            case 10:
                dh dhVar2 = (dh) this.f33307b;
                di diVar2 = dhVar2.f32980b;
                diVar2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                diVar2.f33063w2.invalidate();
                diVar2.f33067x2.invalidate();
                dhVar2.invalidate();
                return;
            case 11:
                ((ik) this.f33307b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                yl ylVar = (yl) this.f33307b;
                ylVar.getClass();
                ylVar.f40749l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ylVar.O.f41021z.invalidate();
                return;
            case 13:
                co coVar = (co) this.f33307b;
                coVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.d = floatValue3;
                coVar.setShown(floatValue3);
                coVar.a(false);
                return;
            case 14:
                vo voVar = (vo) this.f33307b;
                voVar.getClass();
                voVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.f39158z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 15:
                bq bqVar = (bq) this.f33307b;
                bqVar.getClass();
                bqVar.f32371l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = bqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                ru ruVar = (ru) this.f33307b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.A1 = floatValue4;
                ruVar.n1.setAlpha(floatValue4);
                ruVar.f37813r1.setAlpha(ruVar.A1);
                ruVar.f37814s1.setAlpha(ruVar.A1);
                ruVar.f28624b.invalidate();
                return;
            case 17:
                ku kuVar = (ku) this.f33307b;
                kuVar.getClass();
                kuVar.f35487e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kuVar.getParent() instanceof View) {
                    ((View) kuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                nu nuVar = (nu) this.f33307b;
                nuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nuVar.f36509w = floatValue5;
                TextView textView = nuVar.f36503c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - nuVar.f36509w);
                textView.setAlpha(1.0f - nuVar.f36509w);
                TextView textView2 = nuVar.d;
                textView2.setScaleX(nuVar.f36509w);
                textView2.setScaleY(nuVar.f36509w);
                textView2.setAlpha(nuVar.f36509w);
                return;
            case 19:
                xu xuVar = (xu) this.f33307b;
                xuVar.getClass();
                xuVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.d();
                return;
            case 20:
                zu zuVar = (zu) this.f33307b;
                zuVar.getClass();
                zuVar.f41139r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.invalidate();
                zuVar.requestLayout();
                zuVar.c();
                zuVar.f41140s.f40097b.invalidate();
                return;
            case 21:
                qx qxVar = (qx) this.f33307b;
                qxVar.getClass();
                qxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qxVar.invalidate();
                return;
            case 22:
                ux uxVar = (ux) this.f33307b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uxVar.f38827x = floatValue6;
                View view2 = uxVar.f38826w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                bi.x5 x5Var = uxVar.f38825s;
                if (x5Var != null) {
                    x5Var.invalidate();
                    return;
                }
                return;
            case 23:
                fz fzVar = ((zy) this.f33307b).F;
                fzVar.F.invalidate();
                fzVar.invalidate();
                return;
            case 24:
                lz lzVar = (lz) this.f33307b;
                lzVar.getClass();
                lzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lzVar.invalidate();
                return;
            case 25:
                q10 q10Var = (q10) this.f33307b;
                n10 n10Var = q10Var.f37164a;
                if (!q10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    q10Var.f37169c0 = floatValue7;
                    q10Var.V.setPinnedProgress(floatValue7);
                    n10Var.setScaleX(1.0f - (q10Var.f37169c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (q10Var.f37169c0 * 0.6f));
                    if (q10Var.X) {
                        q10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                p40 p40Var = (p40) this.f33307b;
                if (p40Var.f36914r0) {
                    Camera2Session camera2Session = p40Var.f36919v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = p40Var.f36916s0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                y50 y50Var = (y50) this.f33307b;
                y50Var.getClass();
                y50Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y50Var.f28624b.invalidate();
                return;
            default:
                y50 y50Var2 = ((x50) this.f33307b).f40303e;
                y50Var2.f40601b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y50Var2.f28624b.invalidate();
                return;
        }
    }
}
