package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34984a;
    public final Object f34985b;

    public c3(Object obj, int i10) {
        this.f34984a = i10;
        this.f34985b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34984a) {
            case 0:
                d3 d3Var = (d3) this.f34985b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f35635e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f35636f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                r4 r4Var = (r4) this.f34985b;
                float lerp = AndroidUtilities.lerp(r4Var.f40062n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                r4Var.f40061f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.f40063r.setAlpha((int) (66.0f * lerp));
                r4Var.f40064s.setAlpha((int) (85.0f * lerp));
                r4Var.v.setAlpha(i10);
                r4Var.G = lerp;
                r4Var.invalidate();
                return;
            case 2:
                z6.X((z6) this.f34985b, valueAnimator);
                return;
            case 3:
                h8 h8Var = (h8) this.f34985b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f36898b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f36898b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                md mdVar = (md) this.f34985b;
                mdVar.f38635b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.f38635b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.or) this.f34985b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                dl dlVar = (dl) this.f34985b;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                return;
            case 7:
                lp lpVar = (lp) this.f34985b;
                lpVar.f38445r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lpVar.f38445r.invalidateSelf();
                return;
            case 8:
                gs gsVar = (gs) this.f34985b;
                gsVar.getClass();
                gsVar.f36769w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.invalidate();
                if (gsVar.getParent() != null) {
                    ((ViewGroup) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                cs csVar = (cs) this.f34985b;
                csVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                csVar.invalidate();
                if (csVar.getParent() != null) {
                    ((ViewGroup) csVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                qy qyVar = (qy) this.f34985b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                lz lzVar = (lz) this.f34985b;
                lzVar.getClass();
                lzVar.f38523r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.x9 x9Var = lzVar.f38519c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = lzVar.f38517a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f38523r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                x9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                x9Var.invalidate();
                org.telegram.ui.Components.x9 x9Var2 = lzVar.f38521f;
                x9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f38523r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                x9Var2.invalidate();
                return;
            case 12:
                c00 c00Var = (c00) this.f34985b;
                c00Var.f34958n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f34958n.invalidateSelf();
                return;
            case 13:
                y00 y00Var = (y00) this.f34985b;
                y00Var.getClass();
                y00Var.f42933s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 14:
                a20 a20Var = (a20) this.f34985b;
                a20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a20Var.f34297c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a20Var.f34299f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                j60 j60Var = (j60) this.f34985b;
                j60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60Var.L1(true);
                j60Var.f37529e.invalidate();
                j60Var.Q.invalidate();
                return;
            case 16:
                s50 s50Var = (s50) this.f34985b;
                s50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.f40302a.invalidate();
                return;
            case 17:
                x50 x50Var = (x50) this.f34985b;
                x50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60 j60Var2 = x50Var.L;
                j60Var2.Q.invalidate();
                j60Var2.a2.invalidate();
                j60.z0(j60Var2).invalidate();
                j60.J0(j60Var2);
                return;
            case 18:
                hk0 hk0Var = (hk0) this.f34985b;
                hk0Var.getClass();
                hk0Var.f37059f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hk0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34985b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((bu0) this.f34985b).d;
                photoViewer.T1.f39031k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((bu0) this.f34985b).d;
                photoViewer2.T1.f39031k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.em0) this.f34985b).f25734b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((eu0) this.f34985b).f36182r;
                photoViewer3.f33622m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                tu0 tu0Var = (tu0) this.f34985b;
                tu0Var.getClass();
                tu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                ov0 ov0Var = (ov0) this.f34985b;
                ov0Var.getClass();
                ov0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ov0Var.e();
                return;
            case 26:
                ((hz0) this.f34985b).G.f33856a.invalidate();
                return;
            case 27:
                ((m01) this.f34985b).f38534g2.U4();
                return;
            case 28:
                b11 b11Var = (b11) this.f34985b;
                float[] fArr = b11Var.f34591n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                b11Var.F = animatedFraction;
                b11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                d11 d11Var = (d11) this.f34985b;
                float lerp2 = AndroidUtilities.lerp(d11Var.f35609e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = d11Var.f35611n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f33964p2) {
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
                d11Var.setScaleX(lerp2);
                d11Var.setScaleY(lerp2);
                d11Var.setAlpha(lerp2);
                return;
        }
    }
}
