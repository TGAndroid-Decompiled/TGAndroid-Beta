package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.recorder.PaintView;

public final class ChatMessageCell$$ExternalSyntheticLambda13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatMessageCell$$ExternalSyntheticLambda13(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatMessageCell) this.f$0).lambda$createStatusDrawableAnimator$15(this.f$1, valueAnimator);
                break;
            case 1:
                ((TextSelectionHelper.ChatListTextSelectionHelper) this.f$0).lambda$onTextSelected$0(this.f$1, valueAnimator);
                break;
            case 2:
                LPhotoPaintView.PopupButton popupButton = (LPhotoPaintView.PopupButton) this.f$0;
                popupButton.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                popupButton.imageSwitchT = fFloatValue;
                if (!this.f$1) {
                    popupButton.imageView.setAlpha(1.0f - fFloatValue);
                }
                popupButton.imagesView.invalidate();
                break;
            case 3:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.f$0;
                customEmojiReactionsWindow.valueAnimator = null;
                customEmojiReactionsWindow.enterTransitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                customEmojiReactionsWindow.updateContainersAlpha();
                customEmojiReactionsWindow.updateContentPosition();
                customEmojiReactionsWindow.reactionsContainerLayout.setCustomEmojiEnterProgress(Utilities.clamp(customEmojiReactionsWindow.enterTransitionProgress, 1.0f, 0.0f));
                customEmojiReactionsWindow.containerView.invalidate();
                customEmojiReactionsWindow.selectAnimatedEmojiDialog.invalidateOutline();
                if (customEmojiReactionsWindow.cascadeAnimation) {
                    customEmojiReactionsWindow.updateCascadeEnter(customEmojiReactionsWindow.enterTransitionProgress, this.f$1);
                }
                break;
            case 4:
                ((VoIPToggleButton) this.f$0).lambda$setData$1(this.f$1, valueAnimator);
                break;
            case 5:
                StoryContainsEmojiButton storyContainsEmojiButton = (StoryContainsEmojiButton) this.f$0;
                storyContainsEmojiButton.getClass();
                storyContainsEmojiButton.loadT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyContainsEmojiButton.invalidate();
                if (this.f$1) {
                    storyContainsEmojiButton.requestLayout();
                }
                break;
            default:
                PaintView.PopupButton popupButton2 = (PaintView.PopupButton) this.f$0;
                popupButton2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                popupButton2.imageSwitchT = fFloatValue2;
                if (!this.f$1) {
                    popupButton2.imageView.setAlpha(1.0f - fFloatValue2);
                }
                popupButton2.imagesView.invalidate();
                break;
        }
    }
}
