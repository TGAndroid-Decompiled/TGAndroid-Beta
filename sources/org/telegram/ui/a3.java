package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43576a;
    public final Object f43577b;

    public a3(Object obj, int i7) {
        this.f43576a = i7;
        this.f43577b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f43576a;
        Object obj = this.f43577b;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f43865e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f43866f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), q4Var.f48887n);
                int i10 = (int) (255.0f * U1);
                q4Var.f48886f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f48888r.setAlpha((int) (66.0f * U1));
                q4Var.f48889s.setAlpha((int) (85.0f * U1));
                q4Var.f48890w.setAlpha(i10);
                q4Var.G = U1;
                q4Var.invalidate();
                return;
            case 2:
                h8 h8Var = (h8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f46191b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f46191b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                bd bdVar = (bd) obj;
                bdVar.f43981b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bdVar.f43981b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.wq) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                jk jkVar = (jk) obj;
                jkVar.getClass();
                jkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                jkVar.invalidate();
                return;
            case 6:
                mp mpVar = (mp) obj;
                mpVar.getClass();
                mpVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mpVar.f47917e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                dr drVar = (dr) obj;
                drVar.getClass();
                drVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                drVar.invalidate();
                if (drVar.getParent() != null) {
                    ((ViewGroup) drVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                yq yqVar = (yq) obj;
                yqVar.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                cz czVar = (cz) obj;
                czVar.getClass();
                czVar.f44780s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar.invalidate();
                return;
            case 11:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = c00Var.f44173c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = c00Var.f44175f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 12:
                e40 e40Var = (e40) obj;
                e40Var.M2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40Var.R1(true);
                e40Var.l1.invalidate();
                e40Var.H1.invalidate();
                return;
            case 13:
                p30 p30Var = (p30) obj;
                p30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p30Var.f48602a.invalidate();
                return;
            case 14:
                s30 s30Var = (s30) obj;
                s30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = s30Var.L;
                e40Var2.H1.invalidate();
                e40Var2.R3.invalidate();
                e40Var2.f28624b.invalidate();
                e40.P0(e40Var2);
                return;
            case 15:
                ra0.d0((ra0) obj);
                return;
            case 16:
                eh0 eh0Var = (eh0) obj;
                eh0Var.getClass();
                eh0Var.f45447f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                eh0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f41340w.setAlpha(floatValue4);
                passcodeActivity.f41340w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((yp0) obj).d;
                photoViewer.T1.f47349k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((yp0) obj).d;
                photoViewer2.T1.f47349k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.ok0) obj).f36738b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((bq0) obj).f44106r;
                photoViewer3.f41457l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                return;
            case 22:
                qq0 qq0Var = (qq0) obj;
                qq0Var.getClass();
                qq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                hr0 hr0Var = (hr0) obj;
                hr0Var.getClass();
                hr0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hr0Var.e();
                return;
            case 24:
                ((uu0) obj).G.f41698a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((xv0) obj).f51771x2;
                RectF rectF = ProfileActivity.V6;
                profileActivity.s5();
                return;
            case 26:
                mw0 mw0Var = (mw0) obj;
                float[] fArr = mw0Var.f48017n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                mw0Var.F = animatedFraction;
                mw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                return;
            case 27:
                ow0 ow0Var = (ow0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ow0Var.f48531e);
                ProfileActivity profileActivity2 = ow0Var.f48533n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity2.T0;
                if (f5Var != null && !profileActivity2.f41799o2) {
                    float f13 = 1.0f - U12;
                    f5Var.setScaleX(f13);
                    profileActivity2.T0.setScaleY(f13);
                    profileActivity2.T0.setAlpha(f13);
                }
                ow0Var.setScaleX(U12);
                ow0Var.setScaleY(U12);
                ow0Var.setAlpha(U12);
                return;
            case 28:
                ox0 ox0Var = (ox0) obj;
                ox0Var.f48550n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var.b();
                return;
            default:
                yx0 yx0Var = (yx0) obj;
                yx0Var.D = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), yx0Var.E);
                yx0Var.h.setTextColor(i0.a.f(yx0Var.D, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28275z6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false)));
                return;
        }
    }
}
