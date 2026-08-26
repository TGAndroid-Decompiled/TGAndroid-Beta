package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ItemOptions$$ExternalSyntheticLambda6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public ItemOptions$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ItemOptions.lambda$dismissDim$18((ItemOptions.DimView) this.f$0, valueAnimator);
                break;
            case 1:
                ((ChatThemeBottomSheet) this.f$0).lambda$updateApplySubTextTranslation$6(valueAnimator);
                break;
            case 2:
                ((CounterView.CounterDrawable) this.f$0).lambda$setText$0(valueAnimator);
                break;
            case 3:
                ((CrossfadeDrawable) this.f$0).lambda$animateToProgress$0(valueAnimator);
                break;
            case 4:
                ((EditTextEmoji) this.f$0).lambda$showPopup$2(valueAnimator);
                break;
            case 5:
                ((EmojiPacksAlert) this.f$0).lambda$loadAnimation$8(valueAnimator);
                break;
            case 6:
                ((EmojiPacksAlert.EmojiImageView) this.f$0).lambda$setPressed$0(valueAnimator);
                break;
            case 7:
                ((EmojiView.ImageViewEmoji) this.f$0).lambda$setPressed$0(valueAnimator);
                break;
            case 8:
                ((FadingTextViewLayout) this.f$0).lambda$new$0(valueAnimator);
                break;
            case 9:
                ((FlatCheckBox) this.f$0).lambda$setChecked$0(valueAnimator);
                break;
            case 10:
                ((GroupCallPip) this.f$0).lambda$pinnedToCenter$3(valueAnimator);
                break;
            case 11:
                ((InstantCameraView) this.f$0).lambda$finishZoom$8(valueAnimator);
                break;
            case 12:
                ((InviteMembersBottomSheet) this.f$0).lambda$spansCountChanged$3(valueAnimator);
                break;
            case 13:
                ((ItemOptions) this.f$0).lambda$show$15(valueAnimator);
                break;
            case 14:
                ((JoinToSendSettingsView) this.f$0).lambda$setJoinToSend$7(valueAnimator);
                break;
            case 15:
                ((LoadingAnimatedTextView) this.f$0).lambda$setText$0(valueAnimator);
                break;
            case 16:
                ((PipVideoOverlay) this.f$0).lambda$toggleControls$6(valueAnimator);
                break;
            case 17:
                ((ReactedUsersListView) this.f$0).lambda$load$4(valueAnimator);
                break;
            case 18:
                ((ReactionsContainerLayout) this.f$0).lambda$animatePullingBack$2(valueAnimator);
                break;
            case 19:
                ((ReactionsContainerLayout.ReactionHolderView) this.f$0).lambda$play$0(valueAnimator);
                break;
            case 20:
                ((ReplaceableIconDrawable) this.f$0).lambda$setIcon$0(valueAnimator);
                break;
            case 21:
                ((ScrimOptions) this.f$0).lambda$animateOpenTo$5(valueAnimator);
                break;
            case 22:
                ((ScrollSlidingTabStrip) this.f$0).lambda$checkLongPress$6(valueAnimator);
                break;
            case 23:
                ((SearchCounterView) this.f$0).lambda$setCount$0(valueAnimator);
                break;
            case 24:
                ((SearchTagsList) this.f$0).lambda$show$13(valueAnimator);
                break;
            case 25:
                ((SenderSelectView) this.f$0).lambda$setProgress$4(valueAnimator);
                break;
            case 26:
                SharedMediaLayout.lambda$changeMediaFilterType$34((SharedMediaLayout.MediaPage) this.f$0, valueAnimator);
                break;
            case 27:
                ((SharedMediaLayout) this.f$0).lambda$stopScroll$48(valueAnimator);
                break;
            case 28:
                ((SimpleAvatarView) this.f$0).lambda$setSelected$0(valueAnimator);
                break;
            default:
                ((StickerCategoriesListView) this.f$0).lambda$updateCategoriesShown$5(valueAnimator);
                break;
        }
    }
}
