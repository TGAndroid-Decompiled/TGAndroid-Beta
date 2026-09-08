package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35011a;
    public final Object f35012b;

    public c3(Object obj, int i10) {
        this.f35011a = i10;
        this.f35012b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35011a) {
            case 0:
                d3 d3Var = (d3) this.f35012b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f35662e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f35663f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                r4 r4Var = (r4) this.f35012b;
                float lerp = AndroidUtilities.lerp(r4Var.f40089n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                r4Var.f40088f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.f40090r.setAlpha((int) (66.0f * lerp));
                r4Var.f40091s.setAlpha((int) (85.0f * lerp));
                r4Var.v.setAlpha(i10);
                r4Var.G = lerp;
                r4Var.invalidate();
                return;
            case 2:
                z6.X((z6) this.f35012b, valueAnimator);
                return;
            case 3:
                h8 h8Var = (h8) this.f35012b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f36925b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f36925b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                md mdVar = (md) this.f35012b;
                mdVar.f38662b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.f38662b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.or) this.f35012b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                dl dlVar = (dl) this.f35012b;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                return;
            case 7:
                lp lpVar = (lp) this.f35012b;
                lpVar.f38472r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lpVar.f38472r.invalidateSelf();
                return;
            case 8:
                gs gsVar = (gs) this.f35012b;
                gsVar.getClass();
                gsVar.f36796w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.invalidate();
                if (gsVar.getParent() != null) {
                    ((ViewGroup) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                cs csVar = (cs) this.f35012b;
                csVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                csVar.invalidate();
                if (csVar.getParent() != null) {
                    ((ViewGroup) csVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                qy qyVar = (qy) this.f35012b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                lz lzVar = (lz) this.f35012b;
                lzVar.getClass();
                lzVar.f38550r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.x9 x9Var = lzVar.f38546c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = lzVar.f38544a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f38550r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                x9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                x9Var.invalidate();
                org.telegram.ui.Components.x9 x9Var2 = lzVar.f38548f;
                x9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f38550r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                x9Var2.invalidate();
                return;
            case 12:
                c00 c00Var = (c00) this.f35012b;
                c00Var.f34985n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.f34985n.invalidateSelf();
                return;
            case 13:
                y00 y00Var = (y00) this.f35012b;
                y00Var.getClass();
                y00Var.f42960s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                return;
            case 14:
                a20 a20Var = (a20) this.f35012b;
                a20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a20Var.f34324c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a20Var.f34326f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                j60 j60Var = (j60) this.f35012b;
                j60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60Var.L1(true);
                j60Var.f37556e.invalidate();
                j60Var.Q.invalidate();
                return;
            case 16:
                s50 s50Var = (s50) this.f35012b;
                s50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.f40329a.invalidate();
                return;
            case 17:
                x50 x50Var = (x50) this.f35012b;
                x50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60 j60Var2 = x50Var.L;
                j60Var2.Q.invalidate();
                j60Var2.a2.invalidate();
                j60.z0(j60Var2).invalidate();
                j60.J0(j60Var2);
                return;
            case 18:
                hk0 hk0Var = (hk0) this.f35012b;
                hk0Var.getClass();
                hk0Var.f37086f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hk0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35012b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((bu0) this.f35012b).d;
                photoViewer.T1.f39058k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((bu0) this.f35012b).d;
                photoViewer2.T1.f39058k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.em0) this.f35012b).f25761b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((eu0) this.f35012b).f36209r;
                photoViewer3.f33649m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                tu0 tu0Var = (tu0) this.f35012b;
                tu0Var.getClass();
                tu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                ov0 ov0Var = (ov0) this.f35012b;
                ov0Var.getClass();
                ov0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ov0Var.e();
                return;
            case 26:
                ((hz0) this.f35012b).G.f33883a.invalidate();
                return;
            case 27:
                ((m01) this.f35012b).f38561g2.U4();
                return;
            case 28:
                b11 b11Var = (b11) this.f35012b;
                float[] fArr = b11Var.f34618n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                b11Var.F = animatedFraction;
                b11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                d11 d11Var = (d11) this.f35012b;
                float lerp2 = AndroidUtilities.lerp(d11Var.f35636e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = d11Var.f35638n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f33991p2) {
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
