package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class EmojiTabsStrip$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final float f$1;
    public final float f$2;

    public EmojiTabsStrip$$ExternalSyntheticLambda0(FrameLayout frameLayout, float f, float f2, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = f;
        this.f$2 = f2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiTabsStrip) this.f$0).lambda$select$4(this.f$1, this.f$2, valueAnimator);
                break;
            default:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$animateEmojiViewTranslationY$12(this.f$1, this.f$2, valueAnimator);
                break;
        }
    }
}
