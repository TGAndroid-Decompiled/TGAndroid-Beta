package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class GroupCallRenderersContainer$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final GroupCallRenderersContainer f$0;

    public GroupCallRenderersContainer$$ExternalSyntheticLambda3(GroupCallRenderersContainer groupCallRenderersContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallRenderersContainer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$animateSwipeToBack$7(valueAnimator);
                break;
            default:
                this.f$0.lambda$requestFullscreen$6(valueAnimator);
                break;
        }
    }
}
