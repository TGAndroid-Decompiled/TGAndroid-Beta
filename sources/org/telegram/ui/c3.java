package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36312a;
    public final Object f36313b;

    public c3(Object obj, int i10) {
        this.f36312a = i10;
        this.f36313b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36312a) {
            case 0:
                d3 d3Var = (d3) this.f36313b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f36628e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f36629f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                t4 t4Var = (t4) this.f36313b;
                float lerp = AndroidUtilities.lerp(t4Var.f42073n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                t4Var.f42072f.setAlpha(i10);
                t4Var.h.setAlpha(i10);
                t4Var.f42074r.setAlpha((int) (66.0f * lerp));
                t4Var.f42075s.setAlpha((int) (85.0f * lerp));
                t4Var.v.setAlpha(i10);
                t4Var.G = lerp;
                t4Var.invalidate();
                return;
            case 2:
                b7.X((b7) this.f36313b, valueAnimator);
                return;
            case 3:
                j8 j8Var = (j8) this.f36313b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.f39126b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.f39126b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                qd qdVar = (qd) this.f36313b;
                qdVar.f41272b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qdVar.f41272b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.is) this.f36313b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                il ilVar = (il) this.f36313b;
                ilVar.getClass();
                ilVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ilVar.invalidate();
                return;
            case 7:
                lp lpVar = (lp) this.f36313b;
                lpVar.f39819r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lpVar.f39819r.invalidateSelf();
                return;
            case 8:
                hs hsVar = (hs) this.f36313b;
                hsVar.getClass();
                hsVar.f38509w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hsVar.invalidate();
                if (hsVar.getParent() != null) {
                    ((ViewGroup) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                ds dsVar = (ds) this.f36313b;
                dsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                ry ryVar = (ry) this.f36313b;
                ryVar.getClass();
                ryVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                mz mzVar = (mz) this.f36313b;
                mzVar.getClass();
                mzVar.f40156r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.y9 y9Var = mzVar.f40152c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = mzVar.f40150a;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(mzVar.f40156r, w02, org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                y9Var.invalidate();
                org.telegram.ui.Components.y9 y9Var2 = mzVar.f40154f;
                y9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - mzVar.f40156r, org.telegram.ui.ActionBar.h6.w0(i12, c6Var), org.telegram.ui.ActionBar.h6.w0(i13, c6Var)), mode));
                y9Var2.invalidate();
                return;
            case 12:
                e00 e00Var = (e00) this.f36313b;
                e00Var.f36946n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e00Var.f36946n.invalidateSelf();
                return;
            case 13:
                a10 a10Var = (a10) this.f36313b;
                a10Var.getClass();
                a10Var.f35659s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 14:
                a20 a20Var = (a20) this.f36313b;
                a20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a20Var.f35670c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a20Var.f35672f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                i60 i60Var = (i60) this.f36313b;
                i60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.M1(true);
                i60Var.f38694e.invalidate();
                i60Var.Q.invalidate();
                return;
            case 16:
                r50 r50Var = (r50) this.f36313b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.f41505a.invalidate();
                return;
            case 17:
                w50 w50Var = (w50) this.f36313b;
                w50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var2 = w50Var.L;
                i60Var2.Q.invalidate();
                i60Var2.a2.invalidate();
                i60.A0(i60Var2).invalidate();
                i60.K0(i60Var2);
                return;
            case 18:
                gk0 gk0Var = (gk0) this.f36313b;
                gk0Var.getClass();
                gk0Var.f38082f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                gk0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36313b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((eu0) this.f36313b).d;
                photoViewer.T1.f41730k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((eu0) this.f36313b).d;
                photoViewer2.T1.f41730k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.qn0) this.f36313b).f29869b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((iu0) this.f36313b).f39006r;
                photoViewer3.f33814m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                xu0 xu0Var = (xu0) this.f36313b;
                xu0Var.getClass();
                xu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                sv0 sv0Var = (sv0) this.f36313b;
                sv0Var.getClass();
                sv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.e();
                return;
            case 26:
                ((hz0) this.f36313b).G.f34048a.invalidate();
                return;
            case 27:
                ((m01) this.f36313b).f39880g2.U4();
                return;
            case 28:
                b11 b11Var = (b11) this.f36313b;
                float[] fArr = b11Var.f36018n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                b11Var.F = animatedFraction;
                b11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                d11 d11Var = (d11) this.f36313b;
                float lerp2 = AndroidUtilities.lerp(d11Var.f36606e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = d11Var.f36608n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null && !profileActivity.f34156p2) {
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
                d11Var.setScaleX(lerp2);
                d11Var.setScaleY(lerp2);
                d11Var.setAlpha(lerp2);
                return;
        }
    }
}
