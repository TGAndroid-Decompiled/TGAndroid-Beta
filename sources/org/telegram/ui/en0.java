package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class en0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45411a;
    public final PhotoViewer f45412b;

    public en0(PhotoViewer photoViewer, int i7) {
        this.f45411a = i7;
        this.f45412b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f45411a;
        PhotoViewer photoViewer = this.f45412b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41413h3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f33527b.f21012a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.Z5, photoViewer.f41378d6, photoViewer.f41440k6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.W5, photoViewer.f41360b6, photoViewer.f41440k6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f41370c6, photoViewer.f41440k6);
                cropAreaView.f31332n0 = 0.0f;
                cropAreaView.f31333o0 = T1;
                cropAreaView.f31334p0 = T12;
                cropAreaView.f31335q0 = T13;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41448l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.p3();
                return;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                xp0 xp0Var = photoViewer.L1;
                if (xp0Var != null) {
                    xp0Var.M0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Y5 = floatValue;
                xp0 xp0Var2 = photoViewer.L1;
                if (xp0Var2 != null && Math.abs(floatValue - xp0Var2.G1) > 0.1f) {
                    xp0Var2.G1 = floatValue;
                    xp0Var2.v0(xp0Var2.f55699r0, xp0Var2.f55701s0, xp0Var2.f55703t0, xp0Var2.f55709w0, xp0Var2.f55711x0);
                }
                photoViewer.f41382e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer.f41448l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41448l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41448l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41448l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
