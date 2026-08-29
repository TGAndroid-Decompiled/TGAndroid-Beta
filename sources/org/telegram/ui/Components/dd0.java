package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27747a;
    public final nd0 f27748b;

    public dd0(nd0 nd0Var, int i10) {
        this.f27747a = i10;
        this.f27748b = nd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27747a) {
            case 0:
                nd0 nd0Var = this.f27748b;
                nd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd0Var.L = floatValue;
                nd0Var.f(floatValue);
                nd0Var.setAlpha(nd0Var.L);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd0 nd0Var2 = this.f27748b;
                bh.d dVar = nd0Var2.f30963e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = nd0Var2.f30968w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                nd0Var2.f30967s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
