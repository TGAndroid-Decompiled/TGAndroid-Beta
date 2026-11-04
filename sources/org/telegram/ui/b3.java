package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43904a;
    public final Object f43905b;

    public b3(Object obj, int i3) {
        this.f43904a = i3;
        this.f43905b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f43904a;
        Object obj = this.f43905b;
        switch (i3) {
            case 0:
                c3 c3Var = (c3) obj;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.f44208e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.f44209f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                return;
            case 1:
                s4 s4Var = (s4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), s4Var.f49352n);
                int i10 = (int) (255.0f * U1);
                s4Var.f49351f.setAlpha(i10);
                s4Var.h.setAlpha(i10);
                s4Var.f49353r.setAlpha((int) (66.0f * U1));
                s4Var.f49354s.setAlpha((int) (85.0f * U1));
                s4Var.f49355w.setAlpha(i10);
                s4Var.H = U1;
                s4Var.invalidate();
                return;
            case 2:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.f46165b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.f46165b.getChildAt(i11), floatValue2);
                }
                return;
            case 3:
                ad adVar = (ad) obj;
                adVar.f43727b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.f43727b.invalidateSelf();
                return;
            case 4:
                ((org.telegram.ui.Components.wq) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                dkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dkVar.invalidate();
                return;
            case 6:
                ip ipVar = (ip) obj;
                ipVar.getClass();
                ipVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = ipVar.f46333e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                zq zqVar = (zq) obj;
                zqVar.getClass();
                zqVar.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.invalidate();
                if (zqVar.getParent() != null) {
                    ((ViewGroup) zqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 8:
                vq vqVar = (vq) obj;
                vqVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vqVar.invalidate();
                if (vqVar.getParent() != null) {
                    ((ViewGroup) vqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 9:
                pw pwVar = (pw) obj;
                pwVar.getClass();
                pwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                yy yyVar = (yy) obj;
                yyVar.getClass();
                yyVar.f52447s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.invalidate();
                return;
            case 11:
                yz yzVar = (yz) obj;
                yzVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = yzVar.f52456c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = yzVar.f52458f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                return;
            case 12:
                x30 x30Var = (x30) obj;
                x30Var.N2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x30Var.O1(true);
                x30Var.m1.invalidate();
                x30Var.I1.invalidate();
                return;
            case 13:
                i30 i30Var = (i30) obj;
                i30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30Var.f46044a.invalidate();
                return;
            case 14:
                l30 l30Var = (l30) obj;
                l30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x30 x30Var2 = l30Var.L;
                x30Var2.I1.invalidate();
                x30Var2.S3.invalidate();
                x30Var2.f28586b.invalidate();
                x30.P0(x30Var2);
                return;
            case 15:
                la0.d0((la0) obj);
                return;
            case 16:
                xg0 xg0Var = (xg0) obj;
                xg0Var.getClass();
                xg0Var.f52025f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                xg0Var.invalidate();
                return;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.f41362w.setAlpha(floatValue4);
                passcodeActivity.f41362w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 18:
                PhotoViewer photoViewer = ((np0) obj).d;
                photoViewer.U1.f52735l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 19:
                PhotoViewer photoViewer2 = ((np0) obj).d;
                photoViewer2.U1.f52735l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.rk0) obj).f37747b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 21:
                PhotoViewer photoViewer3 = ((qp0) obj).f48942r;
                photoViewer3.f41492n6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.I1();
                return;
            case 22:
                fq0 fq0Var = (fq0) obj;
                fq0Var.getClass();
                fq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                vq0 vq0Var = (vq0) obj;
                vq0Var.getClass();
                vq0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vq0Var.e();
                return;
            case 24:
                ((iu0) obj).G.f41719a.invalidate();
                return;
            case 25:
                ProfileActivity profileActivity = ((mv0) obj).f47793y2;
                RectF rectF = ProfileActivity.T6;
                profileActivity.p5();
                return;
            case 26:
                cw0 cw0Var = (cw0) obj;
                float[] fArr = cw0Var.f44449n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                cw0Var.G = animatedFraction;
                cw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                return;
            case 27:
                ew0 ew0Var = (ew0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ew0Var.f45060e);
                ProfileActivity profileActivity2 = ew0Var.f45062n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity2.U0;
                if (f5Var != null && !profileActivity2.f41826p2) {
                    float f13 = 1.0f - U12;
                    f5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                ew0Var.setScaleX(U12);
                ew0Var.setScaleY(U12);
                ew0Var.setAlpha(U12);
                return;
            case 28:
                cx0 cx0Var = (cx0) obj;
                cx0Var.f44471n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.b();
                return;
            default:
                mx0 mx0Var = (mx0) obj;
                mx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), mx0Var.F);
                mx0Var.h.setTextColor(i0.a.f(mx0Var.E, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28290z6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false)));
                return;
        }
    }
}
