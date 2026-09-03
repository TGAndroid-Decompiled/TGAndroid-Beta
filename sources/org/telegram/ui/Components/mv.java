package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bi1;
public final class mv implements ValueAnimator.AnimatorUpdateListener {
    public final int f27142a;
    public final float f27143b;
    public final float f27144c;
    public final Object d;

    public mv(Object obj, float f10, float f11, int i10) {
        this.f27142a = i10;
        this.d = obj;
        this.f27143b = f10;
        this.f27144c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27142a;
        float f10 = this.f27144c;
        float f11 = this.f27143b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                wv wvVar = (wv) obj;
                wvVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wvVar.I = floatValue;
                wvVar.H = AndroidUtilities.lerp(f11, f10, floatValue);
                wvVar.f28998b.invalidate();
                return;
            case 1:
                bi1 bi1Var = (bi1) obj;
                bi1Var.f29534y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = bi1Var.f29534y;
                bi1Var.D = dp - (dp * f12);
                bi1Var.E = dp2 - (f12 * dp2);
                bi1Var.invalidate();
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.f31898z1.f31372b.f47310a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.X5;
                cropAreaView.f22983k0 = floatValue2;
                cropAreaView.f22984l0 = ((photoViewer.f31685b6 - f13) * photoViewer.f31748i6) + f13;
                cropAreaView.m0 = 0.0f;
                cropAreaView.f22986n0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.f31898z1.f31373c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ph.da daVar = (ph.da) obj;
                daVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.f41563r.setTranslationY(f11 * floatValue3);
                daVar.f41563r.b(f10 * floatValue3);
                return;
            default:
                xd.c cVar = (xd.c) obj;
                if (cVar.f46966g) {
                    DecelerateInterpolator decelerateInterpolator = wd.a.f46596a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
        }
    }
}
