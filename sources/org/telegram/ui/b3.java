package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32042a;
    public final Object f32043b;

    public b3(Object obj, int i10) {
        this.f32042a = i10;
        this.f32043b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f32042a) {
            case 0:
                c3 c3Var = (c3) this.f32043b;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f32658f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f32043b;
                float lerp = AndroidUtilities.lerp(q4Var.f36806n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                q4Var.f36805f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f36807r.setAlpha((int) (66.0f * lerp));
                q4Var.f36808s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i10);
                q4Var.G = lerp;
                q4Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) this.f32043b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.f34798b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.f34798b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                nd ndVar = (nd) this.f32043b;
                ndVar.f36044b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f36044b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.pr) this.f32043b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                dl dlVar = (dl) this.f32043b;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                return;
            case 6:
                kp kpVar = (kp) this.f32043b;
                kpVar.f35343r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kpVar.f35343r.invalidateSelf();
                return;
            case 7:
                is isVar = (is) this.f32043b;
                isVar.getClass();
                isVar.f34677w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                isVar.invalidate();
                if (isVar.getParent() != null) {
                    ((ViewGroup) isVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                ds dsVar = (ds) this.f32043b;
                dsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                sy syVar = (sy) this.f32043b;
                syVar.getClass();
                syVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                nz nzVar = (nz) this.f32043b;
                nzVar.getClass();
                nzVar.f36188r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.u9 u9Var = nzVar.f36185c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = nzVar.f36183a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(nzVar.f36188r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                u9Var.invalidate();
                org.telegram.ui.Components.u9 u9Var2 = nzVar.f36186f;
                u9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - nzVar.f36188r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                u9Var2.invalidate();
                return;
            case 11:
                e00 e00Var = (e00) this.f32043b;
                e00Var.f33253n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e00Var.f33253n.invalidateSelf();
                return;
            case 12:
                a10 a10Var = (a10) this.f32043b;
                a10Var.getClass();
                a10Var.f31674s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 13:
                b20 b20Var = (b20) this.f32043b;
                b20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = b20Var.f32032c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = b20Var.f32033f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 14:
                k60 k60Var = (k60) this.f32043b;
                k60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k60Var.L1(true);
                k60Var.e.invalidate();
                k60Var.Q.invalidate();
                return;
            case 15:
                t50 t50Var = (t50) this.f32043b;
                t50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t50Var.f37659a.invalidate();
                return;
            case 16:
                y50 y50Var = (y50) this.f32043b;
                y50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k60 k60Var2 = y50Var.L;
                k60Var2.Q.invalidate();
                k60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var2).containerView;
                viewGroup.invalidate();
                k60.J0(k60Var2);
                return;
            case 17:
                gk0 gk0Var = (gk0) this.f32043b;
                gk0Var.getClass();
                gk0Var.f34012f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                gk0Var.invalidate();
                return;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32043b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 19:
                PhotoViewer photoViewer = ((eu0) this.f32043b).d;
                photoViewer.T1.f37036k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 20:
                PhotoViewer photoViewer2 = ((eu0) this.f32043b).d;
                photoViewer2.T1.f37036k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.fm0) this.f32043b).f23966b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 22:
                PhotoViewer photoViewer3 = ((hu0) this.f32043b).f34357r;
                photoViewer3.f31027m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 23:
                wu0 wu0Var = (wu0) this.f32043b;
                wu0Var.getClass();
                wu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                rv0 rv0Var = (rv0) this.f32043b;
                rv0Var.getClass();
                rv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv0Var.e();
                return;
            case 25:
                ((iz0) this.f32043b).G.f31255a.invalidate();
                return;
            case 26:
                ((n01) this.f32043b).f35923g2.U4();
                return;
            case 27:
                c11 c11Var = (c11) this.f32043b;
                float[] fArr = c11Var.f32632n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                c11Var.F = animatedFraction;
                c11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            case 28:
                e11 e11Var = (e11) this.f32043b;
                float lerp2 = AndroidUtilities.lerp(e11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = e11Var.f33266n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null && !profileActivity.f31362p2) {
                    float f12 = 1.0f - lerp2;
                    w0Var.setScaleX(f12);
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
                e11Var.setScaleX(lerp2);
                e11Var.setScaleY(lerp2);
                e11Var.setAlpha(lerp2);
                return;
            default:
                c21 c21Var = (c21) this.f32043b;
                c21Var.f32654y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c21Var.a();
                return;
        }
    }
}
