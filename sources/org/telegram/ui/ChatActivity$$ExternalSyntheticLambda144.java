package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

public final class ChatActivity$$ExternalSyntheticLambda144 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final View f$1;

    public ChatActivity$$ExternalSyntheticLambda144(int i, View view, ChatActivity chatActivity) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateInfoTopView$112(this.f$1, valueAnimator);
                break;
            default:
                this.f$0.lambda$hideInfoView$121(this.f$1, valueAnimator);
                break;
        }
    }
}
