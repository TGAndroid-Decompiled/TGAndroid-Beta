package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bn0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44454a;
    public final PhotoViewer f44455b;

    public bn0(PhotoViewer photoViewer, int i7) {
        this.f44454a = i7;
        this.f44455b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f44454a;
        PhotoViewer photoViewer = this.f44455b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41412h3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f33508b.f21004a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.Z5, photoViewer.f41377d6, photoViewer.f41439k6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.W5, photoViewer.f41359b6, photoViewer.f41439k6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f41369c6, photoViewer.f41439k6);
                cropAreaView.f31311n0 = 0.0f;
                cropAreaView.f31312o0 = T1;
                cropAreaView.f31313p0 = T12;
                cropAreaView.f31314q0 = T13;
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
                photoViewer.f41447l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                up0 up0Var = photoViewer.L1;
                if (up0Var != null) {
                    up0Var.M0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Y5 = floatValue;
                up0 up0Var2 = photoViewer.L1;
                if (up0Var2 != null && Math.abs(floatValue - up0Var2.G1) > 0.1f) {
                    up0Var2.G1 = floatValue;
                    up0Var2.v0(up0Var2.f55596r0, up0Var2.f55598s0, up0Var2.f55600t0, up0Var2.f55606w0, up0Var2.f55608x0);
                }
                photoViewer.f41381e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer.f41447l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41447l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41447l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41447l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
