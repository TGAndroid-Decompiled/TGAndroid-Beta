package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38445a;
    public final Object f38446b;

    public g3(Object obj, int i10) {
        this.f38445a = i10;
        this.f38446b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38445a) {
            case 0:
                h3 h3Var = (h3) this.f38446b;
                h3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                h3Var.f38751e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                h3Var.f38752f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                r4 r4Var = (r4) this.f38446b;
                float lerp = AndroidUtilities.lerp(r4Var.f41858n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                r4Var.f41857f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.f41859r.setAlpha((int) (66.0f * lerp));
                r4Var.f41860s.setAlpha((int) (85.0f * lerp));
                r4Var.v.setAlpha(i10);
                r4Var.C = lerp;
                r4Var.invalidate();
                return;
            case 2:
                x6.X((x6) this.f38446b, valueAnimator);
                return;
            case 3:
                f8 f8Var = (f8) this.f38446b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < f8Var.f38021b.getChildCount(); i11++) {
                    c8.b((c8) f8Var.f38021b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                hd hdVar = (hd) this.f38446b;
                hdVar.f38851b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hdVar.f38851b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.ir) this.f38446b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                uk ukVar = (uk) this.f38446b;
                ukVar.getClass();
                ukVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ukVar.invalidate();
                return;
            case 7:
                yo yoVar = (yo) this.f38446b;
                yoVar.f44936r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yoVar.f44936r.invalidateSelf();
                return;
            case 8:
                ur urVar = (ur) this.f38446b;
                urVar.getClass();
                urVar.f43324w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                urVar.invalidate();
                if (urVar.getParent() != null) {
                    ((ViewGroup) urVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                qr qrVar = (qr) this.f38446b;
                qrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qrVar.invalidate();
                if (qrVar.getParent() != null) {
                    ((ViewGroup) qrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                ay ayVar = (ay) this.f38446b;
                ayVar.getClass();
                ayVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                wy wyVar = (wy) this.f38446b;
                wyVar.getClass();
                wyVar.f44404r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.t9 t9Var = wyVar.f44400c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = wyVar.f44398a;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(wyVar.f44404r, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                t9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                t9Var.invalidate();
                org.telegram.ui.Components.t9 t9Var2 = wyVar.f44402f;
                t9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - wyVar.f44404r, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)), mode));
                t9Var2.invalidate();
                return;
            case 12:
                nz nzVar = (nz) this.f38446b;
                nzVar.f40934n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nzVar.f40934n.invalidateSelf();
                return;
            case 13:
                i00 i00Var = (i00) this.f38446b;
                i00Var.getClass();
                i00Var.f39098s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var.invalidate();
                return;
            case 14:
                j10 j10Var = (j10) this.f38446b;
                j10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = j10Var.f39396c;
                imageView.setAlpha(floatValue3);
                float f9 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f9);
                imageView.setScaleY(f9);
                View view = j10Var.f39398f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                r50 r50Var = (r50) this.f38446b;
                r50Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.L1(true);
                r50Var.f41884e.invalidate();
                r50Var.M.invalidate();
                return;
            case 16:
                a50 a50Var = (a50) this.f38446b;
                a50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a50Var.f36428a.invalidate();
                return;
            case 17:
                f50 f50Var = (f50) this.f38446b;
                f50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50 r50Var2 = f50Var.L;
                r50Var2.M.invalidate();
                r50Var2.W1.invalidate();
                r50.z0(r50Var2).invalidate();
                r50.J0(r50Var2);
                return;
            case 18:
                mj0 mj0Var = (mj0) this.f38446b;
                mj0Var.getClass();
                mj0Var.f40584f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38446b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((ys0) this.f38446b).d;
                photoViewer.P1.f40012g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.P1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((ys0) this.f38446b).d;
                photoViewer2.P1.f40012g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.P1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.cm0) this.f38446b).f27510b).P1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((bt0) this.f38446b).f36912r;
                photoViewer3.f35726i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                qt0 qt0Var = (qt0) this.f38446b;
                qt0Var.getClass();
                qt0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                lu0 lu0Var = (lu0) this.f38446b;
                lu0Var.getClass();
                lu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lu0Var.e();
                return;
            case 26:
                ((cy0) this.f38446b).G.f35984a.invalidate();
                return;
            case 27:
                ((hz0) this.f38446b).f39076c2.U4();
                return;
            case 28:
                wz0 wz0Var = (wz0) this.f38446b;
                float[] fArr = wz0Var.f44412n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                wz0Var.B = animatedFraction;
                wz0Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                yz0 yz0Var = (yz0) this.f38446b;
                float lerp2 = AndroidUtilities.lerp(yz0Var.f44995e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = yz0Var.f44997n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null && !profileActivity.f36064l2) {
                    float f12 = 1.0f - lerp2;
                    w0Var.setScaleX(f12);
                    profileActivity.Q0.setScaleY(f12);
                    profileActivity.Q0.setAlpha(f12);
                }
                if (profileActivity.J0) {
                    float f13 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f13);
                    profileActivity.O0.setScaleY(f13);
                    profileActivity.O0.setAlpha(f13);
                }
                if (profileActivity.H0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.M0.setScaleX(f14);
                    profileActivity.M0.setScaleY(f14);
                    profileActivity.M0.setAlpha(f14);
                }
                if (profileActivity.I0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f15);
                    profileActivity.N0.setScaleY(f15);
                    profileActivity.N0.setAlpha(f15);
                }
                yz0Var.setScaleX(lerp2);
                yz0Var.setScaleY(lerp2);
                yz0Var.setAlpha(lerp2);
                return;
        }
    }
}
