package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44926a;
    public final Object f44927b;

    public a3(Object obj, int i7) {
        this.f44926a = i7;
        this.f44927b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f44926a;
        Object obj = this.f44927b;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f45565e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f45566f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), q4Var.f50455n);
                int i10 = (int) (255.0f * U1);
                q4Var.f50454f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f50456r.setAlpha((int) (66.0f * U1));
                q4Var.f50457s.setAlpha((int) (85.0f * U1));
                q4Var.f50458w.setAlpha(i10);
                q4Var.H = U1;
                q4Var.invalidate();
                return;
            case 2:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.f47930b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.f47930b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                ad adVar = (ad) obj;
                adVar.f44997b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.f44997b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.dr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.getClass();
                hkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hkVar.invalidate();
                return;
            case 6:
                mp mpVar = (mp) obj;
                mpVar.getClass();
                mpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mpVar.f49276e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                dr drVar = (dr) obj;
                drVar.getClass();
                drVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                drVar.invalidate();
                if (drVar.getParent() != null) {
                    ((ViewGroup) drVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                yq yqVar = (yq) obj;
                yqVar.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yqVar.invalidate();
                if (yqVar.getParent() != null) {
                    ((ViewGroup) yqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                uw uwVar = (uw) obj;
                uwVar.getClass();
                uwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                bz bzVar = (bz) obj;
                bzVar.getClass();
                bzVar.f45849s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bzVar.invalidate();
                return;
            case 11:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = c00Var.f45861c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = c00Var.f45863f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 12:
                c40 c40Var = (c40) obj;
                c40Var.Q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40Var.T1(true);
                c40Var.f45944p1.invalidate();
                c40Var.L1.invalidate();
                return;
            case 13:
                n30 n30Var = (n30) obj;
                n30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n30Var.f49431a.invalidate();
                return;
            case 14:
                q30 q30Var = (q30) obj;
                q30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var2 = q30Var.L;
                c40Var2.L1.invalidate();
                c40Var2.Z3.invalidate();
                c40Var2.f29682b.invalidate();
                c40.P0(c40Var2);
                return;
            case 15:
                pa0.d0((pa0) obj);
                return;
            case 16:
                dh0 dh0Var = (dh0) obj;
                dh0Var.getClass();
                dh0Var.f46374f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dh0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f42701w.setAlpha(floatValue4);
                passcodeActivity.f42701w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((vp0) obj).d;
                photoViewer.U1.f47799l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((vp0) obj).d;
                photoViewer2.U1.f47799l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.sk0) obj).f39332b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((yp0) obj).f53577r;
                photoViewer3.f42827m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                return;
            case 22:
                nq0 nq0Var = (nq0) obj;
                nq0Var.getClass();
                nq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                dr0 dr0Var = (dr0) obj;
                dr0Var.getClass();
                dr0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dr0Var.e();
                return;
            case 24:
                ((qu0) obj).G.f43062a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((uv0) obj).f52033y2;
                RectF rectF = ProfileActivity.X6;
                profileActivity.r5();
                return;
            case 26:
                jw0 jw0Var = (jw0) obj;
                float[] fArr = jw0Var.f48428n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                jw0Var.G = animatedFraction;
                jw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                return;
            case 27:
                lw0 lw0Var = (lw0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), lw0Var.f49049e);
                ProfileActivity profileActivity2 = lw0Var.f49051n;
                org.telegram.ui.ActionBar.d5 d5Var = profileActivity2.U0;
                if (d5Var != null && !profileActivity2.f43176q2) {
                    float f13 = 1.0f - U12;
                    d5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                lw0Var.setScaleX(U12);
                lw0Var.setScaleY(U12);
                lw0Var.setAlpha(U12);
                return;
            case 28:
                jx0 jx0Var = (jx0) obj;
                jx0Var.f48450n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.b();
                return;
            default:
                tx0 tx0Var = (tx0) obj;
                tx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), tx0Var.F);
                tx0Var.h.setTextColor(i0.a.f(tx0Var.E, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29260z6, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false)));
                return;
        }
    }
}
