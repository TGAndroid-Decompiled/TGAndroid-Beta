package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35264a;
    public final Object f35265b;

    public c3(Object obj, int i10) {
        this.f35264a = i10;
        this.f35265b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35264a) {
            case 0:
                d3 d3Var = (d3) this.f35265b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f35626e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f35627f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                r4 r4Var = (r4) this.f35265b;
                float lerp = AndroidUtilities.lerp(r4Var.f39906n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                r4Var.f39905f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.f39907r.setAlpha((int) (66.0f * lerp));
                r4Var.f39908s.setAlpha((int) (85.0f * lerp));
                r4Var.v.setAlpha(i10);
                r4Var.G = lerp;
                r4Var.invalidate();
                return;
            case 2:
                k8 k8Var = (k8) this.f35265b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < k8Var.f37855b.getChildCount(); i11++) {
                    h8.b((h8) k8Var.f37855b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                nd ndVar = (nd) this.f35265b;
                ndVar.f38906b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.f38906b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.sr) this.f35265b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                al alVar = (al) this.f35265b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                return;
            case 6:
                hp hpVar = (hp) this.f35265b;
                hpVar.f37147r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hpVar.f37147r.invalidateSelf();
                return;
            case 7:
                es esVar = (es) this.f35265b;
                esVar.getClass();
                esVar.f36081w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                esVar.invalidate();
                if (esVar.getParent() != null) {
                    ((ViewGroup) esVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                as asVar = (as) this.f35265b;
                asVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                asVar.invalidate();
                if (asVar.getParent() != null) {
                    ((ViewGroup) asVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                qy qyVar = (qy) this.f35265b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                lz lzVar = (lz) this.f35265b;
                lzVar.getClass();
                lzVar.f38370r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = lzVar.f38366c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = lzVar.f38364a;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.f38370r, v02, org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = lzVar.f38368f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f38370r, org.telegram.ui.ActionBar.i6.v0(i12, d6Var), org.telegram.ui.ActionBar.i6.v0(i13, d6Var)), mode));
                w9Var2.invalidate();
                return;
            case 11:
                c00 c00Var = (c00) this.f35265b;
                c00Var.f35229n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f35229n.invalidateSelf();
                return;
            case 12:
                y00 y00Var = (y00) this.f35265b;
                y00Var.getClass();
                y00Var.f42984s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 13:
                z10 z10Var = (z10) this.f35265b;
                z10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = z10Var.f43677c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = z10Var.f43679f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 14:
                h60 h60Var = (h60) this.f35265b;
                h60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h60Var.L1(true);
                h60Var.f36890e.invalidate();
                h60Var.Q.invalidate();
                return;
            case 15:
                r50 r50Var = (r50) this.f35265b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.f39919a.invalidate();
                return;
            case 16:
                v50 v50Var = (v50) this.f35265b;
                v50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h60 h60Var2 = v50Var.L;
                h60Var2.Q.invalidate();
                h60Var2.a2.invalidate();
                h60.z0(h60Var2).invalidate();
                h60.J0(h60Var2);
                return;
            case 17:
                ck0 ck0Var = (ck0) this.f35265b;
                ck0Var.getClass();
                ck0Var.f35499f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ck0Var.invalidate();
                return;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35265b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 19:
                PhotoViewer photoViewer = ((xt0) this.f35265b).d;
                photoViewer.T1.f37764k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 20:
                PhotoViewer photoViewer2 = ((xt0) this.f35265b).d;
                photoViewer2.T1.f37764k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.wm0) this.f35265b).f32583b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 22:
                PhotoViewer photoViewer3 = ((au0) this.f35265b).f34919r;
                photoViewer3.f33968m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 23:
                pu0 pu0Var = (pu0) this.f35265b;
                pu0Var.getClass();
                pu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                kv0 kv0Var = (kv0) this.f35265b;
                kv0Var.getClass();
                kv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kv0Var.e();
                return;
            case 25:
                ((zy0) this.f35265b).G.f34202a.invalidate();
                return;
            case 26:
                ((e01) this.f35265b).f35880g2.U4();
                return;
            case 27:
                t01 t01Var = (t01) this.f35265b;
                float[] fArr = t01Var.f40651n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                t01Var.F = animatedFraction;
                t01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            case 28:
                v01 v01Var = (v01) this.f35265b;
                float lerp2 = AndroidUtilities.lerp(v01Var.f41512e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = v01Var.f41514n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f34310p2) {
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
                v01Var.setScaleX(lerp2);
                v01Var.setScaleY(lerp2);
                v01Var.setAlpha(lerp2);
                return;
            default:
                t11 t11Var = (t11) this.f35265b;
                t11Var.f40673y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.a();
                return;
        }
    }
}
