package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35190a;
    public final Object f35191b;

    public e3(Object obj, int i10) {
        this.f35190a = i10;
        this.f35191b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f35190a) {
            case 0:
                f3 f3Var = (f3) this.f35191b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f35450f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                v4 v4Var = (v4) this.f35191b;
                float lerp = AndroidUtilities.lerp(v4Var.f40575n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                v4Var.f40574f.setAlpha(i10);
                v4Var.h.setAlpha(i10);
                v4Var.f40576r.setAlpha((int) (66.0f * lerp));
                v4Var.f40577s.setAlpha((int) (85.0f * lerp));
                v4Var.v.setAlpha(i10);
                v4Var.G = lerp;
                v4Var.invalidate();
                return;
            case 2:
                d7.X((d7) this.f35191b, valueAnimator);
                return;
            case 3:
                l8 l8Var = (l8) this.f35191b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < l8Var.f37634b.getChildCount(); i11++) {
                    i8.b((i8) l8Var.f37634b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                sd sdVar = (sd) this.f35191b;
                sdVar.f39762b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                sdVar.f39762b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.ds) this.f35191b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                il ilVar = (il) this.f35191b;
                ilVar.getClass();
                ilVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ilVar.invalidate();
                return;
            case 7:
                np npVar = (np) this.f35191b;
                npVar.f38453r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                npVar.f38453r.invalidateSelf();
                return;
            case 8:
                ks ksVar = (ks) this.f35191b;
                ksVar.getClass();
                ksVar.f37506w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ksVar.invalidate();
                if (ksVar.getParent() != null) {
                    ((ViewGroup) ksVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                fs fsVar = (fs) this.f35191b;
                fsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.invalidate();
                if (fsVar.getParent() != null) {
                    ((ViewGroup) fsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                uy uyVar = (uy) this.f35191b;
                uyVar.getClass();
                uyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                pz pzVar = (pz) this.f35191b;
                pzVar.getClass();
                pzVar.f39035r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.z9 z9Var = pzVar.f39032c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = pzVar.f39030a;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(pzVar.f39035r, w02, org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                z9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                z9Var.invalidate();
                org.telegram.ui.Components.z9 z9Var2 = pzVar.f39033f;
                z9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - pzVar.f39035r, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), org.telegram.ui.ActionBar.g6.w0(i13, c6Var)), mode));
                z9Var2.invalidate();
                return;
            case 12:
                h00 h00Var = (h00) this.f35191b;
                h00Var.f36356n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h00Var.f36356n.invalidateSelf();
                return;
            case 13:
                d10 d10Var = (d10) this.f35191b;
                d10Var.getClass();
                d10Var.f34836s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d10Var.invalidate();
                return;
            case 14:
                e20 e20Var = (e20) this.f35191b;
                e20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = e20Var.f35179c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = e20Var.f35180f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                n60 n60Var = (n60) this.f35191b;
                n60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60Var.M1(true);
                n60Var.e.invalidate();
                n60Var.Q.invalidate();
                return;
            case 16:
                w50 w50Var = (w50) this.f35191b;
                w50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w50Var.f40861a.invalidate();
                return;
            case 17:
                b60 b60Var = (b60) this.f35191b;
                b60Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60 n60Var2 = b60Var.L;
                n60Var2.Q.invalidate();
                n60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var2).containerView;
                viewGroup.invalidate();
                n60.K0(n60Var2);
                return;
            case 18:
                jk0 jk0Var = (jk0) this.f35191b;
                jk0Var.getClass();
                jk0Var.f37086f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                jk0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35191b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((iu0) this.f35191b).d;
                photoViewer.T1.f40488k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((iu0) this.f35191b).d;
                photoViewer2.T1.f40488k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.gn0) this.f35191b).f25057b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((lu0) this.f35191b).f37836r;
                photoViewer3.f32002m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                av0 av0Var = (av0) this.f35191b;
                av0Var.getClass();
                av0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                vv0 vv0Var = (vv0) this.f35191b;
                vv0Var.getClass();
                vv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vv0Var.e();
                return;
            case 26:
                ((lz0) this.f35191b).G.f32230a.invalidate();
                return;
            case 27:
                ((q01) this.f35191b).f39042g2.U4();
                return;
            case 28:
                f11 f11Var = (f11) this.f35191b;
                float[] fArr = f11Var.f35428n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                f11Var.F = animatedFraction;
                f11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                h11 h11Var = (h11) this.f35191b;
                float lerp2 = AndroidUtilities.lerp(h11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = h11Var.f36368n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null && !profileActivity.f32338p2) {
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
                h11Var.setScaleX(lerp2);
                h11Var.setScaleY(lerp2);
                h11Var.setAlpha(lerp2);
                return;
        }
    }
}
