package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35452a;
    public final Object f35453b;

    public e3(Object obj, int i10) {
        this.f35452a = i10;
        this.f35453b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35452a) {
            case 0:
                f3 f3Var = (f3) this.f35453b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f35728f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                v4 v4Var = (v4) this.f35453b;
                float lerp = AndroidUtilities.lerp(v4Var.f40888n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                v4Var.f40887f.setAlpha(i10);
                v4Var.h.setAlpha(i10);
                v4Var.f40889r.setAlpha((int) (66.0f * lerp));
                v4Var.f40890s.setAlpha((int) (85.0f * lerp));
                v4Var.v.setAlpha(i10);
                v4Var.G = lerp;
                v4Var.invalidate();
                return;
            case 2:
                d7.X((d7) this.f35453b, valueAnimator);
                return;
            case 3:
                l8 l8Var = (l8) this.f35453b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < l8Var.f37868b.getChildCount(); i11++) {
                    i8.b((i8) l8Var.f37868b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                sd sdVar = (sd) this.f35453b;
                sdVar.f40065b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                sdVar.f40065b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.ds) this.f35453b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                il ilVar = (il) this.f35453b;
                ilVar.getClass();
                ilVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ilVar.invalidate();
                return;
            case 7:
                np npVar = (np) this.f35453b;
                npVar.f38773r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                npVar.f38773r.invalidateSelf();
                return;
            case 8:
                ks ksVar = (ks) this.f35453b;
                ksVar.getClass();
                ksVar.f37722w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ksVar.invalidate();
                if (ksVar.getParent() != null) {
                    ((ViewGroup) ksVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                fs fsVar = (fs) this.f35453b;
                fsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.invalidate();
                if (fsVar.getParent() != null) {
                    ((ViewGroup) fsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                uy uyVar = (uy) this.f35453b;
                uyVar.getClass();
                uyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                pz pzVar = (pz) this.f35453b;
                pzVar.getClass();
                pzVar.f39313r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.z9 z9Var = pzVar.f39310c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = pzVar.f39308a;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(pzVar.f39313r, w02, org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                z9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                z9Var.invalidate();
                org.telegram.ui.Components.z9 z9Var2 = pzVar.f39311f;
                z9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - pzVar.f39313r, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), org.telegram.ui.ActionBar.g6.w0(i13, c6Var)), mode));
                z9Var2.invalidate();
                return;
            case 12:
                h00 h00Var = (h00) this.f35453b;
                h00Var.f36570n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h00Var.f36570n.invalidateSelf();
                return;
            case 13:
                e10 e10Var = (e10) this.f35453b;
                e10Var.getClass();
                e10Var.f35431s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e10Var.invalidate();
                return;
            case 14:
                e20 e20Var = (e20) this.f35453b;
                e20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = e20Var.f35441c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = e20Var.f35442f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                n60 n60Var = (n60) this.f35453b;
                n60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60Var.M1(true);
                n60Var.e.invalidate();
                n60Var.Q.invalidate();
                return;
            case 16:
                w50 w50Var = (w50) this.f35453b;
                w50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w50Var.f41154a.invalidate();
                return;
            case 17:
                b60 b60Var = (b60) this.f35453b;
                b60Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60 n60Var2 = b60Var.L;
                n60Var2.Q.invalidate();
                n60Var2.a2.invalidate();
                n60.A0(n60Var2).invalidate();
                n60.K0(n60Var2);
                return;
            case 18:
                kk0 kk0Var = (kk0) this.f35453b;
                kk0Var.getClass();
                kk0Var.f37677f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                kk0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35453b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((ju0) this.f35453b).d;
                photoViewer.T1.f41082k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((ju0) this.f35453b).d;
                photoViewer2.T1.f41082k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.gn0) this.f35453b).f25369b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((mu0) this.f35453b).f38354r;
                photoViewer3.f32300m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                bv0 bv0Var = (bv0) this.f35453b;
                bv0Var.getClass();
                bv0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                wv0 wv0Var = (wv0) this.f35453b;
                wv0Var.getClass();
                wv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wv0Var.e();
                return;
            case 26:
                ((mz0) this.f35453b).G.f32528a.invalidate();
                return;
            case 27:
                ((r01) this.f35453b).f39567g2.U4();
                return;
            case 28:
                g11 g11Var = (g11) this.f35453b;
                float[] fArr = g11Var.f36275n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                g11Var.F = animatedFraction;
                g11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                i11 i11Var = (i11) this.f35453b;
                float lerp2 = AndroidUtilities.lerp(i11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = i11Var.f37009n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null && !profileActivity.f32636p2) {
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
                i11Var.setScaleX(lerp2);
                i11Var.setScaleY(lerp2);
                i11Var.setAlpha(lerp2);
                return;
        }
    }
}
