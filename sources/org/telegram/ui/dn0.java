package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class dn0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45085a;
    public final PhotoViewer f45086b;

    public dn0(PhotoViewer photoViewer, int i7) {
        this.f45085a = i7;
        this.f45086b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f45085a;
        PhotoViewer photoViewer = this.f45086b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41422h3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f33932b.f21007a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.Z5, photoViewer.f41387d6, photoViewer.f41449k6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.W5, photoViewer.f41369b6, photoViewer.f41449k6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f41379c6, photoViewer.f41449k6);
                cropAreaView.f31321n0 = 0.0f;
                cropAreaView.f31322o0 = T1;
                cropAreaView.f31323p0 = T12;
                cropAreaView.f31324q0 = T13;
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
                photoViewer.f41457l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                wp0 wp0Var = photoViewer.L1;
                if (wp0Var != null) {
                    wp0Var.M0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Y5 = floatValue;
                wp0 wp0Var2 = photoViewer.L1;
                if (wp0Var2 != null && Math.abs(floatValue - wp0Var2.G1) > 0.1f) {
                    wp0Var2.G1 = floatValue;
                    wp0Var2.v0(wp0Var2.f55700r0, wp0Var2.f55702s0, wp0Var2.f55704t0, wp0Var2.f55710w0, wp0Var2.f55712x0);
                }
                photoViewer.f41391e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer.f41457l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41457l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41457l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.f41457l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
