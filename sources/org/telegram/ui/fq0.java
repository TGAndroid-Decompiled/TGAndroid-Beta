package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class fq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38225a;
    public final PhotoViewer f38226b;

    public fq0(PhotoViewer photoViewer, int i10) {
        this.f38225a = i10;
        this.f38226b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f38225a;
        PhotoViewer photoViewer = this.f38226b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35686e3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.f35866y1.f31657b.f49953a;
                float lerp = AndroidUtilities.lerp(photoViewer.W5, photoViewer.f35652a6, photoViewer.f35717h6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.T5, photoViewer.Y5, photoViewer.f35717h6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.U5, photoViewer.Z5, photoViewer.f35717h6);
                cropAreaView.f26372j0 = 0.0f;
                cropAreaView.f26373k0 = lerp;
                cropAreaView.f26374l0 = lerp2;
                cropAreaView.m0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.H1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.H1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35726i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.s3();
                return;
            case 6:
                photoViewer.H1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.H1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                ws0 ws0Var = photoViewer.H1;
                if (ws0Var != null) {
                    ws0Var.Z0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.V5 = floatValue;
                ws0 ws0Var2 = photoViewer.H1;
                if (ws0Var2 != null && Math.abs(floatValue - ws0Var2.T1) > 0.1f) {
                    ws0Var2.T1 = floatValue;
                    ws0Var2.v0(ws0Var2.E0, ws0Var2.F0, ws0Var2.G0, ws0Var2.J0, ws0Var2.K0);
                }
                photoViewer.f35647a0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35726i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35726i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35726i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.S0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.f35726i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
