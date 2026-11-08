package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33207a;
    public final Object f33208b;

    public e6(Object obj, int i7) {
        this.f33207a = i7;
        this.f33208b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33207a) {
            case 0:
                i6 i6Var = (i6) this.f33208b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.f34566q = floatValue;
                TimeInterpolator timeInterpolator = i6Var.f34572x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                i6Var.f34567r = floatValue;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34553b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                q6 q6Var = (q6) this.f33208b;
                q6Var.f37200a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                return;
            case 2:
                b8 b8Var = (b8) this.f33208b;
                b8Var.f32122z1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                b8Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                t8 t8Var = (t8) this.f33208b;
                t8Var.getClass();
                t8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                y8 y8Var = (y8) this.f33208b;
                y8Var.getClass();
                y8Var.f40605e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.d();
                return;
            case 5:
                n9 n9Var = (n9) this.f33208b;
                n9Var.getClass();
                n9Var.f36273g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.invalidateSelf();
                return;
            case 6:
                ca caVar = (ca) this.f33208b;
                caVar.getClass();
                caVar.f32505f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.f32502b.invalidate();
                return;
            case 7:
                ic icVar = (ic) this.f33208b;
                icVar.getClass();
                icVar.f34630j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                icVar.b();
                return;
            case 8:
                dg dgVar = (dg) this.f33208b;
                dgVar.getClass();
                dgVar.f32890d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = ((jh) this.f33208b).f34982e;
                dh dhVar = diVar.f32989r3;
                dhVar.setAlpha(1.0f - floatValue2);
                diVar.f33017y3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                diVar.f33021z3 = L;
                dhVar.setTranslationY(L);
                return;
            case 10:
                dh dhVar2 = (dh) this.f33208b;
                di diVar2 = dhVar2.f32908b;
                diVar2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                diVar2.f33008w2.invalidate();
                diVar2.f33012x2.invalidate();
                dhVar2.invalidate();
                return;
            case 11:
                ((ik) this.f33208b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                yl ylVar = (yl) this.f33208b;
                ylVar.getClass();
                ylVar.f40696l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ylVar.O.f41091z.invalidate();
                return;
            case 13:
                co coVar = (co) this.f33208b;
                coVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.d = floatValue3;
                coVar.setShown(floatValue3);
                coVar.a(false);
                return;
            case 14:
                vo voVar = (vo) this.f33208b;
                voVar.getClass();
                voVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.f39067z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 15:
                bq bqVar = (bq) this.f33208b;
                bqVar.getClass();
                bqVar.f32314l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = bqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                ru ruVar = (ru) this.f33208b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.A1 = floatValue4;
                ruVar.n1.setAlpha(floatValue4);
                ruVar.f37782r1.setAlpha(ruVar.A1);
                ruVar.f37783s1.setAlpha(ruVar.A1);
                ruVar.f28619b.invalidate();
                return;
            case 17:
                ku kuVar = (ku) this.f33208b;
                kuVar.getClass();
                kuVar.f35436e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kuVar.getParent() instanceof View) {
                    ((View) kuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                nu nuVar = (nu) this.f33208b;
                nuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nuVar.f36448w = floatValue5;
                TextView textView = nuVar.f36442c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - nuVar.f36448w);
                textView.setAlpha(1.0f - nuVar.f36448w);
                TextView textView2 = nuVar.d;
                textView2.setScaleX(nuVar.f36448w);
                textView2.setScaleY(nuVar.f36448w);
                textView2.setAlpha(nuVar.f36448w);
                return;
            case 19:
                xu xuVar = (xu) this.f33208b;
                xuVar.getClass();
                xuVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.d();
                return;
            case 20:
                zu zuVar = (zu) this.f33208b;
                zuVar.getClass();
                zuVar.f41149r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.invalidate();
                zuVar.requestLayout();
                zuVar.c();
                zuVar.f41150s.f39027b.invalidate();
                return;
            case 21:
                qx qxVar = (qx) this.f33208b;
                qxVar.getClass();
                qxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qxVar.invalidate();
                return;
            case 22:
                ux uxVar = (ux) this.f33208b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uxVar.f38774x = floatValue6;
                View view2 = uxVar.f38773w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                bi.x5 x5Var = uxVar.f38772s;
                if (x5Var != null) {
                    x5Var.invalidate();
                    return;
                }
                return;
            case 23:
                fz fzVar = ((zy) this.f33208b).F;
                fzVar.F.invalidate();
                fzVar.invalidate();
                return;
            case 24:
                lz lzVar = (lz) this.f33208b;
                lzVar.getClass();
                lzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lzVar.invalidate();
                return;
            case 25:
                p10 p10Var = (p10) this.f33208b;
                n10 n10Var = p10Var.f36764a;
                if (!p10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    p10Var.f36769c0 = floatValue7;
                    p10Var.V.setPinnedProgress(floatValue7);
                    n10Var.setScaleX(1.0f - (p10Var.f36769c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (p10Var.f36769c0 * 0.6f));
                    if (p10Var.X) {
                        p10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                o40 o40Var = (o40) this.f33208b;
                if (o40Var.f36565r0) {
                    Camera2Session camera2Session = o40Var.f36570v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = o40Var.f36567s0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                x50 x50Var = (x50) this.f33208b;
                x50Var.getClass();
                x50Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50Var.f28619b.invalidate();
                return;
            default:
                x50 x50Var2 = ((w50) this.f33208b).f39815e;
                x50Var2.f40213b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x50Var2.f28619b.invalidate();
                return;
        }
    }
}
