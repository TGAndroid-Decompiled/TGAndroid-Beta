package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView f$0;

    public ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda3(ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView, int i) {
        this.$r8$classId = i;
        this.f$0 = previewGroupsView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView = this.f$0;
                previewGroupsView.getClass();
                previewGroupsView.draggingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                previewGroupsView.invalidate();
                break;
            default:
                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView2 = this.f$0;
                previewGroupsView2.getClass();
                previewGroupsView2.draggingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                previewGroupsView2.invalidate();
                break;
        }
    }
}
