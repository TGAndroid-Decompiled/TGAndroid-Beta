package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32852a;
    public final Object f32853b;

    public d3(Object obj, int i10) {
        this.f32852a = i10;
        this.f32853b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32852a) {
            case 0:
                e3 e3Var = (e3) this.f32853b;
                e3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                e3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                e3Var.f33114f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                s4 s4Var = (s4) this.f32853b;
                float lerp = AndroidUtilities.lerp(s4Var.f37296n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                s4Var.f37295f.setAlpha(i10);
                s4Var.h.setAlpha(i10);
                s4Var.f37297r.setAlpha((int) (66.0f * lerp));
                s4Var.f37298s.setAlpha((int) (85.0f * lerp));
                s4Var.v.setAlpha(i10);
                s4Var.G = lerp;
                s4Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f32853b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < k8Var.f34925b.getChildCount(); i11++) {
                    h8.b((h8) k8Var.f34925b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                nd ndVar = (nd) this.f32853b;
                ndVar.f35936b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f35936b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.rr) this.f32853b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                bl blVar = (bl) this.f32853b;
                blVar.getClass();
                blVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                blVar.invalidate();
                return;
            case 6:
                gp gpVar = (gp) this.f32853b;
                gpVar.f34006r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gpVar.f34006r.invalidateSelf();
                return;
            case 7:
                ds dsVar = (ds) this.f32853b;
                dsVar.getClass();
                dsVar.f33025w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                zr zrVar = (zr) this.f32853b;
                zrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zrVar.invalidate();
                if (zrVar.getParent() != null) {
                    ((ViewGroup) zrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                py pyVar = (py) this.f32853b;
                pyVar.getClass();
                pyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                kz kzVar = (kz) this.f32853b;
                kzVar.getClass();
                kzVar.f35202r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = kzVar.f35199c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.e6 e6Var = kzVar.f35197a;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i12, e6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(kzVar.f35202r, v02, org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = kzVar.f35200f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - kzVar.f35202r, org.telegram.ui.ActionBar.i6.v0(i12, e6Var), org.telegram.ui.ActionBar.i6.v0(i13, e6Var)), mode));
                w9Var2.invalidate();
                return;
            case 11:
                b00 b00Var = (b00) this.f32853b;
                b00Var.f32192n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                b00Var.f32192n.invalidateSelf();
                return;
            case 12:
                x00 x00Var = (x00) this.f32853b;
                x00Var.getClass();
                x00Var.f39485s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x00Var.invalidate();
                return;
            case 13:
                y10 y10Var = (y10) this.f32853b;
                y10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = y10Var.f40084c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = y10Var.f40085f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 14:
                g60 g60Var = (g60) this.f32853b;
                g60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60Var.L1(true);
                g60Var.e.invalidate();
                g60Var.Q.invalidate();
                return;
            case 15:
                p50 p50Var = (p50) this.f32853b;
                p50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p50Var.f36328a.invalidate();
                return;
            case 16:
                u50 u50Var = (u50) this.f32853b;
                u50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60 g60Var2 = u50Var.L;
                g60Var2.Q.invalidate();
                g60Var2.a2.invalidate();
                g60.z0(g60Var2).invalidate();
                g60.J0(g60Var2);
                return;
            case 17:
                ak0 ak0Var = (ak0) this.f32853b;
                ak0Var.getClass();
                ak0Var.f32093f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ak0Var.invalidate();
                return;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32853b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 19:
                PhotoViewer photoViewer = ((xt0) this.f32853b).d;
                photoViewer.T1.f34858k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 20:
                PhotoViewer photoViewer2 = ((xt0) this.f32853b).d;
                photoViewer2.T1.f34858k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.sm0) this.f32853b).f28338b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 22:
                PhotoViewer photoViewer3 = ((au0) this.f32853b).f32153r;
                photoViewer3.f31298m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 23:
                pu0 pu0Var = (pu0) this.f32853b;
                pu0Var.getClass();
                pu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                kv0 kv0Var = (kv0) this.f32853b;
                kv0Var.getClass();
                kv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kv0Var.e();
                return;
            case 25:
                ((zy0) this.f32853b).G.f31526a.invalidate();
                return;
            case 26:
                ((e01) this.f32853b).f33077g2.U4();
                return;
            case 27:
                t01 t01Var = (t01) this.f32853b;
                float[] fArr = t01Var.f37616n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                t01Var.F = animatedFraction;
                t01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            case 28:
                v01 v01Var = (v01) this.f32853b;
                float lerp2 = AndroidUtilities.lerp(v01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = v01Var.f38409n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null && !profileActivity.f31633p2) {
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
                v01Var.setScaleX(lerp2);
                v01Var.setScaleY(lerp2);
                v01Var.setAlpha(lerp2);
                return;
            default:
                t11 t11Var = (t11) this.f32853b;
                t11Var.f37630y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.a();
                return;
        }
    }
}
