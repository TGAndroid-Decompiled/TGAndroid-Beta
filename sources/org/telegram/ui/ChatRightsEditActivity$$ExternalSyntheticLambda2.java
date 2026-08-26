package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda2(ChatRightsEditActivity chatRightsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setLoading$29(valueAnimator);
                break;
            default:
                this.f$0.lambda$updateAsAdmin$32(valueAnimator);
                break;
        }
    }
}
