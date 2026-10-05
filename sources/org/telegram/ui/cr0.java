package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35535a;
    public final PhotoViewer f35536b;

    public cr0(PhotoViewer photoViewer, int i10) {
        this.f35535a = i10;
        this.f35536b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35535a;
        PhotoViewer photoViewer = this.f35536b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33952i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f26905b.f15576a;
                float lerp = AndroidUtilities.lerp(photoViewer.f33881a6, photoViewer.f33920e6, photoViewer.f33979l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f33901c6, photoViewer.f33979l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f33910d6, photoViewer.f33979l6);
                cropAreaView.f24153n0 = 0.0f;
                cropAreaView.f24154o0 = lerp;
                cropAreaView.f24155p0 = lerp2;
                cropAreaView.f24156q0 = lerp3;
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
                photoViewer.f33987m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                vt0 vt0Var = photoViewer.L1;
                if (vt0Var != null) {
                    vt0Var.f45175d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                vt0 vt0Var2 = photoViewer.L1;
                if (vt0Var2 != null && Math.abs(floatValue - vt0Var2.X1) > 0.1f) {
                    vt0Var2.X1 = floatValue;
                    vt0Var2.w0(vt0Var2.I0, vt0Var2.J0, vt0Var2.K0, vt0Var2.N0, vt0Var2.O0);
                }
                photoViewer.f33914e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33987m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.G1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33987m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33987m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33987m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
