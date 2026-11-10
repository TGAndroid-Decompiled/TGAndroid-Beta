package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43544a;
    public final Object f43545b;

    public a3(Object obj, int i7) {
        this.f43544a = i7;
        this.f43545b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f43544a;
        Object obj = this.f43545b;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f43909e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f43910f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), q4Var.f48940n);
                int i10 = (int) (255.0f * U1);
                q4Var.f48939f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.f48941r.setAlpha((int) (66.0f * U1));
                q4Var.f48942s.setAlpha((int) (85.0f * U1));
                q4Var.f48943w.setAlpha(i10);
                q4Var.G = U1;
                q4Var.invalidate();
                return;
            case 2:
                h8 h8Var = (h8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.f46246b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.f46246b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                bd bdVar = (bd) obj;
                bdVar.f44010b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bdVar.f44010b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.vq) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                FrameLayout frameLayout = mpVar.f48009e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                er erVar = (er) obj;
                erVar.getClass();
                erVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                erVar.invalidate();
                if (erVar.getParent() != null) {
                    ((ViewGroup) erVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                zq zqVar = (zq) obj;
                zqVar.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.invalidate();
                if (zqVar.getParent() != null) {
                    ((ViewGroup) zqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                vw vwVar = (vw) obj;
                vwVar.getClass();
                vwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                dz dzVar = (dz) obj;
                dzVar.getClass();
                dzVar.f45078s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dzVar.invalidate();
                return;
            case 11:
                d00 d00Var = (d00) obj;
                d00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = d00Var.f44855c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = d00Var.f44857f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 12:
                f40 f40Var = (f40) obj;
                f40Var.P2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40Var.R1(true);
                f40Var.f45559o1.invalidate();
                f40Var.K1.invalidate();
                return;
            case 13:
                q30 q30Var = (q30) obj;
                q30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30Var.f48926a.invalidate();
                return;
            case 14:
                t30 t30Var = (t30) obj;
                t30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = t30Var.L;
                f40Var2.K1.invalidate();
                f40Var2.U3.invalidate();
                f40Var2.f28672b.invalidate();
                f40.P0(f40Var2);
                return;
            case 15:
                sa0.d0((sa0) obj);
                return;
            case 16:
                fh0 fh0Var = (fh0) obj;
                fh0Var.getClass();
                fh0Var.f45774f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                fh0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f41331w.setAlpha(floatValue4);
                passcodeActivity.f41331w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((zp0) obj).d;
                photoViewer.T1.f47673k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((zp0) obj).d;
                photoViewer2.T1.f47673k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.nk0) obj).f36328b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((cq0) obj).f44778r;
                photoViewer3.f41448l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                return;
            case 22:
                rq0 rq0Var = (rq0) obj;
                rq0Var.getClass();
                rq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                ir0 ir0Var = (ir0) obj;
                ir0Var.getClass();
                ir0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ir0Var.e();
                return;
            case 24:
                ((vu0) obj).G.f41689a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((yv0) obj).f52124x2;
                RectF rectF = ProfileActivity.V6;
                profileActivity.s5();
                return;
            case 26:
                nw0 nw0Var = (nw0) obj;
                float[] fArr = nw0Var.f48314n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                nw0Var.F = animatedFraction;
                nw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                return;
            case 27:
                pw0 pw0Var = (pw0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), pw0Var.f48847e);
                ProfileActivity profileActivity2 = pw0Var.f48849n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity2.T0;
                if (g5Var != null && !profileActivity2.f41790o2) {
                    float f13 = 1.0f - U12;
                    g5Var.setScaleX(f13);
                    profileActivity2.T0.setScaleY(f13);
                    profileActivity2.T0.setAlpha(f13);
                }
                pw0Var.setScaleX(U12);
                pw0Var.setScaleY(U12);
                pw0Var.setAlpha(U12);
                return;
            case 28:
                px0 px0Var = (px0) obj;
                px0Var.f48866n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.b();
                return;
            default:
                zx0 zx0Var = (zx0) obj;
                zx0Var.D = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), zx0Var.E);
                zx0Var.h.setTextColor(i0.a.f(zx0Var.D, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28300z6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false)));
                return;
        }
    }
}
