package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37873a;
    public final Object f37874b;

    public b3(Object obj, int i10) {
        this.f37873a = i10;
        this.f37874b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37873a;
        Object obj = this.f37874b;
        switch (i10) {
            case 0:
                c3 c3Var = (c3) obj;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.f38162f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                u4 u4Var = (u4) obj;
                float lerp = AndroidUtilities.lerp(u4Var.f43860n, valueAnimator.getAnimatedFraction());
                int i11 = (int) (255.0f * lerp);
                u4Var.f43859f.setAlpha(i11);
                u4Var.h.setAlpha(i11);
                u4Var.f43861r.setAlpha((int) (66.0f * lerp));
                u4Var.f43862s.setAlpha((int) (85.0f * lerp));
                u4Var.v.setAlpha(i11);
                u4Var.G = lerp;
                u4Var.invalidate();
                return;
            case 2:
                n8 n8Var = (n8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i12 = 0; i12 < n8Var.f41651b.getChildCount(); i12++) {
                    k8.b((k8) n8Var.f41651b.getChildAt(i12), floatValue2);
                }
                return;
            case 3:
                nd ndVar = (nd) obj;
                ndVar.f41745b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f41745b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.cs) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                zk zkVar = (zk) obj;
                zkVar.getClass();
                zkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                zkVar.invalidate();
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
                zr zrVar = (zr) obj;
                zrVar.getClass();
                zrVar.f46347w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zrVar.invalidate();
                if (zrVar.getParent() != null) {
                    ((ViewGroup) zrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                vr vrVar = (vr) obj;
                vrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.invalidate();
                if (vrVar.getParent() != null) {
                    ((ViewGroup) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                zx zxVar = (zx) obj;
                zxVar.getClass();
                zxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                vy vyVar = (vy) obj;
                vyVar.getClass();
                vyVar.f44445r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.y9 y9Var = vyVar.f44442c;
                int i13 = org.telegram.ui.ActionBar.y6.C6;
                org.telegram.ui.ActionBar.u6 u6Var = vyVar.f44440a;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                int i14 = org.telegram.ui.ActionBar.y6.Oh;
                int f7 = i0.a.f(vyVar.f44445r, w02, org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                y9Var.invalidate();
                org.telegram.ui.Components.y9 y9Var2 = vyVar.f44443f;
                y9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.f44445r, org.telegram.ui.ActionBar.y6.w0(i13, u6Var), org.telegram.ui.ActionBar.y6.w0(i14, u6Var)), mode));
                y9Var2.invalidate();
                return;
            case 11:
                j00 j00Var = (j00) obj;
                j00Var.getClass();
                j00Var.f40306s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var.invalidate();
                return;
            case 12:
                n10 n10Var = (n10) obj;
                n10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = n10Var.f41600c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = n10Var.f41601f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 13:
                x50 x50Var = (x50) obj;
                x50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50Var.M1(true);
                x50Var.e.invalidate();
                x50Var.Q.invalidate();
                return;
            case 14:
                g50 g50Var = (g50) obj;
                g50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g50Var.f39507a.invalidate();
                return;
            case 15:
                l50 l50Var = (l50) obj;
                l50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50 x50Var2 = l50Var.L;
                x50Var2.Q.invalidate();
                x50Var2.a2.invalidate();
                x50.z0(x50Var2).invalidate();
                x50.J0(x50Var2);
                return;
            case 16:
                zj0 zj0Var = (zj0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj0Var.M = floatValue4;
                zj0Var.f46294w.setAlpha(1.0f - floatValue4);
                zj0Var.f46294w.setScaleX(1.0f - (zj0Var.M * 0.1f));
                zj0Var.f46294w.setScaleY(1.0f - (zj0Var.M * 0.1f));
                zj0Var.v.setTranslationY((-AndroidUtilities.dp(42.0f)) * zj0Var.M);
                zj0Var.G.setTranslationY((-AndroidUtilities.dp(42.0f)) * zj0Var.M);
                return;
            case 17:
                bk0 bk0Var = (bk0) obj;
                bk0Var.getClass();
                bk0Var.f38050f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bk0Var.invalidate();
                return;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue5);
                passcodeActivity.v.setTranslationY((1.0f - floatValue5) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 19:
                PhotoViewer photoViewer = ((rt0) obj).d;
                photoViewer.T1.f38687k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 20:
                PhotoViewer photoViewer2 = ((rt0) obj).d;
                photoViewer2.T1.f38687k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.mn0) obj).f30564b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 22:
                PhotoViewer photoViewer3 = ((ut0) obj).f44110r;
                photoViewer3.f35744m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.I1();
                return;
            case 23:
                ju0 ju0Var = (ju0) obj;
                ju0Var.getClass();
                ju0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                ev0 ev0Var = (ev0) obj;
                ev0Var.getClass();
                ev0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ev0Var.e();
                return;
            case 25:
                ((sy0) obj).G.f35972a.invalidate();
                return;
            case 26:
                ProfileActivity profileActivity = ((xz0) obj).f45804s2;
                int i15 = ProfileActivity.R6;
                profileActivity.g5();
                return;
            case 27:
                m01 m01Var = (m01) obj;
                float[] fArr = m01Var.f41292n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                m01Var.F = animatedFraction;
                m01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            case 28:
                o01 o01Var = (o01) obj;
                float lerp2 = AndroidUtilities.lerp(o01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity2 = o01Var.f41950n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity2.U0;
                if (w0Var != null && !profileActivity2.f36080p2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                if (profileActivity2.N0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity2.S0.setScaleX(f14);
                    profileActivity2.S0.setScaleY(f14);
                    profileActivity2.S0.setAlpha(f14);
                }
                if (profileActivity2.L0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity2.Q0.setScaleX(f15);
                    profileActivity2.Q0.setScaleY(f15);
                    profileActivity2.Q0.setAlpha(f15);
                }
                if (profileActivity2.M0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity2.R0.setScaleX(f16);
                    profileActivity2.R0.setScaleY(f16);
                    profileActivity2.R0.setAlpha(f16);
                }
                o01Var.setScaleX(lerp2);
                o01Var.setScaleY(lerp2);
                o01Var.setAlpha(lerp2);
                return;
            default:
                n11 n11Var = (n11) obj;
                n11Var.f41612n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n11Var.b();
                return;
        }
    }
}
