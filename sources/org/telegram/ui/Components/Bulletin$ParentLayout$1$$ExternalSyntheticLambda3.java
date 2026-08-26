package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class Bulletin$ParentLayout$1$$ExternalSyntheticLambda3 implements DynamicAnimation.OnAnimationUpdateListener {
    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        if (f <= 0.0f) {
            dynamicAnimation.cancel();
        }
    }
}
