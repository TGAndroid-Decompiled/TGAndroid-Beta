package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38125a;
    public final Object f38126b;

    public f3(Object obj, int i9) {
        this.f38125a = i9;
        this.f38126b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38125a) {
            case 0:
                g3 g3Var = (g3) this.f38126b;
                g3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                g3Var.f38419e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                g3Var.f38420f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) this.f38126b;
                float lerp = AndroidUtilities.lerp(q4Var.f41669n, valueAnimator.getAnimatedFraction());
                int i9 = (int) (255.0f * lerp);
                q4Var.f41668f.setAlpha(i9);
                q4Var.h.setAlpha(i9);
                q4Var.f41670r.setAlpha((int) (66.0f * lerp));
                q4Var.f41671s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i9);
                q4Var.C = lerp;
                q4Var.invalidate();
                return;
            case 2:
                y6.W((y6) this.f38126b, valueAnimator);
                return;
            case 3:
                g8 g8Var = (g8) this.f38126b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < g8Var.f38448b.getChildCount(); i10++) {
                    d8.b((d8) g8Var.f38448b.getChildAt(i10), floatValue2);
                }
                return;
            case 4:
                id idVar = (id) this.f38126b;
                idVar.f39103b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                idVar.f39103b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.fr) this.f38126b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                rk rkVar = (rk) this.f38126b;
                rkVar.getClass();
                rkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rkVar.invalidate();
                return;
            case 7:
                vo voVar = (vo) this.f38126b;
                voVar.f43545r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                voVar.f43545r.invalidateSelf();
                return;
            case 8:
                vr vrVar = (vr) this.f38126b;
                vrVar.getClass();
                vrVar.f43572w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.invalidate();
                if (vrVar.getParent() != null) {
                    ((ViewGroup) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                qr qrVar = (qr) this.f38126b;
                qrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qrVar.invalidate();
                if (qrVar.getParent() != null) {
                    ((ViewGroup) qrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                yx yxVar = (yx) this.f38126b;
                yxVar.getClass();
                yxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                uy uyVar = (uy) this.f38126b;
                uyVar.getClass();
                uyVar.f43340r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.o9 o9Var = uyVar.f43336c;
                int i11 = org.telegram.ui.ActionBar.f6.C6;
                org.telegram.ui.ActionBar.b6 b6Var = uyVar.f43334a;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
                int i12 = org.telegram.ui.ActionBar.f6.Oh;
                int d = i0.a.d(uyVar.f43340r, v02, org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                o9Var.invalidate();
                org.telegram.ui.Components.o9 o9Var2 = uyVar.f43338f;
                o9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - uyVar.f43340r, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), org.telegram.ui.ActionBar.f6.v0(i12, b6Var)), mode));
                o9Var2.invalidate();
                return;
            case 12:
                lz lzVar = (lz) this.f38126b;
                lzVar.f40258n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lzVar.f40258n.invalidateSelf();
                return;
            case 13:
                g00 g00Var = (g00) this.f38126b;
                g00Var.getClass();
                g00Var.f38398s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g00Var.invalidate();
                return;
            case 14:
                h10 h10Var = (h10) this.f38126b;
                h10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = h10Var.f38640c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = h10Var.f38642f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 15:
                o50 o50Var = (o50) this.f38126b;
                o50Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50Var.L1(true);
                o50Var.f40897e.invalidate();
                o50Var.M.invalidate();
                return;
            case 16:
                y40 y40Var = (y40) this.f38126b;
                y40Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y40Var.f44717a.invalidate();
                return;
            case 17:
                c50 c50Var = (c50) this.f38126b;
                c50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50 o50Var2 = c50Var.L;
                o50Var2.M.invalidate();
                o50Var2.W1.invalidate();
                ((org.telegram.ui.ActionBar.f3) o50Var2).containerView.invalidate();
                o50.I0(o50Var2);
                return;
            case 18:
                pj0 pj0Var = (pj0) this.f38126b;
                pj0Var.getClass();
                pj0Var.f41551f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38126b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((at0) this.f38126b).d;
                photoViewer.P1.f40524g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.P1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((at0) this.f38126b).d;
                photoViewer2.P1.f40524g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.P1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.pl0) this.f38126b).f31689b).P1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((dt0) this.f38126b).f37600r;
                photoViewer3.f35660i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                st0 st0Var = (st0) this.f38126b;
                st0Var.getClass();
                st0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                nu0 nu0Var = (nu0) this.f38126b;
                nu0Var.getClass();
                nu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nu0Var.e();
                return;
            case 26:
                ((cy0) this.f38126b).G.f35918a.invalidate();
                return;
            case 27:
                ((hz0) this.f38126b).f38963c2.U4();
                return;
            case 28:
                wz0 wz0Var = (wz0) this.f38126b;
                float[] fArr = wz0Var.f44289n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                wz0Var.B = animatedFraction;
                wz0Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                yz0 yz0Var = (yz0) this.f38126b;
                float lerp2 = AndroidUtilities.lerp(yz0Var.f44984e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = yz0Var.f44986n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null && !profileActivity.f35999l2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity.Q0.setScaleY(f13);
                    profileActivity.Q0.setAlpha(f13);
                }
                if (profileActivity.J0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f14);
                    profileActivity.O0.setScaleY(f14);
                    profileActivity.O0.setAlpha(f14);
                }
                if (profileActivity.H0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.M0.setScaleX(f15);
                    profileActivity.M0.setScaleY(f15);
                    profileActivity.M0.setAlpha(f15);
                }
                if (profileActivity.I0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f16);
                    profileActivity.N0.setScaleY(f16);
                    profileActivity.N0.setAlpha(f16);
                }
                yz0Var.setScaleX(lerp2);
                yz0Var.setScaleY(lerp2);
                yz0Var.setAlpha(lerp2);
                return;
        }
    }
}
