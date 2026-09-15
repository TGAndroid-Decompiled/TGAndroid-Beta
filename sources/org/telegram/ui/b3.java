package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32036a;
    public final Object f32037b;

    public b3(Object obj, int i10) {
        this.f32036a = i10;
        this.f32037b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f32036a) {
            case 0:
                c3 c3Var = (c3) this.f32037b;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f32651f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f32037b;
                float lerp = AndroidUtilities.lerp(q4Var.f36755n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                q4Var.f36754f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f36756r.setAlpha((int) (66.0f * lerp));
                q4Var.f36757s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i10);
                q4Var.G = lerp;
                q4Var.invalidate();
                return;
            case 2:
                z6.X((z6) this.f32037b, valueAnimator);
                return;
            case 3:
                h8 h8Var = (h8) this.f32037b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f34189b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f34189b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                ld ldVar = (ld) this.f32037b;
                ldVar.f35438b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ldVar.f35438b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.pr) this.f32037b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                dl dlVar = (dl) this.f32037b;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                return;
            case 7:
                kp kpVar = (kp) this.f32037b;
                kpVar.f35231r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kpVar.f35231r.invalidateSelf();
                return;
            case 8:
                gs gsVar = (gs) this.f32037b;
                gsVar.getClass();
                gsVar.f34005w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.invalidate();
                if (gsVar.getParent() != null) {
                    ((ViewGroup) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                bs bsVar = (bs) this.f32037b;
                bsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                qy qyVar = (qy) this.f32037b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                lz lzVar = (lz) this.f32037b;
                lzVar.getClass();
                lzVar.f35584r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.u9 u9Var = lzVar.f35581c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.e6 e6Var = lzVar.f35579a;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i12, e6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.f35584r, v02, org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                u9Var.invalidate();
                org.telegram.ui.Components.u9 u9Var2 = lzVar.f35582f;
                u9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35584r, org.telegram.ui.ActionBar.i6.v0(i12, e6Var), org.telegram.ui.ActionBar.i6.v0(i13, e6Var)), mode));
                u9Var2.invalidate();
                return;
            case 12:
                c00 c00Var = (c00) this.f32037b;
                c00Var.f32610n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f32610n.invalidateSelf();
                return;
            case 13:
                y00 y00Var = (y00) this.f32037b;
                y00Var.getClass();
                y00Var.f39712s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 14:
                z10 z10Var = (z10) this.f32037b;
                z10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = z10Var.f40036c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = z10Var.f40037f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                i60 i60Var = (i60) this.f32037b;
                i60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.L1(true);
                i60Var.e.invalidate();
                i60Var.Q.invalidate();
                return;
            case 16:
                r50 r50Var = (r50) this.f32037b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.f37023a.invalidate();
                return;
            case 17:
                w50 w50Var = (w50) this.f32037b;
                w50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var2 = w50Var.L;
                i60Var2.Q.invalidate();
                i60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var2).containerView;
                viewGroup.invalidate();
                i60.J0(i60Var2);
                return;
            case 18:
                ek0 ek0Var = (ek0) this.f32037b;
                ek0Var.getClass();
                ek0Var.f33366f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ek0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32037b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((cu0) this.f32037b).d;
                photoViewer.T1.f36350k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((cu0) this.f32037b).d;
                photoViewer2.T1.f36350k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.em0) this.f32037b).f23694b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((fu0) this.f32037b).f33672r;
                photoViewer3.f31009m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                uu0 uu0Var = (uu0) this.f32037b;
                uu0Var.getClass();
                uu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                pv0 pv0Var = (pv0) this.f32037b;
                pv0Var.getClass();
                pv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.e();
                return;
            case 26:
                ((gz0) this.f32037b).G.f31238a.invalidate();
                return;
            case 27:
                ((l01) this.f32037b).f35299g2.U4();
                return;
            case 28:
                a11 a11Var = (a11) this.f32037b;
                float[] fArr = a11Var.f31655n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                a11Var.F = animatedFraction;
                a11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                c11 c11Var = (c11) this.f32037b;
                float lerp2 = AndroidUtilities.lerp(c11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = c11Var.f32633n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f31345p2) {
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
                c11Var.setScaleX(lerp2);
                c11Var.setScaleY(lerp2);
                c11Var.setAlpha(lerp2);
                return;
        }
    }
}
