package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.th1;
public final class nv implements ValueAnimator.AnimatorUpdateListener {
    public final int f27384a;
    public final float f27385b;
    public final float f27386c;
    public final Object d;

    public nv(Object obj, float f10, float f11, int i10) {
        this.f27384a = i10;
        this.d = obj;
        this.f27385b = f10;
        this.f27386c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27384a;
        float f10 = this.f27386c;
        float f11 = this.f27385b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                xv xvVar = (xv) obj;
                xvVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.I = floatValue;
                xvVar.H = AndroidUtilities.lerp(f11, f10, floatValue);
                xvVar.f29253b.invalidate();
                return;
            case 1:
                th1 th1Var = (th1) obj;
                th1Var.f29562y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = th1Var.f29562y;
                th1Var.D = dp - (dp * f12);
                th1Var.E = dp2 - (f12 * dp2);
                th1Var.invalidate();
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.f31924z1.f31004b.f47246a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.X5;
                cropAreaView.f23010k0 = floatValue2;
                cropAreaView.f23011l0 = ((photoViewer.f31711b6 - f13) * photoViewer.f31774i6) + f13;
                cropAreaView.m0 = 0.0f;
                cropAreaView.f23013n0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.f31924z1.f31005c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ph.da daVar = (ph.da) obj;
                daVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.f41525r.setTranslationY(f11 * floatValue3);
                daVar.f41525r.b(f10 * floatValue3);
                return;
            default:
                xd.c cVar = (xd.c) obj;
                if (cVar.f46898g) {
                    DecelerateInterpolator decelerateInterpolator = wd.a.f46514a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
        }
    }
}
