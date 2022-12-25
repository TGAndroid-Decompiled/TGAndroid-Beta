package org.telegram.p009ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class MentionsContainerView$$ExternalSyntheticLambda1 implements DynamicAnimation.OnAnimationEndListener {
    public static final MentionsContainerView$$ExternalSyntheticLambda1 INSTANCE = new MentionsContainerView$$ExternalSyntheticLambda1();

    private MentionsContainerView$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        MentionsContainerView.lambda$updateListViewTranslation$3(dynamicAnimation, z, f, f2);
    }
}
