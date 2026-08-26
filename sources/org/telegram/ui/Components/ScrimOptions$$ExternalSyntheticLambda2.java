package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import androidx.core.app.ActivityCompat;
import androidx.core.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.boosts.BoostCounterView;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.PhotoViewer;

public final class ScrimOptions$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public ScrimOptions$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ScrimOptions scrimOptions = (ScrimOptions) this.f$0;
                scrimOptions.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrimOptions.openProgress = fFloatValue;
                scrimOptions.optionsView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
                scrimOptions.optionsView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, scrimOptions.openProgress));
                scrimOptions.optionsView.setAlpha(scrimOptions.openProgress);
                scrimOptions.windowView.invalidate();
                scrimOptions.containerView.invalidate();
                break;
            case 1:
                BoostCounterView boostCounterView = (BoostCounterView) this.f$0;
                boostCounterView.getClass();
                boostCounterView.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                boostCounterView.invalidate();
                break;
            case 2:
                SelectorSearchCell selectorSearchCell = (SelectorSearchCell) this.f$0;
                selectorSearchCell.getClass();
                selectorSearchCell.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                ProfileGalleryView.AvatarImageView avatarImageView = (ProfileGalleryView.AvatarImageView) this.f$0;
                avatarImageView.radialProgress.overrideAlpha = AndroidUtilities.lerp(avatarImageView.radialProgressHideAnimatorStartValue, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 4:
                ReactedUsersListView reactedUsersListView = (ReactedUsersListView) this.f$0;
                reactedUsersListView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                reactedUsersListView.listView.setAlpha(fFloatValue2);
                reactedUsersListView.loadingView.setAlpha(1.0f - fFloatValue2);
                break;
            case 5:
                ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay = (ChatSelectionReactionMenuOverlay) this.f$0;
                chatSelectionReactionMenuOverlay.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass2 = chatSelectionReactionMenuOverlay.reactionsContainerLayout;
                if (anonymousClass2 != null) {
                    anonymousClass2.setAlpha(fFloatValue3);
                }
                break;
            case 6:
                ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) this.f$0;
                reactionsContainerLayout.pullingLeftOffset = ((Float) reactionsContainerLayout.pullingDownBackAnimator.getAnimatedValue()).floatValue();
                IntroActivity.AnonymousClass1 anonymousClass1 = reactionsContainerLayout.customReactionsContainer;
                if (anonymousClass1 != null) {
                    anonymousClass1.invalidate();
                }
                reactionsContainerLayout.invalidate();
                break;
            case 7:
                CustomPhoneKeyboardView.AnonymousClass1 anonymousClass3 = (CustomPhoneKeyboardView.AnonymousClass1) this.f$0;
                anonymousClass3.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass3.setScaleX(fFloatValue4);
                anonymousClass3.setScaleY(fFloatValue4);
                ((ReactionsContainerLayout) anonymousClass3.this$0).customReactionsContainer.invalidate();
                break;
            case 8:
                ((Consumer) this.f$0).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                ReactionsContainerLayout.ReactionHolderView reactionHolderView = (ReactionsContainerLayout.ReactionHolderView) this.f$0;
                reactionHolderView.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                reactionHolderView.enterScale = fFloatValue5;
                float f = fFloatValue5 * (reactionHolderView.selected ? 0.76f : 1.0f);
                ReactionsContainerLayout.ReactionHolderView.AnonymousClass2 anonymousClass4 = reactionHolderView.loopImageView;
                anonymousClass4.setScaleY(f);
                anonymousClass4.setScaleX(reactionHolderView.enterScale * (reactionHolderView.selected ? 0.76f : 1.0f));
                break;
            case 10:
                ReplaceableIconDrawable replaceableIconDrawable = (ReplaceableIconDrawable) this.f$0;
                replaceableIconDrawable.getClass();
                replaceableIconDrawable.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                replaceableIconDrawable.invalidateSelf();
                break;
            case 11:
                ScrollSlidingTabStrip scrollSlidingTabStrip = (ScrollSlidingTabStrip) this.f$0;
                scrollSlidingTabStrip.getClass();
                scrollSlidingTabStrip.draggingViewOutProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTabStrip.invalidateOverlays();
                break;
            case 12:
                ((ScrollSlidingTabStrip) ((PhotoViewer.AnonymousClass75) this.f$0).this$0).invalidate();
                break;
            case 13:
                ScrollableHorizontalScrollView scrollableHorizontalScrollView = (ScrollableHorizontalScrollView) this.f$0;
                scrollableHorizontalScrollView.getClass();
                scrollableHorizontalScrollView.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                SearchTagsList searchTagsList = (SearchTagsList) this.f$0;
                searchTagsList.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                searchTagsList.actionBarTagsT = fFloatValue6;
                searchTagsList.setShown(fFloatValue6);
                searchTagsList.onShownUpdate(false);
                break;
            case 15:
                SenderSelectView senderSelectView = (SenderSelectView) this.f$0;
                senderSelectView.getClass();
                senderSelectView.menuProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                senderSelectView.invalidate();
                break;
            case 16:
                ShareAlert.AnonymousClass21 anonymousClass21 = (ShareAlert.AnonymousClass21) this.f$0;
                anonymousClass21.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShareAlert shareAlert = anonymousClass21.this$0;
                shareAlert.captionEditTextTopOffset = fFloatValue7;
                shareAlert.frameLayout2.invalidate();
                anonymousClass21.invalidate();
                break;
            case 17:
                ((EditTextCaption) this.f$0).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.f$0;
                sharedMediaLayout.onTabProgress(sharedMediaLayout.getTabProgress());
                break;
            case 19:
                ((SharedMediaLayout.MediaPage) this.f$0).listView.invalidate();
                break;
            case 20:
                SimpleAvatarView simpleAvatarView = (SimpleAvatarView) this.f$0;
                simpleAvatarView.getClass();
                simpleAvatarView.selectProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                simpleAvatarView.invalidate();
                break;
            case 21:
                ActivityCompat.AnonymousClass1 anonymousClass5 = (ActivityCompat.AnonymousClass1) this.f$0;
                anonymousClass5.getClass();
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = (SizeNotifierFrameLayout) anonymousClass5.val$activity;
                sizeNotifierFrameLayout.blurCrossfadeProgress = fFloatValue8;
                sizeNotifierFrameLayout.invalidateBlurredViews();
                break;
            case 22:
                ((StickerCategoriesListView) this.f$0).lambda$updateCategoriesShown$5(valueAnimator);
                break;
            case 23:
                StickerEmptyView stickerEmptyView = (StickerEmptyView) this.f$0;
                stickerEmptyView.getClass();
                stickerEmptyView.visibilityFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                stickerEmptyView.onVisibilityChange();
                break;
            case 24:
                StorageDiagramView storageDiagramView = (StorageDiagramView) this.f$0;
                storageDiagramView.getClass();
                storageDiagramView.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storageDiagramView.invalidate();
                break;
            case 25:
                SubstringLayoutAnimator substringLayoutAnimator = (SubstringLayoutAnimator) this.f$0;
                substringLayoutAnimator.getClass();
                substringLayoutAnimator.hintProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                substringLayoutAnimator.parentView.invalidate();
                break;
            case 26:
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
                themeSmallPreviewView.getClass();
                themeSmallPreviewView.selectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                themeSmallPreviewView.invalidate();
                break;
            case 27:
                TopicsTabsView topicsTabsView = (TopicsTabsView) this.f$0;
                topicsTabsView.getClass();
                topicsTabsView.sidemenuT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                topicsTabsView.updateSidemenuPosition();
                break;
            case 28:
                TrendingStickersAlert.AlertContainerView alertContainerView = (TrendingStickersAlert.AlertContainerView) this.f$0;
                alertContainerView.getClass();
                alertContainerView.statusBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                alertContainerView.invalidate();
                break;
            default:
                UnreadCounterTextView unreadCounterTextView = (UnreadCounterTextView) this.f$0;
                unreadCounterTextView.getClass();
                unreadCounterTextView.replaceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unreadCounterTextView.invalidate();
                break;
        }
    }
}
