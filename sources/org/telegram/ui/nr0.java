package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class nr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38785a;
    public final PhotoViewer f38786b;

    public nr0(PhotoViewer photoViewer, int i10) {
        this.f38785a = i10;
        this.f38786b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f38785a;
        PhotoViewer photoViewer = this.f38786b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32264i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f29369b.f15824a;
                float lerp = AndroidUtilities.lerp(photoViewer.f32194a6, photoViewer.f32232e6, photoViewer.f32292l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f32214c6, photoViewer.f32292l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f32223d6, photoViewer.f32292l6);
                cropAreaView.f23140n0 = 0.0f;
                cropAreaView.f23141o0 = lerp;
                cropAreaView.f23142p0 = lerp2;
                cropAreaView.f23143q0 = lerp3;
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
                photoViewer.f32300m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                hu0 hu0Var = photoViewer.L1;
                if (hu0Var != null) {
                    hu0Var.f44405d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                hu0 hu0Var2 = photoViewer.L1;
                if (hu0Var2 != null && Math.abs(floatValue - hu0Var2.X1) > 0.1f) {
                    hu0Var2.X1 = floatValue;
                    hu0Var2.w0(hu0Var2.I0, hu0Var2.J0, hu0Var2.K0, hu0Var2.N0, hu0Var2.O0);
                }
                photoViewer.f32226e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32300m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.G1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32300m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32300m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f32300m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
