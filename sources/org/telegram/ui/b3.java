package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32244a;
    public final Object f32245b;

    public b3(Object obj, int i10) {
        this.f32244a = i10;
        this.f32245b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.f32244a) {
            case 0:
                c3 c3Var = (c3) this.f32245b;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f32608f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f32245b;
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
                i8 i8Var = (i8) this.f32245b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.f34473b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.f34473b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                md mdVar = (md) this.f32245b;
                mdVar.f35659b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.f35659b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.pr) this.f32245b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                bl blVar = (bl) this.f32245b;
                blVar.getClass();
                blVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                blVar.invalidate();
                return;
            case 6:
                ip ipVar = (ip) this.f32245b;
                ipVar.f34650r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ipVar.f34650r.invalidateSelf();
                return;
            case 7:
                gs gsVar = (gs) this.f32245b;
                gsVar.getClass();
                gsVar.f33962w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.invalidate();
                if (gsVar.getParent() != null) {
                    ((ViewGroup) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                bs bsVar = (bs) this.f32245b;
                bsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                qy qyVar = (qy) this.f32245b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                lz lzVar = (lz) this.f32245b;
                lzVar.getClass();
                lzVar.f35548r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.v9 v9Var = lzVar.f35545c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = lzVar.f35543a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f35548r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                v9Var.invalidate();
                org.telegram.ui.Components.v9 v9Var2 = lzVar.f35546f;
                v9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35548r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                v9Var2.invalidate();
                return;
            case 11:
                c00 c00Var = (c00) this.f32245b;
                c00Var.f32569n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f32569n.invalidateSelf();
                return;
            case 12:
                y00 y00Var = (y00) this.f32245b;
                y00Var.getClass();
                y00Var.f39765s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 13:
                a20 a20Var = (a20) this.f32245b;
                a20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a20Var.f31955c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a20Var.f31956f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 14:
                i60 i60Var = (i60) this.f32245b;
                i60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.L1(true);
                i60Var.e.invalidate();
                i60Var.Q.invalidate();
                return;
            case 15:
                r50 r50Var = (r50) this.f32245b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.f37046a.invalidate();
                return;
            case 16:
                w50 w50Var = (w50) this.f32245b;
                w50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var2 = w50Var.L;
                i60Var2.Q.invalidate();
                i60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var2).containerView;
                viewGroup.invalidate();
                i60.J0(i60Var2);
                return;
            case 17:
                hk0 hk0Var = (hk0) this.f32245b;
                hk0Var.getClass();
                hk0Var.f34231f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hk0Var.invalidate();
                return;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32245b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 19:
                PhotoViewer photoViewer = ((cu0) this.f32245b).d;
                photoViewer.T1.f36378k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 20:
                PhotoViewer photoViewer2 = ((cu0) this.f32245b).d;
                photoViewer2.T1.f36378k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.qm0) this.f32245b).f27614b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 22:
                PhotoViewer photoViewer3 = ((fu0) this.f32245b).f33728r;
                photoViewer3.f31294m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 23:
                uu0 uu0Var = (uu0) this.f32245b;
                uu0Var.getClass();
                uu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                pv0 pv0Var = (pv0) this.f32245b;
                pv0Var.getClass();
                pv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.e();
                return;
            case 25:
                ((gz0) this.f32245b).G.f31522a.invalidate();
                return;
            case 26:
                ((l01) this.f32245b).f35275g2.U4();
                return;
            case 27:
                a11 a11Var = (a11) this.f32245b;
                float[] fArr = a11Var.f31938n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                a11Var.F = animatedFraction;
                a11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            case 28:
                c11 c11Var = (c11) this.f32245b;
                float lerp2 = AndroidUtilities.lerp(c11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = c11Var.f32592n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f31629p2) {
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
                a21 a21Var = (a21) this.f32245b;
                a21Var.f31968y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.a();
                return;
        }
    }
}
