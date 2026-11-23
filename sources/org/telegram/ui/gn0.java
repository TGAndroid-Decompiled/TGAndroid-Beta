package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gn0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48088a;
    public final PhotoViewer f48089b;

    public gn0(PhotoViewer photoViewer, int i7) {
        this.f48088a = i7;
        this.f48089b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f48088a;
        PhotoViewer photoViewer = this.f48089b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43247i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.D1.f39118b.f21887a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.f43176a6, photoViewer.f43214e6, photoViewer.f43274l6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f43196c6, photoViewer.f43274l6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.f43204d6, photoViewer.f43274l6);
                cropAreaView.f32894o0 = 0.0f;
                cropAreaView.f32895p0 = T1;
                cropAreaView.f32896q0 = T12;
                cropAreaView.f32898r0 = T13;
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
                photoViewer.f43282m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                wp0 wp0Var = photoViewer.M1;
                if (wp0Var != null) {
                    wp0Var.N0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                wp0 wp0Var2 = photoViewer.M1;
                if (wp0Var2 != null && Math.abs(floatValue - wp0Var2.H1) > 0.1f) {
                    wp0Var2.H1 = floatValue;
                    wp0Var2.v0(wp0Var2.f57896s0, wp0Var2.f57898t0, wp0Var2.f57900u0, wp0Var2.f57906x0, wp0Var2.f57908y0);
                }
                photoViewer.f43218f0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                photoViewer.f43282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
