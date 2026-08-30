package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33875a;
    public final Object f33876b;

    public e3(Object obj, int i10) {
        this.f33875a = i10;
        this.f33876b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f33875a) {
            case 0:
                f3 f3Var = (f3) this.f33876b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f34149f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                t4 t4Var = (t4) this.f33876b;
                float lerp = AndroidUtilities.lerp(t4Var.f38542n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                t4Var.f38541f.setAlpha(i10);
                t4Var.h.setAlpha(i10);
                t4Var.f38543r.setAlpha((int) (66.0f * lerp));
                t4Var.f38544s.setAlpha((int) (85.0f * lerp));
                t4Var.v.setAlpha(i10);
                t4Var.D = lerp;
                t4Var.invalidate();
                return;
            case 2:
                b7.X((b7) this.f33876b, valueAnimator);
                return;
            case 3:
                j8 j8Var = (j8) this.f33876b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.f35257b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.f35257b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                nd ndVar = (nd) this.f33876b;
                ndVar.f36578b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f36578b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.mr) this.f33876b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                al alVar = (al) this.f33876b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                return;
            case 7:
                dp dpVar = (dp) this.f33876b;
                dpVar.f33767r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dpVar.f33767r.invalidateSelf();
                return;
            case 8:
                bs bsVar = (bs) this.f33876b;
                bsVar.getClass();
                bsVar.f33024w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                wr wrVar = (wr) this.f33876b;
                wrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wrVar.invalidate();
                if (wrVar.getParent() != null) {
                    ((ViewGroup) wrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                ky kyVar = (ky) this.f33876b;
                kyVar.getClass();
                kyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                gz gzVar = (gz) this.f33876b;
                gzVar.getClass();
                gzVar.f34707r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.p9 p9Var = gzVar.f34704c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = gzVar.f34702a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(gzVar.f34707r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                p9Var.invalidate();
                org.telegram.ui.Components.p9 p9Var2 = gzVar.f34705f;
                p9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - gzVar.f34707r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                p9Var2.invalidate();
                return;
            case 12:
                yz yzVar = (yz) this.f33876b;
                yzVar.f40607n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yzVar.f40607n.invalidateSelf();
                return;
            case 13:
                u00 u00Var = (u00) this.f33876b;
                u00Var.getClass();
                u00Var.f38795s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 14:
                v10 v10Var = (v10) this.f33876b;
                v10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = v10Var.f39053c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = v10Var.f39054f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                c60 c60Var = (c60) this.f33876b;
                c60Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c60Var.L1(true);
                c60Var.e.invalidate();
                c60Var.N.invalidate();
                return;
            case 16:
                m50 m50Var = (m50) this.f33876b;
                m50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m50Var.f36190a.invalidate();
                return;
            case 17:
                q50 q50Var = (q50) this.f33876b;
                q50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c60 c60Var2 = q50Var.L;
                c60Var2.N.invalidate();
                c60Var2.X1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var2).containerView;
                viewGroup.invalidate();
                c60.J0(c60Var2);
                return;
            case 18:
                uj0 uj0Var = (uj0) this.f33876b;
                uj0Var.getClass();
                uj0Var.f38958f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                uj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f33876b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((ht0) this.f33876b).d;
                photoViewer.Q1.f38745h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Q1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((ht0) this.f33876b).d;
                photoViewer2.Q1.f38745h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.Q1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.mm0) this.f33876b).f27076b).Q1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((kt0) this.f33876b).f35813r;
                photoViewer3.f31783j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                au0 au0Var = (au0) this.f33876b;
                au0Var.getClass();
                au0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                vu0 vu0Var = (vu0) this.f33876b;
                vu0Var.getClass();
                vu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var.e();
                return;
            case 26:
                ((ny0) this.f33876b).G.f32028a.invalidate();
                return;
            case 27:
                ((sz0) this.f33876b).f38463d2.U4();
                return;
            case 28:
                h01 h01Var = (h01) this.f33876b;
                float[] fArr = h01Var.f34720n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                h01Var.C = animatedFraction;
                h01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                j01 j01Var = (j01) this.f33876b;
                float lerp2 = AndroidUtilities.lerp(j01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = j01Var.f35196n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null && !profileActivity.f32113m2) {
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
                j01Var.setScaleX(lerp2);
                j01Var.setScaleY(lerp2);
                j01Var.setAlpha(lerp2);
                return;
        }
    }
}
