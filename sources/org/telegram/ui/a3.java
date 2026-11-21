package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45483a;
    public final Object f45484b;

    public a3(Object obj, int i7) {
        this.f45483a = i7;
        this.f45484b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f45483a;
        Object obj = this.f45484b;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f45758e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f45759f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), q4Var.f51055n);
                int i10 = (int) (255.0f * U1);
                q4Var.f51054f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f51056r.setAlpha((int) (66.0f * U1));
                q4Var.f51057s.setAlpha((int) (85.0f * U1));
                q4Var.f51058w.setAlpha(i10);
                q4Var.H = U1;
                q4Var.invalidate();
                return;
            case 2:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.f48617b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.f48617b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                ad adVar = (ad) obj;
                adVar.f45573b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.f45573b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.mr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ik ikVar = (ik) obj;
                ikVar.getClass();
                ikVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ikVar.invalidate();
                return;
            case 6:
                np npVar = (np) obj;
                npVar.getClass();
                npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = npVar.f50240e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                er erVar = (er) obj;
                erVar.getClass();
                erVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                erVar.invalidate();
                if (erVar.getParent() != null) {
                    ((ViewGroup) erVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                zq zqVar = (zq) obj;
                zqVar.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.invalidate();
                if (zqVar.getParent() != null) {
                    ((ViewGroup) zqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                yw ywVar = (yw) obj;
                ywVar.getClass();
                ywVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                ez ezVar = (ez) obj;
                ezVar.getClass();
                ezVar.f47422s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.invalidate();
                return;
            case 11:
                f00 f00Var = (f00) obj;
                f00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = f00Var.f47435c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = f00Var.f47437f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 12:
                f40 f40Var = (f40) obj;
                f40Var.Q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40Var.U1(true);
                f40Var.f47526p1.invalidate();
                f40Var.L1.invalidate();
                return;
            case 13:
                q30 q30Var = (q30) obj;
                q30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30Var.f51041a.invalidate();
                return;
            case 14:
                t30 t30Var = (t30) obj;
                t30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = t30Var.L;
                f40Var2.L1.invalidate();
                f40Var2.Z3.invalidate();
                f40Var2.f30173b.invalidate();
                f40.Q0(f40Var2);
                return;
            case 15:
                qa0.d0((qa0) obj);
                return;
            case 16:
                hh0 hh0Var = (hh0) obj;
                hh0Var.getClass();
                hh0Var.f48400f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hh0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f43187w.setAlpha(floatValue4);
                passcodeActivity.f43187w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((xp0) obj).d;
                photoViewer.U1.f49075l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((xp0) obj).d;
                photoViewer2.U1.f49075l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) obj).f34222b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((aq0) obj).f45667r;
                photoViewer3.f43313m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                return;
            case 22:
                pq0 pq0Var = (pq0) obj;
                pq0Var.getClass();
                pq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                fr0 fr0Var = (fr0) obj;
                fr0Var.getClass();
                fr0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fr0Var.e();
                return;
            case 24:
                ((su0) obj).G.f43549a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((vv0) obj).f52894y2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.s5();
                return;
            case 26:
                mw0 mw0Var = (mw0) obj;
                float[] fArr = mw0Var.f50000n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                mw0Var.G = animatedFraction;
                mw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                return;
            case 27:
                ow0 ow0Var = (ow0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ow0Var.f50664e);
                ProfileActivity profileActivity2 = ow0Var.f50666n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity2.U0;
                if (g5Var != null && !profileActivity2.f43663q2) {
                    float f13 = 1.0f - U12;
                    g5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                ow0Var.setScaleX(U12);
                ow0Var.setScaleY(U12);
                ow0Var.setAlpha(U12);
                return;
            case 28:
                nx0 nx0Var = (nx0) obj;
                nx0Var.f50348n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.b();
                return;
            default:
                yx0 yx0Var = (yx0) obj;
                yx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), yx0Var.F);
                yx0Var.h.setTextColor(i0.a.f(yx0Var.E, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29789z6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29618q6, false)));
                return;
        }
    }
}
