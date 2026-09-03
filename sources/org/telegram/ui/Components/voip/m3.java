package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29754a;
    public final o3 f29755b;

    public m3(o3 o3Var, int i10) {
        this.f29754a = i10;
        this.f29755b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29754a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29755b;
                o3Var.f29811n = floatValue;
                o3Var.f29808k.invalidate();
                if (o3Var.f29811n > 1.0f && o3Var.f29815r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29815r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29815r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29815r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29755b;
                o3Var2.f29810m = intValue;
                o3Var2.f29808k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29755b;
                if (o3Var3.f29806i <= o3Var3.f29812o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29813p = intValue2;
                o3Var3.f29808k.invalidate();
                return;
        }
    }
}
