package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36348a;
    public final Object f36349b;

    public e3(Object obj, int i10) {
        this.f36348a = i10;
        this.f36349b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36348a) {
            case 0:
                f3 f3Var = (f3) this.f36349b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f36642e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f36643f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                t4 t4Var = (t4) this.f36349b;
                float lerp = AndroidUtilities.lerp(t4Var.f41436n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                t4Var.f41435f.setAlpha(i10);
                t4Var.h.setAlpha(i10);
                t4Var.f41437r.setAlpha((int) (66.0f * lerp));
                t4Var.f41438s.setAlpha((int) (85.0f * lerp));
                t4Var.v.setAlpha(i10);
                t4Var.D = lerp;
                t4Var.invalidate();
                return;
            case 2:
                b7.X((b7) this.f36349b, valueAnimator);
                return;
            case 3:
                j8 j8Var = (j8) this.f36349b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.f37859b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.f37859b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                nd ndVar = (nd) this.f36349b;
                ndVar.f39299b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f39299b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.or) this.f36349b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                al alVar = (al) this.f36349b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                return;
            case 7:
                ep epVar = (ep) this.f36349b;
                epVar.f36558r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                epVar.f36558r.invalidateSelf();
                return;
            case 8:
                cs csVar = (cs) this.f36349b;
                csVar.getClass();
                csVar.f35853w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                csVar.invalidate();
                if (csVar.getParent() != null) {
                    ((ViewGroup) csVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                xr xrVar = (xr) this.f36349b;
                xrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                ly lyVar = (ly) this.f36349b;
                lyVar.getClass();
                lyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                hz hzVar = (hz) this.f36349b;
                hzVar.getClass();
                hzVar.f37507r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.p9 p9Var = hzVar.f37503c;
                int i12 = org.telegram.ui.ActionBar.k6.C6;
                org.telegram.ui.ActionBar.g6 g6Var = hzVar.f37501a;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
                int i13 = org.telegram.ui.ActionBar.k6.Oh;
                int d = i0.a.d(hzVar.f37507r, v02, org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                p9Var.invalidate();
                org.telegram.ui.Components.p9 p9Var2 = hzVar.f37505f;
                p9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f37507r, org.telegram.ui.ActionBar.k6.v0(i12, g6Var), org.telegram.ui.ActionBar.k6.v0(i13, g6Var)), mode));
                p9Var2.invalidate();
                return;
            case 12:
                zz zzVar = (zz) this.f36349b;
                zzVar.f44053n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                zzVar.f44053n.invalidateSelf();
                return;
            case 13:
                u00 u00Var = (u00) this.f36349b;
                u00Var.getClass();
                u00Var.f41677s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 14:
                v10 v10Var = (v10) this.f36349b;
                v10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = v10Var.f41979c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = v10Var.f41981f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                d60 d60Var = (d60) this.f36349b;
                d60Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60Var.L1(true);
                d60Var.f36006e.invalidate();
                d60Var.N.invalidate();
                return;
            case 16:
                n50 n50Var = (n50) this.f36349b;
                n50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n50Var.f39183a.invalidate();
                return;
            case 17:
                r50 r50Var = (r50) this.f36349b;
                r50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var2 = r50Var.L;
                d60Var2.N.invalidate();
                d60Var2.X1.invalidate();
                ((org.telegram.ui.ActionBar.h3) d60Var2).containerView.invalidate();
                d60.J0(d60Var2);
                return;
            case 18:
                wj0 wj0Var = (wj0) this.f36349b;
                wj0Var.getClass();
                wj0Var.f42797f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                wj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36349b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((ot0) this.f36349b).d;
                photoViewer.Q1.f35259h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Q1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((ot0) this.f36349b).d;
                photoViewer2.Q1.f35259h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.Q1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.mm0) this.f36349b).f29180b).Q1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((rt0) this.f36349b).f40943r;
                photoViewer3.f34309j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                hu0 hu0Var = (hu0) this.f36349b;
                hu0Var.getClass();
                hu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                cv0 cv0Var = (cv0) this.f36349b;
                cv0Var.getClass();
                cv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.e();
                return;
            case 26:
                ((uy0) this.f36349b).G.f34560a.invalidate();
                return;
            case 27:
                ((zz0) this.f36349b).f44060d2.U4();
                return;
            case 28:
                o01 o01Var = (o01) this.f36349b;
                float[] fArr = o01Var.f39496n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                o01Var.C = animatedFraction;
                o01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                q01 q01Var = (q01) this.f36349b;
                float lerp2 = AndroidUtilities.lerp(q01Var.f40290e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = q01Var.f40292n;
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
                q01Var.setScaleX(lerp2);
                q01Var.setScaleY(lerp2);
                q01Var.setAlpha(lerp2);
                return;
        }
    }
}
