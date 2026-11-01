package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class no0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39951a;
    public final PhotoViewer f39952b;

    public no0(PhotoViewer photoViewer, int i10) {
        this.f39951a = i10;
        this.f39952b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f39951a;
        PhotoViewer photoViewer = this.f39952b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33515i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f24715b.f6583a;
                float T1 = org.telegram.messenger.i0.T1(photoViewer.f33445a6, photoViewer.f33483e6, photoViewer.f33543l6);
                float T12 = org.telegram.messenger.i0.T1(photoViewer.X5, photoViewer.f33465c6, photoViewer.f33543l6);
                float T13 = org.telegram.messenger.i0.T1(photoViewer.Y5, photoViewer.f33474d6, photoViewer.f33543l6);
                cropAreaView.f23969n0 = 0.0f;
                cropAreaView.f23970o0 = T1;
                cropAreaView.f23971p0 = T12;
                cropAreaView.f23972q0 = T13;
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
                photoViewer.f33551m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                cr0 cr0Var = photoViewer.L1;
                if (cr0Var != null) {
                    cr0Var.M0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                cr0 cr0Var2 = photoViewer.L1;
                if (cr0Var2 != null && Math.abs(floatValue - cr0Var2.G1) > 0.1f) {
                    cr0Var2.G1 = floatValue;
                    cr0Var2.u0(cr0Var2.f10187r0, cr0Var2.f10189s0, cr0Var2.f10191t0, cr0Var2.f10197w0, cr0Var2.f10199x0);
                }
                photoViewer.f33477e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.f33551m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.I1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33551m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33551m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33551m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
