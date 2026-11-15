package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cn0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46220a;
    public final PhotoViewer f46221b;

    public cn0(PhotoViewer photoViewer, int i7) {
        this.f46220a = i7;
        this.f46221b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f46220a;
        PhotoViewer photoViewer = this.f46221b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f42792i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.D1.f34907b.f21530a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.f42721a6, photoViewer.f42759e6, photoViewer.f42819l6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f42741c6, photoViewer.f42819l6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.f42749d6, photoViewer.f42819l6);
                cropAreaView.f32495o0 = 0.0f;
                cropAreaView.f32496p0 = T1;
                cropAreaView.f32497q0 = T12;
                cropAreaView.f32499r0 = T13;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f42827m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.q3();
                return;
            case 6:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                tp0 tp0Var = photoViewer.M1;
                if (tp0Var != null) {
                    tp0Var.N0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                tp0 tp0Var2 = photoViewer.M1;
                if (tp0Var2 != null && Math.abs(floatValue - tp0Var2.H1) > 0.1f) {
                    tp0Var2.H1 = floatValue;
                    tp0Var2.v0(tp0Var2.f57291s0, tp0Var2.f57293t0, tp0Var2.f57295u0, tp0Var2.f57301x0, tp0Var2.f57303y0);
                }
                photoViewer.f42763f0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                photoViewer.f42827m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f42827m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f42827m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f42827m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
