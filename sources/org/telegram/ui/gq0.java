package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class gq0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f38465a;

    public final PhotoViewer f38466b;

    public gq0(PhotoViewer photoViewer, int i10) {
        this.f38465a = i10;
        this.f38466b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f38465a;
        PhotoViewer photoViewer = this.f38466b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35623e3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.f35802y1.f28602b.f48626a;
                float fLerp = AndroidUtilities.lerp(photoViewer.W5, photoViewer.f35587a6, photoViewer.f35654h6);
                float fLerp2 = AndroidUtilities.lerp(photoViewer.T5, photoViewer.Y5, photoViewer.f35654h6);
                float fLerp3 = AndroidUtilities.lerp(photoViewer.U5, photoViewer.Z5, photoViewer.f35654h6);
                cropAreaView.f26357j0 = 0.0f;
                cropAreaView.f26358k0 = fLerp;
                cropAreaView.f26359l0 = fLerp2;
                cropAreaView.m0 = fLerp3;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.H1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.H1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35663i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.s3();
                break;
            case 6:
                photoViewer.H1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.H1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                ys0 ys0Var = photoViewer.H1;
                if (ys0Var != null) {
                    ys0Var.Z0.invalidate();
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.V5 = fFloatValue;
                ys0 ys0Var2 = photoViewer.H1;
                if (ys0Var2 != null && Math.abs(fFloatValue - ys0Var2.T1) > 0.1f) {
                    ys0Var2.T1 = fFloatValue;
                    ys0Var2.v0(ys0Var2.E0, ys0Var2.F0, ys0Var2.G0, ys0Var2.J0, ys0Var2.K0);
                }
                photoViewer.f35583a0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35663i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35663i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35663i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.S0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35663i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
