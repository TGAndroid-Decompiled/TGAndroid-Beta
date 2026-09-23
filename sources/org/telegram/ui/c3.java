package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32245a;
    public final Object f32246b;

    public c3(Object obj, int i10) {
        this.f32245a = i10;
        this.f32246b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32245a) {
            case 0:
                d3 d3Var = (d3) this.f32246b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f32497f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                return;
            case 1:
                r4 r4Var = (r4) this.f32246b;
                float lerp = AndroidUtilities.lerp(r4Var.f36685n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                r4Var.f36684f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.f36686r.setAlpha((int) (66.0f * lerp));
                r4Var.f36687s.setAlpha((int) (85.0f * lerp));
                r4Var.v.setAlpha(i10);
                r4Var.G = lerp;
                r4Var.invalidate();
                return;
            case 2:
                z6.X((z6) this.f32246b, valueAnimator);
                return;
            case 3:
                h8 h8Var = (h8) this.f32246b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f33752b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f33752b.getChildAt(i11), floatValue2);
                }
                return;
            case 4:
                ld ldVar = (ld) this.f32246b;
                ldVar.f34917b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ldVar.f34917b.invalidateSelf();
                return;
            case 5:
                ((org.telegram.ui.Components.qr) this.f32246b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                al alVar = (al) this.f32246b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                return;
            case 7:
                gp gpVar = (gp) this.f32246b;
                gpVar.f33624r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gpVar.f33624r.invalidateSelf();
                return;
            case 8:
                bs bsVar = (bs) this.f32246b;
                bsVar.getClass();
                bsVar.f32172w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                xr xrVar = (xr) this.f32246b;
                xrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 10:
                ny nyVar = (ny) this.f32246b;
                nyVar.getClass();
                nyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                iz izVar = (iz) this.f32246b;
                izVar.getClass();
                izVar.f34289r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = izVar.f34286c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = izVar.f34284a;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(izVar.f34289r, v02, org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = izVar.f34287f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.f34289r, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i13, d6Var)), mode));
                w9Var2.invalidate();
                return;
            case 12:
                zz zzVar = (zz) this.f32246b;
                zzVar.f40284n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                zzVar.f40284n.invalidateSelf();
                return;
            case 13:
                v00 v00Var = (v00) this.f32246b;
                v00Var.getClass();
                v00Var.f38251s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.invalidate();
                return;
            case 14:
                x10 x10Var = (x10) this.f32246b;
                x10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = x10Var.f39146c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = x10Var.f39147f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                return;
            case 15:
                f60 f60Var = (f60) this.f32246b;
                f60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f60Var.L1(true);
                f60Var.e.invalidate();
                f60Var.Q.invalidate();
                return;
            case 16:
                o50 o50Var = (o50) this.f32246b;
                o50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50Var.f35683a.invalidate();
                return;
            case 17:
                t50 t50Var = (t50) this.f32246b;
                t50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f60 f60Var2 = t50Var.L;
                f60Var2.Q.invalidate();
                f60Var2.a2.invalidate();
                f60.z0(f60Var2).invalidate();
                f60.J0(f60Var2);
                return;
            case 18:
                yj0 yj0Var = (yj0) this.f32246b;
                yj0Var.getClass();
                yj0Var.f39849f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                yj0Var.invalidate();
                return;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32246b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 20:
                PhotoViewer photoViewer = ((vt0) this.f32246b).d;
                photoViewer.T1.f33928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 21:
                PhotoViewer photoViewer2 = ((vt0) this.f32246b).d;
                photoViewer2.T1.f33928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.fm0) this.f32246b).f24009b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 23:
                PhotoViewer photoViewer3 = ((yt0) this.f32246b).f39894r;
                photoViewer3.f30981m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                return;
            case 24:
                nu0 nu0Var = (nu0) this.f32246b;
                nu0Var.getClass();
                nu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                iv0 iv0Var = (iv0) this.f32246b;
                iv0Var.getClass();
                iv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iv0Var.e();
                return;
            case 26:
                ((zy0) this.f32246b).G.f31209a.invalidate();
                return;
            case 27:
                ((e01) this.f32246b).f32771g2.U4();
                return;
            case 28:
                t01 t01Var = (t01) this.f32246b;
                float[] fArr = t01Var.f37489n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                t01Var.F = animatedFraction;
                t01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                return;
            default:
                v01 v01Var = (v01) this.f32246b;
                float lerp2 = AndroidUtilities.lerp(v01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = v01Var.f38259n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.f31316p2) {
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
                v01Var.setScaleX(lerp2);
                v01Var.setScaleY(lerp2);
                v01Var.setAlpha(lerp2);
                return;
        }
    }
}
