package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32262a;
    public final Object f32263b;

    public b3(Object obj, int i10) {
        this.f32262a = i10;
        this.f32263b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f32262a) {
            case 0:
                c3 c3Var = (c3) this.f32263b;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f32628f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f32263b;
                float lerp = AndroidUtilities.lerp(q4Var.f36784n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                q4Var.f36783f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f36785r.setAlpha((int) (66.0f * lerp));
                q4Var.f36786s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i10);
                q4Var.G = lerp;
                q4Var.invalidate();
                return;
            case 2:
                i8 i8Var = (i8) this.f32263b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.f34493b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.f34493b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                md mdVar = (md) this.f32263b;
                mdVar.f35682b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.f35682b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.pr) this.f32263b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                cl clVar = (cl) this.f32263b;
                clVar.getClass();
                clVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                clVar.invalidate();
                return;
            case 6:
                ip ipVar = (ip) this.f32263b;
                ipVar.f34675r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ipVar.f34675r.invalidateSelf();
                return;
            case 7:
                gs gsVar = (gs) this.f32263b;
                gsVar.getClass();
                gsVar.f33978w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.invalidate();
                if (gsVar.getParent() != null) {
                    ((ViewGroup) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                bs bsVar = (bs) this.f32263b;
                bsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                qy qyVar = (qy) this.f32263b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                lz lzVar = (lz) this.f32263b;
                lzVar.getClass();
                lzVar.f35571r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.v9 v9Var = lzVar.f35568c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = lzVar.f35566a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f35571r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                v9Var.invalidate();
                org.telegram.ui.Components.v9 v9Var2 = lzVar.f35569f;
                v9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35571r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                v9Var2.invalidate();
                return;
            case 11:
                c00 c00Var = (c00) this.f32263b;
                c00Var.f32589n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f32589n.invalidateSelf();
                return;
            case 12:
                y00 y00Var = (y00) this.f32263b;
                y00Var.getClass();
                y00Var.f39785s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 13:
                a20 a20Var = (a20) this.f32263b;
                a20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a20Var.f31976c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a20Var.f31977f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 14:
                i60 i60Var = (i60) this.f32263b;
                i60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.L1(true);
                i60Var.e.invalidate();
                i60Var.Q.invalidate();
                return;
            case 15:
                r50 r50Var = (r50) this.f32263b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.f37069a.invalidate();
                return;
            case 16:
                w50 w50Var = (w50) this.f32263b;
                w50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var2 = w50Var.L;
                i60Var2.Q.invalidate();
                i60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var2).containerView;
                viewGroup.invalidate();
                i60.J0(i60Var2);
                return;
            case 17:
                hk0 hk0Var = (hk0) this.f32263b;
                hk0Var.getClass();
                hk0Var.f34253f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hk0Var.invalidate();
                return;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32263b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 19:
                PhotoViewer photoViewer = ((cu0) this.f32263b).d;
                photoViewer.T1.f36405k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 20:
                PhotoViewer photoViewer2 = ((cu0) this.f32263b).d;
                photoViewer2.T1.f36405k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.sm0) this.f32263b).f28278b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 22:
                PhotoViewer photoViewer3 = ((fu0) this.f32263b).f33756r;
                photoViewer3.f31315m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 23:
                uu0 uu0Var = (uu0) this.f32263b;
                uu0Var.getClass();
                uu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                pv0 pv0Var = (pv0) this.f32263b;
                pv0Var.getClass();
                pv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.e();
                return;
            case 25:
                ((gz0) this.f32263b).G.f31543a.invalidate();
                return;
            case 26:
                ((l01) this.f32263b).f35293g2.U4();
                return;
            case 27:
                a11 a11Var = (a11) this.f32263b;
                float[] fArr = a11Var.f31959n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                a11Var.F = animatedFraction;
                a11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            case 28:
                c11 c11Var = (c11) this.f32263b;
                float lerp2 = AndroidUtilities.lerp(c11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = c11Var.f32612n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f31650p2) {
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
            default:
                a21 a21Var = (a21) this.f32263b;
                a21Var.f31989y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.a();
                return;
        }
    }
}
