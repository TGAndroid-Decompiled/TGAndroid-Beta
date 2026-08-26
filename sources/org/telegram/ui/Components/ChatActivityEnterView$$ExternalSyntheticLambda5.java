package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatActivityEnterView$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda5(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateGiftButton$85(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$animateScheduledTranslationX$16(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$updateRecordInterface$69(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$setSuggestionButtonVisible$21(valueAnimator);
                break;
            case 4:
                this.f$0.lambda$updateBotButton$89(valueAnimator);
                break;
            case 5:
                this.f$0.lambda$checkStickresExpandHeight$104(valueAnimator);
                break;
            case 6:
                this.f$0.lambda$checkStickresExpandHeight$105(valueAnimator);
                break;
            default:
                this.f$0.lambda$setSearchingTypeInternal$102(valueAnimator);
                break;
        }
    }
}
