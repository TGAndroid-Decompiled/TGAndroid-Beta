package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class hr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33443a;
    public final PhotoViewer f33444b;

    public hr0(PhotoViewer photoViewer, int i10) {
        this.f33443a = i10;
        this.f33444b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f33443a;
        PhotoViewer photoViewer = this.f33444b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f30087i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f22405b.f12495a;
                float lerp = AndroidUtilities.lerp(photoViewer.f30017a6, photoViewer.f30055e6, photoViewer.f30114l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f30037c6, photoViewer.f30114l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f30046d6, photoViewer.f30114l6);
                cropAreaView.f21105n0 = 0.0f;
                cropAreaView.f21106o0 = lerp;
                cropAreaView.f21107p0 = lerp2;
                cropAreaView.f21108q0 = lerp3;
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
                photoViewer.f30122m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                zt0 zt0Var = photoViewer.L1;
                if (zt0Var != null) {
                    zt0Var.f40128d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.T8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                zt0 zt0Var2 = photoViewer.L1;
                if (zt0Var2 != null && Math.abs(floatValue - zt0Var2.X1) > 0.1f) {
                    zt0Var2.X1 = floatValue;
                    zt0Var2.v0(zt0Var2.I0, zt0Var2.J0, zt0Var2.K0, zt0Var2.N0, zt0Var2.O0);
                }
                photoViewer.f30049e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f30122m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f30122m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f30122m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.f30122m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
