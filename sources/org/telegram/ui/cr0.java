package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35537a;
    public final PhotoViewer f35538b;

    public cr0(PhotoViewer photoViewer, int i10) {
        this.f35537a = i10;
        this.f35538b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35537a;
        PhotoViewer photoViewer = this.f35538b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33932i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f26850b.f15574a;
                float lerp = AndroidUtilities.lerp(photoViewer.f33861a6, photoViewer.f33900e6, photoViewer.f33959l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f33881c6, photoViewer.f33959l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f33890d6, photoViewer.f33959l6);
                cropAreaView.f24145n0 = 0.0f;
                cropAreaView.f24146o0 = lerp;
                cropAreaView.f24147p0 = lerp2;
                cropAreaView.f24148q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33967m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.s3();
                return;
            case 6:
                photoViewer.L1.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                vt0 vt0Var = photoViewer.L1;
                if (vt0Var != null) {
                    vt0Var.f45160d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                vt0 vt0Var2 = photoViewer.L1;
                if (vt0Var2 != null && Math.abs(floatValue - vt0Var2.X1) > 0.1f) {
                    vt0Var2.X1 = floatValue;
                    vt0Var2.w0(vt0Var2.I0, vt0Var2.J0, vt0Var2.K0, vt0Var2.N0, vt0Var2.O0);
                }
                photoViewer.f33894e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33967m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.G1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33967m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33967m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33967m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
