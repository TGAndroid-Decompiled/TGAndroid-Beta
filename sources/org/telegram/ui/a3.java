package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45573a;
    public final Object f45574b;

    public a3(Object obj, int i7) {
        this.f45573a = i7;
        this.f45574b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f45573a;
        Object obj = this.f45574b;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f45890e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f45891f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), q4Var.f51308n);
                int i10 = (int) (255.0f * U1);
                q4Var.f51307f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f51309r.setAlpha((int) (66.0f * U1));
                q4Var.f51310s.setAlpha((int) (85.0f * U1));
                q4Var.f51311w.setAlpha(i10);
                q4Var.H = U1;
                q4Var.invalidate();
                return;
            case 2:
                j8 j8Var = (j8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.f49015b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.f49015b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                ad adVar = (ad) obj;
                adVar.f45660b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.f45660b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.jr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                FrameLayout frameLayout = npVar.f50360e;
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
                xw xwVar = (xw) obj;
                xwVar.getClass();
                xwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                dz dzVar = (dz) obj;
                dzVar.getClass();
                dzVar.f47267s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dzVar.invalidate();
                return;
            case 11:
                e00 e00Var = (e00) obj;
                e00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = e00Var.f47280c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = e00Var.f47282f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 12:
                e40 e40Var = (e40) obj;
                e40Var.Q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40Var.T1(true);
                e40Var.f47380p1.invalidate();
                e40Var.L1.invalidate();
                return;
            case 13:
                p30 p30Var = (p30) obj;
                p30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p30Var.f50814a.invalidate();
                return;
            case 14:
                s30 s30Var = (s30) obj;
                s30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = s30Var.L;
                e40Var2.L1.invalidate();
                e40Var2.Z3.invalidate();
                e40Var2.f30226b.invalidate();
                e40.Q0(e40Var2);
                return;
            case 15:
                pa0.d0((pa0) obj);
                return;
            case 16:
                fh0 fh0Var = (fh0) obj;
                fh0Var.getClass();
                fh0Var.f47840f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                fh0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f43266w.setAlpha(floatValue4);
                passcodeActivity.f43266w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((xp0) obj).d;
                photoViewer.U1.f49193l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((xp0) obj).d;
                photoViewer2.U1.f49193l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) obj).f34083b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((aq0) obj).f45797r;
                photoViewer3.f43398m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                ((ru0) obj).G.f43634a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((uv0) obj).f52733y2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.s5();
                return;
            case 26:
                kw0 kw0Var = (kw0) obj;
                float[] fArr = kw0Var.f49541n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                kw0Var.G = animatedFraction;
                kw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                return;
            case 27:
                mw0 mw0Var = (mw0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), mw0Var.f50131e);
                ProfileActivity profileActivity2 = mw0Var.f50133n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity2.U0;
                if (g5Var != null && !profileActivity2.f43748q2) {
                    float f13 = 1.0f - U12;
                    g5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                mw0Var.setScaleX(U12);
                mw0Var.setScaleY(U12);
                mw0Var.setAlpha(U12);
                return;
            case 28:
                lx0 lx0Var = (lx0) obj;
                lx0Var.f49874n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.b();
                return;
            default:
                wx0 wx0Var = (wx0) obj;
                wx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), wx0Var.F);
                wx0Var.h.setTextColor(i0.a.f(wx0Var.E, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29862z6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29691q6, false)));
                return;
        }
    }
}
