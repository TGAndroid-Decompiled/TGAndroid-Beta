package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ir0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34699a;
    public final PhotoViewer f34700b;

    public ir0(PhotoViewer photoViewer, int i10) {
        this.f34699a = i10;
        this.f34700b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f34699a;
        PhotoViewer photoViewer = this.f34700b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31280i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f24217b.f14307a;
                float lerp = AndroidUtilities.lerp(photoViewer.f31210a6, photoViewer.f31248e6, photoViewer.f31307l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f31230c6, photoViewer.f31307l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f31239d6, photoViewer.f31307l6);
                cropAreaView.f22257n0 = 0.0f;
                cropAreaView.f22258o0 = lerp;
                cropAreaView.f22259p0 = lerp2;
                cropAreaView.f22260q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31315m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.r3();
                return;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                au0 au0Var = photoViewer.L1;
                if (au0Var != null) {
                    au0Var.f41810d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                au0 au0Var2 = photoViewer.L1;
                if (au0Var2 != null && Math.abs(floatValue - au0Var2.X1) > 0.1f) {
                    au0Var2.X1 = floatValue;
                    au0Var2.v0(au0Var2.I0, au0Var2.J0, au0Var2.K0, au0Var2.N0, au0Var2.O0);
                }
                photoViewer.f31242e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31315m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31315m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31315m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31315m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
