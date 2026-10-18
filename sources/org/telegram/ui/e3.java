package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36384a;
    public final Object f36385b;

    public e3(Object obj, int i10) {
        this.f36384a = i10;
        this.f36385b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36384a) {
            case 0:
                f3 f3Var = (f3) this.f36385b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                f3Var.f36806f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                w4 w4Var = (w4) this.f36385b;
                float lerp = AndroidUtilities.lerp(w4Var.f42372n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                w4Var.f42371f.setAlpha(i10);
                w4Var.h.setAlpha(i10);
                w4Var.f42373r.setAlpha((int) (66.0f * lerp));
                w4Var.f42374s.setAlpha((int) (85.0f * lerp));
                w4Var.v.setAlpha(i10);
                w4Var.G = lerp;
                w4Var.invalidate();
                return;
            case 2:
                c7.X((c7) this.f36385b, valueAnimator);
                return;
            case 3:
                k8 k8Var = (k8) this.f36385b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < k8Var.f38424b.getChildCount(); i11++) {
                    h8.b((h8) k8Var.f38424b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                od odVar = (od) this.f36385b;
                odVar.f39733b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                odVar.f39733b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.as) this.f36385b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                xk xkVar = (xk) this.f36385b;
                xkVar.getClass();
                xkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xkVar.invalidate();
                return;
            case 7:
                yo yoVar = (yo) this.f36385b;
                yoVar.f43479r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yoVar.f43479r.invalidateSelf();
                return;
            case 8:
                vr vrVar = (vr) this.f36385b;
                vrVar.getClass();
                vrVar.f42286w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.invalidate();
                if (vrVar.getParent() != null) {
                    ((ViewGroup) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                qr qrVar = (qr) this.f36385b;
                qrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qrVar.invalidate();
                if (qrVar.getParent() != null) {
                    ((ViewGroup) qrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                zx zxVar = (zx) this.f36385b;
                zxVar.getClass();
                zxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                vy vyVar = (vy) this.f36385b;
                vyVar.getClass();
                vyVar.f42320r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = vyVar.f42317c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = vyVar.f42315a;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int f7 = i0.a.f(vyVar.f42320r, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = vyVar.f42318f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.f42320r, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), mode));
                w9Var2.invalidate();
                return;
            case 12:
                nz nzVar = (nz) this.f36385b;
                nzVar.f39613n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nzVar.f39613n.invalidateSelf();
                return;
            case 13:
                i00 i00Var = (i00) this.f36385b;
                i00Var.getClass();
                i00Var.f37724s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var.invalidate();
                return;
            case 14:
                j10 j10Var = (j10) this.f36385b;
                j10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = j10Var.f38024c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = j10Var.f38025f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                s50 s50Var = (s50) this.f36385b;
                s50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.M1(true);
                s50Var.e.invalidate();
                s50Var.Q.invalidate();
                return;
            case 16:
                c50 c50Var = (c50) this.f36385b;
                c50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c50Var.f35834a.invalidate();
                return;
            case 17:
                g50 g50Var = (g50) this.f36385b;
                g50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50 s50Var2 = g50Var.L;
                s50Var2.Q.invalidate();
                s50Var2.a2.invalidate();
                s50.A0(s50Var2).invalidate();
                s50.K0(s50Var2);
                return;
            case 18:
                qj0 qj0Var = (qj0) this.f36385b;
                qj0Var.getClass();
                qj0Var.f40455f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36385b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((kt0) this.f36385b).d;
                photoViewer.T1.f42952k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((kt0) this.f36385b).d;
                photoViewer2.T1.f42952k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.cn0) this.f36385b).f25318b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((nt0) this.f36385b).f39573r;
                photoViewer3.f33347m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                cu0 cu0Var = (cu0) this.f36385b;
                cu0Var.getClass();
                cu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                xu0 xu0Var = (xu0) this.f36385b;
                xu0Var.getClass();
                xu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.e();
                return;
            case 26:
                ((ky0) this.f36385b).G.f33575a.invalidate();
                return;
            case 27:
                ((pz0) this.f36385b).f40284g2.U4();
                return;
            case 28:
                e01 e01Var = (e01) this.f36385b;
                float[] fArr = e01Var.f36361n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                e01Var.F = animatedFraction;
                e01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                g01 g01Var = (g01) this.f36385b;
                float lerp2 = AndroidUtilities.lerp(g01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = g01Var.f37048n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                if (u0Var != null && !profileActivity.f33689q2) {
                    float f13 = 1.0f - lerp2;
                    u0Var.setScaleX(f13);
                    profileActivity.V0.setScaleY(f13);
                    profileActivity.V0.setAlpha(f13);
                }
                if (profileActivity.O0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.T0.setScaleX(f14);
                    profileActivity.T0.setScaleY(f14);
                    profileActivity.T0.setAlpha(f14);
                }
                if (profileActivity.M0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.R0.setScaleX(f15);
                    profileActivity.R0.setScaleY(f15);
                    profileActivity.R0.setAlpha(f15);
                }
                if (profileActivity.N0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.S0.setScaleX(f16);
                    profileActivity.S0.setScaleY(f16);
                    profileActivity.S0.setAlpha(f16);
                }
                g01Var.setScaleX(lerp2);
                g01Var.setScaleY(lerp2);
                g01Var.setAlpha(lerp2);
                return;
        }
    }
}
