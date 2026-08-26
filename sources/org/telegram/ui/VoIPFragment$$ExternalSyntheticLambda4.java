package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesIntro;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.CollageLayoutButton;
import org.telegram.ui.Stories.recorder.FlashViews;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.MultipleStoriesSelector;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.RoundVideoRecorder;
import org.telegram.ui.Stories.recorder.StoryModeTabs;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.WebActionBar;

public final class VoIPFragment$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPFragment$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = (VoIPFragment) this.f$0;
                voIPFragment.getClass();
                voIPFragment.uiVisibilityAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPFragment.updateSystemBarColors();
                break;
            case 1:
                SelfStoryViewsView selfStoryViewsView = (SelfStoryViewsView) this.f$0;
                selfStoryViewsView.getClass();
                selfStoryViewsView.progressToKeyboard = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                selfStoryViewsView.viewPagerContainer.setTranslationY(((-selfStoryViewsView.bottomPadding) + selfStoryViewsView.getMeasuredHeight()) - selfStoryViewsView.selfStoriesViewsOffset);
                break;
            case 2:
                StoriesIntro storiesIntro = (StoriesIntro) this.f$0;
                storiesIntro.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = storiesIntro.items;
                StoriesIntro.StoriesIntroItemView storiesIntroItemView = (StoriesIntro.StoriesIntroItemView) arrayList.get(storiesIntro.current);
                storiesIntroItemView.progress = fFloatValue;
                storiesIntroItemView.invalidate();
                int i = storiesIntro.prev;
                if (i != -1) {
                    StoriesIntro.StoriesIntroItemView storiesIntroItemView2 = (StoriesIntro.StoriesIntroItemView) arrayList.get(i);
                    storiesIntroItemView2.progress = 1.0f - fFloatValue;
                    storiesIntroItemView2.invalidate();
                }
                break;
            case 3:
                StoryCaptionView.StoryCaptionTextView storyCaptionTextView = (StoryCaptionView.StoryCaptionTextView) this.f$0;
                storyCaptionTextView.getClass();
                storyCaptionTextView.updateT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyCaptionTextView.invalidate();
                storyCaptionTextView.requestLayout();
                StoryCaptionView.this.requestLayout();
                break;
            case 4:
                BotPreviewsEditContainer botPreviewsEditContainer = (BotPreviewsEditContainer) this.f$0;
                botPreviewsEditContainer.getClass();
                botPreviewsEditContainer.tabsAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                botPreviewsEditContainer.tabsView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, botPreviewsEditContainer.tabsAlpha));
                botPreviewsEditContainer.viewPager.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), botPreviewsEditContainer.tabsAlpha));
                break;
            case 5:
                CaptionContainerView captionContainerView = (CaptionContainerView) this.f$0;
                captionContainerView.keyboardT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CaptionContainerView.AnonymousClass3 anonymousClass3 = captionContainerView.editText;
                anonymousClass3.getEditText().setTranslationX(AndroidUtilities.lerp(captionContainerView.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), captionContainerView.keyboardT));
                FrameLayout frameLayout = captionContainerView.limitTextContainer;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), captionContainerView.keyboardT));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, captionContainerView.keyboardT));
                anonymousClass3.getEmojiButton().setAlpha(captionContainerView.keyboardT);
                captionContainerView.applyButton.setAlpha((float) Math.pow(captionContainerView.keyboardT, 16.0d));
                captionContainerView.onUpdateShowKeyboard(captionContainerView.keyboardT);
                ChatAttachAlert.AnonymousClass36 anonymousClass36 = captionContainerView.mentionContainer;
                if (anonymousClass36 != null) {
                    anonymousClass36.setAlpha((float) Math.pow(captionContainerView.keyboardT, 4.0d));
                }
                anonymousClass3.getEditText().invalidate();
                captionContainerView.invalidate();
                break;
            case 6:
                CollageLayoutButton.CollageLayoutListView collageLayoutListView = (CollageLayoutButton.CollageLayoutListView) this.f$0;
                collageLayoutListView.getClass();
                collageLayoutListView.visibleProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                collageLayoutListView.listView.invalidate();
                break;
            case 7:
                FlashViews flashViews = (FlashViews) this.f$0;
                flashViews.getClass();
                flashViews.invert = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                flashViews.update();
                break;
            case 8:
                GallerySheet gallerySheet = (GallerySheet) this.f$0;
                gallerySheet.getClass();
                gallerySheet.listView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                HintView2 hintView2 = (HintView2) this.f$0;
                hintView2.getClass();
                hintView2.bounceT = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hintView2.invalidate();
                break;
            case 10:
                ((MultipleStoriesSelector) this.f$0).invalidate();
                break;
            case 11:
                PreviewButtons previewButtons = (PreviewButtons) this.f$0;
                previewButtons.getClass();
                previewButtons.appearT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                previewButtons.updateAppearT();
                break;
            case 12:
                PreviewButtons.ShareButtonView shareButtonView = (PreviewButtons.ShareButtonView) this.f$0;
                shareButtonView.getClass();
                shareButtonView.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shareButtonView.invalidate();
                break;
            case 13:
                RoundVideoRecorder roundVideoRecorder = (RoundVideoRecorder) this.f$0;
                roundVideoRecorder.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roundVideoRecorder.destroyT = fFloatValue2;
                RoundVideoRecorder.AnonymousClass1 anonymousClass1 = roundVideoRecorder.cameraView;
                anonymousClass1.setScaleX(1.0f - fFloatValue2);
                anonymousClass1.setScaleY(1.0f - roundVideoRecorder.destroyT);
                roundVideoRecorder.invalidate();
                break;
            case 14:
                StoryModeTabs storyModeTabs = (StoryModeTabs) this.f$0;
                storyModeTabs.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyModeTabs.mode = fFloatValue3;
                Utilities.Callback callback = storyModeTabs.onSwitchingModeListener;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(fFloatValue3, 1.0f, -1.0f)));
                }
                storyModeTabs.layout.invalidate();
                break;
            case 15:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                page.searchField.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                StoryPrivacyBottomSheet.SearchUsersCell searchUsersCell = (StoryPrivacyBottomSheet.SearchUsersCell) this.f$0;
                searchUsersCell.getClass();
                searchUsersCell.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.f$0;
                themePreviewActivity.getClass();
                themePreviewActivity.progressToDarkTheme = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                themePreviewActivity.backgroundImage.invalidate();
                themePreviewActivity.bottomOverlayChat.invalidate();
                themePreviewActivity.dimmingSlider.setAlpha(themePreviewActivity.progressToDarkTheme);
                themePreviewActivity.dimmingSliderContainer.invalidate();
                themePreviewActivity.invalidateBlur$2();
                break;
            case 18:
                ThemePreviewActivity.AnonymousClass8 anonymousClass8 = (ThemePreviewActivity.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThemePreviewActivity themePreviewActivity2 = ThemePreviewActivity.this;
                themePreviewActivity2.progressToDarkTheme = fFloatValue4;
                themePreviewActivity2.backgroundImage.invalidate();
                themePreviewActivity2.bottomOverlayChat.invalidate();
                themePreviewActivity2.dimmingSlider.setAlpha(themePreviewActivity2.progressToDarkTheme);
                themePreviewActivity2.dimmingSliderContainer.invalidate();
                themePreviewActivity2.invalidateBlur$2();
                break;
            case 19:
                TooManyCommunitiesActivity tooManyCommunitiesActivity = (TooManyCommunitiesActivity) this.f$0;
                tooManyCommunitiesActivity.getClass();
                tooManyCommunitiesActivity.enterProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = tooManyCommunitiesActivity.listView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(tooManyCommunitiesActivity.listView.getChildAt(i2));
                    int i3 = tooManyCommunitiesActivity.adapter.headerPosition;
                    if (childAdapterPosition < i3 || i3 <= 0) {
                        tooManyCommunitiesActivity.listView.getChildAt(i2).setAlpha(1.0f);
                    } else {
                        tooManyCommunitiesActivity.listView.getChildAt(i2).setAlpha(tooManyCommunitiesActivity.enterProgress);
                    }
                }
                break;
            case 20:
                TopicCreateFragment.AnonymousClass4 anonymousClass4 = (TopicCreateFragment.AnonymousClass4) this.f$0;
                anonymousClass4.getClass();
                anonymousClass4.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass4.invalidate();
                break;
            case 21:
                TopicsFragment topicsFragment = (TopicsFragment) this.f$0;
                topicsFragment.getClass();
                topicsFragment.updateSearchProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                TopicsFragment.TopicDialogCell topicDialogCell = (TopicsFragment.TopicDialogCell) this.f$0;
                topicDialogCell.getClass();
                topicDialogCell.hiddenT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                topicDialogCell.setHiddenT();
                break;
            case 23:
                TopicsFragment.TopicsRecyclerView topicsRecyclerView = (TopicsFragment.TopicsRecyclerView) this.f$0;
                topicsRecyclerView.getClass();
                topicsRecyclerView.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                RichMediaCell richMediaCell = (RichMediaCell) this.f$0;
                richMediaCell.getClass();
                richMediaCell.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                richMediaCell.requestLayout();
                richMediaCell.invalidate();
                break;
            case 25:
                ChatListItemAnimator chatListItemAnimator = (ChatListItemAnimator) this.f$0;
                ChatActivity chatActivity = chatListItemAnimator.activity;
                if (chatActivity != null) {
                    chatActivity.invalidateMessagesVisiblePart();
                    if (chatActivity.scrimView != null) {
                        chatActivity.fragmentView.invalidate();
                    }
                } else {
                    chatListItemAnimator.recyclerListView.invalidate();
                }
                break;
            case 26:
                PhotoViewer.AnonymousClass11 anonymousClass11 = (PhotoViewer.AnonymousClass11) this.f$0;
                ((UserCell.AnonymousClass2) anonymousClass11.this$0).imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                anonymousClass11.invalidate();
                break;
            case 27:
                ArticleViewer.AnonymousClass15 anonymousClass15 = (ArticleViewer.AnonymousClass15) this.f$0;
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass15.addressingProgress = fFloatValue5;
                anonymousClass15.onAddressingProgress(fFloatValue5);
                anonymousClass15.addressEditText.setAlpha(anonymousClass15.addressingProgress);
                anonymousClass15.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * anonymousClass15.addressingProgress);
                anonymousClass15.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * anonymousClass15.addressingProgress);
                anonymousClass15.invalidate();
                break;
            default:
                WebActionBar webActionBar = (WebActionBar) this.f$0;
                webActionBar.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                webActionBar.searchingProgress = fFloatValue6;
                webActionBar.searchEditText.setAlpha(fFloatValue6);
                webActionBar.invalidate();
                break;
        }
    }
}
