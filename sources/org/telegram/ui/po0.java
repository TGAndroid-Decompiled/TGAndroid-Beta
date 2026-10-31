package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class po0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40708a;
    public final PhotoViewer f40709b;

    public po0(PhotoViewer photoViewer, int i10) {
        this.f40708a = i10;
        this.f40709b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40708a;
        PhotoViewer photoViewer = this.f40709b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33508i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f24615b.f6583a;
                float T1 = org.telegram.messenger.i0.T1(photoViewer.f33438a6, photoViewer.f33476e6, photoViewer.f33536l6);
                float T12 = org.telegram.messenger.i0.T1(photoViewer.X5, photoViewer.f33458c6, photoViewer.f33536l6);
                float T13 = org.telegram.messenger.i0.T1(photoViewer.Y5, photoViewer.f33467d6, photoViewer.f33536l6);
                cropAreaView.f23968n0 = 0.0f;
                cropAreaView.f23969o0 = T1;
                cropAreaView.f23970p0 = T12;
                cropAreaView.f23971q0 = T13;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33544m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.v3();
                return;
            case 6:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                er0 er0Var = photoViewer.L1;
                if (er0Var != null) {
                    er0Var.M0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                er0 er0Var2 = photoViewer.L1;
                if (er0Var2 != null && Math.abs(floatValue - er0Var2.G1) > 0.1f) {
                    er0Var2.G1 = floatValue;
                    er0Var2.u0(er0Var2.f10186r0, er0Var2.f10188s0, er0Var2.f10190t0, er0Var2.f10196w0, er0Var2.f10198x0);
                }
                photoViewer.f33470e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.f33544m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.I1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33544m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33544m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33544m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
