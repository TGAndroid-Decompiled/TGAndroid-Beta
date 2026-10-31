package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35537a;
    public final Object f35538b;

    public a3(Object obj, int i10) {
        this.f35537a = i10;
        this.f35538b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35537a;
        Object obj = this.f35538b;
        switch (i10) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.b.f(floatValue, -16777216, -1));
                b3Var.e.setTextColor(i0.b.f(floatValue, -16777216, -1));
                b3Var.f35968f.setTextColor(i0.b.f(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), q4Var.f40857n);
                int i11 = (int) (255.0f * U1);
                q4Var.f40856f.setAlpha(i11);
                q4Var.h.setAlpha(i11);
                q4Var.f40858r.setAlpha((int) (66.0f * U1));
                q4Var.f40859s.setAlpha((int) (85.0f * U1));
                q4Var.f40860w.setAlpha(i11);
                q4Var.G = U1;
                q4Var.invalidate();
                return;
            case 2:
                h8 h8Var = (h8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i12 = 0; i12 < h8Var.f37796b.getChildCount(); i12++) {
                    e8.b((e8) h8Var.f37796b.getChildAt(i12), floatValue2);
                }
                return;
            case 3:
                kd kdVar = (kd) obj;
                kdVar.f38745b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kdVar.f38745b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.fr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                dl dlVar = (dl) obj;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                return;
            case 6:
                iq iqVar = (iq) obj;
                iqVar.getClass();
                iqVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = iqVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                bs bsVar = (bs) obj;
                bsVar.getClass();
                bsVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                xr xrVar = (xr) obj;
                xrVar.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                wx wxVar = (wx) obj;
                wxVar.getClass();
                wxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                c00Var.f36346s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var.invalidate();
                return;
            case 11:
                b10 b10Var = (b10) obj;
                b10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = b10Var.f35934c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = b10Var.f35935f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 12:
                b50 b50Var = (b50) obj;
                b50Var.M2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50Var.O1(true);
                b50Var.l1.invalidate();
                b50Var.H1.invalidate();
                return;
            case 13:
                m40 m40Var = (m40) obj;
                m40Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m40Var.f39468a.invalidate();
                return;
            case 14:
                p40 p40Var = (p40) obj;
                p40Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50 b50Var2 = p40Var.L;
                b50Var2.H1.invalidate();
                b50Var2.R3.invalidate();
                b50Var2.f21586b.invalidate();
                b50.P0(b50Var2);
                return;
            case 15:
                yb0.c0((yb0) obj);
                return;
            case 16:
                ii0 ii0Var = (ii0) obj;
                ii0Var.getClass();
                ii0Var.f38267f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ii0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f33424w.setAlpha(floatValue4);
                passcodeActivity.f33424w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.i0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((gr0) obj).d;
                photoViewer.T1.f41928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((gr0) obj).d;
                photoViewer2.T1.f41928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.rl0) obj).f29952b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((jr0) obj).f38582r;
                photoViewer3.f33544m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.I1();
                return;
            case 22:
                zr0 zr0Var = (zr0) obj;
                zr0Var.getClass();
                zr0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                qs0 qs0Var = (qs0) obj;
                qs0Var.getClass();
                qs0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qs0Var.e();
                return;
            case 24:
                ((cw0) obj).G.f33772a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((ix0) obj).f38363x2;
                RectF rectF = ProfileActivity.R6;
                profileActivity.o5();
                return;
            case 26:
                yx0 yx0Var = (yx0) obj;
                float[] fArr = yx0Var.f43908n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                yx0Var.F = animatedFraction;
                yx0Var.e(true, org.telegram.messenger.i0.U1(animatedFraction, fArr));
                return;
            case 27:
                ay0 ay0Var = (ay0) obj;
                float U12 = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), ay0Var.e);
                ProfileActivity profileActivity2 = ay0Var.f35908n;
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity2.T0;
                if (p5Var != null && !profileActivity2.f33873o2) {
                    float f12 = 1.0f - U12;
                    p5Var.setScaleX(f12);
                    profileActivity2.T0.setScaleY(f12);
                    profileActivity2.T0.setAlpha(f12);
                }
                ay0Var.setScaleX(U12);
                ay0Var.setScaleY(U12);
                ay0Var.setAlpha(U12);
                return;
            case 28:
                zy0 zy0Var = (zy0) obj;
                zy0Var.f44257n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.b();
                return;
            default:
                jz0 jz0Var = (jz0) obj;
                jz0Var.D = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), jz0Var.E);
                jz0Var.h.setTextColor(i0.b.f(jz0Var.D, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21330z6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false)));
                return;
        }
    }
}
