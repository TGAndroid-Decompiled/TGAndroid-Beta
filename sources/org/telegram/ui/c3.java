package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36501a;
    public final Object f36502b;

    public c3(Object obj, int i10) {
        this.f36501a = i10;
        this.f36502b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36501a) {
            case 0:
                d3 d3Var = (d3) this.f36502b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f36811e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f36812f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f36502b;
                float lerp = AndroidUtilities.lerp(q4Var.f41002n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                q4Var.f41001f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f41003r.setAlpha((int) (66.0f * lerp));
                q4Var.f41004s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i10);
                q4Var.G = lerp;
                q4Var.invalidate();
                return;
            case 2:
                y6.X((y6) this.f36502b, valueAnimator);
                return;
            case 3:
                g8 g8Var = (g8) this.f36502b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < g8Var.f37913b.getChildCount(); i11++) {
                    d8.b((d8) g8Var.f37913b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                md mdVar = (md) this.f36502b;
                mdVar.f39838b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.f39838b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.gs) this.f36502b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                el elVar = (el) this.f36502b;
                elVar.getClass();
                elVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                elVar.invalidate();
                return;
            case 7:
                ip ipVar = (ip) this.f36502b;
                ipVar.f38728r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ipVar.f38728r.invalidateSelf();
                return;
            case 8:
                es esVar = (es) this.f36502b;
                esVar.getClass();
                esVar.f37324w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                esVar.invalidate();
                if (esVar.getParent() != null) {
                    ((ViewGroup) esVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                as asVar = (as) this.f36502b;
                asVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                asVar.invalidate();
                if (asVar.getParent() != null) {
                    ((ViewGroup) asVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                py pyVar = (py) this.f36502b;
                pyVar.getClass();
                pyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                kz kzVar = (kz) this.f36502b;
                kzVar.getClass();
                kzVar.f39376r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.y9 y9Var = kzVar.f39372c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.e6 e6Var = kzVar.f39370a;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(kzVar.f39376r, w02, org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                y9Var.invalidate();
                org.telegram.ui.Components.y9 y9Var2 = kzVar.f39374f;
                y9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - kzVar.f39376r, org.telegram.ui.ActionBar.i6.w0(i12, e6Var), org.telegram.ui.ActionBar.i6.w0(i13, e6Var)), mode));
                y9Var2.invalidate();
                return;
            case 12:
                c00 c00Var = (c00) this.f36502b;
                c00Var.f36476n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f36476n.invalidateSelf();
                return;
            case 13:
                y00 y00Var = (y00) this.f36502b;
                y00Var.getClass();
                y00Var.f44184s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 14:
                y10 y10Var = (y10) this.f36502b;
                y10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = y10Var.f44203c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = y10Var.f44205f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                g60 g60Var = (g60) this.f36502b;
                g60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60Var.M1(true);
                g60Var.f37803e.invalidate();
                g60Var.Q.invalidate();
                return;
            case 16:
                p50 p50Var = (p50) this.f36502b;
                p50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p50Var.f40667a.invalidate();
                return;
            case 17:
                u50 u50Var = (u50) this.f36502b;
                u50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60 g60Var2 = u50Var.L;
                g60Var2.Q.invalidate();
                g60Var2.a2.invalidate();
                g60.A0(g60Var2).invalidate();
                g60.K0(g60Var2);
                return;
            case 18:
                fk0 fk0Var = (fk0) this.f36502b;
                fk0Var.getClass();
                fk0Var.f37628f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                fk0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36502b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((du0) this.f36502b).d;
                photoViewer.T1.f40892k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((du0) this.f36502b).d;
                photoViewer2.T1.f40892k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.kn0) this.f36502b).f28114b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((gu0) this.f36502b).f38114r;
                photoViewer3.f33977m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                vu0 vu0Var = (vu0) this.f36502b;
                vu0Var.getClass();
                vu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                qv0 qv0Var = (qv0) this.f36502b;
                qv0Var.getClass();
                qv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.e();
                return;
            case 26:
                ((fz0) this.f36502b).G.f34211a.invalidate();
                return;
            case 27:
                ((k01) this.f36502b).f39052g2.U4();
                return;
            case 28:
                z01 z01Var = (z01) this.f36502b;
                float[] fArr = z01Var.f44443n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                z01Var.F = animatedFraction;
                z01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                b11 b11Var = (b11) this.f36502b;
                float lerp2 = AndroidUtilities.lerp(b11Var.f36091e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = b11Var.f36093n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f34319p2) {
                    float f12 = 1.0f - lerp2;
                    v0Var.setScaleX(f12);
                    profileActivity.U0.setScaleY(f12);
                    profileActivity.U0.setAlpha(f12);
                }
                if (profileActivity.N0) {
                    float f13 = 1.0f - lerp2;
                    profileActivity.S0.setScaleX(f13);
                    profileActivity.S0.setScaleY(f13);
                    profileActivity.S0.setAlpha(f13);
                }
                if (profileActivity.L0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.Q0.setScaleX(f14);
                    profileActivity.Q0.setScaleY(f14);
                    profileActivity.Q0.setAlpha(f14);
                }
                if (profileActivity.M0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.R0.setScaleX(f15);
                    profileActivity.R0.setScaleY(f15);
                    profileActivity.R0.setAlpha(f15);
                }
                b11Var.setScaleX(lerp2);
                b11Var.setScaleY(lerp2);
                b11Var.setAlpha(lerp2);
                return;
        }
    }
}
