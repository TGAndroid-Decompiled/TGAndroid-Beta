package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class lr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37807a;
    public final PhotoViewer f37808b;

    public lr0(PhotoViewer photoViewer, int i10) {
        this.f37807a = i10;
        this.f37808b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f37807a;
        PhotoViewer photoViewer = this.f37808b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31966i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f29367b.f15559a;
                float lerp = AndroidUtilities.lerp(photoViewer.f31896a6, photoViewer.f31934e6, photoViewer.f31994l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f31916c6, photoViewer.f31994l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f31925d6, photoViewer.f31994l6);
                cropAreaView.f22840n0 = 0.0f;
                cropAreaView.f22841o0 = lerp;
                cropAreaView.f22842p0 = lerp2;
                cropAreaView.f22843q0 = lerp3;
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
                photoViewer.f32002m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                gu0 gu0Var = photoViewer.L1;
                if (gu0Var != null) {
                    gu0Var.f44164d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                gu0 gu0Var2 = photoViewer.L1;
                if (gu0Var2 != null && Math.abs(floatValue - gu0Var2.X1) > 0.1f) {
                    gu0Var2.X1 = floatValue;
                    gu0Var2.w0(gu0Var2.I0, gu0Var2.J0, gu0Var2.K0, gu0Var2.N0, gu0Var2.O0);
                }
                photoViewer.f31928e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32002m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.G1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32002m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32002m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32002m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
