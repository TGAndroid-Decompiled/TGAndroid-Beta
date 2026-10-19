package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36540a;
    public final Object f36541b;

    public e3(Object obj, int i10) {
        this.f36540a = i10;
        this.f36541b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36540a) {
            case 0:
                f3 f3Var = (f3) this.f36541b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                f3Var.f36883f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                w4 w4Var = (w4) this.f36541b;
                float lerp = AndroidUtilities.lerp(w4Var.f42457n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                w4Var.f42456f.setAlpha(i10);
                w4Var.h.setAlpha(i10);
                w4Var.f42458r.setAlpha((int) (66.0f * lerp));
                w4Var.f42459s.setAlpha((int) (85.0f * lerp));
                w4Var.v.setAlpha(i10);
                w4Var.G = lerp;
                w4Var.invalidate();
                return;
            case 2:
                c7.X((c7) this.f36541b, valueAnimator);
                return;
            case 3:
                k8 k8Var = (k8) this.f36541b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < k8Var.f38434b.getChildCount(); i11++) {
                    h8.b((h8) k8Var.f38434b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                md mdVar = (md) this.f36541b;
                mdVar.f39208b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.f39208b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.as) this.f36541b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                vk vkVar = (vk) this.f36541b;
                vkVar.getClass();
                vkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vkVar.invalidate();
                return;
            case 7:
                wo woVar = (wo) this.f36541b;
                woVar.f42922r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                woVar.f42922r.invalidateSelf();
                return;
            case 8:
                tr trVar = (tr) this.f36541b;
                trVar.getClass();
                trVar.f41746w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.invalidate();
                if (trVar.getParent() != null) {
                    ((ViewGroup) trVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                or orVar = (or) this.f36541b;
                orVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                orVar.invalidate();
                if (orVar.getParent() != null) {
                    ((ViewGroup) orVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                xx xxVar = (xx) this.f36541b;
                xxVar.getClass();
                xxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                ty tyVar = (ty) this.f36541b;
                tyVar.getClass();
                tyVar.f41780r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = tyVar.f41777c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = tyVar.f41775a;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int f7 = i0.a.f(tyVar.f41780r, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = tyVar.f41778f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - tyVar.f41780r, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), mode));
                w9Var2.invalidate();
                return;
            case 12:
                lz lzVar = (lz) this.f36541b;
                lzVar.f39087n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lzVar.f39087n.invalidateSelf();
                return;
            case 13:
                g00 g00Var = (g00) this.f36541b;
                g00Var.getClass();
                g00Var.f37159s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g00Var.invalidate();
                return;
            case 14:
                h10 h10Var = (h10) this.f36541b;
                h10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = h10Var.f37476c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = h10Var.f37477f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                q50 q50Var = (q50) this.f36541b;
                q50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q50Var.M1(true);
                q50Var.e.invalidate();
                q50Var.Q.invalidate();
                return;
            case 16:
                a50 a50Var = (a50) this.f36541b;
                a50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a50Var.f35265a.invalidate();
                return;
            case 17:
                e50 e50Var = (e50) this.f36541b;
                e50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q50 q50Var2 = e50Var.L;
                q50Var2.Q.invalidate();
                q50Var2.a2.invalidate();
                q50.A0(q50Var2).invalidate();
                q50.K0(q50Var2);
                return;
            case 18:
                oj0 oj0Var = (oj0) this.f36541b;
                oj0Var.getClass();
                oj0Var.f39913f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36541b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((it0) this.f36541b).d;
                photoViewer.T1.f42045k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((it0) this.f36541b).d;
                photoViewer2.T1.f42045k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.cn0) this.f36541b).f25289b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((lt0) this.f36541b).f39047r;
                photoViewer3.f33346m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                au0 au0Var = (au0) this.f36541b;
                au0Var.getClass();
                au0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                vu0 vu0Var = (vu0) this.f36541b;
                vu0Var.getClass();
                vu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var.e();
                return;
            case 26:
                ((iy0) this.f36541b).G.f33574a.invalidate();
                return;
            case 27:
                ((nz0) this.f36541b).f39721g2.U4();
                return;
            case 28:
                c01 c01Var = (c01) this.f36541b;
                float[] fArr = c01Var.f35770n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                c01Var.F = animatedFraction;
                c01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                e01 e01Var = (e01) this.f36541b;
                float lerp2 = AndroidUtilities.lerp(e01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = e01Var.f36487n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                if (u0Var != null && !profileActivity.f33688q2) {
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
                e01Var.setScaleX(lerp2);
                e01Var.setScaleY(lerp2);
                e01Var.setAlpha(lerp2);
                return;
        }
    }
}
