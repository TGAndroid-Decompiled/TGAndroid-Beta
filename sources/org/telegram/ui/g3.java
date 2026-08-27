package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class g3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f38294a;

    public final Object f38295b;

    public g3(Object obj, int i10) {
        this.f38294a = i10;
        this.f38295b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38294a) {
            case 0:
                h3 h3Var = (h3) this.f38295b;
                h3Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.d.setTextColor(i0.b.d(fFloatValue, -16777216, -1));
                h3Var.f38670e.setTextColor(i0.b.d(fFloatValue, -16777216, -1));
                h3Var.f38671f.setTextColor(i0.b.d(fFloatValue, -16777216, -1));
                break;
            case 1:
                r4 r4Var = (r4) this.f38295b;
                float fLerp = AndroidUtilities.lerp(r4Var.f41800n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * fLerp);
                r4Var.f41799f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.f41801r.setAlpha((int) (66.0f * fLerp));
                r4Var.f41802s.setAlpha((int) (85.0f * fLerp));
                r4Var.v.setAlpha(i10);
                r4Var.C = fLerp;
                r4Var.invalidate();
                break;
            case 2:
                z6.X((z6) this.f38295b, valueAnimator);
                break;
            case 3:
                h8 h8Var = (h8) this.f38295b;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f38700b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f38700b.getChildAt(i11), fFloatValue2);
                }
                break;
            case 4:
                id idVar = (id) this.f38295b;
                idVar.f39031b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                idVar.f39031b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.dr) this.f38295b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                tk tkVar = (tk) this.f38295b;
                tkVar.getClass();
                tkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                tkVar.invalidate();
                break;
            case 7:
                xo xoVar = (xo) this.f38295b;
                xoVar.f44569r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xoVar.f44569r.invalidateSelf();
                break;
            case 8:
                wr wrVar = (wr) this.f38295b;
                wrVar.getClass();
                wrVar.f44179w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wrVar.invalidate();
                if (wrVar.getParent() != null) {
                    ((ViewGroup) wrVar.getParent()).invalidate();
                }
                break;
            case 9:
                sr srVar = (sr) this.f38295b;
                srVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.invalidate();
                if (srVar.getParent() != null) {
                    ((ViewGroup) srVar.getParent()).invalidate();
                }
                break;
            case 10:
                cy cyVar = (cy) this.f38295b;
                cyVar.getClass();
                cyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                xy xyVar = (xy) this.f38295b;
                xyVar.getClass();
                xyVar.f44644r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.n9 n9Var = xyVar.f44640c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = xyVar.f44638a;
                int iV0 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int iD = i0.b.d(xyVar.f44644r, iV0, org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                n9Var.setColorFilter(new PorterDuffColorFilter(iD, mode));
                n9Var.invalidate();
                org.telegram.ui.Components.n9 n9Var2 = xyVar.f44642f;
                n9Var2.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - xyVar.f44644r, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)), mode));
                n9Var2.invalidate();
                break;
            case 12:
                oz ozVar = (oz) this.f38295b;
                ozVar.f41221n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ozVar.f41221n.invalidateSelf();
                break;
            case 13:
                j00 j00Var = (j00) this.f38295b;
                j00Var.getClass();
                j00Var.f39205s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var.invalidate();
                break;
            case 14:
                k10 k10Var = (k10) this.f38295b;
                k10Var.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = k10Var.f39563c;
                imageView.setAlpha(fFloatValue3);
                float f10 = (fFloatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = k10Var.f39565f;
                float f11 = 1.0f - fFloatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                s50 s50Var = (s50) this.f38295b;
                s50Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.L1(true);
                s50Var.f42426e.invalidate();
                s50Var.M.invalidate();
                break;
            case 16:
                b50 b50Var = (b50) this.f38295b;
                b50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50Var.f36699a.invalidate();
                break;
            case 17:
                g50 g50Var = (g50) this.f38295b;
                g50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50 s50Var2 = g50Var.L;
                s50Var2.M.invalidate();
                s50Var2.W1.invalidate();
                ((org.telegram.ui.ActionBar.e3) s50Var2).containerView.invalidate();
                s50.J0(s50Var2);
                break;
            case 18:
                qj0 qj0Var = (qj0) this.f38295b;
                qj0Var.getClass();
                qj0Var.f41687f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qj0Var.invalidate();
                break;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38295b;
                passcodeActivity.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(fFloatValue4);
                passcodeActivity.v.setTranslationY((1.0f - fFloatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 20:
                PhotoViewer photoViewer = ((bt0) this.f38295b).d;
                photoViewer.P1.f40924g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.P1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((bt0) this.f38295b).d;
                photoViewer2.P1.f40924g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.P1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.sl0) this.f38295b).f32482b).P1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((et0) this.f38295b).f37840r;
                photoViewer3.f35663i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                tt0 tt0Var = (tt0) this.f38295b;
                tt0Var.getClass();
                tt0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                ou0 ou0Var = (ou0) this.f38295b;
                ou0Var.getClass();
                ou0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ou0Var.e();
                break;
            case 26:
                ((cy0) this.f38295b).G.f35921a.invalidate();
                break;
            case 27:
                ((hz0) this.f38295b).f38924c2.U4();
                break;
            case 28:
                wz0 wz0Var = (wz0) this.f38295b;
                float[] fArr = wz0Var.f44221n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                wz0Var.B = animatedFraction;
                wz0Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                yz0 yz0Var = (yz0) this.f38295b;
                float fLerp2 = AndroidUtilities.lerp(yz0Var.f44977e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = yz0Var.f44979n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                if (v0Var != null && !profileActivity.f36002l2) {
                    float f13 = 1.0f - fLerp2;
                    v0Var.setScaleX(f13);
                    profileActivity.Q0.setScaleY(f13);
                    profileActivity.Q0.setAlpha(f13);
                }
                if (profileActivity.J0) {
                    float f14 = 1.0f - fLerp2;
                    profileActivity.O0.setScaleX(f14);
                    profileActivity.O0.setScaleY(f14);
                    profileActivity.O0.setAlpha(f14);
                }
                if (profileActivity.H0) {
                    float f15 = 1.0f - fLerp2;
                    profileActivity.M0.setScaleX(f15);
                    profileActivity.M0.setScaleY(f15);
                    profileActivity.M0.setAlpha(f15);
                }
                if (profileActivity.I0) {
                    float f16 = 1.0f - fLerp2;
                    profileActivity.N0.setScaleX(f16);
                    profileActivity.N0.setScaleY(f16);
                    profileActivity.N0.setAlpha(f16);
                }
                yz0Var.setScaleX(fLerp2);
                yz0Var.setScaleY(fLerp2);
                yz0Var.setAlpha(fLerp2);
                break;
        }
    }
}
