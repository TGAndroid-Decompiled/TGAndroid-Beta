package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36383a;
    public final Object f36384b;

    public e3(Object obj, int i10) {
        this.f36383a = i10;
        this.f36384b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f36383a) {
            case 0:
                f3 f3Var = (f3) this.f36384b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f36740e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f36741f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                t4 t4Var = (t4) this.f36384b;
                float lerp = AndroidUtilities.lerp(t4Var.f41492n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                t4Var.f41491f.setAlpha(i10);
                t4Var.h.setAlpha(i10);
                t4Var.f41493r.setAlpha((int) (66.0f * lerp));
                t4Var.f41494s.setAlpha((int) (85.0f * lerp));
                t4Var.v.setAlpha(i10);
                t4Var.D = lerp;
                t4Var.invalidate();
                return;
            case 2:
                b7.X((b7) this.f36384b, valueAnimator);
                return;
            case 3:
                j8 j8Var = (j8) this.f36384b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.f38035b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.f38035b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                nd ndVar = (nd) this.f36384b;
                ndVar.f39385b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f39385b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.or) this.f36384b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                al alVar = (al) this.f36384b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                return;
            case 7:
                ep epVar = (ep) this.f36384b;
                epVar.f36651r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                epVar.f36651r.invalidateSelf();
                return;
            case 8:
                cs csVar = (cs) this.f36384b;
                csVar.getClass();
                csVar.f35902w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                csVar.invalidate();
                if (csVar.getParent() != null) {
                    ((ViewGroup) csVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                xr xrVar = (xr) this.f36384b;
                xrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                ly lyVar = (ly) this.f36384b;
                lyVar.getClass();
                lyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                hz hzVar = (hz) this.f36384b;
                hzVar.getClass();
                hzVar.f37696r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.p9 p9Var = hzVar.f37692c;
                int i12 = org.telegram.ui.ActionBar.k6.C6;
                org.telegram.ui.ActionBar.g6 g6Var = hzVar.f37690a;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
                int i13 = org.telegram.ui.ActionBar.k6.Oh;
                int d = i0.a.d(hzVar.f37696r, v02, org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                p9Var.invalidate();
                org.telegram.ui.Components.p9 p9Var2 = hzVar.f37694f;
                p9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f37696r, org.telegram.ui.ActionBar.k6.v0(i12, g6Var), org.telegram.ui.ActionBar.k6.v0(i13, g6Var)), mode));
                p9Var2.invalidate();
                return;
            case 12:
                zz zzVar = (zz) this.f36384b;
                zzVar.f44024n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                zzVar.f44024n.invalidateSelf();
                return;
            case 13:
                u00 u00Var = (u00) this.f36384b;
                u00Var.getClass();
                u00Var.f41751s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 14:
                w10 w10Var = (w10) this.f36384b;
                w10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = w10Var.f42341c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = w10Var.f42343f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                d60 d60Var = (d60) this.f36384b;
                d60Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60Var.L1(true);
                d60Var.f36027e.invalidate();
                d60Var.N.invalidate();
                return;
            case 16:
                n50 n50Var = (n50) this.f36384b;
                n50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n50Var.f39295a.invalidate();
                return;
            case 17:
                r50 r50Var = (r50) this.f36384b;
                r50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var2 = r50Var.L;
                d60Var2.N.invalidate();
                d60Var2.X1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var2).containerView;
                viewGroup.invalidate();
                d60.J0(d60Var2);
                return;
            case 18:
                wj0 wj0Var = (wj0) this.f36384b;
                wj0Var.getClass();
                wj0Var.f42836f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                wj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36384b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((jt0) this.f36384b).d;
                photoViewer.Q1.f42296h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Q1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((jt0) this.f36384b).d;
                photoViewer2.Q1.f42296h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.Q1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.nm0) this.f36384b).f29565b).Q1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((mt0) this.f36384b).f39226r;
                photoViewer3.f34309j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                cu0 cu0Var = (cu0) this.f36384b;
                cu0Var.getClass();
                cu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                xu0 xu0Var = (xu0) this.f36384b;
                xu0Var.getClass();
                xu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.e();
                return;
            case 26:
                ((py0) this.f36384b).G.f34560a.invalidate();
                return;
            case 27:
                ((uz0) this.f36384b).f42071d2.U4();
                return;
            case 28:
                j01 j01Var = (j01) this.f36384b;
                float[] fArr = j01Var.f37973n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                j01Var.C = animatedFraction;
                j01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                l01 l01Var = (l01) this.f36384b;
                float lerp2 = AndroidUtilities.lerp(l01Var.f38544e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = l01Var.f38546n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null && !profileActivity.f34646m2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity.R0.setScaleY(f13);
                    profileActivity.R0.setAlpha(f13);
                }
                if (profileActivity.K0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.P0.setScaleX(f14);
                    profileActivity.P0.setScaleY(f14);
                    profileActivity.P0.setAlpha(f14);
                }
                if (profileActivity.I0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f15);
                    profileActivity.N0.setScaleY(f15);
                    profileActivity.N0.setAlpha(f15);
                }
                if (profileActivity.J0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f16);
                    profileActivity.O0.setScaleY(f16);
                    profileActivity.O0.setAlpha(f16);
                }
                l01Var.setScaleX(lerp2);
                l01Var.setScaleY(lerp2);
                l01Var.setAlpha(lerp2);
                return;
        }
    }
}
