package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class tc0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f32742a;

    public final dd0 f32743b;

    public tc0(dd0 dd0Var, int i10) {
        this.f32742a = i10;
        this.f32743b = dd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32742a) {
            case 0:
                dd0 dd0Var = this.f32743b;
                dd0Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dd0Var.L = fFloatValue;
                dd0Var.f(fFloatValue);
                dd0Var.setAlpha(dd0Var.L);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dd0 dd0Var2 = this.f32743b;
                ag.d dVar = dd0Var2.f27720e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue2));
                TextView textView = dd0Var2.f27725w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fFloatValue2));
                dd0Var2.f27724s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue2));
                break;
        }
    }
}
