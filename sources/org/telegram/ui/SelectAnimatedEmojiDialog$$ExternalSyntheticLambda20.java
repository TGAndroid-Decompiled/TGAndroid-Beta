package org.telegram.ui;

import android.animation.ValueAnimator;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog f$0;
    public final boolean f$1;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$switchGrids$9(this.f$1, valueAnimator);
                break;
            default:
                this.f$0.lambda$switchSearchEmptyView$11(this.f$1, valueAnimator);
                break;
        }
    }
}
