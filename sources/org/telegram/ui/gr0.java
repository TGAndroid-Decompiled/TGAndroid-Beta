package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38188a;
    public final PhotoViewer f38189b;

    public gr0(PhotoViewer photoViewer, int i10) {
        this.f38188a = i10;
        this.f38189b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f38188a;
        PhotoViewer photoViewer = this.f38189b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f34004i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f32682b.f15611a;
                float lerp = AndroidUtilities.lerp(photoViewer.f33933a6, photoViewer.f33972e6, photoViewer.f34031l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f33953c6, photoViewer.f34031l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f33962d6, photoViewer.f34031l6);
                cropAreaView.f24177n0 = 0.0f;
                cropAreaView.f24178o0 = lerp;
                cropAreaView.f24179p0 = lerp2;
                cropAreaView.f24180q0 = lerp3;
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
                photoViewer.f34039m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                au0 au0Var = photoViewer.L1;
                if (au0Var != null) {
                    au0Var.f46494d1.invalidate();
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
                photoViewer.f33966e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f34039m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.G1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f34039m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f34039m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f34039m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
