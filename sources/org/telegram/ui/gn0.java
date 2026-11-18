package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gn0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48143a;
    public final PhotoViewer f48144b;

    public gn0(PhotoViewer photoViewer, int i7) {
        this.f48143a = i7;
        this.f48144b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f48143a;
        PhotoViewer photoViewer = this.f48144b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43237i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.D1.f38763b.f21896a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.f43166a6, photoViewer.f43204e6, photoViewer.f43264l6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f43186c6, photoViewer.f43264l6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.f43194d6, photoViewer.f43264l6);
                cropAreaView.f32892o0 = 0.0f;
                cropAreaView.f32893p0 = T1;
                cropAreaView.f32894q0 = T12;
                cropAreaView.f32896r0 = T13;
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
                photoViewer.f43272m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                vp0 vp0Var = photoViewer.M1;
                if (vp0Var != null) {
                    vp0Var.N0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                vp0 vp0Var2 = photoViewer.M1;
                if (vp0Var2 != null && Math.abs(floatValue - vp0Var2.H1) > 0.1f) {
                    vp0Var2.H1 = floatValue;
                    vp0Var2.v0(vp0Var2.f57873s0, vp0Var2.f57875t0, vp0Var2.f57877u0, vp0Var2.f57883x0, vp0Var2.f57885y0);
                }
                photoViewer.f43208f0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                photoViewer.f43272m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43272m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43272m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.f43272m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
