package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class hr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34344a;
    public final PhotoViewer f34345b;

    public hr0(PhotoViewer photoViewer, int i10) {
        this.f34344a = i10;
        this.f34345b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f34344a;
        PhotoViewer photoViewer = this.f34345b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f30972i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f28379b.f14098a;
                float lerp = AndroidUtilities.lerp(photoViewer.f30902a6, photoViewer.f30940e6, photoViewer.f30999l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f30922c6, photoViewer.f30999l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f30931d6, photoViewer.f30999l6);
                cropAreaView.f22017n0 = 0.0f;
                cropAreaView.f22018o0 = lerp;
                cropAreaView.f22019p0 = lerp2;
                cropAreaView.f22020q0 = lerp3;
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
                photoViewer.f31007m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                au0 au0Var = photoViewer.L1;
                if (au0Var != null) {
                    au0Var.f41516d1.invalidate();
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
                    au0Var2.w0(au0Var2.I0, au0Var2.J0, au0Var2.K0, au0Var2.N0, au0Var2.O0);
                }
                photoViewer.f30934e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31007m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31007m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31007m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31007m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
