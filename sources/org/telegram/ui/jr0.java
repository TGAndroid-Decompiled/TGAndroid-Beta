package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34920a;
    public final PhotoViewer f34921b;

    public jr0(PhotoViewer photoViewer, int i10) {
        this.f34920a = i10;
        this.f34921b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f34920a;
        PhotoViewer photoViewer = this.f34921b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f30988i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f28369b.f14110a;
                float lerp = AndroidUtilities.lerp(photoViewer.f30918a6, photoViewer.f30956e6, photoViewer.f31015l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f30938c6, photoViewer.f31015l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f30947d6, photoViewer.f31015l6);
                cropAreaView.f22030n0 = 0.0f;
                cropAreaView.f22031o0 = lerp;
                cropAreaView.f22032p0 = lerp2;
                cropAreaView.f22033q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f31023m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer.s3();
                return;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                cu0 cu0Var = photoViewer.L1;
                if (cu0Var != null) {
                    cu0Var.f41542d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.T8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                cu0 cu0Var2 = photoViewer.L1;
                if (cu0Var2 != null && Math.abs(floatValue - cu0Var2.X1) > 0.1f) {
                    cu0Var2.X1 = floatValue;
                    cu0Var2.v0(cu0Var2.I0, cu0Var2.J0, cu0Var2.K0, cu0Var2.N0, cu0Var2.O0);
                }
                photoViewer.f30950e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f31023m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f31023m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f31023m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f31023m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
