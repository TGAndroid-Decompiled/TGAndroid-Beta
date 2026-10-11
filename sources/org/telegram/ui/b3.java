package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36247a;
    public final Object f36248b;

    public b3(Object obj, int i10) {
        this.f36247a = i10;
        this.f36248b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36247a) {
            case 0:
                c3 c3Var = (c3) this.f36248b;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f36529e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f36530f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                p4 p4Var = (p4) this.f36248b;
                float lerp = AndroidUtilities.lerp(p4Var.f40734n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                p4Var.f40733f.setAlpha(i10);
                p4Var.h.setAlpha(i10);
                p4Var.f40735r.setAlpha((int) (66.0f * lerp));
                p4Var.f40736s.setAlpha((int) (85.0f * lerp));
                p4Var.v.setAlpha(i10);
                p4Var.G = lerp;
                p4Var.invalidate();
                return;
            case 2:
                x6.X((x6) this.f36248b, valueAnimator);
                return;
            case 3:
                f8 f8Var = (f8) this.f36248b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < f8Var.f37577b.getChildCount(); i11++) {
                    c8.b((c8) f8Var.f37577b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                ld ldVar = (ld) this.f36248b;
                ldVar.f39594b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ldVar.f39594b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.hs) this.f36248b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                el elVar = (el) this.f36248b;
                elVar.getClass();
                elVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                elVar.invalidate();
                return;
            case 7:
                ip ipVar = (ip) this.f36248b;
                ipVar.f38757r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ipVar.f38757r.invalidateSelf();
                return;
            case 8:
                ds dsVar = (ds) this.f36248b;
                dsVar.getClass();
                dsVar.f37084w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                zr zrVar = (zr) this.f36248b;
                zrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zrVar.invalidate();
                if (zrVar.getParent() != null) {
                    ((ViewGroup) zrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                oy oyVar = (oy) this.f36248b;
                oyVar.getClass();
                oyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                jz jzVar = (jz) this.f36248b;
                jzVar.getClass();
                jzVar.f39150r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.y9 y9Var = jzVar.f39146c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = jzVar.f39144a;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(jzVar.f39150r, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                y9Var.invalidate();
                org.telegram.ui.Components.y9 y9Var2 = jzVar.f39148f;
                y9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - jzVar.f39150r, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), mode));
                y9Var2.invalidate();
                return;
            case 12:
                b00 b00Var = (b00) this.f36248b;
                b00Var.f36222n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                b00Var.f36222n.invalidateSelf();
                return;
            case 13:
                x00 x00Var = (x00) this.f36248b;
                x00Var.getClass();
                x00Var.f43911s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x00Var.invalidate();
                return;
            case 14:
                x10 x10Var = (x10) this.f36248b;
                x10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = x10Var.f43930c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = x10Var.f43932f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                g60 g60Var = (g60) this.f36248b;
                g60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60Var.M1(true);
                g60Var.f37885e.invalidate();
                g60Var.Q.invalidate();
                return;
            case 16:
                p50 p50Var = (p50) this.f36248b;
                p50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p50Var.f40749a.invalidate();
                return;
            case 17:
                u50 u50Var = (u50) this.f36248b;
                u50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60 g60Var2 = u50Var.L;
                g60Var2.Q.invalidate();
                g60Var2.a2.invalidate();
                g60.A0(g60Var2).invalidate();
                g60.K0(g60Var2);
                return;
            case 18:
                ek0 ek0Var = (ek0) this.f36248b;
                ek0Var.getClass();
                ek0Var.f37388f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ek0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36248b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((cu0) this.f36248b).d;
                photoViewer.T1.f40621k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((cu0) this.f36248b).d;
                photoViewer2.T1.f40621k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.mn0) this.f36248b).f28805b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((fu0) this.f36248b).f37778r;
                photoViewer3.f34005m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                return;
            case 24:
                uu0 uu0Var = (uu0) this.f36248b;
                uu0Var.getClass();
                uu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                pv0 pv0Var = (pv0) this.f36248b;
                pv0Var.getClass();
                pv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.e();
                return;
            case 26:
                ((ez0) this.f36248b).G.f34239a.invalidate();
                return;
            case 27:
                ((j01) this.f36248b).f38812g2.U4();
                return;
            case 28:
                y01 y01Var = (y01) this.f36248b;
                float[] fArr = y01Var.f44218n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                y01Var.F = animatedFraction;
                y01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                a11 a11Var = (a11) this.f36248b;
                float lerp2 = AndroidUtilities.lerp(a11Var.f35838e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = a11Var.f35840n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null && !profileActivity.f34347p2) {
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
                a11Var.setScaleX(lerp2);
                a11Var.setScaleY(lerp2);
                a11Var.setAlpha(lerp2);
                return;
        }
    }
}
