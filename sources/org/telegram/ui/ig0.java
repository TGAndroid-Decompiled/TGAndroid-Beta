package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ig0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34562a;
    public final mg0 f34563b;

    public ig0(mg0 mg0Var, int i10) {
        this.f34562a = i10;
        this.f34563b = mg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34562a) {
            case 0:
                mg0 mg0Var = this.f34563b;
                mg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg0Var.d.setAlpha(floatValue);
                mg0Var.e.setAlpha(floatValue);
                mg0Var.f35801f.setProgress(floatValue);
                FrameLayout frameLayout = mg0Var.f35805w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                mg0 mg0Var2 = this.f34563b;
                mg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg0Var2.f35801f.setProgress(floatValue2);
                mg0Var2.d.setAlpha(floatValue2);
                mg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = mg0Var2.f35805w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
