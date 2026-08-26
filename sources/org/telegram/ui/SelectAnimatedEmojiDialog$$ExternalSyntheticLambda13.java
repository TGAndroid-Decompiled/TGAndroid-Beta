package org.telegram.ui;

import android.animation.ValueAnimator;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog f$0;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda13(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialog;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDismiss$39(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$onShow$36(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$switchGrids$10(valueAnimator);
                break;
            default:
                this.f$0.lambda$setDim$7(valueAnimator);
                break;
        }
    }
}
