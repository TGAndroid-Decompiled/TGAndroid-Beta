package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34304a;
    public final Object f34305b;

    public g3(Object obj, int i10) {
        this.f34304a = i10;
        this.f34305b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f34304a) {
            case 0:
                h3 h3Var = (h3) this.f34305b;
                h3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                h3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                h3Var.f34559f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                v4 v4Var = (v4) this.f34305b;
                float lerp = AndroidUtilities.lerp(v4Var.f38996n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                v4Var.f38995f.setAlpha(i10);
                v4Var.h.setAlpha(i10);
                v4Var.f38997r.setAlpha((int) (66.0f * lerp));
                v4Var.f38998s.setAlpha((int) (85.0f * lerp));
                v4Var.v.setAlpha(i10);
                v4Var.D = lerp;
                v4Var.invalidate();
                return;
            case 2:
                d7.X((d7) this.f34305b, valueAnimator);
                return;
            case 3:
                l8 l8Var = (l8) this.f34305b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < l8Var.f35674b.getChildCount(); i11++) {
                    i8.b((i8) l8Var.f35674b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                pd pdVar = (pd) this.f34305b;
                pdVar.f37077b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                pdVar.f37077b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.lr) this.f34305b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                cl clVar = (cl) this.f34305b;
                clVar.getClass();
                clVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                clVar.invalidate();
                return;
            case 7:
                fp fpVar = (fp) this.f34305b;
                fpVar.f34198r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                fpVar.f34198r.invalidateSelf();
                return;
            case 8:
                ds dsVar = (ds) this.f34305b;
                dsVar.getClass();
                dsVar.f33524w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                yr yrVar = (yr) this.f34305b;
                yrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yrVar.invalidate();
                if (yrVar.getParent() != null) {
                    ((ViewGroup) yrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                my myVar = (my) this.f34305b;
                myVar.getClass();
                myVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                iz izVar = (iz) this.f34305b;
                izVar.getClass();
                izVar.f35052r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.p9 p9Var = izVar.f35049c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = izVar.f35047a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(izVar.f35052r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                p9Var.invalidate();
                org.telegram.ui.Components.p9 p9Var2 = izVar.f35050f;
                p9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.f35052r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                p9Var2.invalidate();
                return;
            case 12:
                a00 a00Var = (a00) this.f34305b;
                a00Var.f32402n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                a00Var.f32402n.invalidateSelf();
                return;
            case 13:
                v00 v00Var = (v00) this.f34305b;
                v00Var.getClass();
                v00Var.f38943s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.invalidate();
                return;
            case 14:
                x10 x10Var = (x10) this.f34305b;
                x10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = x10Var.f39819c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = x10Var.f39820f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                e60 e60Var = (e60) this.f34305b;
                e60Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60Var.L1(true);
                e60Var.e.invalidate();
                e60Var.N.invalidate();
                return;
            case 16:
                o50 o50Var = (o50) this.f34305b;
                o50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50Var.f36650a.invalidate();
                return;
            case 17:
                s50 s50Var = (s50) this.f34305b;
                s50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60 e60Var2 = s50Var.L;
                e60Var2.N.invalidate();
                e60Var2.X1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var2).containerView;
                viewGroup.invalidate();
                e60.J0(e60Var2);
                return;
            case 18:
                wj0 wj0Var = (wj0) this.f34305b;
                wj0Var.getClass();
                wj0Var.f39717f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                wj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34305b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((ot0) this.f34305b).d;
                photoViewer.Q1.f32655h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Q1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((ot0) this.f34305b).d;
                photoViewer2.Q1.f32655h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.Q1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.lm0) this.f34305b).f26803b).Q1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((rt0) this.f34305b).f38059r;
                photoViewer3.f31757j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                hu0 hu0Var = (hu0) this.f34305b;
                hu0Var.getClass();
                hu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                cv0 cv0Var = (cv0) this.f34305b;
                cv0Var.getClass();
                cv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.e();
                return;
            case 26:
                ((uy0) this.f34305b).G.f32002a.invalidate();
                return;
            case 27:
                ((zz0) this.f34305b).f40907d2.U4();
                return;
            case 28:
                o01 o01Var = (o01) this.f34305b;
                float[] fArr = o01Var.f36617n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                o01Var.C = animatedFraction;
                o01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                q01 q01Var = (q01) this.f34305b;
                float lerp2 = AndroidUtilities.lerp(q01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = q01Var.f37274n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null && !profileActivity.f32087m2) {
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
                q01Var.setScaleX(lerp2);
                q01Var.setScaleY(lerp2);
                q01Var.setAlpha(lerp2);
                return;
        }
    }
}
