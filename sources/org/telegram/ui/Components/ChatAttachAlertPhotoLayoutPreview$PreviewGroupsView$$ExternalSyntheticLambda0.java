package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView f$0;

    public ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView, int i) {
        this.$r8$classId = i;
        this.f$0 = previewGroupsView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startDragging$1(valueAnimator);
                break;
            default:
                this.f$0.lambda$stopDragging$0(valueAnimator);
                break;
        }
    }
}
