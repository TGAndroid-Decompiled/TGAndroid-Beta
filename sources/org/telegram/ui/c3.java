package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32536a;
    public final Object f32537b;

    public c3(Object obj, int i10) {
        this.f32536a = i10;
        this.f32537b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32536a) {
            case 0:
                d3 d3Var = (d3) this.f32537b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f32885f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f32537b;
                float lerp = AndroidUtilities.lerp(q4Var.f36761n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                q4Var.f36760f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f36762r.setAlpha((int) (66.0f * lerp));
                q4Var.f36763s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i10);
                q4Var.G = lerp;
                q4Var.invalidate();
                return;
            case 2:
                z6.X((z6) this.f32537b, valueAnimator);
                return;
            case 3:
                h8 h8Var = (h8) this.f32537b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f34126b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f34126b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                ld ldVar = (ld) this.f32537b;
                ldVar.f35269b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ldVar.f35269b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.qr) this.f32537b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                al alVar = (al) this.f32537b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                return;
            case 7:
                fp fpVar = (fp) this.f32537b;
                fpVar.f33715r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                fpVar.f33715r.invalidateSelf();
                return;
            case 8:
                as asVar = (as) this.f32537b;
                asVar.getClass();
                asVar.f32212w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                asVar.invalidate();
                if (asVar.getParent() != null) {
                    ((ViewGroup) asVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                wr wrVar = (wr) this.f32537b;
                wrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wrVar.invalidate();
                if (wrVar.getParent() != null) {
                    ((ViewGroup) wrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                my myVar = (my) this.f32537b;
                myVar.getClass();
                myVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                hz hzVar = (hz) this.f32537b;
                hzVar.getClass();
                hzVar.f34319r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = hzVar.f34316c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = hzVar.f34314a;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(hzVar.f34319r, v02, org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = hzVar.f34317f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f34319r, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i13, d6Var)), mode));
                w9Var2.invalidate();
                return;
            case 12:
                yz yzVar = (yz) this.f32537b;
                yzVar.f40272n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yzVar.f40272n.invalidateSelf();
                return;
            case 13:
                u00 u00Var = (u00) this.f32537b;
                u00Var.getClass();
                u00Var.f38252s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                return;
            case 14:
                v10 v10Var = (v10) this.f32537b;
                v10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = v10Var.f38575c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = v10Var.f38576f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                d60 d60Var = (d60) this.f32537b;
                d60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60Var.L1(true);
                d60Var.e.invalidate();
                d60Var.Q.invalidate();
                return;
            case 16:
                m50 m50Var = (m50) this.f32537b;
                m50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m50Var.f35468a.invalidate();
                return;
            case 17:
                r50 r50Var = (r50) this.f32537b;
                r50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var2 = r50Var.L;
                d60Var2.Q.invalidate();
                d60Var2.a2.invalidate();
                d60.z0(d60Var2).invalidate();
                d60.J0(d60Var2);
                return;
            case 18:
                yj0 yj0Var = (yj0) this.f32537b;
                yj0Var.getClass();
                yj0Var.f40167f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                yj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32537b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((ut0) this.f32537b).d;
                photoViewer.T1.f34048k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((ut0) this.f32537b).d;
                photoViewer2.T1.f34048k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.qm0) this.f32537b).f27707b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((xt0) this.f32537b).f39974r;
                photoViewer3.f31282m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                mu0 mu0Var = (mu0) this.f32537b;
                mu0Var.getClass();
                mu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                hv0 hv0Var = (hv0) this.f32537b;
                hv0Var.getClass();
                hv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hv0Var.e();
                return;
            case 26:
                ((xy0) this.f32537b).G.f31510a.invalidate();
                return;
            case 27:
                ((c01) this.f32537b).f32523g2.U4();
                return;
            case 28:
                r01 r01Var = (r01) this.f32537b;
                float[] fArr = r01Var.f37144n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                r01Var.F = animatedFraction;
                r01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                t01 t01Var = (t01) this.f32537b;
                float lerp2 = AndroidUtilities.lerp(t01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = t01Var.f37891n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null && !profileActivity.f31617p2) {
                    float f12 = 1.0f - lerp2;
                    u0Var.setScaleX(f12);
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
                t01Var.setScaleX(lerp2);
                t01Var.setScaleY(lerp2);
                t01Var.setAlpha(lerp2);
                return;
        }
    }
}
