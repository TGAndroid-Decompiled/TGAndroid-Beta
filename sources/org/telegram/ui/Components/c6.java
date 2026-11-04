package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class c6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32566a;
    public final Object f32567b;

    public c6(Object obj, int i3) {
        this.f32566a = i3;
        this.f32567b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32566a) {
            case 0:
                g6 g6Var = (g6) this.f32567b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.f33997q = floatValue;
                TimeInterpolator timeInterpolator = g6Var.f34003x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                g6Var.f33998r = floatValue;
                g6Var.invalidateSelf();
                Runnable runnable = g6Var.f33984b0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                o6 o6Var = (o6) this.f32567b;
                o6Var.f36742a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                o6Var.invalidate();
                return;
            case 2:
                z7 z7Var = (z7) this.f32567b;
                z7Var.A1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                z7Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                r8 r8Var = (r8) this.f32567b;
                r8Var.getClass();
                r8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                w8 w8Var = (w8) this.f32567b;
                w8Var.getClass();
                w8Var.f39950e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.d();
                return;
            case 5:
                m9 m9Var = (m9) this.f32567b;
                m9Var.getClass();
                m9Var.f36097g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.invalidateSelf();
                return;
            case 6:
                ba baVar = (ba) this.f32567b;
                baVar.getClass();
                baVar.f32128f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.f32125b.invalidate();
                return;
            case 7:
                gc gcVar = (gc) this.f32567b;
                gcVar.getClass();
                gcVar.f34050j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gcVar.b();
                return;
            case 8:
                bg bgVar = (bg) this.f32567b;
                bgVar.getClass();
                bgVar.f32187e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = ((gh) this.f32567b).f34095e;
                ah ahVar = biVar.f32272s3;
                ahVar.setAlpha(1.0f - floatValue2);
                biVar.f32300z3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                biVar.A3 = L;
                ahVar.setTranslationY(L);
                return;
            case 10:
                ah ahVar2 = (ah) this.f32567b;
                bi biVar2 = ahVar2.f31845b;
                biVar2.Q3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                biVar2.f32291x2.invalidate();
                biVar2.f32295y2.invalidate();
                ahVar2.invalidate();
                return;
            case 11:
                ((hk) this.f32567b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                xl xlVar = (xl) this.f32567b;
                xlVar.getClass();
                xlVar.f40398l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xlVar.O.f40783z.invalidate();
                return;
            case 13:
                bo boVar = (bo) this.f32567b;
                boVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.d = floatValue3;
                boVar.setShown(floatValue3);
                boVar.a(false);
                return;
            case 14:
                vo voVar = (vo) this.f32567b;
                voVar.getClass();
                voVar.X1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.A1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.X1);
                return;
            case 15:
                cq cqVar = (cq) this.f32567b;
                cqVar.getClass();
                cqVar.f32805l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cqVar.H;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                pu puVar = (pu) this.f32567b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                puVar.B1 = floatValue4;
                puVar.f37243o1.setAlpha(floatValue4);
                puVar.f37247s1.setAlpha(puVar.B1);
                puVar.f37248t1.setAlpha(puVar.B1);
                puVar.f28586b.invalidate();
                return;
            case 17:
                iu iuVar = (iu) this.f32567b;
                iuVar.getClass();
                iuVar.f34828e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (iuVar.getParent() instanceof View) {
                    ((View) iuVar.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                lu luVar = (lu) this.f32567b;
                luVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                luVar.f35888w = floatValue5;
                TextView textView = luVar.f35882c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - luVar.f35888w);
                textView.setAlpha(1.0f - luVar.f35888w);
                TextView textView2 = luVar.d;
                textView2.setScaleX(luVar.f35888w);
                textView2.setScaleY(luVar.f35888w);
                textView2.setAlpha(luVar.f35888w);
                return;
            case 19:
                vu vuVar = (vu) this.f32567b;
                vuVar.getClass();
                vuVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vuVar.d();
                return;
            case 20:
                xu xuVar = (xu) this.f32567b;
                xuVar.getClass();
                xuVar.f40481r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.invalidate();
                xuVar.requestLayout();
                xuVar.c();
                xuVar.f40482s.f41058b.invalidate();
                return;
            case 21:
                nx nxVar = (nx) this.f32567b;
                nxVar.getClass();
                nxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nxVar.invalidate();
                return;
            case 22:
                rx rxVar = (rx) this.f32567b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rxVar.f37834x = floatValue6;
                View view2 = rxVar.f37833w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                ai.c0 c0Var = rxVar.f37832s;
                if (c0Var != null) {
                    c0Var.invalidate();
                    return;
                }
                return;
            case 23:
                bz bzVar = ((vy) this.f32567b).F;
                bzVar.G.invalidate();
                bzVar.invalidate();
                return;
            case 24:
                hz hzVar = (hz) this.f32567b;
                hzVar.getClass();
                hzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hzVar.invalidate();
                return;
            case 25:
                l10 l10Var = (l10) this.f32567b;
                j10 j10Var = l10Var.f35547a;
                if (!l10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    l10Var.f35552c0 = floatValue7;
                    l10Var.V.setPinnedProgress(floatValue7);
                    j10Var.setScaleX(1.0f - (l10Var.f35552c0 * 0.6f));
                    j10Var.setScaleY(1.0f - (l10Var.f35552c0 * 0.6f));
                    if (l10Var.X) {
                        l10Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                k40 k40Var = (k40) this.f32567b;
                if (k40Var.f35297s0) {
                    Camera2Session camera2Session = k40Var.f35302w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    }
                    return;
                }
                CameraSession cameraSession = k40Var.f35298t0;
                if (cameraSession != null) {
                    cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            case 27:
                t50 t50Var = (t50) this.f32567b;
                t50Var.getClass();
                t50Var.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t50Var.f28586b.invalidate();
                return;
            case 28:
                t50 t50Var2 = ((s50) this.f32567b).f37912e;
                t50Var2.c2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t50Var2.f28586b.invalidate();
                return;
            default:
                f60 f60Var = (f60) this.f32567b;
                f60Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var = f60Var.f33751x;
                if (d60Var != null) {
                    d60Var.setProgress(floatValue8);
                    return;
                }
                return;
        }
    }
}
