package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class InstantCameraView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public InstantCameraView$$ExternalSyntheticLambda3(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((InstantCameraView) this.f$0).lambda$startAnimation$3(this.f$1, valueAnimator);
                break;
            case 1:
                AudioPlayerAlert.CoverContainer.lambda$switchImageViews$1((BackupImageView) this.f$0, this.f$1, valueAnimator);
                break;
            case 2:
                ((AvatarConstructorFragment) this.f$0).lambda$setExpanded$4(this.f$1, valueAnimator);
                break;
            default:
                ((MessageContainsEmojiButton) this.f$0).lambda$didReceivedNotification$0(this.f$1, valueAnimator);
                break;
        }
    }
}
