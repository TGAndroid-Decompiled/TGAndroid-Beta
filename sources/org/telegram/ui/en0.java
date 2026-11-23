package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class en0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47594a;
    public final PhotoViewer f47595b;

    public en0(PhotoViewer photoViewer, int i7) {
        this.f47594a = i7;
        this.f47595b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f47594a;
        PhotoViewer photoViewer = this.f47595b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                photoViewer.getClass();
                photoViewer.f43363i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                photoViewer.getClass();
                photoViewer.f43398m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                CropAreaView cropAreaView = photoViewer.D1.f38811b.f21987a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.f43287a6, photoViewer.f43329e6, photoViewer.f43390l6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.f43309c6, photoViewer.f43390l6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.f43318d6, photoViewer.f43390l6);
                cropAreaView.f32992o0 = 0.0f;
                cropAreaView.f32993p0 = T1;
                cropAreaView.f32994q0 = T12;
                cropAreaView.f32996r0 = T13;
                cropAreaView.invalidate();
                return;
            case 3:
                photoViewer.M1.w0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                photoViewer.getClass();
                photoViewer.f43398m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                photoViewer.r3();
                return;
            case 7:
                photoViewer.M1.w0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                vp0 vp0Var = photoViewer.M1;
                if (vp0Var != null) {
                    vp0Var.N0.invalidate();
                    return;
                }
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                vp0 vp0Var2 = photoViewer.M1;
                if (vp0Var2 != null && Math.abs(floatValue - vp0Var2.H1) > 0.1f) {
                    vp0Var2.H1 = floatValue;
                    vp0Var2.y0(vp0Var2.f58047s0, vp0Var2.f58049t0, vp0Var2.f58051u0, vp0Var2.f58057x0, vp0Var2.f58059y0);
                }
                photoViewer.f43334f0.invalidate();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.f43272f9;
                photoViewer.f43398m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.f43272f9;
                photoViewer.getClass();
                photoViewer.f43398m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                Drawable[] drawableArr8 = PhotoViewer.f43272f9;
                photoViewer.getClass();
                photoViewer.f43398m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
        }
    }
}
