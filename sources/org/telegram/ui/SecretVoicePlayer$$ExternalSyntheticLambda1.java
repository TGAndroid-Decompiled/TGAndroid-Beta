package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.MessageContainsEmojiButton;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.recorder.PaintView;

public final class SecretVoicePlayer$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public SecretVoicePlayer$$ExternalSyntheticLambda1(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SecretVoicePlayer.AnonymousClass3 anonymousClass3;
        ViewGroup viewGroup;
        switch (this.$r8$classId) {
            case 0:
                SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) this.f$0;
                secretVoicePlayer.getClass();
                secretVoicePlayer.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretVoicePlayer.windowView.invalidate();
                secretVoicePlayer.containerView.invalidate();
                if (secretVoicePlayer.isRound) {
                    secretVoicePlayer.myCell.invalidate();
                }
                secretVoicePlayer.updateTranslation();
                TextView textView = secretVoicePlayer.closeButton;
                if (textView != null) {
                    textView.setAlpha(secretVoicePlayer.openProgress);
                }
                if (!secretVoicePlayer.isRound && (anonymousClass3 = secretVoicePlayer.myCell) != null && anonymousClass3.getSeekBarWaveform() != null) {
                    SeekBarWaveform seekBarWaveform = secretVoicePlayer.myCell.getSeekBarWaveform();
                    seekBarWaveform.explosionRate = (this.f$1 ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(Utilities.clamp(secretVoicePlayer.openProgress * 1.25f, 1.0f, 0.0f));
                    ChatMessageCell chatMessageCell = seekBarWaveform.parentView;
                    if (chatMessageCell != null) {
                        chatMessageCell.invalidate();
                    }
                    break;
                }
                break;
            case 1:
                ChatMessageCell chatMessageCell2 = (ChatMessageCell) this.f$0;
                chatMessageCell2.getClass();
                chatMessageCell2.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatMessageCell2.invalidate();
                if (this.f$1 && chatMessageCell2.getParent() != null) {
                    ((View) chatMessageCell2.getParent()).invalidate();
                    break;
                }
                break;
            case 2:
                TextSelectionHelper.ChatListTextSelectionHelper chatListTextSelectionHelper = (TextSelectionHelper.ChatListTextSelectionHelper) this.f$0;
                chatListTextSelectionHelper.getClass();
                chatListTextSelectionHelper.enterProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextSelectionHelper.TextSelectionOverlay textSelectionOverlay = chatListTextSelectionHelper.textSelectionOverlay;
                if (textSelectionOverlay != null) {
                    textSelectionOverlay.invalidate();
                }
                TextSelectionHelper.SelectableView selectableView = chatListTextSelectionHelper.selectedView;
                if (selectableView != null && ((ChatMessageCell) selectableView).getCurrentMessagesGroup() == null && this.f$1) {
                    ((ChatMessageCell) chatListTextSelectionHelper.selectedView).setSelectedBackgroundProgress(1.0f - chatListTextSelectionHelper.enterProgress);
                    break;
                }
                break;
            case 3:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BackupImageView backupImageView = (BackupImageView) this.f$0;
                backupImageView.setScaleX(fFloatValue);
                backupImageView.setScaleY(fFloatValue);
                if (!this.f$1) {
                    backupImageView.setAlpha(valueAnimator.getAnimatedFraction());
                }
                break;
            case 4:
                AvatarConstructorFragment avatarConstructorFragment = (AvatarConstructorFragment) this.f$0;
                avatarConstructorFragment.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avatarConstructorFragment.setProgressToExpand(fFloatValue2, false);
                if (this.f$1) {
                    AvatarConstructorFragment.AnonymousClass5 anonymousClass5 = avatarConstructorFragment.previewView;
                    anonymousClass5.overrideExpandProgress = fFloatValue2;
                    anonymousClass5.invalidate();
                }
                break;
            case 5:
                boolean z = this.f$1;
                InstantCameraView instantCameraView = (InstantCameraView) this.f$0;
                instantCameraView.animationTranslationY = z ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (instantCameraView.getMeasuredHeight() / 2.0f);
                instantCameraView.updateTranslationY();
                break;
            case 6:
                MessageContainsEmojiButton messageContainsEmojiButton = (MessageContainsEmojiButton) this.f$0;
                messageContainsEmojiButton.getClass();
                messageContainsEmojiButton.loadT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                messageContainsEmojiButton.invalidate();
                if (this.f$1) {
                    messageContainsEmojiButton.requestLayout();
                }
                break;
            case 7:
                LPhotoPaintView.PopupButton popupButton = (LPhotoPaintView.PopupButton) this.f$0;
                popupButton.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                popupButton.imageSwitchT = fFloatValue3;
                if (!this.f$1) {
                    popupButton.imageView.setAlpha(1.0f - fFloatValue3);
                }
                popupButton.imagesView.invalidate();
                break;
            case 8:
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
            case 9:
                VoIPToggleButton voIPToggleButton = (VoIPToggleButton) this.f$0;
                voIPToggleButton.getClass();
                voIPToggleButton.replaceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPToggleButton.invalidate();
                if (this.f$1) {
                    TextView[] textViewArr = voIPToggleButton.textView;
                    textViewArr[0].setAlpha(1.0f - voIPToggleButton.replaceProgress);
                    textViewArr[0].setScaleX(1.0f - voIPToggleButton.replaceProgress);
                    textViewArr[0].setScaleY(1.0f - voIPToggleButton.replaceProgress);
                    textViewArr[1].setAlpha(voIPToggleButton.replaceProgress);
                    textViewArr[1].setScaleX(voIPToggleButton.replaceProgress);
                    textViewArr[1].setScaleY(voIPToggleButton.replaceProgress);
                }
                break;
            case 10:
                MessageSendPreview messageSendPreview = (MessageSendPreview) this.f$0;
                messageSendPreview.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                messageSendPreview.openProgress = fFloatValue4;
                messageSendPreview.effectsView.setAlpha(fFloatValue4);
                messageSendPreview.chatListView.setAlpha(messageSendPreview.openProgress);
                if (!this.f$1 && (viewGroup = messageSendPreview.optionsView) != null) {
                    viewGroup.setAlpha(messageSendPreview.openProgress);
                }
                messageSendPreview.windowView.invalidate();
                messageSendPreview.containerView.invalidate();
                break;
            case 11:
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
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                popupButton2.imageSwitchT = fFloatValue5;
                if (!this.f$1) {
                    popupButton2.imageView.setAlpha(1.0f - fFloatValue5);
                }
                popupButton2.imagesView.invalidate();
                break;
        }
    }
}
