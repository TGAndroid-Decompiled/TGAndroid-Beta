package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bi1;
public final class pv implements ValueAnimator.AnimatorUpdateListener {
    public final int f30191a;
    public final float f30192b;
    public final float f30193c;
    public final Object d;

    public pv(Object obj, float f10, float f11, int i10) {
        this.f30191a = i10;
        this.d = obj;
        this.f30192b = f10;
        this.f30193c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30191a;
        float f10 = this.f30193c;
        float f11 = this.f30192b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                zv zvVar = (zv) obj;
                zvVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.I = floatValue;
                zvVar.H = AndroidUtilities.lerp(f11, f10, floatValue);
                zvVar.f31649b.invalidate();
                return;
            case 1:
                bi1 bi1Var = (bi1) obj;
                bi1Var.f31980y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = bi1Var.f31980y;
                bi1Var.D = dp - (dp * f12);
                bi1Var.E = dp2 - (f12 * dp2);
                bi1Var.invalidate();
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.f34450z1.f25240b.f51201a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.X5;
                cropAreaView.f24860k0 = floatValue2;
                cropAreaView.f24861l0 = ((photoViewer.f34236b6 - f13) * photoViewer.f34300i6) + f13;
                cropAreaView.m0 = 0.0f;
                cropAreaView.f24863n0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.f34450z1.f25241c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                qh.ba baVar = (qh.ba) obj;
                baVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.f45094r.setTranslationY(f11 * floatValue3);
                baVar.f45094r.b(f10 * floatValue3);
                return;
            default:
                xd.c cVar = (xd.c) obj;
                if (cVar.f50548g) {
                    DecelerateInterpolator decelerateInterpolator = wd.a.f49529a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
        }
    }
}
