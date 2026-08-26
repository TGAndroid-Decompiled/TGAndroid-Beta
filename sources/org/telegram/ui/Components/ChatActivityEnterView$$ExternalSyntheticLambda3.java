package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class ChatActivityEnterView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda3(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivityEnterView.AnonymousClass29 anonymousClass29 = this.f$0.scheduledButton;
                if (anonymousClass29 != null) {
                    anonymousClass29.setTranslationX(anonymousClass29.innerTranslationX);
                }
                break;
            case 1:
                ChatActivityEnterView.AnonymousClass29 anonymousClass210 = this.f$0.scheduledButton;
                if (anonymousClass210 != null) {
                    anonymousClass210.setTranslationX(anonymousClass210.innerTranslationX);
                }
                break;
            case 2:
                this.f$0.sizeNotifierLayout.invalidate();
                break;
            case 3:
                this.f$0.sizeNotifierLayout.invalidate();
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                chatActivityEnterView.getClass();
                chatActivityEnterView.searchToOpenProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView.AnonymousClass78 anonymousClass78 = chatActivityEnterView.emojiView;
                if (anonymousClass78 != null) {
                    anonymousClass78.updateStickerTabsPosition();
                }
                break;
            case 5:
                this.f$0.scheduledButton.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                chatActivityEnterView2.getClass();
                chatActivityEnterView2.recordCircle.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView2.isInVideoMode) {
                    chatActivityEnterView2.audioTimelineView.setAlpha(chatActivityEnterView2.recordCircle.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView2.audioTimelineView.invalidate();
                }
                chatActivityEnterView2.isRecordingStateChanged();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView3 = this.f$0;
                chatActivityEnterView3.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView3.suggestButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                chatActivityEnterView3.suggestButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                chatActivityEnterView3.suggestButton.setAlpha(fFloatValue);
                break;
        }
    }
}
