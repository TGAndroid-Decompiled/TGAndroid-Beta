package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class br0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32164a;
    public final PhotoViewer f32165b;

    public br0(PhotoViewer photoViewer, int i10) {
        this.f32164a = i10;
        this.f32165b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f32164a;
        PhotoViewer photoViewer = this.f32165b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f30946i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f28468b.f14088a;
                float lerp = AndroidUtilities.lerp(photoViewer.f30876a6, photoViewer.f30914e6, photoViewer.f30973l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f30896c6, photoViewer.f30973l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f30905d6, photoViewer.f30973l6);
                cropAreaView.f21991n0 = 0.0f;
                cropAreaView.f21992o0 = lerp;
                cropAreaView.f21993p0 = lerp2;
                cropAreaView.f21994q0 = lerp3;
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
                photoViewer.f30981m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.r3();
                return;
            case 6:
                photoViewer.L1.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                tt0 tt0Var = photoViewer.L1;
                if (tt0Var != null) {
                    tt0Var.f41472d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                tt0 tt0Var2 = photoViewer.L1;
                if (tt0Var2 != null && Math.abs(floatValue - tt0Var2.X1) > 0.1f) {
                    tt0Var2.X1 = floatValue;
                    tt0Var2.w0(tt0Var2.I0, tt0Var2.J0, tt0Var2.K0, tt0Var2.N0, tt0Var2.O0);
                }
                photoViewer.f30908e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f30981m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f30981m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f30981m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f30981m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
